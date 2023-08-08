package com.carrefour.fid.android.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.models.c */
public final class C38455c {

    /* renamed from: d */
    public static final int f97576d = 0;
    @C12579k

    /* renamed from: a */
    public final String f97577a;
    @C12579k

    /* renamed from: b */
    public final String f97578b;
    @C12579k

    /* renamed from: c */
    public final String f97579c;

    public C38455c(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "productId");
        Intrinsics.checkNotNullParameter(str2, "productName");
        Intrinsics.checkNotNullParameter(str3, "slug");
        this.f97577a = str;
        this.f97578b = str2;
        this.f97579c = str3;
    }

    /* renamed from: e */
    public static /* synthetic */ C38455c m159520e(C38455c cVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f97577a;
        }
        if ((i & 2) != 0) {
            str2 = cVar.f97578b;
        }
        if ((i & 4) != 0) {
            str3 = cVar.f97579c;
        }
        return cVar.mo122008d(str, str2, str3);
    }

    @C12579k
    /* renamed from: a */
    public final String mo122005a() {
        return this.f97577a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo122006b() {
        return this.f97578b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo122007c() {
        return this.f97579c;
    }

    @C12579k
    /* renamed from: d */
    public final C38455c mo122008d(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "productId");
        Intrinsics.checkNotNullParameter(str2, "productName");
        Intrinsics.checkNotNullParameter(str3, "slug");
        return new C38455c(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38455c)) {
            return false;
        }
        C38455c cVar = (C38455c) obj;
        return Intrinsics.areEqual((Object) this.f97577a, (Object) cVar.f97577a) && Intrinsics.areEqual((Object) this.f97578b, (Object) cVar.f97578b) && Intrinsics.areEqual((Object) this.f97579c, (Object) cVar.f97579c);
    }

    @C12579k
    /* renamed from: f */
    public final String mo122010f() {
        return this.f97577a;
    }

    @C12579k
    /* renamed from: g */
    public final String mo122011g() {
        return this.f97578b;
    }

    @C12579k
    /* renamed from: h */
    public final String mo122012h() {
        return this.f97579c;
    }

    public int hashCode() {
        return (((this.f97577a.hashCode() * 31) + this.f97578b.hashCode()) * 31) + this.f97579c.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f97577a;
        String str2 = this.f97578b;
        String str3 = this.f97579c;
        return "CatalogProductDetails(productId=" + str + ", productName=" + str2 + ", slug=" + str3 + ")";
    }
}
