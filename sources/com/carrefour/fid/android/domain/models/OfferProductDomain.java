package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
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

@C11076d0(mo22515d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bM\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010,\u001a\u0004\u0018\u00010\t\u0012\b\u0010-\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010.\u001a\u0004\u0018\u00010\r\u0012\b\u0010/\u001a\u0004\u0018\u00010\r\u0012\b\u00100\u001a\u0004\u0018\u00010\u0011\u0012\b\u00101\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u00102\u001a\u00020\u0015\u0012\b\u00103\u001a\u0004\u0018\u00010\u0015\u0012\b\u00104\u001a\u0004\u0018\u00010\u0015\u0012\b\u00105\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u00106\u001a\u00020\u001b\u0012\b\u00107\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010?\u001a\u00020\u001b\u0012\b\b\u0002\u0010@\u001a\u00020\u001b¢\u0006\u0006\b\u0001\u0010\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0015HÆ\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\t\u0010\u001c\u001a\u00020\u001bHÆ\u0003J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010\u000fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0012\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\"\u0010\u000fJ\u000b\u0010#\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0012\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010\u000fJ\u000b\u0010&\u001a\u0004\u0018\u00010%HÆ\u0003J\t\u0010'\u001a\u00020\u001bHÆ\u0003J\t\u0010(\u001a\u00020\u001bHÆ\u0003J¬\u0002\u0010A\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\u00022\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u00102\u001a\u00020\u00152\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u00106\u001a\u00020\u001b2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\r2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010?\u001a\u00020\u001b2\b\b\u0002\u0010@\u001a\u00020\u001bHÆ\u0001¢\u0006\u0004\bA\u0010BJ\t\u0010C\u001a\u00020\u001eHÖ\u0001J\t\u0010D\u001a\u00020\u0015HÖ\u0001J\u0013\u0010G\u001a\u00020\u001b2\b\u0010F\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010H\u001a\u00020\u0015HÖ\u0001J\u0019\u0010L\u001a\u00020K2\u0006\u0010J\u001a\u00020I2\u0006\u0010*\u001a\u00020\u0015HÖ\u0001R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010M\u001a\u0004\bN\u0010OR\u001f\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010+\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010,\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010V\u001a\u0004\bW\u0010XR\u0019\u0010-\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010Y\u001a\u0004\bZ\u0010[R$\u0010.\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\\\u001a\u0004\b]\u0010\u000f\"\u0004\b^\u0010_R\u0019\u0010/\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\\\u001a\u0004\b`\u0010\u000fR\u0019\u00100\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0010\u0010a\u001a\u0004\bb\u0010cR\u0019\u00101\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0012\u0010d\u001a\u0004\be\u0010fR\"\u00102\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010T\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u00103\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bA\u0010k\u001a\u0004\bl\u0010\u0018\"\u0004\bm\u0010nR$\u00104\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bo\u0010k\u001a\u0004\bp\u0010\u0018\"\u0004\bq\u0010nR$\u00105\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\br\u0010k\u001a\u0004\bs\u0010\u0018\"\u0004\bt\u0010nR\"\u00106\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u0019\u00107\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bv\u0010\\\u001a\u0004\b{\u0010\u000fR&\u00108\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\"\u0006\b\u0001\u0010\u0001R'\u00109\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\\\u001a\u0005\b\u0001\u0010\u000f\"\u0005\b\u0001\u0010_R&\u0010:\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0014\n\u0005\b\u0001\u0010k\u001a\u0005\b\u0001\u0010\u0018\"\u0004\bu\u0010nR&\u0010;\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0014\n\u0005\b\u0001\u0010\\\u001a\u0005\b\u0001\u0010\u000f\"\u0004\bv\u0010_R(\u0010<\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0016\n\u0005\b\u0001\u0010}\u001a\u0005\b\u0001\u0010\"\u0006\b\u0001\u0010\u0001R'\u0010=\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010\\\u001a\u0005\b\u0001\u0010\u000f\"\u0005\b\u0001\u0010_R\u001d\u0010>\u001a\u0004\u0018\u00010%8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010?\u001a\u00020\u001b8\u0006¢\u0006\r\n\u0005\b\u0001\u0010v\u001a\u0004\br\u0010xR\u0019\u0010@\u001a\u00020\u001b8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010v\u001a\u0005\b\u0001\u0010x¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OfferProductDomain;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;", "a", "", "Lcom/carrefour/fid/android/domain/models/offer/OfferFlag;", "l", "Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;", "r", "Lcom/carrefour/fid/android/domain/models/ProductDomain;", "s", "Lcom/carrefour/fid/android/domain/models/OfferPriceDomain;", "t", "", "u", "()Ljava/lang/Double;", "v", "Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "w", "Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;", "x", "", "b", "c", "()Ljava/lang/Integer;", "d", "e", "", "f", "g", "", "h", "i", "j", "k", "m", "n", "Lcom/carrefour/fid/android/domain/models/FreshnessGuaranteeDomain;", "o", "p", "q", "availability", "flags", "id", "product", "price", "priceDiscountAmount", "offerTotalAmount", "discount", "discountPromoCode", "quantity", "incrementQty", "maxSellingQty", "minSellingQty", "isInShoppingList", "feesPreparationAmount", "strategy", "score", "categoryRank", "categoryScore", "mainNodeId", "scoreMainNodeId", "freshnessGuaranteeDomain", "isNotFood", "isAlternativeCheaper", "y", "(Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;Lcom/carrefour/fid/android/domain/models/ProductDomain;Lcom/carrefour/fid/android/domain/models/OfferPriceDomain;Ljava/lang/Double;Ljava/lang/Double;Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Lcom/carrefour/fid/android/domain/models/FreshnessGuaranteeDomain;ZZ)Lcom/carrefour/fid/android/domain/models/OfferProductDomain;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;", "A", "()Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;", "Ljava/util/List;", "G", "()Ljava/util/List;", "Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;", "I", "()Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;", "Lcom/carrefour/fid/android/domain/models/ProductDomain;", "Q", "()Lcom/carrefour/fid/android/domain/models/ProductDomain;", "Lcom/carrefour/fid/android/domain/models/OfferPriceDomain;", "O", "()Lcom/carrefour/fid/android/domain/models/OfferPriceDomain;", "Ljava/lang/Double;", "P", "f0", "(Ljava/lang/Double;)V", "N", "Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "D", "()Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;", "E", "()Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;", "R", "()I", "g0", "(I)V", "Ljava/lang/Integer;", "J", "b0", "(Ljava/lang/Integer;)V", "z", "L", "d0", "X", "M", "e0", "Y", "Z", "W", "()Z", "a0", "(Z)V", "F", "E0", "Ljava/lang/String;", "U", "()Ljava/lang/String;", "j0", "(Ljava/lang/String;)V", "F0", "S", "h0", "G0", "B", "H0", "C", "I0", "K", "c0", "J0", "T", "i0", "K0", "Lcom/carrefour/fid/android/domain/models/FreshnessGuaranteeDomain;", "H", "()Lcom/carrefour/fid/android/domain/models/FreshnessGuaranteeDomain;", "L0", "M0", "V", "<init>", "(Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/OfferIdentifierDomain;Lcom/carrefour/fid/android/domain/models/ProductDomain;Lcom/carrefour/fid/android/domain/models/OfferPriceDomain;Ljava/lang/Double;Ljava/lang/Double;Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;Lcom/carrefour/fid/android/domain/models/OfferDiscountPromoCodeDomain;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Lcom/carrefour/fid/android/domain/models/FreshnessGuaranteeDomain;ZZ)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OfferProductDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OfferProductDomain> CREATOR = new C37921a();

    /* renamed from: N0 */
    public static final int f95199N0 = 8;
    @C12580l

    /* renamed from: E0 */
    public String f95200E0;
    @C12580l

    /* renamed from: F0 */
    public Double f95201F0;
    @C12580l

    /* renamed from: G0 */
    public Integer f95202G0;
    @C12580l

    /* renamed from: H0 */
    public Double f95203H0;
    @C12580l

    /* renamed from: I0 */
    public String f95204I0;
    @C12580l

    /* renamed from: J0 */
    public Double f95205J0;
    @C12580l

    /* renamed from: K0 */
    public final FreshnessGuaranteeDomain f95206K0;

    /* renamed from: L0 */
    public final boolean f95207L0;

    /* renamed from: M0 */
    public final boolean f95208M0;
    @C12580l

    /* renamed from: X */
    public Integer f95209X;

    /* renamed from: Y */
    public boolean f95210Y;
    @C12580l

    /* renamed from: Z */
    public final Double f95211Z;
    @C12579k

    /* renamed from: a */
    public final OfferAvailability f95212a;
    @C12580l

    /* renamed from: b */
    public final List<OfferFlag> f95213b;
    @C12580l

    /* renamed from: c */
    public final OfferIdentifierDomain f95214c;
    @C12580l

    /* renamed from: d */
    public final ProductDomain f95215d;
    @C12580l

    /* renamed from: e */
    public final OfferPriceDomain f95216e;
    @C12580l

    /* renamed from: f */
    public Double f95217f;
    @C12580l

    /* renamed from: g */
    public final Double f95218g;
    @C12580l

    /* renamed from: v */
    public final OfferDiscountDomain f95219v;
    @C12580l

    /* renamed from: w */
    public final OfferDiscountPromoCodeDomain f95220w;

    /* renamed from: x */
    public int f95221x;
    @C12580l

    /* renamed from: y */
    public Integer f95222y;
    @C12580l

    /* renamed from: z */
    public Integer f95223z;

    /* renamed from: com.carrefour.fid.android.domain.models.OfferProductDomain$a */
    public static final class C37921a implements Parcelable.Creator<OfferProductDomain> {
        @C12579k
        /* renamed from: a */
        public final OfferProductDomain createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            OfferAvailability valueOf = OfferAvailability.valueOf(parcel.readString());
            Double d = null;
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
            ProductDomain createFromParcel2 = parcel.readInt() == 0 ? null : ProductDomain.CREATOR.createFromParcel(parcel2);
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
            String readString = parcel.readString();
            Double valueOf8 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double valueOf10 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                d = Double.valueOf(parcel.readDouble());
            }
            return new OfferProductDomain(valueOf, arrayList, createFromParcel, createFromParcel2, createFromParcel3, valueOf2, valueOf3, createFromParcel4, createFromParcel5, readInt2, valueOf4, valueOf5, valueOf6, z, valueOf7, readString, valueOf8, valueOf9, valueOf10, readString2, d, (FreshnessGuaranteeDomain) parcel2.readParcelable(OfferProductDomain.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final OfferProductDomain[] newArray(int i) {
            return new OfferProductDomain[i];
        }
    }

    public OfferProductDomain(@C12579k OfferAvailability offerAvailability, @C12580l List<? extends OfferFlag> list, @C12580l OfferIdentifierDomain offerIdentifierDomain, @C12580l ProductDomain productDomain, @C12580l OfferPriceDomain offerPriceDomain, @C12580l Double d, @C12580l Double d2, @C12580l OfferDiscountDomain offerDiscountDomain, @C12580l OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain, int i, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, boolean z, @C12580l Double d3, @C12580l String str, @C12580l Double d4, @C12580l Integer num4, @C12580l Double d5, @C12580l String str2, @C12580l Double d6, @C12580l FreshnessGuaranteeDomain freshnessGuaranteeDomain, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(offerAvailability, C28534f.f69157h0);
        this.f95212a = offerAvailability;
        this.f95213b = list;
        this.f95214c = offerIdentifierDomain;
        this.f95215d = productDomain;
        this.f95216e = offerPriceDomain;
        this.f95217f = d;
        this.f95218g = d2;
        this.f95219v = offerDiscountDomain;
        this.f95220w = offerDiscountPromoCodeDomain;
        this.f95221x = i;
        this.f95222y = num;
        this.f95223z = num2;
        this.f95209X = num3;
        this.f95210Y = z;
        this.f95211Z = d3;
        this.f95200E0 = str;
        this.f95201F0 = d4;
        this.f95202G0 = num4;
        this.f95203H0 = d5;
        this.f95204I0 = str2;
        this.f95205J0 = d6;
        this.f95206K0 = freshnessGuaranteeDomain;
        this.f95207L0 = z2;
        this.f95208M0 = z3;
    }

    /* renamed from: z */
    public static /* synthetic */ OfferProductDomain m155535z(OfferProductDomain offerProductDomain, OfferAvailability offerAvailability, List list, OfferIdentifierDomain offerIdentifierDomain, ProductDomain productDomain, OfferPriceDomain offerPriceDomain, Double d, Double d2, OfferDiscountDomain offerDiscountDomain, OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain, int i, Integer num, Integer num2, Integer num3, boolean z, Double d3, String str, Double d4, Integer num4, Double d5, String str2, Double d6, FreshnessGuaranteeDomain freshnessGuaranteeDomain, boolean z2, boolean z3, int i2, Object obj) {
        OfferProductDomain offerProductDomain2 = offerProductDomain;
        int i3 = i2;
        return offerProductDomain.mo116081y((i3 & 1) != 0 ? offerProductDomain2.f95212a : offerAvailability, (i3 & 2) != 0 ? offerProductDomain2.f95213b : list, (i3 & 4) != 0 ? offerProductDomain2.f95214c : offerIdentifierDomain, (i3 & 8) != 0 ? offerProductDomain2.f95215d : productDomain, (i3 & 16) != 0 ? offerProductDomain2.f95216e : offerPriceDomain, (i3 & 32) != 0 ? offerProductDomain2.f95217f : d, (i3 & 64) != 0 ? offerProductDomain2.f95218g : d2, (i3 & 128) != 0 ? offerProductDomain2.f95219v : offerDiscountDomain, (i3 & 256) != 0 ? offerProductDomain2.f95220w : offerDiscountPromoCodeDomain, (i3 & 512) != 0 ? offerProductDomain2.f95221x : i, (i3 & 1024) != 0 ? offerProductDomain2.f95222y : num, (i3 & 2048) != 0 ? offerProductDomain2.f95223z : num2, (i3 & 4096) != 0 ? offerProductDomain2.f95209X : num3, (i3 & 8192) != 0 ? offerProductDomain2.f95210Y : z, (i3 & 16384) != 0 ? offerProductDomain2.f95211Z : d3, (i3 & 32768) != 0 ? offerProductDomain2.f95200E0 : str, (i3 & 65536) != 0 ? offerProductDomain2.f95201F0 : d4, (i3 & 131072) != 0 ? offerProductDomain2.f95202G0 : num4, (i3 & 262144) != 0 ? offerProductDomain2.f95203H0 : d5, (i3 & 524288) != 0 ? offerProductDomain2.f95204I0 : str2, (i3 & 1048576) != 0 ? offerProductDomain2.f95205J0 : d6, (i3 & 2097152) != 0 ? offerProductDomain2.f95206K0 : freshnessGuaranteeDomain, (i3 & 4194304) != 0 ? offerProductDomain2.f95207L0 : z2, (i3 & 8388608) != 0 ? offerProductDomain2.f95208M0 : z3);
    }

    @C12579k
    /* renamed from: A */
    public final OfferAvailability mo116016A() {
        return this.f95212a;
    }

    @C12580l
    /* renamed from: B */
    public final Integer mo116017B() {
        return this.f95202G0;
    }

    @C12580l
    /* renamed from: C */
    public final Double mo116018C() {
        return this.f95203H0;
    }

    @C12580l
    /* renamed from: D */
    public final OfferDiscountDomain mo116019D() {
        return this.f95219v;
    }

    @C12580l
    /* renamed from: E */
    public final OfferDiscountPromoCodeDomain mo116020E() {
        return this.f95220w;
    }

    @C12580l
    /* renamed from: F */
    public final Double mo116021F() {
        return this.f95211Z;
    }

    @C12580l
    /* renamed from: G */
    public final List<OfferFlag> mo116022G() {
        return this.f95213b;
    }

    @C12580l
    /* renamed from: H */
    public final FreshnessGuaranteeDomain mo116023H() {
        return this.f95206K0;
    }

    @C12580l
    /* renamed from: I */
    public final OfferIdentifierDomain mo116024I() {
        return this.f95214c;
    }

    @C12580l
    /* renamed from: J */
    public final Integer mo116025J() {
        return this.f95222y;
    }

    @C12580l
    /* renamed from: K */
    public final String mo116026K() {
        return this.f95204I0;
    }

    @C12580l
    /* renamed from: L */
    public final Integer mo116027L() {
        return this.f95223z;
    }

    @C12580l
    /* renamed from: M */
    public final Integer mo116028M() {
        return this.f95209X;
    }

    @C12580l
    /* renamed from: N */
    public final Double mo116029N() {
        return this.f95218g;
    }

    @C12580l
    /* renamed from: O */
    public final OfferPriceDomain mo116030O() {
        return this.f95216e;
    }

    @C12580l
    /* renamed from: P */
    public final Double mo116031P() {
        return this.f95217f;
    }

    @C12580l
    /* renamed from: Q */
    public final ProductDomain mo116032Q() {
        return this.f95215d;
    }

    /* renamed from: R */
    public final int mo116033R() {
        return this.f95221x;
    }

    @C12580l
    /* renamed from: S */
    public final Double mo116034S() {
        return this.f95201F0;
    }

    @C12580l
    /* renamed from: T */
    public final Double mo116035T() {
        return this.f95205J0;
    }

    @C12580l
    /* renamed from: U */
    public final String mo116036U() {
        return this.f95200E0;
    }

    /* renamed from: V */
    public final boolean mo116037V() {
        return this.f95208M0;
    }

    /* renamed from: W */
    public final boolean mo116038W() {
        return this.f95210Y;
    }

    /* renamed from: X */
    public final boolean mo116039X() {
        return this.f95207L0;
    }

    /* renamed from: Y */
    public final void mo116040Y(@C12580l Integer num) {
        this.f95202G0 = num;
    }

    /* renamed from: Z */
    public final void mo116041Z(@C12580l Double d) {
        this.f95203H0 = d;
    }

    @C12579k
    /* renamed from: a */
    public final OfferAvailability mo116042a() {
        return this.f95212a;
    }

    /* renamed from: a0 */
    public final void mo116043a0(boolean z) {
        this.f95210Y = z;
    }

    /* renamed from: b */
    public final int mo116044b() {
        return this.f95221x;
    }

    /* renamed from: b0 */
    public final void mo116045b0(@C12580l Integer num) {
        this.f95222y = num;
    }

    @C12580l
    /* renamed from: c */
    public final Integer mo116046c() {
        return this.f95222y;
    }

    /* renamed from: c0 */
    public final void mo116047c0(@C12580l String str) {
        this.f95204I0 = str;
    }

    @C12580l
    /* renamed from: d */
    public final Integer mo116048d() {
        return this.f95223z;
    }

    /* renamed from: d0 */
    public final void mo116049d0(@C12580l Integer num) {
        this.f95223z = num;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final Integer mo116051e() {
        return this.f95209X;
    }

    /* renamed from: e0 */
    public final void mo116052e0(@C12580l Integer num) {
        this.f95209X = num;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferProductDomain)) {
            return false;
        }
        OfferProductDomain offerProductDomain = (OfferProductDomain) obj;
        return this.f95212a == offerProductDomain.f95212a && Intrinsics.areEqual((Object) this.f95213b, (Object) offerProductDomain.f95213b) && Intrinsics.areEqual((Object) this.f95214c, (Object) offerProductDomain.f95214c) && Intrinsics.areEqual((Object) this.f95215d, (Object) offerProductDomain.f95215d) && Intrinsics.areEqual((Object) this.f95216e, (Object) offerProductDomain.f95216e) && Intrinsics.areEqual((Object) this.f95217f, (Object) offerProductDomain.f95217f) && Intrinsics.areEqual((Object) this.f95218g, (Object) offerProductDomain.f95218g) && Intrinsics.areEqual((Object) this.f95219v, (Object) offerProductDomain.f95219v) && Intrinsics.areEqual((Object) this.f95220w, (Object) offerProductDomain.f95220w) && this.f95221x == offerProductDomain.f95221x && Intrinsics.areEqual((Object) this.f95222y, (Object) offerProductDomain.f95222y) && Intrinsics.areEqual((Object) this.f95223z, (Object) offerProductDomain.f95223z) && Intrinsics.areEqual((Object) this.f95209X, (Object) offerProductDomain.f95209X) && this.f95210Y == offerProductDomain.f95210Y && Intrinsics.areEqual((Object) this.f95211Z, (Object) offerProductDomain.f95211Z) && Intrinsics.areEqual((Object) this.f95200E0, (Object) offerProductDomain.f95200E0) && Intrinsics.areEqual((Object) this.f95201F0, (Object) offerProductDomain.f95201F0) && Intrinsics.areEqual((Object) this.f95202G0, (Object) offerProductDomain.f95202G0) && Intrinsics.areEqual((Object) this.f95203H0, (Object) offerProductDomain.f95203H0) && Intrinsics.areEqual((Object) this.f95204I0, (Object) offerProductDomain.f95204I0) && Intrinsics.areEqual((Object) this.f95205J0, (Object) offerProductDomain.f95205J0) && Intrinsics.areEqual((Object) this.f95206K0, (Object) offerProductDomain.f95206K0) && this.f95207L0 == offerProductDomain.f95207L0 && this.f95208M0 == offerProductDomain.f95208M0;
    }

    /* renamed from: f */
    public final boolean mo116054f() {
        return this.f95210Y;
    }

    /* renamed from: f0 */
    public final void mo116055f0(@C12580l Double d) {
        this.f95217f = d;
    }

    @C12580l
    /* renamed from: g */
    public final Double mo116056g() {
        return this.f95211Z;
    }

    /* renamed from: g0 */
    public final void mo116057g0(int i) {
        this.f95221x = i;
    }

    @C12580l
    /* renamed from: h */
    public final String mo116058h() {
        return this.f95200E0;
    }

    /* renamed from: h0 */
    public final void mo116059h0(@C12580l Double d) {
        this.f95201F0 = d;
    }

    public int hashCode() {
        int hashCode = this.f95212a.hashCode() * 31;
        List<OfferFlag> list = this.f95213b;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        OfferIdentifierDomain offerIdentifierDomain = this.f95214c;
        int hashCode3 = (hashCode2 + (offerIdentifierDomain == null ? 0 : offerIdentifierDomain.hashCode())) * 31;
        ProductDomain productDomain = this.f95215d;
        int hashCode4 = (hashCode3 + (productDomain == null ? 0 : productDomain.hashCode())) * 31;
        OfferPriceDomain offerPriceDomain = this.f95216e;
        int hashCode5 = (hashCode4 + (offerPriceDomain == null ? 0 : offerPriceDomain.hashCode())) * 31;
        Double d = this.f95217f;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f95218g;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        OfferDiscountDomain offerDiscountDomain = this.f95219v;
        int hashCode8 = (hashCode7 + (offerDiscountDomain == null ? 0 : offerDiscountDomain.hashCode())) * 31;
        OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain = this.f95220w;
        int hashCode9 = (((hashCode8 + (offerDiscountPromoCodeDomain == null ? 0 : offerDiscountPromoCodeDomain.hashCode())) * 31) + Integer.hashCode(this.f95221x)) * 31;
        Integer num = this.f95222y;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f95223z;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f95209X;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        boolean z = this.f95210Y;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode12 + (z ? 1 : 0)) * 31;
        Double d3 = this.f95211Z;
        int hashCode13 = (i2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.f95200E0;
        int hashCode14 = (hashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        Double d4 = this.f95201F0;
        int hashCode15 = (hashCode14 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num4 = this.f95202G0;
        int hashCode16 = (hashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d5 = this.f95203H0;
        int hashCode17 = (hashCode16 + (d5 == null ? 0 : d5.hashCode())) * 31;
        String str2 = this.f95204I0;
        int hashCode18 = (hashCode17 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d6 = this.f95205J0;
        int hashCode19 = (hashCode18 + (d6 == null ? 0 : d6.hashCode())) * 31;
        FreshnessGuaranteeDomain freshnessGuaranteeDomain = this.f95206K0;
        if (freshnessGuaranteeDomain != null) {
            i = freshnessGuaranteeDomain.hashCode();
        }
        int i3 = (hashCode19 + i) * 31;
        boolean z3 = this.f95207L0;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f95208M0;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    @C12580l
    /* renamed from: i */
    public final Double mo116061i() {
        return this.f95201F0;
    }

    /* renamed from: i0 */
    public final void mo116062i0(@C12580l Double d) {
        this.f95205J0 = d;
    }

    @C12580l
    /* renamed from: j */
    public final Integer mo116063j() {
        return this.f95202G0;
    }

    /* renamed from: j0 */
    public final void mo116064j0(@C12580l String str) {
        this.f95200E0 = str;
    }

    @C12580l
    /* renamed from: k */
    public final Double mo116065k() {
        return this.f95203H0;
    }

    @C12580l
    /* renamed from: l */
    public final List<OfferFlag> mo116066l() {
        return this.f95213b;
    }

    @C12580l
    /* renamed from: m */
    public final String mo116067m() {
        return this.f95204I0;
    }

    @C12580l
    /* renamed from: n */
    public final Double mo116068n() {
        return this.f95205J0;
    }

    @C12580l
    /* renamed from: o */
    public final FreshnessGuaranteeDomain mo116069o() {
        return this.f95206K0;
    }

    /* renamed from: p */
    public final boolean mo116070p() {
        return this.f95207L0;
    }

    /* renamed from: q */
    public final boolean mo116071q() {
        return this.f95208M0;
    }

    @C12580l
    /* renamed from: r */
    public final OfferIdentifierDomain mo116072r() {
        return this.f95214c;
    }

    @C12580l
    /* renamed from: s */
    public final ProductDomain mo116073s() {
        return this.f95215d;
    }

    @C12580l
    /* renamed from: t */
    public final OfferPriceDomain mo116074t() {
        return this.f95216e;
    }

    @C12579k
    public String toString() {
        OfferAvailability offerAvailability = this.f95212a;
        List<OfferFlag> list = this.f95213b;
        OfferIdentifierDomain offerIdentifierDomain = this.f95214c;
        ProductDomain productDomain = this.f95215d;
        OfferPriceDomain offerPriceDomain = this.f95216e;
        Double d = this.f95217f;
        Double d2 = this.f95218g;
        OfferDiscountDomain offerDiscountDomain = this.f95219v;
        OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain = this.f95220w;
        int i = this.f95221x;
        Integer num = this.f95222y;
        Integer num2 = this.f95223z;
        Integer num3 = this.f95209X;
        boolean z = this.f95210Y;
        Double d3 = this.f95211Z;
        String str = this.f95200E0;
        Double d4 = this.f95201F0;
        Integer num4 = this.f95202G0;
        Double d5 = this.f95203H0;
        String str2 = this.f95204I0;
        Double d6 = this.f95205J0;
        FreshnessGuaranteeDomain freshnessGuaranteeDomain = this.f95206K0;
        boolean z2 = this.f95207L0;
        boolean z3 = this.f95208M0;
        return "OfferProductDomain(availability=" + offerAvailability + ", flags=" + list + ", id=" + offerIdentifierDomain + ", product=" + productDomain + ", price=" + offerPriceDomain + ", priceDiscountAmount=" + d + ", offerTotalAmount=" + d2 + ", discount=" + offerDiscountDomain + ", discountPromoCode=" + offerDiscountPromoCodeDomain + ", quantity=" + i + ", incrementQty=" + num + ", maxSellingQty=" + num2 + ", minSellingQty=" + num3 + ", isInShoppingList=" + z + ", feesPreparationAmount=" + d3 + ", strategy=" + str + ", score=" + d4 + ", categoryRank=" + num4 + ", categoryScore=" + d5 + ", mainNodeId=" + str2 + ", scoreMainNodeId=" + d6 + ", freshnessGuaranteeDomain=" + freshnessGuaranteeDomain + ", isNotFood=" + z2 + ", isAlternativeCheaper=" + z3 + ")";
    }

    @C12580l
    /* renamed from: u */
    public final Double mo116076u() {
        return this.f95217f;
    }

    @C12580l
    /* renamed from: v */
    public final Double mo116077v() {
        return this.f95218g;
    }

    @C12580l
    /* renamed from: w */
    public final OfferDiscountDomain mo116078w() {
        return this.f95219v;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95212a.name());
        List<OfferFlag> list = this.f95213b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (OfferFlag name : list) {
                parcel.writeString(name.name());
            }
        }
        OfferIdentifierDomain offerIdentifierDomain = this.f95214c;
        if (offerIdentifierDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerIdentifierDomain.writeToParcel(parcel, i);
        }
        ProductDomain productDomain = this.f95215d;
        if (productDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            productDomain.writeToParcel(parcel, i);
        }
        OfferPriceDomain offerPriceDomain = this.f95216e;
        if (offerPriceDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerPriceDomain.writeToParcel(parcel, i);
        }
        Double d = this.f95217f;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f95218g;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        OfferDiscountDomain offerDiscountDomain = this.f95219v;
        if (offerDiscountDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerDiscountDomain.writeToParcel(parcel, i);
        }
        OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain = this.f95220w;
        if (offerDiscountPromoCodeDomain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerDiscountPromoCodeDomain.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f95221x);
        Integer num = this.f95222y;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f95223z;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.f95209X;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeInt(this.f95210Y ? 1 : 0);
        Double d3 = this.f95211Z;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        parcel.writeString(this.f95200E0);
        Double d4 = this.f95201F0;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        Integer num4 = this.f95202G0;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Double d5 = this.f95203H0;
        if (d5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d5.doubleValue());
        }
        parcel.writeString(this.f95204I0);
        Double d6 = this.f95205J0;
        if (d6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d6.doubleValue());
        }
        parcel.writeParcelable(this.f95206K0, i);
        parcel.writeInt(this.f95207L0 ? 1 : 0);
        parcel.writeInt(this.f95208M0 ? 1 : 0);
    }

    @C12580l
    /* renamed from: x */
    public final OfferDiscountPromoCodeDomain mo116080x() {
        return this.f95220w;
    }

    @C12579k
    /* renamed from: y */
    public final OfferProductDomain mo116081y(@C12579k OfferAvailability offerAvailability, @C12580l List<? extends OfferFlag> list, @C12580l OfferIdentifierDomain offerIdentifierDomain, @C12580l ProductDomain productDomain, @C12580l OfferPriceDomain offerPriceDomain, @C12580l Double d, @C12580l Double d2, @C12580l OfferDiscountDomain offerDiscountDomain, @C12580l OfferDiscountPromoCodeDomain offerDiscountPromoCodeDomain, int i, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, boolean z, @C12580l Double d3, @C12580l String str, @C12580l Double d4, @C12580l Integer num4, @C12580l Double d5, @C12580l String str2, @C12580l Double d6, @C12580l FreshnessGuaranteeDomain freshnessGuaranteeDomain, boolean z2, boolean z3) {
        OfferAvailability offerAvailability2 = offerAvailability;
        OfferAvailability offerAvailability3 = offerAvailability2;
        Intrinsics.checkNotNullParameter(offerAvailability2, C28534f.f69157h0);
        return new OfferProductDomain(offerAvailability2, list, offerIdentifierDomain, productDomain, offerPriceDomain, d, d2, offerDiscountDomain, offerDiscountPromoCodeDomain, i, num, num2, num3, z, d3, str, d4, num4, d5, str2, d6, freshnessGuaranteeDomain, z2, z3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OfferProductDomain(com.carrefour.fid.android.domain.models.offer.OfferAvailability r29, java.util.List r30, com.carrefour.fid.android.domain.models.OfferIdentifierDomain r31, com.carrefour.fid.android.domain.models.ProductDomain r32, com.carrefour.fid.android.domain.models.OfferPriceDomain r33, java.lang.Double r34, java.lang.Double r35, com.carrefour.fid.android.domain.models.OfferDiscountDomain r36, com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain r37, int r38, java.lang.Integer r39, java.lang.Integer r40, java.lang.Integer r41, boolean r42, java.lang.Double r43, java.lang.String r44, java.lang.Double r45, java.lang.Integer r46, java.lang.Double r47, java.lang.String r48, java.lang.Double r49, com.carrefour.fid.android.domain.models.FreshnessGuaranteeDomain r50, boolean r51, boolean r52, int r53, kotlin.jvm.internal.DefaultConstructorMarker r54) {
        /*
            r28 = this;
            r0 = r53
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r17 = r2
            goto L_0x000c
        L_0x000a:
            r17 = r42
        L_0x000c:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r3 = 0
            if (r1 == 0) goto L_0x0016
            r19 = r3
            goto L_0x0018
        L_0x0016:
            r19 = r44
        L_0x0018:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0020
            r20 = r3
            goto L_0x0022
        L_0x0020:
            r20 = r45
        L_0x0022:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x002a
            r21 = r3
            goto L_0x002c
        L_0x002a:
            r21 = r46
        L_0x002c:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0034
            r22 = r3
            goto L_0x0036
        L_0x0034:
            r22 = r47
        L_0x0036:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x003e
            r23 = r3
            goto L_0x0040
        L_0x003e:
            r23 = r48
        L_0x0040:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0048
            r24 = r3
            goto L_0x004a
        L_0x0048:
            r24 = r49
        L_0x004a:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0052
            r25 = r3
            goto L_0x0054
        L_0x0052:
            r25 = r50
        L_0x0054:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x005c
            r26 = r2
            goto L_0x005e
        L_0x005c:
            r26 = r51
        L_0x005e:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0066
            r27 = r2
            goto L_0x0068
        L_0x0066:
            r27 = r52
        L_0x0068:
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r34
            r10 = r35
            r11 = r36
            r12 = r37
            r13 = r38
            r14 = r39
            r15 = r40
            r16 = r41
            r18 = r43
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.OfferProductDomain.<init>(com.carrefour.fid.android.domain.models.offer.OfferAvailability, java.util.List, com.carrefour.fid.android.domain.models.OfferIdentifierDomain, com.carrefour.fid.android.domain.models.ProductDomain, com.carrefour.fid.android.domain.models.OfferPriceDomain, java.lang.Double, java.lang.Double, com.carrefour.fid.android.domain.models.OfferDiscountDomain, com.carrefour.fid.android.domain.models.OfferDiscountPromoCodeDomain, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, java.lang.Double, java.lang.String, java.lang.Double, java.lang.Integer, java.lang.Double, java.lang.String, java.lang.Double, com.carrefour.fid.android.domain.models.FreshnessGuaranteeDomain, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
