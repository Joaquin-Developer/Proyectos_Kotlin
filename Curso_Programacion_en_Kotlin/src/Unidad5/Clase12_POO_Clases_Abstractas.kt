package Unidad5
/**
 * Created by Joaquín Parrilla on 19/06/2020.
 * Clase 12: POO en Kotlin: Herencia - Clases Abstractas
 * Página del teórico: inicia en 162
 * Temas:
 *      Programación Orientada a Objetos
 *      Herencia
 *      Clases Abstractas
 * <>
En algunas situaciones tenemos métodos y propiedades comunes a un conjunto de clases,
podemos agrupar dichos métodos y propiedades en una clase abstracta.
Hay una sintaxis especial en Kotlin para indicar que una clase es abstracta.
No se pueden definir objetos de una clase abstracta y seguramente será heredada por otras
clases de las que si podremos definir objetos.
todo    Ejercicio: Declarar una clase abstracta que represente una Operación. Definir en la misma tres
todo    propiedades valor1, valor2 y resultado, y dos métodos: calcular e imprimir.
todo    Plantear dos clases llamadas Suma y Resta que hereden de la clase Operación.
 **/

abstract class oper(val valor1: Int, val valor2: Int){
    protected var resultado: Int = 0

    abstract fun operar()

    fun imprime() {
        println("Resultado: $resultado")
    }

}

class Suma(valor1: Int, valor2: Int): oper(valor1, valor2) {
    override fun operar() {
        resultado = (valor1 + valor2)
    }
}

class Resta(valor1: Int, valor2: Int): oper(valor1, valor2){
    override fun operar(){
        resultado = (valor1 - valor2)
    }
}

private fun main(args: Array<String>) {
    val suma1 = Suma(10, 4)
    suma1.operar()
    suma1.imprime()
    val resta1 = Resta(12, 15)
    resta1.operar()
    resta1.imprime()
}

//todo Segundo problema propuesto:
// Declarar una clase abstracta Cuenta y dos subclases CajaAhorra y PlazoFijo. Definir
// las propiedades y métodos comunes entre una caja de ahorro y un plazo fijo y
// agruparlos en la clase Cuenta.
// Una caja de ahorro y un plazo fijo tienen un nombre de titular y un monto. Un plazo fijo
// añade un plazo de imposición en días y una tasa de interés. Hacer que la caja de
// ahorro no genera intereses.
// En la función main del programa definir un objeto de la clase CajaAhorro y otro de la
// clase PlazoFijo.

abstract class Cuenta(val titular: String, val monto: Double){

    open fun imprimir() = println("Titular: $titular\nMonto: $monto")
}

class CajaAhorro(titular:String, monto:Double): Cuenta(titular, monto){
    override fun imprimir(){
        println("Cuenta de Caja de Ahorro")
        super.imprimir()
    }
}

class PlazoFijo(titular: String, monto: Double, val plazo: Int, val interes: Double): Cuenta(titular, monto) {
    override fun imprimir() {
        println("Cuenta de plazo fijo")
        println("Plazo en dias: $plazo")
        println("Intereses: $interes")
        println("Importe del interes: ${(monto * interes) / 100}")
        super.imprimir()
    }
}

//fun main(args: Array<String>) {
//    val cajaAhorro1 = CajaAhorro("juan", 10000.0)
//    cajaAhorro1.imprimir()
//    val plazoFijo1 = PlazoFijo("Ana", 5000.0, 30, 1.23)
//    plazoFijo1.imprimir()
//}
