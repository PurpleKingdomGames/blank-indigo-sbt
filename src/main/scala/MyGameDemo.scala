// import indigo._
// import scala.scalajs.js.annotation.JSExportTopLevel

// @JSExportTopLevel("IndigoGame")
// object MyGameDemo extends IndigoDemo[Unit, Unit, Unit, Unit] {

//   val eventFilters: EventFilters =
//     EventFilters.Permissive

//   def boot(flags: Map[String, String]): Outcome[BootResult[Unit]] =
//     Outcome(BootResult(GameConfig.default, ()))

//   def initialModel(startupData: Unit): Outcome[Unit] =
//     Outcome(())

//   def initialViewModel(startupData: Unit, model: Unit): Outcome[Unit] =
//     Outcome(())

//   def setup(bootData: Unit, assetCollection: AssetCollection, dice: Dice): Outcome[Startup[Unit]] =
//     Outcome(Startup.Success(()))

//   def updateModel(context: FrameContext[Unit], model: Unit): GlobalEvent => Outcome[Unit] =
//     _ => Outcome(model)

//   def updateViewModel(context: FrameContext[Unit], model: Unit, viewModel: Unit): GlobalEvent => Outcome[Unit] =
//     _ => Outcome(viewModel)

//   def present(context: FrameContext[Unit], model: Unit, viewModel: Unit): Outcome[SceneUpdateFragment] =
//     Outcome(SceneUpdateFragment.empty)

// }
