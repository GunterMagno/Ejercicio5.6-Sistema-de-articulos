
fun main() {

    val articulos = listOf(
        Articulo("Libro", 25.0),
        Articulo("Revista", 45.0),
        Ordenador("PC Gaming", 1299.99, TipoOrdenador.GAMING),
        Ordenador("PC Básico", 399.99, TipoOrdenador.BASICO)
    )

    for (articulo in articulos) {
        articulo.promocionNavidad(10.0)
        println(articulo)
    }
}
