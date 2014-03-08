package es.madridpersonaltrainer.legol

class Athlete(val name: String, val email: String)

object Athlete {

  def apply(name: String, email: String): Athlete = new Athlete(name, email)

  def unapply(a: Athlete): Option[(String, String)] = Option(a.name, a.email)
}
