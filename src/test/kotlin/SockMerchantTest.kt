import org.junit.Assert
import org.junit.Test

internal class SockMerchantTest {

    @Test
    fun sockMerchant1() {
        val expected = 3

        val input = arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)
        val actual = SalesByMatch().sockMerchant(input.size, input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun sockMerchant2() {
        val expected = 4

        val input = arrayOf(1, 1, 3, 1, 2, 1, 3, 3, 3, 3)
        val actual = SalesByMatch().sockMerchant(input.size, input)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun sockMerchant3() {
        val expected = 0

        val input = arrayOf(100)
        val actual = SalesByMatch().sockMerchant(input.size, input)

        Assert.assertEquals(expected, actual)
    }
}