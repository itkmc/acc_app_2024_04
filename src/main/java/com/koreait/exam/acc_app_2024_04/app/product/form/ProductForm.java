package com.koreait.exam.acc_app_2024_04.app.product.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ProductForm {
    @NotEmpty
    private String subject;
    @NotNull
    private int price;
    @NotNull
    private long songId;
}