package com.carrefour.fid.android.domain.models.criteo;

import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.criteo.k */
public final class C38009k implements C38184v {
    @C12579k

    /* renamed from: a */
    public final List<C38012n> f95760a;
    @C12579k

    /* renamed from: b */
    public final List<C38115c> f95761b;
    @C12580l

    /* renamed from: c */
    public final String f95762c;
    @C12580l

    /* renamed from: d */
    public final String f95763d;
    @C12580l

    /* renamed from: e */
    public final CriteoFormatRendering f95764e;
    @C12580l

    /* renamed from: f */
    public final String f95765f;
    @C12580l

    /* renamed from: g */
    public final String f95766g;

    public C38009k(@C12579k List<C38012n> list, @C12579k List<C38115c> list2, @C12580l String str, @C12580l String str2, @C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str3, @C12580l String str4) {
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "products");
        this.f95760a = list;
        this.f95761b = list2;
        this.f95762c = str;
        this.f95763d = str2;
        this.f95764e = criteoFormatRendering;
        this.f95765f = str3;
        this.f95766g = str4;
    }

    /* renamed from: i */
    public static /* synthetic */ C38009k m156606i(C38009k kVar, List<C38012n> list, List<C38115c> list2, String str, String str2, CriteoFormatRendering criteoFormatRendering, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kVar.f95760a;
        }
        if ((i & 2) != 0) {
            list2 = kVar.f95761b;
        }
        List<C38115c> list3 = list2;
        if ((i & 4) != 0) {
            str = kVar.f95762c;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = kVar.f95763d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            criteoFormatRendering = kVar.f95764e;
        }
        CriteoFormatRendering criteoFormatRendering2 = criteoFormatRendering;
        if ((i & 32) != 0) {
            str3 = kVar.f95765f;
        }
        String str7 = str3;
        if ((i & 64) != 0) {
            str4 = kVar.f95766g;
        }
        return kVar.mo117530h(list, list3, str5, str6, criteoFormatRendering2, str7, str4);
    }

    @C12579k
    /* renamed from: a */
    public final List<C38012n> mo117522a() {
        return this.f95760a;
    }

    @C12579k
    /* renamed from: b */
    public final List<C38115c> mo117523b() {
        return this.f95761b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo117524c() {
        return this.f95762c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo117525d() {
        return this.f95763d;
    }

    @C12580l
    /* renamed from: e */
    public final CriteoFormatRendering mo117526e() {
        return this.f95764e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38009k)) {
            return false;
        }
        C38009k kVar = (C38009k) obj;
        return Intrinsics.areEqual((Object) this.f95760a, (Object) kVar.f95760a) && Intrinsics.areEqual((Object) this.f95761b, (Object) kVar.f95761b) && Intrinsics.areEqual((Object) this.f95762c, (Object) kVar.f95762c) && Intrinsics.areEqual((Object) this.f95763d, (Object) kVar.f95763d) && Intrinsics.areEqual((Object) this.f95764e, (Object) kVar.f95764e) && Intrinsics.areEqual((Object) this.f95765f, (Object) kVar.f95765f) && Intrinsics.areEqual((Object) this.f95766g, (Object) kVar.f95766g);
    }

    @C12580l
    /* renamed from: f */
    public final String mo117528f() {
        return this.f95765f;
    }

    @C12580l
    /* renamed from: g */
    public final String mo117529g() {
        return this.f95766g;
    }

    @C12579k
    /* renamed from: h */
    public final C38009k mo117530h(@C12579k List<C38012n> list, @C12579k List<C38115c> list2, @C12580l String str, @C12580l String str2, @C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str3, @C12580l String str4) {
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "products");
        return new C38009k(list, list2, str, str2, criteoFormatRendering, str3, str4);
    }

    public int hashCode() {
        int hashCode = ((this.f95760a.hashCode() * 31) + this.f95761b.hashCode()) * 31;
        String str = this.f95762c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95763d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CriteoFormatRendering criteoFormatRendering = this.f95764e;
        int hashCode4 = (hashCode3 + (criteoFormatRendering == null ? 0 : criteoFormatRendering.hashCode())) * 31;
        String str3 = this.f95765f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95766g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    @C12579k
    /* renamed from: j */
    public final List<C38012n> mo117532j() {
        return this.f95760a;
    }

    @C12580l
    /* renamed from: k */
    public final String mo117533k() {
        return this.f95765f;
    }

    @C12580l
    /* renamed from: l */
    public final String mo117534l() {
        return this.f95766g;
    }

    @C12580l
    /* renamed from: m */
    public final String mo117535m() {
        return this.f95762c;
    }

    @C12580l
    /* renamed from: n */
    public final String mo117536n() {
        return this.f95763d;
    }

    @C12579k
    /* renamed from: o */
    public final List<C38115c> mo117537o() {
        return this.f95761b;
    }

    @C12580l
    /* renamed from: p */
    public final CriteoFormatRendering mo117538p() {
        return this.f95764e;
    }

    @C12579k
    public String toString() {
        List<C38012n> list = this.f95760a;
        List<C38115c> list2 = this.f95761b;
        String str = this.f95762c;
        String str2 = this.f95763d;
        CriteoFormatRendering criteoFormatRendering = this.f95764e;
        String str3 = this.f95765f;
        String str4 = this.f95766g;
        return "CriteoPlpFlagship(criteoProducts=" + list + ", products=" + list2 + ", onLoadBeacon=" + str + ", onViewBeacon=" + str2 + ", rendering=" + criteoFormatRendering + ", onClickBeacon=" + str3 + ", onFileClickBeacon=" + str4 + ")";
    }
}
