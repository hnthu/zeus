import org.junit.Assert
import org.junit.Test

class TestComparison {

    @Test fun testBefore() {
        val first = MyDate(2014, 5, 10)
        val second = MyDate(2014, 7, 11)
        Assert.assertTrue("compareTo" + ": ${first} should go before ${second}", first < second)
    }

    @Test fun testAfter() {
        val first = MyDate(2014, 10, 20)
        val second = MyDate(2014, 7, 11)
        Assert.assertTrue("compareTo" + ": ${first} should go after ${second}", first > second)
    }

    data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {

    }

    fun compare(date1: MyDate, date2: MyDate) = date1 < date2
}