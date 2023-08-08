package com.carrefour.fid.android.design.components.compose;

import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.compose.n */
public final class C37018n {

    /* renamed from: d */
    public static final int f92531d = 8;

    /* renamed from: a */
    public int f92532a;
    @C12579k

    /* renamed from: b */
    public String f92533b;
    @C12579k

    /* renamed from: c */
    public String f92534c;

    public C37018n(@C0375v int i, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "serviceTitle");
        Intrinsics.checkNotNullParameter(str2, "serviceSteadySubTitle");
        this.f92532a = i;
        this.f92533b = str;
        this.f92534c = str2;
    }

    /* renamed from: e */
    public static /* synthetic */ C37018n m151897e(C37018n nVar, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nVar.f92532a;
        }
        if ((i2 & 2) != 0) {
            str = nVar.f92533b;
        }
        if ((i2 & 4) != 0) {
            str2 = nVar.f92534c;
        }
        return nVar.mo112645d(i, str, str2);
    }

    /* renamed from: a */
    public final int mo112642a() {
        return this.f92532a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo112643b() {
        return this.f92533b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo112644c() {
        return this.f92534c;
    }

    @C12579k
    /* renamed from: d */
    public final C37018n mo112645d(@C0375v int i, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "serviceTitle");
        Intrinsics.checkNotNullParameter(str2, "serviceSteadySubTitle");
        return new C37018n(i, str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37018n)) {
            return false;
        }
        C37018n nVar = (C37018n) obj;
        return this.f92532a == nVar.f92532a && Intrinsics.areEqual((Object) this.f92533b, (Object) nVar.f92533b) && Intrinsics.areEqual((Object) this.f92534c, (Object) nVar.f92534c);
    }

    /* renamed from: f */
    public final int mo112647f() {
        return this.f92532a;
    }

    @C12579k
    /* renamed from: g */
    public final String mo112648g() {
        return this.f92534c;
    }

    @C12579k
    /* renamed from: h */
    public final String mo112649h() {
        return this.f92533b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f92532a) * 31) + this.f92533b.hashCode()) * 31) + this.f92534c.hashCode();
    }

    /* renamed from: i */
    public final void mo112651i(int i) {
        this.f92532a = i;
    }

    /* renamed from: j */
    public final void mo112652j(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f92534c = str;
    }

    /* renamed from: k */
    public final void mo112653k(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f92533b = str;
    }

    @C12579k
    public String toString() {
        int i = this.f92532a;
        String str = this.f92533b;
        String str2 = this.f92534c;
        return "SetSteadyServiceInformation(serviceImage=" + i + ", serviceTitle=" + str + ", serviceSteadySubTitle=" + str2 + ")";
    }
}
