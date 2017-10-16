import org.junit.Test
import org.junit.Assert
/*Rewrite the following Java code using smart casts and when expression:

public int eval(Expr expr) {
    if (expr instanceof Num) {
        return ((Num) expr).getValue();
    }
    if (expr instanceof Sum) {
        Sum sum = (Sum) expr;
        return eval(sum.getLeft()) + eval(sum.getRight());
    }
    throw new IllegalArgumentException("Unknown expression");
}*/
class TestSmartCasts {
    @Test fun testNum() {
        Assert.assertEquals("'eval' on Num should work:", 2, eval(Num(2)))
    }

    @Test fun testSum() {
        Assert.assertEquals("'eval' on Sum should work:", 3, eval(Sum(Num(2), Num(1))))
    }

    @Test fun testRecursion() {
        Assert.assertEquals("'eval' should work:", 6, eval(Sum(Sum(Num(1), Num(2)), Num(3))))
    }
    fun eval(expr: Expr): Int =
            when (expr) {
                is Num -> expr.value
                is Sum -> eval(expr.left)+eval(expr.right)
                else -> {
                    throw IllegalArgumentException("Unknown expression")
                }
            }

    interface Expr
    class Num(val value: Int) : Expr
    class Sum(val left: Expr, val right: Expr) : Expr

}