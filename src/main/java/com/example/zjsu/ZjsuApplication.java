package com.example.zjsu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootApplication
public class ZjsuApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(ZjsuApplication.class, args);
	}

	@Autowired
	private DataSource dataSource;

	@Override
	public void run(String... args) throws Exception {
		// 测试数据库连接
		try (Connection conn = dataSource.getConnection();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery("SELECT VERSION()")) {
			if (rs.next()) {
				System.out.println("数据库连接成功！版本：" + rs.getString(1));
			}
		} catch (Exception e) {
			System.err.println("数据库连接失败：" + e.getMessage());
			e.printStackTrace();
		}
	}
}
