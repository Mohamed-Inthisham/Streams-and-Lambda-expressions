package com.example.lambda;

public class Students {
    private Long id;
    private String name;
    private String subject;

    public  Students(Long id,String name,String subject){
        this.id=id;
        this.name=name;
        this.subject=subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
