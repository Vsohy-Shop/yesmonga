package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.annotations.concurrent.C32561a;
import com.google.firebase.annotations.concurrent.C32562b;
import com.google.firebase.annotations.concurrent.C32563c;
import com.google.firebase.annotations.concurrent.C32564d;
import com.google.firebase.components.C32578f0;
import com.google.firebase.components.C32580g;
import com.google.firebase.components.C32611y;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    public static final C32611y<ScheduledExecutorService> f79119a = new C32611y<>(new C32639v());

    /* renamed from: b */
    public static final C32611y<ScheduledExecutorService> f79120b = new C32611y<>(new C32640w());

    /* renamed from: c */
    public static final C32611y<ScheduledExecutorService> f79121c = new C32611y<>(new C32641x());

    /* renamed from: d */
    public static final C32611y<ScheduledExecutorService> f79122d = new C32611y<>(new C32642y());

    /* renamed from: i */
    public static StrictMode.ThreadPolicy m131780i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i >= 26) {
            StrictMode.ThreadPolicy.Builder unused = detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    /* renamed from: j */
    public static ThreadFactory m131781j(String str, int i) {
        return new C32616b(str, i, (StrictMode.ThreadPolicy) null);
    }

    /* renamed from: k */
    public static ThreadFactory m131782k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new C32616b(str, i, threadPolicy);
    }

    /* renamed from: t */
    public static StrictMode.ThreadPolicy m131791t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* renamed from: u */
    public static ScheduledExecutorService m131792u(ExecutorService executorService) {
        return new C32629o(executorService, f79122d.get());
    }

    public List<C32580g<?>> getComponents() {
        Class<C32561a> cls = C32561a.class;
        Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;
        C32578f0<ScheduledExecutorService> a = C32578f0.m131623a(cls, cls2);
        Class<ExecutorService> cls3 = ExecutorService.class;
        Class<Executor> cls4 = Executor.class;
        C32578f0[] f0VarArr = {C32578f0.m131623a(cls, cls3), C32578f0.m131623a(cls, cls4)};
        Class<C32562b> cls5 = C32562b.class;
        C32578f0<C32562b> a2 = C32578f0.m131623a(cls5, cls2);
        C32578f0[] f0VarArr2 = {C32578f0.m131623a(cls5, cls3), C32578f0.m131623a(cls5, cls4)};
        Class<C32563c> cls6 = C32563c.class;
        return Arrays.asList(new C32580g[]{C32580g.m131635g(a, f0VarArr).mo94697f(new C32635r()).mo94695d(), C32580g.m131635g(a2, f0VarArr2).mo94697f(new C32636s()).mo94695d(), C32580g.m131635g(C32578f0.m131623a(cls6, cls2), C32578f0.m131623a(cls6, cls3), C32578f0.m131623a(cls6, cls4)).mo94697f(new C32637t()).mo94695d(), C32580g.m131634f(C32578f0.m131623a(C32564d.class, cls4)).mo94697f(new C32638u()).mo94695d()});
    }
}
