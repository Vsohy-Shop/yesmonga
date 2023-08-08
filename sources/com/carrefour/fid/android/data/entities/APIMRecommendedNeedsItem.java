package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsItem;", "", "gtin", "", "productCdBase", "score", "", "strategy", "searchType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getGtin", "()Ljava/lang/String;", "getProductCdBase", "getScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSearchType", "getStrategy", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/data/entities/APIMRecommendedNeedsItem;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMRecommendedNeedsItem {
    public static final int $stable = 0;
    @C33608c("gtin")
    @C12580l
    private final String gtin;
    @C33608c("product_cdbase")
    @C12580l
    private final String productCdBase;
    @C33608c("score")
    @C12580l
    private final Double score;
    @C33608c("search_type")
    @C12580l
    private final String searchType;
    @C33608c("strategy")
    @C12580l
    private final String strategy;

    public APIMRecommendedNeedsItem() {
        this((String) null, (String) null, (Double) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ APIMRecommendedNeedsItem copy$default(APIMRecommendedNeedsItem aPIMRecommendedNeedsItem, String str, String str2, Double d, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aPIMRecommendedNeedsItem.gtin;
        }
        if ((i & 2) != 0) {
            str2 = aPIMRecommendedNeedsItem.productCdBase;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            d = aPIMRecommendedNeedsItem.score;
        }
        Double d2 = d;
        if ((i & 8) != 0) {
            str3 = aPIMRecommendedNeedsItem.strategy;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = aPIMRecommendedNeedsItem.searchType;
        }
        return aPIMRecommendedNeedsItem.copy(str, str5, d2, str6, str4);
    }

    @C12580l
    public final String component1() {
        return this.gtin;
    }

    @C12580l
    public final String component2() {
        return this.productCdBase;
    }

    @C12580l
    public final Double component3() {
        return this.score;
    }

    @C12580l
    public final String component4() {
        return this.strategy;
    }

    @C12580l
    public final String component5() {
        return this.searchType;
    }

    @C12579k
    public final APIMRecommendedNeedsItem copy(@C12580l String str, @C12580l String str2, @C12580l Double d, @C12580l String str3, @C12580l String str4) {
        return new APIMRecommendedNeedsItem(str, str2, d, str3, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMRecommendedNeedsItem)) {
            return false;
        }
        APIMRecommendedNeedsItem aPIMRecommendedNeedsItem = (APIMRecommendedNeedsItem) obj;
        return Intrinsics.areEqual((Object) this.gtin, (Object) aPIMRecommendedNeedsItem.gtin) && Intrinsics.areEqual((Object) this.productCdBase, (Object) aPIMRecommendedNeedsItem.productCdBase) && Intrinsics.areEqual((Object) this.score, (Object) aPIMRecommendedNeedsItem.score) && Intrinsics.areEqual((Object) this.strategy, (Object) aPIMRecommendedNeedsItem.strategy) && Intrinsics.areEqual((Object) this.searchType, (Object) aPIMRecommendedNeedsItem.searchType);
    }

    @C12580l
    public final String getGtin() {
        return this.gtin;
    }

    @C12580l
    public final String getProductCdBase() {
        return this.productCdBase;
    }

    @C12580l
    public final Double getScore() {
        return this.score;
    }

    @C12580l
    public final String getSearchType() {
        return this.searchType;
    }

    @C12580l
    public final String getStrategy() {
        return this.strategy;
    }

    public int hashCode() {
        String str = this.gtin;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productCdBase;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.score;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.strategy;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.searchType;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.gtin;
        String str2 = this.productCdBase;
        Double d = this.score;
        String str3 = this.strategy;
        String str4 = this.searchType;
        return "APIMRecommendedNeedsItem(gtin=" + str + ", productCdBase=" + str2 + ", score=" + d + ", strategy=" + str3 + ", searchType=" + str4 + ")";
    }

    public APIMRecommendedNeedsItem(@C12580l String str, @C12580l String str2, @C12580l Double d, @C12580l String str3, @C12580l String str4) {
        this.gtin = str;
        this.productCdBase = str2;
        this.score = d;
        this.strategy = str3;
        this.searchType = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ APIMRecommendedNeedsItem(java.lang.String r5, java.lang.String r6, java.lang.Double r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.APIMRecommendedNeedsItem.<init>(java.lang.String, java.lang.String, java.lang.Double, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
