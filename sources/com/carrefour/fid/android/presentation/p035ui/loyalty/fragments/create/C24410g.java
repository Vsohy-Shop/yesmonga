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
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.g */
public final class C24410g implements C19764l {
    @C12579k

    /* renamed from: d */
    public static final C24411a f60884d = new C24411a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f60885e = 0;

    /* renamed from: a */
    public final boolean f60886a;
    @C12580l

    /* renamed from: b */
    public final String f60887b;
    @C12580l

    /* renamed from: c */
    public final String f60888c;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.g$a */
    public static final class C24411a {
        public /* synthetic */ C24411a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24410g mo71411a(@C12579k Bundle bundle) {
            boolean z;
            String str;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24410g.class.getClassLoader());
            if (bundle.containsKey("isFromActiveFid")) {
                z = bundle.getBoolean("isFromActiveFid");
            } else {
                z = false;
            }
            String str2 = null;
            if (bundle.containsKey(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD)) {
                str = bundle.getString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
            } else {
                str = null;
            }
            if (bundle.containsKey("loyaltyCodeSecret")) {
                str2 = bundle.getString("loyaltyCodeSecret");
            }
            return new C24410g(z, str, str2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.C24410g mo71412b(@org.jetbrains.annotations.C12579k androidx.lifecycle.C19456p0 r6) {
            /*
                r5 = this;
                java.lang.String r0 = "savedStateHandle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "isFromActiveFid"
                boolean r1 = r6.mo57647f(r0)
                if (r1 == 0) goto L_0x001e
                java.lang.Object r0 = r6.mo57648h(r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                if (r0 == 0) goto L_0x0016
                goto L_0x0020
            L_0x0016:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Argument \"isFromActiveFid\" of type boolean does not support null values"
                r6.<init>(r0)
                throw r6
            L_0x001e:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
            L_0x0020:
                java.lang.String r1 = "loyaltyCardNumber"
                boolean r2 = r6.mo57647f(r1)
                r3 = 0
                if (r2 == 0) goto L_0x0030
                java.lang.Object r1 = r6.mo57648h(r1)
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x0031
            L_0x0030:
                r1 = r3
            L_0x0031:
                java.lang.String r2 = "loyaltyCodeSecret"
                boolean r4 = r6.mo57647f(r2)
                if (r4 == 0) goto L_0x0040
                java.lang.Object r6 = r6.mo57648h(r2)
                r3 = r6
                java.lang.String r3 = (java.lang.String) r3
            L_0x0040:
                com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.g r6 = new com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.g
                boolean r0 = r0.booleanValue()
                r6.<init>(r0, r1, r3)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create.C24410g.C24411a.mo71412b(androidx.lifecycle.p0):com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.g");
        }

        public C24411a() {
        }
    }

    public C24410g() {
        this(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ C24410g m107145e(C24410g gVar, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = gVar.f60886a;
        }
        if ((i & 2) != 0) {
            str = gVar.f60887b;
        }
        if ((i & 4) != 0) {
            str2 = gVar.f60888c;
        }
        return gVar.mo71402d(z, str, str2);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C24410g m107146f(@C12579k C19456p0 p0Var) {
        return f60884d.mo71412b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24410g fromBundle(@C12579k Bundle bundle) {
        return f60884d.mo71411a(bundle);
    }

    /* renamed from: a */
    public final boolean mo71399a() {
        return this.f60886a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo71400b() {
        return this.f60887b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo71401c() {
        return this.f60888c;
    }

    @C12579k
    /* renamed from: d */
    public final C24410g mo71402d(boolean z, @C12580l String str, @C12580l String str2) {
        return new C24410g(z, str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24410g)) {
            return false;
        }
        C24410g gVar = (C24410g) obj;
        return this.f60886a == gVar.f60886a && Intrinsics.areEqual((Object) this.f60887b, (Object) gVar.f60887b) && Intrinsics.areEqual((Object) this.f60888c, (Object) gVar.f60888c);
    }

    @C12580l
    /* renamed from: g */
    public final String mo71404g() {
        return this.f60887b;
    }

    @C12580l
    /* renamed from: h */
    public final String mo71405h() {
        return this.f60888c;
    }

    public int hashCode() {
        boolean z = this.f60886a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f60887b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60888c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    /* renamed from: i */
    public final boolean mo71407i() {
        return this.f60886a;
    }

    @C12579k
    /* renamed from: j */
    public final Bundle mo71408j() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isFromActiveFid", this.f60886a);
        bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60887b);
        bundle.putString("loyaltyCodeSecret", this.f60888c);
        return bundle;
    }

    @C12579k
    /* renamed from: k */
    public final C19456p0 mo71409k() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("isFromActiveFid", Boolean.valueOf(this.f60886a));
        p0Var.mo57656q(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60887b);
        p0Var.mo57656q("loyaltyCodeSecret", this.f60888c);
        return p0Var;
    }

    @C12579k
    public String toString() {
        boolean z = this.f60886a;
        String str = this.f60887b;
        String str2 = this.f60888c;
        return "CreateLoyaltyCardStepTwoFragmentArgs(isFromActiveFid=" + z + ", loyaltyCardNumber=" + str + ", loyaltyCodeSecret=" + str2 + ")";
    }

    public C24410g(boolean z, @C12580l String str, @C12580l String str2) {
        this.f60886a = z;
        this.f60887b = str;
        this.f60888c = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24410g(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
