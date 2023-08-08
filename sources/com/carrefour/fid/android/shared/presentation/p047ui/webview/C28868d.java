package com.carrefour.fid.android.shared.presentation.p047ui.webview;

import android.content.Context;
import androidx.activity.contextaware.C0233c;
import androidx.appcompat.app.C0475e;
import androidx.lifecycle.C19502x0;
import dagger.hilt.android.internal.lifecycle.C10195a;
import dagger.hilt.android.internal.managers.C10216a;
import dagger.hilt.internal.C10276d;
import dagger.hilt.internal.C10284i;

/* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.d */
public abstract class C28868d extends C0475e implements C10276d {

    /* renamed from: U0 */
    public volatile C10216a f70735U0;

    /* renamed from: V0 */
    public final Object f70736V0 = new Object();

    /* renamed from: W0 */
    public boolean f70737W0 = false;

    /* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.d$a */
    public class C28869a implements C0233c {
        public C28869a() {
        }

        /* renamed from: a */
        public void mo823a(Context context) {
            C28868d.this.mo84030W0();
        }
    }

    public C28868d() {
        mo84027T0();
    }

    /* renamed from: T0 */
    public final void mo84027T0() {
        mo739s(new C28869a());
    }

    /* renamed from: U0 */
    public final C10216a componentManager() {
        if (this.f70735U0 == null) {
            synchronized (this.f70736V0) {
                if (this.f70735U0 == null) {
                    this.f70735U0 = mo84029V0();
                }
            }
        }
        return this.f70735U0;
    }

    /* renamed from: V0 */
    public C10216a mo84029V0() {
        return new C10216a(this);
    }

    /* renamed from: W0 */
    public void mo84030W0() {
        if (!this.f70737W0) {
            this.f70737W0 = true;
            ((C28872f) generatedComponent()).mo33415c((WebViewActivity) C10284i.m38510a(this));
        }
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38419a(this, super.getDefaultViewModelProviderFactory());
    }

    public C28868d(int i) {
        super(i);
        mo84027T0();
    }
}
