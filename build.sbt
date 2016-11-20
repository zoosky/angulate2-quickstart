
lazy val commonSettings = Seq(
  organization := "de.surfice",
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.11.8",
  scalacOptions ++= Seq("-deprecation","-unchecked","-feature","-Xlint"),
  resolvers += Resolver.sonatypeRepo("snapshots"),
  libraryDependencies ++= Seq(
  ),
  scalacOptions ++= (if (isSnapshot.value) Seq.empty else Seq({
        val a = baseDirectory.value.toURI.toString.replaceFirst("[^/]+/?$", "")
        val g = "https://raw.githubusercontent.com/jokade/angulate2-quickstart"
        s"-P:scalajs:mapSourceURI:$a->$g/v${version.value}/"
      }))
)


lazy val root = project.in(file(".")).
  enablePlugins(Angulate2Plugin).
  settings(commonSettings: _*).
  settings( 
    name := "angulate2-quickstart",
    libraryDependencies ++= Seq(
    ),
    ngBootstrap := Some("quickstart.AppModule")
    //resolvers += Resolver.sonatypeRepo("releases")
  )


