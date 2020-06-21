package Unidad6
/**
 * Created by JoaquínParrilla on 20/06/2020.
 * Clase 2: Funciones de Órden Superior - Ejercicio
 * Página del teórico: inicia en 178
 * Temas:
 *      Funciones de Órden Superior
 *      Ejercicio
 * <>
Ejercicio de aplicación:
Declarar una clase que almacene el nombre y la edad de una persona. Definir un método
que retorne true o false según si la persona es mayor de edad o no. Esta función debe
recibir como parámetro una función que al llamarla pasando la edad de la persona retornara
si es mayor o no de edad.
Tener en cuenta que una persona es mayor de edad en Estados Unidos si tiene 21 o más
años y en Uruguay si tiene 18 o más años.
 **/

class Personas(val nombre: String, val pais: String, val edad: Int){
    fun esMayor(): Boolean {
        if(pais.equals("USA"))
            return esMayorUsa(edad)
        else
            return esMayorUru(edad)
    }
}

fun esMayorUsa(edad: Int): Boolean = if(edad >= 21) true else false

fun esMayorUru(edad: Int): Boolean = if(edad >= 18) true else false

fun main(args: Array<String>) {
    val p1 = Personas("Juan", "Uruguay", 25)
    println(p1.esMayor())
    val p2 = Personas("Ana", "USA", 20)
    println(p2.esMayor())
    val p3 = Personas("Facundo", "USA", 22)
    println(p3.esMayor())
    val p4 = Personas("Lucía", "Brazil", 17)
    println(p4.esMayor())

}
