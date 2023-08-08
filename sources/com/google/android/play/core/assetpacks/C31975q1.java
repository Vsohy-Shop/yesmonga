package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.play.core.assetpacks.q1 */
public final /* synthetic */ class C31975q1 implements FilenameFilter {

    /* renamed from: a */
    public final String f78058a;

    public C31975q1(String str) {
        this.f78058a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f78058a).concat("-")) && str.endsWith(".apk");
    }
}
