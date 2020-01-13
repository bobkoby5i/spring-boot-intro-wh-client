package com.koby5i.whclient;

//import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;


@FeignClient(name = "apiClient", url = "http://localhost:8080/")
public interface FeignClientInterface {

    @GetMapping(path = "api/item/{itemId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ItemDto getItem(@PathVariable("itemId") Long id);

    @GetMapping(path = "api/items", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    List<ItemDto> getItems();

}
