package com.multiDatasource.demo.service;

import com.multiDatasource.demo.entity2.SiteIdLookup;
import com.multiDatasource.demo.repository2.IdLookupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IdLookupService
{
	@Autowired
	private IdLookupRepository repository;

	public SiteIdLookup saveSiteIdLookup(SiteIdLookup siteIdLookup) {
		return repository.save(siteIdLookup);
	}
	}

