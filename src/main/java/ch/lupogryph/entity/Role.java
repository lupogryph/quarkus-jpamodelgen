package ch.lupogryph.entity;

public enum Role {
    INVITE("Invité"),
    VIP("VIP"),
    OPERATEUR("Opérateur"),
    ADMIN("Administrateur");

    private final String role;

    private Role(String role) {
        this.role = role;
    }

    public String role() {
        return this.role;
    }
}
