package io.theysay.client;

public class Example {
    public static void main(String[] args) {
        Affectr.accountDetails.setUsername("your username");
        Affectr.accountDetails.setPassword("your password");

        System.out.println(Affectr.api.analyseSentiment("this is a test").getSentiment().getLabel());
        System.out.println(Affectr.api.analyseSpeculation("I might buy an ipad")[0].getSpeculationType());
    }
}
