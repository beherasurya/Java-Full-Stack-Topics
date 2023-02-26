package LambdaExpression;

import java.util.function.IntPredicate;

public class PredicateEx {
    public static void main(String[] args) {
        IntPredicate predicate =new IntPredicate() {

            @Override
            public boolean test(int value) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'test'");
            }
            
        };
        IntPredicate predicate2 = data-> data<18;

        System.out.println(predicate2.test(10));
    }
}
