fun main() {
    val listaEstudiantes = mutableListOf<Estudiante>()

    println("¿Cuántos estudiantes hay en el aula?")
    val numeroEstudiantes = readLine()?.toIntOrNull() ?: return

    for (i in 1..numeroEstudiantes) {
        println("Ingresa el nombre del estudiante $i:")
        val nombre = readLine() ?: continue

        println("Ingresa las tres notas del estudiante $nombre:")
        val notas = DoubleArray(3)
        for (j in 0 until 3) {
            println("Nota ${j + 1}:")
            notas[j] = readLine()?.toDoubleOrNull() ?: 0.0
        }

        listaEstudiantes.add(Estudiante(nombre, notas))
    }

    val estudiantesOrdenados = listaEstudiantes.sortedByDescending { it.calcularPromedio() }

    println("\nEstudiantes ordenados por promedio de mayor a menor:")
    estudiantesOrdenados.forEachIndexed { index, estudiante ->
        println("${index + 1}. ${estudiante.nombre} - Promedio: ${"%.2f".format(estudiante.calcularPromedio())}")
    }
}
