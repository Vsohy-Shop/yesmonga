package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26190a;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.e */
public final class C23551e {
    @C12579k

    /* renamed from: a */
    public static final C23553b f59510a = new C23553b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f59511b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.e$b */
    public static final class C23553b {
        public /* synthetic */ C23553b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C19693b0 m104805b(C23553b bVar, String str, boolean z, Bundle bundle, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                bundle = null;
            }
            return bVar.mo69028a(str, z, bundle);
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo69028a(@C12579k String str, boolean z, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            return new C23552a(str, z, bundle);
        }

        public C23553b() {
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.e$a */
    public static final class C23552a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f59512a;

        /* renamed from: b */
        public final boolean f59513b;
        @C12580l

        /* renamed from: c */
        public final Bundle f59514c;

        /* renamed from: d */
        public final int f59515d;

        public C23552a(@C12579k String str, boolean z, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            this.f59512a = str;
            this.f59513b = z;
            this.f59514c = bundle;
            this.f59515d = R.id.action_basket_to_checkout;
        }

        /* renamed from: e */
        public static /* synthetic */ C23552a m104797e(C23552a aVar, String str, boolean z, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f59512a;
            }
            if ((i & 2) != 0) {
                z = aVar.f59513b;
            }
            if ((i & 4) != 0) {
                bundle = aVar.f59514c;
            }
            return aVar.mo69021d(str, z, bundle);
        }

        @C12579k
        /* renamed from: a */
        public final String mo69018a() {
            return this.f59512a;
        }

        /* renamed from: b */
        public final boolean mo69019b() {
            return this.f59513b;
        }

        @C12580l
        /* renamed from: c */
        public final Bundle mo69020c() {
            return this.f59514c;
        }

        @C12579k
        /* renamed from: d */
        public final C23552a mo69021d(@C12579k String str, boolean z, @C12580l Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            return new C23552a(str, z, bundle);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23552a)) {
                return false;
            }
            C23552a aVar = (C23552a) obj;
            return Intrinsics.areEqual((Object) this.f59512a, (Object) aVar.f59512a) && this.f59513b == aVar.f59513b && Intrinsics.areEqual((Object) this.f59514c, (Object) aVar.f59514c);
        }

        @C12580l
        /* renamed from: f */
        public final Bundle mo69023f() {
            return this.f59514c;
        }

        @C12579k
        /* renamed from: g */
        public final String mo69024g() {
            return this.f59512a;
        }

        public int getActionId() {
            return this.f59515d;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(C26190a.f64037a, this.f59512a);
            bundle.putBoolean("is_non_food_basket", this.f59513b);
            Class<Bundle> cls = Bundle.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable(C38212b.f96795c, this.f59514c);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable(C38212b.f96795c, (Serializable) this.f59514c);
            }
            return bundle;
        }

        /* renamed from: h */
        public final boolean mo69025h() {
            return this.f59513b;
        }

        public int hashCode() {
            int hashCode = this.f59512a.hashCode() * 31;
            boolean z = this.f59513b;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            Bundle bundle = this.f59514c;
            return i + (bundle == null ? 0 : bundle.hashCode());
        }

        @C12579k
        public String toString() {
            String str = this.f59512a;
            boolean z = this.f59513b;
            Bundle bundle = this.f59514c;
            return "ActionBasketToCheckout(subBasketId=" + str + ", isNonFoodBasket=" + z + ", categoryListByGtin=" + bundle + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C23552a(String str, boolean z, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : bundle);
        }
    }
}
