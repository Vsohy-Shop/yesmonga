package com.carrefour.fid.android.shared.domain.models.order;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0324b1;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.shared.C28444b;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000b2\u00020\u0001:\n\f\u0003\r\u000e\u0007\u000f\u0010\u0011\u0012\u0013B\u001d\b\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005\u0001\b\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "Landroid/os/Parcelable;", "", "a", "I", "()I", "iconResId", "b", "stringResId", "<init>", "(II)V", "c", "Clcv", "Drive", "DriveExpressPickup", "H1h3", "Lad", "Mktp", "R2h", "Unknown", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$Clcv;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$Drive;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$DriveExpressPickup;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$H1h3;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$Lad;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$Mktp;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$R2h;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$Unknown;", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public abstract class OrderType implements Parcelable {
    @C12579k

    /* renamed from: c */
    public static final C28689a f70276c = new C28689a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f70277d = 0;

    /* renamed from: a */
    public final int f70278a;

    /* renamed from: b */
    public final int f70279b;

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$Clcv;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Clcv extends OrderType {
        @C12579k
        public static final Parcelable.Creator<Clcv> CREATOR = new C28681a();
        @C12579k

        /* renamed from: e */
        public static final Clcv f70280e = new Clcv();

        /* renamed from: f */
        public static final int f70281f = 0;

        /* renamed from: com.carrefour.fid.android.shared.domain.models.order.OrderType$Clcv$a */
        public static final class C28681a implements Parcelable.Creator<Clcv> {
            @C12579k
            /* renamed from: a */
            public final Clcv createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Clcv.f70280e;
            }

            @C12579k
            /* renamed from: b */
            public final Clcv[] newArray(int i) {
                return new Clcv[i];
            }
        }

        public Clcv() {
            super(C28444b.C28452h.ic_livraison, C28444b.C28462r.order_type_clcv, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003HÖ\u0001¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$Drive;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$b;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Drive extends OrderType implements C28690b {
        @C12579k
        public static final Parcelable.Creator<Drive> CREATOR = new C28682a();
        @C12579k

        /* renamed from: e */
        public static final Drive f70282e = new Drive();

        /* renamed from: f */
        public static final int f70283f = 0;

        /* renamed from: com.carrefour.fid.android.shared.domain.models.order.OrderType$Drive$a */
        public static final class C28682a implements Parcelable.Creator<Drive> {
            @C12579k
            /* renamed from: a */
            public final Drive createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Drive.f70282e;
            }

            @C12579k
            /* renamed from: b */
            public final Drive[] newArray(int i) {
                return new Drive[i];
            }
        }

        public Drive() {
            super(C28444b.C28452h.ic_drive, C28444b.C28462r.order_type_drive, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003HÖ\u0001¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$DriveExpressPickup;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$b;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class DriveExpressPickup extends OrderType implements C28690b {
        @C12579k
        public static final Parcelable.Creator<DriveExpressPickup> CREATOR = new C28683a();
        @C12579k

        /* renamed from: e */
        public static final DriveExpressPickup f70284e = new DriveExpressPickup();

        /* renamed from: f */
        public static final int f70285f = 0;

        /* renamed from: com.carrefour.fid.android.shared.domain.models.order.OrderType$DriveExpressPickup$a */
        public static final class C28683a implements Parcelable.Creator<DriveExpressPickup> {
            @C12579k
            /* renamed from: a */
            public final DriveExpressPickup createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DriveExpressPickup.f70284e;
            }

            @C12579k
            /* renamed from: b */
            public final DriveExpressPickup[] newArray(int i) {
                return new DriveExpressPickup[i];
            }
        }

        public DriveExpressPickup() {
            super(C28444b.C28452h.ic_drive_express_pickup, C28444b.C28462r.order_type_drive_express_pickup, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$H1h3;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class H1h3 extends OrderType {
        @C12579k
        public static final Parcelable.Creator<H1h3> CREATOR = new C28684a();
        @C12579k

        /* renamed from: e */
        public static final H1h3 f70286e = new H1h3();

        /* renamed from: f */
        public static final int f70287f = 0;

        /* renamed from: com.carrefour.fid.android.shared.domain.models.order.OrderType$H1h3$a */
        public static final class C28684a implements Parcelable.Creator<H1h3> {
            @C12579k
            /* renamed from: a */
            public final H1h3 createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return H1h3.f70286e;
            }

            @C12579k
            /* renamed from: b */
            public final H1h3[] newArray(int i) {
                return new H1h3[i];
            }
        }

        public H1h3() {
            super(C28444b.C28452h.ic_livraison, C28444b.C28462r.order_type_h1h3, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$Lad;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Lad extends OrderType {
        @C12579k
        public static final Parcelable.Creator<Lad> CREATOR = new C28685a();
        @C12579k

        /* renamed from: e */
        public static final Lad f70288e = new Lad();

        /* renamed from: f */
        public static final int f70289f = 0;

        /* renamed from: com.carrefour.fid.android.shared.domain.models.order.OrderType$Lad$a */
        public static final class C28685a implements Parcelable.Creator<Lad> {
            @C12579k
            /* renamed from: a */
            public final Lad createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Lad.f70288e;
            }

            @C12579k
            /* renamed from: b */
            public final Lad[] newArray(int i) {
                return new Lad[i];
            }
        }

        public Lad() {
            super(C28444b.C28452h.ic_livraison, C28444b.C28462r.order_type_lad, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$Mktp;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Mktp extends OrderType {
        @C12579k
        public static final Parcelable.Creator<Mktp> CREATOR = new C28686a();
        @C12579k

        /* renamed from: e */
        public static final Mktp f70290e = new Mktp();

        /* renamed from: f */
        public static final int f70291f = 0;

        /* renamed from: com.carrefour.fid.android.shared.domain.models.order.OrderType$Mktp$a */
        public static final class C28686a implements Parcelable.Creator<Mktp> {
            @C12579k
            /* renamed from: a */
            public final Mktp createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Mktp.f70290e;
            }

            @C12579k
            /* renamed from: b */
            public final Mktp[] newArray(int i) {
                return new Mktp[i];
            }
        }

        public Mktp() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$R2h;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class R2h extends OrderType {
        @C12579k
        public static final Parcelable.Creator<R2h> CREATOR = new C28687a();
        @C12579k

        /* renamed from: e */
        public static final R2h f70292e = new R2h();

        /* renamed from: f */
        public static final int f70293f = 0;

        /* renamed from: com.carrefour.fid.android.shared.domain.models.order.OrderType$R2h$a */
        public static final class C28687a implements Parcelable.Creator<R2h> {
            @C12579k
            /* renamed from: a */
            public final R2h createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return R2h.f70292e;
            }

            @C12579k
            /* renamed from: b */
            public final R2h[] newArray(int i) {
                return new R2h[i];
            }
        }

        public R2h() {
            super(0, C28444b.C28462r.order_type_r2h, 1, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/domain/models/order/OrderType$Unknown;", "Lcom/carrefour/fid/android/shared/domain/models/order/OrderType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Unknown extends OrderType {
        @C12579k
        public static final Parcelable.Creator<Unknown> CREATOR = new C28688a();
        @C12579k

        /* renamed from: e */
        public static final Unknown f70294e = new Unknown();

        /* renamed from: f */
        public static final int f70295f = 0;

        /* renamed from: com.carrefour.fid.android.shared.domain.models.order.OrderType$Unknown$a */
        public static final class C28688a implements Parcelable.Creator<Unknown> {
            @C12579k
            /* renamed from: a */
            public final Unknown createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.f70294e;
            }

            @C12579k
            /* renamed from: b */
            public final Unknown[] newArray(int i) {
                return new Unknown[i];
            }
        }

        public Unknown() {
            super(0, 0, 3, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.domain.models.order.OrderType$a */
    public static final class C28689a {
        public /* synthetic */ C28689a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final OrderType mo83640a(@C12579k String str, @C12580l Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "value");
            switch (str.hashCode()) {
                case 80424:
                    if (str.equals(C13814a.f33690M0)) {
                        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
                            return DriveExpressPickup.f70284e;
                        }
                        return R2h.f70292e;
                    }
                    break;
                case 2071196:
                    if (str.equals(C13814a.f33691N0)) {
                        return Clcv.f70280e;
                    }
                    break;
                case 2368666:
                    if (str.equals(C13814a.f33689L0)) {
                        return Mktp.f70290e;
                    }
                    break;
                case 65315178:
                    if (str.equals("DRIVE")) {
                        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
                            return DriveExpressPickup.f70284e;
                        }
                        return Drive.f70282e;
                    }
                    break;
                case 537893381:
                    if (str.equals("DELIVERY_EXPRESS")) {
                        return H1h3.f70286e;
                    }
                    break;
                case 1762127246:
                    if (str.equals("HOME_DELIVERY_NAL")) {
                        return Lad.f70288e;
                    }
                    break;
            }
            return Unknown.f70294e;
        }

        public C28689a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.domain.models.order.OrderType$b */
    public interface C28690b {
    }

    public /* synthetic */ OrderType(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    /* renamed from: a */
    public final int mo83590a() {
        return this.f70278a;
    }

    /* renamed from: b */
    public final int mo83591b() {
        return this.f70279b;
    }

    public OrderType(@C0375v int i, @C0324b1 int i2) {
        this.f70278a = i;
        this.f70279b = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderType(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (DefaultConstructorMarker) null);
    }
}
