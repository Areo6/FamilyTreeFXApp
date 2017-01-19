/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asgteach.familytree.managerfx.impl;

import com.asgteach.familytreefx.model.FamilyTreeManager;
import com.asgteach.familytreefx.model.Person;
import java.util.ArrayList;
import java.util.List;
import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.MapChangeListener;
import javafx.collections.ObservableMap;

/**
 *
 * @author Developer
 */
public class FamilyTreeManagerFXImpl implements FamilyTreeManager {
     private final ObservableMap<Long,Person> map=FXCollections.observableHashMap();

    @Override
    public void addListener(MapChangeListener<? super Long, ? super Person> ml) {
          map.addListener(ml);
    }

    @Override
    public void removeListener(MapChangeListener<? super Long, ? super Person> ml) {
          map.removeListener(ml);
    }

    @Override
    public void addListener(InvalidationListener il) {
         map.addListener(il);
    }

    @Override
    public void removeListener(InvalidationListener il) {
        map.removeListener(il);
    }

    @Override
    public void addPerson(Person p) {
         Person person=new Person(p);
        map.put(person.getId(),person);
    }

    @Override
    public void updatePerson(Person p) {
        Person person=new Person(p);
        map.put(person.getId(), person);
    }

    @Override
    public void deletePerson(Person p) {
        
    }

    @Override
    public List<Person> getAllPeople() {
        List<Person> copyList = new ArrayList<>();
         // map.values().stream().forEach((p) -> copyList.add(new Person(p)));
           
        return copyList;
    }
    
}
