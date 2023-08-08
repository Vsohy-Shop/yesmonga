package com.carrefour.fid.android.domain.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J¡\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0006HÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\f\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u001a\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!¨\u0006C"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrdersOfflineDomain;", "", "orderKey", "", "orderDate", "orderAmountUnscaled", "", "orderAmountScale", "orderAmount", "", "amountBeforeDiscountUnscaled", "amountBeforeDiscountScale", "amountBeforeDiscount", "amountImmediateDiscountUnscaled", "amountImmediateDiscountScale", "amountImmediateDiscount", "facilityId", "facilityName", "facilityAddress", "gln", "(Ljava/lang/String;Ljava/lang/String;IIDIIDIIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmountBeforeDiscount", "()D", "setAmountBeforeDiscount", "(D)V", "getAmountBeforeDiscountScale", "()I", "getAmountBeforeDiscountUnscaled", "getAmountImmediateDiscount", "setAmountImmediateDiscount", "getAmountImmediateDiscountScale", "getAmountImmediateDiscountUnscaled", "getFacilityAddress", "()Ljava/lang/String;", "setFacilityAddress", "(Ljava/lang/String;)V", "getFacilityId", "getFacilityName", "setFacilityName", "getGln", "getOrderAmount", "setOrderAmount", "getOrderAmountScale", "getOrderAmountUnscaled", "getOrderDate", "getOrderKey", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OrdersOfflineDomain {
    public static final int $stable = 8;
    private double amountBeforeDiscount;
    private final int amountBeforeDiscountScale;
    private final int amountBeforeDiscountUnscaled;
    private double amountImmediateDiscount;
    private final int amountImmediateDiscountScale;
    private final int amountImmediateDiscountUnscaled;
    @C12580l
    private String facilityAddress;
    @C12579k
    private final String facilityId;
    @C12579k
    private String facilityName;
    @C12579k
    private final String gln;
    private double orderAmount;
    private final int orderAmountScale;
    private final int orderAmountUnscaled;
    @C12579k
    private final String orderDate;
    @C12579k
    private final String orderKey;

    public OrdersOfflineDomain(@C12579k String str, @C12579k String str2, int i, int i2, double d, int i3, int i4, double d2, int i5, int i6, double d3, @C12579k String str3, @C12579k String str4, @C12580l String str5, @C12579k String str6) {
        String str7 = str3;
        String str8 = str4;
        String str9 = str6;
        Intrinsics.checkNotNullParameter(str, "orderKey");
        Intrinsics.checkNotNullParameter(str2, "orderDate");
        Intrinsics.checkNotNullParameter(str7, "facilityId");
        Intrinsics.checkNotNullParameter(str8, "facilityName");
        Intrinsics.checkNotNullParameter(str9, "gln");
        this.orderKey = str;
        this.orderDate = str2;
        this.orderAmountUnscaled = i;
        this.orderAmountScale = i2;
        this.orderAmount = d;
        this.amountBeforeDiscountUnscaled = i3;
        this.amountBeforeDiscountScale = i4;
        this.amountBeforeDiscount = d2;
        this.amountImmediateDiscountUnscaled = i5;
        this.amountImmediateDiscountScale = i6;
        this.amountImmediateDiscount = d3;
        this.facilityId = str7;
        this.facilityName = str8;
        this.facilityAddress = str5;
        this.gln = str9;
    }

    public static /* synthetic */ OrdersOfflineDomain copy$default(OrdersOfflineDomain ordersOfflineDomain, String str, String str2, int i, int i2, double d, int i3, int i4, double d2, int i5, int i6, double d3, String str3, String str4, String str5, String str6, int i7, Object obj) {
        OrdersOfflineDomain ordersOfflineDomain2 = ordersOfflineDomain;
        int i8 = i7;
        return ordersOfflineDomain.copy((i8 & 1) != 0 ? ordersOfflineDomain2.orderKey : str, (i8 & 2) != 0 ? ordersOfflineDomain2.orderDate : str2, (i8 & 4) != 0 ? ordersOfflineDomain2.orderAmountUnscaled : i, (i8 & 8) != 0 ? ordersOfflineDomain2.orderAmountScale : i2, (i8 & 16) != 0 ? ordersOfflineDomain2.orderAmount : d, (i8 & 32) != 0 ? ordersOfflineDomain2.amountBeforeDiscountUnscaled : i3, (i8 & 64) != 0 ? ordersOfflineDomain2.amountBeforeDiscountScale : i4, (i8 & 128) != 0 ? ordersOfflineDomain2.amountBeforeDiscount : d2, (i8 & 256) != 0 ? ordersOfflineDomain2.amountImmediateDiscountUnscaled : i5, (i8 & 512) != 0 ? ordersOfflineDomain2.amountImmediateDiscountScale : i6, (i8 & 1024) != 0 ? ordersOfflineDomain2.amountImmediateDiscount : d3, (i8 & 2048) != 0 ? ordersOfflineDomain2.facilityId : str3, (i8 & 4096) != 0 ? ordersOfflineDomain2.facilityName : str4, (i8 & 8192) != 0 ? ordersOfflineDomain2.facilityAddress : str5, (i8 & 16384) != 0 ? ordersOfflineDomain2.gln : str6);
    }

    @C12579k
    public final String component1() {
        return this.orderKey;
    }

    public final int component10() {
        return this.amountImmediateDiscountScale;
    }

    public final double component11() {
        return this.amountImmediateDiscount;
    }

    @C12579k
    public final String component12() {
        return this.facilityId;
    }

    @C12579k
    public final String component13() {
        return this.facilityName;
    }

    @C12580l
    public final String component14() {
        return this.facilityAddress;
    }

    @C12579k
    public final String component15() {
        return this.gln;
    }

    @C12579k
    public final String component2() {
        return this.orderDate;
    }

    public final int component3() {
        return this.orderAmountUnscaled;
    }

    public final int component4() {
        return this.orderAmountScale;
    }

    public final double component5() {
        return this.orderAmount;
    }

    public final int component6() {
        return this.amountBeforeDiscountUnscaled;
    }

    public final int component7() {
        return this.amountBeforeDiscountScale;
    }

    public final double component8() {
        return this.amountBeforeDiscount;
    }

    public final int component9() {
        return this.amountImmediateDiscountUnscaled;
    }

    @C12579k
    public final OrdersOfflineDomain copy(@C12579k String str, @C12579k String str2, int i, int i2, double d, int i3, int i4, double d2, int i5, int i6, double d3, @C12579k String str3, @C12579k String str4, @C12580l String str5, @C12579k String str6) {
        String str7 = str;
        Intrinsics.checkNotNullParameter(str7, "orderKey");
        Intrinsics.checkNotNullParameter(str2, "orderDate");
        Intrinsics.checkNotNullParameter(str3, "facilityId");
        Intrinsics.checkNotNullParameter(str4, "facilityName");
        Intrinsics.checkNotNullParameter(str6, "gln");
        return new OrdersOfflineDomain(str7, str2, i, i2, d, i3, i4, d2, i5, i6, d3, str3, str4, str5, str6);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersOfflineDomain)) {
            return false;
        }
        OrdersOfflineDomain ordersOfflineDomain = (OrdersOfflineDomain) obj;
        return Intrinsics.areEqual((Object) this.orderKey, (Object) ordersOfflineDomain.orderKey) && Intrinsics.areEqual((Object) this.orderDate, (Object) ordersOfflineDomain.orderDate) && this.orderAmountUnscaled == ordersOfflineDomain.orderAmountUnscaled && this.orderAmountScale == ordersOfflineDomain.orderAmountScale && Double.compare(this.orderAmount, ordersOfflineDomain.orderAmount) == 0 && this.amountBeforeDiscountUnscaled == ordersOfflineDomain.amountBeforeDiscountUnscaled && this.amountBeforeDiscountScale == ordersOfflineDomain.amountBeforeDiscountScale && Double.compare(this.amountBeforeDiscount, ordersOfflineDomain.amountBeforeDiscount) == 0 && this.amountImmediateDiscountUnscaled == ordersOfflineDomain.amountImmediateDiscountUnscaled && this.amountImmediateDiscountScale == ordersOfflineDomain.amountImmediateDiscountScale && Double.compare(this.amountImmediateDiscount, ordersOfflineDomain.amountImmediateDiscount) == 0 && Intrinsics.areEqual((Object) this.facilityId, (Object) ordersOfflineDomain.facilityId) && Intrinsics.areEqual((Object) this.facilityName, (Object) ordersOfflineDomain.facilityName) && Intrinsics.areEqual((Object) this.facilityAddress, (Object) ordersOfflineDomain.facilityAddress) && Intrinsics.areEqual((Object) this.gln, (Object) ordersOfflineDomain.gln);
    }

    public final double getAmountBeforeDiscount() {
        return this.amountBeforeDiscount;
    }

    public final int getAmountBeforeDiscountScale() {
        return this.amountBeforeDiscountScale;
    }

    public final int getAmountBeforeDiscountUnscaled() {
        return this.amountBeforeDiscountUnscaled;
    }

    public final double getAmountImmediateDiscount() {
        return this.amountImmediateDiscount;
    }

    public final int getAmountImmediateDiscountScale() {
        return this.amountImmediateDiscountScale;
    }

    public final int getAmountImmediateDiscountUnscaled() {
        return this.amountImmediateDiscountUnscaled;
    }

    @C12580l
    public final String getFacilityAddress() {
        return this.facilityAddress;
    }

    @C12579k
    public final String getFacilityId() {
        return this.facilityId;
    }

    @C12579k
    public final String getFacilityName() {
        return this.facilityName;
    }

    @C12579k
    public final String getGln() {
        return this.gln;
    }

    public final double getOrderAmount() {
        return this.orderAmount;
    }

    public final int getOrderAmountScale() {
        return this.orderAmountScale;
    }

    public final int getOrderAmountUnscaled() {
        return this.orderAmountUnscaled;
    }

    @C12579k
    public final String getOrderDate() {
        return this.orderDate;
    }

    @C12579k
    public final String getOrderKey() {
        return this.orderKey;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((this.orderKey.hashCode() * 31) + this.orderDate.hashCode()) * 31) + Integer.hashCode(this.orderAmountUnscaled)) * 31) + Integer.hashCode(this.orderAmountScale)) * 31) + Double.hashCode(this.orderAmount)) * 31) + Integer.hashCode(this.amountBeforeDiscountUnscaled)) * 31) + Integer.hashCode(this.amountBeforeDiscountScale)) * 31) + Double.hashCode(this.amountBeforeDiscount)) * 31) + Integer.hashCode(this.amountImmediateDiscountUnscaled)) * 31) + Integer.hashCode(this.amountImmediateDiscountScale)) * 31) + Double.hashCode(this.amountImmediateDiscount)) * 31) + this.facilityId.hashCode()) * 31) + this.facilityName.hashCode()) * 31;
        String str = this.facilityAddress;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.gln.hashCode();
    }

    public final void setAmountBeforeDiscount(double d) {
        this.amountBeforeDiscount = d;
    }

    public final void setAmountImmediateDiscount(double d) {
        this.amountImmediateDiscount = d;
    }

    public final void setFacilityAddress(@C12580l String str) {
        this.facilityAddress = str;
    }

    public final void setFacilityName(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.facilityName = str;
    }

    public final void setOrderAmount(double d) {
        this.orderAmount = d;
    }

    @C12579k
    public String toString() {
        String str = this.orderKey;
        String str2 = this.orderDate;
        int i = this.orderAmountUnscaled;
        int i2 = this.orderAmountScale;
        double d = this.orderAmount;
        int i3 = this.amountBeforeDiscountUnscaled;
        int i4 = this.amountBeforeDiscountScale;
        double d2 = this.amountBeforeDiscount;
        int i5 = this.amountImmediateDiscountUnscaled;
        int i6 = this.amountImmediateDiscountScale;
        double d3 = this.amountImmediateDiscount;
        String str3 = this.facilityId;
        String str4 = this.facilityName;
        String str5 = this.facilityAddress;
        String str6 = this.gln;
        return "OrdersOfflineDomain(orderKey=" + str + ", orderDate=" + str2 + ", orderAmountUnscaled=" + i + ", orderAmountScale=" + i2 + ", orderAmount=" + d + ", amountBeforeDiscountUnscaled=" + i3 + ", amountBeforeDiscountScale=" + i4 + ", amountBeforeDiscount=" + d2 + ", amountImmediateDiscountUnscaled=" + i5 + ", amountImmediateDiscountScale=" + i6 + ", amountImmediateDiscount=" + d3 + ", facilityId=" + str3 + ", facilityName=" + str4 + ", facilityAddress=" + str5 + ", gln=" + str6 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrdersOfflineDomain(java.lang.String r23, java.lang.String r24, int r25, int r26, double r27, int r29, int r30, double r31, int r33, int r34, double r35, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, int r41, kotlin.jvm.internal.DefaultConstructorMarker r42) {
        /*
            r22 = this;
            r0 = r41
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r25
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r26
        L_0x0013:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r8 = r3
            goto L_0x001d
        L_0x001b:
            r8 = r27
        L_0x001d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0023
            r10 = r2
            goto L_0x0025
        L_0x0023:
            r10 = r29
        L_0x0025:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002b
            r11 = r2
            goto L_0x002d
        L_0x002b:
            r11 = r30
        L_0x002d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0033
            r12 = r3
            goto L_0x0035
        L_0x0033:
            r12 = r31
        L_0x0035:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003b
            r14 = r2
            goto L_0x003d
        L_0x003b:
            r14 = r33
        L_0x003d:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0043
            r15 = r2
            goto L_0x0045
        L_0x0043:
            r15 = r34
        L_0x0045:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004c
            r16 = r3
            goto L_0x004e
        L_0x004c:
            r16 = r35
        L_0x004e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0056
            r0 = 0
            r20 = r0
            goto L_0x0058
        L_0x0056:
            r20 = r39
        L_0x0058:
            r3 = r22
            r4 = r23
            r5 = r24
            r18 = r37
            r19 = r38
            r21 = r40
            r3.<init>(r4, r5, r6, r7, r8, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.OrdersOfflineDomain.<init>(java.lang.String, java.lang.String, int, int, double, int, int, double, int, int, double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
