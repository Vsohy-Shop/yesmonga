package com.carrefour.fid.android.product.presentation.p039ui.quantity;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.lifecycle.C19502x0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.widgets.C37185a;
import dagger.hilt.android.flags.C10176a;
import dagger.hilt.android.internal.lifecycle.C10195a;
import dagger.hilt.android.internal.managers.C10229g;
import dagger.hilt.internal.C10276d;
import dagger.hilt.internal.C10280f;
import dagger.hilt.internal.C10284i;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.quantity.a */
public abstract class C28098a<VB extends C20752b> extends C37185a<VB> implements C10276d {

    /* renamed from: a */
    public ContextWrapper f68058a;

    /* renamed from: b */
    public boolean f68059b;

    /* renamed from: c */
    public volatile C10229g f68060c;

    /* renamed from: d */
    public final Object f68061d = new Object();

    /* renamed from: e */
    public boolean f68062e = false;

    public C28098a(C11305q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> qVar, C11300l<? super View, ? extends VB> lVar, boolean z) {
        super(qVar, lVar, z);
    }

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f68059b) {
            return null;
        }
        initializeComponentContext();
        return this.f68058a;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f68058a == null) {
            this.f68058a = C10229g.m38469b(super.getContext(), this);
            this.f68059b = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f68062e) {
            this.f68062e = true;
            ((C28100c) generatedComponent()).mo33708n((QuantityBackDropFragment) C10284i.m38510a(this));
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
        if (this.f68060c == null) {
            synchronized (this.f68061d) {
                if (this.f68060c == null) {
                    this.f68060c = createComponentManager();
                }
            }
        }
        return this.f68060c;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f68058a;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
