package Unidad2

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 8: Funciones: Parámetros Ejercicio 3
 * Página del teórico: inicia en 74
 * Temas:
 *      Funcion
 *      Parámetros
 * <>
 * Ejercicio 3:
    Desarrollar un programa que permita ingresar el lado de un cuadrado. Luego preguntar si
    quiere calcular y mostrar su perímetro o su superficie.
 */
fun main(args:Array<String>){
    println("Ingrese el lado de un Cuadrado:")
    val lado : Double = readLine()!!.toDouble()
    do{
        println("Elegir opcion:")
        println("(1) - Calcular perimetro")
        println("(2) - Calcular área")
        println("Su opción:")
        val entrada = readLine()!!.toInt()
        when(entrada){
            1 -> calcularPerimetro(lado)
            2 -> calcularArea(lado)
            else -> println("Error: opción incorrecta")
        }
    }while(entrada != 1 && entrada != 2)
}

private fun calcularPerimetro(lado : Double){
    val perimetro = (lado * 4)
    println("El perímetro del cuadrado es : $perimetro")
}

private fun calcularArea(lado : Double){
    val area = Math.pow(lado, 2.0)
    println("El área del cuadrado es : $area")
}