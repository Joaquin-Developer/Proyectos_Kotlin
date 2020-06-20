package Unidad5
/**
 * Created by Joaquín Parrilla on 19/06/2020.
 * Clase 8: POO en Kotlin: Dataclass
 * Página del teórico: inicia en 136
 * Temas:
 *      Programación Orientada a Objetos
 *      Dataclass
 *      Redefinición de métodos de una clase: Override
 *      Ejemplo práctico
 * <>
Hemos dicho que al declarar un data class ya heredamos una serie de métodos que nos son
útiles para procesar luego los objetos que definamos de dicho data class.
En Kotlin podemos sobreescribir cualquiera de los métodos que nos provee un data class y
definir un nuevo algoritmo al mismo.
Ejercicio: Declarar un data class llamado Persona que almacene el nombre y la edad. Sobreescribir el
método toString para retornar un String con la concatenación del nombre y la edad
separadas por una coma.
 **/
//private data class person(var name: String, var age: Int){
//    override fun toString(): String {
//        return "$name, $age"
//    }
//}
//fun main(args: Array<String>) {
//    var person1 = person("Juan", 22)
//    var person2 = person("Ana", 59)
//    println(person1)
//    println(person2)
//}

/**
 * todo Parte2:
 * Plantear un data class llamado Dado con una única propiedad llamada valor.
 *  Sobreescribir el método toPrint para que muestre tantos asteriscos como indica la
 *  propiedad valor
 */

private data class dado(val value: Int){
    override fun toString(): String{
        var cadena: String = ""
        for(i in 1..value)
            cadena += "*"
        return cadena
    }
}

fun main(args: Array<String>) {
    println("Ingresar valor: ")
    val value = readLine()!!.toInt()
    val unDado = dado(value)
    println(unDado.toString())
}
