package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.account.Address;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001BÙ\u0001\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\u0010$\u001a\u0004\u0018\u00010\t\u0012\b\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t\u0012\b\u00102\u001a\u0004\u0018\u00010.\u0012\b\u00105\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010;\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106\u0012\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020<\u0018\u000106\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010H\u001a\u00020C\u0012\u0006\u0010M\u001a\u00020I\u0012\u0006\u0010P\u001a\u00020I¢\u0006\u0004\bQ\u0010RJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000f\u0010\u0016R\u0019\u0010!\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\rR\u0019\u0010$\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\rR\u0019\u0010'\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b&\u0010\rR\u0019\u0010*\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010\u000b\u001a\u0004\b)\u0010\rR\u0019\u0010-\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b+\u0010\u000b\u001a\u0004\b,\u0010\rR\u0019\u00102\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\n\u00101R\u0019\u00105\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b3\u0010\u000b\u001a\u0004\b4\u0010\rR\u001f\u0010;\u001a\n\u0012\u0004\u0012\u000207\u0018\u0001068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b\u0013\u0010:R\u001f\u0010?\u001a\n\u0012\u0004\u0012\u00020<\u0018\u0001068\u0006¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010:R\u0019\u0010B\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b@\u0010\u0014\u001a\u0004\bA\u0010\u0016R\u0017\u0010H\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010M\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bJ\u00108\u001a\u0004\bK\u0010LR\u0017\u0010P\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bN\u00108\u001a\u0004\bO\u0010L¨\u0006S"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrderConfirmationModel;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "orderId", "b", "g", "orderNumber", "", "c", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "orderAmount", "e", "orderDiscountAmount", "l", "promoCode", "m", "promoDiscountAmount", "fidPaymentAmount", "v", "q", "storeId", "w", "p", "storeFormat", "x", "i", "paymentChoice", "y", "n", "slotDateBegin", "z", "o", "slotDateEnd", "Lcom/carrefour/fid/android/domain/models/account/Address;", "X", "Lcom/carrefour/fid/android/domain/models/account/Address;", "()Lcom/carrefour/fid/android/domain/models/account/Address;", "deliveryAddress", "Y", "j", "pickupPointName", "", "Lcom/carrefour/fid/android/domain/models/OrderOfferModel;", "Z", "Ljava/util/List;", "()Ljava/util/List;", "offers", "Lcom/carrefour/fid/android/domain/models/OrderProductModel;", "E0", "k", "products", "F0", "h", "orderServiceAmount", "Lcom/carrefour/fid/android/domain/models/TrackingData;", "G0", "Lcom/carrefour/fid/android/domain/models/TrackingData;", "r", "()Lcom/carrefour/fid/android/domain/models/TrackingData;", "trackingData", "", "H0", "t", "()Z", "isNonFoodOrder", "I0", "s", "isDeliveryToPickupPoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/account/Address;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Lcom/carrefour/fid/android/domain/models/TrackingData;ZZ)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderConfirmationModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrderConfirmationModel> CREATOR = new C37924a();

    /* renamed from: J0 */
    public static final int f95289J0 = 8;
    @C12580l

    /* renamed from: E0 */
    public final List<OrderProductModel> f95290E0;
    @C12580l

    /* renamed from: F0 */
    public final Double f95291F0;
    @C12579k

    /* renamed from: G0 */
    public final TrackingData f95292G0;

    /* renamed from: H0 */
    public final boolean f95293H0;

    /* renamed from: I0 */
    public final boolean f95294I0;
    @C12580l

    /* renamed from: X */
    public final Address f95295X;
    @C12580l

    /* renamed from: Y */
    public final String f95296Y;
    @C12580l

    /* renamed from: Z */
    public final List<OrderOfferModel> f95297Z;
    @C12579k

    /* renamed from: a */
    public final String f95298a;
    @C12579k

    /* renamed from: b */
    public final String f95299b;
    @C12580l

    /* renamed from: c */
    public final Double f95300c;
    @C12580l

    /* renamed from: d */
    public final Double f95301d;
    @C12580l

    /* renamed from: e */
    public final String f95302e;
    @C12580l

    /* renamed from: f */
    public final Double f95303f;
    @C12580l

    /* renamed from: g */
    public final Double f95304g;
    @C12580l

    /* renamed from: v */
    public final String f95305v;
    @C12580l

    /* renamed from: w */
    public final String f95306w;
    @C12580l

    /* renamed from: x */
    public final String f95307x;
    @C12580l

    /* renamed from: y */
    public final String f95308y;
    @C12580l

    /* renamed from: z */
    public final String f95309z;

    /* renamed from: com.carrefour.fid.android.domain.models.OrderConfirmationModel$a */
    public static final class C37924a implements Parcelable.Creator<OrderConfirmationModel> {
        @C12579k
        /* renamed from: a */
        public final OrderConfirmationModel createFromParcel(@C12579k Parcel parcel) {
            Address address;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString3 = parcel.readString();
            Double valueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            Address address2 = (Address) parcel2.readParcelable(OrderConfirmationModel.class.getClassLoader());
            String readString9 = parcel.readString();
            if (parcel.readInt() == 0) {
                address = address2;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt);
                address = address2;
                int i = 0;
                while (i != readInt) {
                    arrayList4.add(OrderOfferModel.CREATOR.createFromParcel(parcel2));
                    i++;
                    readInt = readInt;
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                arrayList3 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                arrayList2 = arrayList;
                int i2 = 0;
                while (i2 != readInt2) {
                    arrayList5.add(OrderProductModel.CREATOR.createFromParcel(parcel2));
                    i2++;
                    readInt2 = readInt2;
                }
                arrayList3 = arrayList5;
            }
            return new OrderConfirmationModel(readString, readString2, valueOf, valueOf2, readString3, valueOf3, valueOf4, readString4, readString5, readString6, readString7, readString8, address, readString9, arrayList2, arrayList3, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), TrackingData.CREATOR.createFromParcel(parcel2), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final OrderConfirmationModel[] newArray(int i) {
            return new OrderConfirmationModel[i];
        }
    }

    public OrderConfirmationModel(@C12579k String str, @C12579k String str2, @C12580l Double d, @C12580l Double d2, @C12580l String str3, @C12580l Double d3, @C12580l Double d4, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l Address address, @C12580l String str9, @C12580l List<OrderOfferModel> list, @C12580l List<OrderProductModel> list2, @C12580l Double d5, @C12579k TrackingData trackingData, boolean z, boolean z2) {
        TrackingData trackingData2 = trackingData;
        Intrinsics.checkNotNullParameter(str, "orderId");
        Intrinsics.checkNotNullParameter(str2, "orderNumber");
        Intrinsics.checkNotNullParameter(trackingData2, "trackingData");
        this.f95298a = str;
        this.f95299b = str2;
        this.f95300c = d;
        this.f95301d = d2;
        this.f95302e = str3;
        this.f95303f = d3;
        this.f95304g = d4;
        this.f95305v = str4;
        this.f95306w = str5;
        this.f95307x = str6;
        this.f95308y = str7;
        this.f95309z = str8;
        this.f95295X = address;
        this.f95296Y = str9;
        this.f95297Z = list;
        this.f95290E0 = list2;
        this.f95291F0 = d5;
        this.f95292G0 = trackingData2;
        this.f95293H0 = z;
        this.f95294I0 = z2;
    }

    @C12580l
    /* renamed from: a */
    public final Address mo116149a() {
        return this.f95295X;
    }

    @C12580l
    /* renamed from: b */
    public final Double mo116150b() {
        return this.f95304g;
    }

    @C12580l
    /* renamed from: c */
    public final List<OrderOfferModel> mo116151c() {
        return this.f95297Z;
    }

    @C12580l
    /* renamed from: d */
    public final Double mo116152d() {
        return this.f95300c;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final Double mo116154e() {
        return this.f95301d;
    }

    @C12579k
    /* renamed from: f */
    public final String mo116155f() {
        return this.f95298a;
    }

    @C12579k
    /* renamed from: g */
    public final String mo116156g() {
        return this.f95299b;
    }

    @C12580l
    /* renamed from: h */
    public final Double mo116157h() {
        return this.f95291F0;
    }

    @C12580l
    /* renamed from: i */
    public final String mo116158i() {
        return this.f95307x;
    }

    @C12580l
    /* renamed from: j */
    public final String mo116159j() {
        return this.f95296Y;
    }

    @C12580l
    /* renamed from: k */
    public final List<OrderProductModel> mo116160k() {
        return this.f95290E0;
    }

    @C12580l
    /* renamed from: l */
    public final String mo116161l() {
        return this.f95302e;
    }

    @C12580l
    /* renamed from: m */
    public final Double mo116162m() {
        return this.f95303f;
    }

    @C12580l
    /* renamed from: n */
    public final String mo116163n() {
        return this.f95308y;
    }

    @C12580l
    /* renamed from: o */
    public final String mo116164o() {
        return this.f95309z;
    }

    @C12580l
    /* renamed from: p */
    public final String mo116165p() {
        return this.f95306w;
    }

    @C12580l
    /* renamed from: q */
    public final String mo116166q() {
        return this.f95305v;
    }

    @C12579k
    /* renamed from: r */
    public final TrackingData mo116167r() {
        return this.f95292G0;
    }

    /* renamed from: s */
    public final boolean mo116168s() {
        return this.f95294I0;
    }

    /* renamed from: t */
    public final boolean mo116169t() {
        return this.f95293H0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95298a);
        parcel.writeString(this.f95299b);
        Double d = this.f95300c;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f95301d;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeString(this.f95302e);
        Double d3 = this.f95303f;
        if (d3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d3.doubleValue());
        }
        Double d4 = this.f95304g;
        if (d4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d4.doubleValue());
        }
        parcel.writeString(this.f95305v);
        parcel.writeString(this.f95306w);
        parcel.writeString(this.f95307x);
        parcel.writeString(this.f95308y);
        parcel.writeString(this.f95309z);
        parcel.writeParcelable(this.f95295X, i);
        parcel.writeString(this.f95296Y);
        List<OrderOfferModel> list = this.f95297Z;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (OrderOfferModel writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        List<OrderProductModel> list2 = this.f95290E0;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (OrderProductModel writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, i);
            }
        }
        Double d5 = this.f95291F0;
        if (d5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d5.doubleValue());
        }
        this.f95292G0.writeToParcel(parcel, i);
        parcel.writeInt(this.f95293H0 ? 1 : 0);
        parcel.writeInt(this.f95294I0 ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrderConfirmationModel(java.lang.String r25, java.lang.String r26, java.lang.Double r27, java.lang.Double r28, java.lang.String r29, java.lang.Double r30, java.lang.Double r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, com.carrefour.fid.android.domain.models.account.Address r37, java.lang.String r38, java.util.List r39, java.util.List r40, java.lang.Double r41, com.carrefour.fid.android.domain.models.TrackingData r42, boolean r43, boolean r44, int r45, kotlin.jvm.internal.DefaultConstructorMarker r46) {
        /*
            r24 = this;
            r0 = r45
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r14 = r2
            goto L_0x000b
        L_0x0009:
            r14 = r35
        L_0x000b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0011
            r15 = r2
            goto L_0x0013
        L_0x0011:
            r15 = r36
        L_0x0013:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x001a
            r18 = r2
            goto L_0x001c
        L_0x001a:
            r18 = r39
        L_0x001c:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0025
            r19 = r2
            goto L_0x0027
        L_0x0025:
            r19 = r40
        L_0x0027:
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r16 = r37
            r17 = r38
            r20 = r41
            r21 = r42
            r22 = r43
            r23 = r44
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.OrderConfirmationModel.<init>(java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.String, java.lang.Double, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.domain.models.account.Address, java.lang.String, java.util.List, java.util.List, java.lang.Double, com.carrefour.fid.android.domain.models.TrackingData, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
