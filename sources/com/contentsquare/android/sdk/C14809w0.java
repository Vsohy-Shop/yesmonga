package com.contentsquare.android.sdk;

import android.app.Activity;
import androidx.collection.C1866a;
import androidx.collection.C1887m;
import com.contentsquare.android.sdk.C14688re;
import java.util.Map;

/* renamed from: com.contentsquare.android.sdk.w0 */
public abstract class C14809w0<T extends C14688re> implements C14278dc {

    /* renamed from: a */
    public final Map<Activity, T> f36707a = new C1866a();

    /* renamed from: b */
    public final C14453jf f36708b = new C14453jf("AbstractActivityMonitoringStrategy");

    /* renamed from: c */
    public final C1887m<Long> f36709c = new C1887m<>();

    /* renamed from: d */
    public final C14772u7 f36710d;

    public C14809w0(C14772u7 u7Var) {
        this.f36710d = u7Var;
    }

    /* renamed from: a */
    public C14772u7 mo36657a() {
        return this.f36710d;
    }

    /* renamed from: d */
    public final Long mo36658d(Activity activity, long j) {
        Long l = this.f36709c.mo6364l(activity.hashCode(), Long.valueOf(j));
        this.f36709c.mo6373x(activity.hashCode());
        return l;
    }

    /* renamed from: e */
    public T mo36659e(Activity activity) {
        return (C14688re) this.f36707a.remove(activity);
    }

    /* renamed from: f */
    public void mo36660f(Activity activity, T t) {
        this.f36707a.put(activity, t);
        t.mo34767g(activity, mo36661g(activity));
    }

    /* renamed from: g */
    public long mo36661g(Activity activity) {
        long b = this.f36710d.mo36566b();
        return b - mo36658d(activity, b).longValue();
    }

    public void onActivityStarted(Activity activity) {
        this.f36708b.mo35674c("activity [%s] was added to timestamp mapper", activity);
        this.f36709c.mo6369t(activity.hashCode(), Long.valueOf(this.f36710d.mo36566b()));
    }
}
