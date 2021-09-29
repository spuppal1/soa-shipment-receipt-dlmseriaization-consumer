package com.tmobile.supplychain.shipmentreceiptdlmserializationconsumer.config;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author MBhaiji1
 */

@Configuration
@ConfigurationProperties("oracle")
@Profile("oracle-ucp")
public class OracleConfig {
	
	@Value("${oracle.username}")
	String username;
	
	@Value("${oracle.password}")
	String password;
	
	@Value("${oracle.url}")
	String url;
	
//	@NotNull
//	private String username;
//
//	@NotNull
//	private String password;
//
//	@NotNull
//	private String url;
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public void setUrl(String url) {
//		this.url = url;
//	}
	
	//		@Bean
	//		DataSource dataSource() throws SQLException {
	//
	//			OracleDataSource dataSource = new OracleDataSource();
	//			dataSource.setUser(username);
	//			dataSource.setPassword(password);
	//			dataSource.setURL(url);
	//			dataSource.setImplicitCachingEnabled(true);
	//			dataSource.setFastConnectionFailoverEnabled(true);
	//			return dataSource;
	//		}
	
	@Bean
	public DataSource dataSource() throws SQLException {
		PoolDataSource dataSource = PoolDataSourceFactory.getPoolDataSource();
		dataSource.setUser(username);
		dataSource.setPassword(password);
		dataSource.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
		dataSource.setURL(url);
		dataSource.setFastConnectionFailoverEnabled(true);
		dataSource.setInitialPoolSize(5);
		dataSource.setMinPoolSize(5);
		dataSource.setMaxPoolSize(10);
		return dataSource;
	}
	
	//	@Bean
	//	public DataSource dataSource() throws SQLException {
	//		return DataSourceBuilder.create()
	//								.url(url)
	//								.username(username)
	//								.driverClassName("oracle.jdbc.pool.OracleDataSource")
	//								.password(password)
	//								.build();
	//	}
}
