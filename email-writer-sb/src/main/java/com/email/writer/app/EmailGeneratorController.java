package com.email.writer.app;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*; 

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")

public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;

    public EmailGeneratorController(EmailGeneratorService emailGeneratorService) {
        this.emailGeneratorService = emailGeneratorService;
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response = emailGeneratorService.generateReply(emailRequest);
        return ResponseEntity.ok(response);

    }


}
