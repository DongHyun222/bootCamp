package com.itskb.ws03.dto;

public class BankExam {
	public static void main(String[] args) {
		UserDto ud = new UserDto(111,"DongHyun","att815@naver.com","111-222",true);
		AccountDto ac = new AccountDto(1010,"1234",9999,111);
		
		System.out.println(ud.toString());
		System.out.println(ac.toString());
	}
}
