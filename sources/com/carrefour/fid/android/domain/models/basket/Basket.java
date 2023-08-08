package com.carrefour.fid.android.domain.models.basket;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.interactors.service.StoreId;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferDiscount;
import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import com.carrefour.fid.android.presentation.p035ui.home.shop.OnlineStoreShopFragment;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\b\b\u0018\u0000 2\u00020\u0001:\u0001KBø\u0001\u0012\b\b\u0002\u0010+\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010.\u001a\u00020\t\u0012\b\b\u0002\u0010/\u001a\u00020\f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u00103\u001a\u00020\u0014\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0016\u0012\u0014\b\u0002\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0018\u0012\b\b\u0002\u00106\u001a\u00020\u001b\u0012\b\b\u0002\u00107\u001a\u00020\u001d\u0012\b\b\u0002\u00108\u001a\u00020\u001f\u0012\b\b\u0002\u00109\u001a\u00020!\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0014\u0012\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010)ø\u0001\u0002¢\u0006\u0004\b}\u0010~J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003J\u0019\u0010\n\u001a\u00020\tHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004HÆ\u0003J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u0018HÆ\u0003J\u0019\u0010\u001c\u001a\u00020\u001bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u001dHÆ\u0003J\t\u0010 \u001a\u00020\u001fHÆ\u0003J\u0019\u0010\"\u001a\u00020!HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\"\u0010\u000bJ\u000b\u0010$\u001a\u0004\u0018\u00010#HÆ\u0003J\u0012\u0010%\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0004HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010)HÆ\u0003J\u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00022\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u00103\u001a\u00020\u00142\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00162\u0014\b\u0002\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u00182\b\b\u0002\u00106\u001a\u00020\u001b2\b\b\u0002\u00107\u001a\u00020\u001d2\b\b\u0002\u00108\u001a\u00020\u001f2\b\b\u0002\u00109\u001a\u00020!2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020'0\u00042\n\b\u0002\u0010=\u001a\u0004\u0018\u00010)HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b>\u0010?J\t\u0010@\u001a\u00020\u0019HÖ\u0001J\t\u0010A\u001a\u00020\u0014HÖ\u0001J\u0013\u0010D\u001a\u00020\f2\b\u0010C\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010E\u001a\u00020\u0014HÖ\u0001J\u0019\u0010J\u001a\u00020I2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\u0014HÖ\u0001R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010QR\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010O\u001a\u0004\bR\u0010QR \u0010.\u001a\u00020\t8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010S\u001a\u0004\bT\u0010\u000bR\u0017\u0010/\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010U\u001a\u0004\bV\u0010WR\u0019\u00100\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001e\u0010X\u001a\u0004\bY\u0010ZR\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0006¢\u0006\f\n\u0004\b \u0010O\u001a\u0004\b[\u0010QR\"\u00102\u001a\u0004\u0018\u00010\u00128\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\\\u0010S\u001a\u0004\b]\u0010\u000bR\u0017\u00103\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bM\u0010^\u001a\u0004\b_\u0010`R\u0019\u00104\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bP\u0010a\u001a\u0004\bb\u0010cR#\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00140\u00188\u0006¢\u0006\f\n\u0004\bR\u0010d\u001a\u0004\be\u0010fR \u00106\u001a\u00020\u001b8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bT\u0010S\u001a\u0004\bg\u0010\u000bR\u0017\u00107\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\b^\u0010jR\u0017\u00108\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR \u00109\u001a\u00020!8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bU\u0010S\u001a\u0004\bo\u0010\u000bR\u0019\u0010:\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0019\u0010;\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010&R\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020'0\u00048\u0006¢\u0006\f\n\u0004\bw\u0010O\u001a\u0004\bx\u0010QR\u0019\u0010=\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/basket/Basket;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/basket/BasketAmounts;", "b", "", "Lcom/carrefour/fid/android/domain/models/offer/OfferDiscount;", "m", "Lcom/carrefour/fid/android/domain/models/basket/BasketErrorMessage;", "n", "Lcom/carrefour/fid/android/domain/models/service/models/FacilityServiceId;", "o", "()Ljava/lang/String;", "", "p", "Lcom/carrefour/fid/android/domain/models/basket/BasketLoyaltyCard;", "q", "Lcom/carrefour/fid/android/domain/models/offer/Offer;", "r", "Lcom/carrefour/fid/android/domain/models/basket/PickingEligibility;", "s", "", "t", "Lcom/carrefour/fid/android/domain/models/basket/BasketPromotionCode;", "c", "", "", "d", "Lcom/carrefour/fid/android/domain/models/basket/BasketReference;", "e", "Lcom/carrefour/fid/android/domain/models/basket/BasketServiceType;", "f", "Lcom/carrefour/fid/android/domain/models/basket/BasketSlot;", "g", "Lcom/carrefour/fid/android/domain/interactors/service/StoreId;", "h", "Lcom/carrefour/fid/android/domain/models/basket/BasketType;", "i", "j", "()Ljava/lang/Integer;", "Lcom/carrefour/fid/android/domain/models/basket/BasketService;", "k", "Lcom/carrefour/fid/android/domain/models/basket/BasketReturnableBags;", "l", "amounts", "discounts", "errorMessages", "facilityServiceId", "isEntirelyNonFood", "loyaltyCard", "offers", "pickingEligibility", "productCount", "promotionCode", "quantities", "reference", "serviceType", "slot", "storeId", "type", "stampsCount", "services", "returnableBags", "u", "(Lcom/carrefour/fid/android/domain/models/basket/BasketAmounts;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLcom/carrefour/fid/android/domain/models/basket/BasketLoyaltyCard;Ljava/util/List;Ljava/lang/String;ILcom/carrefour/fid/android/domain/models/basket/BasketPromotionCode;Ljava/util/Map;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/basket/BasketServiceType;Lcom/carrefour/fid/android/domain/models/basket/BasketSlot;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/basket/BasketType;Ljava/lang/Integer;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/basket/BasketReturnableBags;)Lcom/carrefour/fid/android/domain/models/basket/Basket;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "a", "Lcom/carrefour/fid/android/domain/models/basket/BasketAmounts;", "w", "()Lcom/carrefour/fid/android/domain/models/basket/BasketAmounts;", "Ljava/util/List;", "x", "()Ljava/util/List;", "y", "Ljava/lang/String;", "z", "Z", "O", "()Z", "Lcom/carrefour/fid/android/domain/models/basket/BasketLoyaltyCard;", "A", "()Lcom/carrefour/fid/android/domain/models/basket/BasketLoyaltyCard;", "B", "v", "C", "I", "D", "()I", "Lcom/carrefour/fid/android/domain/models/basket/BasketPromotionCode;", "E", "()Lcom/carrefour/fid/android/domain/models/basket/BasketPromotionCode;", "Ljava/util/Map;", "F", "()Ljava/util/Map;", "G", "X", "Lcom/carrefour/fid/android/domain/models/basket/BasketServiceType;", "()Lcom/carrefour/fid/android/domain/models/basket/BasketServiceType;", "Y", "Lcom/carrefour/fid/android/domain/models/basket/BasketSlot;", "K", "()Lcom/carrefour/fid/android/domain/models/basket/BasketSlot;", "M", "E0", "Lcom/carrefour/fid/android/domain/models/basket/BasketType;", "N", "()Lcom/carrefour/fid/android/domain/models/basket/BasketType;", "F0", "Ljava/lang/Integer;", "L", "G0", "J", "H0", "Lcom/carrefour/fid/android/domain/models/basket/BasketReturnableBags;", "H", "()Lcom/carrefour/fid/android/domain/models/basket/BasketReturnableBags;", "<init>", "(Lcom/carrefour/fid/android/domain/models/basket/BasketAmounts;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLcom/carrefour/fid/android/domain/models/basket/BasketLoyaltyCard;Ljava/util/List;Ljava/lang/String;ILcom/carrefour/fid/android/domain/models/basket/BasketPromotionCode;Ljava/util/Map;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/basket/BasketServiceType;Lcom/carrefour/fid/android/domain/models/basket/BasketSlot;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/basket/BasketType;Ljava/lang/Integer;Ljava/util/List;Lcom/carrefour/fid/android/domain/models/basket/BasketReturnableBags;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "I0", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class Basket implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Basket> CREATOR = new C37956b();
    @C12579k

    /* renamed from: I0 */
    public static final C37955a f95463I0 = new C37955a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: J0 */
    public static final Basket f95464J0 = new Basket((BasketAmounts) null, (List) null, (List) null, (String) null, false, (BasketLoyaltyCard) null, (List) null, (String) null, 0, (BasketPromotionCode) null, (Map) null, (String) null, (BasketServiceType) null, (BasketSlot) null, (String) null, (BasketType) null, (Integer) null, (List) null, (BasketReturnableBags) null, 524287, (DefaultConstructorMarker) null);
    @C12580l

    /* renamed from: E0 */
    public final BasketType f95465E0;
    @C12580l

    /* renamed from: F0 */
    public final Integer f95466F0;
    @C12579k

    /* renamed from: G0 */
    public final List<BasketService> f95467G0;
    @C12580l

    /* renamed from: H0 */
    public final BasketReturnableBags f95468H0;
    @C12579k

    /* renamed from: X */
    public final BasketServiceType f95469X;
    @C12579k

    /* renamed from: Y */
    public final BasketSlot f95470Y;
    @C12579k

    /* renamed from: Z */
    public final String f95471Z;
    @C12579k

    /* renamed from: a */
    public final BasketAmounts f95472a;
    @C12579k

    /* renamed from: b */
    public final List<OfferDiscount> f95473b;
    @C12579k

    /* renamed from: c */
    public final List<BasketErrorMessage> f95474c;
    @C12579k

    /* renamed from: d */
    public final String f95475d;

    /* renamed from: e */
    public final boolean f95476e;
    @C12580l

    /* renamed from: f */
    public final BasketLoyaltyCard f95477f;
    @C12579k

    /* renamed from: g */
    public final List<Offer> f95478g;
    @C12580l

    /* renamed from: v */
    public final String f95479v;

    /* renamed from: w */
    public final int f95480w;
    @C12580l

    /* renamed from: x */
    public final BasketPromotionCode f95481x;
    @C12579k

    /* renamed from: y */
    public final Map<String, Integer> f95482y;
    @C12579k

    /* renamed from: z */
    public final String f95483z;

    /* renamed from: com.carrefour.fid.android.domain.models.basket.Basket$a */
    public static final class C37955a {
        public /* synthetic */ C37955a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final Basket mo116860a() {
            return Basket.f95464J0;
        }

        public C37955a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.basket.Basket$b */
    public static final class C37956b implements Parcelable.Creator<Basket> {
        @C12579k
        /* renamed from: a */
        public final Basket createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            BasketAmounts createFromParcel = BasketAmounts.CREATOR.createFromParcel(parcel2);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(OfferDiscount.CREATOR.createFromParcel(parcel2));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(BasketErrorMessage.CREATOR.createFromParcel(parcel2));
            }
            String j = FacilityServiceId.CREATOR.createFromParcel(parcel2).mo119111j();
            boolean z = parcel.readInt() != 0;
            BasketLoyaltyCard createFromParcel2 = parcel.readInt() == 0 ? null : BasketLoyaltyCard.CREATOR.createFromParcel(parcel2);
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            for (int i3 = 0; i3 != readInt3; i3++) {
                arrayList3.add(Offer.CREATOR.createFromParcel(parcel2));
            }
            PickingEligibility createFromParcel3 = parcel.readInt() == 0 ? null : PickingEligibility.CREATOR.createFromParcel(parcel2);
            String k = createFromParcel3 != null ? createFromParcel3.mo117014k() : null;
            int readInt4 = parcel.readInt();
            BasketPromotionCode createFromParcel4 = parcel.readInt() == 0 ? null : BasketPromotionCode.CREATOR.createFromParcel(parcel2);
            int readInt5 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt5);
            for (int i4 = 0; i4 != readInt5; i4++) {
                linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            String j2 = BasketReference.CREATOR.createFromParcel(parcel2).mo116951j();
            BasketServiceType valueOf = BasketServiceType.valueOf(parcel.readString());
            BasketSlot createFromParcel5 = BasketSlot.CREATOR.createFromParcel(parcel2);
            String j3 = StoreId.CREATOR.createFromParcel(parcel2).mo115205j();
            BasketType valueOf2 = parcel.readInt() == 0 ? null : BasketType.valueOf(parcel.readString());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int readInt6 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt6);
            int i5 = 0;
            while (i5 != readInt6) {
                arrayList4.add(parcel2.readParcelable(Basket.class.getClassLoader()));
                i5++;
                readInt6 = readInt6;
            }
            return new Basket(createFromParcel, arrayList, arrayList2, j, z, createFromParcel2, arrayList3, k, readInt4, createFromParcel4, linkedHashMap, j2, valueOf, createFromParcel5, j3, valueOf2, valueOf3, arrayList4, parcel.readInt() == 0 ? null : BasketReturnableBags.CREATOR.createFromParcel(parcel2), (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: b */
        public final Basket[] newArray(int i) {
            return new Basket[i];
        }
    }

    public /* synthetic */ Basket(BasketAmounts basketAmounts, List list, List list2, String str, boolean z, BasketLoyaltyCard basketLoyaltyCard, List list3, String str2, int i, BasketPromotionCode basketPromotionCode, Map map, String str3, BasketServiceType basketServiceType, BasketSlot basketSlot, String str4, BasketType basketType, Integer num, List list4, BasketReturnableBags basketReturnableBags, DefaultConstructorMarker defaultConstructorMarker) {
        this(basketAmounts, list, list2, str, z, basketLoyaltyCard, list3, str2, i, basketPromotionCode, map, str3, basketServiceType, basketSlot, str4, basketType, num, list4, basketReturnableBags);
    }

    /* renamed from: v */
    public static /* synthetic */ Basket m155991v(Basket basket, BasketAmounts basketAmounts, List list, List list2, String str, boolean z, BasketLoyaltyCard basketLoyaltyCard, List list3, String str2, int i, BasketPromotionCode basketPromotionCode, Map map, String str3, BasketServiceType basketServiceType, BasketSlot basketSlot, String str4, BasketType basketType, Integer num, List list4, BasketReturnableBags basketReturnableBags, int i2, Object obj) {
        Basket basket2 = basket;
        int i3 = i2;
        return basket.mo116854u((i3 & 1) != 0 ? basket2.f95472a : basketAmounts, (i3 & 2) != 0 ? basket2.f95473b : list, (i3 & 4) != 0 ? basket2.f95474c : list2, (i3 & 8) != 0 ? basket2.f95475d : str, (i3 & 16) != 0 ? basket2.f95476e : z, (i3 & 32) != 0 ? basket2.f95477f : basketLoyaltyCard, (i3 & 64) != 0 ? basket2.f95478g : list3, (i3 & 128) != 0 ? basket2.f95479v : str2, (i3 & 256) != 0 ? basket2.f95480w : i, (i3 & 512) != 0 ? basket2.f95481x : basketPromotionCode, (i3 & 1024) != 0 ? basket2.f95482y : map, (i3 & 2048) != 0 ? basket2.f95483z : str3, (i3 & 4096) != 0 ? basket2.f95469X : basketServiceType, (i3 & 8192) != 0 ? basket2.f95470Y : basketSlot, (i3 & 16384) != 0 ? basket2.f95471Z : str4, (i3 & 32768) != 0 ? basket2.f95465E0 : basketType, (i3 & 65536) != 0 ? basket2.f95466F0 : num, (i3 & 131072) != 0 ? basket2.f95467G0 : list4, (i3 & 262144) != 0 ? basket2.f95468H0 : basketReturnableBags);
    }

    @C12580l
    /* renamed from: A */
    public final BasketLoyaltyCard mo116816A() {
        return this.f95477f;
    }

    @C12579k
    /* renamed from: B */
    public final List<Offer> mo116817B() {
        return this.f95478g;
    }

    @C12580l
    /* renamed from: C */
    public final String mo116818C() {
        return this.f95479v;
    }

    /* renamed from: D */
    public final int mo116819D() {
        return this.f95480w;
    }

    @C12580l
    /* renamed from: E */
    public final BasketPromotionCode mo116820E() {
        return this.f95481x;
    }

    @C12579k
    /* renamed from: F */
    public final Map<String, Integer> mo116821F() {
        return this.f95482y;
    }

    @C12579k
    /* renamed from: G */
    public final String mo116822G() {
        return this.f95483z;
    }

    @C12580l
    /* renamed from: H */
    public final BasketReturnableBags mo116823H() {
        return this.f95468H0;
    }

    @C12579k
    /* renamed from: I */
    public final BasketServiceType mo116824I() {
        return this.f95469X;
    }

    @C12579k
    /* renamed from: J */
    public final List<BasketService> mo116825J() {
        return this.f95467G0;
    }

    @C12579k
    /* renamed from: K */
    public final BasketSlot mo116826K() {
        return this.f95470Y;
    }

    @C12580l
    /* renamed from: L */
    public final Integer mo116827L() {
        return this.f95466F0;
    }

    @C12579k
    /* renamed from: M */
    public final String mo116828M() {
        return this.f95471Z;
    }

    @C12580l
    /* renamed from: N */
    public final BasketType mo116829N() {
        return this.f95465E0;
    }

    /* renamed from: O */
    public final boolean mo116830O() {
        return this.f95476e;
    }

    @C12579k
    /* renamed from: b */
    public final BasketAmounts mo116831b() {
        return this.f95472a;
    }

    @C12580l
    /* renamed from: c */
    public final BasketPromotionCode mo116832c() {
        return this.f95481x;
    }

    @C12579k
    /* renamed from: d */
    public final Map<String, Integer> mo116833d() {
        return this.f95482y;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo116835e() {
        return this.f95483z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d7 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@org.jetbrains.annotations.C12580l java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.carrefour.fid.android.domain.models.basket.Basket
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.carrefour.fid.android.domain.models.basket.Basket r5 = (com.carrefour.fid.android.domain.models.basket.Basket) r5
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r1 = r4.f95472a
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r3 = r5.f95472a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0017
            return r2
        L_0x0017:
            java.util.List<com.carrefour.fid.android.domain.models.offer.OfferDiscount> r1 = r4.f95473b
            java.util.List<com.carrefour.fid.android.domain.models.offer.OfferDiscount> r3 = r5.f95473b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0022
            return r2
        L_0x0022:
            java.util.List<com.carrefour.fid.android.domain.models.basket.BasketErrorMessage> r1 = r4.f95474c
            java.util.List<com.carrefour.fid.android.domain.models.basket.BasketErrorMessage> r3 = r5.f95474c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x002d
            return r2
        L_0x002d:
            java.lang.String r1 = r4.f95475d
            java.lang.String r3 = r5.f95475d
            boolean r1 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157962f(r1, r3)
            if (r1 != 0) goto L_0x0038
            return r2
        L_0x0038:
            boolean r1 = r4.f95476e
            boolean r3 = r5.f95476e
            if (r1 == r3) goto L_0x003f
            return r2
        L_0x003f:
            com.carrefour.fid.android.domain.models.basket.BasketLoyaltyCard r1 = r4.f95477f
            com.carrefour.fid.android.domain.models.basket.BasketLoyaltyCard r3 = r5.f95477f
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x004a
            return r2
        L_0x004a:
            java.util.List<com.carrefour.fid.android.domain.models.offer.Offer> r1 = r4.f95478g
            java.util.List<com.carrefour.fid.android.domain.models.offer.Offer> r3 = r5.f95478g
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0055
            return r2
        L_0x0055:
            java.lang.String r1 = r4.f95479v
            java.lang.String r3 = r5.f95479v
            if (r1 != 0) goto L_0x005f
            if (r3 != 0) goto L_0x0061
            r1 = r0
            goto L_0x0067
        L_0x005f:
            if (r3 != 0) goto L_0x0063
        L_0x0061:
            r1 = r2
            goto L_0x0067
        L_0x0063:
            boolean r1 = com.carrefour.fid.android.domain.models.basket.PickingEligibility.m156146f(r1, r3)
        L_0x0067:
            if (r1 != 0) goto L_0x006a
            return r2
        L_0x006a:
            int r1 = r4.f95480w
            int r3 = r5.f95480w
            if (r1 == r3) goto L_0x0071
            return r2
        L_0x0071:
            com.carrefour.fid.android.domain.models.basket.BasketPromotionCode r1 = r4.f95481x
            com.carrefour.fid.android.domain.models.basket.BasketPromotionCode r3 = r5.f95481x
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x007c
            return r2
        L_0x007c:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r4.f95482y
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r5.f95482y
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0087
            return r2
        L_0x0087:
            java.lang.String r1 = r4.f95483z
            java.lang.String r3 = r5.f95483z
            boolean r1 = com.carrefour.fid.android.domain.models.basket.BasketReference.m156097f(r1, r3)
            if (r1 != 0) goto L_0x0092
            return r2
        L_0x0092:
            com.carrefour.fid.android.domain.models.basket.BasketServiceType r1 = r4.f95469X
            com.carrefour.fid.android.domain.models.basket.BasketServiceType r3 = r5.f95469X
            if (r1 == r3) goto L_0x0099
            return r2
        L_0x0099:
            com.carrefour.fid.android.domain.models.basket.BasketSlot r1 = r4.f95470Y
            com.carrefour.fid.android.domain.models.basket.BasketSlot r3 = r5.f95470Y
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x00a4
            return r2
        L_0x00a4:
            java.lang.String r1 = r4.f95471Z
            java.lang.String r3 = r5.f95471Z
            boolean r1 = com.carrefour.fid.android.domain.interactors.service.StoreId.m154973f(r1, r3)
            if (r1 != 0) goto L_0x00af
            return r2
        L_0x00af:
            com.carrefour.fid.android.domain.models.basket.BasketType r1 = r4.f95465E0
            com.carrefour.fid.android.domain.models.basket.BasketType r3 = r5.f95465E0
            if (r1 == r3) goto L_0x00b6
            return r2
        L_0x00b6:
            java.lang.Integer r1 = r4.f95466F0
            java.lang.Integer r3 = r5.f95466F0
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x00c1
            return r2
        L_0x00c1:
            java.util.List<com.carrefour.fid.android.domain.models.basket.BasketService> r1 = r4.f95467G0
            java.util.List<com.carrefour.fid.android.domain.models.basket.BasketService> r3 = r5.f95467G0
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x00cc
            return r2
        L_0x00cc:
            com.carrefour.fid.android.domain.models.basket.BasketReturnableBags r1 = r4.f95468H0
            com.carrefour.fid.android.domain.models.basket.BasketReturnableBags r5 = r5.f95468H0
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r5)
            if (r5 != 0) goto L_0x00d7
            return r2
        L_0x00d7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.basket.Basket.equals(java.lang.Object):boolean");
    }

    @C12579k
    /* renamed from: f */
    public final BasketServiceType mo116837f() {
        return this.f95469X;
    }

    @C12579k
    /* renamed from: g */
    public final BasketSlot mo116838g() {
        return this.f95470Y;
    }

    @C12579k
    /* renamed from: h */
    public final String mo116839h() {
        return this.f95471Z;
    }

    public int hashCode() {
        int hashCode = ((((((this.f95472a.hashCode() * 31) + this.f95473b.hashCode()) * 31) + this.f95474c.hashCode()) * 31) + FacilityServiceId.m157963h(this.f95475d)) * 31;
        boolean z = this.f95476e;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        BasketLoyaltyCard basketLoyaltyCard = this.f95477f;
        int i2 = 0;
        int hashCode2 = (((i + (basketLoyaltyCard == null ? 0 : basketLoyaltyCard.hashCode())) * 31) + this.f95478g.hashCode()) * 31;
        String str = this.f95479v;
        int h = (((hashCode2 + (str == null ? 0 : PickingEligibility.m156147h(str))) * 31) + Integer.hashCode(this.f95480w)) * 31;
        BasketPromotionCode basketPromotionCode = this.f95481x;
        int hashCode3 = (((((((((((h + (basketPromotionCode == null ? 0 : basketPromotionCode.hashCode())) * 31) + this.f95482y.hashCode()) * 31) + BasketReference.m156098h(this.f95483z)) * 31) + this.f95469X.hashCode()) * 31) + this.f95470Y.hashCode()) * 31) + StoreId.m154974h(this.f95471Z)) * 31;
        BasketType basketType = this.f95465E0;
        int hashCode4 = (hashCode3 + (basketType == null ? 0 : basketType.hashCode())) * 31;
        Integer num = this.f95466F0;
        int hashCode5 = (((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.f95467G0.hashCode()) * 31;
        BasketReturnableBags basketReturnableBags = this.f95468H0;
        if (basketReturnableBags != null) {
            i2 = basketReturnableBags.hashCode();
        }
        return hashCode5 + i2;
    }

    @C12580l
    /* renamed from: i */
    public final BasketType mo116841i() {
        return this.f95465E0;
    }

    @C12580l
    /* renamed from: j */
    public final Integer mo116842j() {
        return this.f95466F0;
    }

    @C12579k
    /* renamed from: k */
    public final List<BasketService> mo116843k() {
        return this.f95467G0;
    }

    @C12580l
    /* renamed from: l */
    public final BasketReturnableBags mo116844l() {
        return this.f95468H0;
    }

    @C12579k
    /* renamed from: m */
    public final List<OfferDiscount> mo116845m() {
        return this.f95473b;
    }

    @C12579k
    /* renamed from: n */
    public final List<BasketErrorMessage> mo116846n() {
        return this.f95474c;
    }

    @C12579k
    /* renamed from: o */
    public final String mo116847o() {
        return this.f95475d;
    }

    /* renamed from: p */
    public final boolean mo116848p() {
        return this.f95476e;
    }

    @C12580l
    /* renamed from: q */
    public final BasketLoyaltyCard mo116849q() {
        return this.f95477f;
    }

    @C12579k
    /* renamed from: r */
    public final List<Offer> mo116850r() {
        return this.f95478g;
    }

    @C12580l
    /* renamed from: s */
    public final String mo116851s() {
        return this.f95479v;
    }

    /* renamed from: t */
    public final int mo116852t() {
        return this.f95480w;
    }

    @C12579k
    public String toString() {
        BasketAmounts basketAmounts = this.f95472a;
        List<OfferDiscount> list = this.f95473b;
        List<BasketErrorMessage> list2 = this.f95474c;
        String i = FacilityServiceId.m157964i(this.f95475d);
        boolean z = this.f95476e;
        BasketLoyaltyCard basketLoyaltyCard = this.f95477f;
        List<Offer> list3 = this.f95478g;
        String str = this.f95479v;
        String j = str == null ? "null" : PickingEligibility.m156149j(str);
        int i2 = this.f95480w;
        BasketPromotionCode basketPromotionCode = this.f95481x;
        Map<String, Integer> map = this.f95482y;
        String i3 = BasketReference.m156099i(this.f95483z);
        BasketServiceType basketServiceType = this.f95469X;
        BasketSlot basketSlot = this.f95470Y;
        String i4 = StoreId.m154975i(this.f95471Z);
        BasketType basketType = this.f95465E0;
        Integer num = this.f95466F0;
        List<BasketService> list4 = this.f95467G0;
        BasketReturnableBags basketReturnableBags = this.f95468H0;
        return "Basket(amounts=" + basketAmounts + ", discounts=" + list + ", errorMessages=" + list2 + ", facilityServiceId=" + i + ", isEntirelyNonFood=" + z + ", loyaltyCard=" + basketLoyaltyCard + ", offers=" + list3 + ", pickingEligibility=" + j + ", productCount=" + i2 + ", promotionCode=" + basketPromotionCode + ", quantities=" + map + ", reference=" + i3 + ", serviceType=" + basketServiceType + ", slot=" + basketSlot + ", storeId=" + i4 + ", type=" + basketType + ", stampsCount=" + num + ", services=" + list4 + ", returnableBags=" + basketReturnableBags + ")";
    }

    @C12579k
    /* renamed from: u */
    public final Basket mo116854u(@C12579k BasketAmounts basketAmounts, @C12579k List<OfferDiscount> list, @C12579k List<BasketErrorMessage> list2, @C12579k String str, boolean z, @C12580l BasketLoyaltyCard basketLoyaltyCard, @C12579k List<Offer> list3, @C12580l String str2, int i, @C12580l BasketPromotionCode basketPromotionCode, @C12579k Map<String, Integer> map, @C12579k String str3, @C12579k BasketServiceType basketServiceType, @C12579k BasketSlot basketSlot, @C12579k String str4, @C12580l BasketType basketType, @C12580l Integer num, @C12579k List<? extends BasketService> list4, @C12580l BasketReturnableBags basketReturnableBags) {
        BasketAmounts basketAmounts2 = basketAmounts;
        Intrinsics.checkNotNullParameter(basketAmounts2, "amounts");
        Intrinsics.checkNotNullParameter(list, "discounts");
        Intrinsics.checkNotNullParameter(list2, "errorMessages");
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(list3, "offers");
        Intrinsics.checkNotNullParameter(map, "quantities");
        Intrinsics.checkNotNullParameter(str3, "reference");
        Intrinsics.checkNotNullParameter(basketServiceType, "serviceType");
        Intrinsics.checkNotNullParameter(basketSlot, OnlineStoreShopFragment.f60516Z);
        Intrinsics.checkNotNullParameter(str4, "storeId");
        Intrinsics.checkNotNullParameter(list4, C28531e0.f69095y);
        return new Basket(basketAmounts2, list, list2, str, z, basketLoyaltyCard, list3, str2, i, basketPromotionCode, map, str3, basketServiceType, basketSlot, str4, basketType, num, list4, basketReturnableBags, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: w */
    public final BasketAmounts mo116855w() {
        return this.f95472a;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.f95472a.writeToParcel(parcel, i);
        List<OfferDiscount> list = this.f95473b;
        parcel.writeInt(list.size());
        for (OfferDiscount writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<BasketErrorMessage> list2 = this.f95474c;
        parcel.writeInt(list2.size());
        for (BasketErrorMessage writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
        FacilityServiceId.m157965k(this.f95475d, parcel, i);
        parcel.writeInt(this.f95476e ? 1 : 0);
        BasketLoyaltyCard basketLoyaltyCard = this.f95477f;
        if (basketLoyaltyCard == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basketLoyaltyCard.writeToParcel(parcel, i);
        }
        List<Offer> list3 = this.f95478g;
        parcel.writeInt(list3.size());
        for (Offer writeToParcel3 : list3) {
            writeToParcel3.writeToParcel(parcel, i);
        }
        String str = this.f95479v;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            PickingEligibility.m156150l(str, parcel, i);
        }
        parcel.writeInt(this.f95480w);
        BasketPromotionCode basketPromotionCode = this.f95481x;
        if (basketPromotionCode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basketPromotionCode.writeToParcel(parcel, i);
        }
        Map<String, Integer> map = this.f95482y;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeInt(((Number) next.getValue()).intValue());
        }
        BasketReference.m156100k(this.f95483z, parcel, i);
        parcel.writeString(this.f95469X.name());
        this.f95470Y.writeToParcel(parcel, i);
        StoreId.m154976k(this.f95471Z, parcel, i);
        BasketType basketType = this.f95465E0;
        if (basketType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(basketType.name());
        }
        Integer num = this.f95466F0;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<BasketService> list4 = this.f95467G0;
        parcel.writeInt(list4.size());
        for (BasketService writeParcelable : list4) {
            parcel.writeParcelable(writeParcelable, i);
        }
        BasketReturnableBags basketReturnableBags = this.f95468H0;
        if (basketReturnableBags == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        basketReturnableBags.writeToParcel(parcel, i);
    }

    @C12579k
    /* renamed from: x */
    public final List<OfferDiscount> mo116857x() {
        return this.f95473b;
    }

    @C12579k
    /* renamed from: y */
    public final List<BasketErrorMessage> mo116858y() {
        return this.f95474c;
    }

    @C12579k
    /* renamed from: z */
    public final String mo116859z() {
        return this.f95475d;
    }

    public Basket(BasketAmounts basketAmounts, List<OfferDiscount> list, List<BasketErrorMessage> list2, String str, boolean z, BasketLoyaltyCard basketLoyaltyCard, List<Offer> list3, String str2, int i, BasketPromotionCode basketPromotionCode, Map<String, Integer> map, String str3, BasketServiceType basketServiceType, BasketSlot basketSlot, String str4, BasketType basketType, Integer num, List<? extends BasketService> list4, BasketReturnableBags basketReturnableBags) {
        List<BasketErrorMessage> list5 = list2;
        String str5 = str;
        List<Offer> list6 = list3;
        Map<String, Integer> map2 = map;
        String str6 = str3;
        BasketServiceType basketServiceType2 = basketServiceType;
        BasketSlot basketSlot2 = basketSlot;
        String str7 = str4;
        List<? extends BasketService> list7 = list4;
        Intrinsics.checkNotNullParameter(basketAmounts, "amounts");
        Intrinsics.checkNotNullParameter(list, "discounts");
        Intrinsics.checkNotNullParameter(list5, "errorMessages");
        Intrinsics.checkNotNullParameter(str5, C28547h2.f69320h);
        Intrinsics.checkNotNullParameter(list6, "offers");
        Intrinsics.checkNotNullParameter(map2, "quantities");
        Intrinsics.checkNotNullParameter(str6, "reference");
        Intrinsics.checkNotNullParameter(basketServiceType2, "serviceType");
        Intrinsics.checkNotNullParameter(basketSlot2, OnlineStoreShopFragment.f60516Z);
        Intrinsics.checkNotNullParameter(str7, "storeId");
        Intrinsics.checkNotNullParameter(list7, C28531e0.f69095y);
        this.f95472a = basketAmounts;
        this.f95473b = list;
        this.f95474c = list5;
        this.f95475d = str5;
        this.f95476e = z;
        this.f95477f = basketLoyaltyCard;
        this.f95478g = list6;
        this.f95479v = str2;
        this.f95480w = i;
        this.f95481x = basketPromotionCode;
        this.f95482y = map2;
        this.f95483z = str6;
        this.f95469X = basketServiceType2;
        this.f95470Y = basketSlot2;
        this.f95471Z = str7;
        this.f95465E0 = basketType;
        this.f95466F0 = num;
        this.f95467G0 = list7;
        this.f95468H0 = basketReturnableBags;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.carrefour.fid.android.domain.models.basket.BasketType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: com.carrefour.fid.android.domain.models.basket.BasketType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.carrefour.fid.android.domain.models.basket.BasketType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v1, resolved type: com.carrefour.fid.android.domain.models.basket.BasketReturnableBags} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.carrefour.fid.android.domain.models.basket.BasketType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: com.carrefour.fid.android.domain.models.basket.BasketType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: com.carrefour.fid.android.domain.models.basket.BasketType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.carrefour.fid.android.domain.models.basket.BasketType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.carrefour.fid.android.domain.models.basket.BasketType} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Basket(com.carrefour.fid.android.domain.models.basket.BasketAmounts r33, java.util.List r34, java.util.List r35, java.lang.String r36, boolean r37, com.carrefour.fid.android.domain.models.basket.BasketLoyaltyCard r38, java.util.List r39, java.lang.String r40, int r41, com.carrefour.fid.android.domain.models.basket.BasketPromotionCode r42, java.util.Map r43, java.lang.String r44, com.carrefour.fid.android.domain.models.basket.BasketServiceType r45, com.carrefour.fid.android.domain.models.basket.BasketSlot r46, java.lang.String r47, com.carrefour.fid.android.domain.models.basket.BasketType r48, java.lang.Integer r49, java.util.List r50, com.carrefour.fid.android.domain.models.basket.BasketReturnableBags r51, int r52, kotlin.jvm.internal.DefaultConstructorMarker r53) {
        /*
            r32 = this;
            r0 = r52
            r1 = r0 & 1
            if (r1 == 0) goto L_0x002c
            com.carrefour.fid.android.domain.models.basket.BasketAmounts r1 = new com.carrefour.fid.android.domain.models.basket.BasketAmounts
            r2 = r1
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 16383(0x3fff, float:2.2957E-41)
            r31 = 0
            r2.<init>(r3, r4, r6, r8, r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30, r31)
            goto L_0x002e
        L_0x002c:
            r1 = r33
        L_0x002e:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0037
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0039
        L_0x0037:
            r2 = r34
        L_0x0039:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0042
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0044
        L_0x0042:
            r3 = r35
        L_0x0044:
            r4 = r0 & 8
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x004f
            java.lang.String r4 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157959c(r5, r6, r5)
            goto L_0x0051
        L_0x004f:
            r4 = r36
        L_0x0051:
            r7 = r0 & 16
            r8 = 0
            if (r7 == 0) goto L_0x0058
            r7 = r8
            goto L_0x005a
        L_0x0058:
            r7 = r37
        L_0x005a:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0060
            r9 = r5
            goto L_0x0062
        L_0x0060:
            r9 = r38
        L_0x0062:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x006b
            java.util.List r10 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x006d
        L_0x006b:
            r10 = r39
        L_0x006d:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0073
            r11 = r5
            goto L_0x0075
        L_0x0073:
            r11 = r40
        L_0x0075:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r8 = r41
        L_0x007c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0082
            r12 = r5
            goto L_0x0084
        L_0x0082:
            r12 = r42
        L_0x0084:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x008d
            java.util.Map r13 = kotlin.collections.C10977s0.m41492z()
            goto L_0x008f
        L_0x008d:
            r13 = r43
        L_0x008f:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0098
            java.lang.String r14 = com.carrefour.fid.android.domain.models.basket.BasketReference.m156094c(r5, r6, r5)
            goto L_0x009a
        L_0x0098:
            r14 = r44
        L_0x009a:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x00a1
            com.carrefour.fid.android.domain.models.basket.BasketServiceType r15 = com.carrefour.fid.android.domain.models.basket.BasketServiceType.UNKNOWN
            goto L_0x00a3
        L_0x00a1:
            r15 = r45
        L_0x00a3:
            r5 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x00cb
            com.carrefour.fid.android.domain.models.basket.BasketSlot r5 = new com.carrefour.fid.android.domain.models.basket.BasketSlot
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 31
            r22 = 0
            r34 = r5
            r35 = r16
            r36 = r17
            r37 = r18
            r38 = r19
            r39 = r20
            r40 = r21
            r41 = r22
            r34.<init>(r35, r36, r37, r38, r39, r40, r41)
            goto L_0x00cd
        L_0x00cb:
            r5 = r46
        L_0x00cd:
            r16 = r5
            r5 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x00d9
            r5 = 0
            java.lang.String r6 = com.carrefour.fid.android.domain.interactors.service.StoreId.m154970c(r5, r6, r5)
            goto L_0x00dc
        L_0x00d9:
            r5 = 0
            r6 = r47
        L_0x00dc:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x00e6
            r17 = r5
            goto L_0x00e8
        L_0x00e6:
            r17 = r48
        L_0x00e8:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00f1
            r18 = r5
            goto L_0x00f3
        L_0x00f1:
            r18 = r49
        L_0x00f3:
            r19 = 131072(0x20000, float:1.83671E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00fe
            java.util.List r19 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0100
        L_0x00fe:
            r19 = r50
        L_0x0100:
            r20 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x0107
            goto L_0x0109
        L_0x0107:
            r5 = r51
        L_0x0109:
            r0 = 0
            r53 = r0
            r33 = r32
            r34 = r1
            r35 = r2
            r36 = r3
            r37 = r4
            r38 = r7
            r39 = r9
            r40 = r10
            r41 = r11
            r42 = r8
            r43 = r12
            r44 = r13
            r45 = r14
            r46 = r15
            r47 = r16
            r48 = r6
            r49 = r17
            r50 = r18
            r51 = r19
            r52 = r5
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.basket.Basket.<init>(com.carrefour.fid.android.domain.models.basket.BasketAmounts, java.util.List, java.util.List, java.lang.String, boolean, com.carrefour.fid.android.domain.models.basket.BasketLoyaltyCard, java.util.List, java.lang.String, int, com.carrefour.fid.android.domain.models.basket.BasketPromotionCode, java.util.Map, java.lang.String, com.carrefour.fid.android.domain.models.basket.BasketServiceType, com.carrefour.fid.android.domain.models.basket.BasketSlot, java.lang.String, com.carrefour.fid.android.domain.models.basket.BasketType, java.lang.Integer, java.util.List, com.carrefour.fid.android.domain.models.basket.BasketReturnableBags, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
