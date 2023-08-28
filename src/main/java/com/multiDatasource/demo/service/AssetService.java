package com.multiDatasource.demo.service;

import com.multiDatasource.demo.entity1.Assets;
import com.multiDatasource.demo.repository1.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService
{
	@Autowired
	private AssetRepository repository;

	public List<Assets> getSites() {
		return repository.findAll();
	}

	public Assets getSiteById(Long id) {
		return repository.findById(id).orElse(null);
	}

}
