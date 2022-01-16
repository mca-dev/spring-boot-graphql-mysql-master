package com.bezkoder.springgraphql.mysql;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApiController {
    @RequestMapping("/hi")
    public ResponseEntity<String> hello() {
        return ResponseEntity.status(HttpStatus.OK).body("<body> hello adixxx </body>");
    }
}
