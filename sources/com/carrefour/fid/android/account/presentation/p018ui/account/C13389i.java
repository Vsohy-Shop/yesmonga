package com.carrefour.fid.android.account.presentation.p018ui.account;

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

/* renamed from: com.carrefour.fid.android.account.presentation.ui.account.i */
public abstract class C13389i<VB extends C20752b> extends C28494o<VB> implements C10276d {

    /* renamed from: a */
    public ContextWrapper f32783a;

    /* renamed from: b */
    public boolean f32784b;

    /* renamed from: c */
    public volatile C10229g f32785c;

    /* renamed from: d */
    public final Object f32786d = new Object();

    /* renamed from: e */
    public boolean f32787e = false;

    public C13389i(C11305q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> qVar) {
        super(qVar);
    }

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f32784b) {
            return null;
        }
        initializeComponentContext();
        return this.f32783a;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f32783a == null) {
            this.f32783a = C10229g.m38469b(super.getContext(), this);
            this.f32784b = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f32787e) {
            this.f32787e = true;
            ((C13387g) generatedComponent()).mo31758G0((AccountInfoFragment) C10284i.m38510a(this));
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
        if (this.f32785c == null) {
            synchronized (this.f32786d) {
                if (this.f32785c == null) {
                    this.f32785c = createComponentManager();
                }
            }
        }
        return this.f32785c;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f32783a;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
