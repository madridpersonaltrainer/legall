package es.madridpersonaltrainer.legol

class Exercise(val description: String, val media: String)

object Exercise {

  def apply(description: String, media: String): Exercise = 
    new Exercise(description, media)

  def unapply(e: Exercise): Option[(String, String)] =
    Option((e.description, e.media))
}
