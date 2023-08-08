package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\"\u001a\u00020\u0010\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b_\u0010`J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003J°\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\"\u001a\u00020\u00102\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b(\u0010)J\t\u0010+\u001a\u00020*HÖ\u0001J\t\u0010,\u001a\u00020\u0010HÖ\u0001J\u0013\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u00101\u001a\u00020\u0010HÖ\u0001J\u0019\u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010=\u001a\u0004\b>\u0010?R$\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010@\u001a\u0004\bA\u0010\n\"\u0004\bB\u0010CR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010@\u001a\u0004\bD\u0010\nR\u0019\u0010 \u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010!\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bI\u0010JR\"\u0010\"\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010#\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010\u0013\"\u0004\bT\u0010UR$\u0010$\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010R\u001a\u0004\bV\u0010\u0013\"\u0004\bW\u0010UR$\u0010%\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b>\u0010R\u001a\u0004\bQ\u0010\u0013\"\u0004\bX\u0010UR\u001f\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bA\u0010Y\u001a\u0004\bK\u0010ZR\u0019\u0010'\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^¨\u0006a"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/BasketOfferDomain;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;", "a", "Lcom/carrefour/fid/android/domain/models/ProductDomain;", "f", "Lcom/carrefour/fid/android/domain/models/BasketOfferPriceDomain;", "g", "", "h", "()Ljava/lang/Double;", "i", "Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "j", "Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;", "k", "", "l", "m", "()Ljava/lang/Integer;", "b", "c", "", "Lcom/carrefour/fid/android/domain/models/BasketOfferMessage;", "d", "Lcom/carrefour/fid/android/domain/models/CategoryLimitDomain;", "e", "id", "product", "price", "priceDiscountAmount", "offerTotalAmount", "discount", "discountPromoCode", "quantity", "incrementQty", "maxSellingQty", "minSellingQty", "messages", "categoryLimitDomain", "n", "(Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;Lcom/carrefour/fid/android/domain/models/ProductDomain;Lcom/carrefour/fid/android/domain/models/BasketOfferPriceDomain;Ljava/lang/Double;Ljava/lang/Double;Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/CategoryLimitDomain;)Lcom/carrefour/fid/android/domain/models/BasketOfferDomain;", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;", "s", "()Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;", "Lcom/carrefour/fid/android/domain/models/ProductDomain;", "A", "()Lcom/carrefour/fid/android/domain/models/ProductDomain;", "Lcom/carrefour/fid/android/domain/models/BasketOfferPriceDomain;", "y", "()Lcom/carrefour/fid/android/domain/models/BasketOfferPriceDomain;", "Ljava/lang/Double;", "z", "F", "(Ljava/lang/Double;)V", "x", "Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "q", "()Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;", "r", "()Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;", "v", "I", "B", "()I", "G", "(I)V", "w", "Ljava/lang/Integer;", "t", "C", "(Ljava/lang/Integer;)V", "u", "D", "E", "Ljava/util/List;", "()Ljava/util/List;", "X", "Lcom/carrefour/fid/android/domain/models/CategoryLimitDomain;", "p", "()Lcom/carrefour/fid/android/domain/models/CategoryLimitDomain;", "<init>", "(Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;Lcom/carrefour/fid/android/domain/models/ProductDomain;Lcom/carrefour/fid/android/domain/models/BasketOfferPriceDomain;Ljava/lang/Double;Ljava/lang/Double;Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/CategoryLimitDomain;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class BasketOfferDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketOfferDomain> CREATOR = new C37897a();

    /* renamed from: Y */
    public static final int f95056Y = 8;
    @C12580l

    /* renamed from: X */
    public final CategoryLimitDomain f95057X;
    @C12580l

    /* renamed from: a */
    public final OfferIdentifierDomain f95058a;
    @C12580l

    /* renamed from: b */
    public final ProductDomain f95059b;
    @C12580l

    /* renamed from: c */
    public final BasketOfferPriceDomain f95060c;
    @C12580l

    /* renamed from: d */
    public Double f95061d;
    @C12580l

    /* renamed from: e */
    public final Double f95062e;
    @C12580l

    /* renamed from: f */
    public final OfferDiscountDomain f95063f;
    @C12580l

    /* renamed from: g */
    public final OfferDiscountPromoCodeDomain f95064g;

    /* renamed from: v */
    public int f95065v;
    @C12580l

    /* renamed from: w */
    public Integer f95066w;
    @C12580l

    /* renamed from: x */
    public Integer f95067x;
    @C12580l

    /* renamed from: y */
    public Integer f95068y;
    @C12580l

    /* renamed from: z */
    public final List<BasketOfferMessage> f95069z;

    /* renamed from: com.carrefour.fid.android.domain.models.BasketOfferDomain$a */
    public static final class C37897a implements Parcelable.Creator<BasketOfferDomain> {
        @C12579k
        /* renamed from: a */
        public final BasketOfferDomain createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            OfferIdentifierDomain createFromParcel = parcel.readInt() == 0 ? null : OfferIdentifierDomain.CREATOR.createFromParcel(parcel2);
            ProductDomain createFromParcel2 = parcel.readInt() == 0 ? null : ProductDomain.CREATOR.createFromParcel(parcel2);
            BasketOfferPriceDomain createFromParcel3 = parcel.readInt() == 0 ? null : BasketOfferPriceDomain.CREATOR.createFromParcel(parcel2);
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            OfferDiscountDomain createFromParcel4 = parcel.readInt() == 0 ? null : OfferDiscountDomain.CREATOR.createFromParcel(parcel2);
            OfferDiscountPromoCodeDomain createFromParcel5 = parcel.readInt() == 0 ? null : OfferDiscountPromoCodeDomain.CREATOR.createFromParcel(parcel2);
            int readInt = parcel.readInt();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    arrayList2.add(BasketOfferMessage.CREATOR.createFromParcel(parcel2));
                }
                arrayList = arrayList2;
            }
            return new BasketOfferDomain(createFromParcel, createFromParcel2, createFromParcel3, valueOf, valueOf2, createFromParcel4, createFromParcel5, readInt, valueOf3, valueOf4, valueOf5, arrayList, parcel.readInt() == 0 ? null : CategoryLimitDomain.CREATOR.createFromParcel(parcel2));
        }

        @C12579k
        /* renamed from: b */
        public final BasketOfferDomain[] newArray(int i) {
            return new BasketOfferDomain[i];
        }
    }

    public BasketOfferDomain(@C12580l OfferIdentifierDomain offerIdentifierDomain, @C12580l ProductDomain productDomain, @C12580l BasketOfferPriceDomain basketOfferPriceDomain, @C12580l Double d, @C12580l Double d2, @C12580l OfferDiscountDomain offerDiscountDomain, @C12580l OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain, int i, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l List<BasketOfferMessage> list, @C12580l CategoryLimitDomain categoryLimitDomain) {
        this.f95058a = offerIdentifierDomain;
        this.f95059b = productDomain;
        this.f95060c = basketOfferPriceDomain;
        this.f95061d = d;
        this.f95062e = d2;
        this.f95063f = offerDiscountDomain;
        this.f95064g = offerDiscountPromoCodeDomain;
        this.f95065v = i;
        this.f95066w = num;
        this.f95067x = num2;
        this.f95068y = num3;
        this.f95069z = list;
        this.f95057X = categoryLimitDomain;
    }

    /* renamed from: o */
    public static /* synthetic */ BasketOfferDomain m155253o(BasketOfferDomain basketOfferDomain, OfferIdentifierDomain offerIdentifierDomain, ProductDomain productDomain, BasketOfferPriceDomain basketOfferPriceDomain, Double d, Double d2, OfferDiscountDomain offerDiscountDomain, OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain, int i, Integer num, Integer num2, Integer num3, List list, CategoryLimitDomain categoryLimitDomain, int i2, Object obj) {
        BasketOfferDomain basketOfferDomain2 = basketOfferDomain;
        int i3 = i2;
        return basketOfferDomain.mo115563n((i3 & 1) != 0 ? basketOfferDomain2.f95058a : offerIdentifierDomain, (i3 & 2) != 0 ? basketOfferDomain2.f95059b : productDomain, (i3 & 4) != 0 ? basketOfferDomain2.f95060c : basketOfferPriceDomain, (i3 & 8) != 0 ? basketOfferDomain2.f95061d : d, (i3 & 16) != 0 ? basketOfferDomain2.f95062e : d2, (i3 & 32) != 0 ? basketOfferDomain2.f95063f : offerDiscountDomain, (i3 & 64) != 0 ? basketOfferDomain2.f95064g : offerDiscountPromoCodeDomain, (i3 & 128) != 0 ? basketOfferDomain2.f95065v : i, (i3 & 256) != 0 ? basketOfferDomain2.f95066w : num, (i3 & 512) != 0 ? basketOfferDomain2.f95067x : num2, (i3 & 1024) != 0 ? basketOfferDomain2.f95068y : num3, (i3 & 2048) != 0 ? basketOfferDomain2.f95069z : list, (i3 & 4096) != 0 ? basketOfferDomain2.f95057X : categoryLimitDomain);
    }

    @C12580l
    /* renamed from: A */
    public final ProductDomain mo115540A() {
        return this.f95059b;
    }

    /* renamed from: B */
    public final int mo115541B() {
        return this.f95065v;
    }

    /* renamed from: C */
    public final void mo115542C(@C12580l Integer num) {
        this.f95066w = num;
    }

    /* renamed from: D */
    public final void mo115543D(@C12580l Integer num) {
        this.f95067x = num;
    }

    /* renamed from: E */
    public final void mo115544E(@C12580l Integer num) {
        this.f95068y = num;
    }

    /* renamed from: F */
    public final void mo115545F(@C12580l Double d) {
        this.f95061d = d;
    }

    /* renamed from: G */
    public final void mo115546G(int i) {
        this.f95065v = i;
    }

    @C12580l
    /* renamed from: a */
    public final OfferIdentifierDomain mo115547a() {
        return this.f95058a;
    }

    @C12580l
    /* renamed from: b */
    public final Integer mo115548b() {
        return this.f95067x;
    }

    @C12580l
    /* renamed from: c */
    public final Integer mo115549c() {
        return this.f95068y;
    }

    @C12580l
    /* renamed from: d */
    public final List<BasketOfferMessage> mo115550d() {
        return this.f95069z;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final CategoryLimitDomain mo115552e() {
        return this.f95057X;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketOfferDomain)) {
            return false;
        }
        BasketOfferDomain basketOfferDomain = (BasketOfferDomain) obj;
        return Intrinsics.areEqual((Object) this.f95058a, (Object) basketOfferDomain.f95058a) && Intrinsics.areEqual((Object) this.f95059b, (Object) basketOfferDomain.f95059b) && Intrinsics.areEqual((Object) this.f95060c, (Object) basketOfferDomain.f95060c) && Intrinsics.areEqual((Object) this.f95061d, (Object) basketOfferDomain.f95061d) && Intrinsics.areEqual((Object) this.f95062e, (Object) basketOfferDomain.f95062e) && Intrinsics.areEqual((Object) this.f95063f, (Object) basketOfferDomain.f95063f) && Intrinsics.areEqual((Object) this.f95064g, (Object) basketOfferDomain.f95064g) && this.f95065v == basketOfferDomain.f95065v && Intrinsics.areEqual((Object) this.f95066w, (Object) basketOfferDomain.f95066w) && Intrinsics.areEqual((Object) this.f95067x, (Object) basketOfferDomain.f95067x) && Intrinsics.areEqual((Object) this.f95068y, (Object) basketOfferDomain.f95068y) && Intrinsics.areEqual((Object) this.f95069z, (Object) basketOfferDomain.f95069z) && Intrinsics.areEqual((Object) this.f95057X, (Object) basketOfferDomain.f95057X);
    }

    @C12580l
    /* renamed from: f */
    public final ProductDomain mo115554f() {
        return this.f95059b;
    }

    @C12580l
    /* renamed from: g */
    public final BasketOfferPriceDomain mo115555g() {
        return this.f95060c;
    }

    @C12580l
    /* renamed from: h */
    public final Double mo115556h() {
        return this.f95061d;
    }

    public int hashCode() {
        OfferIdentifierDomain offerIdentifierDomain = this.f95058a;
        int i = 0;
        int hashCode = (offerIdentifierDomain == null ? 0 : offerIdentifierDomain.hashCode()) * 31;
        ProductDomain productDomain = this.f95059b;
        int hashCode2 = (hashCode + (productDomain == null ? 0 : productDomain.hashCode())) * 31;
        BasketOfferPriceDomain basketOfferPriceDomain = this.f95060c;
        int hashCode3 = (hashCode2 + (basketOfferPriceDomain == null ? 0 : basketOfferPriceDomain.hashCode())) * 31;
        Double d = this.f95061d;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f95062e;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        OfferDiscountDomain offerDiscountDomain = this.f95063f;
        int hashCode6 = (hashCode5 + (offerDiscountDomain == null ? 0 : offerDiscountDomain.hashCode())) * 31;
        OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain = this.f95064g;
        int hashCode7 = (((hashCode6 + (offerDiscountPromoCodeDomain == null ? 0 : offerDiscountPromoCodeDomain.hashCode())) * 31) + Integer.hashCode(this.f95065v)) * 31;
        Integer num = this.f95066w;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f95067x;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f95068y;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<BasketOfferMessage> list = this.f95069z;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        CategoryLimitDomain categoryLimitDomain = this.f95057X;
        if (categoryLimitDomain != null) {
            i = categoryLimitDomain.hashCode();
        }
        return hashCode11 + i;
    }

    @C12580l
    /* renamed from: i */
    public final Double mo115558i() {
        return this.f95062e;
    }

    @C12580l
    /* renamed from: j */
    public final OfferDiscountDomain mo115559j() {
        return this.f95063f;
    }

    @C12580l
    /* renamed from: k */
    public final OfferDiscountPromoCodeDomain mo115560k() {
        return this.f95064g;
    }

    /* renamed from: l */
    public final int mo115561l() {
        return this.f95065v;
    }

    @C12580l
    /* renamed from: m */
    public final Integer mo115562m() {
        return this.f95066w;
    }

    @C12579k
    /* renamed from: n */
    public final BasketOfferDomain mo115563n(@C12580l OfferIdentifierDomain offerIdentifierDomain, @C12580l ProductDomain productDomain, @C12580l BasketOfferPriceDomain basketOfferPriceDomain, @C12580l Double d, @C12580l Double d2, @C12580l OfferDiscountDomain offerDiscountDomain, @C12580l OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain, int i, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l List<BasketOfferMessage> list, @C12580l CategoryLimitDomain categoryLimitDomain) {
        return new BasketOfferDomain(offerIdentifierDomain, productDomain, basketOfferPriceDomain, d, d2, offerDiscountDomain, offerDiscountPromoCodeDomain, i, num, num2, num3, list, categoryLimitDomain);
    }

    @C12580l
    /* renamed from: p */
    public final CategoryLimitDomain mo115564p() {
        return this.f95057X;
    }

    @C12580l
    /* renamed from: q */
    public final OfferDiscountDomain mo115565q() {
        return this.f95063f;
    }

    @C12580l
    /* renamed from: r */
    public final OfferDiscountPromoCodeDomain mo115566r() {
        return this.f95064g;
    }

    @C12580l
    /* renamed from: s */
    public final OfferIdentifierDomain mo115567s() {
        return this.f95058a;
    }

    @C12580l
    /* renamed from: t */
    public final Integer mo115568t() {
        return this.f95066w;
    }

    @C12579k
    public String toString() {
        OfferIdentifierDomain offerIdentifierDomain = this.f95058a;
        ProductDomain productDomain = this.f95059b;
        BasketOfferPriceDomain basketOfferPriceDomain = this.f95060c;
        Double d = this.f95061d;
        Double d2 = this.f95062e;
        OfferDiscountDomain offerDiscountDomain = this.f95063f;
        OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain = this.f95064g;
        int i = this.f95065v;
        Integer num = this.f95066w;
        Integer num2 = this.f95067x;
        Integer num3 = this.f95068y;
        List<BasketOfferMessage> list = this.f95069z;
        CategoryLimitDomain categoryLimitDomain = this.f95057X;
        return "BasketOfferDomain(id=" + offerIdentifierDomain + ", product=" + productDomain + ", price=" + basketOfferPriceDomain + ", priceDiscountAmount=" + d + ", offerTotalAmount=" + d2 + ", discount=" + offerDiscountDomain + ", discountPromoCode=" + offerDiscountPromoCodeDomain + ", quantity=" + i + ", incrementQty=" + num + ", maxSellingQty=" + num2 + ", minSellingQty=" + num3 + ", messages=" + list + ", categoryLimitDomain=" + categoryLimitDomain + ")";
    }

    @C12580l
    /* renamed from: u */
    public final Integer mo115570u() {
        return this.f95067x;
    }

    @C12580l
    /* renamed from: v */
    public final List<BasketOfferMessage> mo115571v() {
        return this.f95069z;
    }

    @C12580l
    /* renamed from: w */
    public final Integer mo115572w() {
        return this.f95068y;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        OfferIdentifierDomain offerIdentifierDomain = this.f95058a;
        if (offerIdentifierDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerIdentifierDomain.writeToParcel(parcel, i);
        }
        ProductDomain productDomain = this.f95059b;
        if (productDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productDomain.writeToParcel(parcel, i);
        }
        BasketOfferPriceDomain basketOfferPriceDomain = this.f95060c;
        if (basketOfferPriceDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basketOfferPriceDomain.writeToParcel(parcel, i);
        }
        Double d = this.f95061d;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f95062e;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        OfferDiscountDomain offerDiscountDomain = this.f95063f;
        if (offerDiscountDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerDiscountDomain.writeToParcel(parcel, i);
        }
        OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain = this.f95064g;
        if (offerDiscountPromoCodeDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerDiscountPromoCodeDomain.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f95065v);
        Integer num = this.f95066w;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f95067x;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.f95068y;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        List<BasketOfferMessage> list = this.f95069z;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (BasketOfferMessage writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        CategoryLimitDomain categoryLimitDomain = this.f95057X;
        if (categoryLimitDomain == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        categoryLimitDomain.writeToParcel(parcel, i);
    }

    @C12580l
    /* renamed from: x */
    public final Double mo115574x() {
        return this.f95062e;
    }

    @C12580l
    /* renamed from: y */
    public final BasketOfferPriceDomain mo115575y() {
        return this.f95060c;
    }

    @C12580l
    /* renamed from: z */
    public final Double mo115576z() {
        return this.f95061d;
    }
}
