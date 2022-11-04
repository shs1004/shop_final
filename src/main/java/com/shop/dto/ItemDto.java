package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class ItemDto {

    private Long id;

    private String itemNm;

    private String coffeeTaste;

    private Integer price;

    private String itemDetail;

    private String sellStatCd;

    private String coffeeBeanCd;

    private String roasteryNm;

    private String roasteryDetail;

    private String extraction;

    private String origin;

    private String process;

    private String kind;

    private LocalDateTime regTime;

    private LocalDateTime updateTime;

}
