package com.carrefour.fid.android.domain.models.criteo;

import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.offer.Offer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.criteo.d */
public final class C38002d extends C38013o implements C38184v {
    @C12579k

    /* renamed from: e */
    public final List<C38012n> f95711e;
    @C12579k

    /* renamed from: f */
    public final List<Offer> f95712f;
    @C12580l

    /* renamed from: g */
    public final String f95713g;
    @C12580l

    /* renamed from: v */
    public final String f95714v;
    @C12580l

    /* renamed from: w */
    public final CriteoFormatRendering f95715w;
    @C12580l

    /* renamed from: x */
    public final String f95716x;
    @C12580l

    /* renamed from: y */
    public final String f95717y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38002d(@C12579k List<C38012n> list, @C12579k List<Offer> list2, @C12580l String str, @C12580l String str2, @C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str3, @C12580l String str4) {
        super(list, list2, str, str2);
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "offers");
        this.f95711e = list;
        this.f95712f = list2;
        this.f95713g = str;
        this.f95714v = str2;
        this.f95715w = criteoFormatRendering;
        this.f95716x = str3;
        this.f95717y = str4;
    }

    /* renamed from: n */
    public static /* synthetic */ C38002d m156499n(C38002d dVar, List<C38012n> list, List<Offer> list2, String str, String str2, CriteoFormatRendering criteoFormatRendering, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dVar.f95711e;
        }
        if ((i & 2) != 0) {
            list2 = dVar.f95712f;
        }
        List<Offer> list3 = list2;
        if ((i & 4) != 0) {
            str = dVar.f95713g;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = dVar.f95714v;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            criteoFormatRendering = dVar.f95715w;
        }
        CriteoFormatRendering criteoFormatRendering2 = criteoFormatRendering;
        if ((i & 32) != 0) {
            str3 = dVar.f95716x;
        }
        String str7 = str3;
        if ((i & 64) != 0) {
            str4 = dVar.f95717y;
        }
        return dVar.mo117427m(list, list3, str5, str6, criteoFormatRendering2, str7, str4);
    }

    @C12579k
    /* renamed from: a */
    public List<C38012n> mo117385a() {
        return this.f95711e;
    }

    @C12579k
    /* renamed from: b */
    public List<Offer> mo117386b() {
        return this.f95712f;
    }

    @C12580l
    /* renamed from: c */
    public String mo117387c() {
        return this.f95713g;
    }

    @C12580l
    /* renamed from: d */
    public String mo117388d() {
        return this.f95714v;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38002d)) {
            return false;
        }
        C38002d dVar = (C38002d) obj;
        return Intrinsics.areEqual((Object) this.f95711e, (Object) dVar.f95711e) && Intrinsics.areEqual((Object) this.f95712f, (Object) dVar.f95712f) && Intrinsics.areEqual((Object) this.f95713g, (Object) dVar.f95713g) && Intrinsics.areEqual((Object) this.f95714v, (Object) dVar.f95714v) && Intrinsics.areEqual((Object) this.f95715w, (Object) dVar.f95715w) && Intrinsics.areEqual((Object) this.f95716x, (Object) dVar.f95716x) && Intrinsics.areEqual((Object) this.f95717y, (Object) dVar.f95717y);
    }

    @C12579k
    /* renamed from: f */
    public final List<C38012n> mo117419f() {
        return this.f95711e;
    }

    @C12579k
    /* renamed from: g */
    public final List<Offer> mo117420g() {
        return this.f95712f;
    }

    @C12580l
    /* renamed from: h */
    public final String mo117421h() {
        return this.f95713g;
    }

    public int hashCode() {
        int hashCode = ((this.f95711e.hashCode() * 31) + this.f95712f.hashCode()) * 31;
        String str = this.f95713g;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95714v;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CriteoFormatRendering criteoFormatRendering = this.f95715w;
        int hashCode4 = (hashCode3 + (criteoFormatRendering == null ? 0 : criteoFormatRendering.hashCode())) * 31;
        String str3 = this.f95716x;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95717y;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    @C12580l
    /* renamed from: i */
    public final String mo117423i() {
        return this.f95714v;
    }

    @C12580l
    /* renamed from: j */
    public final CriteoFormatRendering mo117424j() {
        return this.f95715w;
    }

    @C12580l
    /* renamed from: k */
    public final String mo117425k() {
        return this.f95716x;
    }

    @C12580l
    /* renamed from: l */
    public final String mo117426l() {
        return this.f95717y;
    }

    @C12579k
    /* renamed from: m */
    public final C38002d mo117427m(@C12579k List<C38012n> list, @C12579k List<Offer> list2, @C12580l String str, @C12580l String str2, @C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str3, @C12580l String str4) {
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "offers");
        return new C38002d(list, list2, str, str2, criteoFormatRendering, str3, str4);
    }

    @C12580l
    /* renamed from: o */
    public final String mo117428o() {
        return this.f95716x;
    }

    @C12580l
    /* renamed from: p */
    public final String mo117429p() {
        return this.f95717y;
    }

    @C12580l
    /* renamed from: q */
    public final CriteoFormatRendering mo117430q() {
        return this.f95715w;
    }

    @C12579k
    public String toString() {
        List<C38012n> list = this.f95711e;
        List<Offer> list2 = this.f95712f;
        String str = this.f95713g;
        String str2 = this.f95714v;
        CriteoFormatRendering criteoFormatRendering = this.f95715w;
        String str3 = this.f95716x;
        String str4 = this.f95717y;
        return "CriteoFlagship(criteoProducts=" + list + ", offers=" + list2 + ", onLoadBeacon=" + str + ", onViewBeacon=" + str2 + ", rendering=" + criteoFormatRendering + ", onClickBeacon=" + str3 + ", onFileClickBeacon=" + str4 + ")";
    }
}
