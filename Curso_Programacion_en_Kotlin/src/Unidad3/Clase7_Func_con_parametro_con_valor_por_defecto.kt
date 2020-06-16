package Unidad3

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 7: Funciones con parámetros con valor por defecto
 * Página del teórico: inicia en 85
 * Temas:
 *      Funciones con parámetros con valor por defecto
 * <>
 * En Kotlin se pueden definir parámetros y asignarles un dato en la misma cabecera de la
    función. Luego cuando llamamos a la función podemos o no enviarle un valor al parámetro.
    Los parámetros por defecto nos permiten crear funciones más flexibles y que se pueden
    emplear en distintas circunstancias.
 * Ejercicio 1:
    Confeccionar una función que reciba un String como parámetro y en forma opcional un
    segundo String con un caracter. La función debe mostrar el String subrayado con el caracter
    que indica el segundo parámetro
 */
fun main(args:Array<String>){
    subrayado("Programación en Kotlin")
    subrayado("Programación Android", "-")
}

private fun subrayado(titulo:String, caracter:String = "*"){
    //por defecto el parámetro caracter será: *
    println(titulo)
    for(i in 1..titulo.length)
        print(caracter)
    println()
}