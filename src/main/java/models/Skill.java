package models;

public enum Skill {
    PAINTER("painter"),
    PHOTOGRAPHER("photographer"),
    JEWELER("jeweler"),
    ACTOR("actor"),
    TAILOR("clothes designer"),
    DIRECTOR("director"),
    MISCELLANEOUS("miscellaneous");

   private final String value;

   Skill(String value){
       this.value = value;
   }

   public String getValue(){
       return this.value;
   }


}
