package com.travel.entities;

@Entity
@Table(name = "users")
@Data

public class User{
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;
    private String password;
    private String email;
    private String money;

    List<String> transportation =  new ArrayList<String>();

}