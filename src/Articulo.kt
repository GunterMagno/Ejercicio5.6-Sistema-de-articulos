
open class Articulo(var nombre: String, var precio: Double) {
    private val id: Int = generarId()
    private var descuentoAplicado: Double = 0.0

    companion object {
        private var totalArticulos = 0
        private fun generarId() = ++totalArticulos
    }

    open fun promocionNavidad(porcentaje: Double) {
        val descuento = precio * (porcentaje / 100)
        precio -= descuento
        descuentoAplicado = descuento
    }

    fun obtenerDescuento(): Double = descuentoAplicado

    override fun toString(): String {
        return "$nombre - %.2f€ (ID: $id, Descuento: %.2f€)".format(precio, descuentoAplicado)
    }
}
