package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.k */
public final class C38041k {

    /* renamed from: c */
    public static final int f95893c = 0;
    @C12579k

    /* renamed from: a */
    public final String f95894a;
    @C12579k

    /* renamed from: b */
    public final String f95895b;

    public C38041k(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "banner");
        this.f95894a = str;
        this.f95895b = str2;
    }

    /* renamed from: d */
    public static /* synthetic */ C38041k m156864d(C38041k kVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kVar.f95894a;
        }
        if ((i & 2) != 0) {
            str2 = kVar.f95895b;
        }
        return kVar.mo117782c(str, str2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117780a() {
        return this.f95894a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117781b() {
        return this.f95895b;
    }

    @C12579k
    /* renamed from: c */
    public final C38041k mo117782c(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "banner");
        return new C38041k(str, str2);
    }

    @C12579k
    /* renamed from: e */
    public final String mo117783e() {
        return this.f95895b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38041k)) {
            return false;
        }
        C38041k kVar = (C38041k) obj;
        return Intrinsics.areEqual((Object) this.f95894a, (Object) kVar.f95894a) && Intrinsics.areEqual((Object) this.f95895b, (Object) kVar.f95895b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo117785f() {
        return this.f95894a;
    }

    public int hashCode() {
        return (this.f95894a.hashCode() * 31) + this.f95895b.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f95894a;
        String str2 = this.f95895b;
        return "Facility(name=" + str + ", banner=" + str2 + ")";
    }
}
