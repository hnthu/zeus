import org.junit.Test
import org.junit.Assert
/*Read about extension functions. Then implement extension functions Int.r() and Pair.r() and make them convert Int and Pair to RationalNumber.*/
class TestExtensionFunctions() {
    @Test fun testIntExtension() {
        Assert.assertEquals("Rational number creation error: ", RationalNumber(4, 1), 4.r())
    }

    @Test fun testPairExtension() {
        Assert.assertEquals("Rational number creation error: ", RationalNumber(2, 3), Pair(2, 3).r())
    }
    fun Int.r(): RationalNumber = RationalNumber(this,1)
    fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first,this.second)

    data class RationalNumber(val numerator: Int, val denominator: Int)
}