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
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.e */
public final class C24406e {
    @C12579k

    /* renamed from: a */
    public static final C24408b f60878a = new C24408b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f60879b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.e$a */
    public static final class C24407a implements C19693b0 {

        /* renamed from: a */
        public final boolean f60880a;
        @C12580l

        /* renamed from: b */
        public final String f60881b;
        @C12580l

        /* renamed from: c */
        public final String f60882c;

        /* renamed from: d */
        public final int f60883d;

        public C24407a() {
            this(false, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public static /* synthetic */ C24407a m107134e(C24407a aVar, boolean z, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f60880a;
            }
            if ((i & 2) != 0) {
                str = aVar.f60881b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.f60882c;
            }
            return aVar.mo71391d(z, str, str2);
        }

        /* renamed from: a */
        public final boolean mo71388a() {
            return this.f60880a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo71389b() {
            return this.f60881b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo71390c() {
            return this.f60882c;
        }

        @C12579k
        /* renamed from: d */
        public final C24407a mo71391d(boolean z, @C12580l String str, @C12580l String str2) {
            return new C24407a(z, str, str2);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24407a)) {
                return false;
            }
            C24407a aVar = (C24407a) obj;
            return this.f60880a == aVar.f60880a && Intrinsics.areEqual((Object) this.f60881b, (Object) aVar.f60881b) && Intrinsics.areEqual((Object) this.f60882c, (Object) aVar.f60882c);
        }

        @C12580l
        /* renamed from: f */
        public final String mo71393f() {
            return this.f60881b;
        }

        @C12580l
        /* renamed from: g */
        public final String mo71394g() {
            return this.f60882c;
        }

        public int getActionId() {
            return this.f60883d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isFromActiveFid", this.f60880a);
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60881b);
            bundle.putString("loyaltyCodeSecret", this.f60882c);
            return bundle;
        }

        /* renamed from: h */
        public final boolean mo71395h() {
            return this.f60880a;
        }

        public int hashCode() {
            boolean z = this.f60880a;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            String str = this.f60881b;
            int i2 = 0;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f60882c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode + i2;
        }

        @C12579k
        public String toString() {
            boolean z = this.f60880a;
            String str = this.f60881b;
            String str2 = this.f60882c;
            return "ActionInitSecretCodeFragmentToCreateLoyaltyCardStepTwo(isFromActiveFid=" + z + ", loyaltyCardNumber=" + str + ", loyaltyCodeSecret=" + str2 + ")";
        }

        public C24407a(boolean z, @C12580l String str, @C12580l String str2) {
            this.f60880a = z;
            this.f60881b = str;
            this.f60882c = str2;
            this.f60883d = R.id.action_initSecretCodeFragment_to_createLoyaltyCardStepTwo;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24407a(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.e$b */
    public static final class C24408b {
        public /* synthetic */ C24408b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m107142b(C24408b bVar, boolean z, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return bVar.mo71398a(z, str, str2);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo71398a(boolean z, @C12580l String str, @C12580l String str2) {
            return new C24407a(z, str, str2);
        }

        public C24408b() {
        }
    }
}
