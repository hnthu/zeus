/*Kotlin for loop iterates through anything that provides an iterator.
Make the class DateRange implement Iterable<MyDate>, so that it could be iterated over.
You can use the function MyDate.nextDay() defined in DateUtil.kt*/

import org.junit.Assert
import org.junit.Test
import java.util.*

class TestForLoop {
    class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate>{
        override fun iterator(): Iterator<MyDate> = DateIterator(this)
    }



    fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
        for (date in firstDate..secondDate) {
            handler(date)
        }
    }
    @Test fun testIterateOverDateRange() {
        val actualDateRange = arrayListOf<MyDate>()
        iterateOverDateRange(MyDate(2016, 5, 1), MyDate(2016, 5, 5), {
            date-> actualDateRange.add(date)
        })
        val expectedDateRange = arrayListOf(
                MyDate(2016, 5, 1), MyDate(2016, 5, 2), MyDate(2016, 5, 3), MyDate(2016, 5, 4), MyDate(2016, 5, 5))
        Assert.assertEquals("Incorrect iteration over five nice spring dates",expectedDateRange, actualDateRange)
    }

    @Test fun testIterateOverEmptyRange() {
        var invoked = false
        iterateOverDateRange(MyDate(2016, 1, 1), MyDate(2015, 1, 1), { invoked = true })
        Assert.assertFalse("Handler was invoked on an empty range", invoked)
    }

    data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
        fun nextDay() = addTimeIntervals(TimeInterval.DAY, 1)
        override fun compareTo(other: MyDate) = when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }
        fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int): MyDate {
            val c = Calendar.getInstance()
            c.set(year, month, dayOfMonth)
            when (timeInterval) {
                TimeInterval.DAY -> c.add(Calendar.DAY_OF_MONTH, number)
                TimeInterval.WEEK -> c.add(Calendar.WEEK_OF_MONTH, number)
                TimeInterval.YEAR -> c.add(Calendar.YEAR, number)
            }
            return MyDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))
        }
        enum class TimeInterval {
            DAY,
            WEEK,
            YEAR
        }
    }

    operator fun MyDate.rangeTo(other: MyDate) = DateRange(this, other)

    class DateIterator(val dateRange:DateRange) : Iterator<MyDate> {
        var current: MyDate = dateRange.start
        override fun next(): MyDate {
            val result = current
            current = current.nextDay()
            return result
        }
        override fun hasNext(): Boolean = current <= dateRange.end
    }
}
