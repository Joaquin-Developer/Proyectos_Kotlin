package Unidad5
/**
 * Created by Joaquín Parrilla on 18/06/2020.
 * Clase 5: POO en Kotlin: Colaboración de Clases - Ejercicio 3
 * Página del teórico: inicia en 130
 * Temas:
 *      Programación Orientada a Objetos
 *      Colaboración de Clases
 *      Ejercicio 3
 * <>
Plantear una clase Club y otra clase Socio.
La clase Socio debe tener los siguientes propiedades: nombre y la antigüedad en el
club (en años).
Al constructor de la clase socio hacer que llegue el nombre y su antigüedad.
La clase Club debe tener como propiedades 3 objetos de la clase Socio.
Definir un método en la clase Club para imprimir el nombre del socio con mayor
antigüedad en el club.
 **/

data class  Socio(val nombre: String, val antiguedad: Int)

class Club{
    var socio1 = Socio("Gustavo", 6)
    var socio2 = Socio("Facundo", 3)
    var socio3 = Socio("Melissa", 13)

    fun socioMasAntiguo(): String{

        val name = when{  // nombre del socio mas antiguo
            socio1.antiguedad > socio2.antiguedad && socio1.antiguedad > socio3.antiguedad -> socio1.nombre
            socio2.antiguedad > socio1.antiguedad && socio2.antiguedad > socio3.antiguedad -> socio2.nombre
            else -> socio3.nombre
        }
        return name
    }

}

fun main(args: Array<String>) {
    val unClub = Club()
    println("El socio mas antiguo es ${unClub.socioMasAntiguo()}")
}

