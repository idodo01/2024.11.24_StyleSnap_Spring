package com.ido.stylesnap.mapper;

import com.ido.stylesnap.dto.StyleDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StyleMapper {
    void insertStyle(StyleDTO styleDTO);
}
