package com.carrefour.fid.android.domain.models.product.detail;

import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.product.detail.e */
public final class C38110e implements C38107b {
    @C12579k

    /* renamed from: a */
    public final String f96393a;
    @C12579k

    /* renamed from: b */
    public final String f96394b;
    @C12579k

    /* renamed from: c */
    public final String f96395c;
    @C12579k

    /* renamed from: d */
    public final String f96396d;
    @C12579k

    /* renamed from: e */
    public final Map<PictureSize, List<ProductPicture>> f96397e;
    @C12579k

    /* renamed from: f */
    public final String f96398f;
    @C12579k

    /* renamed from: g */
    public final List<String> f96399g;
    @C12579k

    /* renamed from: h */
    public final List<OfferDetail> f96400h;
    @C12579k

    /* renamed from: i */
    public final String f96401i;
    @C12580l

    /* renamed from: j */
    public final String f96402j;
    @C12580l

    /* renamed from: k */
    public final Double f96403k;
    @C12579k

    /* renamed from: l */
    public final List<Pair<String, String>> f96404l;
    @C12580l

    /* renamed from: m */
    public final String f96405m;

    public /* synthetic */ C38110e(String str, String str2, String str3, String str4, Map map, String str5, List list, List list2, String str6, String str7, Double d, List list3, String str8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, map, str5, list, list2, str6, str7, d, list3, str8);
    }

    /* renamed from: v */
    public static /* synthetic */ C38110e m157625v(C38110e eVar, String str, String str2, String str3, String str4, Map map, String str5, List list, List list2, String str6, String str7, Double d, List list3, String str8, int i, Object obj) {
        C38110e eVar2 = eVar;
        int i2 = i;
        return eVar.mo118777u((i2 & 1) != 0 ? eVar2.f96393a : str, (i2 & 2) != 0 ? eVar2.f96394b : str2, (i2 & 4) != 0 ? eVar2.f96395c : str3, (i2 & 8) != 0 ? eVar2.f96396d : str4, (i2 & 16) != 0 ? eVar2.f96397e : map, (i2 & 32) != 0 ? eVar2.f96398f : str5, (i2 & 64) != 0 ? eVar2.f96399g : list, (i2 & 128) != 0 ? eVar2.f96400h : list2, (i2 & 256) != 0 ? eVar2.f96401i : str6, (i2 & 512) != 0 ? eVar2.f96402j : str7, (i2 & 1024) != 0 ? eVar2.f96403k : d, (i2 & 2048) != 0 ? eVar2.f96404l : list3, (i2 & 4096) != 0 ? eVar2.f96405m : str8);
    }

    @C12579k
    /* renamed from: a */
    public String mo118719a() {
        return this.f96393a;
    }

    @C12579k
    /* renamed from: b */
    public List<OfferDetail> mo118720b() {
        return this.f96400h;
    }

    @C12579k
    /* renamed from: c */
    public String mo118721c() {
        return this.f96396d;
    }

    @C12580l
    /* renamed from: d */
    public Double mo118722d() {
        return this.f96403k;
    }

    @C12579k
    /* renamed from: e */
    public Map<PictureSize, List<ProductPicture>> mo118723e() {
        return this.f96397e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38110e)) {
            return false;
        }
        C38110e eVar = (C38110e) obj;
        return Gtin.m157311e(this.f96393a, eVar.f96393a) && Intrinsics.areEqual((Object) this.f96394b, (Object) eVar.f96394b) && Intrinsics.areEqual((Object) this.f96395c, (Object) eVar.f96395c) && Intrinsics.areEqual((Object) this.f96396d, (Object) eVar.f96396d) && Intrinsics.areEqual((Object) this.f96397e, (Object) eVar.f96397e) && Intrinsics.areEqual((Object) this.f96398f, (Object) eVar.f96398f) && Intrinsics.areEqual((Object) this.f96399g, (Object) eVar.f96399g) && Intrinsics.areEqual((Object) this.f96400h, (Object) eVar.f96400h) && Intrinsics.areEqual((Object) this.f96401i, (Object) eVar.f96401i) && Intrinsics.areEqual((Object) this.f96402j, (Object) eVar.f96402j) && Intrinsics.areEqual((Object) this.f96403k, (Object) eVar.f96403k) && Intrinsics.areEqual((Object) this.f96404l, (Object) eVar.f96404l) && Intrinsics.areEqual((Object) this.f96405m, (Object) eVar.f96405m);
    }

    @C12579k
    /* renamed from: f */
    public List<String> mo118724f() {
        return this.f96399g;
    }

    @C12579k
    /* renamed from: g */
    public String mo118725g() {
        return this.f96401i;
    }

    @C12579k
    public String getBrand() {
        return this.f96395c;
    }

    @C12580l
    public String getCategory() {
        return this.f96402j;
    }

    @C12579k
    public String getDescription() {
        return this.f96398f;
    }

    @C12579k
    public String getName() {
        return this.f96394b;
    }

    @C12579k
    /* renamed from: h */
    public final String mo118762h() {
        return this.f96393a;
    }

    public int hashCode() {
        int g = ((((((((((((((((Gtin.m157312g(this.f96393a) * 31) + this.f96394b.hashCode()) * 31) + this.f96395c.hashCode()) * 31) + this.f96396d.hashCode()) * 31) + this.f96397e.hashCode()) * 31) + this.f96398f.hashCode()) * 31) + this.f96399g.hashCode()) * 31) + this.f96400h.hashCode()) * 31) + this.f96401i.hashCode()) * 31;
        String str = this.f96402j;
        int i = 0;
        int hashCode = (g + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f96403k;
        int hashCode2 = (((hashCode + (d == null ? 0 : d.hashCode())) * 31) + this.f96404l.hashCode()) * 31;
        String str2 = this.f96405m;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12580l
    /* renamed from: i */
    public final String mo118764i() {
        return this.f96402j;
    }

    @C12580l
    /* renamed from: j */
    public final Double mo118765j() {
        return this.f96403k;
    }

    @C12579k
    /* renamed from: k */
    public final List<Pair<String, String>> mo118766k() {
        return this.f96404l;
    }

    @C12580l
    /* renamed from: l */
    public final String mo118767l() {
        return this.f96405m;
    }

    @C12579k
    /* renamed from: m */
    public final String mo118768m() {
        return this.f96394b;
    }

    @C12579k
    /* renamed from: n */
    public final String mo118769n() {
        return this.f96395c;
    }

    @C12579k
    /* renamed from: o */
    public final String mo118770o() {
        return this.f96396d;
    }

    @C12579k
    /* renamed from: p */
    public final Map<PictureSize, List<ProductPicture>> mo118771p() {
        return this.f96397e;
    }

    @C12579k
    /* renamed from: q */
    public final String mo118772q() {
        return this.f96398f;
    }

    @C12579k
    /* renamed from: r */
    public final List<String> mo118773r() {
        return this.f96399g;
    }

    @C12579k
    /* renamed from: s */
    public final List<OfferDetail> mo118774s() {
        return this.f96400h;
    }

    @C12579k
    /* renamed from: t */
    public final String mo118775t() {
        return this.f96401i;
    }

    @C12579k
    public String toString() {
        String h = Gtin.m157313h(this.f96393a);
        String str = this.f96394b;
        String str2 = this.f96395c;
        String str3 = this.f96396d;
        Map<PictureSize, List<ProductPicture>> map = this.f96397e;
        String str4 = this.f96398f;
        List<String> list = this.f96399g;
        List<OfferDetail> list2 = this.f96400h;
        String str5 = this.f96401i;
        String str6 = this.f96402j;
        Double d = this.f96403k;
        List<Pair<String, String>> list3 = this.f96404l;
        String str7 = this.f96405m;
        return "ProductDetailNal(gtin=" + h + ", name=" + str + ", brand=" + str2 + ", packaging=" + str3 + ", pictures=" + map + ", description=" + str4 + ", keyFeatures=" + list + ", offers=" + list2 + ", taxeMessage=" + str5 + ", category=" + str6 + ", repairIndex=" + d + ", characteristics=" + list3 + ", energyLabel=" + str7 + ")";
    }

    @C12579k
    /* renamed from: u */
    public final C38110e mo118777u(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k Map<PictureSize, ? extends List<ProductPicture>> map, @C12579k String str5, @C12579k List<String> list, @C12579k List<OfferDetail> list2, @C12579k String str6, @C12580l String str7, @C12580l Double d, @C12579k List<Pair<String, String>> list3, @C12580l String str8) {
        String str9 = str;
        Intrinsics.checkNotNullParameter(str9, "gtin");
        String str10 = str2;
        Intrinsics.checkNotNullParameter(str10, "name");
        String str11 = str3;
        Intrinsics.checkNotNullParameter(str11, "brand");
        String str12 = str4;
        Intrinsics.checkNotNullParameter(str12, "packaging");
        Map<PictureSize, ? extends List<ProductPicture>> map2 = map;
        Intrinsics.checkNotNullParameter(map2, "pictures");
        String str13 = str5;
        Intrinsics.checkNotNullParameter(str13, "description");
        List<String> list4 = list;
        Intrinsics.checkNotNullParameter(list4, "keyFeatures");
        List<OfferDetail> list5 = list2;
        Intrinsics.checkNotNullParameter(list5, "offers");
        String str14 = str6;
        Intrinsics.checkNotNullParameter(str14, "taxeMessage");
        List<Pair<String, String>> list6 = list3;
        Intrinsics.checkNotNullParameter(list6, "characteristics");
        return new C38110e(str9, str10, str11, str12, map2, str13, list4, list5, str14, str7, d, list6, str8, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: w */
    public final List<Pair<String, String>> mo118778w() {
        return this.f96404l;
    }

    @C12580l
    /* renamed from: x */
    public final String mo118779x() {
        return this.f96405m;
    }

    public C38110e(String str, String str2, String str3, String str4, Map<PictureSize, ? extends List<ProductPicture>> map, String str5, List<String> list, List<OfferDetail> list2, String str6, String str7, Double d, List<Pair<String, String>> list3, String str8) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "brand");
        Intrinsics.checkNotNullParameter(str4, "packaging");
        Intrinsics.checkNotNullParameter(map, "pictures");
        Intrinsics.checkNotNullParameter(str5, "description");
        Intrinsics.checkNotNullParameter(list, "keyFeatures");
        Intrinsics.checkNotNullParameter(list2, "offers");
        Intrinsics.checkNotNullParameter(str6, "taxeMessage");
        Intrinsics.checkNotNullParameter(list3, "characteristics");
        this.f96393a = str;
        this.f96394b = str2;
        this.f96395c = str3;
        this.f96396d = str4;
        this.f96397e = map;
        this.f96398f = str5;
        this.f96399g = list;
        this.f96400h = list2;
        this.f96401i = str6;
        this.f96402j = str7;
        this.f96403k = d;
        this.f96404l = list3;
        this.f96405m = str8;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38110e(String str, String str2, String str3, String str4, Map map, String str5, List list, List list2, String str6, String str7, Double d, List list3, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, map, str5, list, list2, str6, (i & 512) != 0 ? null : str7, d, list3, str8, (DefaultConstructorMarker) null);
    }
}
