import sbt._
import Keys._

object Build extends sbt.Build {
  lazy val buildVersion = "1.0.2"

  lazy val root = Project(id = "affectr-java", base = file("."), settings = Project.defaultSettings).settings(
    version := buildVersion,
    organization := "io.theysay",
    organizationName := "TheySay Ltd",
    organizationHomepage := Some(new URL("http://www.theysay.io")),
    description := "TheySay AffectR API Java Client",
    startYear := Some(2013),
    resolvers += Resolver.typesafeRepo("releases"),
    parallelExecution in Test := false,
    testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v"),

    libraryDependencies += "commons-codec" % "commons-codec" % "1.8",
    libraryDependencies += "com.google.code.gson" % "gson" % "2.2.4",

    crossPaths := false,
    autoScalaLibrary := false,
    publishMavenStyle := true,
    publishTo <<= version {
      v: String =>
        val nexus = "https://oss.sonatype.org/"
        if (v.trim.endsWith("SNAPSHOT"))
          Some("snapshots" at nexus + "content/repositories/snapshots")
        else
          Some("releases" at nexus + "service/local/staging/deploy/maven2")
    },
    pomExtra := (
      <url>http://www.theysay.io</url>
      <licenses>
        <license>
          <name>Apache 2</name>
          <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
          <distribution>repo</distribution>
        </license>
      </licenses>
      <scm>
        <url>git@github.com:theysay/affectr-java.git</url>
        <connection>scm:git:git@github.com:theysay/affectr-java.git</connection>
      </scm>
      <developers>
        <developer>
          <id>analytically</id>
          <name>Mathias Bogaert</name>
        </developer>
      </developers>
      )
  )
}