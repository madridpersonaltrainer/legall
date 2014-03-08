package es.madridpersonaltrainer.legol

class Session(val exercises: List[Exercise])

object Session {

  def apply(exercises: Exercise*): Session = new Session(exercises.toList)

  def unapply(s: Session): Option[(List[Exercise])] = Option(s.exercises)
}

