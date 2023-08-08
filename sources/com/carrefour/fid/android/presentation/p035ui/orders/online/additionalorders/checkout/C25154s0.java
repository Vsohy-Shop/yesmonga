package com.carrefour.fid.android.presentation.p035ui.orders.online.additionalorders.checkout;

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

/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.additionalorders.checkout.s0 */
public abstract class C25154s0 extends C28489j implements C10276d {

    /* renamed from: c */
    public ContextWrapper f61985c;

    /* renamed from: d */
    public boolean f61986d;

    /* renamed from: e */
    public volatile C10229g f61987e;

    /* renamed from: f */
    public final Object f61988f = new Object();

    /* renamed from: g */
    public boolean f61989g = false;

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f61986d) {
            return null;
        }
        initializeComponentContext();
        return this.f61985c;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f61985c == null) {
            this.f61985c = C10229g.m38469b(super.getContext(), this);
            this.f61986d = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f61989g) {
            this.f61989g = true;
            ((C25136k0) generatedComponent()).mo33656f1((CheckoutStepTwoCgvDialogFragment) C10284i.m38510a(this));
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
        if (this.f61987e == null) {
            synchronized (this.f61988f) {
                if (this.f61987e == null) {
                    this.f61987e = createComponentManager();
                }
            }
        }
        return this.f61987e;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f61985c;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
