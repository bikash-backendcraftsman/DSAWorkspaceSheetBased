package corejava.exceptionhandling.demo.overridingExceptionRule.rule2.realProjectRule2Implementation;

import javax.swing.text.Document;
import java.io.IOException;


/**
 * ✔ This is allowed
 * ✔ Interface declared checked exception
 * ✔ Implementation chose unchecked
 */


public interface DocumentService {
    Document getDocument(String id) throws IOException;
}

