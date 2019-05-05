package org.web.extraHassan.maroc.covoiturage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web.extraHassan.maroc.covoiturage.models.Publication;

@Repository
public interface PublicationRepository extends JpaRepository<Publication,Long> {
}
