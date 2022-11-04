package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 장바구니에 담을 상품아이디, 수량을 전달 받는 클래스
 */
@Getter @Setter
public class CartItemDto {

    @NotNull(message = "상품 아이디는 필수 입력 값 입니다.")
    private Long itemId;

    @Min(value = 1, message = "최소 1개 이상 담아주세요")
    private int count;

}