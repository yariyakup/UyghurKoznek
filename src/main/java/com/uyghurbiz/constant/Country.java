package com.uyghurbiz.constant;

/**
 * Created by yyakup on 3/15/17.
 */
public enum Country {
     USA("United States", "US"),
     Canada("Canada", "CA");

     private final String Name;
     private final String code;

      Country(String name, String code) {
          this.Name = name;
          this. code = code;
     }


}
