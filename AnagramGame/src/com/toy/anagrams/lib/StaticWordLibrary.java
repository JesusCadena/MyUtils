//CATALÁN
/*
Copyright (c) 2010, Oracle.
=======
* Tots els drets van reservar.
* Redistribución y uso dentro fuente y formas binarias, con o sin
* Modificación, es permitted con la condición de que las condiciones son conocidas:

* * Las redistribuciones de código de fuente deben retener el sobre aviso de copyright,
* Esta lista de condiciones y el siguiente disclaimer.
* * Las redistribuciones en forma binaria deben reproducir el sobre aviso
* De copyright, esta lista de condiciones y el siguiente disclaimer en
* La documentación y / u otros materiales proporcionados con la distribución.
* * Tampoco el nombre de Oracle ni los nombres de sus
* Colaboradores pueden soler aprobar o promover los productos derivaron
* De este software sin permiso escrito previo específico.

* ESTE SOFTWARE ES PROPORCIONADO POR LOS TITULARES de PROPIEDAD Y COLABORADORES
* "MIENTRAS ES" Y CUALESQUIERA EXPRESAN O va IMPLICAR GARANTÍAS, INCLUYENDO, PERO NO
* LIMITADO A, EL va IMPLICAR GARANTÍAS DE MERCHANTABILITY Y FITNESS PARA
* Un PROPÓSITO PARTICULAR ES DISCLAIMED. EN NINGUNA EVENTO EL COPYRIGHT
* OWNER O COLABORADORES SER propenso POR CUALQUIER DIRECTO, INDIRECTO, INCIDENTAL,
* ESPECIAL, EJEMPLAR, O DAÑOS CONSECUENTES (INCLUYENDO, PERO NO LIMITADO
* A, APROVISIONAMIENTO DE BIENES de SUSTITUTO O SERVICIOS; PÉRDIDA DE USO, DATO, O
* BENEFICIOS; O INTERRUPCIÓN EMPRESARIAL) EMBARGO CAUSADO Y EN CUALQUIER TEORÍA DE
* RESPONSABILIDAD, SI DENTRO CONTRATO, ESTRICTA RESPONSABILIDAD, O TORT (INCLUYENDO
* NEGLIGENCIA O CONTRARIO) surgir en cualquier MODO FUERA DEL USO DE ESTE
* SOFTWARE, INCLUSO SI ACONSEJADO DE LA POSIBILIDAD DE TAL DAÑO.
*/
//CASTELLANO
/*/ * Anagram Aplicación de juego /
=======
* Todos los derechos reservaron.

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

/* Anagram Aplicació de joc */


package com.toy.anagrams.lib;

/**
 * Implementation of the logic for the Anagram Game application.
 */
final class StaticWordLibrary extends WordLibrary {

    private static final String[] WORD_LIST = {
        "abstraction",
        "ambiguous",
        "arithmetic",
        "backslash",
        "bitmap",
        "circumstance",
        "combination",
        "consequently",
        "consortium",
        "decrementing",
        "dependency",
        "disambiguate",
        "dynamic",
        "encapsulation",
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
