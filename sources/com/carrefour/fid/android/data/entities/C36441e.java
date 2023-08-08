package com.carrefour.fid.android.data.entities;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.google.gson.annotations.C33608c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.e */
public final class C36441e {

    /* renamed from: e */
    public static final int f90107e = 0;
    @C33608c("http_message")
    @C12579k

    /* renamed from: a */
    public final String f90108a;
    @C33608c("http_code")
    @C12579k

    /* renamed from: b */
    public final String f90109b;
    @C33608c("code")
    @C12579k

    /* renamed from: c */
    public final String f90110c;
    @C33608c("more_information")
    @C12579k

    /* renamed from: d */
    public final String f90111d;

    public C36441e(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(str2, "httpCode");
        Intrinsics.checkNotNullParameter(str3, "code");
        Intrinsics.checkNotNullParameter(str4, C28531e0.f69094x);
        this.f90108a = str;
        this.f90109b = str2;
        this.f90110c = str3;
        this.f90111d = str4;
    }

    /* renamed from: f */
    public static /* synthetic */ C36441e m149501f(C36441e eVar, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.f90108a;
        }
        if ((i & 2) != 0) {
            str2 = eVar.f90109b;
        }
        if ((i & 4) != 0) {
            str3 = eVar.f90110c;
        }
        if ((i & 8) != 0) {
            str4 = eVar.f90111d;
        }
        return eVar.mo111056e(str, str2, str3, str4);
    }

    @C12579k
    /* renamed from: a */
    public final String mo111052a() {
        return this.f90108a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo111053b() {
        return this.f90109b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo111054c() {
        return this.f90110c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo111055d() {
        return this.f90111d;
    }

    @C12579k
    /* renamed from: e */
    public final C36441e mo111056e(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(str2, "httpCode");
        Intrinsics.checkNotNullParameter(str3, "code");
        Intrinsics.checkNotNullParameter(str4, C28531e0.f69094x);
        return new C36441e(str, str2, str3, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36441e)) {
            return false;
        }
        C36441e eVar = (C36441e) obj;
        return Intrinsics.areEqual((Object) this.f90108a, (Object) eVar.f90108a) && Intrinsics.areEqual((Object) this.f90109b, (Object) eVar.f90109b) && Intrinsics.areEqual((Object) this.f90110c, (Object) eVar.f90110c) && Intrinsics.areEqual((Object) this.f90111d, (Object) eVar.f90111d);
    }

    @C12579k
    /* renamed from: g */
    public final String mo111058g() {
        return this.f90110c;
    }

    @C12579k
    /* renamed from: h */
    public final String mo111059h() {
        return this.f90109b;
    }

    public int hashCode() {
        return (((((this.f90108a.hashCode() * 31) + this.f90109b.hashCode()) * 31) + this.f90110c.hashCode()) * 31) + this.f90111d.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo111061i() {
        return this.f90111d;
    }

    @C12579k
    /* renamed from: j */
    public final String mo111062j() {
        return this.f90108a;
    }

    @C12579k
    public String toString() {
        String str = this.f90108a;
        String str2 = this.f90109b;
        String str3 = this.f90110c;
        String str4 = this.f90111d;
        return "UpdatedCouponErrorResponse(message=" + str + ", httpCode=" + str2 + ", code=" + str3 + ", info=" + str4 + ")";
    }
}
