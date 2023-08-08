package com.carrefour.fid.android.presentation.p035ui.account.list;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.core.type.AccountListType;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.a */
public final class C22945a implements C19764l {
    @C12579k

    /* renamed from: d */
    public static final C22946a f58560d = new C22946a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f58561e = 0;
    @C12580l

    /* renamed from: a */
    public final String f58562a;
    @C12580l

    /* renamed from: b */
    public final AccountListType f58563b;

    /* renamed from: c */
    public final boolean f58564c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.a$a */
    public static final class C22946a {
        public /* synthetic */ C22946a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.carrefour.fid.android.core.type.AccountListType} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.presentation.p035ui.account.list.C22945a mo67494a(@org.jetbrains.annotations.C12579k android.os.Bundle r5) {
            /*
                r4 = this;
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.Class<com.carrefour.fid.android.presentation.ui.account.list.a> r0 = com.carrefour.fid.android.presentation.p035ui.account.list.C22945a.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                r5.setClassLoader(r0)
                java.lang.String r0 = "order_id"
                boolean r1 = r5.containsKey(r0)
                r2 = 0
                if (r1 == 0) goto L_0x001c
                java.lang.String r0 = r5.getString(r0)
                goto L_0x001d
            L_0x001c:
                r0 = r2
            L_0x001d:
                java.lang.String r1 = "account_list_type"
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x005a
                java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
                java.lang.Class<com.carrefour.fid.android.core.type.AccountListType> r3 = com.carrefour.fid.android.core.type.AccountListType.class
                boolean r2 = r2.isAssignableFrom(r3)
                if (r2 != 0) goto L_0x0053
                java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
                boolean r2 = r2.isAssignableFrom(r3)
                if (r2 == 0) goto L_0x0038
                goto L_0x0053
            L_0x0038:
                java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r3.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = " must implement Parcelable or Serializable or must be an Enum."
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r5.<init>(r0)
                throw r5
            L_0x0053:
                java.lang.Object r1 = r5.get(r1)
                r2 = r1
                com.carrefour.fid.android.core.type.AccountListType r2 = (com.carrefour.fid.android.core.type.AccountListType) r2
            L_0x005a:
                java.lang.String r1 = "showAllCatalogs"
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x0067
                boolean r5 = r5.getBoolean(r1)
                goto L_0x0068
            L_0x0067:
                r5 = 0
            L_0x0068:
                com.carrefour.fid.android.presentation.ui.account.list.a r1 = new com.carrefour.fid.android.presentation.ui.account.list.a
                r1.<init>(r0, r2, r5)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.list.C22945a.C22946a.mo67494a(android.os.Bundle):com.carrefour.fid.android.presentation.ui.account.list.a");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.carrefour.fid.android.core.type.AccountListType} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.presentation.p035ui.account.list.C22945a mo67495b(@org.jetbrains.annotations.C12579k androidx.lifecycle.C19456p0 r5) {
            /*
                r4 = this;
                java.lang.String r0 = "savedStateHandle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "order_id"
                boolean r1 = r5.mo57647f(r0)
                r2 = 0
                if (r1 == 0) goto L_0x0015
                java.lang.Object r0 = r5.mo57648h(r0)
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x0016
            L_0x0015:
                r0 = r2
            L_0x0016:
                java.lang.String r1 = "account_list_type"
                boolean r3 = r5.mo57647f(r1)
                if (r3 == 0) goto L_0x0053
                java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
                java.lang.Class<com.carrefour.fid.android.core.type.AccountListType> r3 = com.carrefour.fid.android.core.type.AccountListType.class
                boolean r2 = r2.isAssignableFrom(r3)
                if (r2 != 0) goto L_0x004c
                java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
                boolean r2 = r2.isAssignableFrom(r3)
                if (r2 == 0) goto L_0x0031
                goto L_0x004c
            L_0x0031:
                java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r3.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = " must implement Parcelable or Serializable or must be an Enum."
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r5.<init>(r0)
                throw r5
            L_0x004c:
                java.lang.Object r1 = r5.mo57648h(r1)
                r2 = r1
                com.carrefour.fid.android.core.type.AccountListType r2 = (com.carrefour.fid.android.core.type.AccountListType) r2
            L_0x0053:
                java.lang.String r1 = "showAllCatalogs"
                boolean r3 = r5.mo57647f(r1)
                if (r3 == 0) goto L_0x006c
                java.lang.Object r5 = r5.mo57648h(r1)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                if (r5 == 0) goto L_0x0064
                goto L_0x006e
            L_0x0064:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Argument \"showAllCatalogs\" of type boolean does not support null values"
                r5.<init>(r0)
                throw r5
            L_0x006c:
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
            L_0x006e:
                com.carrefour.fid.android.presentation.ui.account.list.a r1 = new com.carrefour.fid.android.presentation.ui.account.list.a
                boolean r5 = r5.booleanValue()
                r1.<init>(r0, r2, r5)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.account.list.C22945a.C22946a.mo67495b(androidx.lifecycle.p0):com.carrefour.fid.android.presentation.ui.account.list.a");
        }

        public C22946a() {
        }
    }

    public C22945a() {
        this((String) null, (AccountListType) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ C22945a m103321e(C22945a aVar, String str, AccountListType accountListType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f58562a;
        }
        if ((i & 2) != 0) {
            accountListType = aVar.f58563b;
        }
        if ((i & 4) != 0) {
            z = aVar.f58564c;
        }
        return aVar.mo67485d(str, accountListType, z);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C22945a m103322f(@C12579k C19456p0 p0Var) {
        return f58560d.mo67495b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C22945a fromBundle(@C12579k Bundle bundle) {
        return f58560d.mo67494a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final String mo67482a() {
        return this.f58562a;
    }

    @C12580l
    /* renamed from: b */
    public final AccountListType mo67483b() {
        return this.f58563b;
    }

    /* renamed from: c */
    public final boolean mo67484c() {
        return this.f58564c;
    }

    @C12579k
    /* renamed from: d */
    public final C22945a mo67485d(@C12580l String str, @C12580l AccountListType accountListType, boolean z) {
        return new C22945a(str, accountListType, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22945a)) {
            return false;
        }
        C22945a aVar = (C22945a) obj;
        return Intrinsics.areEqual((Object) this.f58562a, (Object) aVar.f58562a) && Intrinsics.areEqual((Object) this.f58563b, (Object) aVar.f58563b) && this.f58564c == aVar.f58564c;
    }

    @C12580l
    /* renamed from: g */
    public final AccountListType mo67487g() {
        return this.f58563b;
    }

    @C12580l
    /* renamed from: h */
    public final String mo67488h() {
        return this.f58562a;
    }

    public int hashCode() {
        String str = this.f58562a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AccountListType accountListType = this.f58563b;
        if (accountListType != null) {
            i = accountListType.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f58564c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo67490i() {
        return this.f58564c;
    }

    @C12579k
    /* renamed from: j */
    public final Bundle mo67491j() {
        Bundle bundle = new Bundle();
        bundle.putString("order_id", this.f58562a);
        Class<AccountListType> cls = AccountListType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            bundle.putParcelable("account_list_type", this.f58563b);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            bundle.putSerializable("account_list_type", (Serializable) this.f58563b);
        }
        bundle.putBoolean("showAllCatalogs", this.f58564c);
        return bundle;
    }

    @C12579k
    /* renamed from: k */
    public final C19456p0 mo67492k() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("order_id", this.f58562a);
        Class<AccountListType> cls = AccountListType.class;
        if (Parcelable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("account_list_type", this.f58563b);
        } else if (Serializable.class.isAssignableFrom(cls)) {
            p0Var.mo57656q("account_list_type", (Serializable) this.f58563b);
        }
        p0Var.mo57656q("showAllCatalogs", Boolean.valueOf(this.f58564c));
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f58562a;
        AccountListType accountListType = this.f58563b;
        boolean z = this.f58564c;
        return "AccountListFragmentArgs(orderId=" + str + ", accountListType=" + accountListType + ", showAllCatalogs=" + z + ")";
    }

    public C22945a(@C12580l String str, @C12580l AccountListType accountListType, boolean z) {
        this.f58562a = str;
        this.f58563b = accountListType;
        this.f58564c = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22945a(String str, AccountListType accountListType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : accountListType, (i & 4) != 0 ? false : z);
    }
}
