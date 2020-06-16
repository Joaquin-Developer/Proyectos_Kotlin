package Unidad4

/**
 * Created by Joaquín Parrilla on 16/04/2020.
 * Clase 2: Arrays en Kotlin: Ej.1 con FloatArray
 * Página del teórico: inicia en 94
 * Temas:
 *      Arrays
 *      Arrays de Pto Flotante (FloatArray)
 * <>
 * Ejercicio 1:
    Definir un arreglo de 5 componentes de tipo Float que representen las alturas de 5
    personas.
    Obtener el promedio de las mismas. Contar cuántas personas son más altas que el
    promedio y cuántas más bajas.
 */
fun main(args:Array<String>){
    val alturas = FloatArray(5)
    var sumaAlturas = 0f
    var masAltas = 0f
    var masBajas = 0f
    for(i in 0..alturas.lastIndex){
        val x = i+1
        println("Ingrese $x° altura:")
        alturas[i] = readLine()!!.toFloat()
        sumaAlturas += alturas[i]   // sumamos a sumaAlturas el valor que se acabó de ingresar en altuars[i]
    }
    val promedio = sumaAlturas / alturas.size // división lógica: alturas.size devolverá un 5 (total de elementos)
    println("El promedio de las alturas ingresadas es de $promedio")
    for(i in 0..alturas.lastIndex){
        if(alturas[i] >= promedio)
            masAltas++
        else
            masBajas++
    }
    println("El total de personas con alturas mas altas que el promedio es de $masAltas")
    println("El total de personas con alturas mas bajas que el promedio es de $masBajas")
}
