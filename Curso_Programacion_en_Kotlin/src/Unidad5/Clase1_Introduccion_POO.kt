package Unidad5

/**
 * Created by Joaquín Parrilla on 22/04/2020.
 * Clase 1: POO en Kotlin: Introducción
 * Página del teórico: inicia en 104
 * Temas:
 *      Programación Orientada a Objetos
 *      Conceptos básicos.
 * <>
La programación orientada a objetos se basa en la programación de clases; a diferencia de
la programación estructurada, que está centrada en las funciones.
Una clase es un molde del que luego se pueden crear múltiples objetos, con similares
características. Una clase es una plantilla (molde), que define propiedades (variables) y
métodos (funciones). La clase define las propiedades y métodos comunes a los objetos de ese tipo,
pero luego, cada objeto tendrá sus propios valores y compartirán las mismas funciones.
Debemos crear una clase antes de poder crear objetos (instancias) de esa clase. Al crear un
objeto de una clase, se dice que se crea una instancia de la clase o un objeto propiamente
dicho.
todo|   Ejercicio: Crear una clase de nombre persona, con atributos {nombre, edad} y metodos {inicializar,
todo    imprimir, y calcular si es mayor de 18 o menor.} **/
class Persona constructor(var nombre: String, var edad: Int) {
    init {
        if(edad < 0)
            edad = 0
    }

    fun imprime() = println("$nombre tiene $edad años.")

    fun esMayor(): Boolean = if (edad >= 18) true else false
}

fun main(args:Array<String>){
    val unaPersona = Persona("Pedro Sanchez", 21)  //magia de Kotlin!
    unaPersona.imprime()
    if(unaPersona.esMayor())
        println("${unaPersona.nombre} es mayor de edad")
    else
        println("${unaPersona.nombre} es menor de edad")
}