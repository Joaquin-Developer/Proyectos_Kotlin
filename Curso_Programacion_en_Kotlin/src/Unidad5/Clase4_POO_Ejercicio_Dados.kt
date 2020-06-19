package Unidad5
/**
 * Created by Joaquín Parrilla on 18/06/2020.
 * Clase 4: POO en Kotlin: Colaboración de Clases - Ejercicio 2
 * Página del teórico: inicia en 128
 * Temas:
 *      Programación Orientada a Objetos
 *      Colaboración de Clases
 *      Ejercicio
 * <>
Plantear un programa que permita jugar a los dados. Las reglas de juego son:
se tiran tres dados si los tres salen con el mismo valor mostrar un mensaje que "gano", sino
"perdió".
 **/
class Dado(var valor: Int){

    fun tirar()
    {
        valor = ((Math.random() * 6) + 1).toInt()
        imprimir()
    }

    fun imprimir(){
        println("Valor del dado: $valor")
    }
}

class JuegoDado{
    val dado1 = Dado(1)
    val dado2 = Dado(1)
    val dado3 = Dado(1)

    fun jugar(){
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()
        if(dado1.valor.equals(dado2.valor) && dado2.valor.equals(dado3.valor)){
            println("¡¡Ganó!! :) ")
        }else{
            println("Perdió.  :( ")
        }
    }
}

fun main(args: Array<String>) {
    val juego1 = JuegoDado()
    juego1.jugar()
}
