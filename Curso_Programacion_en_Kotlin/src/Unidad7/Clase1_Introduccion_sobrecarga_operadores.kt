package Unidad7
/**
 * Created by JoaquínParrilla on 25/06/2020.
 * Clase 1: Sobrecarga de Operadores - Introducción
 * Página del teórico: inicia en 206
 * Temas:
 *      Sobrecarga de Operadores
 * <>
El lenguaje Kotlin permite que ciertos operadores puedan sobrecargarse y actúen de
diferentes maneras según al objeto que se aplique.
La sobrecarga de operadores debe utilizarse siempre y cuando tenga sentido para la clase
que se está implementando. Los conceptos matemáticos de vectores y matrices son casos
donde la sobrecarga de operadores nos puede hacer nuestro código más legible y elegante.
Para sobrecargar los operadores +, -, * y / debemos implementar una serie de métodos
especiales dentro de la clase:  todo VER TEÓRICO
Ejercicio 01:
    Declarar una clase llamada Vector que administre un array de 5 elementos de tipo entero y
    cargar valores aleatorios entre 1 y 10. Sobrecargar los operadores +, -, * y /
    En la main definir una serie de objetos de la clase Vector y operar con ellos
 **/

class Vector {
    val array: IntArray = IntArray(5)

    fun cargarArray(){
        for(i in array.indices)
            array[i] = ((Math.random() * 11) + 1).toInt()
    }

    fun imprimir(){
        for (elem in array)
            print("$elem ")
        println()
    }

    operator fun plus(vector: Vector): Vector {        // sobrecarga del operador +
        var suma = Vector()
        for(i in array.indices)
            suma.array[i] = array[i] + vector.array[i]
        return suma
    }

    operator fun minus(vector: Vector): Vector{
        var resta = Vector()
        for(i in array.indices)
            resta.array[i] = array[i] - vector.array[i]
        return resta
    }

    operator fun times(vector: Vector): Vector{
        var mult = Vector()
        for(i in array.indices)
            mult.array[i] = array[i] * vector.array[i]
        return mult
    }

    operator fun div(vector: Vector):Vector{
        var divi = Vector()
        for (i in array.indices)
            divi.array[i] = array[i] / vector.array[i]
        return  divi
    }
}

fun main(args: Array<String>) {
    val v1 = Vector()
    v1.cargarArray()
    v1.imprimir()
    val v2 = Vector()
    v2.cargarArray()
    v2.imprimir()
    val vSuma = v1 + v2
    println("Suma componente a componente de los dos vectores")
    vSuma.imprimir()
    val vResta = v1 - v2
    println("La resta componente a componente de los dos vectores")
    vResta.imprimir()
    val vProducto = v1 * v2
    println("El producto componente a componente de los dos vectores")
    vProducto.imprimir()
    val vDivision = v1 / v2
    println("La división componente a componente de los dos vectores")
    vDivision.imprimir()

}
