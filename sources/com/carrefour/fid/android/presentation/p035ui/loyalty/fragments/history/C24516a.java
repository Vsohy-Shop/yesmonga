package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.history;

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

/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.history.a */
public abstract class C24516a<VB extends C20752b> extends C28494o<VB> implements C10276d {

    /* renamed from: a */
    public ContextWrapper f61043a;

    /* renamed from: b */
    public boolean f61044b;

    /* renamed from: c */
    public volatile C10229g f61045c;

    /* renamed from: d */
    public final Object f61046d = new Object();

    /* renamed from: e */
    public boolean f61047e = false;

    public C24516a(C11305q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> qVar) {
        super(qVar);
    }

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f61044b) {
            return null;
        }
        initializeComponentContext();
        return this.f61043a;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f61043a == null) {
            this.f61043a = C10229g.m38469b(super.getContext(), this);
            this.f61044b = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f61047e) {
            this.f61047e = true;
            ((C24520d) generatedComponent()).mo33488A((LoyaltyAmountHistoryFragment) C10284i.m38510a(this));
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
        if (this.f61045c == null) {
            synchronized (this.f61046d) {
                if (this.f61045c == null) {
                    this.f61045c = createComponentManager();
                }
            }
        }
        return this.f61045c;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f61043a;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
