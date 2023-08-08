package com.carrefour.fid.android.presentation.p035ui.orders.offline.model;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.f */
public final class C24800f implements C24798d {

    /* renamed from: h */
    public static final int f61517h = 8;

    /* renamed from: a */
    public final int f61518a;
    @C12579k

    /* renamed from: b */
    public final String f61519b;
    @C12579k

    /* renamed from: c */
    public String f61520c;
    @C12579k

    /* renamed from: d */
    public String f61521d;

    /* renamed from: e */
    public double f61522e;
    @C12579k

    /* renamed from: f */
    public final String f61523f;

    /* renamed from: g */
    public final int f61524g;

    public C24800f(int i, @C12579k String str, @C12579k String str2, @C12579k String str3, double d, @C12579k String str4, int i2) {
        Intrinsics.checkNotNullParameter(str, "productName");
        Intrinsics.checkNotNullParameter(str2, "productAmount");
        Intrinsics.checkNotNullParameter(str3, "productAmountUnitPrice");
        Intrinsics.checkNotNullParameter(str4, "weight");
        this.f61518a = i;
        this.f61519b = str;
        this.f61520c = str2;
        this.f61521d = str3;
        this.f61522e = d;
        this.f61523f = str4;
        this.f61524g = i2;
    }

    /* renamed from: i */
    public static /* synthetic */ C24800f m108078i(C24800f fVar, int i, String str, String str2, String str3, double d, String str4, int i2, int i3, Object obj) {
        C24800f fVar2 = fVar;
        return fVar.mo72440h((i3 & 1) != 0 ? fVar2.f61518a : i, (i3 & 2) != 0 ? fVar2.f61519b : str, (i3 & 4) != 0 ? fVar2.f61520c : str2, (i3 & 8) != 0 ? fVar2.f61521d : str3, (i3 & 16) != 0 ? fVar2.f61522e : d, (i3 & 32) != 0 ? fVar2.f61523f : str4, (i3 & 64) != 0 ? fVar2.f61524g : i2);
    }

    /* renamed from: a */
    public final int mo72432a() {
        return this.f61518a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo72433b() {
        return this.f61519b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo72434c() {
        return this.f61520c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo72435d() {
        return this.f61521d;
    }

    /* renamed from: e */
    public final double mo72436e() {
        return this.f61522e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24800f)) {
            return false;
        }
        C24800f fVar = (C24800f) obj;
        return this.f61518a == fVar.f61518a && Intrinsics.areEqual((Object) this.f61519b, (Object) fVar.f61519b) && Intrinsics.areEqual((Object) this.f61520c, (Object) fVar.f61520c) && Intrinsics.areEqual((Object) this.f61521d, (Object) fVar.f61521d) && Double.compare(this.f61522e, fVar.f61522e) == 0 && Intrinsics.areEqual((Object) this.f61523f, (Object) fVar.f61523f) && this.f61524g == fVar.f61524g;
    }

    @C12579k
    /* renamed from: f */
    public final String mo72438f() {
        return this.f61523f;
    }

    /* renamed from: g */
    public final int mo72439g() {
        return this.f61524g;
    }

    @C12579k
    /* renamed from: h */
    public final C24800f mo72440h(int i, @C12579k String str, @C12579k String str2, @C12579k String str3, double d, @C12579k String str4, int i2) {
        Intrinsics.checkNotNullParameter(str, "productName");
        Intrinsics.checkNotNullParameter(str2, "productAmount");
        Intrinsics.checkNotNullParameter(str3, "productAmountUnitPrice");
        String str5 = str4;
        Intrinsics.checkNotNullParameter(str5, "weight");
        return new C24800f(i, str, str2, str3, d, str5, i2);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f61518a) * 31) + this.f61519b.hashCode()) * 31) + this.f61520c.hashCode()) * 31) + this.f61521d.hashCode()) * 31) + Double.hashCode(this.f61522e)) * 31) + this.f61523f.hashCode()) * 31) + Integer.hashCode(this.f61524g);
    }

    @C12579k
    /* renamed from: j */
    public final String mo72442j() {
        return this.f61520c;
    }

    /* renamed from: k */
    public final double mo72443k() {
        return this.f61522e;
    }

    @C12579k
    /* renamed from: l */
    public final String mo72444l() {
        return this.f61521d;
    }

    @C12579k
    /* renamed from: m */
    public final String mo72445m() {
        return this.f61519b;
    }

    /* renamed from: n */
    public final int mo72446n() {
        return this.f61524g;
    }

    /* renamed from: o */
    public final int mo72447o() {
        return this.f61518a;
    }

    @C12579k
    /* renamed from: p */
    public final String mo72448p() {
        return this.f61523f;
    }

    /* renamed from: q */
    public final void mo72449q(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f61520c = str;
    }

    /* renamed from: r */
    public final void mo72450r(double d) {
        this.f61522e = d;
    }

    /* renamed from: s */
    public final void mo72451s(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f61521d = str;
    }

    @C12579k
    public String toString() {
        int i = this.f61518a;
        String str = this.f61519b;
        String str2 = this.f61520c;
        String str3 = this.f61521d;
        double d = this.f61522e;
        String str4 = this.f61523f;
        int i2 = this.f61524g;
        return "OrdersOfflineDetailsProductModel(viewType=" + i + ", productName=" + str + ", productAmount=" + str2 + ", productAmountUnitPrice=" + str3 + ", productAmountImmediateDiscount=" + d + ", weight=" + str4 + ", quantity=" + i2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24800f(int i, String str, String str2, String str3, double d, String str4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, d, str4, (i3 & 64) != 0 ? -1 : i2);
    }
}
