package service;

import model.Todo;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataRetriever {
    public Todo getData() {
        RestTemplate restTemplate = new RestTemplate();

        //not essential
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        restTemplate.setMessageConverters(messageConverters);


        String fooResourceUrl = "https://jsonplaceholder.typicode.com/todos/1";
        Todo response = restTemplate.getForObject(fooResourceUrl, Todo.class);
        return response;
    }
}
