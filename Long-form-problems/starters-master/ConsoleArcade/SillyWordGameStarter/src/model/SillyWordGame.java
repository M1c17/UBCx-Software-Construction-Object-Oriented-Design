package model;

import java.util.Iterator;
import java.util.List;

public class SillyWordGame implements Iterable<Phrase>{

    private List<Phrase> phrases;
    //TODO: remove these fields
//    private int currentPhraseIndex;
//    private int numWordsNeeded;

    public SillyWordGame(List<Phrase> phrases) {
        this.phrases = phrases;
//        for(Phrase p : phrases) {
//            if (p.needsWord())
//                numWordsNeeded++;
//        }
    }

    //EFFECTS: returns all phrases in this game
    public List<Phrase> getAllPhrases() {
        return phrases;
    }

    @Override
    public Iterator<Phrase> iterator() {
        return new PhraseNeedWordIterator();
    }

    private class PhraseNeedWordIterator implements Iterator<Phrase>{
        private int numWordsNeeded;
        private Iterator phraseIterator;

        public PhraseNeedWordIterator() {
            phraseIterator = phrases.iterator();
            calculateNumWordsNeeded();
        }

        //EFFECTS: return true if there is another phrase needing a word.
        @Override
        public boolean hasNext() {
            return (numWordsNeeded > 0);
        }

        //EFFECTS: return the next phrase needing a word
        @Override
        public Phrase next() {
            Phrase p = (Phrase) phraseIterator.next();
            while(!p.needsWord()) {
                p = (Phrase) phraseIterator.next(); }
            numWordsNeeded--;
            return p;
        }

        public void calculateNumWordsNeeded() {
            Iterator<Phrase> it = phrases.iterator();
            while(it.hasNext()) {
                if(it.next().needsWord()){
                    numWordsNeeded++;
                }
            }
        }
    }

    //MODIFIES: this
    //EFFECTS: returns the next phrase in this game that needs a word
    //TODO: remove this method
//    public Phrase getNextPhraseNeedingWord() {
//        for (int i = currentPhraseIndex; i < phrases.size(); i++){
//            if (!phrases.get(currentPhraseIndex).needsWord()){
//                currentPhraseIndex++;
//            } else {
//                numWordsNeeded--;
//                return phrases.get(currentPhraseIndex++);
//            }
//        }
//        throw new IllegalStateException();
//    }

    //EFFECTS: returns true if more words are needed
    //TODO: remove this method
//    public boolean needMoreWords() {
//        return numWordsNeeded > 0;
//    }
}
