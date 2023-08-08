package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d */
public final class C40224d extends SchedulerConfig.C40219b {

    /* renamed from: a */
    public final long f102504a;

    /* renamed from: b */
    public final long f102505b;

    /* renamed from: c */
    public final Set<SchedulerConfig.Flag> f102506c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d$b */
    public static final class C40226b extends SchedulerConfig.C40219b.C40220a {

        /* renamed from: a */
        public Long f102507a;

        /* renamed from: b */
        public Long f102508b;

        /* renamed from: c */
        public Set<SchedulerConfig.Flag> f102509c;

        /* renamed from: a */
        public SchedulerConfig.C40219b mo132876a() {
            String str = "";
            if (this.f102507a == null) {
                str = str + " delta";
            }
            if (this.f102508b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f102509c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C40224d(this.f102507a.longValue(), this.f102508b.longValue(), this.f102509c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public SchedulerConfig.C40219b.C40220a mo132877b(long j) {
            this.f102507a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public SchedulerConfig.C40219b.C40220a mo132878c(Set<SchedulerConfig.Flag> set) {
            if (set != null) {
                this.f102509c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        /* renamed from: d */
        public SchedulerConfig.C40219b.C40220a mo132879d(long j) {
            this.f102508b = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public long mo132873b() {
        return this.f102504a;
    }

    /* renamed from: c */
    public Set<SchedulerConfig.Flag> mo132874c() {
        return this.f102506c;
    }

    /* renamed from: d */
    public long mo132875d() {
        return this.f102505b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.C40219b)) {
            return false;
        }
        SchedulerConfig.C40219b bVar = (SchedulerConfig.C40219b) obj;
        if (this.f102504a == bVar.mo132873b() && this.f102505b == bVar.mo132875d() && this.f102506c.equals(bVar.mo132874c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f102504a;
        long j2 = this.f102505b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f102506c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f102504a + ", maxAllowedDelay=" + this.f102505b + ", flags=" + this.f102506c + "}";
    }

    public C40224d(long j, long j2, Set<SchedulerConfig.Flag> set) {
        this.f102504a = j;
        this.f102505b = j2;
        this.f102506c = set;
    }
}
