package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.n */
public final class C24421n {
    @C12579k

    /* renamed from: a */
    public static final C24424c f60899a = new C24424c((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f60900b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.n$a */
    public static final class C24422a implements C19693b0 {

        /* renamed from: a */
        public final boolean f60901a;

        /* renamed from: b */
        public final boolean f60902b;
        @C12580l

        /* renamed from: c */
        public final String f60903c;

        /* renamed from: d */
        public final int f60904d;

        public C24422a() {
            this(false, false, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public static /* synthetic */ C24422a m107177e(C24422a aVar, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f60901a;
            }
            if ((i & 2) != 0) {
                z2 = aVar.f60902b;
            }
            if ((i & 4) != 0) {
                str = aVar.f60903c;
            }
            return aVar.mo71436d(z, z2, str);
        }

        /* renamed from: a */
        public final boolean mo71433a() {
            return this.f60901a;
        }

        /* renamed from: b */
        public final boolean mo71434b() {
            return this.f60902b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo71435c() {
            return this.f60903c;
        }

        @C12579k
        /* renamed from: d */
        public final C24422a mo71436d(boolean z, boolean z2, @C12580l String str) {
            return new C24422a(z, z2, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24422a)) {
                return false;
            }
            C24422a aVar = (C24422a) obj;
            return this.f60901a == aVar.f60901a && this.f60902b == aVar.f60902b && Intrinsics.areEqual((Object) this.f60903c, (Object) aVar.f60903c);
        }

        @C12580l
        /* renamed from: f */
        public final String mo71438f() {
            return this.f60903c;
        }

        /* renamed from: g */
        public final boolean mo71439g() {
            return this.f60901a;
        }

        public int getActionId() {
            return this.f60904d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isFromActiveFid", this.f60901a);
            bundle.putBoolean("isFromAttachCard", this.f60902b);
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60903c);
            return bundle;
        }

        /* renamed from: h */
        public final boolean mo71440h() {
            return this.f60902b;
        }

        public int hashCode() {
            boolean z = this.f60901a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f60902b;
            if (!z3) {
                z2 = z3;
            }
            int i2 = (i + (z2 ? 1 : 0)) * 31;
            String str = this.f60903c;
            return i2 + (str == null ? 0 : str.hashCode());
        }

        @C12579k
        public String toString() {
            boolean z = this.f60901a;
            boolean z2 = this.f60902b;
            String str = this.f60903c;
            return "ActionHomeLoyaltyFragmentToAcceptLoyaltyCguFragment(isFromActiveFid=" + z + ", isFromAttachCard=" + z2 + ", loyaltyCardNumber=" + str + ")";
        }

        public C24422a(boolean z, boolean z2, @C12580l String str) {
            this.f60901a = z;
            this.f60902b = z2;
            this.f60903c = str;
            this.f60904d = R.id.action_homeLoyaltyFragment_to_acceptLoyaltyCguFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24422a(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.n$b */
    public static final class C24423b implements C19693b0 {

        /* renamed from: a */
        public final boolean f60905a;

        /* renamed from: b */
        public final boolean f60906b;
        @C12580l

        /* renamed from: c */
        public final String f60907c;

        /* renamed from: d */
        public final int f60908d;

        public C24423b() {
            this(false, false, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public static /* synthetic */ C24423b m107185e(C24423b bVar, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.f60905a;
            }
            if ((i & 2) != 0) {
                z2 = bVar.f60906b;
            }
            if ((i & 4) != 0) {
                str = bVar.f60907c;
            }
            return bVar.mo71446d(z, z2, str);
        }

        /* renamed from: a */
        public final boolean mo71443a() {
            return this.f60905a;
        }

        /* renamed from: b */
        public final boolean mo71444b() {
            return this.f60906b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo71445c() {
            return this.f60907c;
        }

        @C12579k
        /* renamed from: d */
        public final C24423b mo71446d(boolean z, boolean z2, @C12580l String str) {
            return new C24423b(z, z2, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24423b)) {
                return false;
            }
            C24423b bVar = (C24423b) obj;
            return this.f60905a == bVar.f60905a && this.f60906b == bVar.f60906b && Intrinsics.areEqual((Object) this.f60907c, (Object) bVar.f60907c);
        }

        @C12580l
        /* renamed from: f */
        public final String mo71448f() {
            return this.f60907c;
        }

        /* renamed from: g */
        public final boolean mo71449g() {
            return this.f60906b;
        }

        public int getActionId() {
            return this.f60908d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isFromAttachCard", this.f60905a);
            bundle.putBoolean("isFromActiveFid", this.f60906b);
            bundle.putString(LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD, this.f60907c);
            return bundle;
        }

        /* renamed from: h */
        public final boolean mo71450h() {
            return this.f60905a;
        }

        public int hashCode() {
            boolean z = this.f60905a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f60906b;
            if (!z3) {
                z2 = z3;
            }
            int i2 = (i + (z2 ? 1 : 0)) * 31;
            String str = this.f60907c;
            return i2 + (str == null ? 0 : str.hashCode());
        }

        @C12579k
        public String toString() {
            boolean z = this.f60905a;
            boolean z2 = this.f60906b;
            String str = this.f60907c;
            return "ActionHomeLoyaltyFragmentToCreateSecretCodeFragment(isFromAttachCard=" + z + ", isFromActiveFid=" + z2 + ", loyaltyCardNumber=" + str + ")";
        }

        public C24423b(boolean z, boolean z2, @C12580l String str) {
            this.f60905a = z;
            this.f60906b = z2;
            this.f60907c = str;
            this.f60908d = R.id.action_homeLoyaltyFragment_to_createSecretCodeFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24423b(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.n$c */
    public static final class C24424c {
        public /* synthetic */ C24424c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m107193b(C24424c cVar, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return cVar.mo71453a(z, z2, str);
        }

        /* renamed from: e */
        public static /* synthetic */ C19693b0 m107194e(C24424c cVar, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return cVar.mo71455d(z, z2, str);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo71453a(boolean z, boolean z2, @C12580l String str) {
            return new C24422a(z, z2, str);
        }

        @C12579k
        /* renamed from: c */
        public final C19693b0 mo71454c() {
            return new C19690a(R.id.action_homeLoyaltyFragment_to_attachCardFragment);
        }

        @C12579k
        /* renamed from: d */
        public final C19693b0 mo71455d(boolean z, boolean z2, @C12580l String str) {
            return new C24423b(z, z2, str);
        }

        public C24424c() {
        }
    }
}
