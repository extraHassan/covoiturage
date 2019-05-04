package org.web.extraHassan.maroc.covoiturage.models.comments;

import org.web.extraHassan.maroc.covoiturage.models.Publication;
import org.web.extraHassan.maroc.covoiturage.models.User;

import java.time.LocalDateTime;
import java.util.Vector;

public class Comment {
    private int id;
    private LocalDateTime dateTime;
    private User user;
    private Publication publication;
    private Vector<String> texts;


}
