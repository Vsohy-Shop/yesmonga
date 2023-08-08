package com.carrefour.fid.android.presentation.p035ui.orders.online;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.core.type.AccountListType;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.OrdersOnlineDetailType;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.i */
public final class C25204i {
    @C12579k

    /* renamed from: a */
    public static final C25208d f62079a = new C25208d((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f62080b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.i$a */
    public static final class C25205a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final String f62081a;
        @C12580l

        /* renamed from: b */
        public final AccountListType f62082b;

        /* renamed from: c */
        public final int f62083c;

        public C25205a() {
            this((String) null, (AccountListType) null, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public static /* synthetic */ C25205a m108920d(C25205a aVar, String str, AccountListType accountListType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f62081a;
            }
            if ((i & 2) != 0) {
                accountListType = aVar.f62082b;
            }
            return aVar.mo73244c(str, accountListType);
        }

        @C12580l
        /* renamed from: a */
        public final String mo73242a() {
            return this.f62081a;
        }

        @C12580l
        /* renamed from: b */
        public final AccountListType mo73243b() {
            return this.f62082b;
        }

        @C12579k
        /* renamed from: c */
        public final C25205a mo73244c(@C12580l String str, @C12580l AccountListType accountListType) {
            return new C25205a(str, accountListType);
        }

        @C12580l
        /* renamed from: e */
        public final AccountListType mo73245e() {
            return this.f62082b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25205a)) {
                return false;
            }
            C25205a aVar = (C25205a) obj;
            return Intrinsics.areEqual((Object) this.f62081a, (Object) aVar.f62081a) && Intrinsics.areEqual((Object) this.f62082b, (Object) aVar.f62082b);
        }

        @C12580l
        /* renamed from: f */
        public final String mo73247f() {
            return this.f62081a;
        }

        public int getActionId() {
            return this.f62083c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("order_id", this.f62081a);
            Class<AccountListType> cls = AccountListType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("account_list_type", this.f62082b);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("account_list_type", (Serializable) this.f62082b);
            }
            return bundle;
        }

        public int hashCode() {
            String str = this.f62081a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            AccountListType accountListType = this.f62082b;
            if (accountListType != null) {
                i = accountListType.hashCode();
            }
            return hashCode + i;
        }

        @C12579k
        public String toString() {
            String str = this.f62081a;
            AccountListType accountListType = this.f62082b;
            return "ActionOrdersOnlineDetailsFragmentToAccountListFragment(orderId=" + str + ", accountListType=" + accountListType + ")";
        }

        public C25205a(@C12580l String str, @C12580l AccountListType accountListType) {
            this.f62081a = str;
            this.f62082b = accountListType;
            this.f62083c = R.id.action_ordersOnlineDetailsFragment_to_accountListFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25205a(String str, AccountListType accountListType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : accountListType);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.i$b */
    public static final class C25206b implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f62084a;
        @C12579k

        /* renamed from: b */
        public final OrdersOnlineDetailType f62085b;

        /* renamed from: c */
        public final int f62086c = R.id.action_ordersOnlineDetailsFragment_to_listProductsOrderedFragment;

        public C25206b(@C12579k String str, @C12579k OrdersOnlineDetailType ordersOnlineDetailType) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(ordersOnlineDetailType, "detailType");
            this.f62084a = str;
            this.f62085b = ordersOnlineDetailType;
        }

        /* renamed from: d */
        public static /* synthetic */ C25206b m108926d(C25206b bVar, String str, OrdersOnlineDetailType ordersOnlineDetailType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f62084a;
            }
            if ((i & 2) != 0) {
                ordersOnlineDetailType = bVar.f62085b;
            }
            return bVar.mo73252c(str, ordersOnlineDetailType);
        }

        @C12579k
        /* renamed from: a */
        public final String mo73250a() {
            return this.f62084a;
        }

        @C12579k
        /* renamed from: b */
        public final OrdersOnlineDetailType mo73251b() {
            return this.f62085b;
        }

        @C12579k
        /* renamed from: c */
        public final C25206b mo73252c(@C12579k String str, @C12579k OrdersOnlineDetailType ordersOnlineDetailType) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(ordersOnlineDetailType, "detailType");
            return new C25206b(str, ordersOnlineDetailType);
        }

        @C12579k
        /* renamed from: e */
        public final OrdersOnlineDetailType mo73253e() {
            return this.f62085b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25206b)) {
                return false;
            }
            C25206b bVar = (C25206b) obj;
            return Intrinsics.areEqual((Object) this.f62084a, (Object) bVar.f62084a) && this.f62085b == bVar.f62085b;
        }

        @C12579k
        /* renamed from: f */
        public final String mo73255f() {
            return this.f62084a;
        }

        public int getActionId() {
            return this.f62086c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("order_id", this.f62084a);
            Class<OrdersOnlineDetailType> cls = OrdersOnlineDetailType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OrdersOnlineDetailType ordersOnlineDetailType = this.f62085b;
                Intrinsics.checkNotNull(ordersOnlineDetailType, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("detail_type", (Parcelable) ordersOnlineDetailType);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OrdersOnlineDetailType ordersOnlineDetailType2 = this.f62085b;
                Intrinsics.checkNotNull(ordersOnlineDetailType2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("detail_type", ordersOnlineDetailType2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return (this.f62084a.hashCode() * 31) + this.f62085b.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f62084a;
            OrdersOnlineDetailType ordersOnlineDetailType = this.f62085b;
            return "ActionOrdersOnlineDetailsFragmentToListProductsOrderedFragment(orderId=" + str + ", detailType=" + ordersOnlineDetailType + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.i$c */
    public static final class C25207c implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final String f62087a;

        /* renamed from: b */
        public final int f62088b;

        public C25207c() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C25207c m108932c(C25207c cVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f62087a;
            }
            return cVar.mo73259b(str);
        }

        @C12580l
        /* renamed from: a */
        public final String mo73258a() {
            return this.f62087a;
        }

        @C12579k
        /* renamed from: b */
        public final C25207c mo73259b(@C12580l String str) {
            return new C25207c(str);
        }

        @C12580l
        /* renamed from: d */
        public final String mo73260d() {
            return this.f62087a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25207c) && Intrinsics.areEqual((Object) this.f62087a, (Object) ((C25207c) obj).f62087a);
        }

        public int getActionId() {
            return this.f62088b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("order_id", this.f62087a);
            return bundle;
        }

        public int hashCode() {
            String str = this.f62087a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f62087a;
            return "ActionOrdersOnlineDetailsFragmentToOrdersSuccessHandleFragment(orderId=" + str + ")";
        }

        public C25207c(@C12580l String str) {
            this.f62087a = str;
            this.f62088b = R.id.action_ordersOnlineDetailsFragment_to_ordersSuccessHandleFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25207c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.i$d */
    public static final class C25208d {
        public /* synthetic */ C25208d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m108936b(C25208d dVar, String str, AccountListType accountListType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                accountListType = null;
            }
            return dVar.mo73264a(str, accountListType);
        }

        /* renamed from: e */
        public static /* synthetic */ C19693b0 m108937e(C25208d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return dVar.mo73266d(str);
        }

        /* renamed from: g */
        public static /* synthetic */ C19693b0 m108938g(C25208d dVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = R.id.ordersOnlineDetailsFragment;
            }
            return dVar.mo73267f(i);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo73264a(@C12580l String str, @C12580l AccountListType accountListType) {
            return new C25205a(str, accountListType);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo73265c(@C12579k String str, @C12579k OrdersOnlineDetailType ordersOnlineDetailType) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(ordersOnlineDetailType, "detailType");
            return new C25206b(str, ordersOnlineDetailType);
        }

        @C12579k
        /* renamed from: d */
        public final C19693b0 mo73266d(@C12580l String str) {
            return new C25207c(str);
        }

        @C12579k
        /* renamed from: f */
        public final C19693b0 mo73267f(int i) {
            return new C25209e(i);
        }

        @C12579k
        /* renamed from: h */
        public final C19693b0 mo73268h(@C12579k String str, @C12579k OrderType orderType, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(str2, "facilityStoreId");
            return new C25210f(str, orderType, str2);
        }

        @C12579k
        /* renamed from: i */
        public final C19693b0 mo73269i(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            return new C25211g(str);
        }

        public C25208d() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.i$e */
    public static final class C25209e implements C19693b0 {

        /* renamed from: a */
        public final int f62089a;

        /* renamed from: b */
        public final int f62090b;

        public C25209e() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C25209e m108945c(C25209e eVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = eVar.f62089a;
            }
            return eVar.mo73271b(i);
        }

        /* renamed from: a */
        public final int mo73270a() {
            return this.f62089a;
        }

        @C12579k
        /* renamed from: b */
        public final C25209e mo73271b(int i) {
            return new C25209e(i);
        }

        /* renamed from: d */
        public final int mo73272d() {
            return this.f62089a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25209e) && this.f62089a == ((C25209e) obj).f62089a;
        }

        public int getActionId() {
            return this.f62090b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("sourceGraphId", this.f62089a);
            return bundle;
        }

        public int hashCode() {
            return Integer.hashCode(this.f62089a);
        }

        @C12579k
        public String toString() {
            int i = this.f62089a;
            return "ToAdditionalOrders(sourceGraphId=" + i + ")";
        }

        public C25209e(int i) {
            this.f62089a = i;
            this.f62090b = R.id.to_additional_orders;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25209e(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.id.ordersOnlineDetailsFragment : i);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.i$f */
    public static final class C25210f implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f62091a;
        @C12579k

        /* renamed from: b */
        public final OrderType f62092b;
        @C12579k

        /* renamed from: c */
        public final String f62093c;

        /* renamed from: d */
        public final int f62094d = R.id.to_serviceSlot;

        public C25210f(@C12579k String str, @C12579k OrderType orderType, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(str2, "facilityStoreId");
            this.f62091a = str;
            this.f62092b = orderType;
            this.f62093c = str2;
        }

        /* renamed from: e */
        public static /* synthetic */ C25210f m108949e(C25210f fVar, String str, OrderType orderType, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fVar.f62091a;
            }
            if ((i & 2) != 0) {
                orderType = fVar.f62092b;
            }
            if ((i & 4) != 0) {
                str2 = fVar.f62093c;
            }
            return fVar.mo73279d(str, orderType, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo73276a() {
            return this.f62091a;
        }

        @C12579k
        /* renamed from: b */
        public final OrderType mo73277b() {
            return this.f62092b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo73278c() {
            return this.f62093c;
        }

        @C12579k
        /* renamed from: d */
        public final C25210f mo73279d(@C12579k String str, @C12579k OrderType orderType, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(str2, "facilityStoreId");
            return new C25210f(str, orderType, str2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25210f)) {
                return false;
            }
            C25210f fVar = (C25210f) obj;
            return Intrinsics.areEqual((Object) this.f62091a, (Object) fVar.f62091a) && Intrinsics.areEqual((Object) this.f62092b, (Object) fVar.f62092b) && Intrinsics.areEqual((Object) this.f62093c, (Object) fVar.f62093c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo73281f() {
            return this.f62093c;
        }

        @C12579k
        /* renamed from: g */
        public final String mo73282g() {
            return this.f62091a;
        }

        public int getActionId() {
            return this.f62094d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("order_id", this.f62091a);
            Class<OrderType> cls = OrderType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OrderType orderType = this.f62092b;
                Intrinsics.checkNotNull(orderType, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable(C36178i.f89309d, orderType);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OrderType orderType2 = this.f62092b;
                Intrinsics.checkNotNull(orderType2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable(C36178i.f89309d, (Serializable) orderType2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putString("facility_store_id", this.f62093c);
            return bundle;
        }

        @C12579k
        /* renamed from: h */
        public final OrderType mo73283h() {
            return this.f62092b;
        }

        public int hashCode() {
            return (((this.f62091a.hashCode() * 31) + this.f62092b.hashCode()) * 31) + this.f62093c.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f62091a;
            OrderType orderType = this.f62092b;
            String str2 = this.f62093c;
            return "ToServiceSlot(orderId=" + str + ", orderType=" + orderType + ", facilityStoreId=" + str2 + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.i$g */
    public static final class C25211g implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f62095a;

        /* renamed from: b */
        public final int f62096b = R.id.to_withdrawalOrderDriveFragment;

        public C25211g(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            this.f62095a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C25211g m108957c(C25211g gVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.f62095a;
            }
            return gVar.mo73287b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo73286a() {
            return this.f62095a;
        }

        @C12579k
        /* renamed from: b */
        public final C25211g mo73287b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            return new C25211g(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo73288d() {
            return this.f62095a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25211g) && Intrinsics.areEqual((Object) this.f62095a, (Object) ((C25211g) obj).f62095a);
        }

        public int getActionId() {
            return this.f62096b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("order_id", this.f62095a);
            return bundle;
        }

        public int hashCode() {
            return this.f62095a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f62095a;
            return "ToWithdrawalOrderDriveFragment(orderId=" + str + ")";
        }
    }
}
