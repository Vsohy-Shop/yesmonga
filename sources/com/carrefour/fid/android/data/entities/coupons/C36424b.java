package com.carrefour.fid.android.data.entities.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.coupons.b */
public final class C36424b {

    /* renamed from: c */
    public static final int f90078c = 0;
    @C33608c("ean13")
    @C12579k

    /* renamed from: a */
    public final String f90079a;
    @C33608c("infos")
    @C12579k

    /* renamed from: b */
    public final C36423a f90080b;

    public C36424b(@C12579k String str, @C12579k C36423a aVar) {
        Intrinsics.checkNotNullParameter(str, "ean13");
        Intrinsics.checkNotNullParameter(aVar, "infos");
        this.f90079a = str;
        this.f90080b = aVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C36424b m149471d(C36424b bVar, String str, C36423a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f90079a;
        }
        if ((i & 2) != 0) {
            aVar = bVar.f90080b;
        }
        return bVar.mo110961c(str, aVar);
    }

    @C12579k
    /* renamed from: a */
    public final String mo110959a() {
        return this.f90079a;
    }

    @C12579k
    /* renamed from: b */
    public final C36423a mo110960b() {
        return this.f90080b;
    }

    @C12579k
    /* renamed from: c */
    public final C36424b mo110961c(@C12579k String str, @C12579k C36423a aVar) {
        Intrinsics.checkNotNullParameter(str, "ean13");
        Intrinsics.checkNotNullParameter(aVar, "infos");
        return new C36424b(str, aVar);
    }

    @C12579k
    /* renamed from: e */
    public final String mo110962e() {
        return this.f90079a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36424b)) {
            return false;
        }
        C36424b bVar = (C36424b) obj;
        return Intrinsics.areEqual((Object) this.f90079a, (Object) bVar.f90079a) && Intrinsics.areEqual((Object) this.f90080b, (Object) bVar.f90080b);
    }

    @C12579k
    /* renamed from: f */
    public final C36423a mo110964f() {
        return this.f90080b;
    }

    public int hashCode() {
        return (this.f90079a.hashCode() * 31) + this.f90080b.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f90079a;
        C36423a aVar = this.f90080b;
        return "APIMCouponOperationData(ean13=" + str + ", infos=" + aVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36424b(String str, C36423a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, aVar);
    }
}
