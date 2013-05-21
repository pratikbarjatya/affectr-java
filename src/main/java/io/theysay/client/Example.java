package io.theysay.client;

public class Example {
    public static void main(String[] args) {
        Affectr.accountDetails.setUsername("test");
        Affectr.accountDetails.setPassword("test");

        System.out.println(Affectr.api.analyseSentiment("this is a test").getSentiment().getLabel());
        System.out.println(Affectr.api.analyseSpeculation("I might buy an ipad")[0].getSpeculationType());
    }
}
