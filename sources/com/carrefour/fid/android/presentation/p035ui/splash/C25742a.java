package com.carrefour.fid.android.presentation.p035ui.splash;

import android.content.Context;
import androidx.activity.contextaware.C0233c;
import androidx.appcompat.app.C0475e;
import androidx.lifecycle.C19502x0;
import dagger.hilt.android.internal.lifecycle.C10195a;
import dagger.hilt.android.internal.managers.C10216a;
import dagger.hilt.internal.C10276d;
import dagger.hilt.internal.C10284i;

/* renamed from: com.carrefour.fid.android.presentation.ui.splash.a */
public abstract class C25742a extends C0475e implements C10276d {

    /* renamed from: U0 */
    public volatile C10216a f63069U0;

    /* renamed from: V0 */
    public final Object f63070V0 = new Object();

    /* renamed from: W0 */
    public boolean f63071W0 = false;

    /* renamed from: com.carrefour.fid.android.presentation.ui.splash.a$a */
    public class C25743a implements C0233c {
        public C25743a() {
        }

        /* renamed from: a */
        public void mo823a(Context context) {
            C25742a.this.mo74761W0();
        }
    }

    public C25742a() {
        mo74758T0();
    }

    /* renamed from: T0 */
    public final void mo74758T0() {
        mo739s(new C25743a());
    }

    /* renamed from: U0 */
    public final C10216a componentManager() {
        if (this.f63069U0 == null) {
            synchronized (this.f63070V0) {
                if (this.f63069U0 == null) {
                    this.f63069U0 = mo74760V0();
                }
            }
        }
        return this.f63069U0;
    }

    /* renamed from: V0 */
    public C10216a mo74760V0() {
        return new C10216a(this);
    }

    /* renamed from: W0 */
    public void mo74761W0() {
        if (!this.f63071W0) {
            this.f63071W0 = true;
            ((C25745c) generatedComponent()).mo33418i((SplashActivity) C10284i.m38510a(this));
        }
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38419a(this, super.getDefaultViewModelProviderFactory());
    }

    public C25742a(int i) {
        super(i);
        mo74758T0();
    }
}
