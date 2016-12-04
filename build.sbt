
lazy val commonSettings = Seq(
  organization := "de.surfice",
  version := "0.0.2",
  scalaVersion := "2.11.8",
  scalacOptions ++= Seq("-deprecation","-unchecked","-feature","-Xlint"),
  resolvers += Resolver.sonatypeRepo("snapshots"),
  libraryDependencies ++= Seq(
  ),
  publish := {},
  publishLocal := {}
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


