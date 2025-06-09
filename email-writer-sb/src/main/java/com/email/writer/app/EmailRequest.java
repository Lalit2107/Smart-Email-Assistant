package com.email.writer.app;


import lombok.Data;

@Data
public class EmailRequest {

    private String emailContent;
    private String tone;

//    public String getTone() {
//    return "";
//    }
//    public String getEmailContent() {
//    return "";
//    }
public EmailRequest(String tone, String emailContent) {
    this.tone = tone;
    this.emailContent = emailContent;
}



    // Getters
    public String getTone() {
        return tone;
    }

    public String getEmailContent() {
        return emailContent;
    }

}
