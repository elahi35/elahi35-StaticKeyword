public class Runner {
    // Declare a static variable named global_var
    private static String global_var;


    /**
     * This challenge is about interacting with static variables.
     *
     * You task is simply to change the variable global_var to the value of 'in' given in the parameters.
     * As you do so, notice that you're interacting with the CLASS and not an OBJECT. This is because due to the static
     * keyword. The static keyword causes methods and variables to belong to the class definition rather than an
     * object.
     *
     * @param in the String value you should change global_var to in.
     */
    public static void changeClassVar(String in){
        // Change the value of the static variable global_var
        Class.global_var=in;
    }
}
