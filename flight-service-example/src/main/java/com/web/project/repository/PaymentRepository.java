package com.web.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.web.project.entity.PaymentInfo;

public interface PaymentRepository extends JpaRepository<PaymentInfo, String> {

}
