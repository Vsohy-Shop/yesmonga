package com.carrefour.fid.android.domain.models.product.detail;

import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.offer.Prices;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class OfferDetail {
    @C12579k

    /* renamed from: a */
    public final OfferIdentifier f96349a;
    @C12580l

    /* renamed from: b */
    public final String f96350b;
    @C12580l

    /* renamed from: c */
    public final ChannelType f96351c;

    /* renamed from: d */
    public final int f96352d;

    /* renamed from: e */
    public final int f96353e;

    /* renamed from: f */
    public final int f96354f;
    @C12579k

    /* renamed from: g */
    public final OfferAvailability f96355g;
    @C12579k

    /* renamed from: h */
    public final Prices f96356h;
    @C12579k

    /* renamed from: i */
    public final List<Discount> f96357i;
    @C12580l

    /* renamed from: j */
    public final String f96358j;
    @C12580l

    /* renamed from: k */
    public final String f96359k;

    /* renamed from: l */
    public final boolean f96360l;

    /* renamed from: m */
    public final boolean f96361m;
    @C12579k

    /* renamed from: n */
    public final String f96362n;

    /* renamed from: o */
    public final boolean f96363o;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/detail/OfferDetail$ChannelType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum ChannelType {
        HOME_DELIVERY_NAL,
        EXPRESS_DELIVERY,
        MARKET_PLACE,
        DRIVE_CLCV
    }

    public /* synthetic */ OfferDetail(OfferIdentifier offerIdentifier, String str, ChannelType channelType, int i, int i2, int i3, OfferAvailability offerAvailability, Prices prices, List list, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(offerIdentifier, str, channelType, i, i2, i3, offerAvailability, prices, list, str2, str3, z, z2, str4, z3);
    }

    /* renamed from: q */
    public static /* synthetic */ OfferDetail m157542q(OfferDetail offerDetail, OfferIdentifier offerIdentifier, String str, ChannelType channelType, int i, int i2, int i3, OfferAvailability offerAvailability, Prices prices, List list, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, int i4, Object obj) {
        OfferDetail offerDetail2 = offerDetail;
        int i5 = i4;
        return offerDetail.mo118698p((i5 & 1) != 0 ? offerDetail2.f96349a : offerIdentifier, (i5 & 2) != 0 ? offerDetail2.f96350b : str, (i5 & 4) != 0 ? offerDetail2.f96351c : channelType, (i5 & 8) != 0 ? offerDetail2.f96352d : i, (i5 & 16) != 0 ? offerDetail2.f96353e : i2, (i5 & 32) != 0 ? offerDetail2.f96354f : i3, (i5 & 64) != 0 ? offerDetail2.f96355g : offerAvailability, (i5 & 128) != 0 ? offerDetail2.f96356h : prices, (i5 & 256) != 0 ? offerDetail2.f96357i : list, (i5 & 512) != 0 ? offerDetail2.f96358j : str2, (i5 & 1024) != 0 ? offerDetail2.f96359k : str3, (i5 & 2048) != 0 ? offerDetail2.f96360l : z, (i5 & 4096) != 0 ? offerDetail2.f96361m : z2, (i5 & 8192) != 0 ? offerDetail2.f96362n : str4, (i5 & 16384) != 0 ? offerDetail2.f96363o : z3);
    }

    /* renamed from: A */
    public final int mo118675A() {
        return this.f96354f;
    }

    /* renamed from: B */
    public final int mo118676B() {
        return this.f96353e;
    }

    /* renamed from: C */
    public final int mo118677C() {
        return this.f96352d;
    }

    /* renamed from: D */
    public final boolean mo118678D() {
        return this.f96361m;
    }

    /* renamed from: E */
    public final boolean mo118679E() {
        return this.f96360l;
    }

    /* renamed from: F */
    public final boolean mo118680F() {
        return this.f96363o;
    }

    @C12579k
    /* renamed from: a */
    public final OfferIdentifier mo118681a() {
        return this.f96349a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo118682b() {
        return this.f96358j;
    }

    @C12580l
    /* renamed from: c */
    public final String mo118683c() {
        return this.f96359k;
    }

    /* renamed from: d */
    public final boolean mo118684d() {
        return this.f96360l;
    }

    /* renamed from: e */
    public final boolean mo118685e() {
        return this.f96361m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.jetbrains.annotations.C12580l java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.carrefour.fid.android.domain.models.product.detail.OfferDetail
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail r5 = (com.carrefour.fid.android.domain.models.product.detail.OfferDetail) r5
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r1 = r4.f96349a
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r3 = r5.f96349a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0017
            return r2
        L_0x0017:
            java.lang.String r1 = r4.f96350b
            java.lang.String r3 = r5.f96350b
            if (r1 != 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            r1 = r0
            goto L_0x0029
        L_0x0021:
            if (r3 != 0) goto L_0x0025
        L_0x0023:
            r1 = r2
            goto L_0x0029
        L_0x0025:
            boolean r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157962f(r1, r3)
        L_0x0029:
            if (r1 != 0) goto L_0x002c
            return r2
        L_0x002c:
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r1 = r4.f96351c
            com.carrefour.fid.android.domain.models.product.detail.OfferDetail$ChannelType r3 = r5.f96351c
            if (r1 == r3) goto L_0x0033
            return r2
        L_0x0033:
            int r1 = r4.f96352d
            int r3 = r5.f96352d
            if (r1 == r3) goto L_0x003a
            return r2
        L_0x003a:
            int r1 = r4.f96353e
            int r3 = r5.f96353e
            if (r1 == r3) goto L_0x0041
            return r2
        L_0x0041:
            int r1 = r4.f96354f
            int r3 = r5.f96354f
            if (r1 == r3) goto L_0x0048
            return r2
        L_0x0048:
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r1 = r4.f96355g
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r3 = r5.f96355g
            if (r1 == r3) goto L_0x004f
            return r2
        L_0x004f:
            com.carrefour.fid.android.domain.models.offer.Prices r1 = r4.f96356h
            com.carrefour.fid.android.domain.models.offer.Prices r3 = r5.f96356h
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x005a
            return r2
        L_0x005a:
            java.util.List<com.carrefour.fid.android.domain.models.offer.Discount> r1 = r4.f96357i
            java.util.List<com.carrefour.fid.android.domain.models.offer.Discount> r3 = r5.f96357i
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0065
            return r2
        L_0x0065:
            java.lang.String r1 = r4.f96358j
            java.lang.String r3 = r5.f96358j
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0070
            return r2
        L_0x0070:
            java.lang.String r1 = r4.f96359k
            java.lang.String r3 = r5.f96359k
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x007b
            return r2
        L_0x007b:
            boolean r1 = r4.f96360l
            boolean r3 = r5.f96360l
            if (r1 == r3) goto L_0x0082
            return r2
        L_0x0082:
            boolean r1 = r4.f96361m
            boolean r3 = r5.f96361m
            if (r1 == r3) goto L_0x0089
            return r2
        L_0x0089:
            java.lang.String r1 = r4.f96362n
            java.lang.String r3 = r5.f96362n
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0094
            return r2
        L_0x0094:
            boolean r1 = r4.f96363o
            boolean r5 = r5.f96363o
            if (r1 == r5) goto L_0x009b
            return r2
        L_0x009b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.product.detail.OfferDetail.equals(java.lang.Object):boolean");
    }

    @C12579k
    /* renamed from: f */
    public final String mo118687f() {
        return this.f96362n;
    }

    /* renamed from: g */
    public final boolean mo118688g() {
        return this.f96363o;
    }

    @C12580l
    /* renamed from: h */
    public final String mo118689h() {
        return this.f96350b;
    }

    public int hashCode() {
        int hashCode = this.f96349a.hashCode() * 31;
        String str = this.f96350b;
        int i = 0;
        int h = (hashCode + (str == null ? 0 : FacilityServiceId.m157963h(str))) * 31;
        ChannelType channelType = this.f96351c;
        int hashCode2 = (((((((((((((h + (channelType == null ? 0 : channelType.hashCode())) * 31) + Integer.hashCode(this.f96352d)) * 31) + Integer.hashCode(this.f96353e)) * 31) + Integer.hashCode(this.f96354f)) * 31) + this.f96355g.hashCode()) * 31) + this.f96356h.hashCode()) * 31) + this.f96357i.hashCode()) * 31;
        String str2 = this.f96358j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f96359k;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f96360l;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f96361m;
        if (z3) {
            z3 = true;
        }
        int hashCode4 = (((i3 + (z3 ? 1 : 0)) * 31) + this.f96362n.hashCode()) * 31;
        boolean z4 = this.f96363o;
        if (!z4) {
            z2 = z4;
        }
        return hashCode4 + (z2 ? 1 : 0);
    }

    @C12580l
    /* renamed from: i */
    public final ChannelType mo118691i() {
        return this.f96351c;
    }

    /* renamed from: j */
    public final int mo118692j() {
        return this.f96352d;
    }

    /* renamed from: k */
    public final int mo118693k() {
        return this.f96353e;
    }

    /* renamed from: l */
    public final int mo118694l() {
        return this.f96354f;
    }

    @C12579k
    /* renamed from: m */
    public final OfferAvailability mo118695m() {
        return this.f96355g;
    }

    @C12579k
    /* renamed from: n */
    public final Prices mo118696n() {
        return this.f96356h;
    }

    @C12579k
    /* renamed from: o */
    public final List<Discount> mo118697o() {
        return this.f96357i;
    }

    @C12579k
    /* renamed from: p */
    public final OfferDetail mo118698p(@C12579k OfferIdentifier offerIdentifier, @C12580l String str, @C12580l ChannelType channelType, int i, int i2, int i3, @C12579k OfferAvailability offerAvailability, @C12579k Prices prices, @C12579k List<Discount> list, @C12580l String str2, @C12580l String str3, boolean z, boolean z2, @C12579k String str4, boolean z3) {
        OfferIdentifier offerIdentifier2 = offerIdentifier;
        Intrinsics.checkNotNullParameter(offerIdentifier2, "id");
        Intrinsics.checkNotNullParameter(offerAvailability, C28534f.f69157h0);
        Intrinsics.checkNotNullParameter(prices, "prices");
        Intrinsics.checkNotNullParameter(list, "discounts");
        Intrinsics.checkNotNullParameter(str4, "labelHighLight");
        return new OfferDetail(offerIdentifier2, str, channelType, i, i2, i3, offerAvailability, prices, list, str2, str3, z, z2, str4, z3, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: r */
    public final OfferAvailability mo118699r() {
        return this.f96355g;
    }

    @C12580l
    /* renamed from: s */
    public final ChannelType mo118700s() {
        return this.f96351c;
    }

    @C12580l
    /* renamed from: t */
    public final String mo118701t() {
        return this.f96358j;
    }

    @C12579k
    public String toString() {
        OfferIdentifier offerIdentifier = this.f96349a;
        String str = this.f96350b;
        String i = str == null ? "null" : FacilityServiceId.m157964i(str);
        ChannelType channelType = this.f96351c;
        int i2 = this.f96352d;
        int i3 = this.f96353e;
        int i4 = this.f96354f;
        OfferAvailability offerAvailability = this.f96355g;
        Prices prices = this.f96356h;
        List<Discount> list = this.f96357i;
        String str2 = this.f96358j;
        String str3 = this.f96359k;
        boolean z = this.f96360l;
        boolean z2 = this.f96361m;
        String str4 = this.f96362n;
        boolean z3 = this.f96363o;
        return "OfferDetail(id=" + offerIdentifier + ", facilityServiceId=" + i + ", channelType=" + channelType + ", purchasingStep=" + i2 + ", purchasingMin=" + i3 + ", purchasingMax=" + i4 + ", availability=" + offerAvailability + ", prices=" + prices + ", discounts=" + list + ", discountLabel=" + str2 + ", discountType=" + str3 + ", isPurchasable=" + z + ", isInAssortment=" + z2 + ", labelHighLight=" + str4 + ", isRelayPointEligible=" + z3 + ")";
    }

    @C12580l
    /* renamed from: u */
    public final String mo118703u() {
        return this.f96359k;
    }

    @C12579k
    /* renamed from: v */
    public final List<Discount> mo118704v() {
        return this.f96357i;
    }

    @C12580l
    /* renamed from: w */
    public final String mo118705w() {
        return this.f96350b;
    }

    @C12579k
    /* renamed from: x */
    public final OfferIdentifier mo118706x() {
        return this.f96349a;
    }

    @C12579k
    /* renamed from: y */
    public final String mo118707y() {
        return this.f96362n;
    }

    @C12579k
    /* renamed from: z */
    public final Prices mo118708z() {
        return this.f96356h;
    }

    public OfferDetail(OfferIdentifier offerIdentifier, String str, ChannelType channelType, int i, int i2, int i3, OfferAvailability offerAvailability, Prices prices, List<Discount> list, String str2, String str3, boolean z, boolean z2, String str4, boolean z3) {
        List<Discount> list2 = list;
        String str5 = str4;
        Intrinsics.checkNotNullParameter(offerIdentifier, "id");
        Intrinsics.checkNotNullParameter(offerAvailability, C28534f.f69157h0);
        Intrinsics.checkNotNullParameter(prices, "prices");
        Intrinsics.checkNotNullParameter(list2, "discounts");
        Intrinsics.checkNotNullParameter(str5, "labelHighLight");
        this.f96349a = offerIdentifier;
        this.f96350b = str;
        this.f96351c = channelType;
        this.f96352d = i;
        this.f96353e = i2;
        this.f96354f = i3;
        this.f96355g = offerAvailability;
        this.f96356h = prices;
        this.f96357i = list2;
        this.f96358j = str2;
        this.f96359k = str3;
        this.f96360l = z;
        this.f96361m = z2;
        this.f96362n = str5;
        this.f96363o = z3;
    }
}
