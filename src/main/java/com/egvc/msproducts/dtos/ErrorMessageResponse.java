package com.egvc.msproducts.dtos;

import java.util.Date;

public record ErrorMessageResponse(Integer value,
                                   Date date,
                                   String message) {

}
