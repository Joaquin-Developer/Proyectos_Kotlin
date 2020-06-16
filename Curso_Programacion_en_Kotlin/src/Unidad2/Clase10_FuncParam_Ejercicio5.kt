package Unidad2

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 10: Funciones: Parámetros Ejercicio 5
 * Página del teórico: inicia en 76
 * Temas:
 *      Funcion
 *      Parámetros
 * <>
 * Ejercicio 5:
    Confeccionar una función que reciba tres enteros y los muestre ordenados de menor a
    mayor. En la función main solicitar la carga de 3 enteros por teclado y proceder a
    llamar a la primer función definida.
 */
fun main(args:Array<String>){
    println("Ingrese primer numero: ")
    val num1 : Int = readLine()!!.toInt()
    println("Ingrese segundo numero: ")
    val num2 : Int = readLine()!!.toInt()
    println("Ingrese tercer numero: ")
    val num3 : Int = readLine()!!.toInt()
    ordenados(num1, num2, num3)

}       // ->

private fun ordenados(a:Int, b:Int, c:Int){
    when{
        a > b && b > c -> println("$a - $b - $c")
        a > b && c > b -> println("$a - $c - $b")
        b > a && a > c -> println("$b - $a - $c")
        b > a && c > a -> println("$b - $c - $a")
        c > a && a > b -> println("$c - $a - $b")
        c > a && b > a -> println("$c - $b - $a")
    }
}