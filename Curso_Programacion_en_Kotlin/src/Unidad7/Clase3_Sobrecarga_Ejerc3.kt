package Unidad7
/**
 * Created by JoaquínParrilla on 25/06/2020.
 * Clase 3: Sobrecarga de Operadores - Ejercicio 3
 * Página del teórico: inicia en 212
 * Temas:
 *      Sobrecarga de Operadores
 *      Ejercicio
 * <>
Ejercicio 3:
Declarar una clase llamada Vector que administre un array de 5 elementos de tipo entero y
cargar valores aleatorios entre 1 y 10. Sobrecargar los operadores ++ y -- (se debe
incrementar o disminuir en uno cada elemento del arreglo)
 **/

class Vect{
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

    operator fun inc(): Vect{
        val v = Vect()
        for(i in array.indices)
            v.array[i] = (array[i] + 1)
        return  v
    }

    operator fun dec(): Vect{
        val v = Vect()
        for(i in array.indices)
            v.array[i] = (array[i] - 1)
        return  v
    }

}

fun main(args: Array<String>) {
    var v1 = Vect()
    v1.cargarArray()
    val respaldoV1 = v1
    println("Vector v1:")
    v1.imprimir()
    println("v1 incrementado en 1: ")
    v1++
    v1.imprimir()
    println("v1 decrementado en 1: ")
    v1--
    v1.imprimir()
    if(vectoresIguales(v1, respaldoV1))
        println("El vector v1 volvió a ser el original")
    else
        println("El vector v1 cambió de su estado original")

}

fun vectoresIguales(v1: Vect, v2: Vect): Boolean{
    var sonIguales = true
    for(i in v1.array.indices){
        if(v1.array[i] != v2.array[i]){
            sonIguales = false
            break
        }
    }
    return sonIguales
}

