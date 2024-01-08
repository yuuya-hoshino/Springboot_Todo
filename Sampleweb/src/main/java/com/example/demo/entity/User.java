package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "user_id", columnDefinition = "INTEGER USING user_id::integer")
    private Integer userId;
    private String password;
    private String familyName;
    private String firstName;
    private String katakanaFamilyName;
    private String katakanaFirstName;
    private LocalDate joinedDate;

    // 以下のセッターメソッドを追加
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setKatakanaFamilyName(String katakanaFamilyName) {
        this.katakanaFamilyName = katakanaFamilyName;
    }

    public void setKatakanaFirstName(String katakanaFirstName) {
        this.katakanaFirstName = katakanaFirstName;
    }

    public void setJoinedDate(LocalDate joinedDate) {
        this.joinedDate = joinedDate;
    }

    // 他のメソッドやフィールドもここに追加する可能性があります

    // ゲッターメソッドも適宜追加
    public Integer getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getKatakanaFamilyName() {
        return katakanaFamilyName;
    }

    public String getKatakanaFirstName() {
        return katakanaFirstName;
    }

    public LocalDate getJoinedDate() {
        return joinedDate;
    }
}


