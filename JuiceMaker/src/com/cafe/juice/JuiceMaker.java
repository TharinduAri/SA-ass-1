package com.cafe.juice;

import com.cafe.api.JuiceService;

public class JuiceMaker implements JuiceService {
    @Override
    public void makeJuice(String customerName) {
        System.out.println("🍹 Juice Maker is making juice for " + customerName);
    }
}
