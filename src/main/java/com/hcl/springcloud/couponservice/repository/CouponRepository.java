package com.hcl.springcloud.couponservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.springcloud.couponservice.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
	public Coupon findByCode(String code);
}
