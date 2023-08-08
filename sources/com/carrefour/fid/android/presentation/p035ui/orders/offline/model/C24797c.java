package com.carrefour.fid.android.presentation.p035ui.orders.offline.model;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.c */
public final class C24797c implements C24798d {

    /* renamed from: g */
    public static final int f61505g = 0;

    /* renamed from: a */
    public final int f61506a;
    @C12579k

    /* renamed from: b */
    public final String f61507b;
    @C12579k

    /* renamed from: c */
    public final String f61508c;
    @C12579k

    /* renamed from: d */
    public final String f61509d;
    @C12579k

    /* renamed from: e */
    public final String f61510e;
    @C12579k

    /* renamed from: f */
    public final String f61511f;

    public C24797c(int i, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "orderStoreName");
        Intrinsics.checkNotNullParameter(str2, "orderStoreAddress");
        Intrinsics.checkNotNullParameter(str3, "orderAmount");
        Intrinsics.checkNotNullParameter(str4, "orderDate");
        Intrinsics.checkNotNullParameter(str5, "downloadBillReceiptUrl");
        this.f61506a = i;
        this.f61507b = str;
        this.f61508c = str2;
        this.f61509d = str3;
        this.f61510e = str4;
        this.f61511f = str5;
    }

    /* renamed from: h */
    public static /* synthetic */ C24797c m108053h(C24797c cVar, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cVar.f61506a;
        }
        if ((i2 & 2) != 0) {
            str = cVar.f61507b;
        }
        String str6 = str;
        if ((i2 & 4) != 0) {
            str2 = cVar.f61508c;
        }
        String str7 = str2;
        if ((i2 & 8) != 0) {
            str3 = cVar.f61509d;
        }
        String str8 = str3;
        if ((i2 & 16) != 0) {
            str4 = cVar.f61510e;
        }
        String str9 = str4;
        if ((i2 & 32) != 0) {
            str5 = cVar.f61511f;
        }
        return cVar.mo72410g(i, str6, str7, str8, str9, str5);
    }

    /* renamed from: a */
    public final int mo72403a() {
        return this.f61506a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo72404b() {
        return this.f61507b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo72405c() {
        return this.f61508c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo72406d() {
        return this.f61509d;
    }

    @C12579k
    /* renamed from: e */
    public final String mo72407e() {
        return this.f61510e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24797c)) {
            return false;
        }
        C24797c cVar = (C24797c) obj;
        return this.f61506a == cVar.f61506a && Intrinsics.areEqual((Object) this.f61507b, (Object) cVar.f61507b) && Intrinsics.areEqual((Object) this.f61508c, (Object) cVar.f61508c) && Intrinsics.areEqual((Object) this.f61509d, (Object) cVar.f61509d) && Intrinsics.areEqual((Object) this.f61510e, (Object) cVar.f61510e) && Intrinsics.areEqual((Object) this.f61511f, (Object) cVar.f61511f);
    }

    @C12579k
    /* renamed from: f */
    public final String mo72409f() {
        return this.f61511f;
    }

    @C12579k
    /* renamed from: g */
    public final C24797c mo72410g(int i, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5) {
        Intrinsics.checkNotNullParameter(str, "orderStoreName");
        Intrinsics.checkNotNullParameter(str2, "orderStoreAddress");
        Intrinsics.checkNotNullParameter(str3, "orderAmount");
        Intrinsics.checkNotNullParameter(str4, "orderDate");
        Intrinsics.checkNotNullParameter(str5, "downloadBillReceiptUrl");
        return new C24797c(i, str, str2, str3, str4, str5);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f61506a) * 31) + this.f61507b.hashCode()) * 31) + this.f61508c.hashCode()) * 31) + this.f61509d.hashCode()) * 31) + this.f61510e.hashCode()) * 31) + this.f61511f.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo72412i() {
        return this.f61511f;
    }

    @C12579k
    /* renamed from: j */
    public final String mo72413j() {
        return this.f61509d;
    }

    @C12579k
    /* renamed from: k */
    public final String mo72414k() {
        return this.f61510e;
    }

    @C12579k
    /* renamed from: l */
    public final String mo72415l() {
        return this.f61508c;
    }

    @C12579k
    /* renamed from: m */
    public final String mo72416m() {
        return this.f61507b;
    }

    /* renamed from: n */
    public final int mo72417n() {
        return this.f61506a;
    }

    @C12579k
    public String toString() {
        int i = this.f61506a;
        String str = this.f61507b;
        String str2 = this.f61508c;
        String str3 = this.f61509d;
        String str4 = this.f61510e;
        String str5 = this.f61511f;
        return "OrdersOfflineDetailsHeaderModel(viewType=" + i + ", orderStoreName=" + str + ", orderStoreAddress=" + str2 + ", orderAmount=" + str3 + ", orderDate=" + str4 + ", downloadBillReceiptUrl=" + str5 + ")";
    }
}
