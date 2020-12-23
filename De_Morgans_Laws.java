package Chapter5;
//5.23 (De Morgan’s Laws) In this chapter, we discussed the logical operators && , & , || , | , ^ and ! .
//        De Morgan’s laws can sometimes make it more convenient for us to express a logical expression.
//        These laws state that the expression !( condition1 && condition2 ) is logically equivalent to the expres-
//        sion (! condition1 || ! condition2 ) . Also, the expression !( condition1 || condition2 ) is logically
//        equivalent to the expression (! condition1 && ! condition2 ) . Use De Morgan’s laws to write equivalent
//        expressions for each of the following, then write an application to show that both the original ex-
//        pression and the new expression in each case produce the same value:
//        a) !(x < 5) && !(y >= 7)
//        b) !(a == b) || !(g != 5)
//        c) !((x <= 8) && (y > 4))
//        d) !((i > 4) || (j <= 6))
public class De_Morgans_Laws {
    int x = 1;
    int y = 2;
    int a = 3;
    int b = 4;
    int g = 5;
    int i = 6;
    int j = 7;

    boolean condition1 = !(x < 5) && !(y >= 7);
    boolean condition1New = !((x < 5) || (y >= 7));

    boolean condition2 = !(a == b) || !(g != 5);
    boolean condition2New = !((a == b) && (g != 5));

    boolean condition3 = !((x <= 8) && (y > 4));
    boolean condition3New = !(x <= 8) || !(y > 4);

    boolean condition4 = !((i > 4) || (j <= 6));
    boolean condition4New = !(i > 4) && !(j <= 6);


    public boolean expressionMethod1() {
    if(condition1==condition1New){
        System.out.println("De Morgan's Law equivalent IS the same as original for expression (a)");
    }else{
        System.out.println("De Morgan's Law equivalent IS NOT the same as original for expression (a)");
    }
        return false;
    }

    public boolean expressionMethod2() {
        if(condition2==condition2New){
            System.out.println("De Morgan's Law equivalent IS the same as original for expression (b)");
        }else{
            System.out.println("De Morgan's Law equivalent IS NOT the same as original for expression (b)");
        }
        return false;
    }


    public boolean expressionMethod3() {
        if(condition3==condition3New){
            System.out.println("De Morgan's Law equivalent IS the same as original for expression (c)");
        }else{
            System.out.println("De Morgan's Law equivalent IS NOT the same as original for expression (c)");
        }
        return false;
    }


    public boolean expressionMethod4() {
        if(condition4==condition4New){
            System.out.println("De Morgan's Law equivalent IS the same as original for expression (d)");
        }else{
            System.out.println("De Morgan's Law equivalent IS NOT the same as original for expression (d)");
        }
        return false;
    }


    public static void main(String[] args) {
        De_Morgans_Laws de_morgans_laws = new De_Morgans_Laws();

        de_morgans_laws.expressionMethod1();
        de_morgans_laws.expressionMethod2();
        de_morgans_laws.expressionMethod3();
        de_morgans_laws.expressionMethod4();
    }



}


