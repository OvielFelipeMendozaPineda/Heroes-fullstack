package com.theheroes.theheroes.application;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theheroes.theheroes.model.Hero;

@Service
public class HeroService {

  @Autowired
  private HeroRepositoryPort heroRepositoryPort;

  public void saveHero(Hero hero) {
    this.heroRepositoryPort.save(hero);
  }

  public ArrayList<Hero> getAllHeroes() {
    this.heroRepositoryPort.findAll();
    return new ArrayList<>();
  }
}