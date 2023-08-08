package com.carrefour.fid.android.domain.models.criteo;

import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.criteo.e */
public final class C38003e extends C38005g implements C38184v {
    @C12579k

    /* renamed from: e */
    public final List<C38012n> f95718e;
    @C12579k

    /* renamed from: f */
    public final List<C38114b> f95719f;
    @C12580l

    /* renamed from: g */
    public final String f95720g;
    @C12580l

    /* renamed from: v */
    public final String f95721v;
    @C12579k

    /* renamed from: w */
    public final List<String> f95722w;
    @C12580l

    /* renamed from: x */
    public final CriteoFormatRendering f95723x;
    @C12580l

    /* renamed from: y */
    public final String f95724y;
    @C12580l

    /* renamed from: z */
    public final String f95725z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38003e(@C12579k List<C38012n> list, @C12579k List<C38114b> list2, @C12580l String str, @C12580l String str2, @C12579k List<String> list3, @C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str3, @C12580l String str4) {
        super(list, list2, str2, str);
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "products");
        Intrinsics.checkNotNullParameter(list3, "buttonsNames");
        this.f95718e = list;
        this.f95719f = list2;
        this.f95720g = str;
        this.f95721v = str2;
        this.f95722w = list3;
        this.f95723x = criteoFormatRendering;
        this.f95724y = str3;
        this.f95725z = str4;
    }

    /* renamed from: o */
    public static /* synthetic */ C38003e m156515o(C38003e eVar, List list, List list2, String str, String str2, List list3, CriteoFormatRendering criteoFormatRendering, String str3, String str4, int i, Object obj) {
        C38003e eVar2 = eVar;
        int i2 = i;
        return eVar.mo117446n((i2 & 1) != 0 ? eVar2.f95718e : list, (i2 & 2) != 0 ? eVar2.f95719f : list2, (i2 & 4) != 0 ? eVar2.f95720g : str, (i2 & 8) != 0 ? eVar2.f95721v : str2, (i2 & 16) != 0 ? eVar2.f95722w : list3, (i2 & 32) != 0 ? eVar2.f95723x : criteoFormatRendering, (i2 & 64) != 0 ? eVar2.f95724y : str3, (i2 & 128) != 0 ? eVar2.f95725z : str4);
    }

    @C12579k
    /* renamed from: a */
    public List<C38012n> mo117432a() {
        return this.f95718e;
    }

    @C12580l
    /* renamed from: b */
    public String mo117433b() {
        return this.f95721v;
    }

    @C12580l
    /* renamed from: c */
    public String mo117434c() {
        return this.f95720g;
    }

    @C12579k
    /* renamed from: d */
    public List<C38114b> mo117435d() {
        return this.f95719f;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38003e)) {
            return false;
        }
        C38003e eVar = (C38003e) obj;
        return Intrinsics.areEqual((Object) this.f95718e, (Object) eVar.f95718e) && Intrinsics.areEqual((Object) this.f95719f, (Object) eVar.f95719f) && Intrinsics.areEqual((Object) this.f95720g, (Object) eVar.f95720g) && Intrinsics.areEqual((Object) this.f95721v, (Object) eVar.f95721v) && Intrinsics.areEqual((Object) this.f95722w, (Object) eVar.f95722w) && Intrinsics.areEqual((Object) this.f95723x, (Object) eVar.f95723x) && Intrinsics.areEqual((Object) this.f95724y, (Object) eVar.f95724y) && Intrinsics.areEqual((Object) this.f95725z, (Object) eVar.f95725z);
    }

    @C12579k
    /* renamed from: f */
    public final List<C38012n> mo117437f() {
        return this.f95718e;
    }

    @C12579k
    /* renamed from: g */
    public final List<C38114b> mo117438g() {
        return this.f95719f;
    }

    @C12580l
    /* renamed from: h */
    public final String mo117439h() {
        return this.f95720g;
    }

    public int hashCode() {
        int hashCode = ((this.f95718e.hashCode() * 31) + this.f95719f.hashCode()) * 31;
        String str = this.f95720g;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95721v;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f95722w.hashCode()) * 31;
        CriteoFormatRendering criteoFormatRendering = this.f95723x;
        int hashCode4 = (hashCode3 + (criteoFormatRendering == null ? 0 : criteoFormatRendering.hashCode())) * 31;
        String str3 = this.f95724y;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95725z;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    @C12580l
    /* renamed from: i */
    public final String mo117441i() {
        return this.f95721v;
    }

    @C12579k
    /* renamed from: j */
    public final List<String> mo117442j() {
        return this.f95722w;
    }

    @C12580l
    /* renamed from: k */
    public final CriteoFormatRendering mo117443k() {
        return this.f95723x;
    }

    @C12580l
    /* renamed from: l */
    public final String mo117444l() {
        return this.f95724y;
    }

    @C12580l
    /* renamed from: m */
    public final String mo117445m() {
        return this.f95725z;
    }

    @C12579k
    /* renamed from: n */
    public final C38003e mo117446n(@C12579k List<C38012n> list, @C12579k List<C38114b> list2, @C12580l String str, @C12580l String str2, @C12579k List<String> list3, @C12580l CriteoFormatRendering criteoFormatRendering, @C12580l String str3, @C12580l String str4) {
        Intrinsics.checkNotNullParameter(list, "criteoProducts");
        Intrinsics.checkNotNullParameter(list2, "products");
        Intrinsics.checkNotNullParameter(list3, "buttonsNames");
        return new C38003e(list, list2, str, str2, list3, criteoFormatRendering, str3, str4);
    }

    @C12579k
    /* renamed from: p */
    public final List<String> mo117447p() {
        return this.f95722w;
    }

    @C12580l
    /* renamed from: q */
    public final String mo117448q() {
        return this.f95724y;
    }

    @C12580l
    /* renamed from: r */
    public final String mo117449r() {
        return this.f95725z;
    }

    @C12580l
    /* renamed from: s */
    public final CriteoFormatRendering mo117450s() {
        return this.f95723x;
    }

    @C12579k
    public String toString() {
        List<C38012n> list = this.f95718e;
        List<C38114b> list2 = this.f95719f;
        String str = this.f95720g;
        String str2 = this.f95721v;
        List<String> list3 = this.f95722w;
        CriteoFormatRendering criteoFormatRendering = this.f95723x;
        String str3 = this.f95724y;
        String str4 = this.f95725z;
        return "CriteoItemDataButterfly(criteoProducts=" + list + ", products=" + list2 + ", onViewBeacon=" + str + ", onLoadBeacon=" + str2 + ", buttonsNames=" + list3 + ", rendering=" + criteoFormatRendering + ", onClickBeacon=" + str3 + ", onFileClickBeacon=" + str4 + ")";
    }
}
