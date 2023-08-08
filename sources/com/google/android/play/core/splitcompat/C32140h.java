package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.h */
public final class C32140h implements C32142j {

    /* renamed from: a */
    public final /* synthetic */ Set f78369a;

    /* renamed from: b */
    public final /* synthetic */ C32151s f78370b;

    /* renamed from: c */
    public final /* synthetic */ C32145m f78371c;

    public C32140h(C32145m mVar, Set set, C32151s sVar) {
        this.f78371c = mVar;
        this.f78369a = set;
        this.f78370b = sVar;
    }

    /* renamed from: a */
    public final void mo92906a(ZipFile zipFile, Set<C32144l> set) throws IOException {
        this.f78369a.addAll(C32145m.m130095d(this.f78371c, set, this.f78370b, zipFile));
    }
}
