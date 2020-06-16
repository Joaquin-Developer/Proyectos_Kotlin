package Unidad3

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 10: Llamada a funciones con parámetros nombrados
 * Página del teórico: inicia en 89
 * Temas:
 *      Funcion
 *      Llamada a funciones con parámetros nombrados
 * <>
 * Ejercicio:
    Elaborar una función que muestre la tabla de multiplicar del valor que le enviemos
    como parámetro. Definir un segundo parámetro llamado termino que por defecto
    almacene el valor 10. Se deben mostrar tantos términos de la tabla de multiplicar como
    lo indica el segundo parámetro.
    Llamar a la función desde la main con argumentos nombrados.
 */
fun main(args:Array<String>){
    println("********* Tablas de multiplicar *********")
    println("Ingrese numero para mostrar su tabla de multiplicar")
    val num : Int = readLine()!!.toInt()
    println("¿Hasta qué tabla desea ver? :")
    val max : String? = readLine()
    if(max?.length == 0)
        tabla(num)  // no le paso el "max", por ende será 10 por defecto.
    else
        tabla(numero = num, max = (Integer.valueOf(max)))   //convierto String a Int
}

private fun tabla(numero:Int, max:Int = 10){    //por defecto hasta el 10.
    println("Tabla del $numero")
    for(i in 1..max)
        println("$numero x $i = "+(numero*i))
    //println("")
}