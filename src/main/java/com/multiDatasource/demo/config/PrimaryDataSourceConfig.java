package com.multiDatasource.demo.config;


import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "idLookupEntityManagerFactory", basePackages = {
	"com.multiDatasource.demo.repository2" }, transactionManagerRef = "idLookupTransactionManager")
public class PrimaryDataSourceConfig
{
	@Primary
	@Bean(name = "idLookupDataSource")
	@ConfigurationProperties(prefix = "spring.primary.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "idLookupEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
		@Qualifier("idLookupDataSource") DataSource dataSource) {
		HashMap<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", "update");

		return builder
			.dataSource(dataSource)
			.properties(properties)
			.packages("com.multiDatasource.demo.entity2")
			.persistenceUnit("SiteIdLookup")
			.build();
	}

	@Primary
	@Bean(name = "idLookupTransactionManager")
	public PlatformTransactionManager transactionManager(
		@Qualifier("idLookupEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}

}


