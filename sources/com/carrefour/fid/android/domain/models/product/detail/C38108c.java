package com.carrefour.fid.android.domain.models.product.detail;

import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.product.detail.c */
public final class C38108c implements C38107b {
    @C12579k

    /* renamed from: a */
    public final String f96376a;
    @C12579k

    /* renamed from: b */
    public final String f96377b;
    @C12579k

    /* renamed from: c */
    public final String f96378c;
    @C12579k

    /* renamed from: d */
    public final String f96379d;
    @C12579k

    /* renamed from: e */
    public final Map<PictureSize, List<ProductPicture>> f96380e;
    @C12579k

    /* renamed from: f */
    public final String f96381f;
    @C12579k

    /* renamed from: g */
    public final List<String> f96382g;
    @C12579k

    /* renamed from: h */
    public final List<OfferDetail> f96383h;
    @C12579k

    /* renamed from: i */
    public final String f96384i;
    @C12580l

    /* renamed from: j */
    public final String f96385j;
    @C12580l

    /* renamed from: k */
    public final Double f96386k;

    /* renamed from: l */
    public final boolean f96387l;

    public /* synthetic */ C38108c(String str, String str2, String str3, String str4, Map map, String str5, List list, List list2, String str6, String str7, Double d, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, map, str5, list, list2, str6, str7, d, z);
    }

    /* renamed from: u */
    public static /* synthetic */ C38108c m157591u(C38108c cVar, String str, String str2, String str3, String str4, Map map, String str5, List list, List list2, String str6, String str7, Double d, boolean z, int i, Object obj) {
        C38108c cVar2 = cVar;
        int i2 = i;
        return cVar.mo118744t((i2 & 1) != 0 ? cVar2.f96376a : str, (i2 & 2) != 0 ? cVar2.f96377b : str2, (i2 & 4) != 0 ? cVar2.f96378c : str3, (i2 & 8) != 0 ? cVar2.f96379d : str4, (i2 & 16) != 0 ? cVar2.f96380e : map, (i2 & 32) != 0 ? cVar2.f96381f : str5, (i2 & 64) != 0 ? cVar2.f96382g : list, (i2 & 128) != 0 ? cVar2.f96383h : list2, (i2 & 256) != 0 ? cVar2.f96384i : str6, (i2 & 512) != 0 ? cVar2.f96385j : str7, (i2 & 1024) != 0 ? cVar2.f96386k : d, (i2 & 2048) != 0 ? cVar2.f96387l : z);
    }

    @C12579k
    /* renamed from: a */
    public String mo118719a() {
        return this.f96376a;
    }

    @C12579k
    /* renamed from: b */
    public List<OfferDetail> mo118720b() {
        return this.f96383h;
    }

    @C12579k
    /* renamed from: c */
    public String mo118721c() {
        return this.f96379d;
    }

    @C12580l
    /* renamed from: d */
    public Double mo118722d() {
        return this.f96386k;
    }

    @C12579k
    /* renamed from: e */
    public Map<PictureSize, List<ProductPicture>> mo118723e() {
        return this.f96380e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38108c)) {
            return false;
        }
        C38108c cVar = (C38108c) obj;
        return Gtin.m157311e(this.f96376a, cVar.f96376a) && Intrinsics.areEqual((Object) this.f96377b, (Object) cVar.f96377b) && Intrinsics.areEqual((Object) this.f96378c, (Object) cVar.f96378c) && Intrinsics.areEqual((Object) this.f96379d, (Object) cVar.f96379d) && Intrinsics.areEqual((Object) this.f96380e, (Object) cVar.f96380e) && Intrinsics.areEqual((Object) this.f96381f, (Object) cVar.f96381f) && Intrinsics.areEqual((Object) this.f96382g, (Object) cVar.f96382g) && Intrinsics.areEqual((Object) this.f96383h, (Object) cVar.f96383h) && Intrinsics.areEqual((Object) this.f96384i, (Object) cVar.f96384i) && Intrinsics.areEqual((Object) this.f96385j, (Object) cVar.f96385j) && Intrinsics.areEqual((Object) this.f96386k, (Object) cVar.f96386k) && this.f96387l == cVar.f96387l;
    }

    @C12579k
    /* renamed from: f */
    public List<String> mo118724f() {
        return this.f96382g;
    }

    @C12579k
    /* renamed from: g */
    public String mo118725g() {
        return this.f96384i;
    }

    @C12579k
    public String getBrand() {
        return this.f96378c;
    }

    @C12580l
    public String getCategory() {
        return this.f96385j;
    }

    @C12579k
    public String getDescription() {
        return this.f96381f;
    }

    @C12579k
    public String getName() {
        return this.f96377b;
    }

    @C12579k
    /* renamed from: h */
    public final String mo118731h() {
        return this.f96376a;
    }

    public int hashCode() {
        int g = ((((((((((((((((Gtin.m157312g(this.f96376a) * 31) + this.f96377b.hashCode()) * 31) + this.f96378c.hashCode()) * 31) + this.f96379d.hashCode()) * 31) + this.f96380e.hashCode()) * 31) + this.f96381f.hashCode()) * 31) + this.f96382g.hashCode()) * 31) + this.f96383h.hashCode()) * 31) + this.f96384i.hashCode()) * 31;
        String str = this.f96385j;
        int i = 0;
        int hashCode = (g + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f96386k;
        if (d != null) {
            i = d.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f96387l;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @C12580l
    /* renamed from: i */
    public final String mo118733i() {
        return this.f96385j;
    }

    @C12580l
    /* renamed from: j */
    public final Double mo118734j() {
        return this.f96386k;
    }

    /* renamed from: k */
    public final boolean mo118735k() {
        return this.f96387l;
    }

    @C12579k
    /* renamed from: l */
    public final String mo118736l() {
        return this.f96377b;
    }

    @C12579k
    /* renamed from: m */
    public final String mo118737m() {
        return this.f96378c;
    }

    @C12579k
    /* renamed from: n */
    public final String mo118738n() {
        return this.f96379d;
    }

    @C12579k
    /* renamed from: o */
    public final Map<PictureSize, List<ProductPicture>> mo118739o() {
        return this.f96380e;
    }

    @C12579k
    /* renamed from: p */
    public final String mo118740p() {
        return this.f96381f;
    }

    @C12579k
    /* renamed from: q */
    public final List<String> mo118741q() {
        return this.f96382g;
    }

    @C12579k
    /* renamed from: r */
    public final List<OfferDetail> mo118742r() {
        return this.f96383h;
    }

    @C12579k
    /* renamed from: s */
    public final String mo118743s() {
        return this.f96384i;
    }

    @C12579k
    /* renamed from: t */
    public final C38108c mo118744t(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k Map<PictureSize, ? extends List<ProductPicture>> map, @C12579k String str5, @C12579k List<String> list, @C12579k List<OfferDetail> list2, @C12579k String str6, @C12580l String str7, @C12580l Double d, boolean z) {
        String str8 = str;
        Intrinsics.checkNotNullParameter(str8, "gtin");
        String str9 = str2;
        Intrinsics.checkNotNullParameter(str9, "name");
        String str10 = str3;
        Intrinsics.checkNotNullParameter(str10, "brand");
        String str11 = str4;
        Intrinsics.checkNotNullParameter(str11, "packaging");
        Map<PictureSize, ? extends List<ProductPicture>> map2 = map;
        Intrinsics.checkNotNullParameter(map2, "pictures");
        String str12 = str5;
        Intrinsics.checkNotNullParameter(str12, "description");
        List<String> list3 = list;
        Intrinsics.checkNotNullParameter(list3, "keyFeatures");
        List<OfferDetail> list4 = list2;
        Intrinsics.checkNotNullParameter(list4, "offers");
        String str13 = str6;
        Intrinsics.checkNotNullParameter(str13, "taxeMessage");
        return new C38108c(str8, str9, str10, str11, map2, str12, list3, list4, str13, str7, d, z, (DefaultConstructorMarker) null);
    }

    @C12579k
    public String toString() {
        String h = Gtin.m157313h(this.f96376a);
        String str = this.f96377b;
        String str2 = this.f96378c;
        String str3 = this.f96379d;
        Map<PictureSize, List<ProductPicture>> map = this.f96380e;
        String str4 = this.f96381f;
        List<String> list = this.f96382g;
        List<OfferDetail> list2 = this.f96383h;
        String str5 = this.f96384i;
        String str6 = this.f96385j;
        Double d = this.f96386k;
        boolean z = this.f96387l;
        return "ProductDetailAl(gtin=" + h + ", name=" + str + ", brand=" + str2 + ", packaging=" + str3 + ", pictures=" + map + ", description=" + str4 + ", keyFeatures=" + list + ", offers=" + list2 + ", taxeMessage=" + str5 + ", category=" + str6 + ", repairIndex=" + d + ", isVariableWeight=" + z + ")";
    }

    /* renamed from: v */
    public final boolean mo118746v() {
        return this.f96387l;
    }

    public C38108c(String str, String str2, String str3, String str4, Map<PictureSize, ? extends List<ProductPicture>> map, String str5, List<String> list, List<OfferDetail> list2, String str6, String str7, Double d, boolean z) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "brand");
        Intrinsics.checkNotNullParameter(str4, "packaging");
        Intrinsics.checkNotNullParameter(map, "pictures");
        Intrinsics.checkNotNullParameter(str5, "description");
        Intrinsics.checkNotNullParameter(list, "keyFeatures");
        Intrinsics.checkNotNullParameter(list2, "offers");
        Intrinsics.checkNotNullParameter(str6, "taxeMessage");
        this.f96376a = str;
        this.f96377b = str2;
        this.f96378c = str3;
        this.f96379d = str4;
        this.f96380e = map;
        this.f96381f = str5;
        this.f96382g = list;
        this.f96383h = list2;
        this.f96384i = str6;
        this.f96385j = str7;
        this.f96386k = d;
        this.f96387l = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38108c(String str, String str2, String str3, String str4, Map map, String str5, List list, List list2, String str6, String str7, Double d, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, map, str5, list, list2, str6, (i & 512) != 0 ? null : str7, d, z, (DefaultConstructorMarker) null);
    }
}
