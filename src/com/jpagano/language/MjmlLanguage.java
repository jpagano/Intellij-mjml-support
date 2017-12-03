package com.jpagano.language;

import com.intellij.lang.Language;

public class MjmlLanguage extends Language {
    public static final MjmlLanguage INSTANCE = new MjmlLanguage();

    private MjmlLanguage() {
        super("MJML");
    }
}
