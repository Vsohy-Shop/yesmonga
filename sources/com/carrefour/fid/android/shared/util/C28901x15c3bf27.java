package com.carrefour.fid.android.shared.util;

import androidx.lifecycle.C19427i;
import androidx.lifecycle.C19499w;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo22516d2 = {"com/carrefour/fid/android/shared/util/FragmentViewBindingDelegate$1$viewLifecycleOwnerLiveDataObserver$1$onChanged$1", "Landroidx/lifecycle/i;", "Landroidx/lifecycle/w;", "owner", "Lkotlin/d2;", "onDestroy", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.shared.util.FragmentViewBindingDelegate$1$viewLifecycleOwnerLiveDataObserver$1$onChanged$1 */
public final class C28901x15c3bf27 implements C19427i {

    /* renamed from: a */
    public final /* synthetic */ FragmentViewBindingDelegate<T> f70795a;

    public C28901x15c3bf27(FragmentViewBindingDelegate<T> fragmentViewBindingDelegate) {
        this.f70795a = fragmentViewBindingDelegate;
    }

    public void onDestroy(@C12579k C19499w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        this.f70795a.f70791c = null;
    }
}
