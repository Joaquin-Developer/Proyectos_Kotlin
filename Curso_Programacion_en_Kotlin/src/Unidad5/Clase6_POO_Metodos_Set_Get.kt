package Unidad5
/**
 * Created by Joaquín Parrilla on 18/06/2020.
 * Clase 6: POO en Kotlin: Métodos Getters y Setters
 * Página del teórico: inicia en 136
 * Temas:
 *      Programación Orientada a Objetos
 *      get
 *      set
 * <>
Hemos visto que cuando definimos una propiedad pública podemos acceder a su
contenido para modificarla o consultarla desde donde definimos un objeto.
A una propiedad podemos asociarle un método llamado set en el momento que se le asigne
un valor y otro método llamado get cuando se accede al contenido de la propiedad.
Estos métodos son opcionales y nos permiten validar el dato a asignar a la propiedad o el
valor de retorno.
Cuando no se implementan estos métodos el mismo compilador crea estos dos métodos por
defecto.
todo| Ejercicio:
Declarar una clase llamada persona con dos propiedades que almacenen el nombre y la
edad de la persona. En la propiedad nombre almacenar siempre en mayúscula el nombre y
cuando se recupere su valor retornarlo entre paréntesis, también controlar que no se pueda
ingresar una edad con valor negativo, en dicho caso almacenar un cero.
 **/

class persona{

    var nombre: String = ""
    set(value) {
        field = value.toUpperCase()
    }
    get(){
        return "("+field+")"
        // (unNombre)
    }

    var e: Int = 0
    set(value) {
        if(value > 0)
            field = value
        else
            field = 0
    }

}

fun main(args: Array<String>) {
    val persona1 = persona()
    persona1.nombre = "Juan Perez"
    persona1.e = 24
    println(persona1.nombre)  //Juan Perez
    println(persona1.e)   //24
    val persona2 = persona()
    persona2.nombre = "Jose Gervasio"
    persona2.e = -43
    println(persona2.nombre)  //Jose Gervasio
    println(persona2.e)   //0

}