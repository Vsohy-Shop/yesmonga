package com.carrefour.fid.android.categories.presentation.p067ui.department;

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

/* renamed from: com.carrefour.fid.android.categories.presentation.ui.department.o */
public abstract class C39796o extends C28499q implements C10276d {

    /* renamed from: a */
    public ContextWrapper f101535a;

    /* renamed from: b */
    public boolean f101536b;

    /* renamed from: c */
    public volatile C10229g f101537c;

    /* renamed from: d */
    public final Object f101538d = new Object();

    /* renamed from: e */
    public boolean f101539e = false;

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f101536b) {
            return null;
        }
        initializeComponentContext();
        return this.f101535a;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f101535a == null) {
            this.f101535a = C10229g.m38469b(super.getContext(), this);
            this.f101536b = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f101539e) {
            this.f101539e = true;
            ((C39789h) generatedComponent()).mo33747u0((DepartmentFragment) C10284i.m38510a(this));
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
        if (this.f101537c == null) {
            synchronized (this.f101538d) {
                if (this.f101537c == null) {
                    this.f101537c = createComponentManager();
                }
            }
        }
        return this.f101537c;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f101535a;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
