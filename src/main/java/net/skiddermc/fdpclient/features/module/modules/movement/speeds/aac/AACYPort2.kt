/*
 * FDPClient Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge by LiquidBounce.
 * https://github.com/SkidderMC/FDPClient/
 */
package net.skiddermc.fdpclient.features.module.modules.movement.speeds.aac

import net.skiddermc.fdpclient.features.module.modules.movement.speeds.SpeedMode
import net.skiddermc.fdpclient.utils.MovementUtils

class AACYPort2 : SpeedMode("AACYPort2") {
    override fun onPreMotion() {
        if (MovementUtils.isMoving()) {
            mc.thePlayer.cameraPitch = 0f
            if (mc.thePlayer.onGround) {
                mc.thePlayer.jump()
                mc.thePlayer.motionY = 0.3851
                mc.thePlayer.motionX *= 1.01
                mc.thePlayer.motionZ *= 1.01
            } else mc.thePlayer.motionY = -0.21
        }
    }
}