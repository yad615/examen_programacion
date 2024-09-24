package com.alcantara.yadhira.laboratoriocalificado01
import org.junit.Test

class Ejercicio01Kotlin {

    // Función que realiza el conteo de frecuencia de caracteres en una palabra
    fun contarFrecuenciaCaracteres(palabra: String): Map<Char, Int> {
        val frecuencia = mutableMapOf<Char, Int>()
        for (caracter in palabra) {
            frecuencia[caracter] = frecuencia.getOrDefault(caracter, 0) + 1
        }
        return frecuencia
    }

    @Test
    fun testContarFrecuenciaCaracteres() {
        val ejercicio = Ejercicio01Kotlin()

        // Usa un valor predeterminado en lugar de readLine()
        val palabraIngresada = "hello" // Valor predeterminado para la prueba
        val resultado = ejercicio.contarFrecuenciaCaracteres(palabraIngresada)

        // Comprobación manual del resultado
        if (resultado['h'] != 1 || resultado['e'] != 1 || resultado['l'] != 2 || resultado['o'] != 1) {
            throw AssertionError("Error: Resultado incorrecto para la palabra 'hello'")
        }

        // Mensaje opcional para indicar que la prueba pasó
        println("Prueba pasada correctamente palabra '$palabraIngresada'")
        println("Frecuencia de caracteres '$palabraIngresada': $resultado")
    }
}
