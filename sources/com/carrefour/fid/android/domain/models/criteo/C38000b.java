package com.carrefour.fid.android.domain.models.criteo;

import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.offer.Offer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.criteo.b */
public final class C38000b extends C38013o implements C38184v {
    @C12579k

    /* renamed from: e */
    public final List<C38012n> f95699e;
    @C12579k

    /* renamed from: f */
    public final List<Offer> f95700f;
    @C12580l

    /* renamed from: g */
    public final String f95701g;
    @C12580l

    /* renamed from: v */
    public final String f95702v;
    @C12579k

    /* renamed from: w */
    public List<String> f95703w;
    @C12580l

    /* renamed from: x */
    public final CriteoFormatRendering f95704x;
    @C12580l

    /* renamed from: y */
    public final String f95705y;
    @C12580l

    /* renamed from: z */
    public final String f95706z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38000b(@C12579k List<C38012n> list, @C12579k List<Offer> list2, @C12580l String str, @C12580l String str2, @C12579k List<String> list3, @C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str3, @C12580l String str4) {
        super(list, list2, str2, str);
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "offers");
        Intrinsics.checkNotNullParameter(list3, "buttonsNames");
        this.f95699e = list;
        this.f95700f = list2;
        this.f95701g = str;
        this.f95702v = str2;
        this.f95703w = list3;
        this.f95704x = criteoFormatRendering;
        this.f95705y = str3;
        this.f95706z = str4;
    }

    /* renamed from: o */
    public static /* synthetic */ C38000b m156470o(C38000b bVar, List list, List list2, String str, String str2, List list3, CriteoFormatRendering criteoFormatRendering, String str3, String str4, int i, Object obj) {
        C38000b bVar2 = bVar;
        int i2 = i;
        return bVar.mo117399n((i2 & 1) != 0 ? bVar2.f95699e : list, (i2 & 2) != 0 ? bVar2.f95700f : list2, (i2 & 4) != 0 ? bVar2.f95701g : str, (i2 & 8) != 0 ? bVar2.f95702v : str2, (i2 & 16) != 0 ? bVar2.f95703w : list3, (i2 & 32) != 0 ? bVar2.f95704x : criteoFormatRendering, (i2 & 64) != 0 ? bVar2.f95705y : str3, (i2 & 128) != 0 ? bVar2.f95706z : str4);
    }

    @C12579k
    /* renamed from: a */
    public List<C38012n> mo117385a() {
        return this.f95699e;
    }

    @C12579k
    /* renamed from: b */
    public List<Offer> mo117386b() {
        return this.f95700f;
    }

    @C12580l
    /* renamed from: c */
    public String mo117387c() {
        return this.f95702v;
    }

    @C12580l
    /* renamed from: d */
    public String mo117388d() {
        return this.f95701g;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38000b)) {
            return false;
        }
        C38000b bVar = (C38000b) obj;
        return Intrinsics.areEqual((Object) this.f95699e, (Object) bVar.f95699e) && Intrinsics.areEqual((Object) this.f95700f, (Object) bVar.f95700f) && Intrinsics.areEqual((Object) this.f95701g, (Object) bVar.f95701g) && Intrinsics.areEqual((Object) this.f95702v, (Object) bVar.f95702v) && Intrinsics.areEqual((Object) this.f95703w, (Object) bVar.f95703w) && Intrinsics.areEqual((Object) this.f95704x, (Object) bVar.f95704x) && Intrinsics.areEqual((Object) this.f95705y, (Object) bVar.f95705y) && Intrinsics.areEqual((Object) this.f95706z, (Object) bVar.f95706z);
    }

    @C12579k
    /* renamed from: f */
    public final List<C38012n> mo117390f() {
        return this.f95699e;
    }

    @C12579k
    /* renamed from: g */
    public final List<Offer> mo117391g() {
        return this.f95700f;
    }

    @C12580l
    /* renamed from: h */
    public final String mo117392h() {
        return this.f95701g;
    }

    public int hashCode() {
        int hashCode = ((this.f95699e.hashCode() * 31) + this.f95700f.hashCode()) * 31;
        String str = this.f95701g;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95702v;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f95703w.hashCode()) * 31;
        CriteoFormatRendering criteoFormatRendering = this.f95704x;
        int hashCode4 = (hashCode3 + (criteoFormatRendering == null ? 0 : criteoFormatRendering.hashCode())) * 31;
        String str3 = this.f95705y;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95706z;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    @C12580l
    /* renamed from: i */
    public final String mo117394i() {
        return this.f95702v;
    }

    @C12579k
    /* renamed from: j */
    public final List<String> mo117395j() {
        return this.f95703w;
    }

    @C12580l
    /* renamed from: k */
    public final CriteoFormatRendering mo117396k() {
        return this.f95704x;
    }

    @C12580l
    /* renamed from: l */
    public final String mo117397l() {
        return this.f95705y;
    }

    @C12580l
    /* renamed from: m */
    public final String mo117398m() {
        return this.f95706z;
    }

    @C12579k
    /* renamed from: n */
    public final C38000b mo117399n(@C12579k List<C38012n> list, @C12579k List<Offer> list2, @C12580l String str, @C12580l String str2, @C12579k List<String> list3, @C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str3, @C12580l String str4) {
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "offers");
        Intrinsics.checkNotNullParameter(list3, "buttonsNames");
        return new C38000b(list, list2, str, str2, list3, criteoFormatRendering, str3, str4);
    }

    @C12579k
    /* renamed from: p */
    public final List<String> mo117400p() {
        return this.f95703w;
    }

    @C12580l
    /* renamed from: q */
    public final String mo117401q() {
        return this.f95705y;
    }

    @C12580l
    /* renamed from: r */
    public final String mo117402r() {
        return this.f95706z;
    }

    @C12580l
    /* renamed from: s */
    public final CriteoFormatRendering mo117403s() {
        return this.f95704x;
    }

    /* renamed from: t */
    public final void mo117404t(@C12579k List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f95703w = list;
    }

    @C12579k
    public String toString() {
        List<C38012n> list = this.f95699e;
        List<Offer> list2 = this.f95700f;
        String str = this.f95701g;
        String str2 = this.f95702v;
        List<String> list3 = this.f95703w;
        CriteoFormatRendering criteoFormatRendering = this.f95704x;
        String str3 = this.f95705y;
        String str4 = this.f95706z;
        return "CriteoButterfly(criteoProducts=" + list + ", offers=" + list2 + ", onViewBeacon=" + str + ", onLoadBeacon=" + str2 + ", buttonsNames=" + list3 + ", rendering=" + criteoFormatRendering + ", onClickBeacon=" + str3 + ", onFileClickBeacon=" + str4 + ")";
    }
}
