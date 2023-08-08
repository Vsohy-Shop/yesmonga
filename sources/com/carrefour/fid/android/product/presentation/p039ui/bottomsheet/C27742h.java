package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

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
import com.carrefour.fid.android.shared.base.C28480e;
import dagger.hilt.android.flags.C10176a;
import dagger.hilt.android.internal.lifecycle.C10195a;
import dagger.hilt.android.internal.managers.C10229g;
import dagger.hilt.internal.C10276d;
import dagger.hilt.internal.C10280f;
import dagger.hilt.internal.C10284i;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.h */
public abstract class C27742h<VB extends C20752b> extends C28480e<VB> implements C10276d {

    /* renamed from: F0 */
    public ContextWrapper f67270F0;

    /* renamed from: G0 */
    public boolean f67271G0;

    /* renamed from: H0 */
    public volatile C10229g f67272H0;

    /* renamed from: I0 */
    public final Object f67273I0 = new Object();

    /* renamed from: J0 */
    public boolean f67274J0 = false;

    public C27742h(C11305q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> qVar, C11300l<? super View, ? extends VB> lVar, boolean z) {
        super(qVar, lVar, z);
    }

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f67271G0) {
            return null;
        }
        initializeComponentContext();
        return this.f67270F0;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f67270F0 == null) {
            this.f67270F0 = C10229g.m38469b(super.getContext(), this);
            this.f67271G0 = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f67274J0) {
            this.f67274J0 = true;
            ((C27744j) generatedComponent()).mo33702m((MixingProductsBottomSheetFragment) C10284i.m38510a(this));
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
        if (this.f67272H0 == null) {
            synchronized (this.f67273I0) {
                if (this.f67272H0 == null) {
                    this.f67272H0 = createComponentManager();
                }
            }
        }
        return this.f67272H0;
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f67270F0;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
