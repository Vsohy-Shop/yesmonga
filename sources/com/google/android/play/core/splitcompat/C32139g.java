package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.g */
public final class C32139g implements C32142j {

    /* renamed from: a */
    public final /* synthetic */ C32151s f78365a;

    /* renamed from: b */
    public final /* synthetic */ Set f78366b;

    /* renamed from: c */
    public final /* synthetic */ AtomicBoolean f78367c;

    /* renamed from: d */
    public final /* synthetic */ C32145m f78368d;

    public C32139g(C32145m mVar, C32151s sVar, Set set, AtomicBoolean atomicBoolean) {
        this.f78368d = mVar;
        this.f78365a = sVar;
        this.f78366b = set;
        this.f78367c = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo92906a(ZipFile zipFile, Set<C32144l> set) throws IOException {
        this.f78368d.mo92909f(this.f78365a, set, new C32138f(this));
    }
}
