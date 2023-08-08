package com.carrefour.fid.android.domain.models.product.plp;

import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.criteo.C38012n;
import com.carrefour.fid.android.domain.models.delivery.DeliveryMode;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.ProductNutriScore;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.domain.models.product.detail.PictureSize;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.product.plp.c */
public final class C38115c {
    @C12579k

    /* renamed from: a */
    public final String f96437a;
    @C12580l

    /* renamed from: b */
    public final ProductCategory f96438b;
    @C12579k

    /* renamed from: c */
    public final String f96439c;
    @C12579k

    /* renamed from: d */
    public final String f96440d;
    @C12579k

    /* renamed from: e */
    public final String f96441e;
    @C12579k

    /* renamed from: f */
    public final Map<PictureSize, List<ProductPicture>> f96442f;
    @C12579k

    /* renamed from: g */
    public final String f96443g;
    @C12579k

    /* renamed from: h */
    public final List<String> f96444h;
    @C12579k

    /* renamed from: i */
    public final List<PlpOffer> f96445i;
    @C12579k

    /* renamed from: j */
    public final String f96446j;
    @C12580l

    /* renamed from: k */
    public final Double f96447k;

    /* renamed from: l */
    public final boolean f96448l;

    /* renamed from: m */
    public final boolean f96449m;
    @C12579k

    /* renamed from: n */
    public final List<DeliveryMode> f96450n;
    @C12579k

    /* renamed from: o */
    public final String f96451o;
    @C12579k

    /* renamed from: p */
    public final List<OfferFlag> f96452p;
    @C12580l

    /* renamed from: q */
    public final ProductNutriScore f96453q;
    @C12580l

    /* renamed from: r */
    public final C38012n f96454r;

    public /* synthetic */ C38115c(String str, ProductCategory productCategory, String str2, String str3, String str4, Map map, String str5, List list, List list2, String str6, Double d, boolean z, boolean z2, List list3, String str7, List list4, ProductNutriScore productNutriScore, C38012n nVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, productCategory, str2, str3, str4, map, str5, list, list2, str6, d, z, z2, list3, str7, list4, productNutriScore, nVar);
    }

    /* renamed from: t */
    public static /* synthetic */ C38115c m157720t(C38115c cVar, String str, ProductCategory productCategory, String str2, String str3, String str4, Map map, String str5, List list, List list2, String str6, Double d, boolean z, boolean z2, List list3, String str7, List list4, ProductNutriScore productNutriScore, C38012n nVar, int i, Object obj) {
        C38115c cVar2 = cVar;
        int i2 = i;
        return cVar.mo118882s((i2 & 1) != 0 ? cVar2.f96437a : str, (i2 & 2) != 0 ? cVar2.f96438b : productCategory, (i2 & 4) != 0 ? cVar2.f96439c : str2, (i2 & 8) != 0 ? cVar2.f96440d : str3, (i2 & 16) != 0 ? cVar2.f96441e : str4, (i2 & 32) != 0 ? cVar2.f96442f : map, (i2 & 64) != 0 ? cVar2.f96443g : str5, (i2 & 128) != 0 ? cVar2.f96444h : list, (i2 & 256) != 0 ? cVar2.f96445i : list2, (i2 & 512) != 0 ? cVar2.f96446j : str6, (i2 & 1024) != 0 ? cVar2.f96447k : d, (i2 & 2048) != 0 ? cVar2.f96448l : z, (i2 & 4096) != 0 ? cVar2.f96449m : z2, (i2 & 8192) != 0 ? cVar2.f96450n : list3, (i2 & 16384) != 0 ? cVar2.f96451o : str7, (i2 & 32768) != 0 ? cVar2.f96452p : list4, (i2 & 65536) != 0 ? cVar2.f96453q : productNutriScore, (i2 & 131072) != 0 ? cVar2.f96454r : nVar);
    }

    @C12579k
    /* renamed from: A */
    public final String mo118850A() {
        return this.f96437a;
    }

    @C12579k
    /* renamed from: B */
    public final String mo118851B() {
        return this.f96451o;
    }

    @C12579k
    /* renamed from: C */
    public final List<String> mo118852C() {
        return this.f96444h;
    }

    @C12579k
    /* renamed from: D */
    public final String mo118853D() {
        return this.f96439c;
    }

    @C12580l
    /* renamed from: E */
    public final ProductNutriScore mo118854E() {
        return this.f96453q;
    }

    @C12579k
    /* renamed from: F */
    public final List<PlpOffer> mo118855F() {
        return this.f96445i;
    }

    @C12579k
    /* renamed from: G */
    public final String mo118856G() {
        return this.f96441e;
    }

    @C12579k
    /* renamed from: H */
    public final Map<PictureSize, List<ProductPicture>> mo118857H() {
        return this.f96442f;
    }

    @C12580l
    /* renamed from: I */
    public final Double mo118858I() {
        return this.f96447k;
    }

    @C12579k
    /* renamed from: J */
    public final String mo118859J() {
        return this.f96446j;
    }

    /* renamed from: K */
    public final boolean mo118860K() {
        return this.f96449m;
    }

    /* renamed from: L */
    public final boolean mo118861L() {
        return this.f96448l;
    }

    @C12579k
    /* renamed from: a */
    public final String mo118862a() {
        return this.f96437a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo118863b() {
        return this.f96446j;
    }

    @C12580l
    /* renamed from: c */
    public final Double mo118864c() {
        return this.f96447k;
    }

    /* renamed from: d */
    public final boolean mo118865d() {
        return this.f96448l;
    }

    /* renamed from: e */
    public final boolean mo118866e() {
        return this.f96449m;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38115c)) {
            return false;
        }
        C38115c cVar = (C38115c) obj;
        return Gtin.m157311e(this.f96437a, cVar.f96437a) && Intrinsics.areEqual((Object) this.f96438b, (Object) cVar.f96438b) && Intrinsics.areEqual((Object) this.f96439c, (Object) cVar.f96439c) && Intrinsics.areEqual((Object) this.f96440d, (Object) cVar.f96440d) && Intrinsics.areEqual((Object) this.f96441e, (Object) cVar.f96441e) && Intrinsics.areEqual((Object) this.f96442f, (Object) cVar.f96442f) && Intrinsics.areEqual((Object) this.f96443g, (Object) cVar.f96443g) && Intrinsics.areEqual((Object) this.f96444h, (Object) cVar.f96444h) && Intrinsics.areEqual((Object) this.f96445i, (Object) cVar.f96445i) && Intrinsics.areEqual((Object) this.f96446j, (Object) cVar.f96446j) && Intrinsics.areEqual((Object) this.f96447k, (Object) cVar.f96447k) && this.f96448l == cVar.f96448l && this.f96449m == cVar.f96449m && Intrinsics.areEqual((Object) this.f96450n, (Object) cVar.f96450n) && Intrinsics.areEqual((Object) this.f96451o, (Object) cVar.f96451o) && Intrinsics.areEqual((Object) this.f96452p, (Object) cVar.f96452p) && this.f96453q == cVar.f96453q && Intrinsics.areEqual((Object) this.f96454r, (Object) cVar.f96454r);
    }

    @C12579k
    /* renamed from: f */
    public final List<DeliveryMode> mo118868f() {
        return this.f96450n;
    }

    @C12579k
    /* renamed from: g */
    public final String mo118869g() {
        return this.f96451o;
    }

    @C12579k
    /* renamed from: h */
    public final List<OfferFlag> mo118870h() {
        return this.f96452p;
    }

    public int hashCode() {
        int g = Gtin.m157312g(this.f96437a) * 31;
        ProductCategory productCategory = this.f96438b;
        int i = 0;
        int hashCode = (((((((((((((((((g + (productCategory == null ? 0 : productCategory.hashCode())) * 31) + this.f96439c.hashCode()) * 31) + this.f96440d.hashCode()) * 31) + this.f96441e.hashCode()) * 31) + this.f96442f.hashCode()) * 31) + this.f96443g.hashCode()) * 31) + this.f96444h.hashCode()) * 31) + this.f96445i.hashCode()) * 31) + this.f96446j.hashCode()) * 31;
        Double d = this.f96447k;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        boolean z = this.f96448l;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f96449m;
        if (!z3) {
            z2 = z3;
        }
        int hashCode3 = (((((((i2 + (z2 ? 1 : 0)) * 31) + this.f96450n.hashCode()) * 31) + this.f96451o.hashCode()) * 31) + this.f96452p.hashCode()) * 31;
        ProductNutriScore productNutriScore = this.f96453q;
        int hashCode4 = (hashCode3 + (productNutriScore == null ? 0 : productNutriScore.hashCode())) * 31;
        C38012n nVar = this.f96454r;
        if (nVar != null) {
            i = nVar.hashCode();
        }
        return hashCode4 + i;
    }

    @C12580l
    /* renamed from: i */
    public final ProductNutriScore mo118872i() {
        return this.f96453q;
    }

    @C12580l
    /* renamed from: j */
    public final C38012n mo118873j() {
        return this.f96454r;
    }

    @C12580l
    /* renamed from: k */
    public final ProductCategory mo118874k() {
        return this.f96438b;
    }

    @C12579k
    /* renamed from: l */
    public final String mo118875l() {
        return this.f96439c;
    }

    @C12579k
    /* renamed from: m */
    public final String mo118876m() {
        return this.f96440d;
    }

    @C12579k
    /* renamed from: n */
    public final String mo118877n() {
        return this.f96441e;
    }

    @C12579k
    /* renamed from: o */
    public final Map<PictureSize, List<ProductPicture>> mo118878o() {
        return this.f96442f;
    }

    @C12579k
    /* renamed from: p */
    public final String mo118879p() {
        return this.f96443g;
    }

    @C12579k
    /* renamed from: q */
    public final List<String> mo118880q() {
        return this.f96444h;
    }

    @C12579k
    /* renamed from: r */
    public final List<PlpOffer> mo118881r() {
        return this.f96445i;
    }

    @C12579k
    /* renamed from: s */
    public final C38115c mo118882s(@C12579k String str, @C12580l ProductCategory productCategory, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k Map<PictureSize, ? extends List<ProductPicture>> map, @C12579k String str5, @C12579k List<String> list, @C12579k List<PlpOffer> list2, @C12579k String str6, @C12580l Double d, boolean z, boolean z2, @C12579k List<? extends DeliveryMode> list3, @C12579k String str7, @C12579k List<? extends OfferFlag> list4, @C12580l ProductNutriScore productNutriScore, @C12580l C38012n nVar) {
        String str8 = str;
        Intrinsics.checkNotNullParameter(str8, "gtin");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "brand");
        Intrinsics.checkNotNullParameter(str4, "packaging");
        Intrinsics.checkNotNullParameter(map, "pictures");
        Intrinsics.checkNotNullParameter(str5, "description");
        Intrinsics.checkNotNullParameter(list, "keyFeatures");
        Intrinsics.checkNotNullParameter(list2, "offers");
        Intrinsics.checkNotNullParameter(str6, "taxeMessage");
        Intrinsics.checkNotNullParameter(list3, "deliveryMode");
        Intrinsics.checkNotNullParameter(str7, "informationFlagFormat");
        Intrinsics.checkNotNullParameter(list4, "flags");
        return new C38115c(str8, productCategory, str2, str3, str4, map, str5, list, list2, str6, d, z, z2, list3, str7, list4, productNutriScore, nVar, (DefaultConstructorMarker) null);
    }

    @C12579k
    public String toString() {
        String h = Gtin.m157313h(this.f96437a);
        ProductCategory productCategory = this.f96438b;
        String str = this.f96439c;
        String str2 = this.f96440d;
        String str3 = this.f96441e;
        Map<PictureSize, List<ProductPicture>> map = this.f96442f;
        String str4 = this.f96443g;
        List<String> list = this.f96444h;
        List<PlpOffer> list2 = this.f96445i;
        String str5 = this.f96446j;
        Double d = this.f96447k;
        boolean z = this.f96448l;
        boolean z2 = this.f96449m;
        List<DeliveryMode> list3 = this.f96450n;
        String str6 = this.f96451o;
        List<OfferFlag> list4 = this.f96452p;
        ProductNutriScore productNutriScore = this.f96453q;
        C38012n nVar = this.f96454r;
        return "PlpProduct(gtin=" + h + ", category=" + productCategory + ", name=" + str + ", brand=" + str2 + ", packaging=" + str3 + ", pictures=" + map + ", description=" + str4 + ", keyFeatures=" + list + ", offers=" + list2 + ", taxeMessage=" + str5 + ", repairIndex=" + d + ", isVariableWeight=" + z + ", isFood=" + z2 + ", deliveryMode=" + list3 + ", informationFlagFormat=" + str6 + ", flags=" + list4 + ", nutriScore=" + productNutriScore + ", criteoProduct=" + nVar + ")";
    }

    @C12579k
    /* renamed from: u */
    public final String mo118884u() {
        return this.f96440d;
    }

    @C12580l
    /* renamed from: v */
    public final ProductCategory mo118885v() {
        return this.f96438b;
    }

    @C12580l
    /* renamed from: w */
    public final C38012n mo118886w() {
        return this.f96454r;
    }

    @C12579k
    /* renamed from: x */
    public final List<DeliveryMode> mo118887x() {
        return this.f96450n;
    }

    @C12579k
    /* renamed from: y */
    public final String mo118888y() {
        return this.f96443g;
    }

    @C12579k
    /* renamed from: z */
    public final List<OfferFlag> mo118889z() {
        return this.f96452p;
    }

    public C38115c(String str, ProductCategory productCategory, String str2, String str3, String str4, Map<PictureSize, ? extends List<ProductPicture>> map, String str5, List<String> list, List<PlpOffer> list2, String str6, Double d, boolean z, boolean z2, List<? extends DeliveryMode> list3, String str7, List<? extends OfferFlag> list4, ProductNutriScore productNutriScore, C38012n nVar) {
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        Map<PictureSize, ? extends List<ProductPicture>> map2 = map;
        String str11 = str5;
        List<String> list5 = list;
        List<PlpOffer> list6 = list2;
        String str12 = str6;
        List<? extends DeliveryMode> list7 = list3;
        String str13 = str7;
        List<? extends OfferFlag> list8 = list4;
        Intrinsics.checkNotNullParameter(str, "gtin");
        Intrinsics.checkNotNullParameter(str8, "name");
        Intrinsics.checkNotNullParameter(str9, "brand");
        Intrinsics.checkNotNullParameter(str10, "packaging");
        Intrinsics.checkNotNullParameter(map2, "pictures");
        Intrinsics.checkNotNullParameter(str11, "description");
        Intrinsics.checkNotNullParameter(list5, "keyFeatures");
        Intrinsics.checkNotNullParameter(list6, "offers");
        Intrinsics.checkNotNullParameter(str12, "taxeMessage");
        Intrinsics.checkNotNullParameter(list7, "deliveryMode");
        Intrinsics.checkNotNullParameter(str13, "informationFlagFormat");
        Intrinsics.checkNotNullParameter(list8, "flags");
        this.f96437a = str;
        this.f96438b = productCategory;
        this.f96439c = str8;
        this.f96440d = str9;
        this.f96441e = str10;
        this.f96442f = map2;
        this.f96443g = str11;
        this.f96444h = list5;
        this.f96445i = list6;
        this.f96446j = str12;
        this.f96447k = d;
        this.f96448l = z;
        this.f96449m = z2;
        this.f96450n = list7;
        this.f96451o = str13;
        this.f96452p = list8;
        this.f96453q = productNutriScore;
        this.f96454r = nVar;
    }
}
