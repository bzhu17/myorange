package com.ood.myorange.service.impl;

import com.ood.myorange.dao.StorageConfigDao;
import com.ood.myorange.dto.StorageConfigDto;
import com.ood.myorange.pojo.StorageConfig;
import com.ood.myorange.service.StorageConfigService;
import com.ood.myorange.util.ModelMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Repository
public class StorageConfigServiceImpl implements StorageConfigService {
    @Autowired
    StorageConfigDao storageConfigDao;

    @Override
    public List<StorageConfigDto> getAllConfigurations(int adminId) {
        List<StorageConfig> configList = storageConfigDao.selectAll();

        List<StorageConfigDto> result = new ArrayList<>();
        for (StorageConfig c : configList) {
            StorageConfigDto configDto = ModelMapperUtil.mapping(c, StorageConfigDto.class);
            result.add(configDto);
        }
        return result;
    }

    @Override
    public StorageConfigDto getConfiguration(int configId) {
        StorageConfig result = storageConfigDao.selectByPrimaryKey( configId );
        return ModelMapperUtil.mapping(result, StorageConfigDto.class);
    }

    @Override
    public void addConfiguration(StorageConfigDto config) {

    }

    @Override
    public void updateConfiguration(StorageConfigDto queryDto) {

    }

    @Override
    public void deleteConfiguration(int configId) {

    }
}
