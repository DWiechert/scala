package chapter18.section2

class Thermometer {
  // The =_ defines the variable to be initialized with a default value
  // If no =_, the variable will be abstract
  var celsius: Float = _

  def fahrenheit = celsius * 9 / 5 + 32
  def fahrenheit_=(f: Float) {
    celsius = (f - 32) * 5 / 9
  }

  override def toString = fahrenheit + "F/" + celsius + "C"
}