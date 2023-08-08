package com.carrefour.fid.android.presentation.p035ui.coupons.list;

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

/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.j */
public abstract class C23893j extends C28499q implements C10276d {

    /* renamed from: a */
    public ContextWrapper f60072a;

    /* renamed from: b */
    public boolean f60073b;

    /* renamed from: c */
    public volatile C10229g f60074c;

    /* renamed from: d */
    public final Object f60075d = new Object();

    /* renamed from: e */
    public boolean f60076e = false;

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f60073b) {
            return null;
        }
        initializeComponentContext();
        return this.f60072a;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f60072a == null) {
            this.f60072a = C10229g.m38469b(super.getContext(), this);
            this.f60073b = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f60076e) {
            this.f60076e = true;
            ((C23884g) generatedComponent()).mo33691k0((CouponsListFragment) C10284i.m38510a(this));
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
        if (this.f60074c == null) {
            synchronized (this.f60075d) {
                if (this.f60074c == null) {
                    this.f60074c = createComponentManager();
                }
            }
        }
        return this.f60074c;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f60072a;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
