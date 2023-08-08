package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.d */
public final class C24404d implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C24405a f60874c = new C24405a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f60875d = 0;

    /* renamed from: a */
    public final boolean f60876a;
    @C12580l

    /* renamed from: b */
    public final String f60877b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.d$a */
    public static final class C24405a {
        public /* synthetic */ C24405a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24404d mo71386a(@C12579k Bundle bundle) {
            boolean z;
            String str;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24404d.class.getClassLoader());
            if (bundle.containsKey("isFromActiveFid")) {
                z = bundle.getBoolean("isFromActiveFid");
            } else {
                z = false;
            }
            if (bundle.containsKey(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD)) {
                str = bundle.getString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            } else {
                str = null;
            }
            return new C24404d(z, str);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24404d mo71387b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            String str;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("isFromActiveFid")) {
                bool = (Boolean) p0Var.mo57648h("isFromActiveFid");
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"isFromActiveFid\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            if (p0Var.mo57647f(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD)) {
                str = (String) p0Var.mo57648h(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            } else {
                str = null;
            }
            return new C24404d(bool.booleanValue(), str);
        }

        public C24405a() {
        }
    }

    public C24404d() {
        this(false, (String) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C24404d m107123d(C24404d dVar, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dVar.f60876a;
        }
        if ((i & 2) != 0) {
            str = dVar.f60877b;
        }
        return dVar.mo71378c(z, str);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C24404d m107124e(@C12579k C19456p0 p0Var) {
        return f60874c.mo71387b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24404d fromBundle(@C12579k Bundle bundle) {
        return f60874c.mo71386a(bundle);
    }

    /* renamed from: a */
    public final boolean mo71376a() {
        return this.f60876a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo71377b() {
        return this.f60877b;
    }

    @C12579k
    /* renamed from: c */
    public final C24404d mo71378c(boolean z, @C12580l String str) {
        return new C24404d(z, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24404d)) {
            return false;
        }
        C24404d dVar = (C24404d) obj;
        return this.f60876a == dVar.f60876a && Intrinsics.areEqual((Object) this.f60877b, (Object) dVar.f60877b);
    }

    @C12580l
    /* renamed from: f */
    public final String mo71380f() {
        return this.f60877b;
    }

    /* renamed from: g */
    public final boolean mo71381g() {
        return this.f60876a;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo71382h() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromActiveFid", this.f60876a);
        bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60877b);
        return bundle;
    }

    public int hashCode() {
        boolean z = this.f60876a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f60877b;
        return i + (str == null ? 0 : str.hashCode());
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo71384i() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("isFromActiveFid", Boolean.valueOf(this.f60876a));
        p0Var.mo57656q(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60877b);
        return p0Var;
    }

    @C12579k
    public String toString() {
        boolean z = this.f60876a;
        String str = this.f60877b;
        return "CreateLoyaltyCardStepOneFragmentArgs(isFromActiveFid=" + z + ", loyaltyCardNumber=" + str + ")";
    }

    public C24404d(boolean z, @C12580l String str) {
        this.f60876a = z;
        this.f60877b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24404d(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
    }
}
