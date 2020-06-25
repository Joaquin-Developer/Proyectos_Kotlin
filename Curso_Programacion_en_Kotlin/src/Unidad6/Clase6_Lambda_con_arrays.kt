package Unidad6
/**
 * Created by JoaquínParrilla on 25/06/2020.
 * Clase 6: Expresiones Lambda con arreglos
 * Página del teórico: inicia en 193
 * Temas:
 *      Funciones
 *      Expresiones Lambda con Arrays
 * <>
En el codigo (metodo main) se irán creando distintos arreglos con expresiónes LAMBDA:
 **/

//fun main(args: Array<String>) {
//
//    // creamos un array de tipo int, de 10 elementos, y donde todos los
//    // casilleros tendrán el valor 5:
//    var array10 = IntArray(10) {5}
//    recorrerArray(array10) //con este procedimiento vamos a recorrerlo e imprimirlo
//
//    // Si queremos almacenar en la primer componente un 0, en la segunda un 1 y así
//    // sucesivamente podemos disponer la siguiente sintaxis:
//    var arrayNums = IntArray(10) {it}
//    recorrerArray(arrayNums)
//    // Esto funciona debido a que la función de orden superior cuando llama a nuestra expresión
//    // lambda para cada componente del arreglo nos envía la posición. Recordemos que de forma
//    // larga podemos expresarlo con la siguiente sintaxis:
//    var arrayNumeros = IntArray(10) {indice -> indice}
//    recorrerArray(arrayNumeros)
//
//    // Si queremos guardar los valores 0,2,4,6 etc. podemos utilizar la sintaxis:
//    var pares = IntArray(10) {it * 2}
//
//    // Si queremos almacenar valores aleatorios comprendidos entre 1 y 6 podemos crear el
//    // objeto de la clase IntArray con la siguiente sintaxis:
//    var aleatorios = IntArray(10) {((Math.random() * 6 ) + 1).toInt()}
//
//
//}

fun recorrerArray(array: IntArray){
    for(i in 0..array.lastIndex)
        println("Elemento $i = ${array[i]}")

}

/**
 * Crear un objeto de la clase IntArray de 20 elementos con valores aleatorios comprendidos
    entre 0 y 10.
    Imprimir del arreglo:
    - Todos los elementos.
    - Cantidad de elementos menores o iguales a 5.
    - Mostrar un mensaje si todos los elementos son menores o iguales a 9.
    - Mostrar un mensaje si al menos uno de los elementos del arreglo almacena un 10.
 */


fun main(args: Array<String>) {
    // numeros aleatorios entre 0 y 10:
    var numeros = IntArray(20) {(Math.random() * 11).toInt()}

    // todos los elementos:
    println("Elementos de mi arreglo:")
    for(elem in numeros)
        println("$elem")

    // cantidad de elementos <= 5 :
    val cant: Int = numeros.count { it <= 5 }   //lambda.-
    println("Cantidad de elementos <= 5: $cant")

    // Mostrar un mensaje si todos los elementos son menores o iguales a 9.
    if(numeros.all { it <= 9 })          // all: todos los elem del array deben verificar  condicion de lambda
        println("Todos los elementos son <= 9")
    else
        println("No todos los elementos son <= 9")

    // Mostrar un mensaje si al menos uno de los elementos del arreglo almacena un 10.
    if (numeros.any { it == 10 })       // any: aguno de los elementos debe verificar la condicion de lambda
        println("Hay un elemento con valor 10")
    else
        println("Ningun elemento vale 10")
}


