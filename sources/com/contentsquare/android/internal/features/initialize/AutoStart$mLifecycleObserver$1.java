package com.contentsquare.android.internal.features.initialize;

import android.content.Context;
import androidx.lifecycle.C19427i;
import androidx.lifecycle.C19499w;
import com.contentsquare.android.C14146m;
import com.contentsquare.android.sdk.C14654qd;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;

@C11076d0(mo22515d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo22516d2 = {"com/contentsquare/android/internal/features/initialize/AutoStart$mLifecycleObserver$1", "Landroidx/lifecycle/i;", "Landroidx/lifecycle/w;", "owner", "Lkotlin/d2;", "onStart", "onStop", "library_release"}, mo22517k = 1, mo22518mv = {1, 4, 3})
public final class AutoStart$mLifecycleObserver$1 implements C19427i {

    /* renamed from: a */
    public final /* synthetic */ AutoStart f34979a;

    public AutoStart$mLifecycleObserver$1(AutoStart autoStart) {
        this.f34979a = autoStart;
    }

    public void onStart(C19499w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        Context f = this.f34979a.mo34424f();
        if (f != null && this.f34979a.mo34421c(f)) {
            C14146m.m60743D(f);
            for (C14654qd a : this.f34979a.mo34423e()) {
                a.mo36263a(f);
            }
        }
    }

    public void onStop(C19499w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        Context f = this.f34979a.mo34424f();
        if (f != null && this.f34979a.mo34421c(f)) {
            for (C14654qd b : this.f34979a.mo34423e()) {
                b.mo36264b(f);
            }
        }
    }
}
