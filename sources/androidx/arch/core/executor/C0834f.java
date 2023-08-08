package androidx.arch.core.executor;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.arch.core.executor.f */
public abstract class C0834f {
    /* renamed from: a */
    public abstract void mo3795a(@C0359n0 Runnable runnable);

    /* renamed from: b */
    public void mo3800b(@C0359n0 Runnable runnable) {
        if (mo3796c()) {
            runnable.run();
        } else {
            mo3797d(runnable);
        }
    }

    /* renamed from: c */
    public abstract boolean mo3796c();

    /* renamed from: d */
    public abstract void mo3797d(@C0359n0 Runnable runnable);
}
