package Unidad5
/**
 * Created by Joaquín Parrilla on 18/06/2020.
 * Clase 7: POO en Kotlin: Dataclass
 * Página del teórico: inicia en 136
 * Temas:
 *      Programación Orientada a Objetos
 *      Dataclass
 * <>
Hemos dicho que una clase encapsula un conjunto de funcionalidades (métodos) y datos
(propiedades)
En muchas situaciones queremos almacenar un conjunto de datos sin necesidad de
implementar funcionalidades, en estos casos el lenguaje Kotlin nos provee de una estructura
llamada: data class.
Ejercicio1: Declarar un data class llamado Articulo que almacene el código del producto, su descripción
y precio. Definir luego varios objetos de dicha data class en la main
 **/

private data class Articulo(var codigo: Int, var descripcion: String, var precio: Float)

fun main(args: Array<String>) {

    val articulo1 = Articulo(123, "Papas", 35f)
    var articulo2 = Articulo(456, "Manzanas", 42f)
    println(articulo1)
    println(articulo2)
    val puntero = articulo1
    puntero.precio = 39f
    println(articulo1)
    var articulo3 = articulo1.copy()  //copia del objeto articulo1
    articulo1.precio = 29f
    println(articulo1)
    println(articulo3)
    if(articulo1 == articulo3)
        println("Son iguales $articulo1 y $articulo3")
    else
        println("Son distintos $articulo1 y $articulo3")

    articulo3.precio = 200f
    if (articulo1 == articulo3)
        println("Son iguales $articulo1 y $articulo3")
    else
        println("Son distintos $articulo1 y $articulo3")
}
