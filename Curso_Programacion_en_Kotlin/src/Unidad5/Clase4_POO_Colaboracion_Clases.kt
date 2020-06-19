package Unidad5
/**
 * Created by Joaquín Parrilla on 18/06/2020.
 * Clase 4: POO en Kotlin: Colaboración de Clases
 * Página del teórico: inicia en 124
 * Temas:
 *      Programación Orientada a Objetos
 *      Colaboración de Clases
 *      Ejercicio de introducción
 * <>
Normalmente un problema resuelto con la metodología de programación orientada a
objetos no interviene una sola clase, sino que hay muchas clases que interactúan
y se comunican.
Un banco tiene 3 clientes que pueden hacer depósitos y extracciones. También el banco
requiere que al final del día calcule la cantidad de dinero que hay depositado.
Lo primero que hacemos es identificar las clases:
Podemos identificar la clase Cliente y la clase Banco.
Luego debemos definir las propiedades y los métodos de cada clase
 **/

class Cliente(var nombre: String, var monto:Float){

    fun depositar(monto: Float){
        this.monto += monto
    }

    fun extraer(monto: Float){
        this.monto -= monto
    }

    fun imprimir(){
        println("El Cliente $nombre tiene $ $monto en su cuenta")
    }
}

class Banco(){
    var cliente1 = Cliente("Juan", 0f)
    var cliente2 = Cliente("Pedro", 0f)
    var cliente3 = Cliente("Ana", 0f)

    fun operar(){
        cliente1.depositar(100f)
        cliente2.depositar(150f)
        cliente3.depositar(200f)
        cliente3.extraer(150f)
    }

    fun depositosTotales(){
        println("El total del dinero del banco es: $ ${cliente1.monto + cliente2.monto + cliente3.monto}")
        cliente1.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()
    }

}

fun main(args: Array<String>) {
    val banco1 = Banco()
    banco1.operar()
    banco1.depositosTotales()
}

