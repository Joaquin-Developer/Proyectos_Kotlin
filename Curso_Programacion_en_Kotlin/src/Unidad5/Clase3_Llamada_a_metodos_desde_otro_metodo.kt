package Unidad5
/**
 * Created by Joaquín Parrilla on 18/06/2020.
 * Clase 3: POO en Kotlin: Llamada a métodos desde otro método
 * Página del teórico: inicia en 122
 * Temas:
 *      Programación Orientada a Objetos
 *      Métodos
 * <>
 Plantear una clase Operaciones que en un método solicite la carga de 2 enteros y
posteriormente llame a otros dos métodos que calculen su suma y producto
 **/
class Operaciones {
    var num1: Int = 0
    var num2: Int = 0

    fun cargar(){
        println("Ingresar el valor del primer numero: ")
        num1 = readLine()!!.toInt()
        println("Ingresar el valor del segundo numero: ")
        num2 = readLine()!!.toInt()
        suma()
        resta()

    }

    fun suma() {
        println("La suma de $num1 y $num2 es ${num1+num2}")
    }
    fun resta() {
        println("La resta de $num1 y $num2 es ${num1-num2}")
    }

}

fun main(args:Array<String>){
    val op = Operaciones()
    op.cargar()
}

