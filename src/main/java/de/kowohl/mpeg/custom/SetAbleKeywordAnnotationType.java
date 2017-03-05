package de.kowohl.mpeg.custom;

import de.kowohl.mpeg.mpeg7._2004.KeywordAnnotationType;

import static de.kowohl.extractor.service.Constants.LANGUAGE;

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
