package com.carrefour.fid.android.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.models.s */
public final class C38527s {

    /* renamed from: d */
    public static final int f97659d = 0;

    /* renamed from: a */
    public final boolean f97660a;

    /* renamed from: b */
    public final boolean f97661b;
    @C12579k

    /* renamed from: c */
    public final String f97662c;

    public C38527s() {
        this(false, false, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ C38527s m159809e(C38527s sVar, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sVar.f97660a;
        }
        if ((i & 2) != 0) {
            z2 = sVar.f97661b;
        }
        if ((i & 4) != 0) {
            str = sVar.f97662c;
        }
        return sVar.mo122150d(z, z2, str);
    }

    /* renamed from: a */
    public final boolean mo122147a() {
        return this.f97660a;
    }

    /* renamed from: b */
    public final boolean mo122148b() {
        return this.f97661b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo122149c() {
        return this.f97662c;
    }

    @C12579k
    /* renamed from: d */
    public final C38527s mo122150d(boolean z, boolean z2, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "moreInformation");
        return new C38527s(z, z2, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38527s)) {
            return false;
        }
        C38527s sVar = (C38527s) obj;
        return this.f97660a == sVar.f97660a && this.f97661b == sVar.f97661b && Intrinsics.areEqual((Object) this.f97662c, (Object) sVar.f97662c);
    }

    @C12579k
    /* renamed from: f */
    public final String mo122152f() {
        return this.f97662c;
    }

    /* renamed from: g */
    public final boolean mo122153g() {
        return this.f97661b;
    }

    /* renamed from: h */
    public final boolean mo122154h() {
        return this.f97660a;
    }

    public int hashCode() {
        boolean z = this.f97660a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f97661b;
        if (!z3) {
            z2 = z3;
        }
        return ((i + (z2 ? 1 : 0)) * 31) + this.f97662c.hashCode();
    }

    @C12579k
    public String toString() {
        boolean z = this.f97660a;
        boolean z2 = this.f97661b;
        String str = this.f97662c;
        return "ServiceStationModel(isTicketAlreadyUsed=" + z + ", isSuccess=" + z2 + ", moreInformation=" + str + ")";
    }

    public C38527s(boolean z, boolean z2, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "moreInformation");
        this.f97660a = z;
        this.f97661b = z2;
        this.f97662c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38527s(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? new String() : str);
    }
}
