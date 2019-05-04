package org.web.extraHassan.maroc.covoiturage.models;

import org.web.extraHassan.maroc.covoiturage.models.comments.Comment;

import java.time.LocalDateTime;
import java.util.Vector;

public abstract class Publication {

    private User publisher;

    private LocalDateTime datePublication;
    private String title; //short description  to attract people

    private Vector<Comment> comments;
    private Vector<Reaction> reactions;
    private Vector<String> images;
    private Vector<User> usersTagged;




}
