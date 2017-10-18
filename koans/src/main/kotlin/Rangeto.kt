/*Implement the function MyDate.rangeTo(). This allows you to create a range of dates using the following syntax:

MyDate(2015, 5, 11)..MyDate(2015, 5, 12)
Note that now the class DateRange implements the standard ClosedRange interface and inherits contains method implementation.
*/
import org.junit.Assert
import org.junit.Test
import java.util.ArrayList

class TestRangeTo {
    fun doTest(date: MyDate, first: MyDate, last: MyDate, shouldBeInRange: Boolean) {
        val message = "${date} should${if (shouldBeInRange) "" else "n't"} be in range: ${first}..${last}"
        Assert.assertEquals(message, shouldBeInRange, checkInRange(date, first, last))
    }

    @Test fun testInRange() {
        doTest(MyDate(2014, 3, 22), MyDate(2014, 1, 1), MyDate(2015, 1, 1), shouldBeInRange = true)
    }

    operator fun MyDate.rangeTo(other: MyDate) = DateRange(this,other)

    class DateRange(override val start: MyDate, override val endInclusive: MyDate): ClosedRange<MyDate>

    fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
        return date in first..last
    }
    data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
        override fun compareTo(other: MyDate) = when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }
    }
}
