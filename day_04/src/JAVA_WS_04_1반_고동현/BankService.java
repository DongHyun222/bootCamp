package JAVA_WS_04_1반_고동현;

import java.util.ArrayList;

public class BankService {
	private ArrayList<AccountDto> accountList = new ArrayList<AccountDto>();
	private ArrayList<UserDto> userList = new ArrayList<UserDto>();
	
	public ArrayList<AccountDto> getAccountList() {
		return accountList;
	}
	public void setAccountList(ArrayList<AccountDto> accountList) {
		this.accountList = accountList;
	}

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
	public void setUserList(ArrayList<UserDto> userList) {
		this.userList = userList;
	}

	public BankService() {
	}
	
	public BankService(ArrayList<AccountDto> accountList, ArrayList<UserDto> userList) {
		super();
		this.accountList = accountList;
		this.userList = userList;
	}
	
	
		
}
