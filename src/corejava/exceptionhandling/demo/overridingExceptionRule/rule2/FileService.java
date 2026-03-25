package corejava.exceptionhandling.demo.overridingExceptionRule.rule2;

import java.io.IOException;

public class FileService {

    /**
     * 🔹 Rule 2 (in simple words)
     *
     * If a superclass method declares a checked exception, the overriding method:
     *
     * 	•	✅ Can declare the same checked exception
     * 	•	✅ Can declare a narrower (subclass) checked exception
     * 	•	✅ Can declare no checked exception
     * 	•	✅ Can declare any unchecked (Runtime) exception
     * 	•	❌ Cannot declare a broader or new checked exception
     *
     * Why?
     * Because polymorphism:
     * 👉 Code using the parent class should never be forced to handle new checked exceptions.
     * @throws IOException
     */
    public void readFileInformation() throws IOException {
        System.out.println("Reading File Content");
    }
}
