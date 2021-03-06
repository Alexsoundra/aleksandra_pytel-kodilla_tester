package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {
    @Test
    public void testAddWord(){
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");

        dictionary.addWord(polishWord, englishWord);

        assertEquals(1,dictionary.size());
    }

    @Test
    public void testFindEnglishWords(){
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("sztos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN,"play"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("grac", new EnglishWord(PartOfSpeech.NOUN, "play"));

        List<EnglishWord> result = dictionary.findEnglishWords("gra");
        assertEquals(2, result.size());
    }

}