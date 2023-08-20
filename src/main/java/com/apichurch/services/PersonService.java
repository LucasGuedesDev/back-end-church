package com.apichurch.services;

import com.apichurch.dto.PersonRequest;
import com.apichurch.dto.PersonResponse;
import com.apichurch.entities.Person;
import com.apichurch.mapper.PersonMapper;
import com.apichurch.repositories.PersonRepository;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonService implements Serializable {

    final PersonRepository repository;

    final PersonMapper mapper;


    public PersonService(PersonRepository repository, PersonMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<Person> getAllPersons(){
        return repository.findAll();
    }

    public Person getPersonById(Long id){
        Optional<Person> optionalPerson = Optional.ofNullable(repository.getById(id));
        if(optionalPerson.isEmpty()){
            throw new NotFoundException("Pessoa não encontrada :(");
        }
        return repository.getById(id);
    }

    public Person createPerson(PersonRequest request){
        Person person = mapper.toEntity(request);
        //PersonResponse response = mapper.toResponse(person);
        repository.saveAndFlush(person);
        return person;
    }

    public void deletePerson(Long id){
        Optional<Person> optionalPerson = Optional.ofNullable(repository.getById(id));
        if(optionalPerson.isEmpty()){
            throw new NotFoundException("Pessoa não encontrada :(");
        }
        repository.deleteById(id);
    }

    public Person updatePerspon(Long id, Person person){
        Person personModel = repository.getById(id);

        if(personModel == null){
            throw new NotFoundException("Paciente com id " + id + "não encontrado :(");
        }

        personModel.setName(person.getName());
        personModel.setOffice(person.getOffice());
        personModel.setConsecrationDate(person.getConsecrationDate());
        personModel.setDateBirth(person.getDateBirth());
        personModel.setNaturalness(person.getNaturalness());
        personModel.setUf(person.getUf());
        personModel.setSex(person.getSex());
        personModel.setCep(person.getCep());
        personModel.setAddress(person.getAddress());
        personModel.setNeighborhood(person.getNeighborhood());
        personModel.setCity(person.getCity());
        personModel.setFoneRes(person.getFoneRes());
        personModel.setFoneCel(person.getFoneCel());
        personModel.setEmail(person.getEmail());
        personModel.setMaritalStatus(person.getMaritalStatus());
        personModel.setDateWedding(person.getDateWedding());
        personModel.setProfession(person.getProfession());
        personModel.setCpf(person.getCpf());
        personModel.setRg(person.getRg());
        personModel.setBaptizedHe(person.getBaptizedHe());
        personModel.setDateBaptizedHe(person.getDateBaptizedHe());
        personModel.setDateBaptized(person.getDateBaptized());
        personModel.setChurch(person.getChurch());
        personModel.setDateAdmission(person.getDateAdmission());
        personModel.setNameSpouse(person.getNameSpouse());
        personModel.setChildren(person.getChildren());
        personModel.setDateConversion(person.getDateConversion());
        personModel.setChurchOrigin(person.getChurchOrigin());
        personModel.setChurchOriginCity(person.getChurchOriginCity());
        personModel.setChurchOrigiNCity_uf(person.getChurchOrigiNCity_uf());

        return personModel;
    }




}
