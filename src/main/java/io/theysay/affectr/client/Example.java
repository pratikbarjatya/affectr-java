package io.theysay.affectr.client;

import io.theysay.affectr.client.api.Version;

public class Example {
    public static void main(String[] args) {
        AffectR.accountDetails.setUsername("your username");
        AffectR.accountDetails.setPassword("your password");

        Version version = AffectR.api.getVersion();
        System.out.println(String.format("Remote version: TheySay AffectR API version %s, built on %s", version.getVersion(), version.getBuildDate()));

        // chunk parse
        System.out.println(AffectR.api.chunkParse(
                "Civilian personnel must not walk through this missile base tunnel today."
        )[0].getHead().getPosTag());

        // dependency parse
        System.out.println(AffectR.api.dependencyParse(
                "Civilian personnel must not walk through this missile base tunnel today."
        )[0].getDependency().getRelation());

        // intent
        System.out.println(AffectR.api.classifyIntent(
                "We are planning to implement a real-time data service. " +
                        "What are the advantages/disadvantages of using a Foobar-compliant database over Hype.js?"
        )[0].getIntentType());

        // named entities
        System.out.println(AffectR.api.getNamedEntities(
                "Afghan security forces have fought Taliban insurgents for hours in the centre of Kabul, after a major explosion shook the city."
        )[0].getHead());

        // part-of-speech tagging
        System.out.println(AffectR.api.posTag(
                "Civilian personnel must not walk through this missile base tunnel today."
        )[0].getPosTaggedWord());

        // risk
        System.out.println(AffectR.api.classifyRisk(
                "A visit to a family or public swimming pool is a popular summer event, and many warmer regions have open swimming pools throughout the year. " +
                        "There are however countless swimming pool dangers that unwary homeowners and pool guests should be aware of in order to minimise the risks associated with this wonderful recreational and exercise activity."
                )[0].getRiskType());


        // sentiment
        System.out.println(AffectR.api.classifySentiment(
                "Motorola's broken promise \n" +
                        "Company concedes some customers got \"a raw deal\" in decision not to upgrade 2011 flagship devices to Ice Cream Sandwich. \n" +
                        "Casey Newton \n" +
                        "Roger Cheng \n" +
                        "by Casey Newton and Roger Cheng \n" +
                        "October 5, 2012 2:40 PM PDT \n" +
                        "Motorola CEO Dennis Woodside at the company's event earlier today. \n" +
                        "Motorola CEO Dennis Woodside is under fire for an abandoned pledge to update three 2011 phones to Ice Cream Sandwich. \n" +
                        "Doran Else bought his Photon 4G last October, lured by the fast dual-core processor and by the close relationship between Motorola and its new owner, Google. \n" +
                        "Motorola had recently joined the Android Upgrade Alliance, promising to release operating system updates to all its phones for 18 months following their release. \n" +
                        "But for Else and thousands of others, those operating system updates turned out to be a mirage. \n" +
                        "Last Friday, buried in a Motorola forum, the company quietly abandoned its update pledge, killing off plans to ever update the Photon 4G. \n" +
                        "The Electrify, a re-branded Photon available on the US Cellular network, and the Atrix 4G, a flagship phone that debuted on AT&T in the United States, got the axe as well. \n" +
                        "\"Just seems they were happy to join the alliance when it helped them sell handsets,\" Else said in an e-mail. \n" +
                        "Now that it's time to do the work, they're all dropping devices. This latest announcement from Moto is just ridiculous.\" \n" +
                        "The result is that Else and thousands of people in the middle of two-year carrier contracts will have to use Android 2.3, known as Gingerbread, for the foreseeable future. \n" +
                        "Motorola had promised owners of the Photon, Electrify, and Atrix an upgrade to to Android 4.0, known as Ice Cream Sandwich, which would bring a host of new features and security updates. \n" +
                        "Instead they are stuck on Gingerbread, an operating system that was already a year old when Else bought his phone. \n" +
                        "There was no word on why the company had twice said upgrades were coming -- first in the third quarter of this year, then the fourth quarter -- or why it had bothered joining the Android Upgrade Alliance, if it couldn't meet its requirements."
        ).getSentiment().getPolarity());

        System.out.println(AffectR.api.classifyEntitySentiment(
                "The UK economy has avoided falling back into a recession after recording faster-than-expected growth in the first three months of the year."
        )[0].getSentiment().getPolarity());

        System.out.println(AffectR.api.classifyEntityRelationSentiment(
                "Woolwich: Michael Adebowale discharged from hospital \n" +
                        "One of the men shot by police in the wake of the murder of Drummer Lee Rigby has been discharged from hospital and moved into custody in a south London police station, Scotland Yard has said. \n" +
                        "Michael Adebowale, 22, was separately arrested on suspicion of the attempted murder of a police officer. \n" +
                        "The move comes six days after the killing in Woolwich, south-east London. \n" +
                        "The family of the second murder suspect, Michael Adebolajo, have expressed \"horror\" at the killing. \n" +
                        "Drummer Rigby was repeatedly stabbed in the street by two men, witnesses have said. \n" +
                        "Mr Adebowale, from south-east London, and Mr Adebolajo, 28, were shot and injured by police at the scene near Woolwich Barracks on Wednesday.  \n" +
                        "They have been under police guard in hospital. \n" +
                        "Mr Adebowale will be interviewed by the Met Counter Terrorism Command, Scotland Yard said. \n" +
                        "'Shame and distress' \n" +
                        "The Metropolitan Police said earlier that the men would not be questioned until they had been discharged from hospital, and the time they had spent under arrest so far would not count towards the maximum amount of time they could legally be held without charge. \n" +
                        "Both men are Britons of Nigerian descent who are understood to be converts to Islam. \n" +
                        "Of the eight other people arrested in connection with the attack so far, five have been bailed and two released without charge. \n" +
                        "Police are continuing to hold a 50-year-old man on suspicion of conspiracy to commit murder. \n" +
                        "Relatives of Mr Adebolajo issued a statement of condolence to Drummer Rigby's family on Tuesday, saying: \"As a family, we wish to share with others our horror at the senseless killing of Lee Rigby and express our profound shame and distress that this has brought our family.\" \n" +
                        "They continued: \"We wish to state openly that we believe that there is no place for violence in the name of religion or politics. \n" +
                        "\"We believe that all right thinking members of society share this view, wherever they were born and whatever their religion and political beliefs. \n" +
                        "\"We wholeheartedly condemn all those who engage in acts of terror and fully reject any suggestion by them that religion or politics can justify this kind of violence. \n" +
                        "The statement added: \"We unreservedly put our faith in the rule of law and, with others, fully expect that all the perpetrators will be brought to justice under the law of the land. \n" +
                        "'State of secrecy' \n" +
                        "Meanwhile, it has emerged that Mr Adebojalo complained to a human rights group last year that he and his family were being \"harassed\" by British security services in order to get their help. \n" +
                        "Mr Adebojalo was arrested in Kenya in 2010 where he was believed to have been preparing to fight with Somali militant group al-Shabab. He was later deported. \n" +
                        "Abu Nusaybah - a childhood friend - told BBC Newsnight on Friday that following the arrest, MI5 contacted Mr Adebojalo to ask him to work for them, but he rejected the approach. \n" +
                        "And now Cageprisoners, which describes itself as representing those who believe they have been wrongly imprisoned in the war on terror, said it had interviewed Mr Adebolajo and his relatives in April 2012. \n" +
                        "The organisation said he and his family told them they had received numerous phone calls, text messages and visits from British security agents pressuring them to co-operate. \n" +
                        "According to notes from an interview conducted by the group with Mr Adebolajo's sister, she told them that \"because of the harassment, her brother is now forced to live in a state of secrecy, cannot be contacted over the phone\". \n" +
                        "Cageprisoners said it had advised the family to contact a solicitor."
        )[0].getEntity1().getHead());

        System.out.println(AffectR.api.classifyAggregatedEntitySentiment("The UK economy has avoided falling back into a " +
                "recession after recording faster-than-expected growth in the first three months of the year.")[0].getCategory());

        System.out.println(AffectR.api.classifyTaxonomyEntitySentiment("The UK economy has avoided falling back into a " +
                "recession after recording faster-than-expected growth in the first three months of the year.")[0].getCategory());

        // sentence sentiment
        System.out.println(AffectR.api.classifySentenceSentiment(
                "In his address Thursday, the president touted gains against al Qaeda and announced new limits on armed drone strikes and a renewed push to shutter the prison at Guantanamo Bay. " +
                        "Threats that have emerged come from al Qaeda affiliates, localised extremist groups and homegrown terrorists, like the two men suspected of attacking the Boston Marathon last month."
        )[0].getSentiment().getLabel());

        // speculation
        System.out.println(AffectR.api.classifySpeculation(
                "Gliese 667Cc, which was discovered in February 2012 by the same core team that spotted Gliese 581g, orbits a red dwarf planet 22 light-years away, in the Scorpius constellation. " +
                        "Gliese 581g - if it does even exist - is just about 20 light-years away from our home solar system. " +
                        "It's probably a few times bigger than Earth and orbits around its parent star, the red dwarf Gliese 581."
        )[0].getSpeculationType());

        // comparison
        System.out.println(AffectR.api.classifyComparison("Ebay is better than PayPal.")[0].getComparisonType());
    }
}