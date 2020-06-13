// import indigo._
// import scala.scalajs.js.annotation.JSExportTopLevel

// @JSExportTopLevel("IndigoGame")
// object MyGameDemo extends IndigoDemo[Unit, Unit, Unit, Unit] {

//   def boot(flags: Map[String, String]): BootResult[Unit] =
//     BootResult(GameConfig.default, ())

//   def initialModel(startupData: Unit): Unit =
//     ()

//   def initialViewModel(startupData: Unit, model: Unit): Unit =
//     ()

//   def setup(bootData: Unit, assetCollection: AssetCollection, dice: Dice): Startup[StartupErrors, Unit] =
//     Startup.Success(())

//   def updateModel(context: FrameContext, model: Unit): GlobalEvent => Outcome[Unit] =
//     _ => Outcome(model)

//   def updateViewModel(context: FrameContext, model: Unit, viewModel: Unit): Outcome[Unit] =
//     Outcome(viewModel)

//   def present(context: FrameContext, model: Unit, viewModel: Unit): SceneUpdateFragment = 
//     SceneUpdateFragment.empty

// }
