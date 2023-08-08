package com.carrefour.fid.android.presentation.p035ui.account.list;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.lifecycle.C19502x0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.shared.base.C28494o;
import dagger.hilt.android.flags.C10176a;
import dagger.hilt.android.internal.lifecycle.C10195a;
import dagger.hilt.android.internal.managers.C10229g;
import dagger.hilt.internal.C10276d;
import dagger.hilt.internal.C10280f;
import dagger.hilt.internal.C10284i;
import kotlin.jvm.functions.C11305q;

/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.d */
public abstract class C22951d<VB extends C20752b> extends C28494o<VB> implements C10276d {

    /* renamed from: a */
    public ContextWrapper f58570a;

    /* renamed from: b */
    public boolean f58571b;

    /* renamed from: c */
    public volatile C10229g f58572c;

    /* renamed from: d */
    public final Object f58573d = new Object();

    /* renamed from: e */
    public boolean f58574e = false;

    public C22951d(C11305q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> qVar) {
        super(qVar);
    }

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f58571b) {
            return null;
        }
        initializeComponentContext();
        return this.f58570a;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f58570a == null) {
            this.f58570a = C10229g.m38469b(super.getContext(), this);
            this.f58571b = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f58574e) {
            this.f58574e = true;
            ((C22950c) generatedComponent()).mo33643d0((AccountListFragment) C10284i.m38510a(this));
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
        if (this.f58572c == null) {
            synchronized (this.f58573d) {
                if (this.f58572c == null) {
                    this.f58572c = createComponentManager();
                }
            }
        }
        return this.f58572c;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f58570a;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
