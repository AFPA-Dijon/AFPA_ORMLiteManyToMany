package com.example.ORMLiteManyToMany;


import android.widget.EditText;
import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Collection;
import java.util.List;

@DatabaseTable  (tableName = "employes")
public class Employe {

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOM = "nom";

    @DatabaseField (generatedId = true, columnName = COLUMN_ID)
    private int id;

    @DatabaseField (columnName = COLUMN_NOM, width = 64, canBeNull = false)
    private String nom;

    @ForeignCollectionField (eager = true)
    Collection<Client> clients;

    public Employe(){}

    public Employe(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
