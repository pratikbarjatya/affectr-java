TheySay AffectR API Java Client [![Build Status](https://travis-ci.org/theysay/affectr-java.png)](https://travis-ci.org/theysay/affectr-java)
===============================

The TheySay AffectR API Java client provides a simple interface to the [TheySay AffectR API](http://api.theysay.io).

You can sign up for a TheySay AffectR API account at http://theysay.io.

### Requirements

Java 6 or later.

### Using with Maven

Add this dependency to your project's POM file:

```xml
<dependency>
  <groupId>io.theysay</groupId>
  <artifactId>affectr-java</artifactId>
  <version>1.0.2</version>
</dependency>
```

### Using with SBT

Add this dependency to your `build.sbt` or `project/Build.scala` file:

```scala
libraryDependencies += "io.theysay" % "affectr-java" % "1.0.2"
```

### Getting Started

First, import the AffectR class:

```java
import io.theysay.affectr.client.AffectR;
```

Next, set your account details:

```java
AffectR.accountDetails.setUsername("your username");
AffectR.accountDetails.setPassword("your password");
```

Next, call any classification task with your text on the AffectR API class, for example:

```java
// sentiment
String sentiment = AffectR.api.classifySentiment("...").getSentiment().getPolarity();
String firstEntitySentiment = AffectR.api.classifyEntitySentiment("...")[0].getSentiment().getPolarity();

// speculation
String speculation = AffectR.api.classifySpeculation("...")[0].getSpeculationType();

// intent
String intent = AffectR.api.classifyIntent("...")[0].getIntentType();

// risk
String risk = AffectR.api.classifyRisk("...")[0].getRiskType();

// named entities
String head = AffectR.api.getNamedEntities("...")[0].getHead();

// part-of-speech tagging
String posTag = AffectR.api.posTag("...")[0].getPosTaggedWord();
```

### Using or moving to Scala?

Try our [Scala client](https://github.com/theysay/affectr-scala).

For more information, please visit http://docs.theysay.apiary.io/

### Versioning

For transparency and insight into our release cycle, and for striving to maintain backward compatibility, this project
will be maintained under the Semantic Versioning guidelines as much as possible.

Releases will be numbered with the follow format:

`<major>.<minor>.<patch>`

And constructed with the following guidelines:

* Breaking backward compatibility bumps the major (and resets the minor and patch)
* New additions without breaking backward compatibility bumps the minor (and resets the patch)
* Bug fixes and misc changes bumps the patch

For more information on SemVer, please visit http://semver.org/.

### License

Copyright 2016 TheySay Ltd. All rights reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
