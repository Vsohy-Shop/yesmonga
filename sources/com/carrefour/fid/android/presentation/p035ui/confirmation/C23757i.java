package com.carrefour.fid.android.presentation.p035ui.confirmation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26190a;
import java.io.Serializable;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.i */
public final class C23757i implements C19764l {
    @C12579k

    /* renamed from: d */
    public static final C23758a f59827d = new C23758a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f59828e = 8;
    @C12579k

    /* renamed from: a */
    public final String f59829a;
    @C12580l

    /* renamed from: b */
    public final Bundle f59830b;
    @C12580l

    /* renamed from: c */
    public final Bundle f59831c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.i$a */
    public static final class C23758a {
        public /* synthetic */ C23758a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.presentation.p035ui.confirmation.C23757i mo69615a(@org.jetbrains.annotations.C12579k android.os.Bundle r10) {
            /*
                r9 = this;
                java.lang.String r0 = "bundle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.Class<com.carrefour.fid.android.presentation.ui.confirmation.i> r0 = com.carrefour.fid.android.presentation.p035ui.confirmation.C23757i.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                r10.setClassLoader(r0)
                java.lang.String r0 = "order_confirmation"
                boolean r1 = r10.containsKey(r0)
                java.lang.String r2 = " must implement Parcelable or Serializable or must be an Enum."
                java.lang.Class<java.io.Serializable> r3 = java.io.Serializable.class
                java.lang.Class<android.os.Parcelable> r4 = android.os.Parcelable.class
                r5 = 0
                java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
                if (r1 == 0) goto L_0x004c
                boolean r1 = r4.isAssignableFrom(r6)
                if (r1 != 0) goto L_0x0045
                boolean r1 = r3.isAssignableFrom(r6)
                if (r1 == 0) goto L_0x002c
                goto L_0x0045
            L_0x002c:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x0045:
                java.lang.Object r0 = r10.get(r0)
                android.os.Bundle r0 = (android.os.Bundle) r0
                goto L_0x004d
            L_0x004c:
                r0 = r5
            L_0x004d:
                java.lang.String r1 = "sub_basket_id"
                boolean r7 = r10.containsKey(r1)
                if (r7 == 0) goto L_0x009e
                java.lang.String r1 = r10.getString(r1)
                if (r1 == 0) goto L_0x0096
                java.lang.String r7 = "category_list_by_gtin"
                boolean r8 = r10.containsKey(r7)
                if (r8 == 0) goto L_0x0090
                boolean r4 = r4.isAssignableFrom(r6)
                if (r4 != 0) goto L_0x0089
                boolean r3 = r3.isAssignableFrom(r6)
                if (r3 == 0) goto L_0x0070
                goto L_0x0089
            L_0x0070:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x0089:
                java.lang.Object r10 = r10.get(r7)
                r5 = r10
                android.os.Bundle r5 = (android.os.Bundle) r5
            L_0x0090:
                com.carrefour.fid.android.presentation.ui.confirmation.i r10 = new com.carrefour.fid.android.presentation.ui.confirmation.i
                r10.<init>(r1, r0, r5)
                return r10
            L_0x0096:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Argument \"sub_basket_id\" is marked as non-null but was passed a null value."
                r10.<init>(r0)
                throw r10
            L_0x009e:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required argument \"sub_basket_id\" is missing and does not have an android:defaultValue"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.confirmation.C23757i.C23758a.mo69615a(android.os.Bundle):com.carrefour.fid.android.presentation.ui.confirmation.i");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.presentation.p035ui.confirmation.C23757i mo69616b(@org.jetbrains.annotations.C12579k androidx.lifecycle.C19456p0 r10) {
            /*
                r9 = this;
                java.lang.String r0 = "savedStateHandle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.String r0 = "order_confirmation"
                boolean r1 = r10.mo57647f(r0)
                java.lang.String r2 = " must implement Parcelable or Serializable or must be an Enum."
                java.lang.Class<java.io.Serializable> r3 = java.io.Serializable.class
                java.lang.Class<android.os.Parcelable> r4 = android.os.Parcelable.class
                r5 = 0
                java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
                if (r1 == 0) goto L_0x0043
                boolean r1 = r4.isAssignableFrom(r6)
                if (r1 != 0) goto L_0x003c
                boolean r1 = r3.isAssignableFrom(r6)
                if (r1 == 0) goto L_0x0023
                goto L_0x003c
            L_0x0023:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x003c:
                java.lang.Object r0 = r10.mo57648h(r0)
                android.os.Bundle r0 = (android.os.Bundle) r0
                goto L_0x0044
            L_0x0043:
                r0 = r5
            L_0x0044:
                java.lang.String r1 = "sub_basket_id"
                boolean r7 = r10.mo57647f(r1)
                if (r7 == 0) goto L_0x0097
                java.lang.Object r1 = r10.mo57648h(r1)
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L_0x008f
                java.lang.String r7 = "category_list_by_gtin"
                boolean r8 = r10.mo57647f(r7)
                if (r8 == 0) goto L_0x0089
                boolean r4 = r4.isAssignableFrom(r6)
                if (r4 != 0) goto L_0x0082
                boolean r3 = r3.isAssignableFrom(r6)
                if (r3 == 0) goto L_0x0069
                goto L_0x0082
            L_0x0069:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = r6.getName()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                r10.<init>(r0)
                throw r10
            L_0x0082:
                java.lang.Object r10 = r10.mo57648h(r7)
                r5 = r10
                android.os.Bundle r5 = (android.os.Bundle) r5
            L_0x0089:
                com.carrefour.fid.android.presentation.ui.confirmation.i r10 = new com.carrefour.fid.android.presentation.ui.confirmation.i
                r10.<init>(r1, r0, r5)
                return r10
            L_0x008f:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Argument \"sub_basket_id\" is marked as non-null but was passed a null value"
                r10.<init>(r0)
                throw r10
            L_0x0097:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required argument \"sub_basket_id\" is missing and does not have an android:defaultValue"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.confirmation.C23757i.C23758a.mo69616b(androidx.lifecycle.p0):com.carrefour.fid.android.presentation.ui.confirmation.i");
        }

        public C23758a() {
        }
    }

    public C23757i(@C12579k String str, @C12580l Bundle bundle, @C12580l Bundle bundle2) {
        Intrinsics.checkNotNullParameter(str, "subBasketId");
        this.f59829a = str;
        this.f59830b = bundle;
        this.f59831c = bundle2;
    }

    /* renamed from: e */
    public static /* synthetic */ C23757i m105363e(C23757i iVar, String str, Bundle bundle, Bundle bundle2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iVar.f59829a;
        }
        if ((i & 2) != 0) {
            bundle = iVar.f59830b;
        }
        if ((i & 4) != 0) {
            bundle2 = iVar.f59831c;
        }
        return iVar.mo69606d(str, bundle, bundle2);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C23757i m105364f(@C12579k C19456p0 p0Var) {
        return f59827d.mo69616b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C23757i fromBundle(@C12579k Bundle bundle) {
        return f59827d.mo69615a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo69603a() {
        return this.f59829a;
    }

    @C12580l
    /* renamed from: b */
    public final Bundle mo69604b() {
        return this.f59830b;
    }

    @C12580l
    /* renamed from: c */
    public final Bundle mo69605c() {
        return this.f59831c;
    }

    @C12579k
    /* renamed from: d */
    public final C23757i mo69606d(@C12579k String str, @C12580l Bundle bundle, @C12580l Bundle bundle2) {
        Intrinsics.checkNotNullParameter(str, "subBasketId");
        return new C23757i(str, bundle, bundle2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23757i)) {
            return false;
        }
        C23757i iVar = (C23757i) obj;
        return Intrinsics.areEqual((Object) this.f59829a, (Object) iVar.f59829a) && Intrinsics.areEqual((Object) this.f59830b, (Object) iVar.f59830b) && Intrinsics.areEqual((Object) this.f59831c, (Object) iVar.f59831c);
    }

    @C12580l
    /* renamed from: g */
    public final Bundle mo69608g() {
        return this.f59831c;
    }

    @C12580l
    /* renamed from: h */
    public final Bundle mo69609h() {
        return this.f59830b;
    }

    public int hashCode() {
        int hashCode = this.f59829a.hashCode() * 31;
        Bundle bundle = this.f59830b;
        int i = 0;
        int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        Bundle bundle2 = this.f59831c;
        if (bundle2 != null) {
            i = bundle2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    /* renamed from: i */
    public final String mo69611i() {
        return this.f59829a;
    }

    @C12579k
    /* renamed from: j */
    public final Bundle mo69612j() {
        Bundle bundle = new Bundle();
        Class<Parcelable> cls = Parcelable.class;
        Class<Bundle> cls2 = Bundle.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            bundle.putParcelable(CheckoutConfirmationFragment.f59773I0, this.f59830b);
        } else if (cls3.isAssignableFrom(cls2)) {
            bundle.putSerializable(CheckoutConfirmationFragment.f59773I0, (Serializable) this.f59830b);
        }
        bundle.putString(C26190a.f64037a, this.f59829a);
        if (cls.isAssignableFrom(cls2)) {
            bundle.putParcelable(C38212b.f96795c, this.f59831c);
        } else if (cls3.isAssignableFrom(cls2)) {
            bundle.putSerializable(C38212b.f96795c, (Serializable) this.f59831c);
        }
        return bundle;
    }

    @C12579k
    /* renamed from: k */
    public final C19456p0 mo69613k() {
        C19456p0 p0Var = new C19456p0();
        Class<Parcelable> cls = Parcelable.class;
        Class<Bundle> cls2 = Bundle.class;
        Class<Serializable> cls3 = Serializable.class;
        if (cls.isAssignableFrom(cls2)) {
            p0Var.mo57656q(CheckoutConfirmationFragment.f59773I0, this.f59830b);
        } else if (cls3.isAssignableFrom(cls2)) {
            p0Var.mo57656q(CheckoutConfirmationFragment.f59773I0, (Serializable) this.f59830b);
        }
        p0Var.mo57656q(C26190a.f64037a, this.f59829a);
        if (cls.isAssignableFrom(cls2)) {
            p0Var.mo57656q(C38212b.f96795c, this.f59831c);
        } else if (cls3.isAssignableFrom(cls2)) {
            p0Var.mo57656q(C38212b.f96795c, (Serializable) this.f59831c);
        }
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f59829a;
        Bundle bundle = this.f59830b;
        Bundle bundle2 = this.f59831c;
        return "CheckoutConfirmationFragmentArgs(subBasketId=" + str + ", orderConfirmation=" + bundle + ", categoryListByGtin=" + bundle2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23757i(String str, Bundle bundle, Bundle bundle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : bundle, (i & 4) != 0 ? null : bundle2);
    }
}
