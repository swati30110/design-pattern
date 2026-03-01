package builder;

import builder.enums.Role;

public class MainBuilder {
    public static void main(String[] args) {
        User newUser = new User.Builder()
                .withUsername("johndoe")
                .withEmail("john@example.com")
                .withName("John", "Doe")
                .withPhone("+1-555-0100")
                .build();

        System.out.println("=== New User ===");
        System.out.println(newUser);


        // 2. Admin user with full permissions
        User adminUser = new User.Builder()
                .withUsername("superadmin")
                .withEmail("admin@company.com")
                .withName("Alice", "Smith")
                .withRole(Role.ADMIN)
                .withPermissions("read", "write", "delete", "manage_users", "view_analytics")
                .verified()
                .build();

        System.out.println("\n=== Admin User ===");
        System.out.println(adminUser);
    }
}
