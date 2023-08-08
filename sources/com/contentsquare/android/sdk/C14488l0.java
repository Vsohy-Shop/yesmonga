package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14466k4;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.contentsquare.android.sdk.l0 */
public final class C14488l0 {

    @C11076d0(mo22514bv = {}, mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/la;", "a", "()Lcom/contentsquare/android/sdk/la;"}, mo22517k = 3, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.sdk.l0$a */
    public static final class C14489a extends Lambda implements C11289a<C14500la> {

        /* renamed from: a */
        public final /* synthetic */ C14771u6 f35837a;

        /* renamed from: b */
        public final /* synthetic */ C14213b7 f35838b;

        /* renamed from: c */
        public final /* synthetic */ C14922z7 f35839c;

        /* renamed from: d */
        public final /* synthetic */ C14527ma f35840d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14489a(C14771u6 u6Var, C14213b7 b7Var, C14922z7 z7Var, C14527ma maVar) {
            super(0);
            this.f35837a = u6Var;
            this.f35838b = b7Var;
            this.f35839c = z7Var;
            this.f35840d = maVar;
        }

        /* renamed from: a */
        public final C14500la invoke() {
            C14466k4.C14472f a = C14488l0.m62454d(this.f35837a, this.f35838b, this.f35839c);
            return a == null || C14488l0.m62455e(a, this.f35840d) ? C14500la.PROPAGATE_STOP : C14500la.EVALUATE;
        }
    }

    /* renamed from: b */
    public static final C14500la m62452b(C14500la laVar, C14771u6 u6Var, C14213b7 b7Var, C14922z7 z7Var, C14527ma maVar) {
        Intrinsics.checkNotNullParameter(laVar, "$this$blockedAppRule");
        Intrinsics.checkNotNullParameter(u6Var, BannerConfigurableFragment.f27258E0);
        Intrinsics.checkNotNullParameter(b7Var, "preferenceStore");
        Intrinsics.checkNotNullParameter(z7Var, "configurationChooser");
        Intrinsics.checkNotNullParameter(maVar, "buildInformation");
        return C14542n4.m62678a(laVar, "BlockedAppRule", new C14489a(u6Var, b7Var, z7Var, maVar));
    }

    /* renamed from: d */
    public static final C14466k4.C14472f m62454d(C14771u6 u6Var, C14213b7 b7Var, C14922z7 z7Var) {
        C14466k4 c = u6Var.mo36561c();
        if (c == null) {
            return null;
        }
        C14466k4.C14471e a = z7Var.mo36945a(c, b7Var.mo34676h(C14477k8.CLIENT_MODE_GOD_MODE, false));
        Intrinsics.checkNotNullExpressionValue(a, "configurationChooser\n   …guration, godModeEnabled)");
        return a.mo35730h();
    }

    /* renamed from: e */
    public static final boolean m62455e(C14466k4.C14472f fVar, C14527ma maVar) {
        ArrayList<String> b = fVar.mo35737b();
        Intrinsics.checkNotNullExpressionValue(b, "sessionReplayConfig.blockedAppVersions");
        Iterator<String> it = b.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual((Object) it.next(), (Object) maVar.mo35914e())) {
                return true;
            }
        }
        return false;
    }
}
