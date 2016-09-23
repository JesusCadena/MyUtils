//CATALÁN
/*
Copyright (c) 2010, Oracle.
* Tots els drets van reservar.

* Redistribució i ús dins font i formes binàries, amb o sense
* modificació, és permitted amb la condició que les condicions següents són conegudes:

* * les redistribucions de codi de font han de retenir el damunt avís de copyright,
* aquesta llista de condicions i el següent disclaimer.
* * Les redistribucions en forma binària han de reproduir el damunt avís
* de copyright, aquesta llista de condicions i el següent disclaimer en
* la documentació i/o altres materials proporcionats amb la distribució.
* * Tampoc el nom d'Oracle ni els noms dels seus
* col·laboradors poden soler aprovar o promoure els productes van derivar
* d'aquest programari sense permís escrit previ específic.

* AQUEST PROGRAMARI ÉS PROPORCIONAT PELS TITULARS de COPYRIGHT I COL·LABORADORS
* "MENTRE ÉS" I QUALSSEVOL EXPRESSEN O va IMPLICAR GARANTIES, INCLOENT, PERÒ NO
* LIMITAT A, EL va IMPLICAR GARANTIES DE MERCHANTABILITY I FITNESS PER
* Un PROPÒSIT PARTICULAR ÉS DISCLAIMED. EN CAP ESDEVENIMENT EL COPYRIGHT 
* OWNER O COL·LABORADORS SER PROPENS PER QUALSEVOL DIRECTE, INDIRECTE, INCIDENTAL, 
* ESPECIAL, EXEMPLAR, O DANYS CONSEGÜENTS (INCLOENT, PERÒ NO LIMITAT 
* A, APROVISIONAMENT DE BÉNS de SUBSTITUT O SERVEIS; PÈRDUA D'ÚS, DADA, O
* BENEFICIS; O INTERRUPCIÓ EMPRESARIAL) TANMATEIX CAUSAT I EN QUALSEVOL TEORIA DE
* RESPONSABILITAT, SI DINS CONTRACTE, RESPONSABILITAT ESTRICTA, O TORT (INCLOENT
* NEGLIGÈNCIA O ALTRAMENT) SORGINT EN QUALSEVOL MANERA FORA DE L'ÚS D'AQUEST
* PROGRAMARI, FINS I TOT SI ACONSELLAT DE LA POSSIBILITAT DE TAL DANY. 
*/

/* Anagram Aplicació de joc /
        "equivalent",
        "expression",
        "facilitate",
        "fragment",
        "hexadecimal",
        "implementation",
        "indistinguishable",
        "inheritance",
        "internet",
        "java",
        "localization",
        "microprocessor",
        "navigation",
        "optimization",
        "parameter",
        "patrick",
        "pickle",
        "polymorphic",
        "rigorously",
        "simultaneously",
        "specification",
        "structure",
        "lexical",
        "likewise",
        "management",
        "manipulate",
        "mathematics",
        "hotjava",
        "vertex",
        "unsigned",
        "traditional"};

    private static final String[] SCRAMBLED_WORD_LIST = {
        "batsartcoin",
        "maibuguos",
        "ratimhteci",
        "abkclssha",
        "ibmtpa",
        "iccrmutsnaec",
        "ocbmnitaoni",
        "ocsnqeeutnyl",
        "ocsnroitmu",
        "edrcmeneitgn",
        "edepdnneyc",
        "idasbmgiauet",
        "ydanicm",
        "neacsplutaoni",
        "qeiuaveltn",
        "xerpseisno",
        "aficilatet",
        "rfgaemtn",
        "ehaxedicalm",
        "milpmeneatitno",
        "niidtsniugsiahleb",
        "niehiratcen",
        "nietnret",
        "ajav",
        "olacilazitno",
        "imrcpoorecssro",
        "anivagitno",
        "poitimazitno",
        "aparemert",
        "aprtcki",
        "ipkcel",
        "opylomprich",
        "irogorsuyl",
        "isumtlnaoesuyl",
        "psceficitaoni",
        "tsurtcreu",
        "elixalc",
        "ilekiwse",
        "amanegemtn",
        "aminupalet",
        "amhtmetacsi",
        "ohjtvaa",
        "evtrxe",
        "nuisngde",
        "rtdatioialn"
    };
    
    final static WordLibrary DEFAULT = new StaticWordLibrary();

    /**
     * Singleton class.
     */
    private StaticWordLibrary() {
    }

    /**
     * Gets the word at a given index.
     * @param idx index of required word
     * @return word at that index in its natural form
     */
    public String getWord(int idx) {
        return WORD_LIST[idx];
    }

    /**
     * Gets the word at a given index in its scrambled form.
     * @param idx index of required word
     * @return word at that index in its scrambled form
     */
    public String getScrambledWord(int idx) {
        return SCRAMBLED_WORD_LIST[idx];
    }

    /**
     * Gets the number of words in the library.
     * @return the total number of plain/scrambled word pairs in the library
     */
    public int getSize() {
        return WORD_LIST.length;
    }

    /**
     * Checks whether a user's guess for a word at the given index is correct.
     * @param idx index of the word guessed
     * @param userGuess the user's guess for the actual word
     * @return true if the guess was correct; false otherwise
     */
    public boolean isCorrect(int idx, String userGuess) {
        return userGuess.equals(getWord(idx));
    }

}
