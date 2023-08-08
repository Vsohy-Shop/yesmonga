package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.C0376v0;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C40224d;
import com.google.android.datatransport.runtime.time.C40309a;
import com.google.auto.value.C32455c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@C32455c
public abstract class SchedulerConfig {

    /* renamed from: a */
    public static final long f102482a = 86400000;

    /* renamed from: b */
    public static final long f102483b = 30000;

    /* renamed from: c */
    public static final long f102484c = 1000;

    /* renamed from: d */
    public static final long f102485d = 10000;

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$a */
    public static class C40218a {

        /* renamed from: a */
        public C40309a f102490a;

        /* renamed from: b */
        public Map<Priority, C40219b> f102491b = new HashMap();

        /* renamed from: a */
        public C40218a mo132870a(Priority priority, C40219b bVar) {
            this.f102491b.put(priority, bVar);
            return this;
        }

        /* renamed from: b */
        public SchedulerConfig mo132871b() {
            if (this.f102490a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.f102491b.keySet().size() >= Priority.values().length) {
                Map<Priority, C40219b> map = this.f102491b;
                this.f102491b = new HashMap();
                return SchedulerConfig.m163555d(this.f102490a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }

        /* renamed from: c */
        public C40218a mo132872c(C40309a aVar) {
            this.f102490a = aVar;
            return this;
        }
    }

    @C32455c
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$b */
    public static abstract class C40219b {

        @C32455c.C32456a
        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$b$a */
        public static abstract class C40220a {
            /* renamed from: a */
            public abstract C40219b mo132876a();

            /* renamed from: b */
            public abstract C40220a mo132877b(long j);

            /* renamed from: c */
            public abstract C40220a mo132878c(Set<Flag> set);

            /* renamed from: d */
            public abstract C40220a mo132879d(long j);
        }

        /* renamed from: a */
        public static C40220a m163568a() {
            return new C40224d.C40226b().mo132878c(Collections.emptySet());
        }

        /* renamed from: b */
        public abstract long mo132873b();

        /* renamed from: c */
        public abstract Set<Flag> mo132874c();

        /* renamed from: d */
        public abstract long mo132875d();
    }

    /* renamed from: b */
    public static C40218a m163554b() {
        return new C40218a();
    }

    /* renamed from: d */
    public static SchedulerConfig m163555d(C40309a aVar, Map<Priority, C40219b> map) {
        return new C40223c(aVar, map);
    }

    /* renamed from: f */
    public static SchedulerConfig m163556f(C40309a aVar) {
        return m163554b().mo132870a(Priority.DEFAULT, C40219b.m163568a().mo132877b(30000).mo132879d(86400000).mo132876a()).mo132870a(Priority.HIGHEST, C40219b.m163568a().mo132877b(1000).mo132879d(86400000).mo132876a()).mo132870a(Priority.VERY_LOW, C40219b.m163568a().mo132877b(86400000).mo132879d(86400000).mo132878c(m163557j(Flag.DEVICE_IDLE)).mo132876a()).mo132872c(aVar).mo132871b();
    }

    /* renamed from: j */
    public static <T> Set<T> m163557j(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: a */
    public final long mo132863a(int i, long j) {
        long j2;
        int i2 = i - 1;
        if (j > 1) {
            j2 = j;
        } else {
            j2 = 2;
        }
        return (long) (Math.pow(3.0d, (double) i2) * ((double) j) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) (j2 * ((long) i2)))));
    }

    @C0376v0(api = 21)
    /* renamed from: c */
    public JobInfo.Builder mo132864c(JobInfo.Builder builder, Priority priority, long j, int i) {
        builder.setMinimumLatency(mo132867h(priority, j, i));
        mo132869k(builder, mo132868i().get(priority).mo132874c());
        return builder;
    }

    /* renamed from: e */
    public abstract C40309a mo132865e();

    /* renamed from: g */
    public Set<Flag> mo132866g(Priority priority) {
        return mo132868i().get(priority).mo132874c();
    }

    /* renamed from: h */
    public long mo132867h(Priority priority, long j, int i) {
        long time = j - mo132865e().getTime();
        C40219b bVar = mo132868i().get(priority);
        return Math.min(Math.max(mo132863a(i, bVar.mo132873b()), time), bVar.mo132875d());
    }

    /* renamed from: i */
    public abstract Map<Priority, C40219b> mo132868i();

    @C0376v0(api = 21)
    /* renamed from: k */
    public final void mo132869k(JobInfo.Builder builder, Set<Flag> set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
