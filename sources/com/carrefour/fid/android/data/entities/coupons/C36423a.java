package com.carrefour.fid.android.data.entities.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.google.gson.annotations.C33608c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.coupons.a */
public final class C36423a {

    /* renamed from: d */
    public static final int f90074d = 0;
    @C33608c("channel")
    @C12579k

    /* renamed from: a */
    public final String f90075a;
    @C33608c("card_id")
    @C12579k

    /* renamed from: b */
    public final String f90076b;
    @C33608c("date")
    @C12579k

    /* renamed from: c */
    public final String f90077c;

    public C36423a() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ C36423a m149463e(C36423a aVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f90075a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f90076b;
        }
        if ((i & 4) != 0) {
            str3 = aVar.f90077c;
        }
        return aVar.mo110952d(str, str2, str3);
    }

    @C12579k
    /* renamed from: a */
    public final String mo110949a() {
        return this.f90075a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo110950b() {
        return this.f90076b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo110951c() {
        return this.f90077c;
    }

    @C12579k
    /* renamed from: d */
    public final C36423a mo110952d(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "channel");
        Intrinsics.checkNotNullParameter(str2, "cardId");
        Intrinsics.checkNotNullParameter(str3, "date");
        return new C36423a(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36423a)) {
            return false;
        }
        C36423a aVar = (C36423a) obj;
        return Intrinsics.areEqual((Object) this.f90075a, (Object) aVar.f90075a) && Intrinsics.areEqual((Object) this.f90076b, (Object) aVar.f90076b) && Intrinsics.areEqual((Object) this.f90077c, (Object) aVar.f90077c);
    }

    @C12579k
    /* renamed from: f */
    public final String mo110954f() {
        return this.f90076b;
    }

    @C12579k
    /* renamed from: g */
    public final String mo110955g() {
        return this.f90075a;
    }

    @C12579k
    /* renamed from: h */
    public final String mo110956h() {
        return this.f90077c;
    }

    public int hashCode() {
        return (((this.f90075a.hashCode() * 31) + this.f90076b.hashCode()) * 31) + this.f90077c.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f90075a;
        String str2 = this.f90076b;
        String str3 = this.f90077c;
        return "APIMCouponInfos(channel=" + str + ", cardId=" + str2 + ", date=" + str3 + ")";
    }

    public C36423a(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "channel");
        Intrinsics.checkNotNullParameter(str2, "cardId");
        Intrinsics.checkNotNullParameter(str3, "date");
        this.f90075a = str;
        this.f90076b = str2;
        this.f90077c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36423a(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C28534f.f69149d0 : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
