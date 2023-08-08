package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.OfferPriceDomain;
import com.carrefour.fid.android.domain.models.ValidFreshnessGuaranteeDomain;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Bý\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001d\u0012\u000e\u0010)\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$\u0012\b\u00101\u001a\u0004\u0018\u00010*\u0012\u000e\u00108\u001a\n\u0018\u000102j\u0004\u0018\u0001`3\u0012\u000e\u0010?\u001a\n\u0018\u000109j\u0004\u0018\u0001`:\u0012\u0006\u0010F\u001a\u00020\u0007\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010U\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010]\u001a\u00020V\u0012\b\u0010`\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010a\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u00010i\u0012\u0006\u0010p\u001a\u00020i\u0012\u0006\u0010s\u001a\u00020V\u0012\b\u0010v\u001a\u0004\u0018\u00010i\u0012\b\u0010y\u001a\u0004\u0018\u00010i\u0012\b\u0010|\u001a\u0004\u0018\u00010i\u0012\b\u0010\u001a\u0004\u0018\u00010i¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010)\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$8\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\n\u0018\u000102j\u0004\u0018\u0001`38\u0016X\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\"\u0010?\u001a\n\u0018\u000109j\u0004\u0018\u0001`:8\u0016X\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010F\u001a\u00020\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010M\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010Q\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bN\u0010H\u001a\u0004\bO\u0010J\"\u0004\bP\u0010LR$\u0010U\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bR\u0010H\u001a\u0004\bS\u0010J\"\u0004\bT\u0010LR\"\u0010]\u001a\u00020V8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001c\u0010`\u001a\u0004\u0018\u00010*8\u0016X\u0004¢\u0006\f\n\u0004\b^\u0010,\u001a\u0004\b_\u0010.R$\u0010h\u001a\u0004\u0018\u00010a8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001c\u0010m\u001a\u0004\u0018\u00010i8\u0016X\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bX\u0010lR\u001a\u0010p\u001a\u00020i8\u0016X\u0004¢\u0006\f\n\u0004\bn\u0010k\u001a\u0004\bo\u0010lR\u0017\u0010s\u001a\u00020V8\u0006¢\u0006\f\n\u0004\bq\u0010X\u001a\u0004\br\u0010ZR\u0019\u0010v\u001a\u0004\u0018\u00010i8\u0006¢\u0006\f\n\u0004\bt\u0010k\u001a\u0004\bu\u0010lR\u0019\u0010y\u001a\u0004\u0018\u00010i8\u0006¢\u0006\f\n\u0004\bw\u0010k\u001a\u0004\bx\u0010lR\u0019\u0010|\u001a\u0004\u0018\u00010i8\u0006¢\u0006\f\n\u0004\bz\u0010k\u001a\u0004\b{\u0010lR\u0019\u0010\u001a\u0004\u0018\u00010i8\u0006¢\u0006\f\n\u0004\b}\u0010k\u001a\u0004\b~\u0010l¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/CriteoProductModel;", "Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "Landroid/os/Parcelable;", "", "id", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;", "V0", "Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;", "g", "()Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;", "availability", "", "Lcom/carrefour/fid/android/domain/models/offer/OfferFlag;", "W0", "Ljava/util/List;", "M", "()Ljava/util/List;", "Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;", "Lcom/carrefour/fid/android/presentation/models/OfferIdentifierModel;", "X0", "Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;", "W", "()Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;", "Lcom/carrefour/fid/android/presentation/models/ProductModel;", "Y0", "Lcom/carrefour/fid/android/presentation/models/ProductModel;", "o0", "()Lcom/carrefour/fid/android/presentation/models/ProductModel;", "product", "Lcom/carrefour/fid/android/domain/models/OfferPriceDomain;", "Lcom/carrefour/fid/android/presentation/models/OfferPriceModel;", "Z0", "Lcom/carrefour/fid/android/domain/models/OfferPriceDomain;", "m0", "()Lcom/carrefour/fid/android/domain/models/OfferPriceDomain;", "price", "", "a1", "Ljava/lang/Double;", "n0", "()Ljava/lang/Double;", "i2", "(Ljava/lang/Double;)V", "priceDiscountAmount", "Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "Lcom/carrefour/fid/android/presentation/models/OfferDiscountModel;", "b1", "Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "w", "()Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "discount", "Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;", "Lcom/carrefour/fid/android/presentation/models/OfferDiscountPromoCodeModel;", "c1", "Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;", "y", "()Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;", "discountPromoCode", "d1", "I", "p0", "()I", "j2", "(I)V", "quantity", "e1", "Ljava/lang/Integer;", "X", "()Ljava/lang/Integer;", "Q1", "(Ljava/lang/Integer;)V", "incrementQty", "f1", "f0", "Y1", "maxSellingQty", "g1", "h0", "a2", "minSellingQty", "", "h1", "Z", "A1", "()Z", "N1", "(Z)V", "isInShoppingList", "i1", "z", "feesPreparationAmount", "Lcom/carrefour/fid/android/presentation/models/OfferNotificationType;", "j1", "Lcom/carrefour/fid/android/presentation/models/OfferNotificationType;", "i0", "()Lcom/carrefour/fid/android/presentation/models/OfferNotificationType;", "c2", "(Lcom/carrefour/fid/android/presentation/models/OfferNotificationType;)V", "notificationType", "", "k1", "Ljava/lang/String;", "()Ljava/lang/String;", "informationFlagFormat", "l1", "K0", "strategy", "m1", "r2", "isSponsored", "n1", "p2", "onViewBeacon", "o1", "o2", "onClickBeacon", "p1", "n2", "onBasketChangeBeacon", "q1", "q2", "onWishListBeacon", "<init>", "(Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;Lcom/carrefour/fid/android/presentation/models/ProductModel;Lcom/carrefour/fid/android/domain/models/OfferPriceDomain;Ljava/lang/Double;Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Double;Lcom/carrefour/fid/android/presentation/models/OfferNotificationType;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class CriteoProductModel extends OfferProductModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CriteoProductModel> CREATOR = new C38424a();

    /* renamed from: r1 */
    public static final int f97370r1 = 8;
    @C12579k

    /* renamed from: V0 */
    public final OfferAvailability f97371V0;
    @C12580l

    /* renamed from: W0 */
    public final List<OfferFlag> f97372W0;
    @C12580l

    /* renamed from: X0 */
    public final OfferIdentifierDomain f97373X0;
    @C12580l

    /* renamed from: Y0 */
    public final ProductModel f97374Y0;
    @C12580l

    /* renamed from: Z0 */
    public final OfferPriceDomain f97375Z0;
    @C12580l

    /* renamed from: a1 */
    public Double f97376a1;
    @C12580l

    /* renamed from: b1 */
    public final OfferDiscountDomain f97377b1;
    @C12580l

    /* renamed from: c1 */
    public final OfferDiscountPromoCodeDomain f97378c1;

    /* renamed from: d1 */
    public int f97379d1;
    @C12580l

    /* renamed from: e1 */
    public Integer f97380e1;
    @C12580l

    /* renamed from: f1 */
    public Integer f97381f1;
    @C12580l

    /* renamed from: g1 */
    public Integer f97382g1;

    /* renamed from: h1 */
    public boolean f97383h1;
    @C12580l

    /* renamed from: i1 */
    public final Double f97384i1;
    @C12580l

    /* renamed from: j1 */
    public OfferNotificationType f97385j1;
    @C12580l

    /* renamed from: k1 */
    public final String f97386k1;
    @C12579k

    /* renamed from: l1 */
    public final String f97387l1;

    /* renamed from: m1 */
    public final boolean f97388m1;
    @C12580l

    /* renamed from: n1 */
    public final String f97389n1;
    @C12580l

    /* renamed from: o1 */
    public final String f97390o1;
    @C12580l

    /* renamed from: p1 */
    public final String f97391p1;
    @C12580l

    /* renamed from: q1 */
    public final String f97392q1;

    /* renamed from: com.carrefour.fid.android.presentation.models.CriteoProductModel$a */
    public static final class C38424a implements Parcelable.Creator<CriteoProductModel> {
        @C12579k
        /* renamed from: a */
        public final CriteoProductModel createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            OfferAvailability valueOf = OfferAvailability.valueOf(parcel.readString());
            OfferNotificationType offerNotificationType = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(OfferFlag.valueOf(parcel.readString()));
                }
            }
            OfferIdentifierDomain createFromParcel = parcel.readInt() == 0 ? null : OfferIdentifierDomain.CREATOR.createFromParcel(parcel2);
            ProductModel createFromParcel2 = parcel.readInt() == 0 ? null : ProductModel.CREATOR.createFromParcel(parcel2);
            OfferPriceDomain createFromParcel3 = parcel.readInt() == 0 ? null : OfferPriceDomain.CREATOR.createFromParcel(parcel2);
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            OfferDiscountDomain createFromParcel4 = parcel.readInt() == 0 ? null : OfferDiscountDomain.CREATOR.createFromParcel(parcel2);
            OfferDiscountPromoCodeDomain createFromParcel5 = parcel.readInt() == 0 ? null : OfferDiscountPromoCodeDomain.CREATOR.createFromParcel(parcel2);
            int readInt2 = parcel.readInt();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z = parcel.readInt() != 0;
            Double valueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                offerNotificationType = OfferNotificationType.valueOf(parcel.readString());
            }
            return new CriteoProductModel(valueOf, arrayList, createFromParcel, createFromParcel2, createFromParcel3, valueOf2, createFromParcel4, createFromParcel5, readInt2, valueOf3, valueOf4, valueOf5, z, valueOf6, offerNotificationType, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final CriteoProductModel[] newArray(int i) {
            return new CriteoProductModel[i];
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CriteoProductModel(com.carrefour.fid.android.domain.models.offer.OfferAvailability r27, java.util.List r28, com.carrefour.fid.android.domain.models.OfferIdentifierDomain r29, com.carrefour.fid.android.presentation.models.ProductModel r30, com.carrefour.fid.android.domain.models.OfferPriceDomain r31, java.lang.Double r32, com.carrefour.fid.android.domain.models.OfferDiscountDomain r33, com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain r34, int r35, java.lang.Integer r36, java.lang.Integer r37, java.lang.Integer r38, boolean r39, java.lang.Double r40, com.carrefour.fid.android.presentation.models.OfferNotificationType r41, java.lang.String r42, java.lang.String r43, boolean r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
        /*
            r26 = this;
            r0 = r49
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r18 = r2
            goto L_0x000c
        L_0x000a:
            r18 = r41
        L_0x000c:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0015
            r19 = r2
            goto L_0x0017
        L_0x0015:
            r19 = r42
        L_0x0017:
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r17 = r40
            r20 = r43
            r21 = r44
            r22 = r45
            r23 = r46
            r24 = r47
            r25 = r48
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.CriteoProductModel.<init>(com.carrefour.fid.android.domain.models.offer.OfferAvailability, java.util.List, com.carrefour.fid.android.domain.models.OfferIdentifierDomain, com.carrefour.fid.android.presentation.models.ProductModel, com.carrefour.fid.android.domain.models.OfferPriceDomain, java.lang.Double, com.carrefour.fid.android.domain.models.OfferDiscountDomain, com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, java.lang.Double, com.carrefour.fid.android.presentation.models.OfferNotificationType, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: A1 */
    public boolean mo121497A1() {
        return this.f97383h1;
    }

    @C12579k
    /* renamed from: K0 */
    public String mo121498K0() {
        return this.f97387l1;
    }

    @C12580l
    /* renamed from: M */
    public List<OfferFlag> mo121499M() {
        return this.f97372W0;
    }

    /* renamed from: N1 */
    public void mo121500N1(boolean z) {
        this.f97383h1 = z;
    }

    /* renamed from: Q1 */
    public void mo121501Q1(@C12580l Integer num) {
        this.f97380e1 = num;
    }

    @C12580l
    /* renamed from: W */
    public OfferIdentifierDomain mo121502W() {
        return this.f97373X0;
    }

    @C12580l
    /* renamed from: X */
    public Integer mo121503X() {
        return this.f97380e1;
    }

    /* renamed from: Y1 */
    public void mo121504Y1(@C12580l Integer num) {
        this.f97381f1 = num;
    }

    @C12580l
    /* renamed from: Z */
    public String mo121505Z() {
        return this.f97386k1;
    }

    /* renamed from: a2 */
    public void mo121506a2(@C12580l Integer num) {
        this.f97382g1 = num;
    }

    /* renamed from: c2 */
    public void mo121507c2(@C12580l OfferNotificationType offerNotificationType) {
        this.f97385j1 = offerNotificationType;
    }

    @C12580l
    /* renamed from: f0 */
    public Integer mo121508f0() {
        return this.f97381f1;
    }

    @C12579k
    /* renamed from: g */
    public OfferAvailability mo121509g() {
        return this.f97371V0;
    }

    @C12580l
    /* renamed from: h0 */
    public Integer mo121510h0() {
        return this.f97382g1;
    }

    @C12580l
    /* renamed from: i0 */
    public OfferNotificationType mo121511i0() {
        return this.f97385j1;
    }

    /* renamed from: i2 */
    public void mo121512i2(@C12580l Double d) {
        this.f97376a1 = d;
    }

    /* renamed from: id */
    public long mo121471id() {
        OfferIdentifierDomain W = mo121502W();
        String f = W != null ? W.mo115986f() : null;
        return (long) (f != null ? f.hashCode() : 0);
    }

    /* renamed from: j2 */
    public void mo121513j2(int i) {
        this.f97379d1 = i;
    }

    @C12580l
    /* renamed from: m0 */
    public OfferPriceDomain mo121514m0() {
        return this.f97375Z0;
    }

    @C12580l
    /* renamed from: n0 */
    public Double mo121515n0() {
        return this.f97376a1;
    }

    @C12580l
    /* renamed from: n2 */
    public final String mo121516n2() {
        return this.f97391p1;
    }

    @C12580l
    /* renamed from: o0 */
    public ProductModel mo121517o0() {
        return this.f97374Y0;
    }

    @C12580l
    /* renamed from: o2 */
    public final String mo121518o2() {
        return this.f97390o1;
    }

    /* renamed from: p0 */
    public int mo121519p0() {
        return this.f97379d1;
    }

    @C12580l
    /* renamed from: p2 */
    public final String mo121520p2() {
        return this.f97389n1;
    }

    @C12580l
    /* renamed from: q2 */
    public final String mo121521q2() {
        return this.f97392q1;
    }

    /* renamed from: r2 */
    public final boolean mo121522r2() {
        return this.f97388m1;
    }

    @C12580l
    /* renamed from: w */
    public OfferDiscountDomain mo121523w() {
        return this.f97377b1;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f97371V0.name());
        List<OfferFlag> list = this.f97372W0;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (OfferFlag name : list) {
                parcel.writeString(name.name());
            }
        }
        OfferIdentifierDomain offerIdentifierDomain = this.f97373X0;
        if (offerIdentifierDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerIdentifierDomain.writeToParcel(parcel, i);
        }
        ProductModel productModel = this.f97374Y0;
        if (productModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productModel.writeToParcel(parcel, i);
        }
        OfferPriceDomain offerPriceDomain = this.f97375Z0;
        if (offerPriceDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerPriceDomain.writeToParcel(parcel, i);
        }
        Double d = this.f97376a1;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        OfferDiscountDomain offerDiscountDomain = this.f97377b1;
        if (offerDiscountDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerDiscountDomain.writeToParcel(parcel, i);
        }
        OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain = this.f97378c1;
        if (offerDiscountPromoCodeDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerDiscountPromoCodeDomain.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f97379d1);
        Integer num = this.f97380e1;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f97381f1;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.f97382g1;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeInt(this.f97383h1 ? 1 : 0);
        Double d2 = this.f97384i1;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        OfferNotificationType offerNotificationType = this.f97385j1;
        if (offerNotificationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(offerNotificationType.name());
        }
        parcel.writeString(this.f97386k1);
        parcel.writeString(this.f97387l1);
        parcel.writeInt(this.f97388m1 ? 1 : 0);
        parcel.writeString(this.f97389n1);
        parcel.writeString(this.f97390o1);
        parcel.writeString(this.f97391p1);
        parcel.writeString(this.f97392q1);
    }

    @C12580l
    /* renamed from: y */
    public OfferDiscountPromoCodeDomain mo121525y() {
        return this.f97378c1;
    }

    @C12580l
    /* renamed from: z */
    public Double mo121526z() {
        return this.f97384i1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CriteoProductModel(@C12579k OfferAvailability offerAvailability, @C12580l List<? extends OfferFlag> list, @C12580l OfferIdentifierDomain offerIdentifierDomain, @C12580l ProductModel productModel, @C12580l OfferPriceDomain offerPriceDomain, @C12580l Double d, @C12580l OfferDiscountDomain offerDiscountDomain, @C12580l OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain, int i, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, boolean z, @C12580l Double d2, @C12580l OfferNotificationType offerNotificationType, @C12580l String str, @C12579k String str2, boolean z2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6) {
        super(offerAvailability, list, offerIdentifierDomain, productModel, offerPriceDomain, d, (Double) null, offerDiscountDomain, offerDiscountPromoCodeDomain, i, num, num2, num3, z, d2, (OfferNotificationType) null, (ValidFreshnessGuaranteeDomain) null, (String) null, str2, (Double) null, (Integer) null, (Double) null, (String) null, (Double) null, false, (Boolean) null, (Boolean) null, false, false, false, false, 2147188736, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(offerAvailability, C28534f.f69157h0);
        Intrinsics.checkNotNullParameter(str2, "strategy");
        this.f97371V0 = offerAvailability;
        this.f97372W0 = list;
        this.f97373X0 = offerIdentifierDomain;
        this.f97374Y0 = productModel;
        this.f97375Z0 = offerPriceDomain;
        this.f97376a1 = d;
        this.f97377b1 = offerDiscountDomain;
        this.f97378c1 = offerDiscountPromoCodeDomain;
        this.f97379d1 = i;
        this.f97380e1 = num;
        this.f97381f1 = num2;
        this.f97382g1 = num3;
        this.f97383h1 = z;
        this.f97384i1 = d2;
        this.f97385j1 = offerNotificationType;
        this.f97386k1 = str;
        this.f97387l1 = str2;
        this.f97388m1 = z2;
        this.f97389n1 = str3;
        this.f97390o1 = str4;
        this.f97391p1 = str5;
        this.f97392q1 = str6;
    }
}
