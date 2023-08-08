package com.carrefour.fid.android.presentation.p035ui.orders.offline.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/offline/model/DownloadReceipt;", "Landroid/os/Parcelable;", "()V", "BankReceipt", "BillReceipt", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/model/DownloadReceipt$BankReceipt;", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/model/DownloadReceipt$BillReceipt;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
@C12187d
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.DownloadReceipt */
public abstract class DownloadReceipt implements Parcelable {

    /* renamed from: a */
    public static final int f61484a = 0;

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/offline/model/DownloadReceipt$BankReceipt;", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/model/DownloadReceipt;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.DownloadReceipt$BankReceipt */
    public static final class BankReceipt extends DownloadReceipt {
        @C12579k
        public static final Parcelable.Creator<BankReceipt> CREATOR = new C24792a();
        @C12579k

        /* renamed from: b */
        public static final BankReceipt f61485b = new BankReceipt();

        /* renamed from: c */
        public static final int f61486c = 0;

        /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.DownloadReceipt$BankReceipt$a */
        public static final class C24792a implements Parcelable.Creator<BankReceipt> {
            @C12579k
            /* renamed from: a */
            public final BankReceipt createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BankReceipt.f61485b;
            }

            @C12579k
            /* renamed from: b */
            public final BankReceipt[] newArray(int i) {
                return new BankReceipt[i];
            }
        }

        public BankReceipt() {
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

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/offline/model/DownloadReceipt$BillReceipt;", "Lcom/carrefour/fid/android/presentation/ui/orders/offline/model/DownloadReceipt;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.DownloadReceipt$BillReceipt */
    public static final class BillReceipt extends DownloadReceipt {
        @C12579k
        public static final Parcelable.Creator<BillReceipt> CREATOR = new C24793a();
        @C12579k

        /* renamed from: b */
        public static final BillReceipt f61487b = new BillReceipt();

        /* renamed from: c */
        public static final int f61488c = 0;

        /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.model.DownloadReceipt$BillReceipt$a */
        public static final class C24793a implements Parcelable.Creator<BillReceipt> {
            @C12579k
            /* renamed from: a */
            public final BillReceipt createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BillReceipt.f61487b;
            }

            @C12579k
            /* renamed from: b */
            public final BillReceipt[] newArray(int i) {
                return new BillReceipt[i];
            }
        }

        public BillReceipt() {
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

    public /* synthetic */ DownloadReceipt(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public DownloadReceipt() {
    }
}
