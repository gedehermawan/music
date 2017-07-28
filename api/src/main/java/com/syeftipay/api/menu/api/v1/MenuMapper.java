package com.syeftipay.api.menu.api.v1;

import com.syeftipay.api.mapping.MappingConfig;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MappingConfig.class)
public abstract class MenuMapper {
  @Mapping(target = "menuId", source = "menuId")
  @Mapping(target = "menuName", source = "name")
  @Mapping(target = "description", source = "description")
  @Mapping(target = "price", source = "price")
  abstract Menu menuToMenu(com.syeftipay.backend.domain.Menu menu);
}
