package com.edhydev.service;

import com.edhydev.domain.SmartWatch;

import java.util.List;

public interface SmartWatchService {

    Integer count();

    List<SmartWatch> findAll();

    SmartWatch findOne(Long id);

    SmartWatch save(SmartWatch user);

    boolean delete(Long id);

    void deleteAll();
}
