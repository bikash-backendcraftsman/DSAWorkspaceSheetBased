package corejava.exceptionhandling.demo.overridingExceptionRule.rule2.realProjectRule2Implementation;

import javax.swing.text.Document;
import java.io.IOException;

public class DocumentServiceImpl  implements DocumentService{

    private static Document readFromDisk() throws IOException {
        // file I/O
        return null;
    }

    /**
     * 👉 Rule of thumb
     *
     * If the caller cannot do anything meaningful → use unchecked.
     *
     * @param id
     * @return
     * @throws IOException
     */
    @Override
    public Document getDocument(String id) throws IOException {
        try{
            Document document = readFromDisk();
        }catch (IOException e){
            throw new DocumentRuntimeException("Unable to read document",e);
        }
        return null;
    }

    // very important concept to focus

    /**
     * 2️⃣ Real Project Scenario (Spring Boot – Service Layer)
     * Interface (contract)
     * public interface DocumentService {
     *     Document getDocument(String id) throws IOException;
     * }
     *
     * Implementation – converting checked → unchecked (VERY COMMON)
     * @Service
     * public class DocumentServiceImpl implements DocumentService {
     *
     *     @Override
     *     public Document getDocument(String id) {
     *         try {
     *             return readFromDisk(id);
     *         } catch (IOException ex) {
     *             throw new DocumentReadException("Unable to read document", ex);
     *         }
     *     }
     *
     *     private Document readFromDisk(String id) throws IOException {
     *         // file I/O
     *     }
     * }
     *
     * Custom Runtime Exception
     * public class DocumentReadException extends RuntimeException {
     *     public DocumentReadException(String message, Throwable cause) {
     *         super(message, cause);
     *     }
     * }
     *
     *
     * ✔ This is allowed
     * ✔ Interface declared checked exception
     * ✔ Implementation chose unchecked
     *
     * 3️⃣ When SHOULD you convert Checked → Unchecked?
     * ✅ Convert when:
     * Situation	Reason
     * Technical failures (DB down, IO error)	Caller cannot recover
     * Service layer / business layer	Avoid exception pollution
     * Microservices	Cleaner APIs
     * You want centralized handling	Global exception handler
     *
     * 👉 Rule of thumb
     *
     * If the caller cannot do anything meaningful → use unchecked
     *
     * ❌ Don’t convert when:
     *
     * Caller can recover (retry, alternative path)
     *
     * Validation / user input errors
     *
     * Business rules (use checked or domain exception)
     *
     * 4️⃣ Why Frameworks Prefer Unchecked Exceptions
     *
     * Spring, Hibernate, JPA all throw:
     *
     * DataAccessException
     *
     * JpaSystemException
     *
     * TransactionSystemException
     *
     * 📌 Because:
     *
     * No forced try-catch everywhere
     *
     * Clean service interfaces
     *
     * Centralized handling
     *
     * 5️⃣ Global Exception Handling in Spring Boot
     * @RestControllerAdvice
     * @RestControllerAdvice
     * public class GlobalExceptionHandler {
     *
     *     @ExceptionHandler(DocumentReadException.class)
     *     public ResponseEntity<ApiError> handleDocumentRead(DocumentReadException ex) {
     *         return ResponseEntity
     *                 .status(HttpStatus.INTERNAL_SERVER_ERROR)
     *                 .body(new ApiError("DOC_500", ex.getMessage()));
     *     }
     *
     *     @ExceptionHandler(Exception.class)
     *     public ResponseEntity<ApiError> handleGeneric(Exception ex) {
     *         return ResponseEntity
     *                 .status(HttpStatus.INTERNAL_SERVER_ERROR)
     *                 .body(new ApiError("GEN_500", "Something went wrong"));
     *     }
     * }
     *
     * API Error DTO
     * @Data
     * @AllArgsConstructor
     * public class ApiError {
     *     private String code;
     *     private String message;
     * }
     *
     *
     * 📌 Result:
     *
     * Controller stays clean
     *
     * Service throws unchecked
     *
     * Handler maps to HTTP response
     *
     * 6️⃣ End-to-End Flow (Production)
     * Controller
     *    ↓
     * Service (throws RuntimeException)
     *    ↓
     * @RestControllerAdvice
     *    ↓
     * Consistent HTTP Response
     *
     *
     * No try-catch jungle 🚫
     * No checked exception leakage 🚫
     * Clean architecture ✅
     *
     * 7️⃣ Interview Gold Line ✨
     *
     * “Checked exceptions are for recoverable conditions; unchecked exceptions are for programming or system failures.
     * In Spring Boot, we often convert checked exceptions into domain-specific runtime exceptions and handle them centrally using @ControllerAdvice.”
     */

}
