class GestorEstudiantes {
    private val listaEstudiantes = mutableListOf<Estudiante>()

    fun agregarEstudiante(nombre: String, notas: DoubleArray) {
        listaEstudiantes.add(Estudiante(nombre, notas))
    }

    fun obtenerEstudiantesOrdenadosPorPromedio(): List<Estudiante> {
        return listaEstudiantes.sortedByDescending { it.calcularPromedio() }
    }
}
