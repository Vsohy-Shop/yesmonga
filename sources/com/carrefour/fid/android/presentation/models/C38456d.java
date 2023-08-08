package com.carrefour.fid.android.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.models.d */
public final class C38456d {

    /* renamed from: i */
    public static final int f97580i = 8;
    @C12580l

    /* renamed from: a */
    public final String f97581a;
    @C12580l

    /* renamed from: b */
    public final String f97582b;
    @C12580l

    /* renamed from: c */
    public final String f97583c;
    @C12580l

    /* renamed from: d */
    public final String f97584d;
    @C12580l

    /* renamed from: e */
    public final String f97585e;
    @C12580l

    /* renamed from: f */
    public final String f97586f;
    @C12580l

    /* renamed from: g */
    public final String f97587g;

    /* renamed from: h */
    public boolean f97588h;

    public C38456d(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, boolean z) {
        this.f97581a = str;
        this.f97582b = str2;
        this.f97583c = str3;
        this.f97584d = str4;
        this.f97585e = str5;
        this.f97586f = str6;
        this.f97587g = str7;
        this.f97588h = z;
    }

    /* renamed from: j */
    public static /* synthetic */ C38456d m159528j(C38456d dVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, Object obj) {
        C38456d dVar2 = dVar;
        int i2 = i;
        return dVar.mo122025i((i2 & 1) != 0 ? dVar2.f97581a : str, (i2 & 2) != 0 ? dVar2.f97582b : str2, (i2 & 4) != 0 ? dVar2.f97583c : str3, (i2 & 8) != 0 ? dVar2.f97584d : str4, (i2 & 16) != 0 ? dVar2.f97585e : str5, (i2 & 32) != 0 ? dVar2.f97586f : str6, (i2 & 64) != 0 ? dVar2.f97587g : str7, (i2 & 128) != 0 ? dVar2.f97588h : z);
    }

    @C12580l
    /* renamed from: a */
    public final String mo122015a() {
        return this.f97581a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo122016b() {
        return this.f97582b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo122017c() {
        return this.f97583c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo122018d() {
        return this.f97584d;
    }

    @C12580l
    /* renamed from: e */
    public final String mo122019e() {
        return this.f97585e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38456d)) {
            return false;
        }
        C38456d dVar = (C38456d) obj;
        return Intrinsics.areEqual((Object) this.f97581a, (Object) dVar.f97581a) && Intrinsics.areEqual((Object) this.f97582b, (Object) dVar.f97582b) && Intrinsics.areEqual((Object) this.f97583c, (Object) dVar.f97583c) && Intrinsics.areEqual((Object) this.f97584d, (Object) dVar.f97584d) && Intrinsics.areEqual((Object) this.f97585e, (Object) dVar.f97585e) && Intrinsics.areEqual((Object) this.f97586f, (Object) dVar.f97586f) && Intrinsics.areEqual((Object) this.f97587g, (Object) dVar.f97587g) && this.f97588h == dVar.f97588h;
    }

    @C12580l
    /* renamed from: f */
    public final String mo122021f() {
        return this.f97586f;
    }

    @C12580l
    /* renamed from: g */
    public final String mo122022g() {
        return this.f97587g;
    }

    /* renamed from: h */
    public final boolean mo122023h() {
        return this.f97588h;
    }

    public int hashCode() {
        String str = this.f97581a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f97582b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f97583c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f97584d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f97585e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f97586f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f97587g;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int i2 = (hashCode6 + i) * 31;
        boolean z = this.f97588h;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final C38456d mo122025i(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, boolean z) {
        return new C38456d(str, str2, str3, str4, str5, str6, str7, z);
    }

    @C12580l
    /* renamed from: k */
    public final String mo122026k() {
        return this.f97581a;
    }

    @C12580l
    /* renamed from: l */
    public final String mo122027l() {
        return this.f97583c;
    }

    @C12580l
    /* renamed from: m */
    public final String mo122028m() {
        return this.f97582b;
    }

    @C12580l
    /* renamed from: n */
    public final String mo122029n() {
        return this.f97587g;
    }

    @C12580l
    /* renamed from: o */
    public final String mo122030o() {
        return this.f97585e;
    }

    @C12580l
    /* renamed from: p */
    public final String mo122031p() {
        return this.f97586f;
    }

    @C12580l
    /* renamed from: q */
    public final String mo122032q() {
        return this.f97584d;
    }

    /* renamed from: r */
    public final boolean mo122033r() {
        return this.f97588h;
    }

    /* renamed from: s */
    public final void mo122034s(boolean z) {
        this.f97588h = z;
    }

    @C12579k
    public String toString() {
        String str = this.f97581a;
        String str2 = this.f97582b;
        String str3 = this.f97583c;
        String str4 = this.f97584d;
        String str5 = this.f97585e;
        String str6 = this.f97586f;
        String str7 = this.f97587g;
        boolean z = this.f97588h;
        return "CriteoBannerModel(backgroundImage=" + str + ", mobileBackgroundImage=" + str2 + ", headerText=" + str3 + ", redirectUrl=" + str4 + ", onLoadBeacon=" + str5 + ", onViewBeacon=" + str6 + ", onClickBeacon=" + str7 + ", isTracked=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38456d(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? false : z);
    }
}
