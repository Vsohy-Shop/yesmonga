package com.urbanairship.reactive;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.reactive.g */
public class C9588g {

    /* renamed from: a */
    public static C9589a f26232a;

    /* renamed from: com.urbanairship.reactive.g$a */
    public static class C9589a implements C9587f {

        /* renamed from: a */
        public final Looper f26233a;

        /* renamed from: com.urbanairship.reactive.g$a$a */
        public class C9590a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C9596k f26234a;

            /* renamed from: b */
            public final /* synthetic */ Runnable f26235b;

            public C9590a(C9596k kVar, Runnable runnable) {
                this.f26234a = kVar;
                this.f26235b = runnable;
            }

            public void run() {
                if (!this.f26234a.mo19508d()) {
                    this.f26235b.run();
                }
            }
        }

        /* renamed from: com.urbanairship.reactive.g$a$b */
        public class C9591b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C9596k f26237a;

            /* renamed from: b */
            public final /* synthetic */ Runnable f26238b;

            public C9591b(C9596k kVar, Runnable runnable) {
                this.f26237a = kVar;
                this.f26238b = runnable;
            }

            public void run() {
                if (!this.f26237a.mo19508d()) {
                    this.f26238b.run();
                }
            }
        }

        public C9589a(@C0359n0 Looper looper) {
            this.f26233a = looper;
        }

        @C0359n0
        /* renamed from: a */
        public C9596k mo19499a(long j, @C0359n0 Runnable runnable) {
            C9596k c = C9596k.m35945c();
            new Handler(this.f26233a).postDelayed(new C9591b(c, runnable), j);
            return c;
        }

        @C0359n0
        /* renamed from: b */
        public C9596k mo19500b(@C0359n0 Runnable runnable) {
            C9596k c = C9596k.m35945c();
            new Handler(this.f26233a).post(new C9590a(c, runnable));
            return c;
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C9589a m35926a(@C0359n0 Looper looper) {
        return new C9589a(looper);
    }

    @C0359n0
    /* renamed from: b */
    public static C9589a m35927b() {
        if (f26232a == null) {
            f26232a = m35926a(Looper.getMainLooper());
        }
        return f26232a;
    }
}
