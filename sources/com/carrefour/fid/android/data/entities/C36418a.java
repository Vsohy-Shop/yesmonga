package com.carrefour.fid.android.data.entities;

import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.a */
public final class C36418a {

    /* renamed from: e */
    public static final int f90062e = 0;
    @C33608c("card_id")
    @C12579k

    /* renamed from: a */
    public final String f90063a;
    @C33608c("channel")
    @C12579k

    /* renamed from: b */
    public final String f90064b;
    @C33608c("date")
    @C12579k

    /* renamed from: c */
    public final String f90065c;
    @C33608c("is_offline")

    /* renamed from: d */
    public final boolean f90066d;

    public C36418a(@C12579k String str, @C12579k String str2, @C12579k String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "cardId");
        Intrinsics.checkNotNullParameter(str2, "channel");
        Intrinsics.checkNotNullParameter(str3, "date");
        this.f90063a = str;
        this.f90064b = str2;
        this.f90065c = str3;
        this.f90066d = z;
    }

    /* renamed from: f */
    public static /* synthetic */ C36418a m149369f(C36418a aVar, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f90063a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f90064b;
        }
        if ((i & 4) != 0) {
            str3 = aVar.f90065c;
        }
        if ((i & 8) != 0) {
            z = aVar.f90066d;
        }
        return aVar.mo110851e(str, str2, str3, z);
    }

    @C12579k
    /* renamed from: a */
    public final String mo110847a() {
        return this.f90063a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo110848b() {
        return this.f90064b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo110849c() {
        return this.f90065c;
    }

    /* renamed from: d */
    public final boolean mo110850d() {
        return this.f90066d;
    }

    @C12579k
    /* renamed from: e */
    public final C36418a mo110851e(@C12579k String str, @C12579k String str2, @C12579k String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "cardId");
        Intrinsics.checkNotNullParameter(str2, "channel");
        Intrinsics.checkNotNullParameter(str3, "date");
        return new C36418a(str, str2, str3, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36418a)) {
            return false;
        }
        C36418a aVar = (C36418a) obj;
        return Intrinsics.areEqual((Object) this.f90063a, (Object) aVar.f90063a) && Intrinsics.areEqual((Object) this.f90064b, (Object) aVar.f90064b) && Intrinsics.areEqual((Object) this.f90065c, (Object) aVar.f90065c) && this.f90066d == aVar.f90066d;
    }

    @C12579k
    /* renamed from: g */
    public final String mo110853g() {
        return this.f90063a;
    }

    @C12579k
    /* renamed from: h */
    public final String mo110854h() {
        return this.f90064b;
    }

    public int hashCode() {
        int hashCode = ((((this.f90063a.hashCode() * 31) + this.f90064b.hashCode()) * 31) + this.f90065c.hashCode()) * 31;
        boolean z = this.f90066d;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final String mo110856i() {
        return this.f90065c;
    }

    /* renamed from: j */
    public final boolean mo110857j() {
        return this.f90066d;
    }

    @C12579k
    public String toString() {
        String str = this.f90063a;
        String str2 = this.f90064b;
        String str3 = this.f90065c;
        boolean z = this.f90066d;
        return "EmissionInfos(cardId=" + str + ", channel=" + str2 + ", date=" + str3 + ", isOffline=" + z + ")";
    }
}
