package com.contentsquare.android.sdk;

import android.app.Application;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.f3 */
public final class C14320f3 {

    /* renamed from: a */
    public final C14453jf f35352a;

    /* renamed from: b */
    public final Application f35353b;

    /* renamed from: c */
    public final C14321a f35354c;

    /* renamed from: d */
    public final C14213b7 f35355d;

    /* renamed from: e */
    public final C14771u6 f35356e;

    /* renamed from: f */
    public final C14695s3 f35357f;

    /* renamed from: g */
    public final C14527ma f35358g;

    /* renamed from: h */
    public final C14922z7 f35359h;

    /* renamed from: i */
    public final C14890y9 f35360i;

    /* renamed from: com.contentsquare.android.sdk.f3$a */
    public static final class C14321a {
        /* renamed from: a */
        public final void mo35113a() {
            C14731t1.m63480i();
        }

        /* renamed from: b */
        public final void mo35114b(Application application, boolean z) {
            Intrinsics.checkNotNullParameter(application, "application");
            C14731t1.m63477b(application, z);
        }
    }

    public C14320f3(Application application, C14321a aVar, C14213b7 b7Var, C14771u6 u6Var, C14695s3 s3Var, C14527ma maVar, C14922z7 z7Var, C14890y9 y9Var) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(aVar, "sessionReplayNonStatic");
        Intrinsics.checkNotNullParameter(b7Var, "preferencesStore");
        Intrinsics.checkNotNullParameter(u6Var, BannerConfigurableFragment.f27258E0);
        Intrinsics.checkNotNullParameter(s3Var, "randomGenerator");
        Intrinsics.checkNotNullParameter(maVar, "buildInformation");
        Intrinsics.checkNotNullParameter(z7Var, "configurationChooser");
        Intrinsics.checkNotNullParameter(y9Var, "featureFlagUtil");
        this.f35353b = application;
        this.f35354c = aVar;
        this.f35355d = b7Var;
        this.f35356e = u6Var;
        this.f35357f = s3Var;
        this.f35358g = maVar;
        this.f35359h = z7Var;
        this.f35360i = y9Var;
        this.f35352a = new C14453jf("SessionReplayRulesCoordinator");
    }

    /* renamed from: a */
    public final void mo35112a(boolean z, boolean z2) {
        C14453jf jfVar = this.f35352a;
        jfVar.mo35676e("Starting evaluate with canRestartSessionReplay = " + z + " and newSession = " + z2);
        C14354g1 g = C14525m9.m62612b(C14576o4.m62819c(C14606p3.m62916b(C14488l0.m62452b(C14576o4.m62820d(C14576o4.m62822f(C14576o4.m62823g(C14406hf.m62060a(C14576o4.m62821e(C14576o4.m62818b(C14500la.EVALUATE, this.f35355d), this.f35355d), this.f35356e, this.f35355d, this.f35359h), this.f35355d), this.f35355d), this.f35355d), this.f35356e, this.f35355d, this.f35359h, this.f35358g), this.f35355d, this.f35356e, this.f35359h, this.f35358g, this.f35360i), z), this.f35356e, this.f35355d, this.f35359h, this.f35357f, z2).mo35826g();
        C14453jf jfVar2 = this.f35352a;
        String g2 = g.mo35306g();
        jfVar2.mo35676e("Evaluation done, will " + g2);
        if (g == C14354g1.START) {
            this.f35354c.mo35114b(this.f35353b, z2);
        } else if (g == C14354g1.STOP) {
            this.f35354c.mo35113a();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14320f3(Application application, C14213b7 b7Var, C14771u6 u6Var) {
        this(application, new C14321a(), b7Var, u6Var, new C14695s3(), new C14527ma(application), new C14922z7(), new C14890y9());
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(b7Var, "preferencesStore");
        Intrinsics.checkNotNullParameter(u6Var, BannerConfigurableFragment.f27258E0);
    }
}
