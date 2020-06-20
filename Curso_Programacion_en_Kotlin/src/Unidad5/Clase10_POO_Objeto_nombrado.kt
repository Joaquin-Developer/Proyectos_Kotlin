package Unidad5
/**
 * Created by Joaquín Parrilla on 19/06/2020.
 * Clase 10: POO en Kotlin: Objetos sin clase
 * Página del teórico: inicia en 150
 * Temas:
 *      Programación Orientada a Objetos
 *      Objetos
 *      Objeto nombrado
 * <>
Otra característica del lenguaje Kotlin es poder definir un objeto en forma inmediata sin
tener que declarar una clase.
Aparece una nueva palabra clave object con la que podemos crear estos objetos en forma
directa.
Ejercicio1:  Definir un objeto llamada Matematica con una propiedad que almacene el valor de PI y un
método que retorne un valor aleatorio en un determinado rango.
**/
private object Matematica{
    val PI= 3.14
    fun aleatorio(min: Int, max: Int) = ((Math.random() * (max + 1 - min)) + min).toInt()
}

fun main(args: Array<String>) {
    println("El valor de PI es ${Matematica.PI}")
    println("Un numero aleatorio entre 5 y 10: ${Matematica.aleatorio(5, 10)}");

}
