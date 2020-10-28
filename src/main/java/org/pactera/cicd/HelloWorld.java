package org.pactera.cicd;

public class HelloWorld {


    private String text;

    public String getText() {
        return text+1;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void output(){
        System.out.println(text);
    }

}
