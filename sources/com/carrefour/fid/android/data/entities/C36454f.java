package com.carrefour.fid.android.data.entities;

import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.f */
public final class C36454f {

    /* renamed from: f */
    public static final int f90113f = 0;
    @C33608c("status")
    @C12580l

    /* renamed from: a */
    public final String f90114a;
    @C33608c("ean13")
    @C12579k

    /* renamed from: b */
    public final String f90115b;
    @C33608c("is_success")

    /* renamed from: c */
    public final boolean f90116c;
    @C33608c("error")
    @C12580l

    /* renamed from: d */
    public final C36441e f90117d;
    @C33608c("emission_infos")
    @C12580l

    /* renamed from: e */
    public final C36418a f90118e;

    public C36454f(@C12580l String str, @C12579k String str2, boolean z, @C12580l C36441e eVar, @C12580l C36418a aVar) {
        Intrinsics.checkNotNullParameter(str2, "ean13");
        this.f90114a = str;
        this.f90115b = str2;
        this.f90116c = z;
        this.f90117d = eVar;
        this.f90118e = aVar;
    }

    /* renamed from: g */
    public static /* synthetic */ C36454f m149527g(C36454f fVar, String str, String str2, boolean z, C36441e eVar, C36418a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fVar.f90114a;
        }
        if ((i & 2) != 0) {
            str2 = fVar.f90115b;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = fVar.f90116c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            eVar = fVar.f90117d;
        }
        C36441e eVar2 = eVar;
        if ((i & 16) != 0) {
            aVar = fVar.f90118e;
        }
        return fVar.mo111072f(str, str3, z2, eVar2, aVar);
    }

    @C12580l
    /* renamed from: a */
    public final String mo111066a() {
        return this.f90114a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo111067b() {
        return this.f90115b;
    }

    /* renamed from: c */
    public final boolean mo111068c() {
        return this.f90116c;
    }

    @C12580l
    /* renamed from: d */
    public final C36441e mo111069d() {
        return this.f90117d;
    }

    @C12580l
    /* renamed from: e */
    public final C36418a mo111070e() {
        return this.f90118e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36454f)) {
            return false;
        }
        C36454f fVar = (C36454f) obj;
        return Intrinsics.areEqual((Object) this.f90114a, (Object) fVar.f90114a) && Intrinsics.areEqual((Object) this.f90115b, (Object) fVar.f90115b) && this.f90116c == fVar.f90116c && Intrinsics.areEqual((Object) this.f90117d, (Object) fVar.f90117d) && Intrinsics.areEqual((Object) this.f90118e, (Object) fVar.f90118e);
    }

    @C12579k
    /* renamed from: f */
    public final C36454f mo111072f(@C12580l String str, @C12579k String str2, boolean z, @C12580l C36441e eVar, @C12580l C36418a aVar) {
        Intrinsics.checkNotNullParameter(str2, "ean13");
        return new C36454f(str, str2, z, eVar, aVar);
    }

    @C12579k
    /* renamed from: h */
    public final String mo111073h() {
        return this.f90115b;
    }

    public int hashCode() {
        String str = this.f90114a;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f90115b.hashCode()) * 31;
        boolean z = this.f90116c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        C36441e eVar = this.f90117d;
        int hashCode2 = (i2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        C36418a aVar = this.f90118e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 + i;
    }

    @C12580l
    /* renamed from: i */
    public final C36418a mo111075i() {
        return this.f90118e;
    }

    @C12580l
    /* renamed from: j */
    public final C36441e mo111076j() {
        return this.f90117d;
    }

    @C12580l
    /* renamed from: k */
    public final String mo111077k() {
        return this.f90114a;
    }

    /* renamed from: l */
    public final boolean mo111078l() {
        return this.f90116c;
    }

    @C12579k
    public String toString() {
        String str = this.f90114a;
        String str2 = this.f90115b;
        boolean z = this.f90116c;
        C36441e eVar = this.f90117d;
        C36418a aVar = this.f90118e;
        return "UpdatedCouponResponse(status=" + str + ", ean13=" + str2 + ", isSuccess=" + z + ", error=" + eVar + ", emissionInfos=" + aVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36454f(String str, String str2, boolean z, C36441e eVar, C36418a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, z, eVar, aVar);
    }
}
