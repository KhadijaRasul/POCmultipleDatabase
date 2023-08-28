package com.multiDatasource.demo.entity2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "siteIdLookup")
public class SiteIdLookup
{

	@Id
	private String site_uuid;
	private String site_id;


}