package es.madridpersonaltrainer.legall

import scala.language.postfixOps

case class Time(val hours: Int, val minutes: Int, val seconds: Int) {

  def normalize: Time = {
    val ss = seconds % 60
    val mr = seconds / 60

    val ms = (minutes + mr) % 60
    val hr = (minutes + mr) / 60

    val hs = hours + hr

    new Time(hs, ms, ss)
  }

  def and(other: Time): Time = Time(
    other.hours + hours, 
    other.minutes + minutes, 
    other.seconds + seconds).normalize

  val & = and _

  override def toString = 
    s"$hours.hours and $minutes.minutes and $seconds.seconds"
}

object Time {

  implicit class TimeHelper(val n: Int) {

    def h: Time = new Time(n, 0, 0)
    def hour = h
    def hours = h

    def m: Time = new Time(0, n, 0)
    def minute = m
    def minutes = m

    def s: Time = new Time(0, 0, n)
    def second = s
    def seconds = s
  }
}
