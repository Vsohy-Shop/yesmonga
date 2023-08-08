package com.carrefour.fid.android.domain.models;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0005HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\"\"\u0004\b%\u0010&¨\u00069"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrdersOfflineDetailsProductDomain;", "", "productName", "", "productAmountUnscale", "", "productAmountScale", "productAmount", "", "productAmountUnitPriceUnscale", "productAmountUnitPriceScale", "productAmountUnitPrice", "productAmountImmediateDiscountUnscale", "productAmountImmediateDiscountScale", "productAmountImmediateDiscount", "weight", "quantity", "(Ljava/lang/String;IIDIIDIIDLjava/lang/String;I)V", "getProductAmount", "()D", "setProductAmount", "(D)V", "getProductAmountImmediateDiscount", "setProductAmountImmediateDiscount", "getProductAmountImmediateDiscountScale", "()I", "getProductAmountImmediateDiscountUnscale", "getProductAmountScale", "getProductAmountUnitPrice", "setProductAmountUnitPrice", "getProductAmountUnitPriceScale", "getProductAmountUnitPriceUnscale", "getProductAmountUnscale", "getProductName", "()Ljava/lang/String;", "getQuantity", "getWeight", "setWeight", "(Ljava/lang/String;)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OrdersOfflineDetailsProductDomain {
    public static final int $stable = 8;
    private double productAmount;
    private double productAmountImmediateDiscount;
    private final int productAmountImmediateDiscountScale;
    private final int productAmountImmediateDiscountUnscale;
    private final int productAmountScale;
    private double productAmountUnitPrice;
    private final int productAmountUnitPriceScale;
    private final int productAmountUnitPriceUnscale;
    private final int productAmountUnscale;
    @C12579k
    private final String productName;
    private final int quantity;
    @C12579k
    private String weight;

    public OrdersOfflineDetailsProductDomain(@C12579k String str, int i, int i2, double d, int i3, int i4, double d2, int i5, int i6, double d3, @C12579k String str2, int i7) {
        String str3 = str2;
        Intrinsics.checkNotNullParameter(str, "productName");
        Intrinsics.checkNotNullParameter(str3, "weight");
        this.productName = str;
        this.productAmountUnscale = i;
        this.productAmountScale = i2;
        this.productAmount = d;
        this.productAmountUnitPriceUnscale = i3;
        this.productAmountUnitPriceScale = i4;
        this.productAmountUnitPrice = d2;
        this.productAmountImmediateDiscountUnscale = i5;
        this.productAmountImmediateDiscountScale = i6;
        this.productAmountImmediateDiscount = d3;
        this.weight = str3;
        this.quantity = i7;
    }

    public static /* synthetic */ OrdersOfflineDetailsProductDomain copy$default(OrdersOfflineDetailsProductDomain ordersOfflineDetailsProductDomain, String str, int i, int i2, double d, int i3, int i4, double d2, int i5, int i6, double d3, String str2, int i7, int i8, Object obj) {
        OrdersOfflineDetailsProductDomain ordersOfflineDetailsProductDomain2 = ordersOfflineDetailsProductDomain;
        int i9 = i8;
        return ordersOfflineDetailsProductDomain.copy((i9 & 1) != 0 ? ordersOfflineDetailsProductDomain2.productName : str, (i9 & 2) != 0 ? ordersOfflineDetailsProductDomain2.productAmountUnscale : i, (i9 & 4) != 0 ? ordersOfflineDetailsProductDomain2.productAmountScale : i2, (i9 & 8) != 0 ? ordersOfflineDetailsProductDomain2.productAmount : d, (i9 & 16) != 0 ? ordersOfflineDetailsProductDomain2.productAmountUnitPriceUnscale : i3, (i9 & 32) != 0 ? ordersOfflineDetailsProductDomain2.productAmountUnitPriceScale : i4, (i9 & 64) != 0 ? ordersOfflineDetailsProductDomain2.productAmountUnitPrice : d2, (i9 & 128) != 0 ? ordersOfflineDetailsProductDomain2.productAmountImmediateDiscountUnscale : i5, (i9 & 256) != 0 ? ordersOfflineDetailsProductDomain2.productAmountImmediateDiscountScale : i6, (i9 & 512) != 0 ? ordersOfflineDetailsProductDomain2.productAmountImmediateDiscount : d3, (i9 & 1024) != 0 ? ordersOfflineDetailsProductDomain2.weight : str2, (i9 & 2048) != 0 ? ordersOfflineDetailsProductDomain2.quantity : i7);
    }

    @C12579k
    public final String component1() {
        return this.productName;
    }

    public final double component10() {
        return this.productAmountImmediateDiscount;
    }

    @C12579k
    public final String component11() {
        return this.weight;
    }

    public final int component12() {
        return this.quantity;
    }

    public final int component2() {
        return this.productAmountUnscale;
    }

    public final int component3() {
        return this.productAmountScale;
    }

    public final double component4() {
        return this.productAmount;
    }

    public final int component5() {
        return this.productAmountUnitPriceUnscale;
    }

    public final int component6() {
        return this.productAmountUnitPriceScale;
    }

    public final double component7() {
        return this.productAmountUnitPrice;
    }

    public final int component8() {
        return this.productAmountImmediateDiscountUnscale;
    }

    public final int component9() {
        return this.productAmountImmediateDiscountScale;
    }

    @C12579k
    public final OrdersOfflineDetailsProductDomain copy(@C12579k String str, int i, int i2, double d, int i3, int i4, double d2, int i5, int i6, double d3, @C12579k String str2, int i7) {
        String str3 = str;
        Intrinsics.checkNotNullParameter(str3, "productName");
        String str4 = str2;
        Intrinsics.checkNotNullParameter(str4, "weight");
        return new OrdersOfflineDetailsProductDomain(str3, i, i2, d, i3, i4, d2, i5, i6, d3, str4, i7);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersOfflineDetailsProductDomain)) {
            return false;
        }
        OrdersOfflineDetailsProductDomain ordersOfflineDetailsProductDomain = (OrdersOfflineDetailsProductDomain) obj;
        return Intrinsics.areEqual((Object) this.productName, (Object) ordersOfflineDetailsProductDomain.productName) && this.productAmountUnscale == ordersOfflineDetailsProductDomain.productAmountUnscale && this.productAmountScale == ordersOfflineDetailsProductDomain.productAmountScale && Double.compare(this.productAmount, ordersOfflineDetailsProductDomain.productAmount) == 0 && this.productAmountUnitPriceUnscale == ordersOfflineDetailsProductDomain.productAmountUnitPriceUnscale && this.productAmountUnitPriceScale == ordersOfflineDetailsProductDomain.productAmountUnitPriceScale && Double.compare(this.productAmountUnitPrice, ordersOfflineDetailsProductDomain.productAmountUnitPrice) == 0 && this.productAmountImmediateDiscountUnscale == ordersOfflineDetailsProductDomain.productAmountImmediateDiscountUnscale && this.productAmountImmediateDiscountScale == ordersOfflineDetailsProductDomain.productAmountImmediateDiscountScale && Double.compare(this.productAmountImmediateDiscount, ordersOfflineDetailsProductDomain.productAmountImmediateDiscount) == 0 && Intrinsics.areEqual((Object) this.weight, (Object) ordersOfflineDetailsProductDomain.weight) && this.quantity == ordersOfflineDetailsProductDomain.quantity;
    }

    public final double getProductAmount() {
        return this.productAmount;
    }

    public final double getProductAmountImmediateDiscount() {
        return this.productAmountImmediateDiscount;
    }

    public final int getProductAmountImmediateDiscountScale() {
        return this.productAmountImmediateDiscountScale;
    }

    public final int getProductAmountImmediateDiscountUnscale() {
        return this.productAmountImmediateDiscountUnscale;
    }

    public final int getProductAmountScale() {
        return this.productAmountScale;
    }

    public final double getProductAmountUnitPrice() {
        return this.productAmountUnitPrice;
    }

    public final int getProductAmountUnitPriceScale() {
        return this.productAmountUnitPriceScale;
    }

    public final int getProductAmountUnitPriceUnscale() {
        return this.productAmountUnitPriceUnscale;
    }

    public final int getProductAmountUnscale() {
        return this.productAmountUnscale;
    }

    @C12579k
    public final String getProductName() {
        return this.productName;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @C12579k
    public final String getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.productName.hashCode() * 31) + Integer.hashCode(this.productAmountUnscale)) * 31) + Integer.hashCode(this.productAmountScale)) * 31) + Double.hashCode(this.productAmount)) * 31) + Integer.hashCode(this.productAmountUnitPriceUnscale)) * 31) + Integer.hashCode(this.productAmountUnitPriceScale)) * 31) + Double.hashCode(this.productAmountUnitPrice)) * 31) + Integer.hashCode(this.productAmountImmediateDiscountUnscale)) * 31) + Integer.hashCode(this.productAmountImmediateDiscountScale)) * 31) + Double.hashCode(this.productAmountImmediateDiscount)) * 31) + this.weight.hashCode()) * 31) + Integer.hashCode(this.quantity);
    }

    public final void setProductAmount(double d) {
        this.productAmount = d;
    }

    public final void setProductAmountImmediateDiscount(double d) {
        this.productAmountImmediateDiscount = d;
    }

    public final void setProductAmountUnitPrice(double d) {
        this.productAmountUnitPrice = d;
    }

    public final void setWeight(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weight = str;
    }

    @C12579k
    public String toString() {
        String str = this.productName;
        int i = this.productAmountUnscale;
        int i2 = this.productAmountScale;
        double d = this.productAmount;
        int i3 = this.productAmountUnitPriceUnscale;
        int i4 = this.productAmountUnitPriceScale;
        double d2 = this.productAmountUnitPrice;
        int i5 = this.productAmountImmediateDiscountUnscale;
        int i6 = this.productAmountImmediateDiscountScale;
        double d3 = this.productAmountImmediateDiscount;
        String str2 = this.weight;
        int i7 = this.quantity;
        return "OrdersOfflineDetailsProductDomain(productName=" + str + ", productAmountUnscale=" + i + ", productAmountScale=" + i2 + ", productAmount=" + d + ", productAmountUnitPriceUnscale=" + i3 + ", productAmountUnitPriceScale=" + i4 + ", productAmountUnitPrice=" + d2 + ", productAmountImmediateDiscountUnscale=" + i5 + ", productAmountImmediateDiscountScale=" + i6 + ", productAmountImmediateDiscount=" + d3 + ", weight=" + str2 + ", quantity=" + i7 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrdersOfflineDetailsProductDomain(java.lang.String r20, int r21, int r22, double r23, int r25, int r26, double r27, int r29, int r30, double r31, java.lang.String r33, int r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r21
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r22
        L_0x0013:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r7 = r3
            goto L_0x001d
        L_0x001b:
            r7 = r23
        L_0x001d:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0023
            r9 = r2
            goto L_0x0025
        L_0x0023:
            r9 = r25
        L_0x0025:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002b
            r10 = r2
            goto L_0x002d
        L_0x002b:
            r10 = r26
        L_0x002d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0033
            r11 = r3
            goto L_0x0035
        L_0x0033:
            r11 = r27
        L_0x0035:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003b
            r13 = r2
            goto L_0x003d
        L_0x003b:
            r13 = r29
        L_0x003d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0043
            r14 = r2
            goto L_0x0045
        L_0x0043:
            r14 = r30
        L_0x0045:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004b
            r15 = r3
            goto L_0x004d
        L_0x004b:
            r15 = r31
        L_0x004d:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0055
            r0 = -1
            r18 = r0
            goto L_0x0057
        L_0x0055:
            r18 = r34
        L_0x0057:
            r3 = r19
            r4 = r20
            r17 = r33
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r13, r14, r15, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.OrdersOfflineDetailsProductDomain.<init>(java.lang.String, int, int, double, int, int, double, int, int, double, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
