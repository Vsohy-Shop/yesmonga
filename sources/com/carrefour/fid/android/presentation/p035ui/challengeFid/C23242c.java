package com.carrefour.fid.android.presentation.p035ui.challengeFid;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.lifecycle.C19502x0;
import com.carrefour.fid.android.shared.base.C28489j;
import dagger.hilt.android.flags.C10176a;
import dagger.hilt.android.internal.lifecycle.C10195a;
import dagger.hilt.android.internal.managers.C10229g;
import dagger.hilt.internal.C10276d;
import dagger.hilt.internal.C10280f;
import dagger.hilt.internal.C10284i;

/* renamed from: com.carrefour.fid.android.presentation.ui.challengeFid.c */
public abstract class C23242c extends C28489j implements C10276d {

    /* renamed from: c */
    public ContextWrapper f58950c;

    /* renamed from: d */
    public boolean f58951d;

    /* renamed from: e */
    public volatile C10229g f58952e;

    /* renamed from: f */
    public final Object f58953f = new Object();

    /* renamed from: g */
    public boolean f58954g = false;

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f58951d) {
            return null;
        }
        initializeComponentContext();
        return this.f58950c;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f58950c == null) {
            this.f58950c = C10229g.m38469b(super.getContext(), this);
            this.f58951d = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f58954g) {
            this.f58954g = true;
            ((C23241b) generatedComponent()).mo33760w1((ChallengeFidDialogFragment) C10284i.m38510a(this));
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
        if (this.f58952e == null) {
            synchronized (this.f58953f) {
                if (this.f58952e == null) {
                    this.f58952e = createComponentManager();
                }
            }
        }
        return this.f58952e;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f58950c;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
