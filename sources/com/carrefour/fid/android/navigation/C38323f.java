package com.carrefour.fid.android.navigation;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.activity.contextaware.C0233c;
import androidx.lifecycle.C19502x0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.app.p021ui.BaseActivity;
import dagger.hilt.android.internal.lifecycle.C10195a;
import dagger.hilt.android.internal.managers.C10216a;
import dagger.hilt.internal.C10276d;
import dagger.hilt.internal.C10284i;
import kotlin.jvm.functions.C11300l;

/* renamed from: com.carrefour.fid.android.navigation.f */
public abstract class C38323f<VB extends C20752b> extends BaseActivity<VB> implements C10276d {

    /* renamed from: c1 */
    public volatile C10216a f97070c1;

    /* renamed from: d1 */
    public final Object f97071d1 = new Object();

    /* renamed from: e1 */
    public boolean f97072e1 = false;

    /* renamed from: com.carrefour.fid.android.navigation.f$a */
    public class C38324a implements C0233c {
        public C38324a() {
        }

        /* renamed from: a */
        public void mo823a(Context context) {
            C38323f.this.mo121182c1();
        }
    }

    public C38323f(C11300l<? super LayoutInflater, ? extends VB> lVar) {
        super(lVar);
        mo121179Z0();
    }

    /* renamed from: Z0 */
    public final void mo121179Z0() {
        mo739s(new C38324a());
    }

    /* renamed from: a1 */
    public final C10216a componentManager() {
        if (this.f97070c1 == null) {
            synchronized (this.f97071d1) {
                if (this.f97070c1 == null) {
                    this.f97070c1 = mo121181b1();
                }
            }
        }
        return this.f97070c1;
    }

    /* renamed from: b1 */
    public C10216a mo121181b1() {
        return new C10216a(this);
    }

    /* renamed from: c1 */
    public void mo121182c1() {
        if (!this.f97072e1) {
            this.f97072e1 = true;
            ((C38320c) generatedComponent()).mo33414b((BottomNavActivity) C10284i.m38510a(this));
        }
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38419a(this, super.getDefaultViewModelProviderFactory());
    }
}
