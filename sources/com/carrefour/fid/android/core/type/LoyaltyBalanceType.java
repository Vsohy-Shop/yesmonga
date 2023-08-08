package com.carrefour.fid.android.core.type;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0324b1;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0003\u0003\n\u000bB\u0013\b\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\u0001\u0002\f\r¨\u0006\u000e"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/LoyaltyBalanceType;", "Landroid/os/Parcelable;", "", "a", "I", "()I", "labelResId", "<init>", "(I)V", "b", "LoyaltyBalanceDelivery", "LoyaltyBalanceNotEmpty", "Lcom/carrefour/fid/android/core/type/LoyaltyBalanceType$LoyaltyBalanceDelivery;", "Lcom/carrefour/fid/android/core/type/LoyaltyBalanceType$LoyaltyBalanceNotEmpty;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public abstract class LoyaltyBalanceType implements Parcelable {
    @C12579k

    /* renamed from: b */
    public static final C36361a f89878b = new C36361a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f89879c = 0;
    @C12579k

    /* renamed from: d */
    public static final String f89880d = "0.0";

    /* renamed from: a */
    public final int f89881a;

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/LoyaltyBalanceType$LoyaltyBalanceDelivery;", "Lcom/carrefour/fid/android/core/type/LoyaltyBalanceType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class LoyaltyBalanceDelivery extends LoyaltyBalanceType {
        @C12579k
        public static final Parcelable.Creator<LoyaltyBalanceDelivery> CREATOR = new C36359a();
        @C12579k

        /* renamed from: e */
        public static final LoyaltyBalanceDelivery f89882e = new LoyaltyBalanceDelivery();

        /* renamed from: f */
        public static final int f89883f = 0;

        /* renamed from: com.carrefour.fid.android.core.type.LoyaltyBalanceType$LoyaltyBalanceDelivery$a */
        public static final class C36359a implements Parcelable.Creator<LoyaltyBalanceDelivery> {
            @C12579k
            /* renamed from: a */
            public final LoyaltyBalanceDelivery createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LoyaltyBalanceDelivery.f89882e;
            }

            @C12579k
            /* renamed from: b */
            public final LoyaltyBalanceDelivery[] newArray(int i) {
                return new LoyaltyBalanceDelivery[i];
            }
        }

        public LoyaltyBalanceDelivery() {
            super(R.string.checkout_fid_delivery, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/LoyaltyBalanceType$LoyaltyBalanceNotEmpty;", "Lcom/carrefour/fid/android/core/type/LoyaltyBalanceType;", "", "b", "", "c", "d", "loyaltyAmount", "loyaltyEnabled", "desiredLoyaltyAmount", "e", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "f", "Z", "i", "()Z", "g", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class LoyaltyBalanceNotEmpty extends LoyaltyBalanceType {
        @C12579k
        public static final Parcelable.Creator<LoyaltyBalanceNotEmpty> CREATOR = new C36360a();

        /* renamed from: v */
        public static final int f89884v = 0;
        @C12579k

        /* renamed from: e */
        public final String f89885e;

        /* renamed from: f */
        public final boolean f89886f;
        @C12579k

        /* renamed from: g */
        public final String f89887g;

        /* renamed from: com.carrefour.fid.android.core.type.LoyaltyBalanceType$LoyaltyBalanceNotEmpty$a */
        public static final class C36360a implements Parcelable.Creator<LoyaltyBalanceNotEmpty> {
            @C12579k
            /* renamed from: a */
            public final LoyaltyBalanceNotEmpty createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoyaltyBalanceNotEmpty(parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @C12579k
            /* renamed from: b */
            public final LoyaltyBalanceNotEmpty[] newArray(int i) {
                return new LoyaltyBalanceNotEmpty[i];
            }
        }

        public LoyaltyBalanceNotEmpty() {
            this((String) null, false, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: f */
        public static /* synthetic */ LoyaltyBalanceNotEmpty m149144f(LoyaltyBalanceNotEmpty loyaltyBalanceNotEmpty, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loyaltyBalanceNotEmpty.f89885e;
            }
            if ((i & 2) != 0) {
                z = loyaltyBalanceNotEmpty.f89886f;
            }
            if ((i & 4) != 0) {
                str2 = loyaltyBalanceNotEmpty.f89887g;
            }
            return loyaltyBalanceNotEmpty.mo108553e(str, z, str2);
        }

        @C12579k
        /* renamed from: b */
        public final String mo108549b() {
            return this.f89885e;
        }

        /* renamed from: c */
        public final boolean mo108550c() {
            return this.f89886f;
        }

        @C12579k
        /* renamed from: d */
        public final String mo108551d() {
            return this.f89887g;
        }

        public int describeContents() {
            return 0;
        }

        @C12579k
        /* renamed from: e */
        public final LoyaltyBalanceNotEmpty mo108553e(@C12579k String str, boolean z, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "loyaltyAmount");
            Intrinsics.checkNotNullParameter(str2, "desiredLoyaltyAmount");
            return new LoyaltyBalanceNotEmpty(str, z, str2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoyaltyBalanceNotEmpty)) {
                return false;
            }
            LoyaltyBalanceNotEmpty loyaltyBalanceNotEmpty = (LoyaltyBalanceNotEmpty) obj;
            return Intrinsics.areEqual((Object) this.f89885e, (Object) loyaltyBalanceNotEmpty.f89885e) && this.f89886f == loyaltyBalanceNotEmpty.f89886f && Intrinsics.areEqual((Object) this.f89887g, (Object) loyaltyBalanceNotEmpty.f89887g);
        }

        @C12579k
        /* renamed from: g */
        public final String mo108555g() {
            return this.f89887g;
        }

        @C12579k
        /* renamed from: h */
        public final String mo108556h() {
            return this.f89885e;
        }

        public int hashCode() {
            int hashCode = this.f89885e.hashCode() * 31;
            boolean z = this.f89886f;
            if (z) {
                z = true;
            }
            return ((hashCode + (z ? 1 : 0)) * 31) + this.f89887g.hashCode();
        }

        /* renamed from: i */
        public final boolean mo108558i() {
            return this.f89886f;
        }

        @C12579k
        public String toString() {
            String str = this.f89885e;
            boolean z = this.f89886f;
            String str2 = this.f89887g;
            return "LoyaltyBalanceNotEmpty(loyaltyAmount=" + str + ", loyaltyEnabled=" + z + ", desiredLoyaltyAmount=" + str2 + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f89885e);
            parcel.writeInt(this.f89886f ? 1 : 0);
            parcel.writeString(this.f89887g);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LoyaltyBalanceNotEmpty(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "0.0" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "0.0" : str2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LoyaltyBalanceNotEmpty(@C12579k String str, boolean z, @C12579k String str2) {
            super(R.string.checkout_your_fid_text, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "loyaltyAmount");
            Intrinsics.checkNotNullParameter(str2, "desiredLoyaltyAmount");
            this.f89885e = str;
            this.f89886f = z;
            this.f89887g = str2;
        }
    }

    /* renamed from: com.carrefour.fid.android.core.type.LoyaltyBalanceType$a */
    public static final class C36361a {
        public /* synthetic */ C36361a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C36361a() {
        }
    }

    public /* synthetic */ LoyaltyBalanceType(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* renamed from: a */
    public final int mo108542a() {
        return this.f89881a;
    }

    public LoyaltyBalanceType(@C0324b1 int i) {
        this.f89881a = i;
    }
}
