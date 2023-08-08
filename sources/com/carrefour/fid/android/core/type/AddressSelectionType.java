package com.carrefour.fid.android.core.type;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0324b1;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\u001d\b\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/AddressSelectionType;", "Landroid/os/Parcelable;", "", "a", "I", "()I", "iconResId", "b", "labelResId", "<init>", "(II)V", "LocalDeliveryAddress", "LocalDriveAddress", "ServerDeliveryAddress", "ServerDriveAddress", "Lcom/carrefour/fid/android/core/type/AddressSelectionType$LocalDeliveryAddress;", "Lcom/carrefour/fid/android/core/type/AddressSelectionType$LocalDriveAddress;", "Lcom/carrefour/fid/android/core/type/AddressSelectionType$ServerDeliveryAddress;", "Lcom/carrefour/fid/android/core/type/AddressSelectionType$ServerDriveAddress;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public abstract class AddressSelectionType implements Parcelable {

    /* renamed from: c */
    public static final int f89776c = 0;

    /* renamed from: a */
    public final int f89777a;

    /* renamed from: b */
    public final int f89778b;

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/AddressSelectionType$LocalDeliveryAddress;", "Lcom/carrefour/fid/android/core/type/AddressSelectionType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class LocalDeliveryAddress extends AddressSelectionType {
        @C12579k
        public static final Parcelable.Creator<LocalDeliveryAddress> CREATOR = new C36345a();
        @C12579k

        /* renamed from: d */
        public static final LocalDeliveryAddress f89779d = new LocalDeliveryAddress();

        /* renamed from: e */
        public static final int f89780e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.AddressSelectionType$LocalDeliveryAddress$a */
        public static final class C36345a implements Parcelable.Creator<LocalDeliveryAddress> {
            @C12579k
            /* renamed from: a */
            public final LocalDeliveryAddress createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LocalDeliveryAddress.f89779d;
            }

            @C12579k
            /* renamed from: b */
            public final LocalDeliveryAddress[] newArray(int i) {
                return new LocalDeliveryAddress[i];
            }
        }

        public LocalDeliveryAddress() {
            super(R.drawable.ic_location_flags, R.string.checkout_address_selection_from_local, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/AddressSelectionType$LocalDriveAddress;", "Lcom/carrefour/fid/android/core/type/AddressSelectionType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class LocalDriveAddress extends AddressSelectionType {
        @C12579k
        public static final Parcelable.Creator<LocalDriveAddress> CREATOR = new C36346a();
        @C12579k

        /* renamed from: d */
        public static final LocalDriveAddress f89781d = new LocalDriveAddress();

        /* renamed from: e */
        public static final int f89782e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.AddressSelectionType$LocalDriveAddress$a */
        public static final class C36346a implements Parcelable.Creator<LocalDriveAddress> {
            @C12579k
            /* renamed from: a */
            public final LocalDriveAddress createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LocalDriveAddress.f89781d;
            }

            @C12579k
            /* renamed from: b */
            public final LocalDriveAddress[] newArray(int i) {
                return new LocalDriveAddress[i];
            }
        }

        public LocalDriveAddress() {
            super(R.drawable.ic_drive, R.string.checkout_drive_selection_from_local, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/AddressSelectionType$ServerDeliveryAddress;", "Lcom/carrefour/fid/android/core/type/AddressSelectionType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class ServerDeliveryAddress extends AddressSelectionType {
        @C12579k
        public static final Parcelable.Creator<ServerDeliveryAddress> CREATOR = new C36347a();
        @C12579k

        /* renamed from: d */
        public static final ServerDeliveryAddress f89783d = new ServerDeliveryAddress();

        /* renamed from: e */
        public static final int f89784e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.AddressSelectionType$ServerDeliveryAddress$a */
        public static final class C36347a implements Parcelable.Creator<ServerDeliveryAddress> {
            @C12579k
            /* renamed from: a */
            public final ServerDeliveryAddress createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ServerDeliveryAddress.f89783d;
            }

            @C12579k
            /* renamed from: b */
            public final ServerDeliveryAddress[] newArray(int i) {
                return new ServerDeliveryAddress[i];
            }
        }

        public ServerDeliveryAddress() {
            super(R.drawable.ic_location_flags, R.string.checkout_address_selection_from_server, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/AddressSelectionType$ServerDriveAddress;", "Lcom/carrefour/fid/android/core/type/AddressSelectionType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class ServerDriveAddress extends AddressSelectionType {
        @C12579k
        public static final Parcelable.Creator<ServerDriveAddress> CREATOR = new C36348a();
        @C12579k

        /* renamed from: d */
        public static final ServerDriveAddress f89785d = new ServerDriveAddress();

        /* renamed from: e */
        public static final int f89786e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.AddressSelectionType$ServerDriveAddress$a */
        public static final class C36348a implements Parcelable.Creator<ServerDriveAddress> {
            @C12579k
            /* renamed from: a */
            public final ServerDriveAddress createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ServerDriveAddress.f89785d;
            }

            @C12579k
            /* renamed from: b */
            public final ServerDriveAddress[] newArray(int i) {
                return new ServerDriveAddress[i];
            }
        }

        public ServerDriveAddress() {
            super(R.drawable.ic_drive, R.string.checkout_drive_selection_from_server, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ AddressSelectionType(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    /* renamed from: a */
    public final int mo108444a() {
        return this.f89777a;
    }

    /* renamed from: b */
    public final int mo108445b() {
        return this.f89778b;
    }

    public AddressSelectionType(@C0375v int i, @C0324b1 int i2) {
        this.f89777a = i;
        this.f89778b = i2;
    }
}
