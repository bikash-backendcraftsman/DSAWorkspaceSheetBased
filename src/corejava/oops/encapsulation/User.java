package corejava.oops.encapsulation;

// Abuse of Getter and setters

/**
 * 9️⃣ Mental Model (VERY IMPORTANT)
 *
 * Think of your object as a gatekeeper, not a data box.
 *
 * Ask:
 *
 * ❓ What state is dangerous?
 *
 * ❓ What actions change state?
 *
 * ❓ Can outsiders bypass rules?
 *
 * If yes → encapsulation is broken.
 *
 * 🔟 Final one-sentence truth
 *
 * Encapsulation is achieved when an object can guarantee:
 * “No matter how you use me, I can never become invalid.”
 */

public class User {
    private String email;
    private boolean active;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;   // ❌ no rule
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active; // ❌ anyone can flip state
    }

    /**
     * Developers think:
     *
     * “private + getter/setter = encapsulation” [Its completely wrong]
     */
}
