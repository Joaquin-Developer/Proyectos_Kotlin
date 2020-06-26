package Unidad7
/**
 * Created by JoaquínParrilla on 25/06/2020.
 * Clase 4: Sobrecarga de Operadores - Ejercicio 4
 * Página del teórico: inicia en 215
 * Temas:
 *      Sobrecarga de Operadores Lógicos (<, <=, >, >=)
 *      Ejercicio 4
 * <>
Para sobrecargar estos operadores debemos implementar el método compareTo
Ejercicio 4:
    Implementar una clase llamada Persona que tendrá como propiedades su nombre y edad.
    Sobrecargar los operadores > >= y < <= .
 **/

class Persona(val nombre: String, val edad: Int){

    fun printThis(){
        println("Nombre: $nombre, edad: $edad")
    }

    // El método compareTo debe retornar un Int, indicando que si devuelve un 0 las dos personas
    // tienen la misma edad. Si retornar un 1 la persona que está a la izquierda del operador es
    // mayor de edad y viceversa.:
    operator fun compareTo(persona2: Persona): Int{     // (, <=, >, >=)
        return when{
            edad < persona2.edad -> -1
            edad > persona2.edad -> -1
            else -> 0
        }
    }

}

fun main(args: Array<String>) {
    val persona1 = Persona("Juan", 30)
    persona1.printThis()
    val persona2 = Persona("Ana", 33)
    persona2.printThis()
    println("Persona mayor")
    when {
        persona1 > persona2 -> persona1.printThis()
        persona1 < persona2 -> persona2.printThis()
        else -> println("Tienen la misma edad")
    }
}

