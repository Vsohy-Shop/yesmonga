package com.carrefour.fid.android.core.type;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/PaymentType;", "Landroid/os/Parcelable;", "()V", "PaymentOnSiteActivated", "PaymentOnSiteNotActivated", "PaymentWithDelivery", "Lcom/carrefour/fid/android/core/type/PaymentType$PaymentOnSiteActivated;", "Lcom/carrefour/fid/android/core/type/PaymentType$PaymentOnSiteNotActivated;", "Lcom/carrefour/fid/android/core/type/PaymentType$PaymentWithDelivery;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
public abstract class PaymentType implements Parcelable {

    /* renamed from: a */
    public static final int f89909a = 0;

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/PaymentType$PaymentOnSiteActivated;", "Lcom/carrefour/fid/android/core/type/PaymentType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class PaymentOnSiteActivated extends PaymentType {
        @C12579k
        public static final Parcelable.Creator<PaymentOnSiteActivated> CREATOR = new C36363a();
        @C12579k

        /* renamed from: b */
        public static final PaymentOnSiteActivated f89910b = new PaymentOnSiteActivated();

        /* renamed from: c */
        public static final int f89911c = 0;

        /* renamed from: com.carrefour.fid.android.core.type.PaymentType$PaymentOnSiteActivated$a */
        public static final class C36363a implements Parcelable.Creator<PaymentOnSiteActivated> {
            @C12579k
            /* renamed from: a */
            public final PaymentOnSiteActivated createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentOnSiteActivated.f89910b;
            }

            @C12579k
            /* renamed from: b */
            public final PaymentOnSiteActivated[] newArray(int i) {
                return new PaymentOnSiteActivated[i];
            }
        }

        public PaymentOnSiteActivated() {
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

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/PaymentType$PaymentOnSiteNotActivated;", "Lcom/carrefour/fid/android/core/type/PaymentType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class PaymentOnSiteNotActivated extends PaymentType {
        @C12579k
        public static final Parcelable.Creator<PaymentOnSiteNotActivated> CREATOR = new C36364a();
        @C12579k

        /* renamed from: b */
        public static final PaymentOnSiteNotActivated f89912b = new PaymentOnSiteNotActivated();

        /* renamed from: c */
        public static final int f89913c = 0;

        /* renamed from: com.carrefour.fid.android.core.type.PaymentType$PaymentOnSiteNotActivated$a */
        public static final class C36364a implements Parcelable.Creator<PaymentOnSiteNotActivated> {
            @C12579k
            /* renamed from: a */
            public final PaymentOnSiteNotActivated createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentOnSiteNotActivated.f89912b;
            }

            @C12579k
            /* renamed from: b */
            public final PaymentOnSiteNotActivated[] newArray(int i) {
                return new PaymentOnSiteNotActivated[i];
            }
        }

        public PaymentOnSiteNotActivated() {
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

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/PaymentType$PaymentWithDelivery;", "Lcom/carrefour/fid/android/core/type/PaymentType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class PaymentWithDelivery extends PaymentType {
        @C12579k
        public static final Parcelable.Creator<PaymentWithDelivery> CREATOR = new C36365a();
        @C12579k

        /* renamed from: b */
        public static final PaymentWithDelivery f89914b = new PaymentWithDelivery();

        /* renamed from: c */
        public static final int f89915c = 0;

        /* renamed from: com.carrefour.fid.android.core.type.PaymentType$PaymentWithDelivery$a */
        public static final class C36365a implements Parcelable.Creator<PaymentWithDelivery> {
            @C12579k
            /* renamed from: a */
            public final PaymentWithDelivery createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentWithDelivery.f89914b;
            }

            @C12579k
            /* renamed from: b */
            public final PaymentWithDelivery[] newArray(int i) {
                return new PaymentWithDelivery[i];
            }
        }

        public PaymentWithDelivery() {
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

    public /* synthetic */ PaymentType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public PaymentType() {
    }
}
