public class CodeWars_55 {
    public static Integer basicMath(String op, int v1, int v2)
    {
        return op.equals("+")?v1+v2:
                op.equals("-")?v1-v2:
                        op.equals("/")?v1/v2:
                                v1*v2;
    }
}
