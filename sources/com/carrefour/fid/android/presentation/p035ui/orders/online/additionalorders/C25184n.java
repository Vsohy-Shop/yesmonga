package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders;

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

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.n */
public abstract class C25184n<VB extends C20752b> extends C37185a<VB> implements C10276d {

    /* renamed from: a */
    public ContextWrapper f62025a;

    /* renamed from: b */
    public boolean f62026b;

    /* renamed from: c */
    public volatile C10229g f62027c;

    /* renamed from: d */
    public final Object f62028d = new Object();

    /* renamed from: e */
    public boolean f62029e = false;

    public C25184n(C11305q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> qVar, C11300l<? super View, ? extends VB> lVar, boolean z) {
        super(qVar, lVar, z);
    }

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f62026b) {
            return null;
        }
        initializeComponentContext();
        return this.f62025a;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f62025a == null) {
            this.f62025a = C10229g.m38469b(super.getContext(), this);
            this.f62026b = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f62029e) {
            this.f62029e = true;
            ((C24978a) generatedComponent()).mo33630b((AdditionalOrderBottomSheetFragment) C10284i.m38510a(this));
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
        if (this.f62027c == null) {
            synchronized (this.f62028d) {
                if (this.f62027c == null) {
                    this.f62027c = createComponentManager();
                }
            }
        }
        return this.f62027c;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f62025a;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
