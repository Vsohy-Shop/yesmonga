package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.C32652i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.google.firebase.crashlytics.ktx.c */
public final class C32963c {
    @C12579k

    /* renamed from: a */
    public final C32652i f80075a;

    public C32963c(@C12579k C32652i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "crashlytics");
        this.f80075a = iVar;
    }

    /* renamed from: a */
    public final void mo95617a(@C12579k String str, double d) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f80075a.mo94830k(str, d);
    }

    /* renamed from: b */
    public final void mo95618b(@C12579k String str, float f) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f80075a.mo94831l(str, f);
    }

    /* renamed from: c */
    public final void mo95619c(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f80075a.mo94832m(str, i);
    }

    /* renamed from: d */
    public final void mo95620d(@C12579k String str, long j) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f80075a.mo94833n(str, j);
    }

    /* renamed from: e */
    public final void mo95621e(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "value");
        this.f80075a.mo94834o(str, str2);
    }

    /* renamed from: f */
    public final void mo95622f(@C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f80075a.mo94835p(str, z);
    }
}
