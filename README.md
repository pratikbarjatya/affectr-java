TheySay affectr-java-client
===========================

The TheySay Java client provides a simple interface to the TheySay API.

You can sign up for a TheySay account at http://theysay.io.

### Requirements

Java 6 or later.

### Using with Maven

Add this dependency to your project's POM:

    <dependency>
      <groupId>io.theysay</groupId>
      <artifactId>affectr-java</artifactId>
      <version>1.0.0</version>
    </dependency>

### Getting Started

First, import the required classes:

```
import io.theysay.client.Affectr;
```

Next, set your account details:

```
Affectr.accountDetails.setUsername("your username");
Affectr.accountDetails.setPassword("your password");
```

Next, call any classification task on the Affectr class, for example:

```
// sentiment
System.out.println(Affectr.api.classifySentiment("You'll love this client!").getSentiment().getPolarity());
System.out.println(Affectr.api.classifyEntitySentiment("You'll love this client!")[0].getSentiment().getPolarity());

// speculation
System.out.println(Affectr.api.classifySpeculation("I might buy an ipad")[0].getSpeculationType());
```

### Usage

Refer to the [documentation](https://theysay.io/docs).