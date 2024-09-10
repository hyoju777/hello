package com.ohgiraffers.hello.dto;


public class ArticForm {

    private String titel;
    private String content;

    public ArticForm(String titel, String content) {
        this.titel = titel;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticForm{" +
                "titel='" + titel + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
