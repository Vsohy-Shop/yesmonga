package com.carrefour.fid.android.shared.util;

import android.view.LayoutInflater;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19427i;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import androidx.viewbinding.C20752b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.C11427e;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nFragmentViewBindingDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewBindingDelegate.kt\ncom/carrefour/fid/android/shared/util/FragmentViewBindingDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
public final class FragmentViewBindingDelegate<T extends C20752b> implements C11427e<Fragment, T> {

    /* renamed from: d */
    public static final int f70788d = 8;
    @C12579k

    /* renamed from: a */
    public final Fragment f70789a;
    @C12579k

    /* renamed from: b */
    public final C11300l<LayoutInflater, T> f70790b;
    @C12580l

    /* renamed from: c */
    public T f70791c;

    public FragmentViewBindingDelegate(@C12579k Fragment fragment, @C12579k C11300l<? super LayoutInflater, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(lVar, "viewBindingFactory");
        this.f70789a = fragment;
        this.f70790b = lVar;
        fragment.getLifecycle().mo57464a(new C19427i(this) {
            @C12579k

            /* renamed from: a */
            public final C19426h0<C19499w> f70792a;

            /* renamed from: b */
            public final /* synthetic */ FragmentViewBindingDelegate<T> f70793b;

            {
                this.f70793b = r2;
                this.f70792a = new C28900x8986ac29(r2);
            }

            @C12579k
            /* renamed from: a */
            public final C19426h0<C19499w> mo84093a() {
                return this.f70792a;
            }

            /* renamed from: f */
            public void mo57583f(@C12579k C19499w wVar) {
                Intrinsics.checkNotNullParameter(wVar, "owner");
                this.f70793b.f70789a.getViewLifecycleOwnerLiveData().mo57492l(this.f70792a);
            }

            public void onDestroy(@C12579k C19499w wVar) {
                Intrinsics.checkNotNullParameter(wVar, "owner");
                this.f70793b.f70789a.getViewLifecycleOwnerLiveData().mo57494p(this.f70792a);
            }
        });
    }

    @C12579k
    /* renamed from: e */
    public T mo22938a(@C12579k Fragment fragment, @C12579k C11510n<?> nVar) {
        Intrinsics.checkNotNullParameter(fragment, "thisRef");
        Intrinsics.checkNotNullParameter(nVar, "property");
        T t = this.f70791c;
        if (t != null) {
            return t;
        }
        if (fragment.getViewLifecycleOwner().getLifecycle().mo57465b().mo57474q(Lifecycle.State.INITIALIZED)) {
            C11300l<LayoutInflater, T> lVar = this.f70790b;
            LayoutInflater layoutInflater = fragment.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "thisRef.layoutInflater");
            T t2 = (C20752b) lVar.invoke(layoutInflater);
            this.f70791c = t2;
            return t2;
        }
        throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
    }
}
