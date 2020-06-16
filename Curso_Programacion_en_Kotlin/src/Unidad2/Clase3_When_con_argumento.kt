package Unidad2

// Tenemos una segunda forma de utilizar la sentencia when en el lenguaje Kotlin pasando un
//argumento inmediatamente después de la palabra clave when.

/**
 * Created by Joaquín Parrilla on 08/03/2020.
 * Clase 3: Úso del When con argumento
 * Página del teórico: inicia en 62 a 64
 * Temas:
 *      When
 *      Ejemplos del úso del when con argumento
 * <>
 */

fun main(args:Array<String>){
    //ejercicio1()
    ejercicio2()
}

private fun ejercicio1(){
    /**
     * Primer Ejemplo:
     * Ingresar un valor entero comprendido entre 1 y 5. Mostrar el nombre del mismo (formato texto)
     */
    println("Ingrese un valor entero comprendido entre el 1 y el 5 :")
    val num = readLine()!!.toInt()
    when(num){  // num como argumento del condicional when
        1 -> println("Uno")
        2 -> println("Dos")
        3 -> println("Tres")
        4 -> println("Cuatro")
        5 -> println("Cinco")
        else -> println("Error: Valor fuera del rango esablecido.")
    }
}

private fun ejercicio2(){
    /**
     * Ingresar un valor entero positivo comprendido entre 1 y 10000. Imprimir un mensaje
     * indicando cuantos dígitos tiene.
     */
    println("Ingresar un numero entero positivo entre el 1 y 10000 : ")
    val num = readLine()!!.toInt()
    when(num){
        in 1..9 -> println("El numero $num tiene un dígito")
        in 10..99 -> println("El numero $num  tiene dos dígitos")
        in 100..999 -> println("El numero $num tiene tres dígitos")
        in 1000..9999 -> println("El numero $num tiene cuatro dígitos")
        10000 -> println("El número $num tiene cinco dígitos")
        else -> println("Error: El número ingresado no se encuentra en el rango establecido.")
    }
    //  También en Kotlin podemos comprobar si una variable se encuentra comprendida en un
    //  rango determinado utilizando la palabra in y el rango respectivo.
}

private fun ejercicio3(){
    /**
     *   Ingresar 10 valores enteros por teclado. Contar cuantos de dichos valores ingresados fueron
     *   cero y cuantos 1,5 o 10.
     */
    var cant1 = 0   // ceros
    var cant2 = 0   // unos, cincos, y dieces
    for(i in 1..10){
        println("Ingrese un numero entero :")
        var num = readLine()!!.toInt()
        when(num){
            0 -> cant1++
            1, 5, 10 -> cant2++
        }
    }
    println("Total de valores 0 ingresados : $cant1")
    println("Total de valores 1, 5 ó 10 ingresados : $cant2")

}







