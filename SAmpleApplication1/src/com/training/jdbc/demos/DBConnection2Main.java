package com.training.jdbc.demos;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Savepoint;

public class DBConnection2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		Savepoint savepoint = null;
		try {
			connection = DBConnection.getConnection();
			System.out.println("connected");
		} catch (SQLException e) {
			System.out.println("There was an error getting the  connection");
		}
		try {
			connection.setAutoCommit(false);
			System.out.println("The autocommit was disabld ");
		} catch (SQLException e1) {
			System.out.println("There was an error disabling autocommit");
		}
		try {
			DBConnection.insertRowForStudent(connection, 63, "Munees", "ramanad", "7778788777");
			DBConnection.insertRowForStudent(connection, 333, "Arunkumar", "vellljkore", "8794587689");
			savepoint = connection.setSavepoint("SavePoint1");
			DBConnection.insertRowForStudent(connection, 2, "Arull", "jgf", "879878889");
			connection.commit();
			System.err.println("The transaction was succesfully executed");
		} catch (SQLException e) {
			try {
				// we rollback the transaction to the last save point
				connection.rollback(savepoint);
				connection.commit();
				System.err.println(e);
				System.out.println("transaction was rollback to the last savepoint");
			} catch (SQLException e1) {
				
				System.err.println("there was an error making a rollback");
			}
		}

	}
}
