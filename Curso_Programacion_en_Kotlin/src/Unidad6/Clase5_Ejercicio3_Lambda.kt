package Unidad6

import java.lang.StringBuilder

/**
 * Created by JoaquínParrilla on 24/06/2020.
 * Clase 5: Expresiones Lambda - Ejercicio 3
 * Página del teórico: inicia en 188
 * Temas:
 *      Funciones
 *      Expresiones Lambda
 *      Ejercicio de aplicación
 * <>
Confeccionar una función de orden superior que reciba un String y una función con un
parámetro de tipo Char y que retorne un Boolean.
La función debe analizar cada elemento del String llamando a la función que recibe como
parámetro, si retorna un true se agrega dicho caracter al String que se retornará.
En la función main definir un String con una cadena cualquiera.
Llamar a la función de orden superior y pasar expresiones lambdas para filtrar y generar otro
String con las siguientes restricciones:
    Un String solo con las vocales
    Un String solo con los caracteres en minúsculas
    Un String con todos los caracteres no alfabéticos
 **/

fun higherOrder(cadena: String, fn: (Char) -> Boolean): String{
    var cad = StringBuilder()
    for(l in cadena)
        if (fn(l))
            cad.append(l)
    return cad.toString()
}

fun main(args: Array<String>) {
    println("Ingresar palabra:")
    val palabraRandom: String = readLine()!!.toString()

    println("String solo con las vocales:")
    higherOrder(palabraRandom) {
        if( it.equals("A") or it.equals("a") or it.equals("E")
            or it.equals("e") or it.equals("I") or it.equals("i")
            or it.equals("O") or it.equals("o") or it.equals("U") or it.equals("u") )
        {
            true
        } else{
            false
        }
    }
    println("String con carácteres en minúscula: ")
    higherOrder(palabraRandom) {
        if(it in 'a'..'z'){
            true
        }else{
            false
        }
    }

    println("String con todos los caracteres no alfabéticos: ")
    higherOrder(palabraRandom) {
        if (it !in 'A'..'Z' && it !in 'a'..'z')
            true
        else
            false
    }
}

