package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.create;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.h */
public final class C24412h {
    @C12579k

    /* renamed from: a */
    public static final C24414b f60889a = new C24414b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f60890b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.h$a */
    public static final class C24413a implements C19693b0 {

        /* renamed from: a */
        public final boolean f60891a;

        /* renamed from: b */
        public final int f60892b;

        public C24413a() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C24413a m107158c(C24413a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f60891a;
            }
            return aVar.mo71414b(z);
        }

        /* renamed from: a */
        public final boolean mo71413a() {
            return this.f60891a;
        }

        @C12579k
        /* renamed from: b */
        public final C24413a mo71414b(boolean z) {
            return new C24413a(z);
        }

        /* renamed from: d */
        public final boolean mo71415d() {
            return this.f60891a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24413a) && this.f60891a == ((C24413a) obj).f60891a;
        }

        public int getActionId() {
            return this.f60892b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isFromActiveFid", this.f60891a);
            return bundle;
        }

        public int hashCode() {
            boolean z = this.f60891a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @C12579k
        public String toString() {
            boolean z = this.f60891a;
            return "ActionCreateLoyaltyCardStepTwoFragmentToLoyaltyBonusListFragment(isFromActiveFid=" + z + ")";
        }

        public C24413a(boolean z) {
            this.f60891a = z;
            this.f60892b = R.id.action_createLoyaltyCardStepTwoFragment_to_loyaltyBonusListFragment;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24413a(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.create.h$b */
    public static final class C24414b {
        public /* synthetic */ C24414b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m107162b(C24414b bVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return bVar.mo71419a(z);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo71419a(boolean z) {
            return new C24413a(z);
        }

        public C24414b() {
        }
    }
}
