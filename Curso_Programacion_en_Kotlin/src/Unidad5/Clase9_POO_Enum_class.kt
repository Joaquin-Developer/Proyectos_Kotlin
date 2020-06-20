package Unidad5
/**
 * Created by Joaquín Parrilla on 19/06/2020.
 * Clase 9: POO en Kotlin: Dataclass
 * Página del teórico: inicia en 144
 * Temas:
 *      Programación Orientada a Objetos
 *      Enum
 * <>
En Kotlin tenemos otro tipo especial de clase que se las declara con las palabras claves
enum class.
Se las utiliza para definir un conjunto de constantes.
Ejercicio propuesto: Declarar una enum class con los nombres de naipes de la baraja inglesa.
Definir una clase carta que tenga una propiedad de la clase enum class
 **/

enum class TipoCarta{
    DIAMANTE,
    TREBOL,
    CORAZON,
    PICA
}

private class carta(val tipo: TipoCarta, val valor: Int){

    fun imprimir() = println("Carta: $tipo y su valor es $valor")

}

private fun main(args: Array<String>) {
    val carta1 = carta(TipoCarta.TREBOL, 4)
    carta1.imprimir()
}

/**
 * Ejercicio 2:
 * Declarar un enum class que represente las cuatro operaciones básicas, asociar a cada
 *  constante un String con el signo de la operación.
 *  Definir una clase Operación que defina tres propiedades, las dos primeras deben ser los
 *  números y la tercera el tipo de operación.
 */
enum class operaciones(val tipo: String){
    SUMA("+"),
    RESTA("-"),
    MULTIPLICACION("*"),
    DIVISION("/")
}
class operacion(val num1:Double, val num2: Double, val tipoOperacion: operaciones){

    fun operar(){
        var resultado: Double = when(tipoOperacion){
            operaciones.SUMA -> (num1 + num2)
            operaciones.RESTA -> (num1 - num2)
            operaciones.MULTIPLICACION -> (num1 * num2)
            operaciones.DIVISION -> (num1 / num2)
        }
        println("$num1 ${tipoOperacion.tipo} $num2 = $resultado")
    }
}


