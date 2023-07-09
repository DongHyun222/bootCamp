package JAVA_WS_04_1반_고동현;

import java.util.ArrayList;
import java.util.Collections;

public class BankService {
	private ArrayList<AccountDto> accountList = new ArrayList<AccountDto>();
	private ArrayList<UserDto> userList = new ArrayList<UserDto>();
	
	public BankService() {
		accountList.add(new AccountDto(200, "444", 1, 22222));
		accountList.add(new AccountDto(333, "345", 1, 33333));
		accountList.add(new AccountDto(100, "123", 1, 11111));
		accountList.add(new AccountDto(111, "245", 1, 11111));
		
		userList.add(new UserDto(22222, "BBB", "BBB@naver.com", "3333-4444", true));
		userList.add(new UserDto(11111, "AAA", "AAA@naver.com", "1111-2222", true));
		userList.add(new UserDto(33333, "CCC", "CCC@naver.com", "5555-6666", true));
	}
	
//	public BankService(ArrayList<AccountDto> accountList, ArrayList<UserDto> userList) {
//		super();
//		this.accountList = accountList;
//		this.userList = userList;
//	}
	
//	2번째꺼
	public ArrayList<AccountDto> getAccountList(int userSeq) {
		ArrayList<AccountDto> result = new ArrayList<AccountDto>();
		for (AccountDto acd : accountList) {
			if (userSeq == acd.getAccountSeq())
				result.add(acd);
		}
		return result;
	}
//	public void setAccountList(ArrayList<AccountDto> accountList) {
//		this.accountList = accountList;
//	}
//	3번째꺼
	public UserDto getUserDetail(int userSeq) {
		for (UserDto ud : userList) {
			if (userSeq == ud.getUserSeq())
				return ud;
		}
		return null;
	}
	
	public ArrayList<UserDto> getUserList() {
		return userList;
	}
//	public void setUserList(ArrayList<UserDto> userList) {
//		this.userList = userList;
//	}
	
	//4번째꺼
	public ArrayList<AccountDto> getAccountList() {
		return accountList;
	}
	
	//5번째
	public ArrayList<AccountDto> getAccountListSortByBalance() {
//		ArrayList<AccountDto> acl = new ArrayList<AccountDto>();
		Collections.sort(accountList);
		return accountList;
	}
	
	//6번째
	public ArrayList<UserDto> getAccountListSortByUserSeq() {
		Collections.sort(userList);
		return userList;
	}
		
}
