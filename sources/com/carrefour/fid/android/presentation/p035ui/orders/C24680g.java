package com.carrefour.fid.android.presentation.p035ui.orders;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.core.type.AccountListType;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.OrderDetailParam;
import com.carrefour.fid.android.shared.domain.models.order.OrderType;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.g */
public final class C24680g {
    @C12579k

    /* renamed from: a */
    public static final C24685e f61288a = new C24685e((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f61289b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.g$a */
    public static final class C24681a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final String f61290a;
        @C12580l

        /* renamed from: b */
        public final AccountListType f61291b;

        /* renamed from: c */
        public final int f61292c;

        public C24681a() {
            this((String) null, (AccountListType) null, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public static /* synthetic */ C24681a m107757d(C24681a aVar, String str, AccountListType accountListType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f61290a;
            }
            if ((i & 2) != 0) {
                accountListType = aVar.f61291b;
            }
            return aVar.mo72105c(str, accountListType);
        }

        @C12580l
        /* renamed from: a */
        public final String mo72103a() {
            return this.f61290a;
        }

        @C12580l
        /* renamed from: b */
        public final AccountListType mo72104b() {
            return this.f61291b;
        }

        @C12579k
        /* renamed from: c */
        public final C24681a mo72105c(@C12580l String str, @C12580l AccountListType accountListType) {
            return new C24681a(str, accountListType);
        }

        @C12580l
        /* renamed from: e */
        public final AccountListType mo72106e() {
            return this.f61291b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24681a)) {
                return false;
            }
            C24681a aVar = (C24681a) obj;
            return Intrinsics.areEqual((Object) this.f61290a, (Object) aVar.f61290a) && Intrinsics.areEqual((Object) this.f61291b, (Object) aVar.f61291b);
        }

        @C12580l
        /* renamed from: f */
        public final String mo72108f() {
            return this.f61290a;
        }

        public int getActionId() {
            return this.f61292c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("order_id", this.f61290a);
            Class<AccountListType> cls = AccountListType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("account_list_type", this.f61291b);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("account_list_type", (Serializable) this.f61291b);
            }
            return bundle;
        }

        public int hashCode() {
            String str = this.f61290a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            AccountListType accountListType = this.f61291b;
            if (accountListType != null) {
                i = accountListType.hashCode();
            }
            return hashCode + i;
        }

        @C12579k
        public String toString() {
            String str = this.f61290a;
            AccountListType accountListType = this.f61291b;
            return "ActionOrdersFragmentToAccountListFragment(orderId=" + str + ", accountListType=" + accountListType + ")";
        }

        public C24681a(@C12580l String str, @C12580l AccountListType accountListType) {
            this.f61290a = str;
            this.f61291b = accountListType;
            this.f61292c = R.id.action_ordersFragment_to_accountListFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24681a(String str, AccountListType accountListType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : accountListType);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.g$b */
    public static final class C24682b implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final OrderDetailParam f61293a;

        /* renamed from: b */
        public final int f61294b = R.id.action_ordersFragment_to_ordersOfflineDetailsFragment;

        public C24682b(@C12579k OrderDetailParam orderDetailParam) {
            Intrinsics.checkNotNullParameter(orderDetailParam, "orderDetailParam");
            this.f61293a = orderDetailParam;
        }

        /* renamed from: c */
        public static /* synthetic */ C24682b m107763c(C24682b bVar, OrderDetailParam orderDetailParam, int i, Object obj) {
            if ((i & 1) != 0) {
                orderDetailParam = bVar.f61293a;
            }
            return bVar.mo72112b(orderDetailParam);
        }

        @C12579k
        /* renamed from: a */
        public final OrderDetailParam mo72111a() {
            return this.f61293a;
        }

        @C12579k
        /* renamed from: b */
        public final C24682b mo72112b(@C12579k OrderDetailParam orderDetailParam) {
            Intrinsics.checkNotNullParameter(orderDetailParam, "orderDetailParam");
            return new C24682b(orderDetailParam);
        }

        @C12579k
        /* renamed from: d */
        public final OrderDetailParam mo72113d() {
            return this.f61293a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24682b) && Intrinsics.areEqual((Object) this.f61293a, (Object) ((C24682b) obj).f61293a);
        }

        public int getActionId() {
            return this.f61294b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            Class<OrderDetailParam> cls = OrderDetailParam.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OrderDetailParam orderDetailParam = this.f61293a;
                Intrinsics.checkNotNull(orderDetailParam, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("order_detail_param", orderDetailParam);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OrderDetailParam orderDetailParam2 = this.f61293a;
                Intrinsics.checkNotNull(orderDetailParam2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("order_detail_param", (Serializable) orderDetailParam2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public int hashCode() {
            return this.f61293a.hashCode();
        }

        @C12579k
        public String toString() {
            OrderDetailParam orderDetailParam = this.f61293a;
            return "ActionOrdersFragmentToOrdersOfflineDetailsFragment(orderDetailParam=" + orderDetailParam + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.g$d */
    public static final class C24684d implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final String f61299a;

        /* renamed from: b */
        public final int f61300b;

        public C24684d() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24684d m107775c(C24684d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f61299a;
            }
            return dVar.mo72128b(str);
        }

        @C12580l
        /* renamed from: a */
        public final String mo72127a() {
            return this.f61299a;
        }

        @C12579k
        /* renamed from: b */
        public final C24684d mo72128b(@C12580l String str) {
            return new C24684d(str);
        }

        @C12580l
        /* renamed from: d */
        public final String mo72129d() {
            return this.f61299a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24684d) && Intrinsics.areEqual((Object) this.f61299a, (Object) ((C24684d) obj).f61299a);
        }

        public int getActionId() {
            return this.f61300b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("order_id", this.f61299a);
            return bundle;
        }

        public int hashCode() {
            String str = this.f61299a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f61299a;
            return "ActionOrdersOnlineFragmentToOrdersSuccessHandleFragment(orderId=" + str + ")";
        }

        public C24684d(@C12580l String str) {
            this.f61299a = str;
            this.f61300b = R.id.action_ordersOnlineFragment_to_ordersSuccessHandleFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24684d(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.g$e */
    public static final class C24685e {
        public /* synthetic */ C24685e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m107779b(C24685e eVar, String str, AccountListType accountListType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                accountListType = null;
            }
            return eVar.mo72133a(str, accountListType);
        }

        /* renamed from: e */
        public static /* synthetic */ C19693b0 m107780e(C24685e eVar, OrderType orderType, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return eVar.mo72135d(orderType, str, z);
        }

        /* renamed from: g */
        public static /* synthetic */ C19693b0 m107781g(C24685e eVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return eVar.mo72136f(str);
        }

        /* renamed from: i */
        public static /* synthetic */ C19693b0 m107782i(C24685e eVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = R.id.ordersFragment;
            }
            return eVar.mo72137h(i);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo72133a(@C12580l String str, @C12580l AccountListType accountListType) {
            return new C24681a(str, accountListType);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo72134c(@C12579k OrderDetailParam orderDetailParam) {
            Intrinsics.checkNotNullParameter(orderDetailParam, "orderDetailParam");
            return new C24682b(orderDetailParam);
        }

        @C12579k
        /* renamed from: d */
        public final C19693b0 mo72135d(@C12579k OrderType orderType, @C12580l String str, boolean z) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new C24683c(orderType, str, z);
        }

        @C12579k
        /* renamed from: f */
        public final C19693b0 mo72136f(@C12580l String str) {
            return new C24684d(str);
        }

        @C12579k
        /* renamed from: h */
        public final C19693b0 mo72137h(int i) {
            return new C24686f(i);
        }

        @C12579k
        /* renamed from: j */
        public final C19693b0 mo72138j(@C12579k String str, @C12579k OrderType orderType, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(str2, "facilityStoreId");
            return new C24687g(str, orderType, str2);
        }

        @C12579k
        /* renamed from: k */
        public final C19693b0 mo72139k(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            return new C24688h(str);
        }

        public C24685e() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.g$f */
    public static final class C24686f implements C19693b0 {

        /* renamed from: a */
        public final int f61301a;

        /* renamed from: b */
        public final int f61302b;

        public C24686f() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24686f m107790c(C24686f fVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = fVar.f61301a;
            }
            return fVar.mo72141b(i);
        }

        /* renamed from: a */
        public final int mo72140a() {
            return this.f61301a;
        }

        @C12579k
        /* renamed from: b */
        public final C24686f mo72141b(int i) {
            return new C24686f(i);
        }

        /* renamed from: d */
        public final int mo72142d() {
            return this.f61301a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24686f) && this.f61301a == ((C24686f) obj).f61301a;
        }

        public int getActionId() {
            return this.f61302b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putInt("sourceGraphId", this.f61301a);
            return bundle;
        }

        public int hashCode() {
            return Integer.hashCode(this.f61301a);
        }

        @C12579k
        public String toString() {
            int i = this.f61301a;
            return "ToAdditionalOrders(sourceGraphId=" + i + ")";
        }

        public C24686f(int i) {
            this.f61301a = i;
            this.f61302b = R.id.to_additional_orders;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24686f(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.id.ordersFragment : i);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.g$g */
    public static final class C24687g implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f61303a;
        @C12579k

        /* renamed from: b */
        public final OrderType f61304b;
        @C12579k

        /* renamed from: c */
        public final String f61305c;

        /* renamed from: d */
        public final int f61306d = R.id.to_serviceSlot;

        public C24687g(@C12579k String str, @C12579k OrderType orderType, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(str2, "facilityStoreId");
            this.f61303a = str;
            this.f61304b = orderType;
            this.f61305c = str2;
        }

        /* renamed from: e */
        public static /* synthetic */ C24687g m107794e(C24687g gVar, String str, OrderType orderType, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.f61303a;
            }
            if ((i & 2) != 0) {
                orderType = gVar.f61304b;
            }
            if ((i & 4) != 0) {
                str2 = gVar.f61305c;
            }
            return gVar.mo72149d(str, orderType, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo72146a() {
            return this.f61303a;
        }

        @C12579k
        /* renamed from: b */
        public final OrderType mo72147b() {
            return this.f61304b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo72148c() {
            return this.f61305c;
        }

        @C12579k
        /* renamed from: d */
        public final C24687g mo72149d(@C12579k String str, @C12579k OrderType orderType, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(str2, "facilityStoreId");
            return new C24687g(str, orderType, str2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24687g)) {
                return false;
            }
            C24687g gVar = (C24687g) obj;
            return Intrinsics.areEqual((Object) this.f61303a, (Object) gVar.f61303a) && Intrinsics.areEqual((Object) this.f61304b, (Object) gVar.f61304b) && Intrinsics.areEqual((Object) this.f61305c, (Object) gVar.f61305c);
        }

        @C12579k
        /* renamed from: f */
        public final String mo72151f() {
            return this.f61305c;
        }

        @C12579k
        /* renamed from: g */
        public final String mo72152g() {
            return this.f61303a;
        }

        public int getActionId() {
            return this.f61306d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("order_id", this.f61303a);
            Class<OrderType> cls = OrderType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OrderType orderType = this.f61304b;
                Intrinsics.checkNotNull(orderType, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable(C36178i.f89309d, orderType);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OrderType orderType2 = this.f61304b;
                Intrinsics.checkNotNull(orderType2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable(C36178i.f89309d, (Serializable) orderType2);
            } else {
                String name = cls.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putString("facility_store_id", this.f61305c);
            return bundle;
        }

        @C12579k
        /* renamed from: h */
        public final OrderType mo72153h() {
            return this.f61304b;
        }

        public int hashCode() {
            return (((this.f61303a.hashCode() * 31) + this.f61304b.hashCode()) * 31) + this.f61305c.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f61303a;
            OrderType orderType = this.f61304b;
            String str2 = this.f61305c;
            return "ToServiceSlot(orderId=" + str + ", orderType=" + orderType + ", facilityStoreId=" + str2 + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.g$h */
    public static final class C24688h implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f61307a;

        /* renamed from: b */
        public final int f61308b = R.id.to_withdrawalOrderDriveFragment;

        public C24688h(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            this.f61307a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C24688h m107802c(C24688h hVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hVar.f61307a;
            }
            return hVar.mo72157b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo72156a() {
            return this.f61307a;
        }

        @C12579k
        /* renamed from: b */
        public final C24688h mo72157b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "orderId");
            return new C24688h(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo72158d() {
            return this.f61307a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24688h) && Intrinsics.areEqual((Object) this.f61307a, (Object) ((C24688h) obj).f61307a);
        }

        public int getActionId() {
            return this.f61308b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("order_id", this.f61307a);
            return bundle;
        }

        public int hashCode() {
            return this.f61307a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f61307a;
            return "ToWithdrawalOrderDriveFragment(orderId=" + str + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.g$c */
    public static final class C24683c implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final OrderType f61295a;
        @C12580l

        /* renamed from: b */
        public final String f61296b;

        /* renamed from: c */
        public final boolean f61297c;

        /* renamed from: d */
        public final int f61298d;

        public C24683c(@C12579k OrderType orderType, @C12580l String str, boolean z) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.f61295a = orderType;
            this.f61296b = str;
            this.f61297c = z;
            this.f61298d = R.id.action_ordersFragment_to_ordersOnlineDetailsFragment;
        }

        /* renamed from: e */
        public static /* synthetic */ C24683c m107767e(C24683c cVar, OrderType orderType, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                orderType = cVar.f61295a;
            }
            if ((i & 2) != 0) {
                str = cVar.f61296b;
            }
            if ((i & 4) != 0) {
                z = cVar.f61297c;
            }
            return cVar.mo72120d(orderType, str, z);
        }

        @C12579k
        /* renamed from: a */
        public final OrderType mo72117a() {
            return this.f61295a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo72118b() {
            return this.f61296b;
        }

        /* renamed from: c */
        public final boolean mo72119c() {
            return this.f61297c;
        }

        @C12579k
        /* renamed from: d */
        public final C24683c mo72120d(@C12579k OrderType orderType, @C12580l String str, boolean z) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            return new C24683c(orderType, str, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24683c)) {
                return false;
            }
            C24683c cVar = (C24683c) obj;
            return Intrinsics.areEqual((Object) this.f61295a, (Object) cVar.f61295a) && Intrinsics.areEqual((Object) this.f61296b, (Object) cVar.f61296b) && this.f61297c == cVar.f61297c;
        }

        @C12580l
        /* renamed from: f */
        public final String mo72122f() {
            return this.f61296b;
        }

        /* renamed from: g */
        public final boolean mo72123g() {
            return this.f61297c;
        }

        public int getActionId() {
            return this.f61298d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("order_id", this.f61296b);
            bundle.putBoolean(C36178i.f89310e, this.f61297c);
            Class<OrderType> cls = OrderType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                OrderType orderType = this.f61295a;
                Intrinsics.checkNotNull(orderType, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable(C36178i.f89309d, orderType);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                OrderType orderType2 = this.f61295a;
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
        public final OrderType mo72124h() {
            return this.f61295a;
        }

        public int hashCode() {
            int hashCode = this.f61295a.hashCode() * 31;
            String str = this.f61296b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z = this.f61297c;
            if (z) {
                z = true;
            }
            return hashCode2 + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            OrderType orderType = this.f61295a;
            String str = this.f61296b;
            boolean z = this.f61297c;
            return "ActionOrdersFragmentToOrdersOnlineDetailsFragment(orderType=" + orderType + ", orderId=" + str + ", orderStatusIsAtLeastBilled=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24683c(OrderType orderType, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(orderType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z);
        }
    }
}
