package com.koby5i.whclient;


import com.koby5i.whclient.FeignClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    @Autowired
    private FeignClientInterface feignClientInterface;

    public void setWhClient(FeignClientInterface whClient) {
        this.feignClientInterface = whClient;
    }

    public Controller(FeignClientInterface whClient) {
        this.feignClientInterface = whClient;
    }


    @RequestMapping(value = "/itemInfo/{itemId}", method = RequestMethod.GET)
    public ResponseEntity<?> getItem(@PathVariable("itemId") Long itemId){
        return new ResponseEntity<>(feignClientInterface.getItem(itemId), HttpStatus.OK);

    }

    @RequestMapping(value = "/itemsInfo", method = RequestMethod.GET)
    public ResponseEntity<?> getItems(){
        return new ResponseEntity<>(feignClientInterface.getItems(), HttpStatus.OK);

    }

//    @PostMapping(value = "/itemInfo/{itemId}")
//    public ResponseEntity<?> postItem(@PathVariable("itemId") Long itemId){
//
//        return new ResponseEntity<>(whClient.getItem(itemId), HttpStatus.OK);
//
//    }
}
