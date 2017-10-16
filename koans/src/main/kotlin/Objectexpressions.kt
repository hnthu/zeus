/*Read about object expressions that play the same role in Kotlin as anonymous classes in Java.

Add an object expression that provides a comparator to sort a list in a descending order using java.util.Collections class.
In Kotlin you use Kotlin library extensions instead of java.util.Collections, but this example is still a good demonstration of mixing Kotlin and Java code.

CheckRevertHide answer
Collections.sort(arrayList, object : Comparator<Int> {
    override fun compare(x: Int, y: Int) = y - x
})*/

import org.junit.Test
import org.junit.Assert
import java.util.*

class TestObjectExpressions {
    @Test fun testSort() {
        Assert.assertEquals("getList", listOf(5, 2, 1), getList())
    }


    fun getList(): List<Int> {
        val arrayList = arrayListOf(1, 5, 2)
        Collections.sort(arrayList, object: Comparator<Int>{
            override fun compare(o1: Int, o2: Int): Int=o2-o1
        })
        return arrayList
    }
}
