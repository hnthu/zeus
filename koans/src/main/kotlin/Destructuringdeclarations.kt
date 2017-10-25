import org.junit.Assert
import org.junit.Test
/*Read about destructuring declarations and make the following code compile by adding one word.*/
class TestMultiAssignment {
    @Test fun testIsLeapDay() {
        Assert.assertTrue("The test failed", isLeapDay(MyDate1(2016, 2, 29)))
        Assert.assertFalse("The test failed", isLeapDay(MyDate1(2015, 2, 29)))
    }

}
class MyDate1(val year: Int, val month: Int, val dayOfMonth: Int) {
    operator fun component1()= year
    operator fun component2()= month
    operator fun component3()= dayOfMonth
}

fun isLeapDay(date: MyDate1): Boolean {

    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}