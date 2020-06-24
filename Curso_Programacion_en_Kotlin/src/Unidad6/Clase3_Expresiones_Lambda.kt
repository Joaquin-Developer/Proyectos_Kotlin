package Unidad6
/**
 * Created by JoaquínParrilla on 24/06/2020.
 * Clase 3: Expresiones Lambda
 * Página del teórico: inicia en 182
 * Temas:
 *      Funciones
 *      Expresiones Lambda
 * <>
Una expresión lambda es cuando enviamos a una función de orden superior directamente
una función anónima.
Es más común enviar una expresión lambda en lugar de enviar la referencia de una función
como vimos en el concepto anterior.
todo Ejercicio:
    Definir una función de orden superior llamada operar. Llegan como parámetro dos enteros y
    una función. En el bloque de la función llamar a la función que llega como parámetro y
    enviar los dos primeros parámetros.
    Desde la función main llamar a operar y enviar distintas expresiones lambdas que permitan
    sumar, restar y elevar el primer valor al segundo .
**/

fun operarNums(v1: Int, v2: Int, fn: (Int, Int) -> Int): Int{
    return fn(v1, v2);
}

fun main(parametro: Array<String>) {
    /* lambda */
    val suma = operarNums(2, 3, {x, y -> x + y})
    println(suma)
    val resta = operarNums(12, 2, {x, y -> x - y})
    println(resta)
    var elevarCuarta = operarNums(2, 4, {x, y ->
        var valor = 1
        for(i in 1..y)
            valor = valor * x
        valor
    })
    println(elevarCuarta)
}
