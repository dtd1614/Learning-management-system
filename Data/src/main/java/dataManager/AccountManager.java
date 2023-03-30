package dataManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import grpc.Reservation.Account;
import grpc.Reservation.AccountList;

public class AccountManager {
	
	private AccountList.Builder accountList;
	
	public AccountManager(String fileName) throws IOException {
		this.accountList = AccountList.newBuilder();
		BufferedReader objCourseFile = new BufferedReader(new FileReader(fileName));
		while (objCourseFile.ready()) {
			String accountInfo = objCourseFile.readLine();
			if (!accountInfo.equals("")) this.accountList.addAccount(this.setAccount(accountInfo));
		}
		this.accountList.setException("");
		objCourseFile.close();
	}
	
    public Account.Builder setAccount(String inputString) {
    	Account.Builder account = Account.newBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(inputString);
        account.setId(stringTokenizer.nextToken());
    	account.setPassword(stringTokenizer.nextToken());
    	return account;
    }
    
	public AccountList.Builder getAccountList(){
		return this.accountList;
	}

	public void addAccount(String accountInfo){
		this.accountList.addAccount(this.setAccount(accountInfo));
	}
}
