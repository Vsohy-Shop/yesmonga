package com.carrefour.fid.android.presentation.p035ui.orders;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.k */
public final class C24693k {
    @C12579k

    /* renamed from: a */
    public static final C24695b f61313a = new C24695b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f61314b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.k$b */
    public static final class C24695b {
        public /* synthetic */ C24695b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m107824b(C24695b bVar, OrderType orderType, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return bVar.mo72183a(orderType, str, z);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo72183a(@C12579k OrderType orderType, @C12580l String str, boolean z) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new C24694a(orderType, str, z);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo72184c() {
            return new C19690a(R.id.action_ordersSuccessHandleFragment_to_ordersOnlineFragment);
        }

        public C24695b() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.k$a */
    public static final class C24694a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final OrderType f61315a;
        @C12580l

        /* renamed from: b */
        public final String f61316b;

        /* renamed from: c */
        public final boolean f61317c;

        /* renamed from: d */
        public final int f61318d;

        public C24694a(@C12579k OrderType orderType, @C12580l String str, boolean z) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.f61315a = orderType;
            this.f61316b = str;
            this.f61317c = z;
            this.f61318d = R.id.action_ordersSuccessHandleFragment_to_ordersOnlineDetailsFragment;
        }

        /* renamed from: e */
        public static /* synthetic */ C24694a m107816e(C24694a aVar, OrderType orderType, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                orderType = aVar.f61315a;
            }
            if ((i & 2) != 0) {
                str = aVar.f61316b;
            }
            if ((i & 4) != 0) {
                z = aVar.f61317c;
            }
            return aVar.mo72176d(orderType, str, z);
        }

        @C12579k
        /* renamed from: a */
        public final OrderType mo72173a() {
            return this.f61315a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo72174b() {
            return this.f61316b;
        }

        /* renamed from: c */
        public final boolean mo72175c() {
            return this.f61317c;
        }

        @C12579k
        /* renamed from: d */
        public final C24694a mo72176d(@C12579k OrderType orderType, @C12580l String str, boolean z) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new C24694a(orderType, str, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24694a)) {
                return false;
            }
            C24694a aVar = (C24694a) obj;
            return Intrinsics.areEqual((Object) this.f61315a, (Object) aVar.f61315a) && Intrinsics.areEqual((Object) this.f61316b, (Object) aVar.f61316b) && this.f61317c == aVar.f61317c;
        }

        @C12580l
        /* renamed from: f */
        public final String mo72178f() {
            return this.f61316b;
        }

        /* renamed from: g */
        public final boolean mo72179g() {
            return this.f61317c;
        }

        public int getActionId() {
            return this.f61318d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("order_id", this.f61316b);
            bundle.putBoolean(C36178i.f89310e, this.f61317c);
            Class<OrderType> cls = OrderType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OrderType orderType = this.f61315a;
                Intrinsics.checkNotNull(orderType, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable(C36178i.f89309d, orderType);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OrderType orderType2 = this.f61315a;
                Intrinsics.checkNotNull(orderType2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable(C36178i.f89309d, (Serializable) orderType2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        @C12579k
        /* renamed from: h */
        public final OrderType mo72180h() {
            return this.f61315a;
        }

        public int hashCode() {
            int hashCode = this.f61315a.hashCode() * 31;
            String str = this.f61316b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z = this.f61317c;
            if (z) {
                z = true;
            }
            return hashCode2 + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            OrderType orderType = this.f61315a;
            String str = this.f61316b;
            boolean z = this.f61317c;
            return "ActionOrdersSuccessHandleFragmentToOrdersOnlineDetailsFragment(orderType=" + orderType + ", orderId=" + str + ", orderStatusIsAtLeastBilled=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24694a(OrderType orderType, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(orderType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z);
        }
    }
}
