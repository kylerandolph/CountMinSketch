package com.kylerandolph.countminsketch

import org.scalatest._

/**
 * Created by Kyle on 9/27/14.
 */
class CountMinSketchSpec extends FlatSpec with Matchers {

  "An empty CountMinSketch" should "be empty" in {
    val cms = new CountMinSketch(0.000001, 0.005, 40)
    cms.get("brains") should be (0)
  }

  "A CountMinSketch" should "update count after adding a value" in {
    val cms = new CountMinSketch(0.000001, 0.005, 40)
    cms.get("brains") should be (0)
    cms.update("brains")
    cms.get("brains") should be (1)
    cms.get("bunny") should be (0)
  }

}
