package Unidad6

/**
 * Created by JoaquínParrilla on 25/06/2020.
 * Clase 10: Funciones de Extensión
 * Página del teórico: inicia en 203
 * Temas:
 *      Funciones de Extensión
 * <>
Otra de las características muy útil de Kotlin para los programadores es el concepto de las
funciones de extensión.
Mediante las funciones de extensión Kotlin nos permite agregar otros métodos a una clase
existente sin tener que heredar de la misma.
Ejemplo 1 :
Agregar dos funciones a la clase String que permitan recuperar la primer mitad y la segunda
mitad.
 **/
fun String.mitadPrimera(): String{
    // fn de extensión de clase String
    return this.substring(0..(this.length / 2-1))
}

fun String.mitadSegunda(): String{
    return this.substring((this.length / 2)..(this.length - 1))
}

fun main(args: Array<String>) {
    // Prueba:
    val nombre: String = "Matias"
    print("Palabra a partir en dos: $nombre")
    println()
    println("Primer mitad de la palabra: ${nombre.mitadPrimera()} ")
    println("Segunda mitad de la palabra: ${nombre.mitadSegunda()}")
    //println(nombre.mitadSegunda())
}

