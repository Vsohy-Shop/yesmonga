package com.urbanairship.push;

import android.content.Context;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.Autopilot;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.push.C9456b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.urbanairship.push.u */
public abstract class C9539u {

    /* renamed from: a */
    public static final String f26120a = "EXTRA_PROVIDER_CLASS";

    /* renamed from: b */
    public static final String f26121b = "EXTRA_PUSH";

    /* renamed from: com.urbanairship.push.u$a */
    public class C9540a implements UAirship.C35444d {

        /* renamed from: a */
        public final /* synthetic */ Class f26122a;

        /* renamed from: b */
        public final /* synthetic */ String f26123b;

        public C9540a(Class cls, String str) {
            this.f26122a = cls;
            this.f26123b = str;
        }

        /* renamed from: a */
        public void mo19438a(@C0359n0 UAirship uAirship) {
            uAirship.mo106203E().mo19435x0(this.f26122a, this.f26123b);
        }
    }

    /* renamed from: com.urbanairship.push.u$b */
    public class C9541b implements UAirship.C35444d {
        /* renamed from: a */
        public void mo19438a(@C0359n0 UAirship uAirship) {
            uAirship.mo106203E().mo19435x0((Class<? extends PushProvider>) null, (String) null);
        }
    }

    /* renamed from: com.urbanairship.push.u$c */
    public static class C9542c {

        /* renamed from: a */
        public final Class<? extends PushProvider> f26124a;

        /* renamed from: b */
        public final PushMessage f26125b;

        /* renamed from: c */
        public long f26126c;

        /* renamed from: com.urbanairship.push.u$c$a */
        public class C9543a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ CountDownLatch f26127a;

            public C9543a(CountDownLatch countDownLatch) {
                this.f26127a = countDownLatch;
            }

            public void run() {
                this.f26127a.countDown();
            }
        }

        public /* synthetic */ C9542c(Class cls, PushMessage pushMessage, C9540a aVar) {
            this(cls, pushMessage);
        }

        /* renamed from: a */
        public void mo19439a(@C0359n0 Context context) {
            mo19440b(context, (Runnable) null);
        }

        /* renamed from: b */
        public void mo19440b(@C0359n0 Context context, @C0363p0 Runnable runnable) {
            Future<?> submit = C9537t.f26081U.submit(new C9456b.C9458b(context).mo19230m(this.f26125b).mo19233p(this.f26124a.toString()).mo19226i());
            try {
                long j = this.f26126c;
                if (j > 0) {
                    submit.get(j, TimeUnit.MILLISECONDS);
                } else {
                    submit.get();
                }
            } catch (TimeoutException unused) {
                C36059m.m148409e("Application took too long to process push. App may get closed.", new Object[0]);
            } catch (Exception e) {
                C36059m.m148411g(e, "Failed to wait for notification", new Object[0]);
            }
            if (runnable != null) {
                runnable.run();
            }
        }

        @C0348i1
        /* renamed from: c */
        public void mo19441c(@C0359n0 Context context) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            mo19440b(context, new C9543a(countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                C36059m.m148411g(e, "Failed to wait for push.", new Object[0]);
                Thread.currentThread().interrupt();
            }
        }

        @C0359n0
        /* renamed from: d */
        public C9542c mo19442d(long j) {
            this.f26126c = j;
            return this;
        }

        public C9542c(@C0359n0 Class<? extends PushProvider> cls, @C0359n0 PushMessage pushMessage) {
            this.f26124a = cls;
            this.f26125b = pushMessage;
        }
    }

    @C0348i1
    @C0359n0
    /* renamed from: a */
    public static C9542c m35826a(@C0359n0 Class<? extends PushProvider> cls, @C0359n0 PushMessage pushMessage) {
        return new C9542c(cls, pushMessage, (C9540a) null);
    }

    @Deprecated
    /* renamed from: b */
    public static void m35827b(@C0359n0 Context context) {
        Autopilot.m146142e(context);
        if (UAirship.m146182M() || UAirship.m146184O()) {
            UAirship.m146187X(new C9541b());
        }
    }

    /* renamed from: c */
    public static void m35828c(@C0359n0 Context context, @C0359n0 Class<? extends PushProvider> cls, @C0363p0 String str) {
        Autopilot.m146142e(context);
        if (UAirship.m146182M() || UAirship.m146184O()) {
            UAirship.m146187X(new C9540a(cls, str));
        }
    }
}
