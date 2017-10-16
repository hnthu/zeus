/*We have a handy tool for Java developers: Java to Kotlin converter. It works better in IntelliJ IDEA, but you can try it online as well. To become familiar with it, please convert the code below. Copy Java code, choose 'Convert from Java' above and copy the result function back.

public class JavaCode {
    public String toJSON(Collection<Integer> collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            sb.append(element);
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}*/

import org.junit.Test
import org.junit.Assert

class TestFunctions() {
    @Test fun collection() {
        Assert.assertEquals("", "[1, 2, 3, 42, 555]", toJSON(listOf(1, 2, 3, 42, 555)))
    }
}
fun toJSON(collection:Collection<Int>):String {
    val sb = StringBuilder()
    sb.append("[")
    val iterator = collection.iterator()
    while (iterator.hasNext())
    {
        val element = iterator.next()
        sb.append(element)
        if (iterator.hasNext())
        {
            sb.append(", ")
        }
    }
    sb.append("]")
    return sb.toString()
}