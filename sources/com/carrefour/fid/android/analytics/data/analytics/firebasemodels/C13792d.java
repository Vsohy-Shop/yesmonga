package com.carrefour.fid.android.analytics.data.analytics.firebasemodels;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.analytics.data.analytics.firebasemodels.d */
public final class C13792d implements C13794f {
    @C12579k

    /* renamed from: a */
    public final CheckoutProgressStep f33589a;
    @C12579k

    /* renamed from: b */
    public final String f33590b;

    /* renamed from: c */
    public final float f33591c;

    public C13792d(@C12579k CheckoutProgressStep checkoutProgressStep, @C12579k String str, float f) {
        Intrinsics.checkNotNullParameter(checkoutProgressStep, "checkoutStep");
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.C32532b.f78955i);
        this.f33589a = checkoutProgressStep;
        this.f33590b = str;
        this.f33591c = f;
    }

    @C12579k
    /* renamed from: a */
    public Map<String, Object> mo32723a() {
        return FirebaseModelKt.m58700b(C10977s0.m41456W(C11078d1.m42659a("checkout_step", Integer.valueOf(this.f33589a.mo32721q())), C11078d1.m42659a(FirebaseAnalytics.C32532b.f78955i, this.f33590b), C11078d1.m42659a("value", Float.valueOf(this.f33591c))));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13792d(CheckoutProgressStep checkoutProgressStep, String str, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(checkoutProgressStep, (i & 2) != 0 ? "EUR" : str, f);
    }
}
