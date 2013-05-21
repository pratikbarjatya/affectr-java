TheySay Affectr API Java Client
===============================

The TheySay Affectr API Java client provides a simple interface to the [TheySay API](http://api.theysay.io).

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

### Using with SBT

Add this dependency to your .sbt or build file:

    "io.theysay" % "affectr-java" % "1.0.0"

### Getting Started

First, import the required classes:

```java
import io.theysay.client.Affectr;
```

Next, set your account details:

```java
Affectr.accountDetails.setUsername("your username");
Affectr.accountDetails.setPassword("your password");
```

Next, call any classification task with your text on the Affectr API class, for example:

```java
// sentiment
String sentiment = Affectr.api.classifySentiment("...").getSentiment().getPolarity();
String firstEntitySentiment = Affectr.api.classifyEntitySentiment("...")[0].getSentiment().getPolarity();

// speculation
String speculation = Affectr.api.classifySpeculation("...")[0].getSpeculationType());
```

For more information, please visit http://docs.theysay.apiary.io/. This client is under development.

Copyright 2013 TheySay Ltd. All rights reserved.