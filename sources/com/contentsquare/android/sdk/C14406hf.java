package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14466k4;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.contentsquare.android.sdk.hf */
public final class C14406hf {

    @C11076d0(mo22514bv = {}, mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/la;", "a", "()Lcom/contentsquare/android/sdk/la;"}, mo22517k = 3, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.sdk.hf$a */
    public static final class C14407a extends Lambda implements C11289a<C14500la> {

        /* renamed from: a */
        public final /* synthetic */ C14771u6 f35611a;

        /* renamed from: b */
        public final /* synthetic */ C14213b7 f35612b;

        /* renamed from: c */
        public final /* synthetic */ C14922z7 f35613c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14407a(C14771u6 u6Var, C14213b7 b7Var, C14922z7 z7Var) {
            super(0);
            this.f35611a = u6Var;
            this.f35612b = b7Var;
            this.f35613c = z7Var;
        }

        /* renamed from: a */
        public final C14500la invoke() {
            C14466k4 c = this.f35611a.mo36561c();
            return (!C14406hf.m62064e(c) || !C14406hf.m62063d(c != null ? this.f35613c.mo36945a(c, this.f35612b.mo34676h(C14477k8.CLIENT_MODE_GOD_MODE, false)) : null)) ? C14500la.BREAK : C14500la.EVALUATE;
        }
    }

    /* renamed from: a */
    public static final C14500la m62060a(C14500la laVar, C14771u6 u6Var, C14213b7 b7Var, C14922z7 z7Var) {
        Intrinsics.checkNotNullParameter(laVar, "$this$waitingForConfigurationRule");
        Intrinsics.checkNotNullParameter(u6Var, BannerConfigurableFragment.f27258E0);
        Intrinsics.checkNotNullParameter(b7Var, "preferenceStore");
        Intrinsics.checkNotNullParameter(z7Var, "configurationProjectChooser");
        return C14542n4.m62678a(laVar, "WaitingForConfigurationRule", new C14407a(u6Var, b7Var, z7Var));
    }

    /* renamed from: d */
    public static final boolean m62063d(C14466k4.C14471e eVar) {
        if (eVar != null) {
            C14466k4.C14472f h = eVar.mo35730h();
            Intrinsics.checkNotNullExpressionValue(h, "projectConfiguration.sessionReplay");
            if (!Intrinsics.areEqual((Object) h.mo35738c(), (Object) "")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m62064e(C14466k4 k4Var) {
        return (k4Var == null || k4Var.mo35709a() == 0) ? false : true;
    }
}
