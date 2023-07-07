package day_05;

import java.util.ArrayList;

public class BookStoreExam {
	public static void main(String[] args) {
		BookStoreService bsSvc = new BookStoreService();
		
		//과제에서getUserDetail임
		MemberDto m = bsSvc.getMemberDetail(100);
		System.out.println(m);
		
		//과제에서 첫번째 getAccountList
		ArrayList<SaleDto> saleList = bsSvc.getSaleList(100);
		System.out.println(saleList);
		
		//과제 getAccountList 4번째
		ArrayList<SaleDto> saleList2 = bsSvc.getSaleList();
		ArrayList<MemberDto> memberList2 = bsSvc.getMemberList();
		ArrayList<BookDto> bookList2 = bsSvc.getBookList();
		
		//과제5번째
		ArrayList<SaleDto> saleList3 = bsSvc.getSaleListSortByQuantity();
		System.out.println(saleList3);
	}
}
