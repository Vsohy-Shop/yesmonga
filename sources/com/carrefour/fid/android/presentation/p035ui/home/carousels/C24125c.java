package com.carrefour.fid.android.presentation.p035ui.home.carousels;

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

/* renamed from: com.carrefour.fid.android.presentation.ui.home.carousels.c */
public abstract class C24125c extends Fragment implements C10276d {

    /* renamed from: a */
    public ContextWrapper f60353a;

    /* renamed from: b */
    public boolean f60354b;

    /* renamed from: c */
    public volatile C10229g f60355c;

    /* renamed from: d */
    public final Object f60356d = new Object();

    /* renamed from: e */
    public boolean f60357e = false;

    public C24125c() {
    }

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f60354b) {
            return null;
        }
        initializeComponentContext();
        return this.f60353a;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f60353a == null) {
            this.f60353a = C10229g.m38469b(super.getContext(), this);
            this.f60354b = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f60357e) {
            this.f60357e = true;
            ((C24129f) generatedComponent()).mo33741t((C24127e) C10284i.m38510a(this));
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
        if (this.f60355c == null) {
            synchronized (this.f60356d) {
                if (this.f60355c == null) {
                    this.f60355c = createComponentManager();
                }
            }
        }
        return this.f60355c;
    }

    public C24125c(int i) {
        super(i);
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f60353a;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
