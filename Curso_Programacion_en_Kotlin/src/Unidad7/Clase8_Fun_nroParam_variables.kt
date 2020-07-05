package Unidad7
/**
 * Created by JoaquínParrilla on 05/07/2020.
 * Clase 8: Funciones: número variable de parámetros
 * Página del teórico: inicia en 225
 * Temas:
 *      Número variable de parámetros en Funcion
 * <>
todo Teoria:
En el lenguaje Kotlin un método de una clase o función puede recibir una cantidad variable
de parámetros utilizando la palabra clave "vararg" previa al nombre del parámetro.
Desde donde llamamos a la función pasamos una lista de valores y lo recibe un único
parámetro agrupando dichos datos en un arreglo.
Utilizamos vararg previo al nombre del parámetro y el tipo de dato que almacenará el arreglo
Dentro de la función tratamos al parámetro nombres como un arreglo.
Cuando llamamos a la función imprimir no enviamos un arreglo sino una lista de String, el
compilador se encarga de transformar esa lista a un arreglo.
todo Ejercicio 1:
Elaborar una función que reciba una cantidad variable de enteros y nos retorne su suma.
 **/
//fun calculoSuma(vararg nums: Int): Int{
//    var suma = 0
//    for(n in nums)
//        suma += n
//
//    return suma
//}

// podemos hacerlo de esta otra forma:

fun suma(vararg numeros: Int): Int = numeros.sum()

// El metodo sum retorna la suma de todos los elementos del array

fun main(args: Array<String>) {
    val resultado = suma(2, 4, 0, 1)
    println("2 + 4 + 0 + 1 = $resultado")

}
