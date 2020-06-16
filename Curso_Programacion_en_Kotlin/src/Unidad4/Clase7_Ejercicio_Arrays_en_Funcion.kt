package Unidad4

/**
 * Created by Joaquín Parrilla on 22/04/2020.
 * Clase 7: Ejercicios practicos.
 * Página del teórico: inicia en 103
 * Temas:
 *      Arrays
 *      Funciones
 *      Parámetros y retorno en funciones
 * <>
todo| Ejercicio:
    Desarrollar un programa que permita ingresar un arreglo de n elementos, ingresar n
    por teclado.
    Elaborar tres funciones una donde se lo cree y cargue al arreglo, otra que sume todos
    sus elementos y retorne dicho valor a la main donde se lo imprima, y otra funcion donde
    se calcule el elemento mayor y el menor
**/
fun main(args:Array<String>){
    println("Ingresar total de números a coleccionar: ")
    val n = readLine()!!.toInt()
    val coleccion = crearYcargar(n)
    imprimeArray(coleccion)
    print("Suma de elementos de la colección: ")
    println(sumaElem(coleccion))
    mayorYmenor(coleccion)

}

private fun crearYcargar(n:Int) : IntArray{
    val array : IntArray = IntArray(n)
    for(i in array.indices){
        println("Ingresar ${i+1}° numero a la colección: ")
        array[i] = readLine()!!.toInt()
    }
    return array
}

private fun imprimeArray(array:IntArray){
    for(i in array.indices)
        println("Elemento ${i+1} : ${array[i]}")
}

private fun sumaElem(array:IntArray) : Int{
    var suma = 0
    for(n in array)
        suma += n
    return suma
}
private fun mayorYmenor(array:IntArray){
    var mayor = 0
    var menor = 0   //<>
    for(actual in array){
        if(actual > mayor)
            mayor = actual
        if(actual < menor)
            menor = actual
    }
    println("Elemento mayor de la colección: $mayor")
    println("Elemento menor de la colección: $menor")
}