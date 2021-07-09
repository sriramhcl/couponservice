package com.hcl.springcloud.couponservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.springcloud.couponservice.model.Coupon;
import com.hcl.springcloud.couponservice.repository.CouponRepository;

@RestController
@RequestMapping(value = "/coupon")
public class CouponRestController {

	@Autowired
	private CouponRepository couponRepository;

	@RequestMapping(value = "/getCoupon")
	public Coupon getCoupon(@RequestParam(name = "couponCode") String couponCode) {

		return couponRepository.findByCode(couponCode);
	}

	@RequestMapping(value = "/createCoupons", method = RequestMethod.POST)
	public Coupon createCoupons(@RequestBody Coupon coupon) {

		return couponRepository.save(coupon);
	}

}
