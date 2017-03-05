package de.origindd.mpeg.custom;

import de.origindd.mpeg.mpeg7._2004.KeywordAnnotationType;

import static de.origindd.extractor.service.Constants.LANGUAGE;

public class SetAbleKeywordAnnotationType extends KeywordAnnotationType {

    public void addKeyword(String description){
        getKeyword().add(new CustomKeyword(description, LANGUAGE));
    }

    class CustomKeyword extends Keyword {

        public CustomKeyword(
                String value,
                String language
        ){
            this.value = value;
            this.lang = language;
        }

        public void setValue(String value){
            this.value = value;
        }
    }
}
