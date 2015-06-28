/*
 * Copyright (c) bdew, 2015
 * https://github.com/bdew/generators
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://bdew.net/minecraft-mod-public-license/
 */

package net.bdew.generators.controllers

import net.bdew.lib.multiblock.tile.TileController
import net.bdew.lib.power.DataSlotPower

trait PoweredController extends TileController {
  def power: DataSlotPower
}
