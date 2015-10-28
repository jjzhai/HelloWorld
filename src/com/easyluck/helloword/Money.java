package com.easyluck.helloword;

public class Money {
	private int fAmount;// 余额
	private String fCurrency;// 货币类型

	public Money(int amount, String currency) {
		this.fAmount = amount;
		this.fCurrency = currency;
	}

	public int amount() {
		return this.fAmount;
	}

	public String currency() {
		return this.fCurrency;
	}

	public Money add(Money m) {// 加钱
		return new Money(amount() + m.amount(), currency());
	}

	@Override
	public boolean equals(Object anObject) {// 判断钱数是否相等
		if (anObject instanceof Money) {
			Money aMoney = (Money) anObject;
			return aMoney.currency().equals(currency())&& (amount() == aMoney.amount());
		}
		return false;
	}
}
