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
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.p */
public final class C24426p implements C19764l {
    @C12579k

    /* renamed from: d */
    public static final C24427a f60909d = new C24427a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f60910e = 0;

    /* renamed from: a */
    public final boolean f60911a;

    /* renamed from: b */
    public final boolean f60912b;
    @C12580l

    /* renamed from: c */
    public final String f60913c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.p$a */
    public static final class C24427a {
        public /* synthetic */ C24427a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24426p mo71468a(@C12579k Bundle bundle) {
            boolean z;
            String str;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24426p.class.getClassLoader());
            boolean z2 = false;
            if (bundle.containsKey("isFromAttachCard")) {
                z = bundle.getBoolean("isFromAttachCard");
            } else {
                z = false;
            }
            if (bundle.containsKey("isFromActiveFid")) {
                z2 = bundle.getBoolean("isFromActiveFid");
            }
            if (bundle.containsKey(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD)) {
                str = bundle.getString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            } else {
                str = null;
            }
            return new C24426p(z, z2, str);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24426p mo71469b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            Boolean bool2;
            String str;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("isFromAttachCard")) {
                bool = (Boolean) p0Var.mo57648h("isFromAttachCard");
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"isFromAttachCard\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            if (p0Var.mo57647f("isFromActiveFid")) {
                bool2 = (Boolean) p0Var.mo57648h("isFromActiveFid");
                if (bool2 == null) {
                    throw new IllegalArgumentException("Argument \"isFromActiveFid\" of type boolean does not support null values");
                }
            } else {
                bool2 = Boolean.FALSE;
            }
            if (p0Var.mo57647f(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD)) {
                str = (String) p0Var.mo57648h(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            } else {
                str = null;
            }
            return new C24426p(bool.booleanValue(), bool2.booleanValue(), str);
        }

        public C24427a() {
        }
    }

    public C24426p() {
        this(false, false, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ C24426p m107199e(C24426p pVar, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pVar.f60911a;
        }
        if ((i & 2) != 0) {
            z2 = pVar.f60912b;
        }
        if ((i & 4) != 0) {
            str = pVar.f60913c;
        }
        return pVar.mo71459d(z, z2, str);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C24426p m107200f(@C12579k C19456p0 p0Var) {
        return f60909d.mo71469b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24426p fromBundle(@C12579k Bundle bundle) {
        return f60909d.mo71468a(bundle);
    }

    /* renamed from: a */
    public final boolean mo71456a() {
        return this.f60911a;
    }

    /* renamed from: b */
    public final boolean mo71457b() {
        return this.f60912b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo71458c() {
        return this.f60913c;
    }

    @C12579k
    /* renamed from: d */
    public final C24426p mo71459d(boolean z, boolean z2, @C12580l String str) {
        return new C24426p(z, z2, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24426p)) {
            return false;
        }
        C24426p pVar = (C24426p) obj;
        return this.f60911a == pVar.f60911a && this.f60912b == pVar.f60912b && Intrinsics.areEqual((Object) this.f60913c, (Object) pVar.f60913c);
    }

    @C12580l
    /* renamed from: g */
    public final String mo71461g() {
        return this.f60913c;
    }

    /* renamed from: h */
    public final boolean mo71462h() {
        return this.f60912b;
    }

    public int hashCode() {
        boolean z = this.f60911a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f60912b;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        String str = this.f60913c;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: i */
    public final boolean mo71464i() {
        return this.f60911a;
    }

    @C12579k
    /* renamed from: j */
    public final Bundle mo71465j() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromAttachCard", this.f60911a);
        bundle.putBoolean("isFromActiveFid", this.f60912b);
        bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60913c);
        return bundle;
    }

    @C12579k
    /* renamed from: k */
    public final C19456p0 mo71466k() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("isFromAttachCard", Boolean.valueOf(this.f60911a));
        p0Var.mo57656q("isFromActiveFid", Boolean.valueOf(this.f60912b));
        p0Var.mo57656q(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60913c);
        return p0Var;
    }

    @C12579k
    public String toString() {
        boolean z = this.f60911a;
        boolean z2 = this.f60912b;
        String str = this.f60913c;
        return "CreateSecretCodeFragmentArgs(isFromAttachCard=" + z + ", isFromActiveFid=" + z2 + ", loyaltyCardNumber=" + str + ")";
    }

    public C24426p(boolean z, boolean z2, @C12580l String str) {
        this.f60911a = z;
        this.f60912b = z2;
        this.f60913c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24426p(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str);
    }
}
