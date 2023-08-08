package com.carrefour.fid.android.presentation.p035ui.notification;

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

/* renamed from: com.carrefour.fid.android.presentation.ui.notification.a */
public abstract class C24649a extends Fragment implements C10276d {

    /* renamed from: a */
    public ContextWrapper f61232a;

    /* renamed from: b */
    public boolean f61233b;

    /* renamed from: c */
    public volatile C10229g f61234c;

    /* renamed from: d */
    public final Object f61235d = new Object();

    /* renamed from: e */
    public boolean f61236e = false;

    public C24649a() {
    }

    public C10229g createComponentManager() {
        return new C10229g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f61233b) {
            return null;
        }
        initializeComponentContext();
        return this.f61232a;
    }

    public C19502x0.C19506b getDefaultViewModelProviderFactory() {
        return C10195a.m38420b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f61232a == null) {
            this.f61232a = C10229g.m38469b(super.getContext(), this);
            this.f61233b = C10176a.m38399a(super.getContext());
        }
    }

    public void inject() {
        if (!this.f61236e) {
            this.f61236e = true;
            ((C24651c) generatedComponent()).mo33752v((SubscribeToNewsNotificationFragment) C10284i.m38510a(this));
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
        if (this.f61234c == null) {
            synchronized (this.f61235d) {
                if (this.f61234c == null) {
                    this.f61234c = createComponentManager();
                }
            }
        }
        return this.f61234c;
    }

    public C24649a(int i) {
        super(i);
    }

    @C0353k0
    @C0346i
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f61232a;
        C10280f.m38508d(contextWrapper == null || C10229g.m38471d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
