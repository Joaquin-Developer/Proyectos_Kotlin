package Unidad2

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 6: Funciones: Parámetros
 * Página del teórico: inicia en 72
 * Temas:
 *      Funcion
 *      Parámetros
 * <>
 * Una función puede tener parámetros para dar datos.
 * Los parámetros nos permiten comunicarle algo a la función y la hace más flexible.
 * Problema 1
    Confeccionar una aplicación que muestre una presentación en pantalla del programa.
    Solicite la carga de dos valores y nos muestre la suma.
    Mostrar finalmente un mensaje de despedida del programa.

 */
private fun main(args:Array<String>){
    mensajePantalla("Programa para sumar dos numeros en Kotlin")
    // se llamó a la funcion mensajePantalla y se le mandó un parámetro del tipo String.
    cargarSuma()
    mensajePantalla("Bye.")
}

private fun cargarSuma(){
    println("Ingrese el primer número: ")
    val num1 : Int = readLine()!!.toInt()
    println("Ingrese el segundo número: ")
    val num2 : Int = readLine()!!.toInt()
    val suma = (num1 + num2)
    println(" $num1 + $num2 = $suma")
}

private fun mensajePantalla(mensaje : String){
    // esta funcion recibe como parámetro un String (llamado mensaje)
    println("***************************************")
    println(mensaje)
    println("***************************************")
}
