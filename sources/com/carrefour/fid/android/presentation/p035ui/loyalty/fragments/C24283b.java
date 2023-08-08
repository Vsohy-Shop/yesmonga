package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.b */
public final class C24283b {
    @C12579k

    /* renamed from: a */
    public static final C24286c f60693a = new C24286c((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f60694b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.b$a */
    public static final class C24284a implements C19693b0 {

        /* renamed from: a */
        public final boolean f60695a;

        /* renamed from: b */
        public final boolean f60696b;
        @C12580l

        /* renamed from: c */
        public final String f60697c;

        /* renamed from: d */
        public final int f60698d;

        public C24284a() {
            this(false, false, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public static /* synthetic */ C24284a m106783e(C24284a aVar, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f60695a;
            }
            if ((i & 2) != 0) {
                z2 = aVar.f60696b;
            }
            if ((i & 4) != 0) {
                str = aVar.f60697c;
            }
            return aVar.mo71038d(z, z2, str);
        }

        /* renamed from: a */
        public final boolean mo71035a() {
            return this.f60695a;
        }

        /* renamed from: b */
        public final boolean mo71036b() {
            return this.f60696b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo71037c() {
            return this.f60697c;
        }

        @C12579k
        /* renamed from: d */
        public final C24284a mo71038d(boolean z, boolean z2, @C12580l String str) {
            return new C24284a(z, z2, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24284a)) {
                return false;
            }
            C24284a aVar = (C24284a) obj;
            return this.f60695a == aVar.f60695a && this.f60696b == aVar.f60696b && Intrinsics.areEqual((Object) this.f60697c, (Object) aVar.f60697c);
        }

        @C12580l
        /* renamed from: f */
        public final String mo71040f() {
            return this.f60697c;
        }

        /* renamed from: g */
        public final boolean mo71041g() {
            return this.f60695a;
        }

        public int getActionId() {
            return this.f60698d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isFromActiveFid", this.f60695a);
            bundle.putBoolean("isFromAttachCard", this.f60696b);
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60697c);
            return bundle;
        }

        /* renamed from: h */
        public final boolean mo71042h() {
            return this.f60696b;
        }

        public int hashCode() {
            boolean z = this.f60695a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f60696b;
            if (!z3) {
                z2 = z3;
            }
            int i2 = (i + (z2 ? 1 : 0)) * 31;
            String str = this.f60697c;
            return i2 + (str == null ? 0 : str.hashCode());
        }

        @C12579k
        public String toString() {
            boolean z = this.f60695a;
            boolean z2 = this.f60696b;
            String str = this.f60697c;
            return "ActionBaseLoyaltyFragmentToCreateCardFragment(isFromActiveFid=" + z + ", isFromAttachCard=" + z2 + ", loyaltyCardNumber=" + str + ")";
        }

        public C24284a(boolean z, boolean z2, @C12580l String str) {
            this.f60695a = z;
            this.f60696b = z2;
            this.f60697c = str;
            this.f60698d = R.id.action_baseLoyaltyFragment_to_createCardFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24284a(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.b$b */
    public static final class C24285b implements C19693b0 {

        /* renamed from: a */
        public final boolean f60699a;

        /* renamed from: b */
        public final int f60700b;

        public C24285b() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24285b m106791c(C24285b bVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f60699a;
            }
            return bVar.mo71046b(z);
        }

        /* renamed from: a */
        public final boolean mo71045a() {
            return this.f60699a;
        }

        @C12579k
        /* renamed from: b */
        public final C24285b mo71046b(boolean z) {
            return new C24285b(z);
        }

        /* renamed from: d */
        public final boolean mo71047d() {
            return this.f60699a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24285b) && this.f60699a == ((C24285b) obj).f60699a;
        }

        public int getActionId() {
            return this.f60700b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(C38212b.f96814v, this.f60699a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f60699a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f60699a;
            return "ActionBaseLoyaltyFragmentToHomeLoyaltyFragment(errorBalance=" + z + ")";
        }

        public C24285b(boolean z) {
            this.f60699a = z;
            this.f60700b = R.id.action_baseLoyaltyFragment_to_homeLoyaltyFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24285b(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.b$c */
    public static final class C24286c {
        public /* synthetic */ C24286c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ C19693b0 m106795c(C24286c cVar, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return cVar.mo71052b(z, z2, str);
        }

        /* renamed from: e */
        public static /* synthetic */ C19693b0 m106796e(C24286c cVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return cVar.mo71053d(z);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo71051a() {
            return new C19690a(R.id.action_baseLoyaltyFragment_to_attachCardFragment);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo71052b(boolean z, boolean z2, @C12580l String str) {
            return new C24284a(z, z2, str);
        }

        @C12579k
        /* renamed from: d */
        public final C19693b0 mo71053d(boolean z) {
            return new C24285b(z);
        }

        @C12579k
        /* renamed from: f */
        public final C19693b0 mo71054f() {
            return new C19690a(R.id.action_baseLoyaltyFragment_to_loyaltyDetailViewFragment);
        }

        @C12579k
        /* renamed from: g */
        public final C19693b0 mo71055g() {
            return new C19690a(R.id.action_baseLoyaltyFragment_to_loyaltyNotLoggedFragment);
        }

        public C24286c() {
        }
    }
}
