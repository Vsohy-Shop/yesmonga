package com.carrefour.fid.android.presentation.p035ui.orders.online;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.type.AccountListType;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.e */
public final class C25193e {
    @C12579k

    /* renamed from: a */
    public static final C25195b f62064a = new C25195b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f62065b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.e$a */
    public static final class C25194a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final String f62066a;
        @C12580l

        /* renamed from: b */
        public final AccountListType f62067b;

        /* renamed from: c */
        public final int f62068c;

        public C25194a() {
            this((String) null, (AccountListType) null, 3, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public static /* synthetic */ C25194a m108871d(C25194a aVar, String str, AccountListType accountListType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f62066a;
            }
            if ((i & 2) != 0) {
                accountListType = aVar.f62067b;
            }
            return aVar.mo73216c(str, accountListType);
        }

        @C12580l
        /* renamed from: a */
        public final String mo73214a() {
            return this.f62066a;
        }

        @C12580l
        /* renamed from: b */
        public final AccountListType mo73215b() {
            return this.f62067b;
        }

        @C12579k
        /* renamed from: c */
        public final C25194a mo73216c(@C12580l String str, @C12580l AccountListType accountListType) {
            return new C25194a(str, accountListType);
        }

        @C12580l
        /* renamed from: e */
        public final AccountListType mo73217e() {
            return this.f62067b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25194a)) {
                return false;
            }
            C25194a aVar = (C25194a) obj;
            return Intrinsics.areEqual((Object) this.f62066a, (Object) aVar.f62066a) && Intrinsics.areEqual((Object) this.f62067b, (Object) aVar.f62067b);
        }

        @C12580l
        /* renamed from: f */
        public final String mo73219f() {
            return this.f62066a;
        }

        public int getActionId() {
            return this.f62068c;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("order_id", this.f62066a);
            Class<AccountListType> cls = AccountListType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable("account_list_type", this.f62067b);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable("account_list_type", (Serializable) this.f62067b);
            }
            return bundle;
        }

        public int hashCode() {
            String str = this.f62066a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            AccountListType accountListType = this.f62067b;
            if (accountListType != null) {
                i = accountListType.hashCode();
            }
            return hashCode + i;
        }

        @C12579k
        public String toString() {
            String str = this.f62066a;
            AccountListType accountListType = this.f62067b;
            return "ActionListProductsOrderedFragmentToAccountListFragment(orderId=" + str + ", accountListType=" + accountListType + ")";
        }

        public C25194a(@C12580l String str, @C12580l AccountListType accountListType) {
            this.f62066a = str;
            this.f62067b = accountListType;
            this.f62068c = R.id.action_listProductsOrderedFragment_to_accountListFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25194a(String str, AccountListType accountListType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : accountListType);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.e$b */
    public static final class C25195b {
        public /* synthetic */ C25195b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m108877b(C25195b bVar, String str, AccountListType accountListType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                accountListType = null;
            }
            return bVar.mo73222a(str, accountListType);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo73222a(@C12580l String str, @C12580l AccountListType accountListType) {
            return new C25194a(str, accountListType);
        }

        public C25195b() {
        }
    }
}
