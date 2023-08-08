package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

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

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.r0 */
public abstract class C25152r0<VB extends C20752b> extends C28494o<VB> implements C10276d {

    /* renamed from: a */
    public ContextWrapper f61978a;

    /* renamed from: b */
    public boolean f61979b;

    /* renamed from: c */
    public volatile C10229g f61980c;

    /* renamed from: d */
    public final Object f61981d = new Object();

    /* renamed from: e */
    public boolean f61982e = false;

    public C25152r0(C11305q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> qVar) {
        super(qVar);
    }

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f61979b) {
            return null;
        }
        initializeComponentContext();
        return this.f61978a;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f61978a == null) {
            this.f61978a = C10229g.m38469b(super.getContext(), this);
            this.f61979b = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f61982e) {
            this.f61982e = true;
            ((C25134j0) generatedComponent()).mo33574P1((CheckoutStepTwoAdditionalOderFragment) C10284i.m38510a(this));
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
        if (this.f61980c == null) {
            synchronized (this.f61981d) {
                if (this.f61980c == null) {
                    this.f61980c = createComponentManager();
                }
            }
        }
        return this.f61980c;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f61978a;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
