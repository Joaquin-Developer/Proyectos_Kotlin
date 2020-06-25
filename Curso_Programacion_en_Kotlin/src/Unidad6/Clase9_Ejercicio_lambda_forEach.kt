package Unidad6
/**
 * Created by JoaquínParrilla on 25/06/2020.
 * Clase 9: Acceso a variables externas de expresión lambda - Ejercicio
 * Página del teórico: inicia en 201
 * Temas:
 *      Expresiones Lambda
 *      Acceso a variables externas de expresión lambda
 *      Ejercicio
 * <>
Ejercicio:
    Declarar una clase Persona con las propiedades nombre y edad, definir como métodos su
    impresión y otra que retorna true si es mayor de edad o false en caso contrario (18 años o
    más para ser mayor)
    En la función main definir un arreglo con cuatro elementos de tipo Persona. Calcular cuantas
    personas son mayores de edad llamando al método forEach de la clase Array
 **/

class Persona(val nombre: String, val edad: Int){

    fun imprimir() = println("Nombre: $nombre, edad: $edad")

    fun esMayor(): Boolean = if(edad >= 18) true else false

}

fun main(args: Array<String>) {
    // objetos del tipo persona:
    val p1 = Persona("Ana", 31)
    val p2 = Persona("Pedro", 14)
    val p3 = Persona("José", 18)
    // array de tipo Persona:
    var personas: Array<Persona> = arrayOf(p1, p2, p3)

    for(elem in personas)
        elem.imprimir()

    var count: Int = 0
    personas.forEach {
        if(it.esMayor())
            count++
    }
    println("Total de personas mayores de edad: $count")

}
