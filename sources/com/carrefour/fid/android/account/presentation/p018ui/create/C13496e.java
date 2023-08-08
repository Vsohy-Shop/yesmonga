package com.carrefour.fid.android.account.presentation.p018ui.create;

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

/* renamed from: com.carrefour.fid.android.account.presentation.ui.create.e */
public abstract class C13496e extends C28499q implements C10276d {

    /* renamed from: a */
    public ContextWrapper f32976a;

    /* renamed from: b */
    public boolean f32977b;

    /* renamed from: c */
    public volatile C10229g f32978c;

    /* renamed from: d */
    public final Object f32979d = new Object();

    /* renamed from: e */
    public boolean f32980e = false;

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f32977b) {
            return null;
        }
        initializeComponentContext();
        return this.f32976a;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f32976a == null) {
            this.f32976a = C10229g.m38469b(super.getContext(), this);
            this.f32977b = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f32980e) {
            this.f32980e = true;
            ((C13494c) generatedComponent()).mo32057q((CreateAccountFragment) C10284i.m38510a(this));
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
        if (this.f32978c == null) {
            synchronized (this.f32979d) {
                if (this.f32978c == null) {
                    this.f32978c = createComponentManager();
                }
            }
        }
        return this.f32978c;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f32976a;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
