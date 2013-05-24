package io.theysay.client;

public class Example {
    public static void main(String[] args) {
        Affectr.accountDetails.setUsername("your username");
        Affectr.accountDetails.setPassword("your password");

        // sentiment
        System.out.println(Affectr.api.classifySentiment("You'll love this client!").getSentiment().getPolarity());
        System.out.println(Affectr.api.classifyEntitySentiment("You'll love this client!")[0].getSentiment().getPolarity());

        // speculation
        System.out.println(Affectr.api.classifySpeculation("I might buy an ipad")[0].getSpeculationType());

        // comparison
        //System.out.println(Affectr.api.classifyComparison("Ebay is better than PayPal")[0].getComparisonType());

        // named entities
        System.out.println(Affectr.api.getNamedEntities("I might buy an ipad")[0].getHead());

        // part-of-speech tagging
        System.out.println(Affectr.api.posTag("I might buy an ipad")[0].getPosTaggedWord());

        // chunk parse
        System.out.println(Affectr.api.chunkParse("This is a test")[0].getHead().getPosTag());
    }
}
