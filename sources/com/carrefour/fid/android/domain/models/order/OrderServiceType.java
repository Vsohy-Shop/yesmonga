package com.carrefour.fid.android.domain.models.order;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/order/OrderServiceType;", "Landroid/os/Parcelable;", "<init>", "()V", "Clcv", "Drive", "DriveExpressPickup", "a", "H1h3", "Mktp", "R2h", "Unknown", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$Clcv;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$Drive;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$DriveExpressPickup;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$H1h3;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$Mktp;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$R2h;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$Unknown;", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public abstract class OrderServiceType implements Parcelable {

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$Clcv;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Clcv extends OrderServiceType {
        @C12579k
        public static final Parcelable.Creator<Clcv> CREATOR = new C38070a();
        @C12579k

        /* renamed from: a */
        public static final Clcv f96189a = new Clcv();

        /* renamed from: com.carrefour.fid.android.domain.models.order.OrderServiceType$Clcv$a */
        public static final class C38070a implements Parcelable.Creator<Clcv> {
            @C12579k
            /* renamed from: a */
            public final Clcv createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Clcv.f96189a;
            }

            @C12579k
            /* renamed from: b */
            public final Clcv[] newArray(int i) {
                return new Clcv[i];
            }
        }

        public Clcv() {
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

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003HÖ\u0001¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$Drive;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$a;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Drive extends OrderServiceType implements C38077a {
        @C12579k
        public static final Parcelable.Creator<Drive> CREATOR = new C38071a();
        @C12579k

        /* renamed from: a */
        public static final Drive f96190a = new Drive();

        /* renamed from: com.carrefour.fid.android.domain.models.order.OrderServiceType$Drive$a */
        public static final class C38071a implements Parcelable.Creator<Drive> {
            @C12579k
            /* renamed from: a */
            public final Drive createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Drive.f96190a;
            }

            @C12579k
            /* renamed from: b */
            public final Drive[] newArray(int i) {
                return new Drive[i];
            }
        }

        public Drive() {
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

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003HÖ\u0001¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$DriveExpressPickup;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$a;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class DriveExpressPickup extends OrderServiceType implements C38077a {
        @C12579k
        public static final Parcelable.Creator<DriveExpressPickup> CREATOR = new C38072a();
        @C12579k

        /* renamed from: a */
        public static final DriveExpressPickup f96191a = new DriveExpressPickup();

        /* renamed from: com.carrefour.fid.android.domain.models.order.OrderServiceType$DriveExpressPickup$a */
        public static final class C38072a implements Parcelable.Creator<DriveExpressPickup> {
            @C12579k
            /* renamed from: a */
            public final DriveExpressPickup createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DriveExpressPickup.f96191a;
            }

            @C12579k
            /* renamed from: b */
            public final DriveExpressPickup[] newArray(int i) {
                return new DriveExpressPickup[i];
            }
        }

        public DriveExpressPickup() {
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

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$H1h3;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class H1h3 extends OrderServiceType {
        @C12579k
        public static final Parcelable.Creator<H1h3> CREATOR = new C38073a();
        @C12579k

        /* renamed from: a */
        public static final H1h3 f96192a = new H1h3();

        /* renamed from: com.carrefour.fid.android.domain.models.order.OrderServiceType$H1h3$a */
        public static final class C38073a implements Parcelable.Creator<H1h3> {
            @C12579k
            /* renamed from: a */
            public final H1h3 createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return H1h3.f96192a;
            }

            @C12579k
            /* renamed from: b */
            public final H1h3[] newArray(int i) {
                return new H1h3[i];
            }
        }

        public H1h3() {
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

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$Mktp;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Mktp extends OrderServiceType {
        @C12579k
        public static final Parcelable.Creator<Mktp> CREATOR = new C38074a();
        @C12579k

        /* renamed from: a */
        public static final Mktp f96193a = new Mktp();

        /* renamed from: com.carrefour.fid.android.domain.models.order.OrderServiceType$Mktp$a */
        public static final class C38074a implements Parcelable.Creator<Mktp> {
            @C12579k
            /* renamed from: a */
            public final Mktp createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Mktp.f96193a;
            }

            @C12579k
            /* renamed from: b */
            public final Mktp[] newArray(int i) {
                return new Mktp[i];
            }
        }

        public Mktp() {
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

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$R2h;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class R2h extends OrderServiceType {
        @C12579k
        public static final Parcelable.Creator<R2h> CREATOR = new C38075a();
        @C12579k

        /* renamed from: a */
        public static final R2h f96194a = new R2h();

        /* renamed from: com.carrefour.fid.android.domain.models.order.OrderServiceType$R2h$a */
        public static final class C38075a implements Parcelable.Creator<R2h> {
            @C12579k
            /* renamed from: a */
            public final R2h createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return R2h.f96194a;
            }

            @C12579k
            /* renamed from: b */
            public final R2h[] newArray(int i) {
                return new R2h[i];
            }
        }

        public R2h() {
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

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/order/OrderServiceType$Unknown;", "Lcom/carrefour/fid/android/domain/models/order/OrderServiceType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C12187d
    public static final class Unknown extends OrderServiceType {
        @C12579k
        public static final Parcelable.Creator<Unknown> CREATOR = new C38076a();
        @C12579k

        /* renamed from: a */
        public static final Unknown f96195a = new Unknown();

        /* renamed from: com.carrefour.fid.android.domain.models.order.OrderServiceType$Unknown$a */
        public static final class C38076a implements Parcelable.Creator<Unknown> {
            @C12579k
            /* renamed from: a */
            public final Unknown createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.f96195a;
            }

            @C12579k
            /* renamed from: b */
            public final Unknown[] newArray(int i) {
                return new Unknown[i];
            }
        }

        public Unknown() {
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

    /* renamed from: com.carrefour.fid.android.domain.models.order.OrderServiceType$a */
    public interface C38077a {
    }

    public /* synthetic */ OrderServiceType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public OrderServiceType() {
    }
}
