package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.C40309a;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c */
public final class C40223c extends SchedulerConfig {

    /* renamed from: e */
    public final C40309a f102502e;

    /* renamed from: f */
    public final Map<Priority, SchedulerConfig.C40219b> f102503f;

    public C40223c(C40309a aVar, Map<Priority, SchedulerConfig.C40219b> map) {
        if (aVar != null) {
            this.f102502e = aVar;
            if (map != null) {
                this.f102503f = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* renamed from: e */
    public C40309a mo132865e() {
        return this.f102502e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        if (!this.f102502e.equals(schedulerConfig.mo132865e()) || !this.f102503f.equals(schedulerConfig.mo132868i())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f102502e.hashCode() ^ 1000003) * 1000003) ^ this.f102503f.hashCode();
    }

    /* renamed from: i */
    public Map<Priority, SchedulerConfig.C40219b> mo132868i() {
        return this.f102503f;
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f102502e + ", values=" + this.f102503f + "}";
    }
}
