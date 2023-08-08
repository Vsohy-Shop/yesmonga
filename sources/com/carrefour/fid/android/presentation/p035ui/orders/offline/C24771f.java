package com.carrefour.fid.android.presentation.p035ui.orders.offline;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.DownloadReceipt;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.OrderDetailParam;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.f */
public final class C24771f {
    @C12579k

    /* renamed from: a */
    public static final C24773b f61456a = new C24773b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f61457b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.f$a */
    public static final class C24772a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final OrderDetailParam f61458a;
        @C12579k

        /* renamed from: b */
        public final String f61459b;
        @C12579k

        /* renamed from: c */
        public final DownloadReceipt f61460c;

        /* renamed from: d */
        public final int f61461d = R.id.action_ordersOfflineDetailsFragment_to_ordersOfflineReceiptFragment;

        public C24772a(@C12579k OrderDetailParam orderDetailParam, @C12579k String str, @C12579k DownloadReceipt downloadReceipt) {
            Intrinsics.checkNotNullParameter(orderDetailParam, "orderDetails");
            Intrinsics.checkNotNullParameter(str, "filePath");
            Intrinsics.checkNotNullParameter(downloadReceipt, "receipt");
            this.f61458a = orderDetailParam;
            this.f61459b = str;
            this.f61460c = downloadReceipt;
        }

        /* renamed from: e */
        public static /* synthetic */ C24772a m107963e(C24772a aVar, OrderDetailParam orderDetailParam, String str, DownloadReceipt downloadReceipt, int i, Object obj) {
            if ((i & 1) != 0) {
                orderDetailParam = aVar.f61458a;
            }
            if ((i & 2) != 0) {
                str = aVar.f61459b;
            }
            if ((i & 4) != 0) {
                downloadReceipt = aVar.f61460c;
            }
            return aVar.mo72313d(orderDetailParam, str, downloadReceipt);
        }

        @C12579k
        /* renamed from: a */
        public final OrderDetailParam mo72310a() {
            return this.f61458a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo72311b() {
            return this.f61459b;
        }

        @C12579k
        /* renamed from: c */
        public final DownloadReceipt mo72312c() {
            return this.f61460c;
        }

        @C12579k
        /* renamed from: d */
        public final C24772a mo72313d(@C12579k OrderDetailParam orderDetailParam, @C12579k String str, @C12579k DownloadReceipt downloadReceipt) {
            Intrinsics.checkNotNullParameter(orderDetailParam, "orderDetails");
            Intrinsics.checkNotNullParameter(str, "filePath");
            Intrinsics.checkNotNullParameter(downloadReceipt, "receipt");
            return new C24772a(orderDetailParam, str, downloadReceipt);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24772a)) {
                return false;
            }
            C24772a aVar = (C24772a) obj;
            return Intrinsics.areEqual((Object) this.f61458a, (Object) aVar.f61458a) && Intrinsics.areEqual((Object) this.f61459b, (Object) aVar.f61459b) && Intrinsics.areEqual((Object) this.f61460c, (Object) aVar.f61460c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo72315f() {
            return this.f61459b;
        }

        @C12579k
        /* renamed from: g */
        public final OrderDetailParam mo72316g() {
            return this.f61458a;
        }

        public int getActionId() {
            return this.f61461d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<Parcelable> cls = Parcelable.class;
            Class<OrderDetailParam> cls2 = OrderDetailParam.class;
            Class<Serializable> cls3 = Serializable.class;
            if (cls.isAssignableFrom(cls2)) {
                OrderDetailParam orderDetailParam = this.f61458a;
                Intrinsics.checkNotNull(orderDetailParam, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("orderDetails", orderDetailParam);
            } else if (cls3.isAssignableFrom(cls2)) {
                OrderDetailParam orderDetailParam2 = this.f61458a;
                Intrinsics.checkNotNull(orderDetailParam2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("orderDetails", (Serializable) orderDetailParam2);
            } else {
                String name = cls2.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putString("filePath", this.f61459b);
            Class<DownloadReceipt> cls4 = DownloadReceipt.class;
            if (cls.isAssignableFrom(cls4)) {
                DownloadReceipt downloadReceipt = this.f61460c;
                Intrinsics.checkNotNull(downloadReceipt, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("receipt", downloadReceipt);
            } else if (cls3.isAssignableFrom(cls4)) {
                DownloadReceipt downloadReceipt2 = this.f61460c;
                Intrinsics.checkNotNull(downloadReceipt2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("receipt", (Serializable) downloadReceipt2);
            } else {
                String name2 = cls4.getName();
                throw new UnsupportedOperationException(name2 + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        @C12579k
        /* renamed from: h */
        public final DownloadReceipt mo72317h() {
            return this.f61460c;
        }

        public int hashCode() {
            return (((this.f61458a.hashCode() * 31) + this.f61459b.hashCode()) * 31) + this.f61460c.hashCode();
        }

        @C12579k
        public String toString() {
            OrderDetailParam orderDetailParam = this.f61458a;
            String str = this.f61459b;
            DownloadReceipt downloadReceipt = this.f61460c;
            return "ActionOrdersOfflineDetailsFragmentToOrdersOfflineReceiptFragment(orderDetails=" + orderDetailParam + ", filePath=" + str + ", receipt=" + downloadReceipt + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.f$b */
    public static final class C24773b {
        public /* synthetic */ C24773b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo72320a(@C12579k OrderDetailParam orderDetailParam, @C12579k String str, @C12579k DownloadReceipt downloadReceipt) {
            Intrinsics.checkNotNullParameter(orderDetailParam, "orderDetails");
            Intrinsics.checkNotNullParameter(str, "filePath");
            Intrinsics.checkNotNullParameter(downloadReceipt, "receipt");
            return new C24772a(orderDetailParam, str, downloadReceipt);
        }

        public C24773b() {
        }
    }
}
