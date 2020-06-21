package Unidad5
/**
 * Created by JoaquínParrilla on 20/06/2020.
 * Clase 13: POO en Kotlin: Interfaces
 * Página del teórico: inicia en 165
 * Temas:
 *      Programación Orientada a Objetos
 *      Interfaces
 * <>
INTERFACES:
Una interface declara una serie de métodos y propiedades que deben ser implementados
luego por una o más clases, también una interface en Kotlin puede tener implementado
métodos.
Las interfaces vienen a suplir la imposibilidad de herencia múltiple en Kotlin.
Se utiliza la misma sintaxis que la herencia para indicar que una clase implementa una
interface.
Por ejemplo podemos tener dos clases que representen un avión y un helicóptero. Luego
plantear una interface con un método llamado volar. Las dos clases pueden implementar
dicha interface y codificar el método volar (los algoritmos seguramente sean distintos pero el
comportamiento de volar es común tanto a un avión como un helicóptero)
todo Ejercicio1:
Definir una interface llamada Punto que declare un método llamado imprimir. Luego declarar
dos clases que la implementen
 **/

interface Punto{
    fun imprimir()
}

class PuntoPlano(val x: Int, val y: Int): Punto{    // definimos que la clase implementa la interface, de forma
    override fun imprimir() {                       // similar que cuando implementabamos una Herencia
        println("Punto en el plano: P($x,$y)")
    }
}

class PuntoEspacio(val x: Int, val y: Int, val z: Int): Punto{
    override fun imprimir() {
        println("Punto en el Espacio: E($x,$y,$z)")
    }
}

//fun main(args: Array<String>) {
//    val p = PuntoPlano(2, 4)
//    val e = PuntoEspacio(2, 4, 6)
//    p.imprimir()
//    e.imprimir()
//}
/* ################################################################################################################### */
// PRBLEMA 2:
//Dada la interface figura:
//Definir dos clases que representen un Cuadrado y un Rectángulo.
// Implementar la interface Figura en ambas clases.

interface Figura{
    fun calcularSuperficie(): Int
    fun calcularPerimetro(): Int
    fun tituloResultado(){
        println("Datos de la figura:")
    }
}

class Cuadrado(val lado: Int): Figura{
    override fun calcularPerimetro(): Int {
        return (lado * 4)
    }

    override fun calcularSuperficie(): Int {
        return (lado * lado)
    }
}

class Rectangulo(val ladoMayor: Int, val ladoMenor: Int): Figura{
    override fun calcularPerimetro(): Int {
        return (ladoMayor * 2) + (ladoMenor * 2)
    }

    override fun calcularSuperficie(): Int {
        return (ladoMayor * ladoMenor)
    }
}

fun main(args: Array<String>) {
    var x: Int; val y: Int  // variables para el ingreso de datos
    println("Ingresar lados del cuadrado:")
    x = readLine()!!.toInt()
    val cuadrado1 = Cuadrado(x)
    cuadrado1.tituloResultado()
    println("Perímetro del cuadrado: ${cuadrado1.calcularPerimetro()}")
    println("Área del cuadrado: ${cuadrado1.calcularSuperficie()}")
    println("Ingresar base del rectángulo: ")
    x = readLine()!!.toInt()
    println("Ingresar altura del rectángulo: ")
    y = readLine()!!.toInt()
    val rectang1 = Rectangulo(x, y)
    rectang1.tituloResultado()
    println("Perímetro del rectángulo: ${rectang1.calcularPerimetro()}")
    println("Área del rectángulo: ${rectang1.calcularSuperficie()}")
}
