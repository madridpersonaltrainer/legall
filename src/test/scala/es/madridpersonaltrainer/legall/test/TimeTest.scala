package es.madridpersonaltrainer.legall.test

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

import es.madridpersonaltrainer.legall._
import Time._

class TimeTest extends FunSpec with ShouldMatchers {

  describe ("Time") {

    it ("should permit declaring standalone items") {
      1.hour
      2.hours
      1.h
      1.minute
      2.minutes
      5.m
      1.second
      3.seconds
      9.s
    }

    it ("should permit combining pairs of items") {
      1.hour & 2.minutes
      30.minutes and 45.seconds
    }

    it ("should permit combining all items") {
      2.hours & 1.minute and 30.seconds
    }

    it ("should add two times") {
      val t = (2.hours & 59.minutes & 59.seconds) and (1.minutes & 2.seconds)
      t.toString should be("3.hours and 1.minutes and 1.seconds")
    }

    it ("should normalize a time") {
      val t = (90.minutes).normalize
      t.toString should be("1.hours and 30.minutes and 0.seconds")
    }
  }
}
