package com.carrefour.fid.android.shared.network;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.network.g */
public final class C28811g {

    /* renamed from: c */
    public static final int f70607c = 0;
    @C12579k

    /* renamed from: a */
    public final String f70608a;
    @C12579k

    /* renamed from: b */
    public final String f70609b;

    public C28811g(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "idToken");
        Intrinsics.checkNotNullParameter(str2, "accessToken");
        this.f70608a = str;
        this.f70609b = str2;
    }

    /* renamed from: d */
    public static /* synthetic */ C28811g m119235d(C28811g gVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gVar.f70608a;
        }
        if ((i & 2) != 0) {
            str2 = gVar.f70609b;
        }
        return gVar.mo83885c(str, str2);
    }

    @C12579k
    /* renamed from: a */
    public final String mo83883a() {
        return this.f70608a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo83884b() {
        return this.f70609b;
    }

    @C12579k
    /* renamed from: c */
    public final C28811g mo83885c(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "idToken");
        Intrinsics.checkNotNullParameter(str2, "accessToken");
        return new C28811g(str, str2);
    }

    @C12579k
    /* renamed from: e */
    public final String mo83886e() {
        return this.f70609b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28811g)) {
            return false;
        }
        C28811g gVar = (C28811g) obj;
        return Intrinsics.areEqual((Object) this.f70608a, (Object) gVar.f70608a) && Intrinsics.areEqual((Object) this.f70609b, (Object) gVar.f70609b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo83888f() {
        return this.f70608a;
    }

    public int hashCode() {
        return (this.f70608a.hashCode() * 31) + this.f70609b.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f70608a;
        String str2 = this.f70609b;
        return "Token(idToken=" + str + ", accessToken=" + str2 + ")";
    }
}
