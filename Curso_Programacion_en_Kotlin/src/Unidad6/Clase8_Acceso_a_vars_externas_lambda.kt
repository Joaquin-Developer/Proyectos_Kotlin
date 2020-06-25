package Unidad6
/**
 * Created by JoaquínParrilla on 25/06/2020.
 * Clase 8: Expresiones Lambda - Acceso a las variables externas a la expresión lambda
 * Página del teórico: inicia en 197
 * Temas:
 *      Expresiones Lambda
 *      Acceso a variables externas de expresión lambda

 * <>
Hemos visto en conceptos anteriores que una expresión lambda es cuando enviamos a
una función de orden superior directamente una función anónima.
Dentro de la función lambda podemos acceder a los parámetros de la misma si los tiene,
definir variables locales y veremos ahora que podemos acceder a variables externas a la
expresión lambda definida.
 Ejercicio:
    Confeccionar una función de orden superior que reciba un arreglo de enteros y una función
    con un parámetro de tipo Int y que no retorne nada.
    La función debe enviar cada elemento del arreglo a la expresión lambda definida.
    En la función main definir un arreglo de enteros de 10 elementos y almacenar valores
    aleatorios comprendidos entre 0 y 99.
    imprimir del arreglo:
        La cantidad de múltiplos de 3
        La suma de todas las componentes superiores a 50
 **/

/*fun recorroTodo(array: IntArray, fn:(Int)-> Unit){  // el unit indica que no retorna nada

    for(elem in array)
        fn(elem)

}

fun main(args: Array<String>) {
    var enteros = IntArray(10)
    for(i in enteros.indices){
        enteros[i] = (Math.random() * 100).toInt()
    }

    println("Inpresion de todo el array:")
    for(elem in enteros)
        println("$elem")

    // cantidad de multiplos del 3:
    var cont: Int = 0
    recorroTodo(enteros){
        if(it % 3 == 0)
            cont++
    }
    println("Cantidad de multiplos del 3: $cont")

    // suma de todos los componentes >= 50:
    var suma: Int = 0
    recorroTodo(enteros){
        if(it >= 50)
            suma += it
    }
    println("suma de todos los componentes >= 50: $suma")

}*/

/**
 * Mismo ejercicio, pero con metodo forEach:
 *
 * Es más lógico utilizar la función de orden superior forEach que dispone la clase IntArray en
    lugar de crear nuestra propia función (lo hicimos en el problema anterior con el objetivo de
    practicar la creación de funciones de orden superior)
 */

fun main(args: Array<String>) {

    var enteros = IntArray(10)
    for(i in enteros.indices){
        enteros[i] = (Math.random() * 100).toInt()
    }
    println("Inpresion de todo el array:")
    for(elem in enteros)
        println("$elem")

    // cant de multiplos de 3:
    var cont: Int = 0
    enteros.forEach {
        if(it % 3 == 0)
            cont++
    }
    println("Cantidad de multiplos del 3: $cont")

    // suma de todos los componentes >= 50:
    var suma: Int = 0
    enteros.forEach {
        if(it >= 50)
            suma += it
    }
    println("suma de todos los numeros >= 50: $suma")

}

