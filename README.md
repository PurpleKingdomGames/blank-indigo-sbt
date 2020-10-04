# "Blank Indigo Game Template for SBT"

A template and aid to memory to bootstrap your game.

> Everything is referred to as "my game", you'll need to replace those values with the name of your game.

## Contents

There are three source classes, one for each project type. The sandbox one is active while the others are commented out, you should remove whichever you don't need.

## Running the game

The easiest way to run the game is with the following command:

```bash
sbt runGame
```

Alternatively, assuming you have [SBT](https://www.scala-sbt.org/) and http-server set up as the [set up guide](https://indigoengine.io/docs/quickstart/setup-and-configuration) suggests, to run the demo, do the following from your command line:

> Unlike the instructions below, you should use SBT's own shell (just type `sbt` at the command line) because it's much faster.

```bash
sbt buildGame
```

Which will generate output similar to:

```bash
> sbt buildGame
[info] welcome to sbt 1.3.13 (AdoptOpenJdk Java 1.8.0_202)
(...)
dirPath: /Users/(...)/blank-indigo-sbt/target/indigoBuild
Copying assets...
/Users/(...)/blank-indigo-sbt/target/indigoBuild/index.html
[success] Total time: 0 s, completed Jun 13, 2020 10:23:57 PM
```

Then:

1. `cd /Users/(...)/blank-indigo-sbt/target/indigoBuild/`
2. `http-server -c-1`
3. Navigate to [http://127.0.0.1:8080/](http://127.0.0.1:8080/) in your browser of choice.
