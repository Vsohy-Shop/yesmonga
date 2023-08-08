package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

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

/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.g */
public abstract class C23474g extends C28499q implements C10276d {

    /* renamed from: a */
    public ContextWrapper f59344a;

    /* renamed from: b */
    public boolean f59345b;

    /* renamed from: c */
    public volatile C10229g f59346c;

    /* renamed from: d */
    public final Object f59347d = new Object();

    /* renamed from: e */
    public boolean f59348e = false;

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f59345b) {
            return null;
        }
        initializeComponentContext();
        return this.f59344a;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f59344a == null) {
            this.f59344a = C10229g.m38469b(super.getContext(), this);
            this.f59345b = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f59348e) {
            this.f59348e = true;
            ((C23472e) generatedComponent()).mo33577Q((CheckoutBasketsListFragment) C10284i.m38510a(this));
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
        if (this.f59346c == null) {
            synchronized (this.f59347d) {
                if (this.f59346c == null) {
                    this.f59346c = createComponentManager();
                }
            }
        }
        return this.f59346c;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f59344a;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
