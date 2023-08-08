package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14466k4;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.contentsquare.android.sdk.p3 */
public final class C14606p3 {

    @C11076d0(mo22514bv = {}, mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/la;", "a", "()Lcom/contentsquare/android/sdk/la;"}, mo22517k = 3, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.sdk.p3$a */
    public static final class C14607a extends Lambda implements C11289a<C14500la> {

        /* renamed from: a */
        public final /* synthetic */ C14771u6 f36161a;

        /* renamed from: b */
        public final /* synthetic */ C14213b7 f36162b;

        /* renamed from: c */
        public final /* synthetic */ C14922z7 f36163c;

        /* renamed from: d */
        public final /* synthetic */ C14890y9 f36164d;

        /* renamed from: e */
        public final /* synthetic */ C14527ma f36165e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14607a(C14771u6 u6Var, C14213b7 b7Var, C14922z7 z7Var, C14890y9 y9Var, C14527ma maVar) {
            super(0);
            this.f36161a = u6Var;
            this.f36162b = b7Var;
            this.f36163c = z7Var;
            this.f36164d = y9Var;
            this.f36165e = maVar;
        }

        /* renamed from: a */
        public final C14500la invoke() {
            C14466k4 c = this.f36161a.mo36561c();
            boolean z = false;
            if (c != null) {
                C14466k4.C14471e a = this.f36163c.mo36945a(c, this.f36162b.mo34676h(C14477k8.CLIENT_MODE_GOD_MODE, false));
                Intrinsics.checkNotNullExpressionValue(a, "configurationProjectChoo…guration, godModeEnabled)");
                C14466k4.C14468b a2 = C14606p3.m62917c(a);
                if (a2 != null && a2.mo35718d()) {
                    C14890y9 y9Var = this.f36164d;
                    Intrinsics.checkNotNull(a2);
                    if (y9Var.mo36932a(a2, this.f36165e)) {
                        z = true;
                    }
                }
            }
            return z ? C14500la.EVALUATE : C14500la.PROPAGATE_STOP;
        }
    }

    /* renamed from: b */
    public static final C14500la m62916b(C14500la laVar, C14213b7 b7Var, C14771u6 u6Var, C14922z7 z7Var, C14527ma maVar, C14890y9 y9Var) {
        Intrinsics.checkNotNullParameter(laVar, "$this$featureFlagRule");
        Intrinsics.checkNotNullParameter(b7Var, "preferenceStore");
        Intrinsics.checkNotNullParameter(u6Var, BannerConfigurableFragment.f27258E0);
        Intrinsics.checkNotNullParameter(z7Var, "configurationProjectChooser");
        Intrinsics.checkNotNullParameter(maVar, "buildInformation");
        Intrinsics.checkNotNullParameter(y9Var, "featureFlagUtil");
        return C14542n4.m62678a(laVar, "FeatureFlagRule", new C14607a(u6Var, b7Var, z7Var, y9Var, maVar));
    }

    /* renamed from: c */
    public static final C14466k4.C14468b m62917c(C14466k4.C14471e eVar) {
        for (C14466k4.C14468b next : eVar.mo35727e()) {
            Intrinsics.checkNotNullExpressionValue(next, "featureFlag");
            if (Intrinsics.areEqual((Object) "session_recording", (Object) next.mo35717c())) {
                return next;
            }
        }
        return null;
    }
}
