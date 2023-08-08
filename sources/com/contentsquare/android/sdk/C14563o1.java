package com.contentsquare.android.sdk;

import android.app.Application;
import android.content.Intent;
import com.contentsquare.android.internal.features.clientmode.p024ui.fab.FabService;
import com.contentsquare.android.internal.features.clientmode.p024ui.settings.SettingsActivity;
import com.contentsquare.android.internal.features.clientmode.p024ui.tutorial.ClientModeTutorialActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.o1 */
public final class C14563o1 {

    /* renamed from: g */
    public static final C14564a f36047g = new C14564a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C14453jf f36048a = new C14453jf("ClientModeNavigator");

    /* renamed from: b */
    public int f36049b = 2;

    /* renamed from: c */
    public final Application f36050c;

    /* renamed from: d */
    public final C14817w6 f36051d;

    /* renamed from: e */
    public final C14213b7 f36052e;

    /* renamed from: f */
    public final C14399h9 f36053f;

    /* renamed from: com.contentsquare.android.sdk.o1$a */
    public static final class C14564a {
        public C14564a() {
        }

        public /* synthetic */ C14564a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14563o1(Application application, C14817w6 w6Var, C14213b7 b7Var, C14399h9 h9Var) {
        Intrinsics.checkNotNullParameter(application, "applicationContext");
        Intrinsics.checkNotNullParameter(w6Var, "fabLayoutManager");
        Intrinsics.checkNotNullParameter(b7Var, "preferencesStore");
        Intrinsics.checkNotNullParameter(h9Var, "drawOverlaysChecker");
        this.f36050c = application;
        this.f36051d = w6Var;
        this.f36052e = b7Var;
        this.f36053f = h9Var;
    }

    /* renamed from: a */
    public final void mo36014a() {
        C14600oe b = C14600oe.m62881b(this.f36050c);
        Intrinsics.checkNotNullExpressionValue(b, "CsApplicationModule.getI…tance(applicationContext)");
        b.mo36120o().mo35296i();
        mo36025l();
        this.f36049b = 2;
    }

    /* renamed from: b */
    public final void mo36015b() {
        if (!this.f36052e.mo34676h(C14477k8.CLIENT_MODE_ACTIVATION_STATE, false)) {
            return;
        }
        if (this.f36052e.mo34676h(C14477k8.CLIENT_MODE_TUTORIAL, true)) {
            ClientModeTutorialActivity.m60704U0(this.f36050c);
        } else {
            mo36020g();
        }
    }

    /* renamed from: c */
    public final void mo36016c() {
        this.f36051d.mo36684C();
        this.f36049b = 2;
    }

    /* renamed from: d */
    public final void mo36017d() {
        this.f36051d.mo36689H();
    }

    /* renamed from: e */
    public final void mo36018e() {
        this.f36051d.mo36691J();
        this.f36049b = 1;
    }

    /* renamed from: f */
    public final void mo36019f() {
        if (this.f36049b == 2) {
            mo36015b();
        }
    }

    /* renamed from: g */
    public final boolean mo36020g() {
        if (this.f36053f.mo35501a(this.f36050c)) {
            this.f36048a.mo35679i("Client mode enabled", new Object[0]);
            C14600oe b = C14600oe.m62881b(this.f36050c);
            Intrinsics.checkNotNullExpressionValue(b, "CsApplicationModule.getI…tance(applicationContext)");
            b.mo36120o().mo35298k();
            mo36022i();
            this.f36049b = 1;
            return true;
        }
        this.f36048a.mo35676e("Cannot enable cs-in-app, permission not granted.");
        return false;
    }

    /* renamed from: h */
    public final void mo36021h() {
        if (this.f36049b == 1) {
            mo36020g();
        }
    }

    /* renamed from: i */
    public final void mo36022i() {
        this.f36050c.startService(new Intent(this.f36050c, FabService.class));
    }

    /* renamed from: j */
    public final void mo36023j() {
        SettingsActivity.m60696V0(this.f36050c);
    }

    /* renamed from: k */
    public final void mo36024k() {
        if (this.f36049b == 1) {
            mo36025l();
        }
    }

    /* renamed from: l */
    public final void mo36025l() {
        this.f36050c.stopService(new Intent(this.f36050c, FabService.class));
    }
}
