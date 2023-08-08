package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.b */
public final class C24370b {
    @C12579k

    /* renamed from: a */
    public static final C24372b f60818a = new C24372b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f60819b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.b$a */
    public static final class C24371a implements C19693b0 {

        /* renamed from: a */
        public final boolean f60820a;

        /* renamed from: b */
        public final boolean f60821b;
        @C12580l

        /* renamed from: c */
        public final String f60822c;

        /* renamed from: d */
        public final int f60823d;

        public C24371a() {
            this(false, false, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public static /* synthetic */ C24371a m106993e(C24371a aVar, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f60820a;
            }
            if ((i & 2) != 0) {
                z2 = aVar.f60821b;
            }
            if ((i & 4) != 0) {
                str = aVar.f60822c;
            }
            return aVar.mo71260d(z, z2, str);
        }

        /* renamed from: a */
        public final boolean mo71257a() {
            return this.f60820a;
        }

        /* renamed from: b */
        public final boolean mo71258b() {
            return this.f60821b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo71259c() {
            return this.f60822c;
        }

        @C12579k
        /* renamed from: d */
        public final C24371a mo71260d(boolean z, boolean z2, @C12580l String str) {
            return new C24371a(z, z2, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24371a)) {
                return false;
            }
            C24371a aVar = (C24371a) obj;
            return this.f60820a == aVar.f60820a && this.f60821b == aVar.f60821b && Intrinsics.areEqual((Object) this.f60822c, (Object) aVar.f60822c);
        }

        @C12580l
        /* renamed from: f */
        public final String mo71262f() {
            return this.f60822c;
        }

        /* renamed from: g */
        public final boolean mo71263g() {
            return this.f60821b;
        }

        public int getActionId() {
            return this.f60823d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isFromAttachCard", this.f60820a);
            bundle.putBoolean("isFromActiveFid", this.f60821b);
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60822c);
            return bundle;
        }

        /* renamed from: h */
        public final boolean mo71264h() {
            return this.f60820a;
        }

        public int hashCode() {
            boolean z = this.f60820a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f60821b;
            if (!z3) {
                z2 = z3;
            }
            int i2 = (i + (z2 ? 1 : 0)) * 31;
            String str = this.f60822c;
            return i2 + (str == null ? 0 : str.hashCode());
        }

        @C12579k
        public String toString() {
            boolean z = this.f60820a;
            boolean z2 = this.f60821b;
            String str = this.f60822c;
            return "AcceptLoyaltyCguFragmentToCreateSecretCodeFragment(isFromAttachCard=" + z + ", isFromActiveFid=" + z2 + ", loyaltyCardNumber=" + str + ")";
        }

        public C24371a(boolean z, boolean z2, @C12580l String str) {
            this.f60820a = z;
            this.f60821b = z2;
            this.f60822c = str;
            this.f60823d = R.id.acceptLoyaltyCguFragment_to_createSecretCodeFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24371a(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.b$b */
    public static final class C24372b {
        public /* synthetic */ C24372b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m107001b(C24372b bVar, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return bVar.mo71267a(z, z2, str);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo71267a(boolean z, boolean z2, @C12580l String str) {
            return new C24371a(z, z2, str);
        }

        public C24372b() {
        }
    }
}
