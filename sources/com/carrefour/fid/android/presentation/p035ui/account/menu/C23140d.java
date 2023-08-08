package com.carrefour.fid.android.presentation.p035ui.account.menu;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.lifecycle.C19502x0;
import com.carrefour.fid.android.shared.base.C28499q;
import dagger.hilt.android.flags.C10176a;
import dagger.hilt.android.internal.lifecycle.C10195a;
import dagger.hilt.android.internal.managers.C10229g;
import dagger.hilt.internal.C10276d;
import dagger.hilt.internal.C10280f;
import dagger.hilt.internal.C10284i;

/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.d */
public abstract class C23140d extends C28499q implements C10276d {

    /* renamed from: a */
    public ContextWrapper f58818a;

    /* renamed from: b */
    public boolean f58819b;

    /* renamed from: c */
    public volatile C10229g f58820c;

    /* renamed from: d */
    public final Object f58821d = new Object();

    /* renamed from: e */
    public boolean f58822e = false;

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f58819b) {
            return null;
        }
        initializeComponentContext();
        return this.f58818a;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f58818a == null) {
            this.f58818a = C10229g.m38469b(super.getContext(), this);
            this.f58819b = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f58822e) {
            this.f58822e = true;
            ((C23106b) generatedComponent()).mo33512E0((AccountMenuFragment) C10284i.m38510a(this));
        }
    }

    @C0346i
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(C10229g.m38470c(onGetLayoutInflater, this));
    }

    public final C10229g componentManager() {
        if (this.f58820c == null) {
            synchronized (this.f58821d) {
                if (this.f58820c == null) {
                    this.f58820c = createComponentManager();
                }
            }
        }
        return this.f58820c;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f58818a;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
