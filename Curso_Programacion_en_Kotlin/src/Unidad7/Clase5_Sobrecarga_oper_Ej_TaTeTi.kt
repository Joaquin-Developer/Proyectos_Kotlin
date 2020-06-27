package Unidad7
/**
 * Created by JoaquínParrilla on 26/06/2020.
 * Clase 5: Sobrecarga de Operadores - Ejercicio 5
 * Página del teórico: inicia en 216
 * Temas:
 *      Sobrecarga de Operadores
 *      Ejercicio 5
 * <>
Ejercicio 5:
    Implementar una clase TaTeTi que defina una propiedad para el tablero que sea un IntArray
    de 9 elementos con valor cero.
    Hay dos jugadores que disponen fichas, el primer jugador carga el 1 y el segundo carga un 2.
    Mediante sobrecarga de operadores de subíndices permitir asignar la fichas a cada posición
    del tablero mediante dos subíndices que indiquen la fila y columna del tablero.
 **/

class Tateti{

    val array: IntArray = IntArray(9)

    fun iniciarArray(){
        for (i in array.indices)
            array[i] = 0
    }

    fun imprimirArray(){
        for(i in array.indices){
            if(i == 2 || i == 5 || i == 8)
                println("${array[i]}")
            else
                print("${array[i]} ")
        }
    }

    operator fun set(fila: Int, col: Int, valor: Int){
        // formula: (3f + c = valor)
        array[fila * 3 + col] = valor
    }

    operator fun get(fila: Int, col: Int): Int{
        // retorna valor de la posición del array: Array[n]
        return array[fila * 3 + col]
    }

}

fun main(args: Array<String>) {
    val juego = Tateti()
    juego.iniciarArray()
    juego[0, 0] = 1
    juego[0, 2] = 2
    juego[2, 0] = 1
    juego[1, 2] = 2
    juego[1, 0] = 1
    juego.imprimirArray()

}

