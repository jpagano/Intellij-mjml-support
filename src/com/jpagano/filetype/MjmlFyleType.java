package com.jpagano.filetype;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.vfs.VirtualFile;
import com.jpagano.icon.MjmIcon;
import com.jpagano.language.MjmlLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MjmlFyleType extends LanguageFileType {
    public static final MjmlFyleType INSTANCE = new MjmlFyleType();

    private MjmlFyleType() {
        super(MjmlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "MJML file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "MJML language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "mjml";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MjmIcon.FILE;
    }

    @Override
    public String getCharset(@NotNull VirtualFile virtualFile, @NotNull byte[] bytes) {
        return "UTF-8";
    }
}
