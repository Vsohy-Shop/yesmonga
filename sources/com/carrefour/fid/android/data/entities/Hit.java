package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0013\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003Jp\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006-"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/Hit;", "", "score", "", "sort", "", "", "offers", "Lcom/carrefour/fid/android/data/entities/Offer;", "product", "Lcom/carrefour/fid/android/data/entities/APIMProduct;", "productId", "source", "triMkpLangueDoc", "donAssociatifCarrefour", "(Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/data/entities/APIMProduct;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDonAssociatifCarrefour", "()Ljava/lang/String;", "getOffers", "()Ljava/util/List;", "getProduct", "()Lcom/carrefour/fid/android/data/entities/APIMProduct;", "getProductId", "getScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSort", "getSource", "getTriMkpLangueDoc", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/data/entities/APIMProduct;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/data/entities/Hit;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class Hit {
    public static final int $stable = 8;
    @C33608c("ES_champ_donassociatif_carrefour")
    @C12579k
    private final String donAssociatifCarrefour;
    @C33608c("offers")
    @C12579k
    private final List<Offer> offers;
    @C33608c("product")
    @C12579k
    private final APIMProduct product;
    @C33608c("productId")
    @C12579k
    private final String productId;
    @C33608c("score")
    @C12580l
    private final Double score;
    @C33608c("sort")
    @C12580l
    private final List<String> sort;
    @C33608c("source")
    @C12579k
    private final String source;
    @C33608c("EM_tri_mkp_languedoc")
    @C12579k
    private final String triMkpLangueDoc;

    public Hit(@C12580l Double d, @C12580l List<String> list, @C12579k List<Offer> list2, @C12579k APIMProduct aPIMProduct, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(list2, "offers");
        Intrinsics.checkNotNullParameter(aPIMProduct, "product");
        Intrinsics.checkNotNullParameter(str, "productId");
        Intrinsics.checkNotNullParameter(str2, "source");
        Intrinsics.checkNotNullParameter(str3, "triMkpLangueDoc");
        Intrinsics.checkNotNullParameter(str4, "donAssociatifCarrefour");
        this.score = d;
        this.sort = list;
        this.offers = list2;
        this.product = aPIMProduct;
        this.productId = str;
        this.source = str2;
        this.triMkpLangueDoc = str3;
        this.donAssociatifCarrefour = str4;
    }

    public static /* synthetic */ Hit copy$default(Hit hit, Double d, List list, List list2, APIMProduct aPIMProduct, String str, String str2, String str3, String str4, int i, Object obj) {
        Hit hit2 = hit;
        int i2 = i;
        return hit.copy((i2 & 1) != 0 ? hit2.score : d, (i2 & 2) != 0 ? hit2.sort : list, (i2 & 4) != 0 ? hit2.offers : list2, (i2 & 8) != 0 ? hit2.product : aPIMProduct, (i2 & 16) != 0 ? hit2.productId : str, (i2 & 32) != 0 ? hit2.source : str2, (i2 & 64) != 0 ? hit2.triMkpLangueDoc : str3, (i2 & 128) != 0 ? hit2.donAssociatifCarrefour : str4);
    }

    @C12580l
    public final Double component1() {
        return this.score;
    }

    @C12580l
    public final List<String> component2() {
        return this.sort;
    }

    @C12579k
    public final List<Offer> component3() {
        return this.offers;
    }

    @C12579k
    public final APIMProduct component4() {
        return this.product;
    }

    @C12579k
    public final String component5() {
        return this.productId;
    }

    @C12579k
    public final String component6() {
        return this.source;
    }

    @C12579k
    public final String component7() {
        return this.triMkpLangueDoc;
    }

    @C12579k
    public final String component8() {
        return this.donAssociatifCarrefour;
    }

    @C12579k
    public final Hit copy(@C12580l Double d, @C12580l List<String> list, @C12579k List<Offer> list2, @C12579k APIMProduct aPIMProduct, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(list2, "offers");
        Intrinsics.checkNotNullParameter(aPIMProduct, "product");
        Intrinsics.checkNotNullParameter(str, "productId");
        String str5 = str2;
        Intrinsics.checkNotNullParameter(str5, "source");
        String str6 = str3;
        Intrinsics.checkNotNullParameter(str6, "triMkpLangueDoc");
        String str7 = str4;
        Intrinsics.checkNotNullParameter(str7, "donAssociatifCarrefour");
        return new Hit(d, list, list2, aPIMProduct, str, str5, str6, str7);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Hit)) {
            return false;
        }
        Hit hit = (Hit) obj;
        return Intrinsics.areEqual((Object) this.score, (Object) hit.score) && Intrinsics.areEqual((Object) this.sort, (Object) hit.sort) && Intrinsics.areEqual((Object) this.offers, (Object) hit.offers) && Intrinsics.areEqual((Object) this.product, (Object) hit.product) && Intrinsics.areEqual((Object) this.productId, (Object) hit.productId) && Intrinsics.areEqual((Object) this.source, (Object) hit.source) && Intrinsics.areEqual((Object) this.triMkpLangueDoc, (Object) hit.triMkpLangueDoc) && Intrinsics.areEqual((Object) this.donAssociatifCarrefour, (Object) hit.donAssociatifCarrefour);
    }

    @C12579k
    public final String getDonAssociatifCarrefour() {
        return this.donAssociatifCarrefour;
    }

    @C12579k
    public final List<Offer> getOffers() {
        return this.offers;
    }

    @C12579k
    public final APIMProduct getProduct() {
        return this.product;
    }

    @C12579k
    public final String getProductId() {
        return this.productId;
    }

    @C12580l
    public final Double getScore() {
        return this.score;
    }

    @C12580l
    public final List<String> getSort() {
        return this.sort;
    }

    @C12579k
    public final String getSource() {
        return this.source;
    }

    @C12579k
    public final String getTriMkpLangueDoc() {
        return this.triMkpLangueDoc;
    }

    public int hashCode() {
        Double d = this.score;
        int i = 0;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        List<String> list = this.sort;
        if (list != null) {
            i = list.hashCode();
        }
        return ((((((((((((hashCode + i) * 31) + this.offers.hashCode()) * 31) + this.product.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.source.hashCode()) * 31) + this.triMkpLangueDoc.hashCode()) * 31) + this.donAssociatifCarrefour.hashCode();
    }

    @C12579k
    public String toString() {
        Double d = this.score;
        List<String> list = this.sort;
        List<Offer> list2 = this.offers;
        APIMProduct aPIMProduct = this.product;
        String str = this.productId;
        String str2 = this.source;
        String str3 = this.triMkpLangueDoc;
        String str4 = this.donAssociatifCarrefour;
        return "Hit(score=" + d + ", sort=" + list + ", offers=" + list2 + ", product=" + aPIMProduct + ", productId=" + str + ", source=" + str2 + ", triMkpLangueDoc=" + str3 + ", donAssociatifCarrefour=" + str4 + ")";
    }
}
