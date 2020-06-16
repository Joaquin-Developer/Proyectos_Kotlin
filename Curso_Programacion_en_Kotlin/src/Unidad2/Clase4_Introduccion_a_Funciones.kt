package Unidad2

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 4: Introducción a las Funciónes en Kotlin
 * Página del teórico: inicia en 65
 * Temas:
 *      Función
 * <>
 * Problema 1
    Confeccionar una aplicación que muestre una presentación en pantalla del programa.
    Solicite la carga de dos valores y nos muestre la suma. Mostrar finalmente un mensaje de
    despedida del programa.
    Implementar estas actividades en tres funciones.
 */
fun main(args:Array<String>){
    // nuestro programa siempre comenzará en el método main.
    presentacion()  // primero llamo a esta funcion
    sumaNumeros()   // luego a esta
    despedida()     // por último a esta tercer funcion
}

private fun presentacion(){
    println("*************************************************")
    println("**************** SUMA DE NÚMEROS ****************")
    println("*************************************************")
}

private fun sumaNumeros(){
    println("Ingrese el primer numero: ")
    var num1 = readLine()!!.toInt()
    println("Ingrese el segundo numero: ")
    var num2 = readLine()!!.toInt()
    var suma : Int = (num1 + num2)
    println("La suma de $num1 y $num2 es $suma")
}

private fun despedida(){
    println("")
    println("Fué un gustazo, ta chau.")
}
