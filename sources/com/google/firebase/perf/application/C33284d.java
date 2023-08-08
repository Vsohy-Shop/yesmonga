package com.google.firebase.perf.application;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.C17239t;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.C40974d0;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.metrics.C33378g;
import com.google.firebase.perf.util.C33436e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.perf.application.d */
public class C33284d {

    /* renamed from: e */
    public static final C33363a f80938e = C33363a.m134449e();

    /* renamed from: f */
    public static final String f80939f = "androidx.core.app.FrameMetricsAggregator";

    /* renamed from: a */
    public final Activity f80940a;

    /* renamed from: b */
    public final C17239t f80941b;

    /* renamed from: c */
    public final Map<Fragment, C33378g.C33379a> f80942c;

    /* renamed from: d */
    public boolean f80943d;

    public C33284d(Activity activity) {
        this(activity, new C17239t(), new HashMap());
    }

    /* renamed from: a */
    public static boolean m134207a() {
        return true;
    }

    /* renamed from: b */
    public final C33436e<C33378g.C33379a> mo96301b() {
        if (!this.f80943d) {
            f80938e.mo96429a("No recording has been started.");
            return C33436e.m134825a();
        }
        SparseIntArray[] b = this.f80941b.mo51691b();
        if (b == null) {
            f80938e.mo96429a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return C33436e.m134825a();
        } else if (b[0] != null) {
            return C33436e.m134827e(C33378g.m134530a(b));
        } else {
            f80938e.mo96429a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return C33436e.m134825a();
        }
    }

    /* renamed from: c */
    public void mo96302c() {
        if (this.f80943d) {
            f80938e.mo96430b("FrameMetricsAggregator is already recording %s", this.f80940a.getClass().getSimpleName());
            return;
        }
        this.f80941b.mo51690a(this.f80940a);
        this.f80943d = true;
    }

    /* renamed from: d */
    public void mo96303d(Fragment fragment) {
        if (!this.f80943d) {
            f80938e.mo96429a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
        } else if (this.f80942c.containsKey(fragment)) {
            f80938e.mo96430b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
        } else {
            C33436e<C33378g.C33379a> b = mo96301b();
            if (!b.mo96912d()) {
                f80938e.mo96430b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
                return;
            }
            this.f80942c.put(fragment, b.mo96911c());
        }
    }

    /* renamed from: e */
    public C33436e<C33378g.C33379a> mo96304e() {
        if (!this.f80943d) {
            f80938e.mo96429a("Cannot stop because no recording was started");
            return C33436e.m134825a();
        }
        if (!this.f80942c.isEmpty()) {
            f80938e.mo96429a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f80942c.clear();
        }
        C33436e<C33378g.C33379a> b = mo96301b();
        try {
            this.f80941b.mo51692c(this.f80940a);
        } catch (IllegalArgumentException | NullPointerException e) {
            if (!(e instanceof NullPointerException) || Build.VERSION.SDK_INT <= 28) {
                f80938e.mo96440m("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                b = C33436e.m134825a();
            } else {
                throw e;
            }
        }
        this.f80941b.mo51693d();
        this.f80943d = false;
        return b;
    }

    /* renamed from: f */
    public C33436e<C33378g.C33379a> mo96305f(Fragment fragment) {
        if (!this.f80943d) {
            f80938e.mo96429a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return C33436e.m134825a();
        } else if (!this.f80942c.containsKey(fragment)) {
            f80938e.mo96430b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return C33436e.m134825a();
        } else {
            C33378g.C33379a remove = this.f80942c.remove(fragment);
            C33436e<C33378g.C33379a> b = mo96301b();
            if (b.mo96912d()) {
                return C33436e.m134827e(b.mo96911c().mo96520a(remove));
            }
            f80938e.mo96430b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            return C33436e.m134825a();
        }
    }

    @C40974d0
    public C33284d(Activity activity, C17239t tVar, Map<Fragment, C33378g.C33379a> map) {
        this.f80943d = false;
        this.f80940a = activity;
        this.f80941b = tVar;
        this.f80942c = map;
    }
}
