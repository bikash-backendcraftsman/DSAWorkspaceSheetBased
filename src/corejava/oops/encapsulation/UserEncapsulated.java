package corejava.oops.encapsulation;

public class UserEncapsulated {

    private String email;
    private boolean active;

    public UserEncapsulated(String email){
        validateEmail(email);
        this.email = email;
        this.active = false;
    }

    public void activate(){
        if(active){
            throw new IllegalStateException("User already active");
        }
        this.active = true;
    }

    private void validateEmail(String email) {
        if(email == null || !email.contains("@")){
            throw new RuntimeException("Invalid Email");
        }
    }


    //getters to get the values

    //Getters – WHY these are safe here

    /**
     * ✔ Why these are allowed
     *
     * No mutation
     *
     * No invariant violation
     *
     * Safe observation
     *
     */

    public String getEmail() {
        return email; // safe read
    }

    public boolean isActive() {
        return active;
    }

    public static void main(String[] args) {
        UserEncapsulated en = new UserEncapsulated("bikash@gmail.com");
        en.activate();
        String val = en.getEmail();
        System.out.println(val);
    }


    /**
     * 🔑 Key concept
     *
     * Rules live with data, not with services
     *
     * This prevents:
     *
     *      Rule duplication
     *
     *      Inconsistent validation
     *
     * “God services”
     */

    /**
     * 6️⃣ When Getters ARE Acceptable ✅
     *
     * Use getters when:
     *
     * Reading state (no mutation)
     *
     * Returning immutable values
     *
     * Logging / reporting
     *
     * Serialization (DTOs)
     *
     * ❌ Avoid setters when:
     *
     * State change has business meaning
     *
     * Invariants must be preserved
     */

    /**
     * 9️⃣ Mental Model to Remember 🧠
     *
     * If you need setters, you probably need a method with intent
     *
     * Ask yourself:
     *
     * ❓ What does this change MEAN?
     *
     * ❓ Who should own this rule?
     *
     * ❓ Can the object protect itself?
     *
     *
     * 🔟 One-Line Rule (Write this down)
     *
     * Encapsulation is about behavior control, not access control
     *
     */
}
