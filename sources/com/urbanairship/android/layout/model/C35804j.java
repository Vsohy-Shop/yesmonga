package com.urbanairship.android.layout.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.model.j */
public final class C35804j {
    @C12580l

    /* renamed from: a */
    public final String f88423a;

    public C35804j(@C12580l String str) {
        this.f88423a = str;
    }

    /* renamed from: c */
    public static /* synthetic */ C35804j m147609c(C35804j jVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jVar.f88423a;
        }
        return jVar.mo107230b(str);
    }

    @C12580l
    /* renamed from: a */
    public final String mo107229a() {
        return this.f88423a;
    }

    @C12579k
    /* renamed from: b */
    public final C35804j mo107230b(@C12580l String str) {
        return new C35804j(str);
    }

    @C12580l
    /* renamed from: d */
    public final String mo107231d() {
        return this.f88423a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35804j) && Intrinsics.areEqual((Object) this.f88423a, (Object) ((C35804j) obj).f88423a);
    }

    public int hashCode() {
        String str = this.f88423a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @C12579k
    public String toString() {
        return "ModelProperties(pagerPageId=" + this.f88423a + ')';
    }
}
