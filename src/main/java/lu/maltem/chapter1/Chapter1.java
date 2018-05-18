package lu.maltem.chapter1;

import lu.maltem.chapter1.animals.Animal;

/**
 * A class has : <br />
 * <ul>
 *     <li>a visibility keyword : public, protected, Ø (package-protected), private</li>
 *     <li>a type : class, abstract class, interface, ...</li>
 *     <li>a name : (Starting with an Uppercase and then camelCase : Chapter1 </li>
 * </ul>
 *
 */
public class Chapter1 {

    // This is a constant (remember static + final)
    private static final String DEFAULT_NAME = "Chapter 1 - Default";

    // The following 2 lines are member fields or variables. The second one is assigned at Class Loading
    private String name;
    private int chapterNumber = 0;

    /*
        A class may have constructors for its instantiation.
        (Constructors have a visibility/scope then has the same name as the Class itself)
        But by default, if you omit the constructor, the JVM creates an empty one such as :
        public Chapter1() { // Default constructor}

        Be careful, in our example, we declared a constructor with one parameter (name).
        Indeed, if a constructor is declared, the JVM will NOT create an empty one.
        If you still want to use the empty one, you must rewrite it. (see below)
     */

    public Chapter1() {
        /*
        We want this constructor to be available in our application.
        And because we have another one with a parameter, we need to declare this one.
         */
        this.name = Chapter1.DEFAULT_NAME;
    }

    /**
     * This is a constructor of the Chapter1 class
     * @param name The name parameter to give to this chapter
     */
    public Chapter1(String name) {
        // We assign the given parameter name to the instance field this.name (this stands for current instance)
        this.name = name;
        // We assign 1 to the instance field "chapterNumber"
        this.chapterNumber = 1;
    }

    /*
    The Following 4 methods are called "Field Accessors". There are Getters and Setters.
    Getters return the type of the field we want to Get.
    Setters take a parameter of type of the field we want to Set. And assign the new value to our member field
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public void process() {
        runExercise1();
    }

    /**
     * This method resumes what we discussed about into Chapter 1
     * it is :
     * <ul>
     *     <li>a scope keyword</li>
     *     <li>a return type</li>
     *     <li>a method name, camelCase only</li>
     *     <li>some parameters or not into parenthesis</li>
     * </ul>
     */
    private void runExercise1() {

        // This is a single line comment

        /*
            And this is a double line comment
         */

        // If you want to write to console output, this is not a good solution, but a beginning, later you MUST not use this !!
        System.out.println("My Text to OutPut in standard console output");
        System.err.println("My Text to OutPut in error console output");

        /*
        If two classes have the same name, they must be in separated folders
        Then you have several possibilities :
            - Either import one, to call it directly and call the other by its full package name declaration (this is what we have here)
            - Or do not import any, and them by their full package name declarations.
        There is no solution better than the other. I, personally prefer the first one for more readability in my code. Importing the class I use more.
         */
        Animal dog = new Animal();
        lu.maltem.chapter1.animals2.Animal cat = new lu.maltem.chapter1.animals2.Animal();

    }
}
