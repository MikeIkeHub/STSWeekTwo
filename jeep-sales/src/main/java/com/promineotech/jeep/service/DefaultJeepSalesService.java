package com.promineotech.jeep.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import lombok.extern.slf4j.Slf4j;

@Service
public class DefaultJeepSalesService implements JeepSalesService {

  @Override
  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
    // TODO Auto-generated method stub
    return null;
  }
}
