package com.xapps.nexos.controller;

import com.xapps.nexos.models.Messages;
import com.xapps.nexos.repositories.MessagesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessagesController {
    @Autowired
    private MessagesRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Messages> getAllMessages() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Messages getPetById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody Messages messages) {
        messages.set_id(id);
        repository.save(messages);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Messages createPet(@Valid @RequestBody Messages messages) {
        messages.set_id(ObjectId.get());
        repository.save(messages);
        return messages;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletePet(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }
}
