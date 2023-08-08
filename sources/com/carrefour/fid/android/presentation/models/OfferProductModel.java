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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b;\b\u0017\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002Bû\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c\u0012\b\u0010&\u001a\u0004\u0018\u00010!\u0012\u000e\u0010-\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(\u0012\b\u00105\u001a\u0004\u0018\u00010.\u0012\b\u00108\u001a\u0004\u0018\u00010.\u0012\u000e\u0010?\u001a\n\u0018\u000109j\u0004\u0018\u0001`:\u0012\u000e\u0010E\u001a\n\u0018\u00010@j\u0004\u0018\u0001`A\u0012\u0006\u0010L\u001a\u00020\u0004\u0012\b\u0010R\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010V\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010Y\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010a\u001a\u00020Z\u0012\b\u0010b\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010c\u0012\u0010\b\u0002\u0010q\u001a\n\u0018\u00010kj\u0004\u0018\u0001`l\u0012\n\b\u0002\u0010u\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010x\u001a\u00020\b\u0012\n\b\u0002\u0010{\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010~\u001a\u0004\u0018\u00010\u0004\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010.\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\b\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010.\u0012\t\b\u0002\u0010\u0001\u001a\u00020Z\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010Z\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010Z\u0012\t\b\u0002\u0010\u0001\u001a\u00020Z\u0012\t\b\u0002\u0010\u0001\u001a\u00020Z\u0012\t\b\u0002\u0010 \u0001\u001a\u00020Z\u0012\t\b\u0002\u0010¤\u0001\u001a\u00020Z¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u0007\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010&\u001a\u0004\u0018\u00010!8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010-\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(8\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00105\u001a\u0004\u0018\u00010.8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00108\u001a\u0004\u0018\u00010.8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0013\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\"\u0010?\u001a\n\u0018\u000109j\u0004\u0018\u0001`:8\u0016X\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010E\u001a\n\u0018\u00010@j\u0004\u0018\u0001`A8\u0016X\u0004¢\u0006\f\n\u0004\b=\u0010B\u001a\u0004\bC\u0010DR\"\u0010L\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010R\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bC\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010V\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bS\u0010M\u001a\u0004\bT\u0010O\"\u0004\bU\u0010QR$\u0010Y\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bN\u0010M\u001a\u0004\bW\u0010O\"\u0004\bX\u0010QR\"\u0010a\u001a\u00020Z8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001c\u0010b\u001a\u0004\u0018\u00010.8\u0016X\u0004¢\u0006\f\n\u0004\b\\\u00100\u001a\u0004\bS\u00102R$\u0010j\u001a\u0004\u0018\u00010c8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010q\u001a\n\u0018\u00010kj\u0004\u0018\u0001`l8\u0016X\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001c\u0010u\u001a\u0004\u0018\u00010\b8\u0016X\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\b\\\u0010tR\u001a\u0010x\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\bv\u0010s\u001a\u0004\bw\u0010tR\u001c\u0010{\u001a\u0004\u0018\u00010.8\u0016X\u0004¢\u0006\f\n\u0004\by\u00100\u001a\u0004\bz\u00102R\u001c\u0010~\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b|\u0010M\u001a\u0004\b}\u0010OR\u001d\u0010\u0001\u001a\u0004\u0018\u00010.8\u0016X\u0004¢\u0006\f\n\u0004\bw\u00100\u001a\u0004\b\u00102R\u001f\u0010\u0001\u001a\u0004\u0018\u00010\b8\u0016X\u0004¢\u0006\u000e\n\u0005\b\u0001\u0010s\u001a\u0005\b\u0001\u0010tR\u001f\u0010\u0001\u001a\u0004\u0018\u00010.8\u0016X\u0004¢\u0006\u000e\n\u0005\b\u0001\u00100\u001a\u0005\b\u0001\u00102R&\u0010\u0001\u001a\u00020Z8\u0016@\u0016X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\\\u001a\u0005\b\u0001\u0010^\"\u0005\b\u0001\u0010`R+\u0010\u0001\u001a\u0004\u0018\u00010Z8\u0016@\u0016X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u0004\u0018\u00010Z8\u0016@\u0016X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u00020Z8\u0016@\u0016X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\\\u001a\u0005\b\u0001\u0010^\"\u0005\b\u0001\u0010`R&\u0010\u0001\u001a\u00020Z8\u0016@\u0016X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\\\u001a\u0005\b\u0001\u0010^\"\u0005\b\u0001\u0010`R&\u0010 \u0001\u001a\u00020Z8\u0016@\u0016X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\\\u001a\u0005\b\u0001\u0010^\"\u0005\b\u0001\u0010`R&\u0010¤\u0001\u001a\u00020Z8\u0016@\u0016X\u000e¢\u0006\u0015\n\u0005\b¡\u0001\u0010\\\u001a\u0005\b¢\u0001\u0010^\"\u0005\b£\u0001\u0010`¨\u0006§\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/OfferProductModel;", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "", "other", "", "b", "", "id", "", "toString", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;", "a", "Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;", "g", "()Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;", "availability", "", "Lcom/carrefour/fid/android/domain/models/offer/OfferFlag;", "Ljava/util/List;", "M", "()Ljava/util/List;", "Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;", "Lcom/carrefour/fid/android/presentation/models/OfferIdentifierModel;", "c", "Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;", "W", "()Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;", "Lcom/carrefour/fid/android/presentation/models/ProductModel;", "d", "Lcom/carrefour/fid/android/presentation/models/ProductModel;", "o0", "()Lcom/carrefour/fid/android/presentation/models/ProductModel;", "product", "Lcom/carrefour/fid/android/domain/models/OfferPriceDomain;", "Lcom/carrefour/fid/android/presentation/models/OfferPriceModel;", "e", "Lcom/carrefour/fid/android/domain/models/OfferPriceDomain;", "m0", "()Lcom/carrefour/fid/android/domain/models/OfferPriceDomain;", "price", "", "f", "Ljava/lang/Double;", "n0", "()Ljava/lang/Double;", "i2", "(Ljava/lang/Double;)V", "priceDiscountAmount", "j0", "e2", "offerTotalAmount", "Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "Lcom/carrefour/fid/android/presentation/models/OfferDiscountModel;", "v", "Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "w", "()Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "discount", "Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;", "Lcom/carrefour/fid/android/presentation/models/OfferDiscountPromoCodeModel;", "Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;", "y", "()Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;", "discountPromoCode", "x", "I", "p0", "()I", "j2", "(I)V", "quantity", "Ljava/lang/Integer;", "X", "()Ljava/lang/Integer;", "Q1", "(Ljava/lang/Integer;)V", "incrementQty", "z", "f0", "Y1", "maxSellingQty", "h0", "a2", "minSellingQty", "", "Y", "Z", "A1", "()Z", "N1", "(Z)V", "isInShoppingList", "feesPreparationAmount", "Lcom/carrefour/fid/android/presentation/models/OfferNotificationType;", "E0", "Lcom/carrefour/fid/android/presentation/models/OfferNotificationType;", "i0", "()Lcom/carrefour/fid/android/presentation/models/OfferNotificationType;", "c2", "(Lcom/carrefour/fid/android/presentation/models/OfferNotificationType;)V", "notificationType", "Lcom/carrefour/fid/android/domain/models/ValidFreshnessGuaranteeDomain;", "Lcom/carrefour/fid/android/presentation/models/FreshnessGuaranteedModel;", "F0", "Lcom/carrefour/fid/android/domain/models/ValidFreshnessGuaranteeDomain;", "Q", "()Lcom/carrefour/fid/android/domain/models/ValidFreshnessGuaranteeDomain;", "freshnessGuarantee", "G0", "Ljava/lang/String;", "()Ljava/lang/String;", "informationFlagFormat", "H0", "K0", "strategy", "I0", "t0", "score", "J0", "q", "categoryRank", "r", "categoryScore", "L0", "e0", "mainNodeId", "M0", "u0", "scoreMainNodeId", "N0", "k1", "L1", "isEligibleAntiInflation", "O0", "Ljava/lang/Boolean;", "E1", "()Ljava/lang/Boolean;", "X1", "(Ljava/lang/Boolean;)V", "isLoading", "P0", "A0", "l2", "showMixingOverlayIfAvailable", "Q0", "C0", "m2", "showMixingTooltip", "R0", "G1", "isAtcLoading", "S0", "l1", "M1", "isFavoritesLoading", "T0", "j1", "I1", "isDeleteLoading", "<init>", "(Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;Lcom/carrefour/fid/android/presentation/models/ProductModel;Lcom/carrefour/fid/android/domain/models/OfferPriceDomain;Ljava/lang/Double;Ljava/lang/Double;Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Double;Lcom/carrefour/fid/android/presentation/models/OfferNotificationType;Lcom/carrefour/fid/android/domain/models/ValidFreshnessGuaranteeDomain;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;ZLjava/lang/Boolean;Ljava/lang/Boolean;ZZZZ)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public class OfferProductModel implements OfferModel, Comparable<OfferProductModel> {
    @C12579k
    public static final Parcelable.Creator<OfferProductModel> CREATOR = new C38439a();

    /* renamed from: U0 */
    public static final int f97450U0 = 8;
    @C12580l

    /* renamed from: E0 */
    public OfferNotificationType f97451E0;
    @C12580l

    /* renamed from: F0 */
    public final ValidFreshnessGuaranteeDomain f97452F0;
    @C12580l

    /* renamed from: G0 */
    public final String f97453G0;
    @C12579k

    /* renamed from: H0 */
    public final String f97454H0;
    @C12580l

    /* renamed from: I0 */
    public final Double f97455I0;
    @C12580l

    /* renamed from: J0 */
    public final Integer f97456J0;
    @C12580l

    /* renamed from: K0 */
    public final Double f97457K0;
    @C12580l

    /* renamed from: L0 */
    public final String f97458L0;
    @C12580l

    /* renamed from: M0 */
    public final Double f97459M0;

    /* renamed from: N0 */
    public boolean f97460N0;
    @C12580l

    /* renamed from: O0 */
    public Boolean f97461O0;
    @C12580l

    /* renamed from: P0 */
    public Boolean f97462P0;

    /* renamed from: Q0 */
    public boolean f97463Q0;

    /* renamed from: R0 */
    public boolean f97464R0;

    /* renamed from: S0 */
    public boolean f97465S0;

    /* renamed from: T0 */
    public boolean f97466T0;
    @C12580l

    /* renamed from: X */
    public Integer f97467X;

    /* renamed from: Y */
    public boolean f97468Y;
    @C12580l

    /* renamed from: Z */
    public final Double f97469Z;
    @C12579k

    /* renamed from: a */
    public final OfferAvailability f97470a;
    @C12580l

    /* renamed from: b */
    public final List<OfferFlag> f97471b;
    @C12580l

    /* renamed from: c */
    public final OfferIdentifierDomain f97472c;
    @C12580l

    /* renamed from: d */
    public final ProductModel f97473d;
    @C12580l

    /* renamed from: e */
    public final OfferPriceDomain f97474e;
    @C12580l

    /* renamed from: f */
    public Double f97475f;
    @C12580l

    /* renamed from: g */
    public Double f97476g;
    @C12580l

    /* renamed from: v */
    public final OfferDiscountDomain f97477v;
    @C12580l

    /* renamed from: w */
    public final OfferDiscountPromoCodeDomain f97478w;

    /* renamed from: x */
    public int f97479x;
    @C12580l

    /* renamed from: y */
    public Integer f97480y;
    @C12580l

    /* renamed from: z */
    public Integer f97481z;

    /* renamed from: com.carrefour.fid.android.presentation.models.OfferProductModel$a */
    public static final class C38439a implements Parcelable.Creator<OfferProductModel> {
        @C12579k
        /* renamed from: a */
        public final OfferProductModel createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            Boolean bool;
            Boolean bool2;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            OfferAvailability valueOf = OfferAvailability.valueOf(parcel.readString());
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
            Double valueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            OfferDiscountDomain createFromParcel4 = parcel.readInt() == 0 ? null : OfferDiscountDomain.CREATOR.createFromParcel(parcel2);
            OfferDiscountPromoCodeDomain createFromParcel5 = parcel.readInt() == 0 ? null : OfferDiscountPromoCodeDomain.CREATOR.createFromParcel(parcel2);
            int readInt2 = parcel.readInt();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z = parcel.readInt() != 0;
            Double valueOf7 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            OfferNotificationType valueOf8 = parcel.readInt() == 0 ? null : OfferNotificationType.valueOf(parcel.readString());
            ValidFreshnessGuaranteeDomain createFromParcel6 = parcel.readInt() == 0 ? null : ValidFreshnessGuaranteeDomain.CREATOR.createFromParcel(parcel2);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Double valueOf9 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double valueOf11 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString3 = parcel.readString();
            Double valueOf12 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OfferProductModel(valueOf, arrayList, createFromParcel, createFromParcel2, createFromParcel3, valueOf2, valueOf3, createFromParcel4, createFromParcel5, readInt2, valueOf4, valueOf5, valueOf6, z, valueOf7, valueOf8, createFromParcel6, readString, readString2, valueOf9, valueOf10, valueOf11, readString3, valueOf12, z2, bool, bool2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final OfferProductModel[] newArray(int i) {
            return new OfferProductModel[i];
        }
    }

    public OfferProductModel(@C12579k OfferAvailability offerAvailability, @C12580l List<? extends OfferFlag> list, @C12580l OfferIdentifierDomain offerIdentifierDomain, @C12580l ProductModel productModel, @C12580l OfferPriceDomain offerPriceDomain, @C12580l Double d, @C12580l Double d2, @C12580l OfferDiscountDomain offerDiscountDomain, @C12580l OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain, int i, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, boolean z, @C12580l Double d3, @C12580l OfferNotificationType offerNotificationType, @C12580l ValidFreshnessGuaranteeDomain validFreshnessGuaranteeDomain, @C12580l String str, @C12579k String str2, @C12580l Double d4, @C12580l Integer num4, @C12580l Double d5, @C12580l String str3, @C12580l Double d6, boolean z2, @C12580l Boolean bool, @C12580l Boolean bool2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str4 = str2;
        Intrinsics.checkNotNullParameter(offerAvailability, C28534f.f69157h0);
        Intrinsics.checkNotNullParameter(str4, "strategy");
        this.f97470a = offerAvailability;
        this.f97471b = list;
        this.f97472c = offerIdentifierDomain;
        this.f97473d = productModel;
        this.f97474e = offerPriceDomain;
        this.f97475f = d;
        this.f97476g = d2;
        this.f97477v = offerDiscountDomain;
        this.f97478w = offerDiscountPromoCodeDomain;
        this.f97479x = i;
        this.f97480y = num;
        this.f97481z = num2;
        this.f97467X = num3;
        this.f97468Y = z;
        this.f97469Z = d3;
        this.f97451E0 = offerNotificationType;
        this.f97452F0 = validFreshnessGuaranteeDomain;
        this.f97453G0 = str;
        this.f97454H0 = str4;
        this.f97455I0 = d4;
        this.f97456J0 = num4;
        this.f97457K0 = d5;
        this.f97458L0 = str3;
        this.f97459M0 = d6;
        this.f97460N0 = z2;
        this.f97461O0 = bool;
        this.f97462P0 = bool2;
        this.f97463Q0 = z3;
        this.f97464R0 = z4;
        this.f97465S0 = z5;
        this.f97466T0 = z6;
    }

    @C12580l
    /* renamed from: A0 */
    public Boolean mo121726A0() {
        return this.f97462P0;
    }

    /* renamed from: A1 */
    public boolean mo121497A1() {
        return this.f97468Y;
    }

    /* renamed from: C0 */
    public boolean mo121727C0() {
        return this.f97463Q0;
    }

    @C12580l
    /* renamed from: E1 */
    public Boolean mo121728E1() {
        return this.f97461O0;
    }

    /* renamed from: G1 */
    public void mo121729G1(boolean z) {
        this.f97464R0 = z;
    }

    /* renamed from: I1 */
    public void mo121730I1(boolean z) {
        this.f97466T0 = z;
    }

    @C12579k
    /* renamed from: K0 */
    public String mo121498K0() {
        return this.f97454H0;
    }

    /* renamed from: L1 */
    public void mo121731L1(boolean z) {
        this.f97460N0 = z;
    }

    @C12580l
    /* renamed from: M */
    public List<OfferFlag> mo121499M() {
        return this.f97471b;
    }

    /* renamed from: M1 */
    public void mo121732M1(boolean z) {
        this.f97465S0 = z;
    }

    /* renamed from: N0 */
    public boolean mo121733N0() {
        return this.f97464R0;
    }

    /* renamed from: N1 */
    public void mo121500N1(boolean z) {
        this.f97468Y = z;
    }

    @C12580l
    /* renamed from: Q */
    public ValidFreshnessGuaranteeDomain mo121734Q() {
        return this.f97452F0;
    }

    /* renamed from: Q1 */
    public void mo121501Q1(@C12580l Integer num) {
        this.f97480y = num;
    }

    @C12580l
    /* renamed from: W */
    public OfferIdentifierDomain mo121502W() {
        return this.f97472c;
    }

    @C12580l
    /* renamed from: X */
    public Integer mo121503X() {
        return this.f97480y;
    }

    /* renamed from: X1 */
    public void mo121735X1(@C12580l Boolean bool) {
        this.f97461O0 = bool;
    }

    /* renamed from: Y1 */
    public void mo121504Y1(@C12580l Integer num) {
        this.f97481z = num;
    }

    @C12580l
    /* renamed from: Z */
    public String mo121505Z() {
        return this.f97453G0;
    }

    /* renamed from: a2 */
    public void mo121506a2(@C12580l Integer num) {
        this.f97467X = num;
    }

    /* renamed from: b */
    public int compareTo(@C12579k OfferProductModel offerProductModel) {
        String s;
        String str;
        Intrinsics.checkNotNullParameter(offerProductModel, "other");
        ProductModel o0 = mo121517o0();
        if (o0 == null || (s = o0.mo121889s()) == null) {
            return 0;
        }
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str = o02.mo121889s();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        return s.compareTo(str);
    }

    /* renamed from: c2 */
    public void mo121507c2(@C12580l OfferNotificationType offerNotificationType) {
        this.f97451E0 = offerNotificationType;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e0 */
    public String mo121739e0() {
        return this.f97458L0;
    }

    /* renamed from: e2 */
    public void mo121740e2(@C12580l Double d) {
        this.f97476g = d;
    }

    @C12580l
    /* renamed from: f0 */
    public Integer mo121508f0() {
        return this.f97481z;
    }

    @C12579k
    /* renamed from: g */
    public OfferAvailability mo121509g() {
        return this.f97470a;
    }

    @C12580l
    /* renamed from: h0 */
    public Integer mo121510h0() {
        return this.f97467X;
    }

    @C12580l
    /* renamed from: i0 */
    public OfferNotificationType mo121511i0() {
        return this.f97451E0;
    }

    /* renamed from: i2 */
    public void mo121512i2(@C12580l Double d) {
        this.f97475f = d;
    }

    /* renamed from: id */
    public long mo121471id() {
        OfferIdentifierDomain W = mo121502W();
        String f = W != null ? W.mo115986f() : null;
        return (long) (f != null ? f.hashCode() : 0);
    }

    @C12580l
    /* renamed from: j0 */
    public Double mo121741j0() {
        return this.f97476g;
    }

    /* renamed from: j1 */
    public boolean mo121742j1() {
        return this.f97466T0;
    }

    /* renamed from: j2 */
    public void mo121513j2(int i) {
        this.f97479x = i;
    }

    /* renamed from: k1 */
    public boolean mo121743k1() {
        return this.f97460N0;
    }

    /* renamed from: l1 */
    public boolean mo121744l1() {
        return this.f97465S0;
    }

    /* renamed from: l2 */
    public void mo121745l2(@C12580l Boolean bool) {
        this.f97462P0 = bool;
    }

    @C12580l
    /* renamed from: m0 */
    public OfferPriceDomain mo121514m0() {
        return this.f97474e;
    }

    /* renamed from: m2 */
    public void mo121746m2(boolean z) {
        this.f97463Q0 = z;
    }

    @C12580l
    /* renamed from: n0 */
    public Double mo121515n0() {
        return this.f97475f;
    }

    @C12580l
    /* renamed from: o0 */
    public ProductModel mo121517o0() {
        return this.f97473d;
    }

    /* renamed from: p0 */
    public int mo121519p0() {
        return this.f97479x;
    }

    @C12580l
    /* renamed from: q */
    public Integer mo121747q() {
        return this.f97456J0;
    }

    @C12580l
    /* renamed from: r */
    public Double mo121748r() {
        return this.f97457K0;
    }

    @C12580l
    /* renamed from: t0 */
    public Double mo121749t0() {
        return this.f97455I0;
    }

    @C12579k
    public String toString() {
        OfferAvailability g = mo121509g();
        List<OfferFlag> M = mo121499M();
        OfferIdentifierDomain W = mo121502W();
        ProductModel o0 = mo121517o0();
        OfferPriceDomain m0 = mo121514m0();
        Double n0 = mo121515n0();
        Double j0 = mo121741j0();
        OfferDiscountDomain w = mo121523w();
        OfferDiscountPromoCodeDomain y = mo121525y();
        int p0 = mo121519p0();
        Integer X = mo121503X();
        Integer f0 = mo121508f0();
        Integer h0 = mo121510h0();
        boolean A1 = mo121497A1();
        Double z = mo121526z();
        OfferNotificationType i0 = mo121511i0();
        ValidFreshnessGuaranteeDomain Q = mo121734Q();
        String Z = mo121505Z();
        String K0 = mo121498K0();
        Double t0 = mo121749t0();
        Integer q = mo121747q();
        Double r = mo121748r();
        String e0 = mo121739e0();
        Double u0 = mo121751u0();
        boolean k1 = mo121743k1();
        Boolean E1 = mo121728E1();
        Boolean A0 = mo121726A0();
        boolean C0 = mo121727C0();
        boolean N0 = mo121733N0();
        boolean l1 = mo121744l1();
        boolean j1 = mo121742j1();
        return "OfferProductModel(availability=" + g + ", flags=" + M + ", id=" + W + ", product=" + o0 + ", price=" + m0 + ", priceDiscountAmount=" + n0 + ", offerTotalAmount=" + j0 + ", discount=" + w + ", discountPromoCode=" + y + ", quantity=" + p0 + ", incrementQty=" + X + ", maxSellingQty=" + f0 + ", minSellingQty=" + h0 + ", isInShoppingList=" + A1 + ", feesPreparationAmount=" + z + ", notificationType=" + i0 + ", freshnessGuarantee=" + Q + ", informationFlagFormat=" + Z + ", strategy=" + K0 + ", score=" + t0 + ", categoryRank=" + q + ", categoryScore=" + r + ", mainNodeId=" + e0 + ", scoreMainNodeId=" + u0 + ", isEligibleAntiInflation=" + k1 + ", isLoading=" + E1 + ", showMixingOverlayIfAvailable=" + A0 + ", showMixingTooltip=" + C0 + ", isAtcLoading=" + N0 + ", isFavoritesLoading=" + l1 + ", isDeleteLoading=" + j1 + ")";
    }

    @C12580l
    /* renamed from: u0 */
    public Double mo121751u0() {
        return this.f97459M0;
    }

    @C12580l
    /* renamed from: w */
    public OfferDiscountDomain mo121523w() {
        return this.f97477v;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f97470a.name());
        List<OfferFlag> list = this.f97471b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (OfferFlag name : list) {
                parcel.writeString(name.name());
            }
        }
        OfferIdentifierDomain offerIdentifierDomain = this.f97472c;
        if (offerIdentifierDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerIdentifierDomain.writeToParcel(parcel, i);
        }
        ProductModel productModel = this.f97473d;
        if (productModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productModel.writeToParcel(parcel, i);
        }
        OfferPriceDomain offerPriceDomain = this.f97474e;
        if (offerPriceDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerPriceDomain.writeToParcel(parcel, i);
        }
        Double d = this.f97475f;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f97476g;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        OfferDiscountDomain offerDiscountDomain = this.f97477v;
        if (offerDiscountDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerDiscountDomain.writeToParcel(parcel, i);
        }
        OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain = this.f97478w;
        if (offerDiscountPromoCodeDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerDiscountPromoCodeDomain.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f97479x);
        Integer num = this.f97480y;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f97481z;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.f97467X;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeInt(this.f97468Y ? 1 : 0);
        Double d3 = this.f97469Z;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        OfferNotificationType offerNotificationType = this.f97451E0;
        if (offerNotificationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(offerNotificationType.name());
        }
        ValidFreshnessGuaranteeDomain validFreshnessGuaranteeDomain = this.f97452F0;
        if (validFreshnessGuaranteeDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            validFreshnessGuaranteeDomain.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f97453G0);
        parcel.writeString(this.f97454H0);
        Double d4 = this.f97455I0;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        Integer num4 = this.f97456J0;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Double d5 = this.f97457K0;
        if (d5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d5.doubleValue());
        }
        parcel.writeString(this.f97458L0);
        Double d6 = this.f97459M0;
        if (d6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d6.doubleValue());
        }
        parcel.writeInt(this.f97460N0 ? 1 : 0);
        Boolean bool = this.f97461O0;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f97462P0;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.f97463Q0 ? 1 : 0);
        parcel.writeInt(this.f97464R0 ? 1 : 0);
        parcel.writeInt(this.f97465S0 ? 1 : 0);
        parcel.writeInt(this.f97466T0 ? 1 : 0);
    }

    @C12580l
    /* renamed from: y */
    public OfferDiscountPromoCodeDomain mo121525y() {
        return this.f97478w;
    }

    @C12580l
    /* renamed from: z */
    public Double mo121526z() {
        return this.f97469Z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OfferProductModel(com.carrefour.fid.android.domain.models.offer.OfferAvailability r36, java.util.List r37, com.carrefour.fid.android.domain.models.OfferIdentifierDomain r38, com.carrefour.fid.android.presentation.models.ProductModel r39, com.carrefour.fid.android.domain.models.OfferPriceDomain r40, java.lang.Double r41, java.lang.Double r42, com.carrefour.fid.android.domain.models.OfferDiscountDomain r43, com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain r44, int r45, java.lang.Integer r46, java.lang.Integer r47, java.lang.Integer r48, boolean r49, java.lang.Double r50, com.carrefour.fid.android.presentation.models.OfferNotificationType r51, com.carrefour.fid.android.domain.models.ValidFreshnessGuaranteeDomain r52, java.lang.String r53, java.lang.String r54, java.lang.Double r55, java.lang.Integer r56, java.lang.Double r57, java.lang.String r58, java.lang.Double r59, boolean r60, java.lang.Boolean r61, java.lang.Boolean r62, boolean r63, boolean r64, boolean r65, boolean r66, int r67, kotlin.jvm.internal.DefaultConstructorMarker r68) {
        /*
            r35 = this;
            r0 = r67
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r17 = r2
            goto L_0x000c
        L_0x000a:
            r17 = r49
        L_0x000c:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r3 = 0
            if (r1 == 0) goto L_0x0016
            r19 = r3
            goto L_0x0018
        L_0x0016:
            r19 = r51
        L_0x0018:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0020
            r20 = r3
            goto L_0x0022
        L_0x0020:
            r20 = r52
        L_0x0022:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x002a
            r21 = r3
            goto L_0x002c
        L_0x002a:
            r21 = r53
        L_0x002c:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0034
            r23 = r3
            goto L_0x0036
        L_0x0034:
            r23 = r55
        L_0x0036:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x003e
            r24 = r3
            goto L_0x0040
        L_0x003e:
            r24 = r56
        L_0x0040:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0048
            r25 = r3
            goto L_0x004a
        L_0x0048:
            r25 = r57
        L_0x004a:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0052
            r26 = r3
            goto L_0x0054
        L_0x0052:
            r26 = r58
        L_0x0054:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x005c
            r27 = r3
            goto L_0x005e
        L_0x005c:
            r27 = r59
        L_0x005e:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0066
            r28 = r2
            goto L_0x0068
        L_0x0066:
            r28 = r60
        L_0x0068:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0072
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r29 = r1
            goto L_0x0074
        L_0x0072:
            r29 = r61
        L_0x0074:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x007e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r30 = r1
            goto L_0x0080
        L_0x007e:
            r30 = r62
        L_0x0080:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0089
            r1 = 1
            r31 = r1
            goto L_0x008b
        L_0x0089:
            r31 = r63
        L_0x008b:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0093
            r32 = r2
            goto L_0x0095
        L_0x0093:
            r32 = r64
        L_0x0095:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009d
            r33 = r2
            goto L_0x009f
        L_0x009d:
            r33 = r65
        L_0x009f:
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00a7
            r34 = r2
            goto L_0x00a9
        L_0x00a7:
            r34 = r66
        L_0x00a9:
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r38
            r7 = r39
            r8 = r40
            r9 = r41
            r10 = r42
            r11 = r43
            r12 = r44
            r13 = r45
            r14 = r46
            r15 = r47
            r16 = r48
            r18 = r50
            r22 = r54
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.OfferProductModel.<init>(com.carrefour.fid.android.domain.models.offer.OfferAvailability, java.util.List, com.carrefour.fid.android.domain.models.OfferIdentifierDomain, com.carrefour.fid.android.presentation.models.ProductModel, com.carrefour.fid.android.domain.models.OfferPriceDomain, java.lang.Double, java.lang.Double, com.carrefour.fid.android.domain.models.OfferDiscountDomain, com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, java.lang.Double, com.carrefour.fid.android.presentation.models.OfferNotificationType, com.carrefour.fid.android.domain.models.ValidFreshnessGuaranteeDomain, java.lang.String, java.lang.String, java.lang.Double, java.lang.Integer, java.lang.Double, java.lang.String, java.lang.Double, boolean, java.lang.Boolean, java.lang.Boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
