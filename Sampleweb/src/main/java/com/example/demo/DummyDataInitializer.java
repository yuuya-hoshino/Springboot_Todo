package com.example.demo;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Component
public class DummyDataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;

    public DummyDataInitializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // ダミーデータ作成
        createDummyUsers();
    }

    private void createDummyUsers() {
        // ダミーユーザー1
        User user1 = new User();
        user1.setUserId(1); // 修正: Integer型の引数に整数値を渡す
        user1.setPassword("password");
        user1.setFamilyName("John");
        user1.setFirstName("Doe");
        user1.setKatakanaFamilyName("ジョン");
        user1.setKatakanaFirstName("ドー");
        user1.setJoinedDate(LocalDate.now());
        userRepository.save(user1);

        // ダミーユーザー2
        User user2 = new User();
        user2.setUserId(2); // 修正: Integer型の引数に整数値を渡す
        user2.setPassword("password");
        user2.setFamilyName("Jane");
        user2.setFirstName("Doe");
        user2.setKatakanaFamilyName("ジェーン");
        user2.setKatakanaFirstName("ドー");
        user2.setJoinedDate(LocalDate.now());
        userRepository.save(user2);
        
        // 他のユーザーも同様に作成可能
    }
}
