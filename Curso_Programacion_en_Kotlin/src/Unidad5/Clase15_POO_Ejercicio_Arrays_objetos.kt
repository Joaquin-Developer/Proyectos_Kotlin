package Unidad5
/**
 * Created by JoaquínParrilla on 20/06/2020.
 * Clase 15: POO en Kotlin: Arrays de Objetos - Práctica
 * Página del teórico: inicia en 175
 * Temas:
 *      Programación Orientada a Objetos
 *      Arrays de objetos
 *      Objetos en Kotin
 *      Ejercicios de aplicación
 * <>
Ejercicio propuesto:
Dada la siguiente dataClass:
data class Articulo(val codigo: Int, val descripcion: String, var precio:
Float)
Definir un Array con 4 elmentos de tipo Articulo.
Implementar dos funciones, una que le enviemos el Array y nos muestre todos sus
componentes, y otra que también reciba el Array de artículos y proceda a aumentar en
10% a todos los productos.
 **/

data class Articulos(val codigo: Int, val descripcion: String, var precio: Float)

fun imprimirArticulos(articulos: Array<Articulos>){
    for(a in articulos)
        println("Codigo: ${a.codigo}, Descripcion: ${a.descripcion}, Precio: ${a.precio}")
}

fun aumentarPrecios(articulos: Array<Articulos>){
    for(a in articulos)
        a.precio += (a.precio * 0.10f)
}

fun main(args: Array<String>) {
    val arrayArticulos: Array<Articulos> = arrayOf(
        Articulos(100,"Pepsi 2L",100f),
        Articulos(101,"Agua 6L Salus",200f),
        Articulos(102,"Milanesas",40f)
    )
    println("Listado de precios actuales:")
    imprimirArticulos(arrayArticulos)
    //aumentamos 10% con la funcion:
    aumentarPrecios(arrayArticulos)
    println("Listado de precios con 10% de aumento del precio:")
    imprimirArticulos(arrayArticulos)
}
