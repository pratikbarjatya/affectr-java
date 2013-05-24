package io.theysay.client;

import io.theysay.client.api.Version;

public class Example {
    public static void main(String[] args) {
        AffectR.accountDetails.setUsername("your username");
        AffectR.accountDetails.setPassword("your password");

        Version version = AffectR.api.getAPIVersion();
        System.out.println(String.format("TheySay AffectR API version %s, built on %s", version.getVersion(), version.getBuildDate()));

        // sentiment
        System.out.println(AffectR.api.classifySentiment("You'll love this client!").getSentiment().getPolarity());
        System.out.println(AffectR.api.classifyEntitySentiment("You'll love this client!")[0].getSentiment().getPolarity());
        System.out.println(AffectR.api.classifyAggregatedEntitySentiment("You'll love this client")[0].getCategory());
        System.out.println(AffectR.api.classifyTaxonomyEntitySentiment("You'll love this client")[0].getCategory());

        // speculation
        System.out.println(AffectR.api.classifySpeculation("I might buy an ipad")[0].getSpeculationType());

        // comparison
        //System.out.println(AffectR.api.classifyComparison("Ebay is better than PayPal")[0].getComparisonType());

        // named entities
        System.out.println(AffectR.api.getNamedEntities("I might buy an ipad")[0].getHead());

        // part-of-speech tagging
        System.out.println(AffectR.api.posTag("I might buy an ipad")[0].getPosTaggedWord());

        // chunk parse
        System.out.println(AffectR.api.chunkParse("This is a test")[0].getHead().getPosTag());
    }
}
