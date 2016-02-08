package com.example.ORMLiteManyToMany;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable (tableName = "affecter")
public class Affecter {

    public  static final String COLUMN_ID = "id";
    public static final String COLUMN_EMPLOYE = "employe_id";
    public static final String COLUMN_TACHE = "tache_id";
    public static final String COLUMN_TEMPS = "temps";


    public Affecter() {
    }

    public Affecter(Employe employe, Tache tache, int nbHeures) {
        this.employe = employe;
        this.tache = tache;
        this.nbHeures = nbHeures;
    }

    @DatabaseField (
            generatedId = true,
            columnName = COLUMN_ID
    )
    private int id;

    @DatabaseField (
            canBeNull = false,
            columnName = COLUMN_EMPLOYE,
            foreign = true,
            foreignAutoRefresh = true)
    private Employe employe;



    @DatabaseField (
            canBeNull = false,
            columnName = COLUMN_TACHE,
            foreign = true,
            foreignAutoRefresh = true)
    private Tache tache;

    @DatabaseField (canBeNull = false, columnName = COLUMN_TEMPS)
    public int nbHeures;
}
