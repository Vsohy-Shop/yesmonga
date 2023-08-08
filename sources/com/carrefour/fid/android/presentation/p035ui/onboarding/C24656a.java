package com.carrefour.fid.android.presentation.p035ui.onboarding;

import android.content.Context;
import androidx.activity.contextaware.C0233c;
import androidx.appcompat.app.C0475e;
import androidx.lifecycle.C19502x0;
import dagger.hilt.android.internal.lifecycle.C10195a;
import dagger.hilt.android.internal.managers.C10216a;
import dagger.hilt.internal.C10276d;
import dagger.hilt.internal.C10284i;

/* renamed from: com.carrefour.fid.android.presentation.ui.onboarding.a */
public abstract class C24656a extends C0475e implements C10276d {

    /* renamed from: U0 */
    public volatile C10216a f61241U0;

    /* renamed from: V0 */
    public final Object f61242V0 = new Object();

    /* renamed from: W0 */
    public boolean f61243W0 = false;

    /* renamed from: com.carrefour.fid.android.presentation.ui.onboarding.a$a */
    public class C24657a implements C0233c {
        public C24657a() {
        }

        /* renamed from: a */
        public void mo823a(Context context) {
            C24656a.this.mo72053W0();
        }
    }

    public C24656a() {
        mo72050T0();
    }

    /* renamed from: T0 */
    public final void mo72050T0() {
        mo739s(new C24657a());
    }

    /* renamed from: U0 */
    public final C10216a componentManager() {
        if (this.f61241U0 == null) {
            synchronized (this.f61242V0) {
                if (this.f61241U0 == null) {
                    this.f61241U0 = mo72052V0();
                }
            }
        }
        return this.f61241U0;
    }

    /* renamed from: V0 */
    public C10216a mo72052V0() {
        return new C10216a(this);
    }

    /* renamed from: W0 */
    public void mo72053W0() {
        if (!this.f61243W0) {
            this.f61243W0 = true;
            ((C24658b) generatedComponent()).mo33416e((SplashOnBoardingActivity) C10284i.m38510a(this));
        }
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38419a(this, super.getDefaultViewModelProviderFactory());
    }

    public C24656a(int i) {
        super(i);
        mo72050T0();
    }
}
