package com.carrefour.fid.android.domain.models.product.plp;

import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferIdentifier;
import com.carrefour.fid.android.domain.models.offer.Prices;
import com.carrefour.fid.android.domain.models.product.ProductReference;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PlpOffer {
    @C12579k

    /* renamed from: a */
    public final OfferIdentifier f96408a;
    @C12579k

    /* renamed from: b */
    public final String f96409b;
    @C12580l

    /* renamed from: c */
    public final String f96410c;
    @C12580l

    /* renamed from: d */
    public final ChannelType f96411d;

    /* renamed from: e */
    public final int f96412e;

    /* renamed from: f */
    public final int f96413f;

    /* renamed from: g */
    public final int f96414g;
    @C12579k

    /* renamed from: h */
    public final OfferAvailability f96415h;
    @C12579k

    /* renamed from: i */
    public final String f96416i;
    @C12579k

    /* renamed from: j */
    public final Prices f96417j;
    @C12579k

    /* renamed from: k */
    public final List<Discount> f96418k;

    /* renamed from: l */
    public final boolean f96419l;

    /* renamed from: m */
    public final boolean f96420m;
    @C12579k

    /* renamed from: n */
    public final String f96421n;

    /* renamed from: o */
    public final boolean f96422o;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/plp/PlpOffer$ChannelType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum ChannelType {
        HOME_DELIVERY_NAL,
        EXPRESS_DELIVERY,
        MARKET_PLACE,
        DRIVE_CLCV
    }

    public /* synthetic */ PlpOffer(OfferIdentifier offerIdentifier, String str, String str2, ChannelType channelType, int i, int i2, int i3, OfferAvailability offerAvailability, String str3, Prices prices, List list, boolean z, boolean z2, String str4, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(offerIdentifier, str, str2, channelType, i, i2, i3, offerAvailability, str3, prices, list, z, z2, str4, z3);
    }

    /* renamed from: q */
    public static /* synthetic */ PlpOffer m157665q(PlpOffer plpOffer, OfferIdentifier offerIdentifier, String str, String str2, ChannelType channelType, int i, int i2, int i3, OfferAvailability offerAvailability, String str3, Prices prices, List list, boolean z, boolean z2, String str4, boolean z3, int i4, Object obj) {
        PlpOffer plpOffer2 = plpOffer;
        int i5 = i4;
        return plpOffer.mo118813p((i5 & 1) != 0 ? plpOffer2.f96408a : offerIdentifier, (i5 & 2) != 0 ? plpOffer2.f96409b : str, (i5 & 4) != 0 ? plpOffer2.f96410c : str2, (i5 & 8) != 0 ? plpOffer2.f96411d : channelType, (i5 & 16) != 0 ? plpOffer2.f96412e : i, (i5 & 32) != 0 ? plpOffer2.f96413f : i2, (i5 & 64) != 0 ? plpOffer2.f96414g : i3, (i5 & 128) != 0 ? plpOffer2.f96415h : offerAvailability, (i5 & 256) != 0 ? plpOffer2.f96416i : str3, (i5 & 512) != 0 ? plpOffer2.f96417j : prices, (i5 & 1024) != 0 ? plpOffer2.f96418k : list, (i5 & 2048) != 0 ? plpOffer2.f96419l : z, (i5 & 4096) != 0 ? plpOffer2.f96420m : z2, (i5 & 8192) != 0 ? plpOffer2.f96421n : str4, (i5 & 16384) != 0 ? plpOffer2.f96422o : z3);
    }

    /* renamed from: A */
    public final int mo118790A() {
        return this.f96413f;
    }

    /* renamed from: B */
    public final int mo118791B() {
        return this.f96412e;
    }

    @C12579k
    /* renamed from: C */
    public final String mo118792C() {
        return this.f96409b;
    }

    /* renamed from: D */
    public final boolean mo118793D() {
        return this.f96422o;
    }

    /* renamed from: E */
    public final boolean mo118794E() {
        return this.f96420m;
    }

    /* renamed from: F */
    public final boolean mo118795F() {
        return this.f96419l;
    }

    @C12579k
    /* renamed from: a */
    public final OfferIdentifier mo118796a() {
        return this.f96408a;
    }

    @C12579k
    /* renamed from: b */
    public final Prices mo118797b() {
        return this.f96417j;
    }

    @C12579k
    /* renamed from: c */
    public final List<Discount> mo118798c() {
        return this.f96418k;
    }

    /* renamed from: d */
    public final boolean mo118799d() {
        return this.f96419l;
    }

    /* renamed from: e */
    public final boolean mo118800e() {
        return this.f96420m;
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
            boolean r1 = r5 instanceof com.carrefour.fid.android.domain.models.product.plp.PlpOffer
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r5 = (com.carrefour.fid.android.domain.models.product.plp.PlpOffer) r5
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r1 = r4.f96408a
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r3 = r5.f96408a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0017
            return r2
        L_0x0017:
            java.lang.String r1 = r4.f96409b
            java.lang.String r3 = r5.f96409b
            boolean r1 = com.carrefour.fid.android.domain.models.product.ProductReference.m157469e(r1, r3)
            if (r1 != 0) goto L_0x0022
            return r2
        L_0x0022:
            java.lang.String r1 = r4.f96410c
            java.lang.String r3 = r5.f96410c
            if (r1 != 0) goto L_0x002c
            if (r3 != 0) goto L_0x002e
            r1 = r0
            goto L_0x0034
        L_0x002c:
            if (r3 != 0) goto L_0x0030
        L_0x002e:
            r1 = r2
            goto L_0x0034
        L_0x0030:
            boolean r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157962f(r1, r3)
        L_0x0034:
            if (r1 != 0) goto L_0x0037
            return r2
        L_0x0037:
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType r1 = r4.f96411d
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType r3 = r5.f96411d
            if (r1 == r3) goto L_0x003e
            return r2
        L_0x003e:
            int r1 = r4.f96412e
            int r3 = r5.f96412e
            if (r1 == r3) goto L_0x0045
            return r2
        L_0x0045:
            int r1 = r4.f96413f
            int r3 = r5.f96413f
            if (r1 == r3) goto L_0x004c
            return r2
        L_0x004c:
            int r1 = r4.f96414g
            int r3 = r5.f96414g
            if (r1 == r3) goto L_0x0053
            return r2
        L_0x0053:
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r1 = r4.f96415h
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r3 = r5.f96415h
            if (r1 == r3) goto L_0x005a
            return r2
        L_0x005a:
            java.lang.String r1 = r4.f96416i
            java.lang.String r3 = r5.f96416i
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0065
            return r2
        L_0x0065:
            com.carrefour.fid.android.domain.models.offer.Prices r1 = r4.f96417j
            com.carrefour.fid.android.domain.models.offer.Prices r3 = r5.f96417j
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0070
            return r2
        L_0x0070:
            java.util.List<com.carrefour.fid.android.domain.models.offer.Discount> r1 = r4.f96418k
            java.util.List<com.carrefour.fid.android.domain.models.offer.Discount> r3 = r5.f96418k
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x007b
            return r2
        L_0x007b:
            boolean r1 = r4.f96419l
            boolean r3 = r5.f96419l
            if (r1 == r3) goto L_0x0082
            return r2
        L_0x0082:
            boolean r1 = r4.f96420m
            boolean r3 = r5.f96420m
            if (r1 == r3) goto L_0x0089
            return r2
        L_0x0089:
            java.lang.String r1 = r4.f96421n
            java.lang.String r3 = r5.f96421n
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0094
            return r2
        L_0x0094:
            boolean r1 = r4.f96422o
            boolean r5 = r5.f96422o
            if (r1 == r5) goto L_0x009b
            return r2
        L_0x009b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.product.plp.PlpOffer.equals(java.lang.Object):boolean");
    }

    @C12579k
    /* renamed from: f */
    public final String mo118802f() {
        return this.f96421n;
    }

    /* renamed from: g */
    public final boolean mo118803g() {
        return this.f96422o;
    }

    @C12579k
    /* renamed from: h */
    public final String mo118804h() {
        return this.f96409b;
    }

    public int hashCode() {
        int hashCode = ((this.f96408a.hashCode() * 31) + ProductReference.m157470g(this.f96409b)) * 31;
        String str = this.f96410c;
        int i = 0;
        int h = (hashCode + (str == null ? 0 : FacilityServiceId.m157963h(str))) * 31;
        ChannelType channelType = this.f96411d;
        if (channelType != null) {
            i = channelType.hashCode();
        }
        int hashCode2 = (((((((((((((((h + i) * 31) + Integer.hashCode(this.f96412e)) * 31) + Integer.hashCode(this.f96413f)) * 31) + Integer.hashCode(this.f96414g)) * 31) + this.f96415h.hashCode()) * 31) + this.f96416i.hashCode()) * 31) + this.f96417j.hashCode()) * 31) + this.f96418k.hashCode()) * 31;
        boolean z = this.f96419l;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f96420m;
        if (z3) {
            z3 = true;
        }
        int hashCode3 = (((i2 + (z3 ? 1 : 0)) * 31) + this.f96421n.hashCode()) * 31;
        boolean z4 = this.f96422o;
        if (!z4) {
            z2 = z4;
        }
        return hashCode3 + (z2 ? 1 : 0);
    }

    @C12580l
    /* renamed from: i */
    public final String mo118806i() {
        return this.f96410c;
    }

    @C12580l
    /* renamed from: j */
    public final ChannelType mo118807j() {
        return this.f96411d;
    }

    /* renamed from: k */
    public final int mo118808k() {
        return this.f96412e;
    }

    /* renamed from: l */
    public final int mo118809l() {
        return this.f96413f;
    }

    /* renamed from: m */
    public final int mo118810m() {
        return this.f96414g;
    }

    @C12579k
    /* renamed from: n */
    public final OfferAvailability mo118811n() {
        return this.f96415h;
    }

    @C12579k
    /* renamed from: o */
    public final String mo118812o() {
        return this.f96416i;
    }

    @C12579k
    /* renamed from: p */
    public final PlpOffer mo118813p(@C12579k OfferIdentifier offerIdentifier, @C12579k String str, @C12580l String str2, @C12580l ChannelType channelType, int i, int i2, int i3, @C12579k OfferAvailability offerAvailability, @C12579k String str3, @C12579k Prices prices, @C12579k List<Discount> list, boolean z, boolean z2, @C12579k String str4, boolean z3) {
        OfferIdentifier offerIdentifier2 = offerIdentifier;
        Intrinsics.checkNotNullParameter(offerIdentifier2, "id");
        Intrinsics.checkNotNullParameter(str, "ref");
        Intrinsics.checkNotNullParameter(offerAvailability, C28534f.f69157h0);
        Intrinsics.checkNotNullParameter(str3, "origin");
        Intrinsics.checkNotNullParameter(prices, "prices");
        Intrinsics.checkNotNullParameter(list, "discounts");
        Intrinsics.checkNotNullParameter(str4, "labelHighLight");
        return new PlpOffer(offerIdentifier2, str, str2, channelType, i, i2, i3, offerAvailability, str3, prices, list, z, z2, str4, z3, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: r */
    public final OfferAvailability mo118814r() {
        return this.f96415h;
    }

    @C12580l
    /* renamed from: s */
    public final ChannelType mo118815s() {
        return this.f96411d;
    }

    @C12579k
    /* renamed from: t */
    public final List<Discount> mo118816t() {
        return this.f96418k;
    }

    @C12579k
    public String toString() {
        OfferIdentifier offerIdentifier = this.f96408a;
        String h = ProductReference.m157471h(this.f96409b);
        String str = this.f96410c;
        String i = str == null ? "null" : FacilityServiceId.m157964i(str);
        ChannelType channelType = this.f96411d;
        int i2 = this.f96412e;
        int i3 = this.f96413f;
        int i4 = this.f96414g;
        OfferAvailability offerAvailability = this.f96415h;
        String str2 = this.f96416i;
        Prices prices = this.f96417j;
        List<Discount> list = this.f96418k;
        boolean z = this.f96419l;
        boolean z2 = this.f96420m;
        String str3 = this.f96421n;
        boolean z3 = this.f96422o;
        return "PlpOffer(id=" + offerIdentifier + ", ref=" + h + ", facilityServiceId=" + i + ", channelType=" + channelType + ", purchasingStep=" + i2 + ", purchasingMin=" + i3 + ", purchasingMax=" + i4 + ", availability=" + offerAvailability + ", origin=" + str2 + ", prices=" + prices + ", discounts=" + list + ", isPurchasable=" + z + ", isInAssortment=" + z2 + ", labelHighLight=" + str3 + ", isAlternativeCheaper=" + z3 + ")";
    }

    @C12580l
    /* renamed from: u */
    public final String mo118818u() {
        return this.f96410c;
    }

    @C12579k
    /* renamed from: v */
    public final OfferIdentifier mo118819v() {
        return this.f96408a;
    }

    @C12579k
    /* renamed from: w */
    public final String mo118820w() {
        return this.f96421n;
    }

    @C12579k
    /* renamed from: x */
    public final String mo118821x() {
        return this.f96416i;
    }

    @C12579k
    /* renamed from: y */
    public final Prices mo118822y() {
        return this.f96417j;
    }

    /* renamed from: z */
    public final int mo118823z() {
        return this.f96414g;
    }

    public PlpOffer(OfferIdentifier offerIdentifier, String str, String str2, ChannelType channelType, int i, int i2, int i3, OfferAvailability offerAvailability, String str3, Prices prices, List<Discount> list, boolean z, boolean z2, String str4, boolean z3) {
        OfferAvailability offerAvailability2 = offerAvailability;
        String str5 = str3;
        Prices prices2 = prices;
        List<Discount> list2 = list;
        String str6 = str4;
        Intrinsics.checkNotNullParameter(offerIdentifier, "id");
        Intrinsics.checkNotNullParameter(str, "ref");
        Intrinsics.checkNotNullParameter(offerAvailability2, C28534f.f69157h0);
        Intrinsics.checkNotNullParameter(str5, "origin");
        Intrinsics.checkNotNullParameter(prices2, "prices");
        Intrinsics.checkNotNullParameter(list2, "discounts");
        Intrinsics.checkNotNullParameter(str6, "labelHighLight");
        this.f96408a = offerIdentifier;
        this.f96409b = str;
        this.f96410c = str2;
        this.f96411d = channelType;
        this.f96412e = i;
        this.f96413f = i2;
        this.f96414g = i3;
        this.f96415h = offerAvailability2;
        this.f96416i = str5;
        this.f96417j = prices2;
        this.f96418k = list2;
        this.f96419l = z;
        this.f96420m = z2;
        this.f96421n = str6;
        this.f96422o = z3;
    }
}
