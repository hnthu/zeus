import org.junit.Test
import org.junit.Assert
import java.util.regex.Pattern
/*Read about different string literals and string templates in Kotlin.

Raw strings are useful for writing regex patterns, you don't need to escape a backslash by a backslash. Below there is a pattern
that matches a date in format 13.06.1992 (two digits, a dot, two digits, a dot, four digits):

fun getPattern() = """\d{2}\.\d{2}\.\d{4}"""
Using month variable rewrite this pattern in such a way that it matches the date in format 13 JUN 1992 (two digits, a whitespace, a month abbreviation, a whitespace, four digits).
*/
class TestStringTemplates() {
    private fun testMatch(date: String) = Assert.assertTrue("The pattern should match $date", date.matches(getPattern().toRegex()))
    private fun testMismatch(date: String) = Assert.assertFalse("The pattern shouldn't match $date", date.matches(getPattern().toRegex()))

    @Test fun match() {
        testMatch("11 MAR 1952")
    }

    @Test fun match1() {
        testMatch("24 AUG 1957")
    }

    @Test fun doNotMatch() {
        testMismatch("24 RRR 1957")
    }
    val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

    fun getPattern(): String = """\d{2} ${month} \d{4}"""
}