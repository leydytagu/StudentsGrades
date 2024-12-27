data class Estudiante(val nombre: String, val notas: DoubleArray) {
    fun calcularPromedio(): Double {
        return notas.average()
    }
}
