import org.junit.Assert
import org.junit.Test
import java.util.Calendar
class TestOperatorsOverloading {
    @Test fun testAddOneTimeInterval() {
        Assert.assertEquals("task1", MyDate(2015, 5, 8), task1(MyDate(2014, 5, 1)))
    }

    @Test fun testOneMonth() {
        Assert.assertEquals("task2", MyDate(2016, 0, 27), task2(MyDate(2014, 0, 1)))
    }

    @Test fun testMonthChange() {
        Assert.assertEquals("task2", MyDate(2016, 1, 20), task2(MyDate(2014, 0, 25)))
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

    data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

    enum class TimeInterval { DAY, WEEK, YEAR }

    operator fun MyDate.plus(timeInterval: TimeInterval) = addTimeIntervals(timeInterval, 1)

    class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)
    operator fun TimeInterval.times(number: Int) = RepeatedTimeInterval(this, number)

    operator fun MyDate.plus(timeIntervals: RepeatedTimeInterval) = addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

    fun task1(today: MyDate): MyDate {
        return today + TimeInterval.YEAR + TimeInterval.WEEK
    }

    fun task2(today: MyDate): MyDate {
        return today + TimeInterval.YEAR * 2 + TimeInterval.WEEK * 3 + TimeInterval.DAY * 5
    }
}
