package com.multiDatasource.demo.repository2;

import com.multiDatasource.demo.entity2.SiteIdLookup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdLookupRepository extends JpaRepository<SiteIdLookup,String>
{
}
