package com.karthik.cards.repository;

import com.karthik.cards.entity.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardsRepository extends JpaRepository<Cards, Long>
{

}
