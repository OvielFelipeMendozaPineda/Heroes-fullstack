package com.theheroes.theheroes.application;

import java.util.List;
import java.util.Optional;

import com.theheroes.theheroes.model.Hero;

public interface HeroRepositoryPort {
    public void save(Hero hero);
    public Optional<Hero> findById(Long id);
    public List<Hero> findAll();
}
