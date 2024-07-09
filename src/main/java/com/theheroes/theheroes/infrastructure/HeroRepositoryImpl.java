package com.theheroes.theheroes.infrastructure;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.theheroes.theheroes.application.HeroRepositoryPort;
import com.theheroes.theheroes.model.Hero;
import com.theheroes.theheroes.model.HeroRepositoryMySQL;

@Repository
public class HeroRepositoryImpl  implements HeroRepositoryPort{

    @Autowired
    private HeroRepositoryMySQL heroRepositoryMySQL;

    @Override
    public void save(Hero hero) {
        this.heroRepositoryMySQL.save(hero);
    }

    @Override
    public Optional<Hero> findById(Long id) {
        return this.heroRepositoryMySQL.findById(id);
    }

    @Override
    public List<Hero> findAll() {
        return this.heroRepositoryMySQL.findAll();
    }

    
    
}
