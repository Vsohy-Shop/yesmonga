package com.urbanairship.iam;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0337f0;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.util.concurrent.TimeUnit;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.iam.c */
public class C9161c extends C9173e {

    /* renamed from: b */
    public InAppMessage f24847b = null;

    /* renamed from: c */
    public boolean f24848c = false;

    /* renamed from: d */
    public final Handler f24849d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public long f24850e;

    /* renamed from: f */
    public final Runnable f24851f = new C9162a();

    /* renamed from: com.urbanairship.iam.c$a */
    public class C9162a implements Runnable {
        public C9162a() {
        }

        public void run() {
            if (C9161c.this.f24847b == null) {
                boolean unused = C9161c.this.f24848c = false;
                C9161c.this.mo18401b();
            }
        }
    }

    public C9161c(long j) {
        this.f24850e = j;
    }

    @C0353k0
    /* renamed from: a */
    public boolean mo18369a() {
        if (this.f24847b != null) {
            return false;
        }
        return !this.f24848c;
    }

    @C0353k0
    /* renamed from: c */
    public void mo18370c(@C0359n0 InAppMessage inAppMessage) {
        this.f24847b = null;
        this.f24849d.postDelayed(this.f24851f, this.f24850e);
    }

    @C0353k0
    /* renamed from: d */
    public void mo18371d(@C0359n0 InAppMessage inAppMessage) {
        this.f24847b = inAppMessage;
        this.f24848c = true;
        this.f24849d.removeCallbacks(this.f24851f);
    }

    /* renamed from: h */
    public long mo18372h() {
        return this.f24850e;
    }

    /* renamed from: i */
    public void mo18373i(@C0337f0(from = 0) long j, @C0359n0 TimeUnit timeUnit) {
        this.f24850e = timeUnit.toMillis(j);
    }
}
