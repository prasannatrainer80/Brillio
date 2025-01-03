package com.java.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.bank.model.Accounts;
import com.java.bank.util.ConnectionHelper;

public class BankDaoImpl implements BankDao {

	Connection connection;
	PreparedStatement psmt;
	
	public int generateAccountNo() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select case when max(accountNo) IS NULL THEN 1 "
				+ " else max(accountNo)+1 end accno from Accounts";
		psmt = connection.prepareStatement(cmd);
		ResultSet rs = psmt.executeQuery();
		rs.next();
		int accno =rs.getInt("accno");
		return accno;
	}
	
	@Override
	public String createAccount(Accounts accounts) throws ClassNotFoundException, SQLException  {
		connection = ConnectionHelper.getConnection();
		int id = generateAccountNo();
		accounts.setAccountNo(id);
		String cmd = "Insert into Accounts(AccountNo, FirstName, LastName, City, State,"
				+ "Amount, CheqFacil, AccountType) values(?,?,?,?,?,?,?,?) ";
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, id);
		psmt.setString(2, accounts.getFirstName());
		psmt.setString(3, accounts.getLastName());
		psmt.setString(4, accounts.getCity());
		psmt.setString(5, accounts.getState());
		psmt.setDouble(6, accounts.getAmount());
		psmt.setString(7, accounts.getCheqFacil());
		psmt.setString(8, accounts.getAccountType());
		psmt.executeUpdate();
		return "Account Created with Account No " +id;
	}

	@Override
	public Accounts searchAccount(int accountNo) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Accounts where AccountNo = ?";
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, accountNo);
		ResultSet rs = psmt.executeQuery();
		Accounts accounts = null;
		if (rs.next()) {
			accounts = new Accounts();
			accounts.setAccountNo(rs.getInt("accountNo"));
			accounts.setFirstName(rs.getString("FirstName"));
			accounts.setLastName(rs.getString("lastName"));
			accounts.setState(rs.getString("state"));
			accounts.setCity(rs.getString("city"));
			accounts.setAmount(rs.getDouble("Amount"));
			accounts.setCheqFacil(rs.getString("cheqFacil"));
			accounts.setAccountType(rs.getString("accountType"));
			accounts.setStatus(rs.getString("status"));
			accounts.setDateOfOpen(rs.getDate("DateOfOpen"));
		}
		return accounts;
	}

	@Override
	public String closeAccount(int accountNo) throws ClassNotFoundException, SQLException {
		Accounts accounts = searchAccount(accountNo);
		if (accounts!=null) {
			String cmd = "update accounts set status='inactive' where accountNo = ?";
			connection = ConnectionHelper.getConnection();
			psmt = connection.prepareStatement(cmd);
			psmt.setInt(1, accountNo);
			psmt.executeUpdate();
			return "Account Closed...";
		}
		return "Account No Not Found...";
	}

	@Override
	public String depositAccount(int accountNo, double depositAmount) throws ClassNotFoundException, SQLException {
		Accounts accounts = searchAccount(accountNo);
		if (accounts!=null) {
			String cmd = "update Accounts set Amount = Amount + ? Where AccountNo = ?";
			connection = ConnectionHelper.getConnection();
			psmt = connection.prepareStatement(cmd);
			psmt.setDouble(1, depositAmount);
			psmt.setInt(2, accountNo);
			psmt.executeUpdate();
			cmd = "Insert into Trans(AccountNo, TransAmount, TransType) values(?,?,?)";
			psmt = connection.prepareStatement(cmd);
			psmt.setInt(1, accountNo);
			psmt.setDouble(2, depositAmount);
			psmt.setString(3, "C");
			psmt.executeUpdate();
			return "Amount Credited to Your Account...";
		}
		return "Account No Not Found...";
	}

	@Override
	public String withdrawAccount(int accountNo, double withdrawAmount) throws ClassNotFoundException, SQLException {
		Accounts accounts = searchAccount(accountNo);
		if (accounts!=null) {
			double balance = accounts.getAmount();
			if (balance-withdrawAmount >= 0) {
				String cmd = "update Accounts set Amount = Amount - ? Where AccountNo = ?";
				connection = ConnectionHelper.getConnection();
				psmt = connection.prepareStatement(cmd);
				psmt.setDouble(1, withdrawAmount);
				psmt.setInt(2, accountNo);
				psmt.executeUpdate();
				cmd = "Insert into Trans(AccountNo, TransAmount, TransType) values(?,?,?)";
				psmt = connection.prepareStatement(cmd);
				psmt.setInt(1, accountNo);
				psmt.setDouble(2, withdrawAmount);
				psmt.setString(3, "D");
				psmt.executeUpdate();
				return "Amount Debited to Your Account...";
			} else {
				return "Insufficient Funds...";
			}
		}
		return "Account No Not Found...";
	}
}






