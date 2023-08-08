package com.carrefour.fid.android.domain.models.criteo;

import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.criteo.f */
public final class C38004f extends C38005g implements C38184v {
    @C12579k

    /* renamed from: e */
    public final List<C38012n> f95726e;
    @C12579k

    /* renamed from: f */
    public final List<C38114b> f95727f;
    @C12580l

    /* renamed from: g */
    public final String f95728g;
    @C12580l

    /* renamed from: v */
    public final String f95729v;
    @C12580l

    /* renamed from: w */
    public final CriteoFormatRendering f95730w;
    @C12580l

    /* renamed from: x */
    public final String f95731x;
    @C12580l

    /* renamed from: y */
    public final String f95732y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38004f(@C12579k List<C38012n> list, @C12579k List<C38114b> list2, @C12580l String str, @C12580l String str2, @C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str3, @C12580l String str4) {
        super(list, list2, str, str2);
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "products");
        this.f95726e = list;
        this.f95727f = list2;
        this.f95728g = str;
        this.f95729v = str2;
        this.f95730w = criteoFormatRendering;
        this.f95731x = str3;
        this.f95732y = str4;
    }

    /* renamed from: n */
    public static /* synthetic */ C38004f m156533n(C38004f fVar, List<C38012n> list, List<C38114b> list2, String str, String str2, CriteoFormatRendering criteoFormatRendering, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fVar.f95726e;
        }
        if ((i & 2) != 0) {
            list2 = fVar.f95727f;
        }
        List<C38114b> list3 = list2;
        if ((i & 4) != 0) {
            str = fVar.f95728g;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = fVar.f95729v;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            criteoFormatRendering = fVar.f95730w;
        }
        CriteoFormatRendering criteoFormatRendering2 = criteoFormatRendering;
        if ((i & 32) != 0) {
            str3 = fVar.f95731x;
        }
        String str7 = str3;
        if ((i & 64) != 0) {
            str4 = fVar.f95732y;
        }
        return fVar.mo117461m(list, list3, str5, str6, criteoFormatRendering2, str7, str4);
    }

    @C12579k
    /* renamed from: a */
    public List<C38012n> mo117432a() {
        return this.f95726e;
    }

    @C12580l
    /* renamed from: b */
    public String mo117433b() {
        return this.f95728g;
    }

    @C12580l
    /* renamed from: c */
    public String mo117434c() {
        return this.f95729v;
    }

    @C12579k
    /* renamed from: d */
    public List<C38114b> mo117435d() {
        return this.f95727f;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38004f)) {
            return false;
        }
        C38004f fVar = (C38004f) obj;
        return Intrinsics.areEqual((Object) this.f95726e, (Object) fVar.f95726e) && Intrinsics.areEqual((Object) this.f95727f, (Object) fVar.f95727f) && Intrinsics.areEqual((Object) this.f95728g, (Object) fVar.f95728g) && Intrinsics.areEqual((Object) this.f95729v, (Object) fVar.f95729v) && Intrinsics.areEqual((Object) this.f95730w, (Object) fVar.f95730w) && Intrinsics.areEqual((Object) this.f95731x, (Object) fVar.f95731x) && Intrinsics.areEqual((Object) this.f95732y, (Object) fVar.f95732y);
    }

    @C12579k
    /* renamed from: f */
    public final List<C38012n> mo117453f() {
        return this.f95726e;
    }

    @C12579k
    /* renamed from: g */
    public final List<C38114b> mo117454g() {
        return this.f95727f;
    }

    @C12580l
    /* renamed from: h */
    public final String mo117455h() {
        return this.f95728g;
    }

    public int hashCode() {
        int hashCode = ((this.f95726e.hashCode() * 31) + this.f95727f.hashCode()) * 31;
        String str = this.f95728g;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95729v;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CriteoFormatRendering criteoFormatRendering = this.f95730w;
        int hashCode4 = (hashCode3 + (criteoFormatRendering == null ? 0 : criteoFormatRendering.hashCode())) * 31;
        String str3 = this.f95731x;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95732y;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    @C12580l
    /* renamed from: i */
    public final String mo117457i() {
        return this.f95729v;
    }

    @C12580l
    /* renamed from: j */
    public final CriteoFormatRendering mo117458j() {
        return this.f95730w;
    }

    @C12580l
    /* renamed from: k */
    public final String mo117459k() {
        return this.f95731x;
    }

    @C12580l
    /* renamed from: l */
    public final String mo117460l() {
        return this.f95732y;
    }

    @C12579k
    /* renamed from: m */
    public final C38004f mo117461m(@C12579k List<C38012n> list, @C12579k List<C38114b> list2, @C12580l String str, @C12580l String str2, @C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str3, @C12580l String str4) {
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "products");
        return new C38004f(list, list2, str, str2, criteoFormatRendering, str3, str4);
    }

    @C12580l
    /* renamed from: o */
    public final String mo117462o() {
        return this.f95731x;
    }

    @C12580l
    /* renamed from: p */
    public final String mo117463p() {
        return this.f95732y;
    }

    @C12580l
    /* renamed from: q */
    public final CriteoFormatRendering mo117464q() {
        return this.f95730w;
    }

    @C12579k
    public String toString() {
        List<C38012n> list = this.f95726e;
        List<C38114b> list2 = this.f95727f;
        String str = this.f95728g;
        String str2 = this.f95729v;
        CriteoFormatRendering criteoFormatRendering = this.f95730w;
        String str3 = this.f95731x;
        String str4 = this.f95732y;
        return "CriteoItemDataFlagship(criteoProducts=" + list + ", products=" + list2 + ", onLoadBeacon=" + str + ", onViewBeacon=" + str2 + ", rendering=" + criteoFormatRendering + ", onClickBeacon=" + str3 + ", onFileClickBeacon=" + str4 + ")";
    }
}
