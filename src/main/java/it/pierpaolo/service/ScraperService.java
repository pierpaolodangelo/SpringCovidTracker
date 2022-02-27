package it.pierpaolo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.pierpaolo.entity.Bollettino;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Service
public class ScraperService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScraperService.class);
    @Autowired
    private MappingJackson2HttpMessageConverter converter;
    @Value("${scraper.url}")
    private String scraperUrl;

    public void scraping() {
        RestTemplate restTemplate = new RestTemplate(Collections.singletonList(converter));
        List<Bollettino> bollettini = restTemplate
                .exchange(scraperUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<Bollettino>>() {
                }).getBody();
        LOGGER.info("JsonResponse: {}", bollettini);
    }

    @PostConstruct
    public void test() {
        scraping();
    }
}
