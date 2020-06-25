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

// Ejercicio 2:
// Agregar fun de extension a IntArray que permita
// imporimir todos sus elementos en una única linea
fun IntArray.printOneLine(){
    print("[")
    for (i in 0..this.lastIndex){
        if(i != this.lastIndex)
            print("${this[i]}, ")
        else
            print("${this[i]}")
    }
    println("]")
}

fun main(args: Array<String>) {
    // Prueba:
//    val nombre: String = "Matias"
//    print("Palabra a partir en dos: $nombre")
//    println()
//    println("Primer mitad de la palabra: ${nombre.mitadPrimera()} ")
//    println("Segunda mitad de la palabra: ${nombre.mitadSegunda()}")

    val unArray: IntArray = IntArray(5)
    for(i in 0..4)
        unArray[i] = i

    unArray.printOneLine()
    val word: String = "Pedro"
    word.printChars()

    println(); println()    //espacios en consola

    val integer = 4
    integer.printUntil(12)

}

// Ejercicio 3:
// Agregar a la clase String un método imprimir que muestre todos los caracteres que
// tiene almacenado en una línea.

fun String.printChars(){
    val charArray: CharArray = this.toCharArray()
    print("[")
    for (i in 0..this.lastIndex){
        if(i != this.lastIndex)
            print("${this[i]}, ")
        else
            print("${this[i]}")
    }
    println("]")
}

// Ejercicio 4:
// Codicar la función de extensión llamada "hasta" que debe extender la clase Int y tiene
// por objetivo mostrar desde el valor entero que almacena el objeto hasta el valor que
// llega como parámetro:

fun Int.printUntil(until: Int){
    for (i in this..until){
        println("$i")
    }
}



