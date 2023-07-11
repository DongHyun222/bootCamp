package JAVA_WS_04_1반_고동현;

import java.util.Comparator;

public class userSeqComparator implements Comparator<AccountDto>{
	
	public int compare(AccountDto a1, AccountDto a2) {
		return a1.getUserSeq() - a2.getUserSeq();
	}
}
