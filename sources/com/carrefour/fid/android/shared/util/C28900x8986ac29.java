package com.carrefour.fid.android.shared.util;

import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19499w;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.shared.util.FragmentViewBindingDelegate$1$viewLifecycleOwnerLiveDataObserver$1 */
public final class C28900x8986ac29 implements C19426h0<C19499w> {

    /* renamed from: a */
    public final /* synthetic */ FragmentViewBindingDelegate<T> f70794a;

    public C28900x8986ac29(FragmentViewBindingDelegate<T> fragmentViewBindingDelegate) {
        this.f70794a = fragmentViewBindingDelegate;
    }

    /* renamed from: b */
    public final void mo4590a(@C12580l C19499w wVar) {
        if (wVar != null) {
            wVar.getLifecycle().mo57464a(new C28901x15c3bf27(this.f70794a));
        }
    }
}
