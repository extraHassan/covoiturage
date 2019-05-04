package org.web.extraHassan.maroc.covoiturage.models;

import org.web.extraHassan.maroc.covoiturage.models.enums.PublicationType;
import org.web.extraHassan.maroc.covoiturage.models.enums.PeopleCategory;

import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Offer extends Publication {

    private Path path;
    private LocalDateTime dateTime;
    private LocalTime estimatedTime;
    private Car car;
    private String description;//details
    private PeopleCategory peopleCategory;
    private int places;
    private double price;
    private PublicationType type;





}
