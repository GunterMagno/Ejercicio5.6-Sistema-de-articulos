
fun main() {

    val articulo1 = Articulo("Libro", 25.0)
    val articulo2 = Articulo("Revista", 45.0)
    val ordenador1 = Ordenador("PC Gaming", 1299.99, TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("PC Básico", 399.99, TipoOrdenador.BASICO)

    val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)

    for (articulo in articulos) {
        articulo.promocionNavidad(10.0)
        println(articulo)
    }
}

/*
¿De qué tipo genera la lista el compilador?

El compilador la define como List<Articulo>, ya que Ordenador hereda de Articulo y los articulos son directamente creados desde la clase Articulo.

¿Qué ocurre con el polimorfismo en este caso?
promocionNavidad() se comporta diferente según el tipo de objeto. En Ordenador solo se aplica si el precio es mayor a 500 y en Articulo siempre se aplica.

¿Qué pasaría con listOf<Ordenador>?

Solo podríamos meter ordenadores, dejando fuera los otros articulos y cualquier otro tipo de objeto.

¿Y con listOf<Any>?

Podríamos mezclar distintos tipos de objetos, pero perderíamos acceso directo a los métodos de Articulo sin hacer un casting.

*/