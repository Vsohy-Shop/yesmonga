package com.carrefour.fid.android.domain.models.criteo;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.criteo.a */
public final class C37999a {
    @C12580l

    /* renamed from: a */
    public final String f95692a;
    @C12580l

    /* renamed from: b */
    public final String f95693b;
    @C12580l

    /* renamed from: c */
    public final String f95694c;
    @C12580l

    /* renamed from: d */
    public final String f95695d;
    @C12580l

    /* renamed from: e */
    public final String f95696e;
    @C12580l

    /* renamed from: f */
    public final String f95697f;
    @C12580l

    /* renamed from: g */
    public final String f95698g;

    public C37999a(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7) {
        this.f95692a = str;
        this.f95693b = str2;
        this.f95694c = str3;
        this.f95695d = str4;
        this.f95696e = str5;
        this.f95697f = str6;
        this.f95698g = str7;
    }

    /* renamed from: i */
    public static /* synthetic */ C37999a m156454i(C37999a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f95692a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f95693b;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = aVar.f95694c;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = aVar.f95695d;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = aVar.f95696e;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = aVar.f95697f;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = aVar.f95698g;
        }
        return aVar.mo117375h(str, str8, str9, str10, str11, str12, str7);
    }

    @C12580l
    /* renamed from: a */
    public final String mo117367a() {
        return this.f95692a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo117368b() {
        return this.f95693b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo117369c() {
        return this.f95694c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo117370d() {
        return this.f95695d;
    }

    @C12580l
    /* renamed from: e */
    public final String mo117371e() {
        return this.f95696e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37999a)) {
            return false;
        }
        C37999a aVar = (C37999a) obj;
        return Intrinsics.areEqual((Object) this.f95692a, (Object) aVar.f95692a) && Intrinsics.areEqual((Object) this.f95693b, (Object) aVar.f95693b) && Intrinsics.areEqual((Object) this.f95694c, (Object) aVar.f95694c) && Intrinsics.areEqual((Object) this.f95695d, (Object) aVar.f95695d) && Intrinsics.areEqual((Object) this.f95696e, (Object) aVar.f95696e) && Intrinsics.areEqual((Object) this.f95697f, (Object) aVar.f95697f) && Intrinsics.areEqual((Object) this.f95698g, (Object) aVar.f95698g);
    }

    @C12580l
    /* renamed from: f */
    public final String mo117373f() {
        return this.f95697f;
    }

    @C12580l
    /* renamed from: g */
    public final String mo117374g() {
        return this.f95698g;
    }

    @C12579k
    /* renamed from: h */
    public final C37999a mo117375h(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7) {
        return new C37999a(str, str2, str3, str4, str5, str6, str7);
    }

    public int hashCode() {
        String str = this.f95692a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95693b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95694c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95695d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95696e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f95697f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f95698g;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    @C12580l
    /* renamed from: j */
    public final String mo117377j() {
        return this.f95692a;
    }

    @C12580l
    /* renamed from: k */
    public final String mo117378k() {
        return this.f95694c;
    }

    @C12580l
    /* renamed from: l */
    public final String mo117379l() {
        return this.f95693b;
    }

    @C12580l
    /* renamed from: m */
    public final String mo117380m() {
        return this.f95698g;
    }

    @C12580l
    /* renamed from: n */
    public final String mo117381n() {
        return this.f95696e;
    }

    @C12580l
    /* renamed from: o */
    public final String mo117382o() {
        return this.f95697f;
    }

    @C12580l
    /* renamed from: p */
    public final String mo117383p() {
        return this.f95695d;
    }

    @C12579k
    public String toString() {
        String str = this.f95692a;
        String str2 = this.f95693b;
        String str3 = this.f95694c;
        String str4 = this.f95695d;
        String str5 = this.f95696e;
        String str6 = this.f95697f;
        String str7 = this.f95698g;
        return "CriteoBanner(backgroundImage=" + str + ", mobileBackgroundImage=" + str2 + ", headerText=" + str3 + ", redirectUrl=" + str4 + ", onLoadBeacon=" + str5 + ", onViewBeacon=" + str6 + ", onClickBeacon=" + str7 + ")";
    }
}
