// import indigo._
// import indigo.scenes._
// import scala.scalajs.js.annotation.JSExportTopLevel

// @JSExportTopLevel("IndigoGame")
// object MyGameGame extends IndigoGame[Unit, Unit, Unit, Unit] {

//   def boot(flags: Map[String, String]): BootResult[Unit] =
//     BootResult(GameConfig.default, ())

//   def initialScene(bootData: Unit): Option[SceneName] =
//     None

//   def scenes(bootData: Unit): NonEmptyList[Scene[Unit, Unit, Unit]] =
//     NonEmptyList(EmptyScene)

//   def setup(bootData: Unit, assetCollection: AssetCollection, dice: Dice): Startup[StartupErrors, Unit] =
//     Startup.Success(())

//   def initialModel(startupData: Unit): Unit =
//     ()

//   def initialViewModel(startupData: Unit, model: Unit): Unit =
//     ()

// }

// object EmptyScene extends Scene[Unit, Unit, Unit] {

//   type SceneModel     = Unit
//   type SceneViewModel = Unit

//   val name: SceneName =
//     SceneName("empty")

//   val modelLens: Lens[Unit, Unit] =
//     Lens.keepLatest

//   val viewModelLens: Lens[Unit, Unit] =
//     Lens.keepLatest

//   val eventFilters: EventFilters =
//     EventFilters.Default

//   val subSystems: Set[SubSystem] =
//     Set()

//   def updateModel(context: FrameContext[Unit], model: Unit): GlobalEvent => Outcome[Unit] =
//     _ => Outcome(model)

//   def updateViewModel(
//       context: FrameContext[Unit],
//       model: Unit,
//       viewModel: Unit
//   ): GlobalEvent => Outcome[Unit] =
//     _ => Outcome(viewModel)

//   def present(context: FrameContext[Unit], model: Unit, viewModel: Unit): SceneUpdateFragment =
//     SceneUpdateFragment.empty

// }
