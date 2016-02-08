package com.example.ORMLiteManyToMany;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable  (tableName = "clients")
public class Client {

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOM = "nom";
    public static final String COLUMN_NOCLIENT = "no_client";

    @DatabaseField(generatedId = true, columnName = COLUMN_ID)
    private int id;

    @DatabaseField (columnName = COLUMN_NOM, width = 64, canBeNull = false)
    private String nom;

    @DatabaseField (columnName = COLUMN_NOCLIENT, canBeNull = false)
    private int noClient;

    @DatabaseField (foreign = true, foreignAutoRefresh = true)
    private Employe employe;


    public Client(){}

    public Client(String nom, int noClient) {
        this.noClient = noClient;
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
