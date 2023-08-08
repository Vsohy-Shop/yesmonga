package com.carrefour.fid.android.design.components.compose;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.compose.e */
public final class C36983e {
    @C12579k

    /* renamed from: a */
    public final String f92378a;

    /* renamed from: b */
    public final int f92379b;

    public C36983e(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "url");
        this.f92378a = str;
        this.f92379b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ C36983e m151694d(C36983e eVar, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eVar.f92378a;
        }
        if ((i2 & 2) != 0) {
            i = eVar.f92379b;
        }
        return eVar.mo112374c(str, i);
    }

    @C12579k
    /* renamed from: a */
    public final String mo112372a() {
        return this.f92378a;
    }

    /* renamed from: b */
    public final int mo112373b() {
        return this.f92379b;
    }

    @C12579k
    /* renamed from: c */
    public final C36983e mo112374c(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "url");
        return new C36983e(str, i);
    }

    /* renamed from: e */
    public final int mo112375e() {
        return this.f92379b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36983e)) {
            return false;
        }
        C36983e eVar = (C36983e) obj;
        return Intrinsics.areEqual((Object) this.f92378a, (Object) eVar.f92378a) && this.f92379b == eVar.f92379b;
    }

    @C12579k
    /* renamed from: f */
    public final String mo112377f() {
        return this.f92378a;
    }

    public int hashCode() {
        return (this.f92378a.hashCode() * 31) + Integer.hashCode(this.f92379b);
    }

    @C12579k
    public String toString() {
        String str = this.f92378a;
        int i = this.f92379b;
        return "DetailUrl(url=" + str + ", index=" + i + ")";
    }
}
