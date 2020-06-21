package Unidad5
/**
 * Created by JoaquínParrilla on 20/06/2020.
 * Clase 14: POO en Kotlin: Arrays de Objetos
 * Página del teórico: inicia en 173
 * Temas:
 *      Programación Orientada a Objetos
 *      Arrays de objetos
 *      Objetos en Kotin
 * <>
Dijimos que un arreglo es una estructura de datos que permite almacenar un CONJUNTO
de datos del MISMO tipo. Con un único nombre se define un arreglo y por medio de un
subíndice hacemos referencia a cada elemento del mismo (componente)
Vimos como crear arreglos con componentes de tipo Int, Char, Float, Double etc., ahora
veremos como definir un arreglo con componentes de una determinada clase que
declaramos nosotros.
todo Problema 1 :
 Declarar una clase Persona con las propiedades nombre y edad, definir como métodos su
 impresión y otra que retorna true si es mayor de edad o false en caso contrario
 En la función main definir un arreglo con cuatro elementos de tipo Persona. Calcular cuantas
 personas son mayores de edad.
 **/

class Personas(val nombre: String, val edad: Int){

    fun imprimir() = println("Nombre: $nombre, edad: $edad")

    fun mayorEdad(): Boolean = if(edad >= 18) true else false

}

fun main(args: Array<String>) {

    val variasPersonas: Array<Personas> = arrayOf(Personas("Ana", 16), Personas("Maria", 21),
        Personas("Pedro", 32), Personas("Damián", 12))
    // A continuación, vamos a recorrer el arrayList, e imprimir sus elementos:
    // y a su vez ir viendo si la persona es mayor de edad o no

    var contMayores: Int = 0

    println("Listado de Personas:")
    for(p in variasPersonas){   //for each
        p.imprimir() // la mostramos
        if(p.mayorEdad())   //si es mayor, agregamos 1 al contador
            contMayores++
    }
    println("Cantidad de personas mayores de edad: $contMayores")
    println("Cantidad de menores: ${variasPersonas.size - contMayores}")

}
