package Unidad7
/**
 * Created by JoaquínParrilla on 25/06/2020.
 * Clase 2: Sobrecarga de Operadores - Ejercicio 2
 * Página del teórico: inicia en 209
 * Temas:
 *      Sobrecarga de Operadores
 *      Ejercicio
 * <>
Ejercicio 2:
Declarar una clase llamada Vector que administre un array de 5 elementos de tipo entero y
cargar valores aleatorios entre 1 y 10. Sobrecargar el operador * que permita multiplicar un
Vector con un número entero (se debe multiplicar cada componente del arreglo por el
entero)
 **/

class Vectores{
    val array: IntArray = IntArray(5)

    fun cargarArray(){
        for(i in array.indices)
            array[i] = ((Math.random() * 11) + 1).toInt()
    }

    fun imprimir(){
        for (elem in array)
            print("$elem ")
        println()
    }

    operator fun times(value: Int): Vectores{
        val mult = Vectores()
        for(i in array.indices){
            mult.array[i] = array[i] * value
        }
        return mult;
    }

    // Si invertimos el producto, es decir un Int por un Vector debemos definir
    // el método times en la clase:
    operator fun Int.times(v: Vectores): Vectores{
        val mult = Vectores()
        for(i in v.array.indices){
            mult.array[i] = v.array[i] * this
        }
        return mult;
    }



}

fun main(args: Array<String>) {
    var v1 = Vectores()
    v1.cargarArray()
    println("Vector v1:")
    v1.imprimir()

    println("Producto de un Vector con el numero 4 :")
    //var producto: Vectores = 4 * v1
    //producto.imprimir()

    var v2 = Vectores()
    v2.cargarArray()
    print("Vector v2:")
    v2.imprimir()

    println("Producto del numero 4 con el vector v1 :")
    //var prod: Vectores = 4 * v2
    //prod.imprimir()

}


