package Unidad5

/**
 * Created by Joaquín Parrilla on 22/04/2020.
 * Clase 2: POO en Kotlin: Ejercicio 1
 * Página del teórico: inicia en 109
 * Temas:
 *      Programación Orientada a Objetos
 *      Ejercicios
 * <>
Ejercicio: Implementar una clase que cargue los lados de un triángulo e implemente los siguientes
    métodos: inicializar las propiedades, imprimir el valor del lado mayor y otro método que
    muestre si es equilátero o no. */

class Triangulo constructor(var lado1: Int, var lado2: Int, var lado3: Int){    //magia de Kotlin!
    init {
        if(lado1 == 0 || lado2 == 0 || lado3 == 0){
            //si alguna entrada es cero, inicializo a todos los lados como valor 1
            lado1 = 1; lado2 = 1; lado3 = 1
        }
    }
    fun ladoMayor(): Int{
        var ladoMayor: Int = when{
            lado1 > lado2 && lado1 > lado3 -> lado1
            lado2 > lado1 && lado2 > lado3 -> lado2
            else -> lado3
        }
        return ladoMayor
    }
    fun esEquilatero(): Boolean{
        var esEquilatero: Boolean = false
        if(lado1 == lado2 && lado2 == lado3)
            esEquilatero = true
        return esEquilatero
    }
}//end class Triangulo{}

fun main(args:Array<String>){
    println("Ingrese primer lado del triangulo: ")
    val lado1 = readLine()!!.toInt()
    println("Ingrese segundo lado del triangulo: ")
    val lado2 = readLine()!!.toInt()
    println("Ingrese tercer lado del triangulo: ")
    val lado3 = readLine()!!.toInt()
    val unTriangulo = Triangulo(lado1, lado2, lado3)

    if(unTriangulo.esEquilatero()){
        println("El triángulo es EQUILATERO")
    } else{
        println("El lado mayor de triángulo mide: ${unTriangulo.ladoMayor()}")
    }

}// end main