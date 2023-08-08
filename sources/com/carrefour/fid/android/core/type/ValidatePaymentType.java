package com.carrefour.fid.android.core.type;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/ValidatePaymentType;", "Landroid/os/Parcelable;", "()V", "InitPayment", "IsOnSite", "Lcom/carrefour/fid/android/core/type/ValidatePaymentType$InitPayment;", "Lcom/carrefour/fid/android/core/type/ValidatePaymentType$IsOnSite;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
public abstract class ValidatePaymentType implements Parcelable {

    /* renamed from: a */
    public static final int f89959a = 0;

    @C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/ValidatePaymentType$InitPayment;", "Lcom/carrefour/fid/android/core/type/ValidatePaymentType;", "", "a", "userLoyaltyAmount", "b", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class InitPayment extends ValidatePaymentType {
        @C12579k
        public static final Parcelable.Creator<InitPayment> CREATOR = new C36366a();

        /* renamed from: c */
        public static final int f89960c = 0;
        @C12579k

        /* renamed from: b */
        public final String f89961b;

        /* renamed from: com.carrefour.fid.android.core.type.ValidatePaymentType$InitPayment$a */
        public static final class C36366a implements Parcelable.Creator<InitPayment> {
            @C12579k
            /* renamed from: a */
            public final InitPayment createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitPayment(parcel.readString());
            }

            @C12579k
            /* renamed from: b */
            public final InitPayment[] newArray(int i) {
                return new InitPayment[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InitPayment(@C12579k String str) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "userLoyaltyAmount");
            this.f89961b = str;
        }

        /* renamed from: c */
        public static /* synthetic */ InitPayment m149179c(InitPayment initPayment, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initPayment.f89961b;
            }
            return initPayment.mo108596b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo108595a() {
            return this.f89961b;
        }

        @C12579k
        /* renamed from: b */
        public final InitPayment mo108596b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "userLoyaltyAmount");
            return new InitPayment(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo108597d() {
            return this.f89961b;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitPayment) && Intrinsics.areEqual((Object) this.f89961b, (Object) ((InitPayment) obj).f89961b);
        }

        public int hashCode() {
            return this.f89961b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f89961b;
            return "InitPayment(userLoyaltyAmount=" + str + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f89961b);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/ValidatePaymentType$IsOnSite;", "Lcom/carrefour/fid/android/core/type/ValidatePaymentType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class IsOnSite extends ValidatePaymentType {
        @C12579k
        public static final Parcelable.Creator<IsOnSite> CREATOR = new C36367a();
        @C12579k

        /* renamed from: b */
        public static final IsOnSite f89962b = new IsOnSite();

        /* renamed from: c */
        public static final int f89963c = 0;

        /* renamed from: com.carrefour.fid.android.core.type.ValidatePaymentType$IsOnSite$a */
        public static final class C36367a implements Parcelable.Creator<IsOnSite> {
            @C12579k
            /* renamed from: a */
            public final IsOnSite createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IsOnSite.f89962b;
            }

            @C12579k
            /* renamed from: b */
            public final IsOnSite[] newArray(int i) {
                return new IsOnSite[i];
            }
        }

        public IsOnSite() {
            super((DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ ValidatePaymentType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public ValidatePaymentType() {
    }
}
