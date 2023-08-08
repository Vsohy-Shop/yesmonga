package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.p027os.C17800k;
import androidx.work.C21410t;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.d */
public class C21174d implements C21410t {

    /* renamed from: a */
    public final Handler f54627a;

    public C21174d() {
        this.f54627a = C17800k.m81188a(Looper.getMainLooper());
    }

    /* renamed from: a */
    public void mo63332a(@C0359n0 Runnable runnable) {
        this.f54627a.removeCallbacks(runnable);
    }

    /* renamed from: b */
    public void mo63333b(long j, @C0359n0 Runnable runnable) {
        this.f54627a.postDelayed(runnable, j);
    }

    @C0359n0
    /* renamed from: c */
    public Handler mo63334c() {
        return this.f54627a;
    }

    @C0344h1
    public C21174d(@C0359n0 Handler handler) {
        this.f54627a = handler;
    }
}
