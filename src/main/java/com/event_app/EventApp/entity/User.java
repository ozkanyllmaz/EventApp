package com.event_app.EventApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Otomatik artan birincil anahtar
    private int userId;

    @Column(nullable = false, name = "userName")
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, name = "email")
    private String email;

    private String location;

    @ElementCollection
    @CollectionTable(name = "user_interests", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "interest")
    private List<String> interests;

    private String firstName;

    private String lastName;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    private String gender;

    @Column(nullable = false)
    private String phoneNumber;

    @Lob
    private String profilePhoto; // Base64 veya URL ile saklanabilir.




    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                ", interests=" + interests +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", profilePhoto='" + profilePhoto + '\'' +
                '}';
    }
}
