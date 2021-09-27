class SalesByMatch {

    fun sockMerchant(n: Int, ar: Array<Int>): Int {
        return ar
            .groupBy { it }
            .filter { it.value.size >= 2 }
            .map { count(it.value) }
            .fold(0) { prev, next -> prev + next }
    }

    private fun count(value: List<Int>) =
        if (value.size % 2 == 0) {
            value.size / 2
        } else {
            (value.size - 1) / 2
        }
}