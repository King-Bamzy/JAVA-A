package Java2Session3;

import java.util.function.IntConsumer;
import java. util. stream. IntStream;
public class Tester1 {
public static void main (String [ ] args) {
IntStream. iterate (4, x->x<11, x->x+4) .forEach ((IntConsumer) System. out: :println):

}
}