import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GestorEstudiantesTest {

    @Test
    fun `agregar estudiantes y calcular promedio`() {
        val gestor = GestorEstudiantes()

        gestor.agregarEstudiante("Ana", doubleArrayOf(4.0, 4.5, 5.0))
        gestor.agregarEstudiante("Juan", doubleArrayOf(3.5, 3.0, 4.0))

        val estudiantesOrdenados = gestor.obtenerEstudiantesOrdenadosPorPromedio()

        // Verificar la cantidad de estudiantes
        assertEquals(2, estudiantesOrdenados.size)

        // Verificar el orden de los estudiantes
        assertEquals("Ana", estudiantesOrdenados[0].nombre)
        assertEquals("Juan", estudiantesOrdenados[1].nombre)

        // Verificar los promedios
        assertEquals(4.5, estudiantesOrdenados[0].calcularPromedio())
        assertEquals(3.5, estudiantesOrdenados[1].calcularPromedio())
    }
}
