package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13792d;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.CheckoutProgressStep;
import com.carrefour.fid.android.shared.constant.C28526d;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.i */
public final class C26016i {

    /* renamed from: b */
    public static final int f63607b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f63608a;

    @Inject
    public C26016i(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f63608a = aVar;
    }

    /* renamed from: a */
    public final void mo75513a(float f) {
        this.f63608a.mo32711n(new C13812g(FirebaseEventKey.CHECKOUT_PROGRESS, "payer-en-ligne", "checkout", new C13792d(CheckoutProgressStep.FIFTH, (String) null, f, 2, (DefaultConstructorMarker) null)));
    }

    /* renamed from: b */
    public final void mo75514b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "basketType");
        C13783a.m58667i(this.f63608a, "checkout", "payer-en-ligne", C10975r0.m41401k(C11078d1.m42659a("panier_type", str)), false, false, false, 56, (Object) null);
    }

    /* renamed from: c */
    public final void mo75515c() {
        C13783a.m58668o(this.f63608a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a("screen_name", "payer-en-ligne"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, "validation-paiement")), false, 2, (Object) null);
    }
}
