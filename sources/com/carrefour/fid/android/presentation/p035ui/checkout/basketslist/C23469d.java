package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19690a;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step1.C26143a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.d */
public final class C23469d {
    @C12579k

    /* renamed from: a */
    public static final C23471b f59338a = new C23471b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f59339b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.d$a */
    public static final class C23470a implements C19693b0 {
        @C12579k

        /* renamed from: a */
        public final String f59340a;

        /* renamed from: b */
        public final int f59341b = R.id.action_baskets_list_to_nal_checkout_step_1_fragment;

        public C23470a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "referenceId");
            this.f59340a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C23470a m104572c(C23470a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f59340a;
            }
            return aVar.mo68741b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo68740a() {
            return this.f59340a;
        }

        @C12579k
        /* renamed from: b */
        public final C23470a mo68741b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "referenceId");
            return new C23470a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo68742d() {
            return this.f59340a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C23470a) && Intrinsics.areEqual((Object) this.f59340a, (Object) ((C23470a) obj).f59340a);
        }

        public int getActionId() {
            return this.f59341b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString(C26143a.f63928a, this.f59340a);
            return bundle;
        }

        public int hashCode() {
            return this.f59340a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f59340a;
            return "ActionBasketsListToNalCheckoutStep1Fragment(referenceId=" + str + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.d$b */
    public static final class C23471b {
        public /* synthetic */ C23471b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo68746a() {
            return new C19690a(R.id.action_baskets_list_to_basket_fragment);
        }

        @C12579k
        /* renamed from: b */
        public final C19693b0 mo68747b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "referenceId");
            return new C23470a(str);
        }

        public C23471b() {
        }
    }
}
