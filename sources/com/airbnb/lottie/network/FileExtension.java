package com.airbnb.lottie.network;

import androidx.multidex.MultiDexExtractor;
import com.airbnb.lottie.utils.C21682f;

public enum FileExtension {
    f55865a(".json"),
    ZIP(MultiDexExtractor.f50287y);
    
    public final String extension;

    /* access modifiers changed from: public */
    FileExtension(String str) {
        this.extension = str;
    }

    /* renamed from: b */
    public static FileExtension m99532b(String str) {
        for (FileExtension fileExtension : values()) {
            if (str.endsWith(fileExtension.extension)) {
                return fileExtension;
            }
        }
        C21682f.m99760e("Unable to find correct extension for " + str);
        return f55865a;
    }

    /* renamed from: g */
    public String mo64517g() {
        return ".temp" + this.extension;
    }

    public String toString() {
        return this.extension;
    }
}
