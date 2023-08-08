package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.BasketType;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
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

@C11076d0(mo22515d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\b\b\u0018\u0000 z2\u00020\u0001:\u0001BBÕ\u0001\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010&\u001a\u00020\t\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004\u0012\u0006\u0010)\u001a\u00020\u0007\u0012\u0006\u0010*\u001a\u00020\u000f\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0015\u0012\u0006\u0010.\u001a\u00020\u0007\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0018\u0012\b\u00100\u001a\u0004\u0018\u00010\u001a\u0012\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0004\u0012\b\b\u0002\u00102\u001a\u00020\u001e\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bx\u0010yJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0015HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\u001eHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0012\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"Jü\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010&\u001a\u00020\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00042\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u000f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00152\b\b\u0002\u0010.\u001a\u00020\u00072\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001a2\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00042\b\b\u0002\u00102\u001a\u00020\u001e2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b5\u00106J\t\u00107\u001a\u00020\u0007HÖ\u0001J\t\u00108\u001a\u00020\u000fHÖ\u0001J\u0013\u0010;\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010<\u001a\u00020\u000fHÖ\u0001J\u0019\u0010A\u001a\u00020@2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u000fHÖ\u0001R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001f\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010%\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bJ\u0010KR\"\u0010&\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0019\u0010'\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010I\u001a\u0004\bQ\u0010KR*\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010F\u001a\u0004\bR\u0010H\"\u0004\bS\u0010TR\"\u0010)\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010I\u001a\u0004\bU\u0010K\"\u0004\bV\u0010WR\"\u0010*\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0019\u0010+\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010,\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR%\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bG\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010.\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bJ\u0010I\u001a\u0004\bh\u0010KR\u0019\u0010/\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bX\u0010kR\u0019\u00100\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u001f\u00101\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bL\u0010F\u001a\u0004\ba\u0010HR\u0017\u00102\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\b]\u0010rR\u0019\u00103\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bs\u0010I\u001a\u0004\bt\u0010KR\u0019\u00104\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010\"¨\u0006{"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/BasketDomain;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/BasketAmounts;", "b", "", "Lcom/carrefour/fid/android/domain/models/BasketErrorMessage;", "l", "", "m", "", "n", "o", "Lcom/carrefour/fid/android/domain/models/BasketOfferDomain;", "p", "q", "", "r", "Lcom/carrefour/fid/android/domain/models/BasketPromotionCode;", "s", "Lcom/carrefour/fid/android/domain/models/basket/BasketReturnableBags;", "c", "", "d", "e", "Lcom/carrefour/fid/android/domain/models/BasketServiceType;", "f", "Lcom/carrefour/fid/android/domain/models/BasketSlot;", "g", "Lcom/carrefour/fid/android/domain/models/OfferDiscountDomain;", "h", "Lcom/carrefour/fid/android/core/type/BasketType;", "i", "j", "k", "()Ljava/lang/Integer;", "amounts", "errorMessages", "facility", "isFullNotFood", "lastUpdateVersion", "offers", "pickingEligibility", "productCount", "promotionCode", "returnableBags", "quantities", "ref", "serviceType", "slot", "discounts", "basketType", "storeId", "stampsCount", "t", "(Lcom/carrefour/fid/android/domain/models/BasketAmounts;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;ILcom/carrefour/fid/android/domain/models/BasketPromotionCode;Lcom/carrefour/fid/android/domain/models/basket/BasketReturnableBags;Ljava/util/Map;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/BasketServiceType;Lcom/carrefour/fid/android/domain/models/BasketSlot;Ljava/util/List;Lcom/carrefour/fid/android/core/type/BasketType;Ljava/lang/String;Ljava/lang/Integer;)Lcom/carrefour/fid/android/domain/models/BasketDomain;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "a", "Lcom/carrefour/fid/android/domain/models/BasketAmounts;", "v", "()Lcom/carrefour/fid/android/domain/models/BasketAmounts;", "Ljava/util/List;", "y", "()Ljava/util/List;", "Ljava/lang/String;", "z", "()Ljava/lang/String;", "Z", "M", "()Z", "N", "(Z)V", "A", "B", "O", "(Ljava/util/List;)V", "C", "P", "(Ljava/lang/String;)V", "I", "D", "()I", "Q", "(I)V", "w", "Lcom/carrefour/fid/android/domain/models/BasketPromotionCode;", "E", "()Lcom/carrefour/fid/android/domain/models/BasketPromotionCode;", "x", "Lcom/carrefour/fid/android/domain/models/basket/BasketReturnableBags;", "H", "()Lcom/carrefour/fid/android/domain/models/basket/BasketReturnableBags;", "Ljava/util/Map;", "F", "()Ljava/util/Map;", "G", "X", "Lcom/carrefour/fid/android/domain/models/BasketServiceType;", "()Lcom/carrefour/fid/android/domain/models/BasketServiceType;", "Y", "Lcom/carrefour/fid/android/domain/models/BasketSlot;", "J", "()Lcom/carrefour/fid/android/domain/models/BasketSlot;", "E0", "Lcom/carrefour/fid/android/core/type/BasketType;", "()Lcom/carrefour/fid/android/core/type/BasketType;", "F0", "L", "G0", "Ljava/lang/Integer;", "K", "<init>", "(Lcom/carrefour/fid/android/domain/models/BasketAmounts;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;ILcom/carrefour/fid/android/domain/models/BasketPromotionCode;Lcom/carrefour/fid/android/domain/models/basket/BasketReturnableBags;Ljava/util/Map;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/BasketServiceType;Lcom/carrefour/fid/android/domain/models/BasketSlot;Ljava/util/List;Lcom/carrefour/fid/android/core/type/BasketType;Ljava/lang/String;Ljava/lang/Integer;)V", "H0", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class BasketDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketDomain> CREATOR = new C37894b();
    @C12579k

    /* renamed from: H0 */
    public static final C37893a f95021H0 = new C37893a((DefaultConstructorMarker) null);

    /* renamed from: I0 */
    public static final int f95022I0 = 8;
    @C12579k

    /* renamed from: J0 */
    public static final BasketDomain f95023J0 = new BasketDomain((BasketAmounts) null, (List) null, (String) null, false, (String) null, (List) null, "", 0, (BasketPromotionCode) null, (BasketReturnableBags) null, (Map) null, "", (BasketServiceType) null, (BasketSlot) null, (List) null, (BasketType) null, (String) null, (Integer) null, 163840, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: E0 */
    public final BasketType f95024E0;
    @C12580l

    /* renamed from: F0 */
    public final String f95025F0;
    @C12580l

    /* renamed from: G0 */
    public final Integer f95026G0;
    @C12580l

    /* renamed from: X */
    public final BasketServiceType f95027X;
    @C12580l

    /* renamed from: Y */
    public final BasketSlot f95028Y;
    @C12580l

    /* renamed from: Z */
    public final List<OfferDiscountDomain> f95029Z;
    @C12580l

    /* renamed from: a */
    public final BasketAmounts f95030a;
    @C12580l

    /* renamed from: b */
    public final List<BasketErrorMessage> f95031b;
    @C12580l

    /* renamed from: c */
    public final String f95032c;

    /* renamed from: d */
    public boolean f95033d;
    @C12580l

    /* renamed from: e */
    public final String f95034e;
    @C12580l

    /* renamed from: f */
    public List<BasketOfferDomain> f95035f;
    @C12579k

    /* renamed from: g */
    public String f95036g;

    /* renamed from: v */
    public int f95037v;
    @C12580l

    /* renamed from: w */
    public final BasketPromotionCode f95038w;
    @C12580l

    /* renamed from: x */
    public final BasketReturnableBags f95039x;
    @C12580l

    /* renamed from: y */
    public final Map<String, Integer> f95040y;
    @C12579k

    /* renamed from: z */
    public final String f95041z;

    /* renamed from: com.carrefour.fid.android.domain.models.BasketDomain$a */
    public static final class C37893a {
        public /* synthetic */ C37893a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final BasketDomain mo115504a() {
            return BasketDomain.f95023J0;
        }

        public C37893a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.BasketDomain$b */
    public static final class C37894b implements Parcelable.Creator<BasketDomain> {
        @C12579k
        /* renamed from: a */
        public final BasketDomain createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            LinkedHashMap linkedHashMap;
            BasketServiceType basketServiceType;
            ArrayList arrayList3;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            BasketAmounts createFromParcel = parcel.readInt() == 0 ? null : BasketAmounts.CREATOR.createFromParcel(parcel2);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(BasketErrorMessage.CREATOR.createFromParcel(parcel2));
                }
            }
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(BasketOfferDomain.CREATOR.createFromParcel(parcel2));
                }
            }
            String readString3 = parcel.readString();
            int readInt3 = parcel.readInt();
            BasketPromotionCode createFromParcel2 = parcel.readInt() == 0 ? null : BasketPromotionCode.CREATOR.createFromParcel(parcel2);
            BasketReturnableBags basketReturnableBags = (BasketReturnableBags) parcel2.readParcelable(BasketDomain.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt4 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt4);
                for (int i3 = 0; i3 != readInt4; i3++) {
                    linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                }
            }
            String readString4 = parcel.readString();
            BasketServiceType createFromParcel3 = parcel.readInt() == 0 ? null : BasketServiceType.CREATOR.createFromParcel(parcel2);
            BasketSlot createFromParcel4 = parcel.readInt() == 0 ? null : BasketSlot.CREATOR.createFromParcel(parcel2);
            if (parcel.readInt() == 0) {
                basketServiceType = createFromParcel3;
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt5);
                basketServiceType = createFromParcel3;
                int i4 = 0;
                while (i4 != readInt5) {
                    arrayList4.add(OfferDiscountDomain.CREATOR.createFromParcel(parcel2));
                    i4++;
                    readInt5 = readInt5;
                }
                arrayList3 = arrayList4;
            }
            return new BasketDomain(createFromParcel, arrayList, readString, z, readString2, arrayList2, readString3, readInt3, createFromParcel2, basketReturnableBags, linkedHashMap, readString4, basketServiceType, createFromParcel4, arrayList3, BasketType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @C12579k
        /* renamed from: b */
        public final BasketDomain[] newArray(int i) {
            return new BasketDomain[i];
        }
    }

    public BasketDomain(@C12580l BasketAmounts basketAmounts, @C12580l List<BasketErrorMessage> list, @C12580l String str, boolean z, @C12580l String str2, @C12580l List<BasketOfferDomain> list2, @C12579k String str3, int i, @C12580l BasketPromotionCode basketPromotionCode, @C12580l BasketReturnableBags basketReturnableBags, @C12580l Map<String, Integer> map, @C12579k String str4, @C12580l BasketServiceType basketServiceType, @C12580l BasketSlot basketSlot, @C12580l List<OfferDiscountDomain> list3, @C12579k BasketType basketType, @C12580l String str5, @C12580l Integer num) {
        String str6 = str4;
        BasketType basketType2 = basketType;
        Intrinsics.checkNotNullParameter(str3, "pickingEligibility");
        Intrinsics.checkNotNullParameter(str6, "ref");
        Intrinsics.checkNotNullParameter(basketType2, "basketType");
        this.f95030a = basketAmounts;
        this.f95031b = list;
        this.f95032c = str;
        this.f95033d = z;
        this.f95034e = str2;
        this.f95035f = list2;
        this.f95036g = str3;
        this.f95037v = i;
        this.f95038w = basketPromotionCode;
        this.f95039x = basketReturnableBags;
        this.f95040y = map;
        this.f95041z = str6;
        this.f95027X = basketServiceType;
        this.f95028Y = basketSlot;
        this.f95029Z = list3;
        this.f95024E0 = basketType2;
        this.f95025F0 = str5;
        this.f95026G0 = num;
    }

    /* renamed from: u */
    public static /* synthetic */ BasketDomain m155187u(BasketDomain basketDomain, BasketAmounts basketAmounts, List list, String str, boolean z, String str2, List list2, String str3, int i, BasketPromotionCode basketPromotionCode, BasketReturnableBags basketReturnableBags, Map map, String str4, BasketServiceType basketServiceType, BasketSlot basketSlot, List list3, BasketType basketType, String str5, Integer num, int i2, Object obj) {
        BasketDomain basketDomain2 = basketDomain;
        int i3 = i2;
        return basketDomain.mo115496t((i3 & 1) != 0 ? basketDomain2.f95030a : basketAmounts, (i3 & 2) != 0 ? basketDomain2.f95031b : list, (i3 & 4) != 0 ? basketDomain2.f95032c : str, (i3 & 8) != 0 ? basketDomain2.f95033d : z, (i3 & 16) != 0 ? basketDomain2.f95034e : str2, (i3 & 32) != 0 ? basketDomain2.f95035f : list2, (i3 & 64) != 0 ? basketDomain2.f95036g : str3, (i3 & 128) != 0 ? basketDomain2.f95037v : i, (i3 & 256) != 0 ? basketDomain2.f95038w : basketPromotionCode, (i3 & 512) != 0 ? basketDomain2.f95039x : basketReturnableBags, (i3 & 1024) != 0 ? basketDomain2.f95040y : map, (i3 & 2048) != 0 ? basketDomain2.f95041z : str4, (i3 & 4096) != 0 ? basketDomain2.f95027X : basketServiceType, (i3 & 8192) != 0 ? basketDomain2.f95028Y : basketSlot, (i3 & 16384) != 0 ? basketDomain2.f95029Z : list3, (i3 & 32768) != 0 ? basketDomain2.f95024E0 : basketType, (i3 & 65536) != 0 ? basketDomain2.f95025F0 : str5, (i3 & 131072) != 0 ? basketDomain2.f95026G0 : num);
    }

    @C12580l
    /* renamed from: A */
    public final String mo115458A() {
        return this.f95034e;
    }

    @C12580l
    /* renamed from: B */
    public final List<BasketOfferDomain> mo115459B() {
        return this.f95035f;
    }

    @C12579k
    /* renamed from: C */
    public final String mo115460C() {
        return this.f95036g;
    }

    /* renamed from: D */
    public final int mo115461D() {
        return this.f95037v;
    }

    @C12580l
    /* renamed from: E */
    public final BasketPromotionCode mo115462E() {
        return this.f95038w;
    }

    @C12580l
    /* renamed from: F */
    public final Map<String, Integer> mo115463F() {
        return this.f95040y;
    }

    @C12579k
    /* renamed from: G */
    public final String mo115464G() {
        return this.f95041z;
    }

    @C12580l
    /* renamed from: H */
    public final BasketReturnableBags mo115465H() {
        return this.f95039x;
    }

    @C12580l
    /* renamed from: I */
    public final BasketServiceType mo115466I() {
        return this.f95027X;
    }

    @C12580l
    /* renamed from: J */
    public final BasketSlot mo115467J() {
        return this.f95028Y;
    }

    @C12580l
    /* renamed from: K */
    public final Integer mo115468K() {
        return this.f95026G0;
    }

    @C12580l
    /* renamed from: L */
    public final String mo115469L() {
        return this.f95025F0;
    }

    /* renamed from: M */
    public final boolean mo115470M() {
        return this.f95033d;
    }

    /* renamed from: N */
    public final void mo115471N(boolean z) {
        this.f95033d = z;
    }

    /* renamed from: O */
    public final void mo115472O(@C12580l List<BasketOfferDomain> list) {
        this.f95035f = list;
    }

    /* renamed from: P */
    public final void mo115473P(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f95036g = str;
    }

    /* renamed from: Q */
    public final void mo115474Q(int i) {
        this.f95037v = i;
    }

    @C12580l
    /* renamed from: b */
    public final BasketAmounts mo115475b() {
        return this.f95030a;
    }

    @C12580l
    /* renamed from: c */
    public final BasketReturnableBags mo115476c() {
        return this.f95039x;
    }

    @C12580l
    /* renamed from: d */
    public final Map<String, Integer> mo115477d() {
        return this.f95040y;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo115479e() {
        return this.f95041z;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketDomain)) {
            return false;
        }
        BasketDomain basketDomain = (BasketDomain) obj;
        return Intrinsics.areEqual((Object) this.f95030a, (Object) basketDomain.f95030a) && Intrinsics.areEqual((Object) this.f95031b, (Object) basketDomain.f95031b) && Intrinsics.areEqual((Object) this.f95032c, (Object) basketDomain.f95032c) && this.f95033d == basketDomain.f95033d && Intrinsics.areEqual((Object) this.f95034e, (Object) basketDomain.f95034e) && Intrinsics.areEqual((Object) this.f95035f, (Object) basketDomain.f95035f) && Intrinsics.areEqual((Object) this.f95036g, (Object) basketDomain.f95036g) && this.f95037v == basketDomain.f95037v && Intrinsics.areEqual((Object) this.f95038w, (Object) basketDomain.f95038w) && Intrinsics.areEqual((Object) this.f95039x, (Object) basketDomain.f95039x) && Intrinsics.areEqual((Object) this.f95040y, (Object) basketDomain.f95040y) && Intrinsics.areEqual((Object) this.f95041z, (Object) basketDomain.f95041z) && Intrinsics.areEqual((Object) this.f95027X, (Object) basketDomain.f95027X) && Intrinsics.areEqual((Object) this.f95028Y, (Object) basketDomain.f95028Y) && Intrinsics.areEqual((Object) this.f95029Z, (Object) basketDomain.f95029Z) && this.f95024E0 == basketDomain.f95024E0 && Intrinsics.areEqual((Object) this.f95025F0, (Object) basketDomain.f95025F0) && Intrinsics.areEqual((Object) this.f95026G0, (Object) basketDomain.f95026G0);
    }

    @C12580l
    /* renamed from: f */
    public final BasketServiceType mo115481f() {
        return this.f95027X;
    }

    @C12580l
    /* renamed from: g */
    public final BasketSlot mo115482g() {
        return this.f95028Y;
    }

    @C12580l
    /* renamed from: h */
    public final List<OfferDiscountDomain> mo115483h() {
        return this.f95029Z;
    }

    public int hashCode() {
        BasketAmounts basketAmounts = this.f95030a;
        int i = 0;
        int hashCode = (basketAmounts == null ? 0 : basketAmounts.hashCode()) * 31;
        List<BasketErrorMessage> list = this.f95031b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f95032c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f95033d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str2 = this.f95034e;
        int hashCode4 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BasketOfferDomain> list2 = this.f95035f;
        int hashCode5 = (((((hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.f95036g.hashCode()) * 31) + Integer.hashCode(this.f95037v)) * 31;
        BasketPromotionCode basketPromotionCode = this.f95038w;
        int hashCode6 = (hashCode5 + (basketPromotionCode == null ? 0 : basketPromotionCode.hashCode())) * 31;
        BasketReturnableBags basketReturnableBags = this.f95039x;
        int hashCode7 = (hashCode6 + (basketReturnableBags == null ? 0 : basketReturnableBags.hashCode())) * 31;
        Map<String, Integer> map = this.f95040y;
        int hashCode8 = (((hashCode7 + (map == null ? 0 : map.hashCode())) * 31) + this.f95041z.hashCode()) * 31;
        BasketServiceType basketServiceType = this.f95027X;
        int hashCode9 = (hashCode8 + (basketServiceType == null ? 0 : basketServiceType.hashCode())) * 31;
        BasketSlot basketSlot = this.f95028Y;
        int hashCode10 = (hashCode9 + (basketSlot == null ? 0 : basketSlot.hashCode())) * 31;
        List<OfferDiscountDomain> list3 = this.f95029Z;
        int hashCode11 = (((hashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31) + this.f95024E0.hashCode()) * 31;
        String str3 = this.f95025F0;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f95026G0;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode12 + i;
    }

    @C12579k
    /* renamed from: i */
    public final BasketType mo115485i() {
        return this.f95024E0;
    }

    @C12580l
    /* renamed from: j */
    public final String mo115486j() {
        return this.f95025F0;
    }

    @C12580l
    /* renamed from: k */
    public final Integer mo115487k() {
        return this.f95026G0;
    }

    @C12580l
    /* renamed from: l */
    public final List<BasketErrorMessage> mo115488l() {
        return this.f95031b;
    }

    @C12580l
    /* renamed from: m */
    public final String mo115489m() {
        return this.f95032c;
    }

    /* renamed from: n */
    public final boolean mo115490n() {
        return this.f95033d;
    }

    @C12580l
    /* renamed from: o */
    public final String mo115491o() {
        return this.f95034e;
    }

    @C12580l
    /* renamed from: p */
    public final List<BasketOfferDomain> mo115492p() {
        return this.f95035f;
    }

    @C12579k
    /* renamed from: q */
    public final String mo115493q() {
        return this.f95036g;
    }

    /* renamed from: r */
    public final int mo115494r() {
        return this.f95037v;
    }

    @C12580l
    /* renamed from: s */
    public final BasketPromotionCode mo115495s() {
        return this.f95038w;
    }

    @C12579k
    /* renamed from: t */
    public final BasketDomain mo115496t(@C12580l BasketAmounts basketAmounts, @C12580l List<BasketErrorMessage> list, @C12580l String str, boolean z, @C12580l String str2, @C12580l List<BasketOfferDomain> list2, @C12579k String str3, int i, @C12580l BasketPromotionCode basketPromotionCode, @C12580l BasketReturnableBags basketReturnableBags, @C12580l Map<String, Integer> map, @C12579k String str4, @C12580l BasketServiceType basketServiceType, @C12580l BasketSlot basketSlot, @C12580l List<OfferDiscountDomain> list3, @C12579k BasketType basketType, @C12580l String str5, @C12580l Integer num) {
        BasketAmounts basketAmounts2 = basketAmounts;
        Intrinsics.checkNotNullParameter(str3, "pickingEligibility");
        Intrinsics.checkNotNullParameter(str4, "ref");
        Intrinsics.checkNotNullParameter(basketType, "basketType");
        return new BasketDomain(basketAmounts, list, str, z, str2, list2, str3, i, basketPromotionCode, basketReturnableBags, map, str4, basketServiceType, basketSlot, list3, basketType, str5, num);
    }

    @C12579k
    public String toString() {
        BasketAmounts basketAmounts = this.f95030a;
        List<BasketErrorMessage> list = this.f95031b;
        String str = this.f95032c;
        boolean z = this.f95033d;
        String str2 = this.f95034e;
        List<BasketOfferDomain> list2 = this.f95035f;
        String str3 = this.f95036g;
        int i = this.f95037v;
        BasketPromotionCode basketPromotionCode = this.f95038w;
        BasketReturnableBags basketReturnableBags = this.f95039x;
        Map<String, Integer> map = this.f95040y;
        String str4 = this.f95041z;
        BasketServiceType basketServiceType = this.f95027X;
        BasketSlot basketSlot = this.f95028Y;
        List<OfferDiscountDomain> list3 = this.f95029Z;
        BasketType basketType = this.f95024E0;
        String str5 = this.f95025F0;
        Integer num = this.f95026G0;
        return "BasketDomain(amounts=" + basketAmounts + ", errorMessages=" + list + ", facility=" + str + ", isFullNotFood=" + z + ", lastUpdateVersion=" + str2 + ", offers=" + list2 + ", pickingEligibility=" + str3 + ", productCount=" + i + ", promotionCode=" + basketPromotionCode + ", returnableBags=" + basketReturnableBags + ", quantities=" + map + ", ref=" + str4 + ", serviceType=" + basketServiceType + ", slot=" + basketSlot + ", discounts=" + list3 + ", basketType=" + basketType + ", storeId=" + str5 + ", stampsCount=" + num + ")";
    }

    @C12580l
    /* renamed from: v */
    public final BasketAmounts mo115498v() {
        return this.f95030a;
    }

    @C12579k
    /* renamed from: w */
    public final BasketType mo115499w() {
        return this.f95024E0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        BasketAmounts basketAmounts = this.f95030a;
        if (basketAmounts == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basketAmounts.writeToParcel(parcel, i);
        }
        List<BasketErrorMessage> list = this.f95031b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (BasketErrorMessage writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.f95032c);
        parcel.writeInt(this.f95033d ? 1 : 0);
        parcel.writeString(this.f95034e);
        List<BasketOfferDomain> list2 = this.f95035f;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (BasketOfferDomain writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.f95036g);
        parcel.writeInt(this.f95037v);
        BasketPromotionCode basketPromotionCode = this.f95038w;
        if (basketPromotionCode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basketPromotionCode.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f95039x, i);
        Map<String, Integer> map = this.f95040y;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry next : map.entrySet()) {
                parcel.writeString((String) next.getKey());
                parcel.writeInt(((Number) next.getValue()).intValue());
            }
        }
        parcel.writeString(this.f95041z);
        BasketServiceType basketServiceType = this.f95027X;
        if (basketServiceType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basketServiceType.writeToParcel(parcel, i);
        }
        BasketSlot basketSlot = this.f95028Y;
        if (basketSlot == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basketSlot.writeToParcel(parcel, i);
        }
        List<OfferDiscountDomain> list3 = this.f95029Z;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (OfferDiscountDomain writeToParcel3 : list3) {
                writeToParcel3.writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.f95024E0.name());
        parcel.writeString(this.f95025F0);
        Integer num = this.f95026G0;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }

    @C12580l
    /* renamed from: x */
    public final List<OfferDiscountDomain> mo115501x() {
        return this.f95029Z;
    }

    @C12580l
    /* renamed from: y */
    public final List<BasketErrorMessage> mo115502y() {
        return this.f95031b;
    }

    @C12580l
    /* renamed from: z */
    public final String mo115503z() {
        return this.f95032c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketDomain(BasketAmounts basketAmounts, List list, String str, boolean z, String str2, List list2, String str3, int i, BasketPromotionCode basketPromotionCode, BasketReturnableBags basketReturnableBags, Map map, String str4, BasketServiceType basketServiceType, BasketSlot basketSlot, List list3, BasketType basketType, String str5, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(basketAmounts, list, str, z, str2, list2, str3, i, basketPromotionCode, basketReturnableBags, map, str4, basketServiceType, basketSlot, list3, (i2 & 32768) != 0 ? BasketType.BASKET_V4_TYPE_DRIVE : basketType, (i2 & 65536) != 0 ? null : str5, (i2 & 131072) != 0 ? null : num);
    }
}
