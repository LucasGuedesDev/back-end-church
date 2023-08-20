package com.apichurch.services;

import com.apichurch.dto.ChurchRequest;
import com.apichurch.dto.ChurchResponse;
import com.apichurch.dto.PersonRequest;
import com.apichurch.dto.PersonResponse;
import com.apichurch.entities.Church;
import com.apichurch.entities.Person;
import com.apichurch.mapper.ChurchMapper;
import com.apichurch.repositories.ChurchRepository;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ChurchService implements Serializable {

    final ChurchRepository repository;

    final ChurchMapper mapper;

    public ChurchService(ChurchRepository repository, ChurchMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    public List<Church> getAllChurchs(){
        return repository.findAll();
    }

    public Church getChurchById(Long id){
        Optional<Church> optionalChurch = Optional.ofNullable(repository.getById(id));
        if(optionalChurch.isEmpty()){
            throw new NotFoundException("Igreja não encontrada :(");
        }
        return repository.getById(id);
    }

    public Church createChurch(ChurchRequest request){
        Church church = mapper.toEntity(request);
        //ChurchResponse response = mapper.toResponse(church);
        repository.save(church);
        return church;
    }

    public void deleteChurch(Long id){
        Optional<Church> optionalPerson = Optional.ofNullable(repository.getById(id));
        if(optionalPerson.isEmpty()){
            throw new NotFoundException("Igreja não encontrada :(");
        }
        repository.deleteById(id);
    }

    public Church updateChurch(Long id, Church church){
        Church churchModel = repository.getById(id);

        if(churchModel == null){
            throw new NotFoundException("Igreja com id " + id + "não encontrada :(");
        }

        churchModel.setNameCongregation(church.getNameCongregation());
        churchModel.setSector(church.getSector());
        churchModel.setRegional(churchModel.getRegional());
        churchModel.setCnpj(church.getCnpj());
        churchModel.setCep(church.getCep());
        churchModel.setUf(church.getUf());
        churchModel.setAddress(church.getAddress());
        churchModel.setNeighborhood(churchModel.getNeighborhood());
        churchModel.setCity(church.getCity());
        churchModel.setIsRent(church.getIsRent());

        return churchModel;
    }




}
