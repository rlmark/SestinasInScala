package stanza.rotation

class MongeanShuffleTest extends NTinaRotationTestHarness[MongeanShuffle]{
  override val rotationImpl: MongeanShuffle = new MongeanShuffle()
}
