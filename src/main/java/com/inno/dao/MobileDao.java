package com.inno.dao;


import com.inno.pojo.Mobile;

import java.util.Collection;
import java.util.List;

public interface MobileDao {
  boolean addMobile(Mobile mobile);

  Mobile getMobileById(Integer id);

  void createTable();

  List<Mobile> getAllMobile();
}
