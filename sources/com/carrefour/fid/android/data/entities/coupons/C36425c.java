package com.carrefour.fid.android.data.entities.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.coupons.c */
public final class C36425c {

    /* renamed from: c */
    public static final int f90081c = 8;
    @C33608c("action")
    @C12579k

    /* renamed from: a */
    public final String f90082a;
    @C33608c("operation_data")
    @C12579k

    /* renamed from: b */
    public final List<C36424b> f90083b;

    public C36425c(@C12579k String str, @C12579k List<C36424b> list) {
        Intrinsics.checkNotNullParameter(str, "action");
        Intrinsics.checkNotNullParameter(list, "operationData");
        this.f90082a = str;
        this.f90083b = list;
    }

    /* renamed from: d */
    public static /* synthetic */ C36425c m149477d(C36425c cVar, String str, List<C36424b> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f90082a;
        }
        if ((i & 2) != 0) {
            list = cVar.f90083b;
        }
        return cVar.mo110969c(str, list);
    }

    @C12579k
    /* renamed from: a */
    public final String mo110967a() {
        return this.f90082a;
    }

    @C12579k
    /* renamed from: b */
    public final List<C36424b> mo110968b() {
        return this.f90083b;
    }

    @C12579k
    /* renamed from: c */
    public final C36425c mo110969c(@C12579k String str, @C12579k List<C36424b> list) {
        Intrinsics.checkNotNullParameter(str, "action");
        Intrinsics.checkNotNullParameter(list, "operationData");
        return new C36425c(str, list);
    }

    @C12579k
    /* renamed from: e */
    public final String mo110970e() {
        return this.f90082a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36425c)) {
            return false;
        }
        C36425c cVar = (C36425c) obj;
        return Intrinsics.areEqual((Object) this.f90082a, (Object) cVar.f90082a) && Intrinsics.areEqual((Object) this.f90083b, (Object) cVar.f90083b);
    }

    @C12579k
    /* renamed from: f */
    public final List<C36424b> mo110972f() {
        return this.f90083b;
    }

    public int hashCode() {
        return (this.f90082a.hashCode() * 31) + this.f90083b.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f90082a;
        List<C36424b> list = this.f90083b;
        return "APIMCouponUpdateBody(action=" + str + ", operationData=" + list + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36425c(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, list);
    }
}
