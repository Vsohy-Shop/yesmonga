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
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.a */
public final class C24368a implements C19764l {
    @C12579k

    /* renamed from: d */
    public static final C24369a f60813d = new C24369a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f60814e = 0;

    /* renamed from: a */
    public final boolean f60815a;

    /* renamed from: b */
    public final boolean f60816b;
    @C12580l

    /* renamed from: c */
    public final String f60817c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.a$a */
    public static final class C24369a {
        public /* synthetic */ C24369a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24368a mo71255a(@C12579k Bundle bundle) {
            boolean z;
            String str;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24368a.class.getClassLoader());
            boolean z2 = false;
            if (bundle.containsKey("isFromActiveFid")) {
                z = bundle.getBoolean("isFromActiveFid");
            } else {
                z = false;
            }
            if (bundle.containsKey("isFromAttachCard")) {
                z2 = bundle.getBoolean("isFromAttachCard");
            }
            if (bundle.containsKey(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD)) {
                str = bundle.getString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            } else {
                str = null;
            }
            return new C24368a(z, z2, str);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24368a mo71256b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            Boolean bool2;
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
            if (p0Var.mo57647f("isFromAttachCard")) {
                bool2 = (Boolean) p0Var.mo57648h("isFromAttachCard");
                if (bool2 == null) {
                    throw new IllegalArgumentException("Argument \"isFromAttachCard\" of type boolean does not support null values");
                }
            } else {
                bool2 = Boolean.FALSE;
            }
            if (p0Var.mo57647f(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD)) {
                str = (String) p0Var.mo57648h(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            } else {
                str = null;
            }
            return new C24368a(bool.booleanValue(), bool2.booleanValue(), str);
        }

        public C24369a() {
        }
    }

    public C24368a() {
        this(false, false, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ C24368a m106980e(C24368a aVar, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f60815a;
        }
        if ((i & 2) != 0) {
            z2 = aVar.f60816b;
        }
        if ((i & 4) != 0) {
            str = aVar.f60817c;
        }
        return aVar.mo71246d(z, z2, str);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C24368a m106981f(@C12579k C19456p0 p0Var) {
        return f60813d.mo71256b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24368a fromBundle(@C12579k Bundle bundle) {
        return f60813d.mo71255a(bundle);
    }

    /* renamed from: a */
    public final boolean mo71243a() {
        return this.f60815a;
    }

    /* renamed from: b */
    public final boolean mo71244b() {
        return this.f60816b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo71245c() {
        return this.f60817c;
    }

    @C12579k
    /* renamed from: d */
    public final C24368a mo71246d(boolean z, boolean z2, @C12580l String str) {
        return new C24368a(z, z2, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24368a)) {
            return false;
        }
        C24368a aVar = (C24368a) obj;
        return this.f60815a == aVar.f60815a && this.f60816b == aVar.f60816b && Intrinsics.areEqual((Object) this.f60817c, (Object) aVar.f60817c);
    }

    @C12580l
    /* renamed from: g */
    public final String mo71248g() {
        return this.f60817c;
    }

    /* renamed from: h */
    public final boolean mo71249h() {
        return this.f60815a;
    }

    public int hashCode() {
        boolean z = this.f60815a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f60816b;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        String str = this.f60817c;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: i */
    public final boolean mo71251i() {
        return this.f60816b;
    }

    @C12579k
    /* renamed from: j */
    public final Bundle mo71252j() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromActiveFid", this.f60815a);
        bundle.putBoolean("isFromAttachCard", this.f60816b);
        bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60817c);
        return bundle;
    }

    @C12579k
    /* renamed from: k */
    public final C19456p0 mo71253k() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("isFromActiveFid", Boolean.valueOf(this.f60815a));
        p0Var.mo57656q("isFromAttachCard", Boolean.valueOf(this.f60816b));
        p0Var.mo57656q(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60817c);
        return p0Var;
    }

    @C12579k
    public String toString() {
        boolean z = this.f60815a;
        boolean z2 = this.f60816b;
        String str = this.f60817c;
        return "AcceptLoyaltyCguFragmentArgs(isFromActiveFid=" + z + ", isFromAttachCard=" + z2 + ", loyaltyCardNumber=" + str + ")";
    }

    public C24368a(boolean z, boolean z2, @C12580l String str) {
        this.f60815a = z;
        this.f60816b = z2;
        this.f60817c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24368a(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str);
    }
}
