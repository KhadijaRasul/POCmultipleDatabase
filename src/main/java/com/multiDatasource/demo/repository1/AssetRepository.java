package com.multiDatasource.demo.repository1;

import com.multiDatasource.demo.entity1.Assets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Assets,Long>
{
}
