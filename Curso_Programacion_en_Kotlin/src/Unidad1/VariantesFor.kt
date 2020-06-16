/**
 * Created by Joaquín Parrilla on 07/02/2020.
 * Clase 4: Variantes del FOR en Kotlin
 * Página del teórico: 54-55
 *
 * <>
 */

fun main(args:Array<String>){
    variantes()
    //Nota : hacer mas ejercicios de For
}

fun variantes(){
    // Si necesitamos que la variable del for no reciba todos los valores comprendidos en el rango
    //sino que avance de 2 en 2 podemos utilizar la siguiente sintaxis:
    for(i in 1..10 step 2)
        println(i)  //Se imprimen los valores 1, 3, 5, 7, 9

    // Si necesitamos que la variable tome el valor 10, luego el 9 y así sucesivamente, es decir en
    //forma inversa debemos utilizar la siguiente sintaxis:
    for(i in 10 downTo 1)
        println(i)  // Se imprimen los valores 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

    // Tambien se puede usar el step y el downTo combinados :
    for(i in 10 downTo 1 step 2)
        println(i)  // Se imprimen los valores: 10, 8, 6, 4, 2

}