package com.carrefour.fid.android.core.constants;

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

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000b2\u00020\u0001:\r\f\r\u000e\u000f\u0010\u0003\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u001d\b\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\u0001\f\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/constants/OrderStatus;", "Landroid/os/Parcelable;", "", "a", "I", "b", "()I", "labelResId", "infoResId", "<init>", "(II)V", "c", "Affected", "Arrived", "AwaitingPreparation", "Cancelled", "Closed", "Delivered", "PreparationInProgress", "Prepared", "ReadyToPick", "Shipped", "Unknown", "Validated", "Lcom/carrefour/fid/android/core/constants/OrderStatus$Affected;", "Lcom/carrefour/fid/android/core/constants/OrderStatus$Arrived;", "Lcom/carrefour/fid/android/core/constants/OrderStatus$AwaitingPreparation;", "Lcom/carrefour/fid/android/core/constants/OrderStatus$Cancelled;", "Lcom/carrefour/fid/android/core/constants/OrderStatus$Closed;", "Lcom/carrefour/fid/android/core/constants/OrderStatus$Delivered;", "Lcom/carrefour/fid/android/core/constants/OrderStatus$PreparationInProgress;", "Lcom/carrefour/fid/android/core/constants/OrderStatus$Prepared;", "Lcom/carrefour/fid/android/core/constants/OrderStatus$ReadyToPick;", "Lcom/carrefour/fid/android/core/constants/OrderStatus$Shipped;", "Lcom/carrefour/fid/android/core/constants/OrderStatus$Unknown;", "Lcom/carrefour/fid/android/core/constants/OrderStatus$Validated;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public abstract class OrderStatus implements Parcelable {
    @C12579k

    /* renamed from: c */
    public static final C36167a f89242c = new C36167a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f89243d = 0;

    /* renamed from: a */
    public final int f89244a;

    /* renamed from: b */
    public final int f89245b;

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/constants/OrderStatus$Affected;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Affected extends OrderStatus {
        @C12579k
        public static final Parcelable.Creator<Affected> CREATOR = new C36155a();
        @C12579k

        /* renamed from: e */
        public static final Affected f89246e = new Affected();

        /* renamed from: f */
        public static final int f89247f = 0;

        /* renamed from: com.carrefour.fid.android.core.constants.OrderStatus$Affected$a */
        public static final class C36155a implements Parcelable.Creator<Affected> {
            @C12579k
            /* renamed from: a */
            public final Affected createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Affected.f89246e;
            }

            @C12579k
            /* renamed from: b */
            public final Affected[] newArray(int i) {
                return new Affected[i];
            }
        }

        public Affected() {
            super(R.string.order_txt_order_status_validee, 0, 2, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/constants/OrderStatus$Arrived;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Arrived extends OrderStatus {
        @C12579k
        public static final Parcelable.Creator<Arrived> CREATOR = new C36156a();
        @C12579k

        /* renamed from: e */
        public static final Arrived f89248e = new Arrived();

        /* renamed from: f */
        public static final int f89249f = 0;

        /* renamed from: com.carrefour.fid.android.core.constants.OrderStatus$Arrived$a */
        public static final class C36156a implements Parcelable.Creator<Arrived> {
            @C12579k
            /* renamed from: a */
            public final Arrived createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Arrived.f89248e;
            }

            @C12579k
            /* renamed from: b */
            public final Arrived[] newArray(int i) {
                return new Arrived[i];
            }
        }

        public Arrived() {
            super(R.string.order_txt_order_status_arrived, 0, 2, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/constants/OrderStatus$AwaitingPreparation;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class AwaitingPreparation extends OrderStatus {
        @C12579k
        public static final Parcelable.Creator<AwaitingPreparation> CREATOR = new C36157a();
        @C12579k

        /* renamed from: e */
        public static final AwaitingPreparation f89250e = new AwaitingPreparation();

        /* renamed from: f */
        public static final int f89251f = 0;

        /* renamed from: com.carrefour.fid.android.core.constants.OrderStatus$AwaitingPreparation$a */
        public static final class C36157a implements Parcelable.Creator<AwaitingPreparation> {
            @C12579k
            /* renamed from: a */
            public final AwaitingPreparation createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AwaitingPreparation.f89250e;
            }

            @C12579k
            /* renamed from: b */
            public final AwaitingPreparation[] newArray(int i) {
                return new AwaitingPreparation[i];
            }
        }

        public AwaitingPreparation() {
            super(R.string.order_txt_order_status_validee, 0, 2, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/constants/OrderStatus$Cancelled;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Cancelled extends OrderStatus {
        @C12579k
        public static final Parcelable.Creator<Cancelled> CREATOR = new C36158a();
        @C12579k

        /* renamed from: e */
        public static final Cancelled f89252e = new Cancelled();

        /* renamed from: f */
        public static final int f89253f = 0;

        /* renamed from: com.carrefour.fid.android.core.constants.OrderStatus$Cancelled$a */
        public static final class C36158a implements Parcelable.Creator<Cancelled> {
            @C12579k
            /* renamed from: a */
            public final Cancelled createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cancelled.f89252e;
            }

            @C12579k
            /* renamed from: b */
            public final Cancelled[] newArray(int i) {
                return new Cancelled[i];
            }
        }

        public Cancelled() {
            super(R.string.order_txt_order_status_annulee, R.string.order_txt_order_status_annulee_info, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/constants/OrderStatus$Closed;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Closed extends OrderStatus {
        @C12579k
        public static final Parcelable.Creator<Closed> CREATOR = new C36159a();
        @C12579k

        /* renamed from: e */
        public static final Closed f89254e = new Closed();

        /* renamed from: f */
        public static final int f89255f = 0;

        /* renamed from: com.carrefour.fid.android.core.constants.OrderStatus$Closed$a */
        public static final class C36159a implements Parcelable.Creator<Closed> {
            @C12579k
            /* renamed from: a */
            public final Closed createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Closed.f89254e;
            }

            @C12579k
            /* renamed from: b */
            public final Closed[] newArray(int i) {
                return new Closed[i];
            }
        }

        public Closed() {
            super(R.string.order_txt_order_status_facturee, 0, 2, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/constants/OrderStatus$Delivered;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Delivered extends OrderStatus {
        @C12579k
        public static final Parcelable.Creator<Delivered> CREATOR = new C36160a();
        @C12579k

        /* renamed from: e */
        public static final Delivered f89256e = new Delivered();

        /* renamed from: f */
        public static final int f89257f = 0;

        /* renamed from: com.carrefour.fid.android.core.constants.OrderStatus$Delivered$a */
        public static final class C36160a implements Parcelable.Creator<Delivered> {
            @C12579k
            /* renamed from: a */
            public final Delivered createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Delivered.f89256e;
            }

            @C12579k
            /* renamed from: b */
            public final Delivered[] newArray(int i) {
                return new Delivered[i];
            }
        }

        public Delivered() {
            super(R.string.order_txt_order_status_livree, 0, 2, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/constants/OrderStatus$PreparationInProgress;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class PreparationInProgress extends OrderStatus {
        @C12579k
        public static final Parcelable.Creator<PreparationInProgress> CREATOR = new C36161a();
        @C12579k

        /* renamed from: e */
        public static final PreparationInProgress f89258e = new PreparationInProgress();

        /* renamed from: f */
        public static final int f89259f = 0;

        /* renamed from: com.carrefour.fid.android.core.constants.OrderStatus$PreparationInProgress$a */
        public static final class C36161a implements Parcelable.Creator<PreparationInProgress> {
            @C12579k
            /* renamed from: a */
            public final PreparationInProgress createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PreparationInProgress.f89258e;
            }

            @C12579k
            /* renamed from: b */
            public final PreparationInProgress[] newArray(int i) {
                return new PreparationInProgress[i];
            }
        }

        public PreparationInProgress() {
            super(R.string.order_txt_order_status_cours_prep, 0, 2, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/constants/OrderStatus$Prepared;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Prepared extends OrderStatus {
        @C12579k
        public static final Parcelable.Creator<Prepared> CREATOR = new C36162a();
        @C12579k

        /* renamed from: e */
        public static final Prepared f89260e = new Prepared();

        /* renamed from: f */
        public static final int f89261f = 0;

        /* renamed from: com.carrefour.fid.android.core.constants.OrderStatus$Prepared$a */
        public static final class C36162a implements Parcelable.Creator<Prepared> {
            @C12579k
            /* renamed from: a */
            public final Prepared createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Prepared.f89260e;
            }

            @C12579k
            /* renamed from: b */
            public final Prepared[] newArray(int i) {
                return new Prepared[i];
            }
        }

        public Prepared() {
            super(R.string.order_txt_order_status_cours_prep, 0, 2, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/constants/OrderStatus$ReadyToPick;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class ReadyToPick extends OrderStatus {
        @C12579k
        public static final Parcelable.Creator<ReadyToPick> CREATOR = new C36163a();
        @C12579k

        /* renamed from: e */
        public static final ReadyToPick f89262e = new ReadyToPick();

        /* renamed from: f */
        public static final int f89263f = 0;

        /* renamed from: com.carrefour.fid.android.core.constants.OrderStatus$ReadyToPick$a */
        public static final class C36163a implements Parcelable.Creator<ReadyToPick> {
            @C12579k
            /* renamed from: a */
            public final ReadyToPick createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReadyToPick.f89262e;
            }

            @C12579k
            /* renamed from: b */
            public final ReadyToPick[] newArray(int i) {
                return new ReadyToPick[i];
            }
        }

        public ReadyToPick() {
            super(R.string.order_txt_order_status_facturee, 0, 2, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/constants/OrderStatus$Shipped;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Shipped extends OrderStatus {
        @C12579k
        public static final Parcelable.Creator<Shipped> CREATOR = new C36164a();
        @C12579k

        /* renamed from: e */
        public static final Shipped f89264e = new Shipped();

        /* renamed from: f */
        public static final int f89265f = 0;

        /* renamed from: com.carrefour.fid.android.core.constants.OrderStatus$Shipped$a */
        public static final class C36164a implements Parcelable.Creator<Shipped> {
            @C12579k
            /* renamed from: a */
            public final Shipped createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Shipped.f89264e;
            }

            @C12579k
            /* renamed from: b */
            public final Shipped[] newArray(int i) {
                return new Shipped[i];
            }
        }

        public Shipped() {
            super(R.string.order_txt_order_status_expediee, 0, 2, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/constants/OrderStatus$Unknown;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Unknown extends OrderStatus {
        @C12579k
        public static final Parcelable.Creator<Unknown> CREATOR = new C36165a();
        @C12579k

        /* renamed from: e */
        public static final Unknown f89266e = new Unknown();

        /* renamed from: f */
        public static final int f89267f = 0;

        /* renamed from: com.carrefour.fid.android.core.constants.OrderStatus$Unknown$a */
        public static final class C36165a implements Parcelable.Creator<Unknown> {
            @C12579k
            /* renamed from: a */
            public final Unknown createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.f89266e;
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

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/constants/OrderStatus$Validated;", "Lcom/carrefour/fid/android/core/constants/OrderStatus;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Validated extends OrderStatus {
        @C12579k
        public static final Parcelable.Creator<Validated> CREATOR = new C36166a();
        @C12579k

        /* renamed from: e */
        public static final Validated f89268e = new Validated();

        /* renamed from: f */
        public static final int f89269f = 0;

        /* renamed from: com.carrefour.fid.android.core.constants.OrderStatus$Validated$a */
        public static final class C36166a implements Parcelable.Creator<Validated> {
            @C12579k
            /* renamed from: a */
            public final Validated createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Validated.f89268e;
            }

            @C12579k
            /* renamed from: b */
            public final Validated[] newArray(int i) {
                return new Validated[i];
            }
        }

        public Validated() {
            super(R.string.order_txt_order_status_validee, 0, 2, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* renamed from: com.carrefour.fid.android.core.constants.OrderStatus$a */
    public static final class C36167a {
        public /* synthetic */ C36167a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final OrderStatus mo108074a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "input");
            switch (str.hashCode()) {
                case -1750699932:
                    if (str.equals("DELIVERED")) {
                        return Delivered.f89256e;
                    }
                    break;
                case -1515427533:
                    if (str.equals("SHIPPED")) {
                        return Shipped.f89264e;
                    }
                    break;
                case -1031784143:
                    if (str.equals("CANCELLED")) {
                        return Cancelled.f89252e;
                    }
                    break;
                case -496925635:
                    if (str.equals("PREPARED")) {
                        return Prepared.f89260e;
                    }
                    break;
                case -16224179:
                    if (str.equals("ARRIVED")) {
                        return Arrived.f89248e;
                    }
                    break;
                case 713150633:
                    if (str.equals("READY_TO_PICK")) {
                        return ReadyToPick.f89262e;
                    }
                    break;
                case 1185533316:
                    if (str.equals("AWAITING_PREPARATION")) {
                        return AwaitingPreparation.f89250e;
                    }
                    break;
                case 1384112756:
                    if (str.equals("AFFECTED")) {
                        return Affected.f89246e;
                    }
                    break;
                case 1676810734:
                    if (str.equals("VALIDATED")) {
                        return Validated.f89268e;
                    }
                    break;
                case 1911583295:
                    if (str.equals("PREPARATION_IN_PROGRESS")) {
                        return PreparationInProgress.f89258e;
                    }
                    break;
                case 1990776172:
                    if (str.equals("CLOSED")) {
                        return Closed.f89254e;
                    }
                    break;
            }
            return Unknown.f89266e;
        }

        public C36167a() {
        }
    }

    public /* synthetic */ OrderStatus(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    /* renamed from: a */
    public final int mo108000a() {
        return this.f89245b;
    }

    /* renamed from: b */
    public final int mo108001b() {
        return this.f89244a;
    }

    public OrderStatus(@C0324b1 int i, @C0324b1 int i2) {
        this.f89244a = i;
        this.f89245b = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderStatus(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (DefaultConstructorMarker) null);
    }
}
