public class VariableScope {
    /**
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 20;
        int result;
        boolean someCondition = true;

        result = someCondition ? value1 : value2; // result will be value1 (10)
        System.out.println(result);
    }
}