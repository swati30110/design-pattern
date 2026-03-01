package builder;

import builder.enums.Role;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class User {
    private String id;
    private String username;
    private String email;
    private Role role;
    private String firstName;
    private String lastName;
    private String phone;
    private boolean isActive;
    private boolean isVerified;
    private String avatarUrl;
    private List<String> permissions;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private User(){
        this.isActive = true;
        this.isVerified = false;
        this.permissions = new ArrayList<>();
    }
    @Override
    public String toString() {
        return String.format(
                "User [%s] %s <%s>\nName: %s %s\nActive: %b | Verified: %b\nPermissions: %s\nCreated: %s",
                role, username, email,
                firstName, lastName,
                isActive, isVerified,
                permissions,
                createdAt
        );
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public static class Builder{
        private final User user;
        public Builder(){
            this.user = new User();
        }

        public Builder withId(String id){
            user.id = (id != null) ? id : UUID.randomUUID().toString();
            return this;
        }
        public Builder withUsername(String username) {
            user.username = username.trim().toLowerCase();
            return this;
        }
        public Builder withEmail(String email) {
            if (!email.contains("@")) {
                throw new IllegalArgumentException("Invalid email: " + email);
            }
            user.email = email.trim().toLowerCase();
            return this;
        }


        public Builder withRole(Role role) {
            user.role = role;
            return this;
        }

        public Builder withName(String firstName, String lastName) {
            user.firstName = firstName.trim();
            user.lastName = lastName.trim();
            return this;
        }

        public Builder withPhone(String phone) {
            user.phone = phone.trim();
            return this;
        }

        public Builder withAvatar(String url) {
            user.avatarUrl = url;
            return this;
        }

        public Builder withPermissions(String... permissions) {
            user.permissions = new ArrayList<>(Arrays.asList(permissions));
            return this;
        }

        public Builder verified() {
            user.isVerified = true;
            return this;
        }

        public Builder deactivated() {
            user.isActive = false;
            return this;
        }
        public User build() {
            if (user.id == null) user.id = UUID.randomUUID().toString();
            if (user.role == null) user.role = Role.USER; // default
            if (user.username == null || user.username.isBlank())
                throw new IllegalStateException("username is required");
            if (user.email == null || user.email.isBlank())
                throw new IllegalStateException("email is required");

            user.createdAt = (user.createdAt == null) ? LocalDateTime.now() : user.createdAt;
            user.updatedAt = LocalDateTime.now();

            // optional: make permissions immutable so User can't be mutated from outside
            user.permissions = List.copyOf(user.permissions);

            return user;
        }

    }

}
