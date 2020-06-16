package Unidad2

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 7: Funciones: Parámetros Ejercicio 2
 * Página del teórico: inicia en 72
 * Temas:
 *      Funcion
 *      Parámetros
 * <>
 * Ejercicio 2:
    Confeccionar una función que reciba tres enteros y nos muestre el mayor de ellos. La carga
    de los valores hacerlo por teclado en la función main.
 */
private fun main(args:Array<String>){
    println("Ingrese primer numero:")
    val num1 = readLine()!!.toInt()
    println("Ingrese segundo numero:")
    val num2 = readLine()!!.toInt()
    println("Ingrese tercer numero:")
    val num3 = readLine()!!.toInt()
    enteros(num1, num2, num3)   // llamo a la funcion enteros y le paso los tres parametros correspondientes.
}

private fun enteros(num1 : Int, num2 : Int, num3 : Int){
    val mayor : Int
    if(num1 > num2 && num1 > num3){
        mayor = num1
    }else if (num2 > num3){
        mayor = num2
    } else{
        mayor = num3
    }
    println("El numero mayor entre los tres valores es el $mayor")
}
