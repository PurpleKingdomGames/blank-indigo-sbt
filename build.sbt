Test / scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }

lazy val mygame =
  (project in file("."))
    .enablePlugins(ScalaJSPlugin, SbtIndigo)
    .settings( // Normal SBT settings
      name         := "mygame",
      version      := "0.0.1",
      scalaVersion := "3.0.2",
      organization := "mygame",
      libraryDependencies ++= Seq(
        "org.scalameta" %%% "munit" % "0.7.29" % Test
      ),
      testFrameworks += new TestFramework("munit.Framework")
    )
    .settings( // Indigo specific settings
      showCursor          := true,
      title               := "My Game - Made with Indigo",
      gameAssetsDirectory := "assets",
      windowStartWidth    := 550,
      windowStartHeight   := 400,
      libraryDependencies ++= Seq(
        "io.indigoengine" %%% "indigo-json-circe" % "0.9.2",
        "io.indigoengine" %%% "indigo"            % "0.9.2",
        "io.indigoengine" %%% "indigo-extras"     % "0.9.2"
      )
    )

addCommandAlias("buildGame", ";compile;fastOptJS;indigoBuild")
addCommandAlias("runGame", ";compile;fastOptJS;indigoRun")
