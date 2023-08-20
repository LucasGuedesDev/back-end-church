package com.apichurch.mapper;

import com.apichurch.dto.ChurchRequest;
import com.apichurch.dto.ChurchResponse;
import com.apichurch.dto.PersonRequest;
import com.apichurch.dto.PersonResponse;
import com.apichurch.entities.Church;
import com.apichurch.entities.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChurchMapper {

    Church toEntity(ChurchRequest request);

    ChurchResponse toResponse(Church church);
}
