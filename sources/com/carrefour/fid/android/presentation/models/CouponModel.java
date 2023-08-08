package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.coupons.CouponStatus;
import com.carrefour.fid.android.data.entities.coupons.CouponType;
import com.carrefour.fid.android.domain.models.DiscountType;
import com.carrefour.fid.android.shared.util.C28932h;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b@\b\b\u0018\u00002\u00020\u0001:\u0002\u0001B÷\u0001\u0012\b\b\u0002\u0010)\u001a\u00020\b\u0012\b\b\u0002\u0010*\u001a\u00020\n\u0012\b\b\u0002\u0010+\u001a\u00020\n\u0012\b\b\u0002\u0010,\u001a\u00020\n\u0012\b\b\u0002\u0010-\u001a\u00020\u000e\u0012\b\b\u0002\u0010.\u001a\u00020\n\u0012\b\b\u0002\u0010/\u001a\u00020\n\u0012\b\b\u0002\u00100\u001a\u00020\b\u0012\b\b\u0002\u00101\u001a\u00020\n\u0012\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\b\b\u0002\u00103\u001a\u00020\n\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u00105\u001a\u00020\u001a\u0012\b\b\u0002\u00106\u001a\u00020\n\u0012\b\b\u0002\u00107\u001a\u00020\u001d\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u001f\u0012\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\b\b\u0002\u0010:\u001a\u00020\n\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010<\u001a\u00020\n\u0012\b\b\u0002\u0010=\u001a\u00020&\u0012\b\b\u0002\u0010>\u001a\u00020\n¢\u0006\u0006\b\u0001\u0010\u0001J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\nHÆ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÆ\u0003J\t\u0010\u0010\u001a\u00020\nHÆ\u0003J\t\u0010\u0011\u001a\u00020\nHÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J\t\u0010\u0013\u001a\u00020\nHÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0014HÆ\u0003J\t\u0010\u0016\u001a\u00020\nHÆ\u0003J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001b\u001a\u00020\u001aHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u001dHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u0014HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010#HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020&HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003Jþ\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020\n2\b\b\u0002\u0010+\u001a\u00020\n2\b\b\u0002\u0010,\u001a\u00020\n2\b\b\u0002\u0010-\u001a\u00020\u000e2\b\b\u0002\u0010.\u001a\u00020\n2\b\b\u0002\u0010/\u001a\u00020\n2\b\b\u0002\u00100\u001a\u00020\b2\b\b\u0002\u00101\u001a\u00020\n2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\b\b\u0002\u00103\u001a\u00020\n2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u00105\u001a\u00020\u001a2\b\b\u0002\u00106\u001a\u00020\n2\b\b\u0002\u00107\u001a\u00020\u001d2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u001f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\b\b\u0002\u0010:\u001a\u00020\n2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010<\u001a\u00020\n2\b\b\u0002\u0010=\u001a\u00020&2\b\b\u0002\u0010>\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b?\u0010@J\t\u0010A\u001a\u00020\nHÖ\u0001J\t\u0010B\u001a\u00020\u0006HÖ\u0001J\u0019\u0010G\u001a\u00020F2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\u0006HÖ\u0001R\u0017\u0010)\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010*\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010+\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\bN\u0010MR\u0017\u0010,\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010K\u001a\u0004\bO\u0010MR\u0017\u0010-\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010.\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010K\u001a\u0004\bS\u0010MR\u0017\u0010/\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010K\u001a\u0004\bT\u0010MR\u0017\u00100\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bU\u0010JR\u0017\u00101\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b?\u0010K\u001a\u0004\bV\u0010MR\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u00103\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b[\u0010K\u001a\u0004\b\\\u0010MR\u0019\u00104\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b]\u0010\u0019R\u0017\u00105\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0017\u00106\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bc\u0010K\u001a\u0004\bd\u0010MR\u0017\u00107\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0019\u00108\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0006¢\u0006\f\n\u0004\bm\u0010X\u001a\u0004\b[\u0010ZR\u0017\u0010:\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bn\u0010K\u001a\u0004\bo\u0010MR\u0019\u0010;\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\bH\u0010rR\u0017\u0010<\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bs\u0010K\u001a\u0004\bt\u0010MR\u0017\u0010=\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010>\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\by\u0010K\u001a\u0004\bz\u0010MR\u0011\u0010|\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b{\u0010MR\u0011\u0010}\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0012\u0010\u0001\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0010~R\u0013\u0010\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u0001\u0010~¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/CouponModel;", "Landroid/os/Parcelable;", "", "other", "", "equals", "", "hashCode", "", "a", "", "l", "p", "q", "Lcom/carrefour/fid/android/data/entities/coupons/CouponType;", "r", "s", "t", "u", "v", "", "b", "c", "", "d", "()Ljava/lang/Double;", "Lcom/carrefour/fid/android/domain/models/DiscountType;", "e", "f", "Lcom/carrefour/fid/android/data/entities/coupons/CouponStatus;", "g", "Lcom/carrefour/fid/android/presentation/models/Image;", "h", "i", "j", "Lcom/carrefour/fid/android/presentation/models/Facility;", "k", "m", "Lcom/carrefour/fid/android/presentation/models/CouponModel$State;", "n", "o", "ean13", "description", "descriptionField", "category", "couponType", "validityStartDate", "validityEndDate", "priority", "couponSubType", "stores", "storeType", "benefitsValue", "discountType", "reimbursementType", "status", "image", "articles", "requirements", "facility", "promotionChannel", "state", "emissionDate", "w", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/coupons/CouponType;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Lcom/carrefour/fid/android/domain/models/DiscountType;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/coupons/CouponStatus;Lcom/carrefour/fid/android/presentation/models/Image;Ljava/util/List;Ljava/lang/String;Lcom/carrefour/fid/android/presentation/models/Facility;Ljava/lang/String;Lcom/carrefour/fid/android/presentation/models/CouponModel$State;Ljava/lang/String;)Lcom/carrefour/fid/android/presentation/models/CouponModel;", "toString", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "J", "H", "()J", "Ljava/lang/String;", "E", "()Ljava/lang/String;", "F", "B", "Lcom/carrefour/fid/android/data/entities/coupons/CouponType;", "D", "()Lcom/carrefour/fid/android/data/entities/coupons/CouponType;", "W", "V", "N", "C", "x", "Ljava/util/List;", "U", "()Ljava/util/List;", "y", "T", "z", "Ljava/lang/Double;", "X", "Lcom/carrefour/fid/android/domain/models/DiscountType;", "G", "()Lcom/carrefour/fid/android/domain/models/DiscountType;", "Y", "P", "Z", "Lcom/carrefour/fid/android/data/entities/coupons/CouponStatus;", "S", "()Lcom/carrefour/fid/android/data/entities/coupons/CouponStatus;", "E0", "Lcom/carrefour/fid/android/presentation/models/Image;", "M", "()Lcom/carrefour/fid/android/presentation/models/Image;", "F0", "G0", "Q", "H0", "Lcom/carrefour/fid/android/presentation/models/Facility;", "()Lcom/carrefour/fid/android/presentation/models/Facility;", "I0", "O", "J0", "Lcom/carrefour/fid/android/presentation/models/CouponModel$State;", "R", "()Lcom/carrefour/fid/android/presentation/models/CouponModel$State;", "K0", "I", "L", "id", "isSelected", "()Z", "A", "canBeUsed", "K", "hasAFutureValidityStartDate", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/coupons/CouponType;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Lcom/carrefour/fid/android/domain/models/DiscountType;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/coupons/CouponStatus;Lcom/carrefour/fid/android/presentation/models/Image;Ljava/util/List;Ljava/lang/String;Lcom/carrefour/fid/android/presentation/models/Facility;Ljava/lang/String;Lcom/carrefour/fid/android/presentation/models/CouponModel$State;Ljava/lang/String;)V", "State", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class CouponModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CouponModel> CREATOR = new C38419a();

    /* renamed from: L0 */
    public static final int f97314L0 = 8;
    @C12580l

    /* renamed from: E0 */
    public final Image f97315E0;
    @C12579k

    /* renamed from: F0 */
    public final List<String> f97316F0;
    @C12579k

    /* renamed from: G0 */
    public final String f97317G0;
    @C12580l

    /* renamed from: H0 */
    public final Facility f97318H0;
    @C12579k

    /* renamed from: I0 */
    public final String f97319I0;
    @C12579k

    /* renamed from: J0 */
    public final State f97320J0;
    @C12579k

    /* renamed from: K0 */
    public final String f97321K0;
    @C12579k

    /* renamed from: X */
    public final DiscountType f97322X;
    @C12579k

    /* renamed from: Y */
    public final String f97323Y;
    @C12579k

    /* renamed from: Z */
    public final CouponStatus f97324Z;

    /* renamed from: a */
    public final long f97325a;
    @C12579k

    /* renamed from: b */
    public final String f97326b;
    @C12579k

    /* renamed from: c */
    public final String f97327c;
    @C12579k

    /* renamed from: d */
    public final String f97328d;
    @C12579k

    /* renamed from: e */
    public final CouponType f97329e;
    @C12579k

    /* renamed from: f */
    public final String f97330f;
    @C12579k

    /* renamed from: g */
    public final String f97331g;

    /* renamed from: v */
    public final long f97332v;
    @C12579k

    /* renamed from: w */
    public final String f97333w;
    @C12579k

    /* renamed from: x */
    public final List<String> f97334x;
    @C12579k

    /* renamed from: y */
    public final String f97335y;
    @C12580l

    /* renamed from: z */
    public final Double f97336z;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/CouponModel$State;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum State {
        NEUTRAL,
        ACTIVATED,
        ERROR
    }

    /* renamed from: com.carrefour.fid.android.presentation.models.CouponModel$a */
    public static final class C38419a implements Parcelable.Creator<CouponModel> {
        @C12579k
        /* renamed from: a */
        public final CouponModel createFromParcel(@C12579k Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            CouponType valueOf = CouponType.valueOf(parcel.readString());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            long readLong2 = parcel.readLong();
            String readString6 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString7 = parcel.readString();
            Facility facility = null;
            Double valueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            DiscountType valueOf3 = DiscountType.valueOf(parcel.readString());
            String readString8 = parcel.readString();
            CouponStatus valueOf4 = CouponStatus.valueOf(parcel.readString());
            Image createFromParcel = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel2);
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            String readString9 = parcel.readString();
            if (parcel.readInt() != 0) {
                facility = Facility.CREATOR.createFromParcel(parcel2);
            }
            return new CouponModel(readLong, readString, readString2, readString3, valueOf, readString4, readString5, readLong2, readString6, createStringArrayList, readString7, valueOf2, valueOf3, readString8, valueOf4, createFromParcel, createStringArrayList2, readString9, facility, parcel.readString(), State.valueOf(parcel.readString()), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final CouponModel[] newArray(int i) {
            return new CouponModel[i];
        }
    }

    public CouponModel() {
        this(0, (String) null, (String) null, (String) null, (CouponType) null, (String) null, (String) null, 0, (String) null, (List) null, (String) null, (Double) null, (DiscountType) null, (String) null, (CouponStatus) null, (Image) null, (List) null, (String) null, (Facility) null, (String) null, (State) null, (String) null, 4194303, (DefaultConstructorMarker) null);
    }

    /* renamed from: x */
    public static /* synthetic */ CouponModel m159022x(CouponModel couponModel, long j, String str, String str2, String str3, CouponType couponType, String str4, String str5, long j2, String str6, List list, String str7, Double d, DiscountType discountType, String str8, CouponStatus couponStatus, Image image, List list2, String str9, Facility facility, String str10, State state, String str11, int i, Object obj) {
        CouponModel couponModel2 = couponModel;
        int i2 = i;
        return couponModel.mo121435w((i2 & 1) != 0 ? couponModel2.f97325a : j, (i2 & 2) != 0 ? couponModel2.f97326b : str, (i2 & 4) != 0 ? couponModel2.f97327c : str2, (i2 & 8) != 0 ? couponModel2.f97328d : str3, (i2 & 16) != 0 ? couponModel2.f97329e : couponType, (i2 & 32) != 0 ? couponModel2.f97330f : str4, (i2 & 64) != 0 ? couponModel2.f97331g : str5, (i2 & 128) != 0 ? couponModel2.f97332v : j2, (i2 & 256) != 0 ? couponModel2.f97333w : str6, (i2 & 512) != 0 ? couponModel2.f97334x : list, (i2 & 1024) != 0 ? couponModel2.f97335y : str7, (i2 & 2048) != 0 ? couponModel2.f97336z : d, (i2 & 4096) != 0 ? couponModel2.f97322X : discountType, (i2 & 8192) != 0 ? couponModel2.f97323Y : str8, (i2 & 16384) != 0 ? couponModel2.f97324Z : couponStatus, (i2 & 32768) != 0 ? couponModel2.f97315E0 : image, (i2 & 65536) != 0 ? couponModel2.f97316F0 : list2, (i2 & 131072) != 0 ? couponModel2.f97317G0 : str9, (i2 & 262144) != 0 ? couponModel2.f97318H0 : facility, (i2 & 524288) != 0 ? couponModel2.f97319I0 : str10, (i2 & 1048576) != 0 ? couponModel2.f97320J0 : state, (i2 & 2097152) != 0 ? couponModel2.f97321K0 : str11);
    }

    /* renamed from: A */
    public final boolean mo121385A() {
        return CouponStatus.Companion.mo110929a().contains(this.f97324Z);
    }

    @C12579k
    /* renamed from: B */
    public final String mo121386B() {
        return this.f97328d;
    }

    @C12579k
    /* renamed from: C */
    public final String mo121387C() {
        return this.f97333w;
    }

    @C12579k
    /* renamed from: D */
    public final CouponType mo121388D() {
        return this.f97329e;
    }

    @C12579k
    /* renamed from: E */
    public final String mo121389E() {
        return this.f97326b;
    }

    @C12579k
    /* renamed from: F */
    public final String mo121390F() {
        return this.f97327c;
    }

    @C12579k
    /* renamed from: G */
    public final DiscountType mo121391G() {
        return this.f97322X;
    }

    /* renamed from: H */
    public final long mo121392H() {
        return this.f97325a;
    }

    @C12579k
    /* renamed from: I */
    public final String mo121393I() {
        return this.f97321K0;
    }

    @C12580l
    /* renamed from: J */
    public final Facility mo121394J() {
        return this.f97318H0;
    }

    /* renamed from: K */
    public final boolean mo121395K() {
        return C28932h.f70914a.mo84236f(this.f97330f, 0);
    }

    @C12579k
    /* renamed from: L */
    public final String mo121396L() {
        long j = this.f97325a;
        String str = this.f97321K0;
        return j + str;
    }

    @C12580l
    /* renamed from: M */
    public final Image mo121397M() {
        return this.f97315E0;
    }

    /* renamed from: N */
    public final long mo121398N() {
        return this.f97332v;
    }

    @C12579k
    /* renamed from: O */
    public final String mo121399O() {
        return this.f97319I0;
    }

    @C12579k
    /* renamed from: P */
    public final String mo121400P() {
        return this.f97323Y;
    }

    @C12579k
    /* renamed from: Q */
    public final String mo121401Q() {
        return this.f97317G0;
    }

    @C12579k
    /* renamed from: R */
    public final State mo121402R() {
        return this.f97320J0;
    }

    @C12579k
    /* renamed from: S */
    public final CouponStatus mo121403S() {
        return this.f97324Z;
    }

    @C12579k
    /* renamed from: T */
    public final String mo121404T() {
        return this.f97335y;
    }

    @C12579k
    /* renamed from: U */
    public final List<String> mo121405U() {
        return this.f97334x;
    }

    @C12579k
    /* renamed from: V */
    public final String mo121406V() {
        return this.f97331g;
    }

    @C12579k
    /* renamed from: W */
    public final String mo121407W() {
        return this.f97330f;
    }

    /* renamed from: a */
    public final long mo121408a() {
        return this.f97325a;
    }

    @C12579k
    /* renamed from: b */
    public final List<String> mo121409b() {
        return this.f97334x;
    }

    @C12579k
    /* renamed from: c */
    public final String mo121410c() {
        return this.f97335y;
    }

    @C12580l
    /* renamed from: d */
    public final Double mo121411d() {
        return this.f97336z;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final DiscountType mo121413e() {
        return this.f97322X;
    }

    public boolean equals(@C12580l Object obj) {
        if (!(obj instanceof CouponModel)) {
            return false;
        }
        CouponModel couponModel = (CouponModel) obj;
        if (this.f97325a == couponModel.f97325a && this.f97329e == couponModel.f97329e && this.f97324Z == couponModel.f97324Z && this.f97320J0 == couponModel.f97320J0) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f */
    public final String mo121415f() {
        return this.f97323Y;
    }

    @C12579k
    /* renamed from: g */
    public final CouponStatus mo121416g() {
        return this.f97324Z;
    }

    @C12580l
    /* renamed from: h */
    public final Image mo121417h() {
        return this.f97315E0;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f97325a) * 31) + this.f97329e.hashCode()) * 31) + this.f97324Z.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final List<String> mo121419i() {
        return this.f97316F0;
    }

    public final boolean isSelected() {
        return CouponStatus.Companion.mo110931c().contains(this.f97324Z);
    }

    @C12579k
    /* renamed from: j */
    public final String mo121421j() {
        return this.f97317G0;
    }

    @C12580l
    /* renamed from: k */
    public final Facility mo121422k() {
        return this.f97318H0;
    }

    @C12579k
    /* renamed from: l */
    public final String mo121423l() {
        return this.f97326b;
    }

    @C12579k
    /* renamed from: m */
    public final String mo121424m() {
        return this.f97319I0;
    }

    @C12579k
    /* renamed from: n */
    public final State mo121425n() {
        return this.f97320J0;
    }

    @C12579k
    /* renamed from: o */
    public final String mo121426o() {
        return this.f97321K0;
    }

    @C12579k
    /* renamed from: p */
    public final String mo121427p() {
        return this.f97327c;
    }

    @C12579k
    /* renamed from: q */
    public final String mo121428q() {
        return this.f97328d;
    }

    @C12579k
    /* renamed from: r */
    public final CouponType mo121429r() {
        return this.f97329e;
    }

    @C12579k
    /* renamed from: s */
    public final String mo121430s() {
        return this.f97330f;
    }

    @C12579k
    /* renamed from: t */
    public final String mo121431t() {
        return this.f97331g;
    }

    @C12579k
    public String toString() {
        long j = this.f97325a;
        String str = this.f97326b;
        String str2 = this.f97327c;
        String str3 = this.f97328d;
        CouponType couponType = this.f97329e;
        String str4 = this.f97330f;
        String str5 = this.f97331g;
        long j2 = this.f97332v;
        String str6 = this.f97333w;
        List<String> list = this.f97334x;
        String str7 = this.f97335y;
        Double d = this.f97336z;
        DiscountType discountType = this.f97322X;
        String str8 = this.f97323Y;
        CouponStatus couponStatus = this.f97324Z;
        Image image = this.f97315E0;
        List<String> list2 = this.f97316F0;
        String str9 = this.f97317G0;
        Facility facility = this.f97318H0;
        String str10 = this.f97319I0;
        State state = this.f97320J0;
        String str11 = this.f97321K0;
        return "CouponModel(ean13=" + j + ", description=" + str + ", descriptionField=" + str2 + ", category=" + str3 + ", couponType=" + couponType + ", validityStartDate=" + str4 + ", validityEndDate=" + str5 + ", priority=" + j2 + ", couponSubType=" + str6 + ", stores=" + list + ", storeType=" + str7 + ", benefitsValue=" + d + ", discountType=" + discountType + ", reimbursementType=" + str8 + ", status=" + couponStatus + ", image=" + image + ", articles=" + list2 + ", requirements=" + str9 + ", facility=" + facility + ", promotionChannel=" + str10 + ", state=" + state + ", emissionDate=" + str11 + ")";
    }

    /* renamed from: u */
    public final long mo121433u() {
        return this.f97332v;
    }

    @C12579k
    /* renamed from: v */
    public final String mo121434v() {
        return this.f97333w;
    }

    @C12579k
    /* renamed from: w */
    public final CouponModel mo121435w(long j, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k CouponType couponType, @C12579k String str4, @C12579k String str5, long j2, @C12579k String str6, @C12579k List<String> list, @C12579k String str7, @C12580l Double d, @C12579k DiscountType discountType, @C12579k String str8, @C12579k CouponStatus couponStatus, @C12580l Image image, @C12579k List<String> list2, @C12579k String str9, @C12580l Facility facility, @C12579k String str10, @C12579k State state, @C12579k String str11) {
        long j3 = j;
        Intrinsics.checkNotNullParameter(str, "description");
        Intrinsics.checkNotNullParameter(str2, "descriptionField");
        Intrinsics.checkNotNullParameter(str3, "category");
        Intrinsics.checkNotNullParameter(couponType, "couponType");
        Intrinsics.checkNotNullParameter(str4, "validityStartDate");
        Intrinsics.checkNotNullParameter(str5, "validityEndDate");
        Intrinsics.checkNotNullParameter(str6, "couponSubType");
        Intrinsics.checkNotNullParameter(list, "stores");
        Intrinsics.checkNotNullParameter(str7, "storeType");
        Intrinsics.checkNotNullParameter(discountType, "discountType");
        Intrinsics.checkNotNullParameter(str8, "reimbursementType");
        Intrinsics.checkNotNullParameter(couponStatus, "status");
        Intrinsics.checkNotNullParameter(list2, "articles");
        Intrinsics.checkNotNullParameter(str9, "requirements");
        Intrinsics.checkNotNullParameter(str10, "promotionChannel");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(str11, "emissionDate");
        return new CouponModel(j, str, str2, str3, couponType, str4, str5, j2, str6, list, str7, d, discountType, str8, couponStatus, image, list2, str9, facility, str10, state, str11);
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.f97325a);
        parcel.writeString(this.f97326b);
        parcel.writeString(this.f97327c);
        parcel.writeString(this.f97328d);
        parcel.writeString(this.f97329e.name());
        parcel.writeString(this.f97330f);
        parcel.writeString(this.f97331g);
        parcel.writeLong(this.f97332v);
        parcel.writeString(this.f97333w);
        parcel.writeStringList(this.f97334x);
        parcel.writeString(this.f97335y);
        Double d = this.f97336z;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f97322X.name());
        parcel.writeString(this.f97323Y);
        parcel.writeString(this.f97324Z.name());
        Image image = this.f97315E0;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.f97316F0);
        parcel.writeString(this.f97317G0);
        Facility facility = this.f97318H0;
        if (facility == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            facility.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f97319I0);
        parcel.writeString(this.f97320J0.name());
        parcel.writeString(this.f97321K0);
    }

    @C12579k
    /* renamed from: y */
    public final List<String> mo121437y() {
        return this.f97316F0;
    }

    @C12580l
    /* renamed from: z */
    public final Double mo121438z() {
        return this.f97336z;
    }

    public CouponModel(long j, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k CouponType couponType, @C12579k String str4, @C12579k String str5, long j2, @C12579k String str6, @C12579k List<String> list, @C12579k String str7, @C12580l Double d, @C12579k DiscountType discountType, @C12579k String str8, @C12579k CouponStatus couponStatus, @C12580l Image image, @C12579k List<String> list2, @C12579k String str9, @C12580l Facility facility, @C12579k String str10, @C12579k State state, @C12579k String str11) {
        String str12 = str;
        String str13 = str2;
        String str14 = str3;
        CouponType couponType2 = couponType;
        String str15 = str4;
        String str16 = str5;
        String str17 = str6;
        List<String> list3 = list;
        String str18 = str7;
        DiscountType discountType2 = discountType;
        String str19 = str8;
        CouponStatus couponStatus2 = couponStatus;
        List<String> list4 = list2;
        State state2 = state;
        Intrinsics.checkNotNullParameter(str12, "description");
        Intrinsics.checkNotNullParameter(str13, "descriptionField");
        Intrinsics.checkNotNullParameter(str14, "category");
        Intrinsics.checkNotNullParameter(couponType2, "couponType");
        Intrinsics.checkNotNullParameter(str15, "validityStartDate");
        Intrinsics.checkNotNullParameter(str16, "validityEndDate");
        Intrinsics.checkNotNullParameter(str17, "couponSubType");
        Intrinsics.checkNotNullParameter(list3, "stores");
        Intrinsics.checkNotNullParameter(str18, "storeType");
        Intrinsics.checkNotNullParameter(discountType2, "discountType");
        Intrinsics.checkNotNullParameter(str19, "reimbursementType");
        Intrinsics.checkNotNullParameter(couponStatus2, "status");
        Intrinsics.checkNotNullParameter(list4, "articles");
        Intrinsics.checkNotNullParameter(str9, "requirements");
        Intrinsics.checkNotNullParameter(str10, "promotionChannel");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(str11, "emissionDate");
        this.f97325a = j;
        this.f97326b = str12;
        this.f97327c = str13;
        this.f97328d = str14;
        this.f97329e = couponType2;
        this.f97330f = str15;
        this.f97331g = str16;
        this.f97332v = j2;
        this.f97333w = str17;
        this.f97334x = list3;
        this.f97335y = str18;
        this.f97336z = d;
        this.f97322X = discountType2;
        this.f97323Y = str19;
        this.f97324Z = couponStatus2;
        this.f97315E0 = image;
        this.f97316F0 = list4;
        this.f97317G0 = str9;
        this.f97318H0 = facility;
        this.f97319I0 = str10;
        this.f97320J0 = state;
        this.f97321K0 = str11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CouponModel(long r25, java.lang.String r27, java.lang.String r28, java.lang.String r29, com.carrefour.fid.android.data.entities.coupons.CouponType r30, java.lang.String r31, java.lang.String r32, long r33, java.lang.String r35, java.util.List r36, java.lang.String r37, java.lang.Double r38, com.carrefour.fid.android.domain.models.DiscountType r39, java.lang.String r40, com.carrefour.fid.android.data.entities.coupons.CouponStatus r41, com.carrefour.fid.android.presentation.models.Image r42, java.util.List r43, java.lang.String r44, com.carrefour.fid.android.presentation.models.Facility r45, java.lang.String r46, com.carrefour.fid.android.presentation.models.CouponModel.State r47, java.lang.String r48, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
        /*
            r24 = this;
            r0 = r49
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r25
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = new java.lang.String
            r1.<init>()
            goto L_0x0018
        L_0x0016:
            r1 = r27
        L_0x0018:
            r6 = r0 & 4
            if (r6 == 0) goto L_0x0022
            java.lang.String r6 = new java.lang.String
            r6.<init>()
            goto L_0x0024
        L_0x0022:
            r6 = r28
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002e
            java.lang.String r7 = new java.lang.String
            r7.<init>()
            goto L_0x0030
        L_0x002e:
            r7 = r29
        L_0x0030:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0037
            com.carrefour.fid.android.data.entities.coupons.CouponType r8 = com.carrefour.fid.android.data.entities.coupons.CouponType.UNKNOWN
            goto L_0x0039
        L_0x0037:
            r8 = r30
        L_0x0039:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0043
            java.lang.String r9 = new java.lang.String
            r9.<init>()
            goto L_0x0045
        L_0x0043:
            r9 = r31
        L_0x0045:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x004f
            java.lang.String r10 = new java.lang.String
            r10.<init>()
            goto L_0x0051
        L_0x004f:
            r10 = r32
        L_0x0051:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r2 = r33
        L_0x0058:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0062
            java.lang.String r11 = new java.lang.String
            r11.<init>()
            goto L_0x0064
        L_0x0062:
            r11 = r35
        L_0x0064:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x006d
            java.util.List r12 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x006f
        L_0x006d:
            r12 = r36
        L_0x006f:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0079
            java.lang.String r13 = new java.lang.String
            r13.<init>()
            goto L_0x007b
        L_0x0079:
            r13 = r37
        L_0x007b:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0081
            r14 = 0
            goto L_0x0083
        L_0x0081:
            r14 = r38
        L_0x0083:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x008a
            com.carrefour.fid.android.domain.models.DiscountType r15 = com.carrefour.fid.android.domain.models.DiscountType.UNKNOWN
            goto L_0x008c
        L_0x008a:
            r15 = r39
        L_0x008c:
            r50 = r15
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0098
            java.lang.String r15 = new java.lang.String
            r15.<init>()
            goto L_0x009a
        L_0x0098:
            r15 = r40
        L_0x009a:
            r16 = r15
            r15 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x00a3
            com.carrefour.fid.android.data.entities.coupons.CouponStatus r15 = com.carrefour.fid.android.data.entities.coupons.CouponStatus.UNKNOWN
            goto L_0x00a5
        L_0x00a3:
            r15 = r41
        L_0x00a5:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x00af
            r17 = 0
            goto L_0x00b1
        L_0x00af:
            r17 = r42
        L_0x00b1:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00bc
            java.util.List r18 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x00be
        L_0x00bc:
            r18 = r43
        L_0x00be:
            r19 = 131072(0x20000, float:1.83671E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00ca
            java.lang.String r19 = new java.lang.String
            r19.<init>()
            goto L_0x00cc
        L_0x00ca:
            r19 = r44
        L_0x00cc:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00d5
            r20 = 0
            goto L_0x00d7
        L_0x00d5:
            r20 = r45
        L_0x00d7:
            r21 = 524288(0x80000, float:7.34684E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00e3
            java.lang.String r21 = new java.lang.String
            r21.<init>()
            goto L_0x00e5
        L_0x00e3:
            r21 = r46
        L_0x00e5:
            r22 = 1048576(0x100000, float:1.469368E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00ee
            com.carrefour.fid.android.presentation.models.CouponModel$State r22 = com.carrefour.fid.android.presentation.models.CouponModel.State.NEUTRAL
            goto L_0x00f0
        L_0x00ee:
            r22 = r47
        L_0x00f0:
            r23 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r23
            if (r0 == 0) goto L_0x00fc
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            goto L_0x00fe
        L_0x00fc:
            r0 = r48
        L_0x00fe:
            r25 = r24
            r26 = r4
            r28 = r1
            r29 = r6
            r30 = r7
            r31 = r8
            r32 = r9
            r33 = r10
            r34 = r2
            r36 = r11
            r37 = r12
            r38 = r13
            r39 = r14
            r40 = r50
            r41 = r16
            r42 = r15
            r43 = r17
            r44 = r18
            r45 = r19
            r46 = r20
            r47 = r21
            r48 = r22
            r49 = r0
            r25.<init>(r26, r28, r29, r30, r31, r32, r33, r34, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.CouponModel.<init>(long, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.data.entities.coupons.CouponType, java.lang.String, java.lang.String, long, java.lang.String, java.util.List, java.lang.String, java.lang.Double, com.carrefour.fid.android.domain.models.DiscountType, java.lang.String, com.carrefour.fid.android.data.entities.coupons.CouponStatus, com.carrefour.fid.android.presentation.models.Image, java.util.List, java.lang.String, com.carrefour.fid.android.presentation.models.Facility, java.lang.String, com.carrefour.fid.android.presentation.models.CouponModel$State, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
