package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C19502x0;
import dagger.hilt.android.flags.C10176a;
import dagger.hilt.android.internal.lifecycle.C10195a;
import dagger.hilt.android.internal.managers.C10229g;
import dagger.hilt.internal.C10276d;
import dagger.hilt.internal.C10280f;
import dagger.hilt.internal.C10284i;

/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.a */
public abstract class C25330a extends Fragment implements C10276d {

    /* renamed from: a */
    public ContextWrapper f62384a;

    /* renamed from: b */
    public boolean f62385b;

    /* renamed from: c */
    public volatile C10229g f62386c;

    /* renamed from: d */
    public final Object f62387d = new Object();

    /* renamed from: e */
    public boolean f62388e = false;

    public C25330a() {
    }

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f62385b) {
            return null;
        }
        initializeComponentContext();
        return this.f62384a;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f62384a == null) {
            this.f62384a = C10229g.m38469b(super.getContext(), this);
            this.f62385b = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f62388e) {
            this.f62388e = true;
            ((C25340c) generatedComponent()).mo33584R1((PhysicalStoreFragment) C10284i.m38510a(this));
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
        if (this.f62386c == null) {
            synchronized (this.f62387d) {
                if (this.f62386c == null) {
                    this.f62386c = createComponentManager();
                }
            }
        }
        return this.f62386c;
    }

    public C25330a(int i) {
        super(i);
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f62384a;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
