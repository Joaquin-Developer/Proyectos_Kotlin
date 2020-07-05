package Unidad7
/**
 * Created by JoaquínParrilla on 05/07/2020.
 * Clase 7: Ejercicios de Aplicación de Sobrecarga
 * Página del teórico: inicia en 223
 * Temas:
 *      Sobrecarga
 *      Ejercicios 8 y 9
 * <>
Ejercicio 8:
Plantear un data class Alumno que almacene su número de documento y su nombre.
Luego en una clase Curso definir un Array con 3 objetos de la clase Alumno. Sobrecargar el
operador in para verificar si un número de documento se encuentra inscripto en el curso
 **/

data class Alumno(val numDocumento: Int, val nombre: String)

class curso(){
    val alumnos = arrayOf(
        Alumno(51234567, "Pedro"),
        Alumno(53456789, "Ana Clara"),
        Alumno(57890123, "Sebastian")
    )

    operator fun contains(numDocumento: Int): Boolean{
        return alumnos.any { numDocumento == it.numDocumento }
    }

    fun devolverAlumno(documentoBuscar: Int): String{
        // esta funcion se llama si encontramos una ci en el array de curso
        // por ende, no nos debemos preocupar mucho por los posibles retornos nulos
        var nombre: String = ""
        for(alumno in alumnos){
            if(alumno.numDocumento.equals(documentoBuscar)){
                nombre = alumno.nombre
                break
            }
        }
        return nombre
    }

}

fun main(args: Array<String>) {
    val curso1 = curso()
    println("Ingresar CI de estudiante para buscar si pertenece al curso:")
    val ci: Int = readLine()!!.toInt()
    if(ci in curso1)
        println("El estudiante ${curso1.devolverAlumno(ci)} se encuentra inscripto en el curso")
    else
        println("No se encuentra ningun estudiante con CI = $ci en el sistema.")

}

