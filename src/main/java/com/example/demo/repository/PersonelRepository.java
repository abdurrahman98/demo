package com.example.demo.repository;

import com.example.demo.Model.Personel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonelRepository extends JpaRepository<Personel,Long> {
    Optional<Personel> findByEmail(String email);

    Optional<Personel> findByUsernameOrEmail(String username, String email);

    List<Personel> findByIdIn(List<Long> userIds);

    Optional<Personel> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
