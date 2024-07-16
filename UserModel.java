package https.github.com.Dorian_ops.diamonds_bank_spring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String role;
    private int balance;

    public UserModel(){}

    public UserModel(String name, String role, int balance){
        this.name = name;
        this.role = role;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof UserModel))
            return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(this.id, userModel.id) && Objects.equals(this.name, userModel.name)
                && Objects.equals(this.role, userModel.role)
                && Objects.equals(this.balance, userModel.balance);
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role, this.balance);
    }

    @Override
    public String toString() {
        return "UserModel{" + "id=" + this.id + ", name='" + this.name + ", balance='" + this.balance + '\'' + ", role='" + this.role + '\'' + '}';
    }
}
