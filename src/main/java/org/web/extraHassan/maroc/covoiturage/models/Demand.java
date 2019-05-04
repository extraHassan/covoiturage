package org.web.extraHassan.maroc.covoiturage.models;

import org.web.extraHassan.maroc.covoiturage.models.enums.PublicationType;

import java.time.LocalDateTime;

public class Demand extends Publication {

    private int id;
    private Path path;
    private LocalDateTime dateTime;
    private String description;//details
    private PublicationType type;


}
