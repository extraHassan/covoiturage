package org.web.extraHassan.maroc.covoiturage.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web.extraHassan.maroc.covoiturage.models.Reaction;

@Repository
public interface ReactionRepository extends JpaRepository<Reaction,Long> {
}
