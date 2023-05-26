package com.rzl.mycontact;

import com.rzl.mycontact.entity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
        void preExecute();

        void postExecute(ArrayList<Note> notes);
    }

