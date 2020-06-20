package Unidad5

/**
 * Created by Joaquín Parrilla on 19/06/2020.
 * Clase 11: POO en Kotlin: Herencia
 * Página del teórico: inicia en 154
 * Temas:
 *      Programación Orientada a Objetos
 *      Herencia
 * <>
Ejercicio de Herencia en Kotlin:
Plantear una clase Persona que contenga dos propiedades: nombre y edad. Definir como
responsabilidades el constructor que reciba el nombre y la edad.
En la función main del programa definir un objeto de la clase Persona y llamar a sus
métodos.
Declarar una segunda clase llamada Empleado que herede de la clase Persona y agregue
una propiedad sueldo y muestre si debe pagar impuestos (sueldo superior a 3000)
También en la función main del programa crear un objeto de la clase Empleado.
**/

open class _Persona(val nombre: String, val edad: Int){
    open fun Print(){
        println("Nombre: $nombre")
        println("Edad: $edad")
    }
}

class _Empleado(nombre: String, edad: Int, val sueldo: Double): _Persona(nombre, edad){
    override fun Print(){
        super.Print()
        println("Sueldo: $sueldo")
    }

    fun pagaImpuestos(){
        if(sueldo > 30000)
            println("El empleado $nombre debe pagar impuestos.")
        else
            println("El empleado $nombre no paga impuestos.")
    }
}

fun main(args: Array<String>) {
    val persona1 = _Persona("Jose", 22)
    println("Datos de la persona")
    persona1.Print()
    val empleado1 = _Empleado("Ana", 30, 5000.0)
    println("Datos del empleado")
    empleado1.Print()
    empleado1.pagaImpuestos()
}