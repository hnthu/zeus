import org.junit.Assert
import org.junit.Test
/*Objects with invoke() method can be invoked as a function.

You can add invoke extension for any class, but it's better not to overuse it:

fun Int.invoke() { println(this) }

1() //huh?..
Implement the function Invokable.invoke() so it would count a number of invocations.
*/
class TestInvoke {
    @Test fun testInvokeTwice() = testInvokable(2, ::invokeTwice)

    private fun testInvokable(numberOfInvocations: Int, invokeSeveralTimes: (Invokable) -> Invokable) {
        val invokable = Invokable()
        val message = "The number of invocations is incorrect"
        Assert.assertEquals(message, numberOfInvocations, invokeSeveralTimes(invokable).numberOfInvocations)
    }

    @Test fun testNumberOfInvocations() {
        testInvokable(1) { it() }
        testInvokable(5) { it()()()()() }
        testInvokable(0) { it }
    }
}
class Invokable {
    var numberOfInvocations: Int = 0
        private set
    operator fun invoke(): Invokable {
        numberOfInvocations++
        return this
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()