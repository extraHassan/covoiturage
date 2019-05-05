package org.web.extraHassan.maroc.covoiturage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web.extraHassan.maroc.covoiturage.models.Path;

@Repository
public interface PathRepository extends JpaRepository<Path,Long> {
}
