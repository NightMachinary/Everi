package Alice

import java.awt.Color

import scala.util.Random
import processing.core.PApplet.{map => pMap}

object UnbiasedColor {
  def generate(components: List[(Color, Float)]): Color = {
    var totalWeight = 0.0f
    var (r, b, g) = (0f, 0f, 0f)
    for ((c, w: Float) <- components) {
      totalWeight += w
      r += c.getRed * w
      b += c.getBlue * w
      g += c.getGreen * w
    }
    new Color((r / totalWeight).toInt, (g / totalWeight).toInt, (b / totalWeight).toInt)
  }





}
