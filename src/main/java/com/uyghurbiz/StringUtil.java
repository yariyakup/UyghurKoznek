package com.uyghurbiz;

import org.apache.commons.lang.RandomStringUtils;

/**
 * Created by yyakup on 9/3/16.
 */
public class StringUtil {


    public static String[] getSimilarWordArray(String word, int count) {
        String[] randomWord = new String[count];
        int index = 0;
        while(index < count) {

            randomWord[index] = word + RandomStringUtils.randomAlphabetic(6);
            index++;
        }

       return randomWord;
    }

    public static String getSimilarWord(String word, int count) {
        return word + RandomStringUtils.randomAlphabetic(count);
    }
}
