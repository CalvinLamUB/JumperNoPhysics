package model.playerstates.airstates

import model.Player
import model.playerstates.PlayerState

abstract class InAir(player: Player) extends PlayerState(player) {

  override def leftPressed(): Unit = {
    player.moveLeftMidAir()
  }

  override def rightPressed(): Unit = {
    player.moveRightMidAir()
  }

  override def jumpPressed(): Unit = {
    player.velocity.z = player.standingJumpVelocity
    player.state = new RisingAfterDoubleJump(player)
  }

}
