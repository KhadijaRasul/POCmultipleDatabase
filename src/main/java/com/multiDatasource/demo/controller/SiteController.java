package com.multiDatasource.demo.controller;


import com.multiDatasource.demo.entity2.SiteIdLookup;
import com.multiDatasource.demo.service.AssetService;
import com.multiDatasource.demo.entity1.Assets;
import com.multiDatasource.demo.service.IdLookupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.String.valueOf;

@RestController
public class SiteController
{

	@Autowired
	private AssetService service;

	@Autowired
	private IdLookupService service2;


	@GetMapping("/Sites")
	public List<Assets> findAllSites() {

		return service.getSites();
	}

	@GetMapping("/SiteById/{id}")
	public SiteIdLookup findSiteById(@PathVariable Long id) {
		Assets response = service.getSiteById(id);
		SiteIdLookup siteIdLookup  = new SiteIdLookup();
		siteIdLookup.setSite_id(valueOf(response.getId()));
		siteIdLookup.setSite_uuid(valueOf(response.getStrUuid()));

		service2.saveSiteIdLookup(siteIdLookup);
		return siteIdLookup;
	}

}
