package com.examploCi.demo.Controllers;




import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/test")
public class test {




    @GetMapping
    public ResponseEntity<String> helloWorld(){
        log.info("Access to controller hello world");
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/test2")
    public ResponseEntity<String> integrationTest(){
        return  ResponseEntity.ok("New hello world");
    }
}
