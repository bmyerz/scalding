name := "tutorial-scalding"

version := "1.0"

scalaVersion := "2.11.7"

// for cascading
// http://www.cascading.org/2010/11/20/conjars_maven_repo/
resolvers += "clojars" at "https://clojars.org/repo"

resolvers += "conjars" at "http://conjars.org/repo"

// see README https://github.com/twitter/scalding
libraryDependencies += "com.twitter" %  "scalding-core_2.10" % "0.12.0"

libraryDependencies += "com.twitter" %  "scalding-args_2.10" % "0.12.0"

libraryDependencies += "com.twitter" %  "scalding-date_2.10" % "0.12.0"

libraryDependencies += "com.twitter" %  "scalding-commons_2.10" % "0.12.0"

libraryDependencies += "com.twitter" %  "scalding-avro_2.10" % "0.12.0"

//libraryDependencies += "com.twitter" %  "scalding-parquet_2.10" % "0.12.0"

libraryDependencies += "com.twitter" %  "scalding-repl_2.10" % "0.12.0"



//libraryDependencies += "cascading" % "cascading-core" % "2.7.0"
//
//libraryDependencies += "cascading" %  "cascading-local" % "2.7.0"
//
//libraryDependencies += "cascading" %  "cascading-hadoop" % "2.7.0"


// To get intellij to work
// import as sbt project, check auto import
// if not auto-importing then go to project structure and have it add libraries from .sbt file
