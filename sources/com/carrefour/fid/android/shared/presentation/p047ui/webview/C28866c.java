package com.carrefour.fid.android.shared.presentation.p047ui.webview;

import android.content.Context;
import androidx.activity.contextaware.C0233c;
import androidx.appcompat.app.C0475e;
import androidx.lifecycle.C19502x0;
import dagger.hilt.android.internal.lifecycle.C10195a;
import dagger.hilt.android.internal.managers.C10216a;
import dagger.hilt.internal.C10276d;
import dagger.hilt.internal.C10284i;

/* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.c */
public abstract class C28866c extends C0475e implements C10276d {

    /* renamed from: U0 */
    public volatile C10216a f70731U0;

    /* renamed from: V0 */
    public final Object f70732V0 = new Object();

    /* renamed from: W0 */
    public boolean f70733W0 = false;

    /* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.c$a */
    public class C28867a implements C0233c {
        public C28867a() {
        }

        /* renamed from: a */
        public void mo823a(Context context) {
            C28866c.this.mo84026W0();
        }
    }

    public C28866c() {
        mo84023T0();
    }

    /* renamed from: T0 */
    public final void mo84023T0() {
        mo739s(new C28867a());
    }

    /* renamed from: U0 */
    public final C10216a componentManager() {
        if (this.f70731U0 == null) {
            synchronized (this.f70732V0) {
                if (this.f70731U0 == null) {
                    this.f70731U0 = mo84025V0();
                }
            }
        }
        return this.f70731U0;
    }

    /* renamed from: V0 */
    public C10216a mo84025V0() {
        return new C10216a(this);
    }

    /* renamed from: W0 */
    public void mo84026W0() {
        if (!this.f70733W0) {
            this.f70733W0 = true;
            ((C28865b) generatedComponent()).mo33417g((CatalogWebViewActivity) C10284i.m38510a(this));
        }
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38419a(this, super.getDefaultViewModelProviderFactory());
    }

    public C28866c(int i) {
        super(i);
        mo84023T0();
    }
}
