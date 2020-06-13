// import indigo._
// import indigo.scenes._
// import scala.scalajs.js.annotation.JSExportTopLevel

// @JSExportTopLevel("IndigoGame")
// object MyGameGame extends IndigoGame[Unit, Unit, Unit, Unit] {

//   def boot(flags: Map[String, String]): BootResult[Unit] =
//     BootResult(GameConfig.default, ())

//   def initialScene(bootData: Unit): Option[SceneName] =
//     None

//   def scenes(bootData: Unit): NonEmptyList[Scene[Unit, Unit]] =
//     NonEmptyList(EmptyScene)

//   def setup(bootData: Unit, assetCollection: AssetCollection, dice: Dice): Startup[StartupErrors, Unit] =
//     Startup.Success(())

//   def initialModel(startupData: Unit): Unit =
//     ()

//   def initialViewModel(startupData: Unit, model: Unit): Unit =
//     ()

// }

// object EmptyScene extends Scene[Unit, Unit] {

//   type SceneModel     = Unit
//   type SceneViewModel = Unit

//   val name: SceneName =
//     SceneName("empty")

//   val sceneModelLens: Lens[Unit, Unit] =
//     Lens.keepLatest

//   val sceneViewModelLens: Lens[Unit, Unit] =
//     Lens.keepLatest

//   val sceneSubSystems: Set[SubSystem] =
//     Set()

//   def updateSceneModel(context: FrameContext, sceneModel: Unit): GlobalEvent => Outcome[Unit] =
//     _ => Outcome(sceneModel)

//   def updateSceneViewModel(context: FrameContext, sceneModel: Unit, sceneViewModel: Unit): Outcome[Unit] =
//     Outcome(sceneViewModel)

//   def updateSceneView(context: FrameContext, sceneModel: Unit, sceneViewModel: Unit): SceneUpdateFragment =
//     SceneUpdateFragment.empty

// }
