package com.carrefour.fid.android.domain.models.offer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C8698y1;
import com.carrefour.fid.android.domain.models.C38184v;
import com.carrefour.fid.android.domain.models.product.Product;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.urbanairship.util.C9647e0;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bE\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0001B\u0002\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\b\u00100\u001a\u0004\u0018\u00010\u0007\u0012\b\u00101\u001a\u0004\u0018\u00010\t\u0012\u0006\u00102\u001a\u00020\u000b\u0012\u0006\u00103\u001a\u00020\u000b\u0012\u0006\u00104\u001a\u00020\u000b\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u00106\u001a\u00020\u0012\u0012\b\u00107\u001a\u0004\u0018\u00010\u0014\u0012\b\u00108\u001a\u0004\u0018\u00010\u0016\u0012\b\u00109\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010:\u001a\u00020\u001a\u0012\u0006\u0010;\u001a\u00020\u000b\u0012\u0006\u0010<\u001a\u00020\u001d\u0012\u0006\u0010=\u001a\u00020\u001d\u0012\u0006\u0010>\u001a\u00020\u001d\u0012\u0006\u0010?\u001a\u00020\u001d\u0012\b\b\u0002\u0010@\u001a\u00020\"\u0012\b\b\u0002\u0010A\u001a\u00020$\u0012\u0006\u0010B\u001a\u00020\u001d\u0012\u0006\u0010C\u001a\u00020\u001d\u0012\b\u0010D\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010E\u001a\u00020\u001d\u0012\u0006\u0010F\u001a\u00020\"\u0012\b\b\u0002\u0010G\u001a\u00020\u001d\u0012\f\u0010H\u001a\b\u0012\u0004\u0012\u00020,0\u000f¢\u0006\u0006\b\u0001\u0010\u0001J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\u000bHÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\t\u0010\u001b\u001a\u00020\u001aHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u001dHÆ\u0003J\t\u0010\u001f\u001a\u00020\u001dHÆ\u0003J\t\u0010 \u001a\u00020\u001dHÆ\u0003J\t\u0010!\u001a\u00020\u001dHÆ\u0003J\t\u0010#\u001a\u00020\"HÆ\u0003J\t\u0010%\u001a\u00020$HÆ\u0003J\t\u0010&\u001a\u00020\u001dHÆ\u0003J\t\u0010'\u001a\u00020\u001dHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\"HÆ\u0003J\t\u0010)\u001a\u00020\u001dHÆ\u0003J\t\u0010*\u001a\u00020\"HÆ\u0003J\t\u0010+\u001a\u00020\u001dHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u000fHÆ\u0003J¸\u0002\u0010I\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t2\b\b\u0002\u00102\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u000b2\b\b\u0002\u00104\u001a\u00020\u000b2\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u00106\u001a\u00020\u00122\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010:\u001a\u00020\u001a2\b\b\u0002\u0010;\u001a\u00020\u000b2\b\b\u0002\u0010<\u001a\u00020\u001d2\b\b\u0002\u0010=\u001a\u00020\u001d2\b\b\u0002\u0010>\u001a\u00020\u001d2\b\b\u0002\u0010?\u001a\u00020\u001d2\b\b\u0002\u0010@\u001a\u00020\"2\b\b\u0002\u0010A\u001a\u00020$2\b\b\u0002\u0010B\u001a\u00020\u001d2\b\b\u0002\u0010C\u001a\u00020\u001d2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010E\u001a\u00020\u001d2\b\b\u0002\u0010F\u001a\u00020\"2\b\b\u0002\u0010G\u001a\u00020\u001d2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020,0\u000fHÆ\u0001¢\u0006\u0004\bI\u0010JJ\t\u0010K\u001a\u00020\"HÖ\u0001J\t\u0010L\u001a\u00020\u000bHÖ\u0001J\u0013\u0010O\u001a\u00020\u001d2\b\u0010N\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010P\u001a\u00020\u000bHÖ\u0001J\u0019\u0010T\u001a\u00020S2\u0006\u0010R\u001a\u00020Q2\u0006\u0010H\u001a\u00020\u000bHÖ\u0001R\u0017\u0010.\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010U\u001a\u0004\bV\u0010WR\u0019\u0010/\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010X\u001a\u0004\bY\u0010ZR\u0019\u00100\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010[\u001a\u0004\b\\\u0010]R\u0019\u00101\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010^\u001a\u0004\b_\u0010`R\u0017\u00102\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010a\u001a\u0004\bb\u0010cR\u0017\u00103\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010a\u001a\u0004\bd\u0010cR\u0017\u00104\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010a\u001a\u0004\be\u0010cR\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\n\u0010f\u001a\u0004\bg\u0010hR\u0017\u00106\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\f\u0010i\u001a\u0004\bj\u0010kR\u0019\u00107\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\r\u0010l\u001a\u0004\bm\u0010nR\u0019\u00108\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u000e\u0010o\u001a\u0004\bp\u0010\u0018R\u0019\u00109\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0011\u0010o\u001a\u0004\bq\u0010\u0018R\u0017\u0010:\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u0017\u0010;\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bv\u0010a\u001a\u0004\bw\u0010cR\u0017\u0010<\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bx\u0010x\u001a\u0004\by\u0010zR\u0017\u0010=\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b{\u0010x\u001a\u0004\bv\u0010zR\u0017\u0010>\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b|\u0010x\u001a\u0004\b}\u0010zR\u0017\u0010?\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b~\u0010x\u001a\u0004\b\u0010zR\u001b\u0010@\u001a\u00020\"8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001b\u0010A\u001a\u00020$8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0019\u0010B\u001a\u00020\u001d8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010x\u001a\u0005\b\u0001\u0010zR\u0018\u0010C\u001a\u00020\u001d8\u0006¢\u0006\r\n\u0005\b\u0001\u0010x\u001a\u0004\bx\u0010zR\u001c\u0010D\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\ba\u0010\u0001R\u0019\u0010E\u001a\u00020\u001d8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010x\u001a\u0005\b\u0001\u0010zR\u001b\u0010F\u001a\u00020\"8\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010G\u001a\u00020\u001d8\u0006¢\u0006\r\n\u0005\b\u0001\u0010x\u001a\u0004\br\u0010zR\u001f\u0010H\u001a\b\u0012\u0004\u0012\u00020,0\u000f8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010f\u001a\u0005\b\u0001\u0010hR\u0013\u0010\u0001\u001a\u00020\u001d8F¢\u0006\u0007\u001a\u0005\b\u0001\u0010z¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/offer/Offer;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/v;", "Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;", "a", "Lcom/carrefour/fid/android/domain/models/offer/CategoryLimit;", "l", "Lcom/carrefour/fid/android/domain/models/offer/OfferDiscount;", "u", "Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountPromotionCode;", "v", "", "w", "x", "y", "", "Lcom/carrefour/fid/android/domain/models/offer/OfferMessage;", "z", "Lcom/carrefour/fid/android/domain/models/offer/Prices;", "A", "Lcom/carrefour/fid/android/domain/models/offer/Discount;", "b", "", "c", "()Ljava/lang/Double;", "d", "Lcom/carrefour/fid/android/domain/models/product/Product;", "e", "f", "", "g", "h", "i", "j", "", "k", "Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;", "m", "n", "o", "p", "q", "r", "s", "Lcom/carrefour/fid/android/domain/models/offer/Offer$Flags;", "t", "id", "categoryLimit", "discount", "discountPromoCode", "incrementQuantity", "maxSellingQuantity", "minSellingQuantity", "messages", "prices", "promo", "priceDiscountAmount", "offerTotalAmount", "product", "quantity", "isSyncingInBasket", "isInShoppingList", "isSyncingInShoppingList", "isVariableWeight", "variableWeightSafetyMargin", "availability", "isPurchasable", "isIncontournable", "freshnessGaranteed", "isSponsored", "labelHighLight", "isDigitalCard", "flags", "B", "(Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;Lcom/carrefour/fid/android/domain/models/offer/CategoryLimit;Lcom/carrefour/fid/android/domain/models/offer/OfferDiscount;Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountPromotionCode;IIILjava/util/List;Lcom/carrefour/fid/android/domain/models/offer/Prices;Lcom/carrefour/fid/android/domain/models/offer/Discount;Ljava/lang/Double;Ljava/lang/Double;Lcom/carrefour/fid/android/domain/models/product/Product;IZZZZLjava/lang/String;Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;ZZLjava/lang/String;ZLjava/lang/String;ZLjava/util/List;)Lcom/carrefour/fid/android/domain/models/offer/Offer;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;", "J", "()Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;", "Lcom/carrefour/fid/android/domain/models/offer/CategoryLimit;", "E", "()Lcom/carrefour/fid/android/domain/models/offer/CategoryLimit;", "Lcom/carrefour/fid/android/domain/models/offer/OfferDiscount;", "F", "()Lcom/carrefour/fid/android/domain/models/offer/OfferDiscount;", "Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountPromotionCode;", "G", "()Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountPromotionCode;", "I", "K", "()I", "M", "O", "Ljava/util/List;", "N", "()Ljava/util/List;", "Lcom/carrefour/fid/android/domain/models/offer/Prices;", "R", "()Lcom/carrefour/fid/android/domain/models/offer/Prices;", "Lcom/carrefour/fid/android/domain/models/offer/Discount;", "T", "()Lcom/carrefour/fid/android/domain/models/offer/Discount;", "Ljava/lang/Double;", "Q", "P", "X", "Lcom/carrefour/fid/android/domain/models/product/Product;", "S", "()Lcom/carrefour/fid/android/domain/models/product/Product;", "Y", "U", "Z", "c0", "()Z", "E0", "F0", "d0", "G0", "e0", "H0", "Ljava/lang/String;", "V", "()Ljava/lang/String;", "I0", "Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;", "D", "()Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;", "J0", "a0", "K0", "L0", "M0", "b0", "N0", "L", "O0", "P0", "H", "W", "isClubFamille", "<init>", "(Lcom/carrefour/fid/android/domain/models/offer/OfferIdentifier;Lcom/carrefour/fid/android/domain/models/offer/CategoryLimit;Lcom/carrefour/fid/android/domain/models/offer/OfferDiscount;Lcom/carrefour/fid/android/domain/models/offer/OfferDiscountPromotionCode;IIILjava/util/List;Lcom/carrefour/fid/android/domain/models/offer/Prices;Lcom/carrefour/fid/android/domain/models/offer/Discount;Ljava/lang/Double;Ljava/lang/Double;Lcom/carrefour/fid/android/domain/models/product/Product;IZZZZLjava/lang/String;Lcom/carrefour/fid/android/domain/models/offer/OfferAvailability;ZZLjava/lang/String;ZLjava/lang/String;ZLjava/util/List;)V", "Flags", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class Offer implements Parcelable, C38184v {
    @C12579k
    public static final Parcelable.Creator<Offer> CREATOR = new C38054a();

    /* renamed from: E0 */
    public final boolean f95959E0;

    /* renamed from: F0 */
    public final boolean f95960F0;

    /* renamed from: G0 */
    public final boolean f95961G0;
    @C12579k

    /* renamed from: H0 */
    public final String f95962H0;
    @C12579k

    /* renamed from: I0 */
    public final OfferAvailability f95963I0;

    /* renamed from: J0 */
    public final boolean f95964J0;

    /* renamed from: K0 */
    public final boolean f95965K0;
    @C12580l

    /* renamed from: L0 */
    public final String f95966L0;

    /* renamed from: M0 */
    public final boolean f95967M0;
    @C12579k

    /* renamed from: N0 */
    public final String f95968N0;

    /* renamed from: O0 */
    public final boolean f95969O0;
    @C12579k

    /* renamed from: P0 */
    public final List<Flags> f95970P0;
    @C12579k

    /* renamed from: X */
    public final Product f95971X;

    /* renamed from: Y */
    public final int f95972Y;

    /* renamed from: Z */
    public final boolean f95973Z;
    @C12579k

    /* renamed from: a */
    public final OfferIdentifier f95974a;
    @C12580l

    /* renamed from: b */
    public final CategoryLimit f95975b;
    @C12580l

    /* renamed from: c */
    public final OfferDiscount f95976c;
    @C12580l

    /* renamed from: d */
    public final OfferDiscountPromotionCode f95977d;

    /* renamed from: e */
    public final int f95978e;

    /* renamed from: f */
    public final int f95979f;

    /* renamed from: g */
    public final int f95980g;
    @C12579k

    /* renamed from: v */
    public final List<OfferMessage> f95981v;
    @C12579k

    /* renamed from: w */
    public final Prices f95982w;
    @C12580l

    /* renamed from: x */
    public final Discount f95983x;
    @C12580l

    /* renamed from: y */
    public final Double f95984y;
    @C12580l

    /* renamed from: z */
    public final Double f95985z;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/offer/Offer$Flags;", "", "<init>", "(Ljava/lang/String;I)V", "a", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum Flags {
        CLUB_FAMILLE
    }

    /* renamed from: com.carrefour.fid.android.domain.models.offer.Offer$a */
    public static final class C38054a implements Parcelable.Creator<Offer> {
        @C12579k
        /* renamed from: a */
        public final Offer createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            OfferIdentifier createFromParcel = OfferIdentifier.CREATOR.createFromParcel(parcel2);
            Double d = null;
            CategoryLimit createFromParcel2 = parcel.readInt() == 0 ? null : CategoryLimit.CREATOR.createFromParcel(parcel2);
            OfferDiscount createFromParcel3 = parcel.readInt() == 0 ? null : OfferDiscount.CREATOR.createFromParcel(parcel2);
            OfferDiscountPromotionCode createFromParcel4 = parcel.readInt() == 0 ? null : OfferDiscountPromotionCode.CREATOR.createFromParcel(parcel2);
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt4);
            int i = 0;
            for (int i2 = 0; i2 != readInt4; i2++) {
                arrayList.add(OfferMessage.CREATOR.createFromParcel(parcel2));
            }
            Prices createFromParcel5 = Prices.CREATOR.createFromParcel(parcel2);
            Discount createFromParcel6 = parcel.readInt() == 0 ? null : Discount.CREATOR.createFromParcel(parcel2);
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                d = Double.valueOf(parcel.readDouble());
            }
            Double d2 = d;
            Product createFromParcel7 = Product.CREATOR.createFromParcel(parcel2);
            int readInt5 = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            String readString = parcel.readString();
            OfferAvailability valueOf2 = OfferAvailability.valueOf(parcel.readString());
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            String readString2 = parcel.readString();
            boolean z7 = parcel.readInt() != 0;
            String readString3 = parcel.readString();
            boolean z8 = parcel.readInt() != 0;
            int readInt6 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt6);
            while (i != readInt6) {
                arrayList2.add(Flags.valueOf(parcel.readString()));
                i++;
                readInt6 = readInt6;
            }
            return new Offer(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, readInt, readInt2, readInt3, arrayList, createFromParcel5, createFromParcel6, valueOf, d2, createFromParcel7, readInt5, z, z2, z3, z4, readString, valueOf2, z5, z6, readString2, z7, readString3, z8, arrayList2);
        }

        @C12579k
        /* renamed from: b */
        public final Offer[] newArray(int i) {
            return new Offer[i];
        }
    }

    public Offer(@C12579k OfferIdentifier offerIdentifier, @C12580l CategoryLimit categoryLimit, @C12580l OfferDiscount offerDiscount, @C12580l OfferDiscountPromotionCode offerDiscountPromotionCode, int i, int i2, int i3, @C12579k List<OfferMessage> list, @C12579k Prices prices, @C12580l Discount discount, @C12580l Double d, @C12580l Double d2, @C12579k Product product, int i4, boolean z, boolean z2, boolean z3, boolean z4, @C12579k String str, @C12579k OfferAvailability offerAvailability, boolean z5, boolean z6, @C12580l String str2, boolean z7, @C12579k String str3, boolean z8, @C12579k List<? extends Flags> list2) {
        List<OfferMessage> list3 = list;
        Prices prices2 = prices;
        Product product2 = product;
        String str4 = str;
        OfferAvailability offerAvailability2 = offerAvailability;
        String str5 = str3;
        List<? extends Flags> list4 = list2;
        Intrinsics.checkNotNullParameter(offerIdentifier, "id");
        Intrinsics.checkNotNullParameter(list3, "messages");
        Intrinsics.checkNotNullParameter(prices2, "prices");
        Intrinsics.checkNotNullParameter(product2, "product");
        Intrinsics.checkNotNullParameter(str4, "variableWeightSafetyMargin");
        Intrinsics.checkNotNullParameter(offerAvailability2, C28534f.f69157h0);
        Intrinsics.checkNotNullParameter(str5, "labelHighLight");
        Intrinsics.checkNotNullParameter(list4, "flags");
        this.f95974a = offerIdentifier;
        this.f95975b = categoryLimit;
        this.f95976c = offerDiscount;
        this.f95977d = offerDiscountPromotionCode;
        this.f95978e = i;
        this.f95979f = i2;
        this.f95980g = i3;
        this.f95981v = list3;
        this.f95982w = prices2;
        this.f95983x = discount;
        this.f95984y = d;
        this.f95985z = d2;
        this.f95971X = product2;
        this.f95972Y = i4;
        this.f95973Z = z;
        this.f95959E0 = z2;
        this.f95960F0 = z3;
        this.f95961G0 = z4;
        this.f95962H0 = str4;
        this.f95963I0 = offerAvailability2;
        this.f95964J0 = z5;
        this.f95965K0 = z6;
        this.f95966L0 = str2;
        this.f95967M0 = z7;
        this.f95968N0 = str5;
        this.f95969O0 = z8;
        this.f95970P0 = list4;
    }

    /* renamed from: C */
    public static /* synthetic */ Offer m156999C(Offer offer, OfferIdentifier offerIdentifier, CategoryLimit categoryLimit, OfferDiscount offerDiscount, OfferDiscountPromotionCode offerDiscountPromotionCode, int i, int i2, int i3, List list, Prices prices, Discount discount, Double d, Double d2, Product product, int i4, boolean z, boolean z2, boolean z3, boolean z4, String str, OfferAvailability offerAvailability, boolean z5, boolean z6, String str2, boolean z7, String str3, boolean z8, List list2, int i5, Object obj) {
        Offer offer2 = offer;
        int i6 = i5;
        return offer.mo117994B((i6 & 1) != 0 ? offer2.f95974a : offerIdentifier, (i6 & 2) != 0 ? offer2.f95975b : categoryLimit, (i6 & 4) != 0 ? offer2.f95976c : offerDiscount, (i6 & 8) != 0 ? offer2.f95977d : offerDiscountPromotionCode, (i6 & 16) != 0 ? offer2.f95978e : i, (i6 & 32) != 0 ? offer2.f95979f : i2, (i6 & 64) != 0 ? offer2.f95980g : i3, (i6 & 128) != 0 ? offer2.f95981v : list, (i6 & 256) != 0 ? offer2.f95982w : prices, (i6 & 512) != 0 ? offer2.f95983x : discount, (i6 & 1024) != 0 ? offer2.f95984y : d, (i6 & 2048) != 0 ? offer2.f95985z : d2, (i6 & 4096) != 0 ? offer2.f95971X : product, (i6 & 8192) != 0 ? offer2.f95972Y : i4, (i6 & 16384) != 0 ? offer2.f95973Z : z, (i6 & 32768) != 0 ? offer2.f95959E0 : z2, (i6 & 65536) != 0 ? offer2.f95960F0 : z3, (i6 & 131072) != 0 ? offer2.f95961G0 : z4, (i6 & 262144) != 0 ? offer2.f95962H0 : str, (i6 & 524288) != 0 ? offer2.f95963I0 : offerAvailability, (i6 & 1048576) != 0 ? offer2.f95964J0 : z5, (i6 & 2097152) != 0 ? offer2.f95965K0 : z6, (i6 & 4194304) != 0 ? offer2.f95966L0 : str2, (i6 & 8388608) != 0 ? offer2.f95967M0 : z7, (i6 & 16777216) != 0 ? offer2.f95968N0 : str3, (i6 & C9647e0.f26435a) != 0 ? offer2.f95969O0 : z8, (i6 & C8698y1.f23302n) != 0 ? offer2.f95970P0 : list2);
    }

    @C12579k
    /* renamed from: A */
    public final Prices mo117993A() {
        return this.f95982w;
    }

    @C12579k
    /* renamed from: B */
    public final Offer mo117994B(@C12579k OfferIdentifier offerIdentifier, @C12580l CategoryLimit categoryLimit, @C12580l OfferDiscount offerDiscount, @C12580l OfferDiscountPromotionCode offerDiscountPromotionCode, int i, int i2, int i3, @C12579k List<OfferMessage> list, @C12579k Prices prices, @C12580l Discount discount, @C12580l Double d, @C12580l Double d2, @C12579k Product product, int i4, boolean z, boolean z2, boolean z3, boolean z4, @C12579k String str, @C12579k OfferAvailability offerAvailability, boolean z5, boolean z6, @C12580l String str2, boolean z7, @C12579k String str3, boolean z8, @C12579k List<? extends Flags> list2) {
        OfferIdentifier offerIdentifier2 = offerIdentifier;
        Intrinsics.checkNotNullParameter(offerIdentifier2, "id");
        Intrinsics.checkNotNullParameter(list, "messages");
        Intrinsics.checkNotNullParameter(prices, "prices");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(str, "variableWeightSafetyMargin");
        Intrinsics.checkNotNullParameter(offerAvailability, C28534f.f69157h0);
        Intrinsics.checkNotNullParameter(str3, "labelHighLight");
        Intrinsics.checkNotNullParameter(list2, "flags");
        return new Offer(offerIdentifier2, categoryLimit, offerDiscount, offerDiscountPromotionCode, i, i2, i3, list, prices, discount, d, d2, product, i4, z, z2, z3, z4, str, offerAvailability, z5, z6, str2, z7, str3, z8, list2);
    }

    @C12579k
    /* renamed from: D */
    public final OfferAvailability mo117995D() {
        return this.f95963I0;
    }

    @C12580l
    /* renamed from: E */
    public final CategoryLimit mo117996E() {
        return this.f95975b;
    }

    @C12580l
    /* renamed from: F */
    public final OfferDiscount mo117997F() {
        return this.f95976c;
    }

    @C12580l
    /* renamed from: G */
    public final OfferDiscountPromotionCode mo117998G() {
        return this.f95977d;
    }

    @C12579k
    /* renamed from: H */
    public final List<Flags> mo117999H() {
        return this.f95970P0;
    }

    @C12580l
    /* renamed from: I */
    public final String mo118000I() {
        return this.f95966L0;
    }

    @C12579k
    /* renamed from: J */
    public final OfferIdentifier mo118001J() {
        return this.f95974a;
    }

    /* renamed from: K */
    public final int mo118002K() {
        return this.f95978e;
    }

    @C12579k
    /* renamed from: L */
    public final String mo118003L() {
        return this.f95968N0;
    }

    /* renamed from: M */
    public final int mo118004M() {
        return this.f95979f;
    }

    @C12579k
    /* renamed from: N */
    public final List<OfferMessage> mo118005N() {
        return this.f95981v;
    }

    /* renamed from: O */
    public final int mo118006O() {
        return this.f95980g;
    }

    @C12580l
    /* renamed from: P */
    public final Double mo118007P() {
        return this.f95985z;
    }

    @C12580l
    /* renamed from: Q */
    public final Double mo118008Q() {
        return this.f95984y;
    }

    @C12579k
    /* renamed from: R */
    public final Prices mo118009R() {
        return this.f95982w;
    }

    @C12579k
    /* renamed from: S */
    public final Product mo118010S() {
        return this.f95971X;
    }

    @C12580l
    /* renamed from: T */
    public final Discount mo118011T() {
        return this.f95983x;
    }

    /* renamed from: U */
    public final int mo118012U() {
        return this.f95972Y;
    }

    @C12579k
    /* renamed from: V */
    public final String mo118013V() {
        return this.f95962H0;
    }

    /* renamed from: W */
    public final boolean mo118014W() {
        return this.f95970P0.contains(Flags.CLUB_FAMILLE);
    }

    /* renamed from: X */
    public final boolean mo118015X() {
        return this.f95969O0;
    }

    /* renamed from: Y */
    public final boolean mo118016Y() {
        return this.f95959E0;
    }

    /* renamed from: Z */
    public final boolean mo118017Z() {
        return this.f95965K0;
    }

    @C12579k
    /* renamed from: a */
    public final OfferIdentifier mo118018a() {
        return this.f95974a;
    }

    /* renamed from: a0 */
    public final boolean mo118019a0() {
        return this.f95964J0;
    }

    @C12580l
    /* renamed from: b */
    public final Discount mo118020b() {
        return this.f95983x;
    }

    /* renamed from: b0 */
    public final boolean mo118021b0() {
        return this.f95967M0;
    }

    @C12580l
    /* renamed from: c */
    public final Double mo118022c() {
        return this.f95984y;
    }

    /* renamed from: c0 */
    public final boolean mo118023c0() {
        return this.f95973Z;
    }

    @C12580l
    /* renamed from: d */
    public final Double mo118024d() {
        return this.f95985z;
    }

    /* renamed from: d0 */
    public final boolean mo118025d0() {
        return this.f95960F0;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final Product mo118027e() {
        return this.f95971X;
    }

    /* renamed from: e0 */
    public final boolean mo118028e0() {
        return this.f95961G0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) obj;
        return Intrinsics.areEqual((Object) this.f95974a, (Object) offer.f95974a) && Intrinsics.areEqual((Object) this.f95975b, (Object) offer.f95975b) && Intrinsics.areEqual((Object) this.f95976c, (Object) offer.f95976c) && Intrinsics.areEqual((Object) this.f95977d, (Object) offer.f95977d) && this.f95978e == offer.f95978e && this.f95979f == offer.f95979f && this.f95980g == offer.f95980g && Intrinsics.areEqual((Object) this.f95981v, (Object) offer.f95981v) && Intrinsics.areEqual((Object) this.f95982w, (Object) offer.f95982w) && Intrinsics.areEqual((Object) this.f95983x, (Object) offer.f95983x) && Intrinsics.areEqual((Object) this.f95984y, (Object) offer.f95984y) && Intrinsics.areEqual((Object) this.f95985z, (Object) offer.f95985z) && Intrinsics.areEqual((Object) this.f95971X, (Object) offer.f95971X) && this.f95972Y == offer.f95972Y && this.f95973Z == offer.f95973Z && this.f95959E0 == offer.f95959E0 && this.f95960F0 == offer.f95960F0 && this.f95961G0 == offer.f95961G0 && Intrinsics.areEqual((Object) this.f95962H0, (Object) offer.f95962H0) && this.f95963I0 == offer.f95963I0 && this.f95964J0 == offer.f95964J0 && this.f95965K0 == offer.f95965K0 && Intrinsics.areEqual((Object) this.f95966L0, (Object) offer.f95966L0) && this.f95967M0 == offer.f95967M0 && Intrinsics.areEqual((Object) this.f95968N0, (Object) offer.f95968N0) && this.f95969O0 == offer.f95969O0 && Intrinsics.areEqual((Object) this.f95970P0, (Object) offer.f95970P0);
    }

    /* renamed from: f */
    public final int mo118030f() {
        return this.f95972Y;
    }

    /* renamed from: g */
    public final boolean mo118031g() {
        return this.f95973Z;
    }

    /* renamed from: h */
    public final boolean mo118032h() {
        return this.f95959E0;
    }

    public int hashCode() {
        int hashCode = this.f95974a.hashCode() * 31;
        CategoryLimit categoryLimit = this.f95975b;
        int i = 0;
        int hashCode2 = (hashCode + (categoryLimit == null ? 0 : categoryLimit.hashCode())) * 31;
        OfferDiscount offerDiscount = this.f95976c;
        int hashCode3 = (hashCode2 + (offerDiscount == null ? 0 : offerDiscount.hashCode())) * 31;
        OfferDiscountPromotionCode offerDiscountPromotionCode = this.f95977d;
        int hashCode4 = (((((((((((hashCode3 + (offerDiscountPromotionCode == null ? 0 : offerDiscountPromotionCode.hashCode())) * 31) + Integer.hashCode(this.f95978e)) * 31) + Integer.hashCode(this.f95979f)) * 31) + Integer.hashCode(this.f95980g)) * 31) + this.f95981v.hashCode()) * 31) + this.f95982w.hashCode()) * 31;
        Discount discount = this.f95983x;
        int hashCode5 = (hashCode4 + (discount == null ? 0 : discount.hashCode())) * 31;
        Double d = this.f95984y;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f95985z;
        int hashCode7 = (((((hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31) + this.f95971X.hashCode()) * 31) + Integer.hashCode(this.f95972Y)) * 31;
        boolean z = this.f95973Z;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f95959E0;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f95960F0;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f95961G0;
        if (z5) {
            z5 = true;
        }
        int hashCode8 = (((((i4 + (z5 ? 1 : 0)) * 31) + this.f95962H0.hashCode()) * 31) + this.f95963I0.hashCode()) * 31;
        boolean z6 = this.f95964J0;
        if (z6) {
            z6 = true;
        }
        int i5 = (hashCode8 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f95965K0;
        if (z7) {
            z7 = true;
        }
        int i6 = (i5 + (z7 ? 1 : 0)) * 31;
        String str = this.f95966L0;
        if (str != null) {
            i = str.hashCode();
        }
        int i7 = (i6 + i) * 31;
        boolean z8 = this.f95967M0;
        if (z8) {
            z8 = true;
        }
        int hashCode9 = (((i7 + (z8 ? 1 : 0)) * 31) + this.f95968N0.hashCode()) * 31;
        boolean z9 = this.f95969O0;
        if (!z9) {
            z2 = z9;
        }
        return ((hashCode9 + (z2 ? 1 : 0)) * 31) + this.f95970P0.hashCode();
    }

    /* renamed from: i */
    public final boolean mo118034i() {
        return this.f95960F0;
    }

    /* renamed from: j */
    public final boolean mo118035j() {
        return this.f95961G0;
    }

    @C12579k
    /* renamed from: k */
    public final String mo118036k() {
        return this.f95962H0;
    }

    @C12580l
    /* renamed from: l */
    public final CategoryLimit mo118037l() {
        return this.f95975b;
    }

    @C12579k
    /* renamed from: m */
    public final OfferAvailability mo118038m() {
        return this.f95963I0;
    }

    /* renamed from: n */
    public final boolean mo118039n() {
        return this.f95964J0;
    }

    /* renamed from: o */
    public final boolean mo118040o() {
        return this.f95965K0;
    }

    @C12580l
    /* renamed from: p */
    public final String mo118041p() {
        return this.f95966L0;
    }

    /* renamed from: q */
    public final boolean mo118042q() {
        return this.f95967M0;
    }

    @C12579k
    /* renamed from: r */
    public final String mo118043r() {
        return this.f95968N0;
    }

    /* renamed from: s */
    public final boolean mo118044s() {
        return this.f95969O0;
    }

    @C12579k
    /* renamed from: t */
    public final List<Flags> mo118045t() {
        return this.f95970P0;
    }

    @C12579k
    public String toString() {
        OfferIdentifier offerIdentifier = this.f95974a;
        CategoryLimit categoryLimit = this.f95975b;
        OfferDiscount offerDiscount = this.f95976c;
        OfferDiscountPromotionCode offerDiscountPromotionCode = this.f95977d;
        int i = this.f95978e;
        int i2 = this.f95979f;
        int i3 = this.f95980g;
        List<OfferMessage> list = this.f95981v;
        Prices prices = this.f95982w;
        Discount discount = this.f95983x;
        Double d = this.f95984y;
        Double d2 = this.f95985z;
        Product product = this.f95971X;
        int i4 = this.f95972Y;
        boolean z = this.f95973Z;
        boolean z2 = this.f95959E0;
        boolean z3 = this.f95960F0;
        boolean z4 = this.f95961G0;
        String str = this.f95962H0;
        OfferAvailability offerAvailability = this.f95963I0;
        boolean z5 = this.f95964J0;
        boolean z6 = this.f95965K0;
        String str2 = this.f95966L0;
        boolean z7 = this.f95967M0;
        String str3 = this.f95968N0;
        boolean z8 = this.f95969O0;
        List<Flags> list2 = this.f95970P0;
        return "Offer(id=" + offerIdentifier + ", categoryLimit=" + categoryLimit + ", discount=" + offerDiscount + ", discountPromoCode=" + offerDiscountPromotionCode + ", incrementQuantity=" + i + ", maxSellingQuantity=" + i2 + ", minSellingQuantity=" + i3 + ", messages=" + list + ", prices=" + prices + ", promo=" + discount + ", priceDiscountAmount=" + d + ", offerTotalAmount=" + d2 + ", product=" + product + ", quantity=" + i4 + ", isSyncingInBasket=" + z + ", isInShoppingList=" + z2 + ", isSyncingInShoppingList=" + z3 + ", isVariableWeight=" + z4 + ", variableWeightSafetyMargin=" + str + ", availability=" + offerAvailability + ", isPurchasable=" + z5 + ", isIncontournable=" + z6 + ", freshnessGaranteed=" + str2 + ", isSponsored=" + z7 + ", labelHighLight=" + str3 + ", isDigitalCard=" + z8 + ", flags=" + list2 + ")";
    }

    @C12580l
    /* renamed from: u */
    public final OfferDiscount mo118047u() {
        return this.f95976c;
    }

    @C12580l
    /* renamed from: v */
    public final OfferDiscountPromotionCode mo118048v() {
        return this.f95977d;
    }

    /* renamed from: w */
    public final int mo118049w() {
        return this.f95978e;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.f95974a.writeToParcel(parcel, i);
        CategoryLimit categoryLimit = this.f95975b;
        if (categoryLimit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            categoryLimit.writeToParcel(parcel, i);
        }
        OfferDiscount offerDiscount = this.f95976c;
        if (offerDiscount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerDiscount.writeToParcel(parcel, i);
        }
        OfferDiscountPromotionCode offerDiscountPromotionCode = this.f95977d;
        if (offerDiscountPromotionCode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offerDiscountPromotionCode.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f95978e);
        parcel.writeInt(this.f95979f);
        parcel.writeInt(this.f95980g);
        List<OfferMessage> list = this.f95981v;
        parcel.writeInt(list.size());
        for (OfferMessage writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        this.f95982w.writeToParcel(parcel, i);
        Discount discount = this.f95983x;
        if (discount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discount.writeToParcel(parcel, i);
        }
        Double d = this.f95984y;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f95985z;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        this.f95971X.writeToParcel(parcel, i);
        parcel.writeInt(this.f95972Y);
        parcel.writeInt(this.f95973Z ? 1 : 0);
        parcel.writeInt(this.f95959E0 ? 1 : 0);
        parcel.writeInt(this.f95960F0 ? 1 : 0);
        parcel.writeInt(this.f95961G0 ? 1 : 0);
        parcel.writeString(this.f95962H0);
        parcel.writeString(this.f95963I0.name());
        parcel.writeInt(this.f95964J0 ? 1 : 0);
        parcel.writeInt(this.f95965K0 ? 1 : 0);
        parcel.writeString(this.f95966L0);
        parcel.writeInt(this.f95967M0 ? 1 : 0);
        parcel.writeString(this.f95968N0);
        parcel.writeInt(this.f95969O0 ? 1 : 0);
        List<Flags> list2 = this.f95970P0;
        parcel.writeInt(list2.size());
        for (Flags name : list2) {
            parcel.writeString(name.name());
        }
    }

    /* renamed from: x */
    public final int mo118051x() {
        return this.f95979f;
    }

    /* renamed from: y */
    public final int mo118052y() {
        return this.f95980g;
    }

    @C12579k
    /* renamed from: z */
    public final List<OfferMessage> mo118053z() {
        return this.f95981v;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Offer(OfferIdentifier offerIdentifier, CategoryLimit categoryLimit, OfferDiscount offerDiscount, OfferDiscountPromotionCode offerDiscountPromotionCode, int i, int i2, int i3, List list, Prices prices, Discount discount, Double d, Double d2, Product product, int i4, boolean z, boolean z2, boolean z3, boolean z4, String str, OfferAvailability offerAvailability, boolean z5, boolean z6, String str2, boolean z7, String str3, boolean z8, List list2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(offerIdentifier, categoryLimit, offerDiscount, offerDiscountPromotionCode, i, i2, i3, list, prices, discount, d, d2, product, i4, z, z2, z3, z4, (i5 & 262144) != 0 ? C38065b.f96182f : str, (i5 & 524288) != 0 ? OfferAvailability.UNKNOWN : offerAvailability, z5, z6, str2, z7, str3, (i5 & C9647e0.f26435a) != 0 ? false : z8, list2);
    }
}
