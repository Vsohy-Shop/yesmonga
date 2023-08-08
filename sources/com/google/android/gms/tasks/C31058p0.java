package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.C0353k0;
import com.google.android.gms.common.api.internal.C40587m;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.tasks.p0 */
public final class C31058p0 extends LifecycleCallback {

    /* renamed from: b */
    public final List f74318b = new ArrayList();

    public C31058p0(C40587m mVar) {
        super(mVar);
        this.f103291a.mo133930o("TaskOnStopCallback", this);
    }

    /* renamed from: m */
    public static C31058p0 m124537m(Activity activity) {
        C40587m c = LifecycleCallback.m164865c(activity);
        C31058p0 p0Var = (C31058p0) c.mo133938x("TaskOnStopCallback", C31058p0.class);
        if (p0Var == null) {
            return new C31058p0(c);
        }
        return p0Var;
    }

    @C0353k0
    /* renamed from: l */
    public final void mo87750l() {
        synchronized (this.f74318b) {
            for (WeakReference weakReference : this.f74318b) {
                C31048k0 k0Var = (C31048k0) weakReference.get();
                if (k0Var != null) {
                    k0Var.mo87711d();
                }
            }
            this.f74318b.clear();
        }
    }

    /* renamed from: n */
    public final void mo87751n(C31048k0 k0Var) {
        synchronized (this.f74318b) {
            this.f74318b.add(new WeakReference(k0Var));
        }
    }
}
