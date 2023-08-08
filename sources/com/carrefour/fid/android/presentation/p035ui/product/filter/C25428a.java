package com.carrefour.fid.android.presentation.p035ui.product.filter;

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

/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.a */
public abstract class C25428a extends C28489j implements C10276d {

    /* renamed from: c */
    public ContextWrapper f62566c;

    /* renamed from: d */
    public boolean f62567d;

    /* renamed from: e */
    public volatile C10229g f62568e;

    /* renamed from: f */
    public final Object f62569f = new Object();

    /* renamed from: g */
    public boolean f62570g = false;

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f62567d) {
            return null;
        }
        initializeComponentContext();
        return this.f62566c;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f62566c == null) {
            this.f62566c = C10229g.m38469b(super.getContext(), this);
            this.f62567d = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f62570g) {
            this.f62570g = true;
            ((C25443f) generatedComponent()).mo33579Q1((ProductListFiltersDialogFragment) C10284i.m38510a(this));
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
        if (this.f62568e == null) {
            synchronized (this.f62569f) {
                if (this.f62568e == null) {
                    this.f62568e = createComponentManager();
                }
            }
        }
        return this.f62568e;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f62566c;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
