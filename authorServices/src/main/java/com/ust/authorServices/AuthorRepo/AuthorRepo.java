package com.ust.authorServices.AuthorRepo;


import com.ust.authorServices.model.AuthorInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepo extends JpaRepository<AuthorInfo,Integer> {

    Optional<AuthorInfo> findByAuthorId(String aid);
}