package com.example.ORMLiteManyToMany;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable (tableName = "taches")
public class Tache {
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_LIBELLE = "libelle";

    @DatabaseField(generatedId = true, columnName = COLUMN_ID)
    private int id;

    @DatabaseField (columnName = COLUMN_LIBELLE, width = 64, canBeNull = false)
    private String libelle;

    public Tache(){}

    public Tache(String libelle) {
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


}
