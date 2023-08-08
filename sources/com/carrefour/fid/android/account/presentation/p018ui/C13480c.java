package com.carrefour.fid.android.account.presentation.p018ui;

import android.content.Context;
import androidx.activity.contextaware.C0233c;
import androidx.appcompat.app.C0475e;
import androidx.lifecycle.C19502x0;
import dagger.hilt.android.internal.lifecycle.C10195a;
import dagger.hilt.android.internal.managers.C10216a;
import dagger.hilt.internal.C10276d;
import dagger.hilt.internal.C10284i;

/* renamed from: com.carrefour.fid.android.account.presentation.ui.c */
public abstract class C13480c extends C0475e implements C10276d {

    /* renamed from: U0 */
    public volatile C10216a f32951U0;

    /* renamed from: V0 */
    public final Object f32952V0 = new Object();

    /* renamed from: W0 */
    public boolean f32953W0 = false;

    /* renamed from: com.carrefour.fid.android.account.presentation.ui.c$a */
    public class C13481a implements C0233c {
        public C13481a() {
        }

        /* renamed from: a */
        public void mo823a(Context context) {
            C13480c.this.mo32026W0();
        }
    }

    public C13480c() {
        mo32023T0();
    }

    /* renamed from: T0 */
    public final void mo32023T0() {
        mo739s(new C13481a());
    }

    /* renamed from: U0 */
    public final C10216a componentManager() {
        if (this.f32951U0 == null) {
            synchronized (this.f32952V0) {
                if (this.f32951U0 == null) {
                    this.f32951U0 = mo32025V0();
                }
            }
        }
        return this.f32951U0;
    }

    /* renamed from: V0 */
    public C10216a mo32025V0() {
        return new C10216a(this);
    }

    /* renamed from: W0 */
    public void mo32026W0() {
        if (!this.f32953W0) {
            this.f32953W0 = true;
            ((C13479b) generatedComponent()).mo32022h((AccountActivity) C10284i.m38510a(this));
        }
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38419a(this, super.getDefaultViewModelProviderFactory());
    }

    public C13480c(int i) {
        super(i);
        mo32023T0();
    }
}
