package com.cydeo;

import java.math.BigDecimal;
import java.util.UUID;

public class CouplingTestRunner {
    public static void main(String[] args) {

        UUID user = UUID.randomUUID();

//        CustomerBalance customerBalance = new CustomerBalance(user, BigDecimal.valueOf(100));
//        GiftCardBalance giftCardBalance = new GiftCardBalance(user,BigDecimal.valueOf(100));
//
//        BalanceService balanceService = new BalanceService();

        CustomerBalance customerBalance = new CustomerBalance(user, BigDecimal.ZERO);
        GiftCardBalance giftCardBalance = new GiftCardBalance(user, BigDecimal.ZERO);

        BalanceService balanceService = new BalanceService();

        customerBalance.addBalance(BigDecimal.valueOf(100));
        giftCardBalance.addBalance(BigDecimal.valueOf(100));


        System.out.println("CUSTOMER BALANCE:");
        System.out.println(customerBalance.getAmount()); // 100
        balanceService.checkout(customerBalance,new BigDecimal(50));
        System.out.println(customerBalance.getAmount()); //50

        System.out.println("GIFT CARD BALANCE:");
        System.out.println(giftCardBalance.getAmount());
        balanceService.checkout(giftCardBalance,new BigDecimal(50));
        System.out.println(giftCardBalance.getAmount());


    }
}
