package com.contentsquare.android.sdk;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.mc */
public final class C14531mc implements Runnable {

    /* renamed from: w */
    public static final C14532a f35948w = new C14532a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public Runnable f35949a;

    /* renamed from: b */
    public boolean f35950b;

    /* renamed from: c */
    public final AtomicBoolean f35951c = new AtomicBoolean(false);

    /* renamed from: d */
    public final C14453jf f35952d = new C14453jf("ThrottleDebounceOperator");

    /* renamed from: e */
    public int f35953e;

    /* renamed from: f */
    public int f35954f;

    /* renamed from: g */
    public final Handler f35955g;

    /* renamed from: v */
    public long f35956v;

    /* renamed from: com.contentsquare.android.sdk.mc$a */
    public static final class C14532a {
        public C14532a() {
        }

        public /* synthetic */ C14532a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14531mc(Handler handler, long j) {
        Intrinsics.checkNotNullParameter(handler, "uiHandler");
        this.f35955g = handler;
        this.f35956v = j;
    }

    /* renamed from: a */
    public final void mo35921a(long j) {
        this.f35956v = j;
    }

    /* renamed from: b */
    public final void mo35922b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f35949a = runnable;
        if (!this.f35950b) {
            this.f35950b = true;
            this.f35955g.postDelayed(this, this.f35956v);
        }
    }

    /* renamed from: c */
    public final void mo35923c(boolean z) {
        this.f35951c.set(z);
    }

    public void run() {
        this.f35950b = false;
        Runnable runnable = this.f35949a;
        if (runnable != null) {
            this.f35954f++;
            if (this.f35951c.get()) {
                int i = this.f35953e + 1;
                this.f35953e = i;
                int i2 = (i * 100) / this.f35954f;
                this.f35952d.mo35676e("Session replay frame skipped, currently " + i2 + "% of the frames are skipped.");
                mo35922b(runnable);
                return;
            }
            runnable.run();
        }
    }
}
