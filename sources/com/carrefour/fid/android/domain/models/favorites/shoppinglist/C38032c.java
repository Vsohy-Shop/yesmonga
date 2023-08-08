package com.carrefour.fid.android.domain.models.favorites.shoppinglist;

import com.carrefour.fid.android.domain.models.product.Gtin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.favorites.shoppinglist.c */
public final class C38032c {
    @C12579k

    /* renamed from: a */
    public final String f95868a;
    @C12579k

    /* renamed from: b */
    public final String f95869b;
    @C12579k

    /* renamed from: c */
    public final String f95870c;

    public /* synthetic */ C38032c(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    /* renamed from: e */
    public static /* synthetic */ C38032c m156804e(C38032c cVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f95868a;
        }
        if ((i & 2) != 0) {
            str2 = cVar.f95869b;
        }
        if ((i & 4) != 0) {
            str3 = cVar.f95870c;
        }
        return cVar.mo117717d(str, str2, str3);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117714a() {
        return this.f95868a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117715b() {
        return this.f95869b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo117716c() {
        return this.f95870c;
    }

    @C12579k
    /* renamed from: d */
    public final C38032c mo117717d(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "packaging");
        return new C38032c(str, str2, str3, (DefaultConstructorMarker) null);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38032c)) {
            return false;
        }
        C38032c cVar = (C38032c) obj;
        return Gtin.m157311e(this.f95868a, cVar.f95868a) && Intrinsics.areEqual((Object) this.f95869b, (Object) cVar.f95869b) && Intrinsics.areEqual((Object) this.f95870c, (Object) cVar.f95870c);
    }

    @C12579k
    /* renamed from: f */
    public final String mo117719f() {
        return this.f95868a;
    }

    @C12579k
    /* renamed from: g */
    public final String mo117720g() {
        return this.f95869b;
    }

    @C12579k
    /* renamed from: h */
    public final String mo117721h() {
        return this.f95870c;
    }

    public int hashCode() {
        return (((Gtin.m157312g(this.f95868a) * 31) + this.f95869b.hashCode()) * 31) + this.f95870c.hashCode();
    }

    @C12579k
    public String toString() {
        String h = Gtin.m157313h(this.f95868a);
        String str = this.f95869b;
        String str2 = this.f95870c;
        return "ShoppingListParam(gtin=" + h + ", name=" + str + ", packaging=" + str2 + ")";
    }

    public C38032c(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "packaging");
        this.f95868a = str;
        this.f95869b = str2;
        this.f95870c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38032c(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (DefaultConstructorMarker) null);
    }
}
