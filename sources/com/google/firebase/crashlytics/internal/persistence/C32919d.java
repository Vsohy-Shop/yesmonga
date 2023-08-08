package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.firebase.crashlytics.internal.persistence.d */
public final /* synthetic */ class C32919d implements FilenameFilter {
    public final boolean accept(File file, String str) {
        return str.startsWith("event");
    }
}
