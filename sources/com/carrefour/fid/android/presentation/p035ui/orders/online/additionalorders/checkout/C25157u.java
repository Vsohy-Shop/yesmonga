package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.navigation.C19693b0;
import com.carrefour.fid.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.u */
public final class C25157u {
    @C12579k

    /* renamed from: a */
    public static final C25159b f61993a = new C25159b((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f61994b = 0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.u$a */
    public static final class C25158a implements C19693b0 {
        @C12580l

        /* renamed from: a */
        public final String f61995a;

        /* renamed from: b */
        public final int f61996b = R.id.action_checkoutStepOneAdditionalOrderFragment_to_checkoutStepTwoAdditionalOderFragment;

        public C25158a(@C12580l String str) {
            this.f61995a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C25158a m108791c(C25158a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f61995a;
            }
            return aVar.mo73109b(str);
        }

        @C12580l
        /* renamed from: a */
        public final String mo73108a() {
            return this.f61995a;
        }

        @C12579k
        /* renamed from: b */
        public final C25158a mo73109b(@C12580l String str) {
            return new C25158a(str);
        }

        @C12580l
        /* renamed from: d */
        public final String mo73110d() {
            return this.f61995a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25158a) && Intrinsics.areEqual((Object) this.f61995a, (Object) ((C25158a) obj).f61995a);
        }

        public int getActionId() {
            return this.f61996b;
        }

        @C12579k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("orderId", this.f61995a);
            return bundle;
        }

        public int hashCode() {
            String str = this.f61995a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f61995a;
            return "ActionCheckoutStepOneAdditionalOrderFragmentToCheckoutStepTwoAdditionalOderFragment(orderId=" + str + ")";
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.u$b */
    public static final class C25159b {
        public /* synthetic */ C25159b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final C19693b0 mo73114a(@C12580l String str) {
            return new C25158a(str);
        }

        public C25159b() {
        }
    }
}
