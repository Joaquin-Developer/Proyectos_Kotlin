package Unidad6
/**
 * Created by JoaquínParrilla on 24/06/2020.
 * Clase 4: Expresiones Lambda - Ejercicio
 * Página del teórico: inicia en 185
 * Temas:
 *      Funciones
 *      Expresiones Lambda
 *      Ejercicio de aplicación
 * <>
Confeccionar una función de orden superior que reciba un arreglo de enteros y una función
con un parámetro de tipo Int y que retorne un Boolean.
La función debe analizar cada elemento del arreglo llamando a la función que recibe como
parámetro, si retorna un true se pasa a mostrar el elemento.
En la función main definir un arreglo de enteros de 10 elementos y almacenar valores
aleatorios comprendidos entre 0 y 99.
Imprimir del array:
Los valores múltiplos de 2
Los valores múltiplos de 3 o de 5
Los valores mayores o iguales a 50
Los valores comprendidos entre 1 y 10, 20 y 30, 90 y 95
 **/

//fun imprimirSi(nums: IntArray, fn: (Int) -> Boolean){
//    // higher-order fun
//    for( i in 0..nums.lastIndex){
//        if(fn(nums[i]))
//            println("Elemento $i = ${nums[i]}")
//    }
//}
//
//fun main(args: Array<String>) {
//    var array: IntArray = IntArray(10)  //name, type, size
//
//    for(i in array.indices) {
//        array[i] = (Math.random() * 100).toInt()
//    }
//    println("Nums. multiplos del 2: ")
//    imprimirSi(array) {x -> x % 2 == 0}         // args: (array) {fun}
//
//    println("Nums. multiplos de 3 o de 5: ")
//    imprimirSi(array) {x -> (x % 3 == 0) || (x % 5 == 0)}
//
//    println("Nums. mayores o iguales a 50: ")
//    imprimirSi(array) {x -> (x >= 50)}
//
//    println("Nums. entre 1..10, 20..30 y 90..95 ")
//    imprimirSi(array) {
//        x -> when(x){
//            in 1..10 -> true
//            in 20..30 -> true
//            in 90..90 -> true
//            else -> false
//        }//end function-arg
//    }
//}

/**
 * Ej. anterior, pero con codigo reducido.
    cuando tenemos una expresión lambda cuya función recibe un solo parámetro podemos
    obviarlo, inclusive el signo ->
    Luego por convención ese único parámetro podemos hacer referencia al mismo con la
    palabra "it"
 */

fun imprimirSi(nums: IntArray, fn: (Int) -> Boolean){
    // higher-order fun
    for( i in 0..nums.lastIndex){
        if(fn(nums[i]))
            println("Elemento $i = ${nums[i]}")
    }
}


fun main(args: Array<String>) {
    var array: IntArray = IntArray(10)
    for(i in array.indices){
        array[i] = (Math.random() * 100).toInt()
    }
    println("Nums. multiplos del 2: ")
    imprimirSi(array) {it % 2 == 0 }

    println("Nums. multiplos del 3 o del 5: ")
    imprimirSi(array) {(it % 3 == 0) || (it % 5 == 0)}

    println("Nums. mayores o iguales a 50")
    imprimirSi(array) {it >= 50}

    println("Nums. entre 1..10, 20..30 y 90..95 ")
    imprimirSi(array) {
        when(it) {
            in 1..10 -> true
            in 20..30 -> true
            in 90..95 -> true
            else -> false
        }
    }

}

















