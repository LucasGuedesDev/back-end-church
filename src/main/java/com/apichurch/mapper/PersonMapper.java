package com.apichurch.mapper;

import com.apichurch.dto.PersonRequest;
import com.apichurch.dto.PersonResponse;
import com.apichurch.entities.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    Person toEntity(PersonRequest request);

    PersonResponse toResponse(Person person);
}
