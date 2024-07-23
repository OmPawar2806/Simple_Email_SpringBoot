package com.Simple_Mail_Message.simpleMail.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Simple_Mail_Message.simpleMail.entity.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {
    // Custom query methods can be added here if needed
}
