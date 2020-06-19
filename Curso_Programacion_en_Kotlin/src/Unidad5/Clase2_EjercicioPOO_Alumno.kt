package Unidad5
/**
 * Created by Joaquín Parrilla on 18/06/2020.
 * Clase 2: POO en Kotlin: Ejercicio 2
 * Página del teórico: inicia en 111
 * Temas:
 *      Programación Orientada a Objetos
 *      Ejercicios
 * <>
Ejercicio: Implementar una clase llamada Alumno que tenga como propiedades su nombre y su
nota. Definir los métodos para inicializar sus propiedades por teclado, imprimirlos y
mostrar un mensaje si está regular (nota mayor o igual a 4)
Definir dos objetos de la clase Alumno.*/

class Alumno constructor(var nombre: String, var nota:Int){
    init {
        if(nombre.equals(""))
            nombre = "Sin nombre"
        if(nota == null)
            nota = 0
    }

    fun estadoNota(): String{
        if(nota <= 4)
            return "Regular"
        else
            return "Aceptable"
    }
} //end class

fun main(args:Array<String>){
    var nombre: String
    var nota: Int
    var unAlumno: Alumno
    for (i in 0..1){
        println("Ingresar nombre de Estudiante: ")
        nombre = readLine()!!.toString()
        println("Ingresar nota de Estudiante: ")
        nota = readLine()!!.toInt()
        unAlumno = Alumno(nombre, nota)
        println("La nota de ${unAlumno.nombre} es ${unAlumno.estadoNota()}")
    }

}
