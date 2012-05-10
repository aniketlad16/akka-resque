resolvers += "Another Typesafe Repo" at "http://repo.akka.io/releases/"

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.0.0")

addSbtPlugin("com.typesafe.startscript" % "xsbt-start-script-plugin" % "0.5.0")

addSbtPlugin("com.typesafe.akka" %% "akka-sbt-plugin" % "2.0")

resolvers += "spray repo" at "http://repo.spray.cc"

addSbtPlugin("cc.spray" % "sbt-revolver" % "0.6.0")

resolvers += Resolver.url("sbt-plugin-releases",
  			 new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.7.4")