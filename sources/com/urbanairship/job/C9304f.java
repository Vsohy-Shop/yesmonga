package com.urbanairship.job;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17992m;
import com.urbanairship.C36040b;
import com.urbanairship.json.C9323b;
import com.urbanairship.util.C9654i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.job.f */
public class C9304f {

    /* renamed from: i */
    public static final int f25384i = 0;

    /* renamed from: j */
    public static final int f25385j = 1;

    /* renamed from: k */
    public static final int f25386k = 2;

    /* renamed from: a */
    public final String f25387a;

    /* renamed from: b */
    public final String f25388b;

    /* renamed from: c */
    public final boolean f25389c;

    /* renamed from: d */
    public final long f25390d;

    /* renamed from: e */
    public final int f25391e;

    /* renamed from: f */
    public final long f25392f;

    /* renamed from: g */
    public final C9323b f25393g;

    /* renamed from: h */
    public final Set<String> f25394h;

    /* renamed from: com.urbanairship.job.f$b */
    public static class C9306b {

        /* renamed from: a */
        public final long f25395a;

        /* renamed from: b */
        public String f25396b;

        /* renamed from: c */
        public String f25397c;

        /* renamed from: d */
        public boolean f25398d;

        /* renamed from: e */
        public C9323b f25399e;

        /* renamed from: f */
        public int f25400f;

        /* renamed from: g */
        public long f25401g;

        /* renamed from: h */
        public long f25402h;

        /* renamed from: i */
        public Set<String> f25403i;

        @C0359n0
        /* renamed from: i */
        public C9306b mo18723i(@C0359n0 String str) {
            this.f25403i.add(str);
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C9304f mo18724j() {
            C9654i.m36166b(this.f25396b, "Missing action.");
            return new C9304f(this);
        }

        @C0359n0
        /* renamed from: k */
        public C9306b mo18725k(@C0363p0 String str) {
            this.f25396b = str;
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C9306b mo18726l(@C0359n0 Class<? extends C36040b> cls) {
            this.f25397c = cls.getName();
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C9306b mo18727m(@C0363p0 String str) {
            this.f25397c = str;
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C9306b mo18728n(int i) {
            this.f25400f = i;
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C9306b mo18729o(@C0359n0 C9323b bVar) {
            this.f25399e = bVar;
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C9306b mo18730p(long j, @C0359n0 TimeUnit timeUnit) {
            this.f25401g = Math.max(30000, timeUnit.toMillis(j));
            return this;
        }

        @C0359n0
        /* renamed from: q */
        public C9306b mo18731q(long j, @C0359n0 TimeUnit timeUnit) {
            this.f25402h = timeUnit.toMillis(j);
            return this;
        }

        @C0359n0
        /* renamed from: r */
        public C9306b mo18732r(boolean z) {
            this.f25398d = z;
            return this;
        }

        public C9306b() {
            this.f25395a = 30000;
            this.f25400f = 0;
            this.f25401g = 30000;
            this.f25402h = 0;
            this.f25403i = new HashSet();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.job.f$c */
    public @interface C9307c {
    }

    @C0359n0
    /* renamed from: i */
    public static C9306b m34907i() {
        return new C9306b();
    }

    @C0359n0
    /* renamed from: a */
    public String mo18712a() {
        return this.f25387a;
    }

    @C0359n0
    /* renamed from: b */
    public String mo18713b() {
        return this.f25388b;
    }

    /* renamed from: c */
    public int mo18714c() {
        return this.f25391e;
    }

    @C0359n0
    /* renamed from: d */
    public C9323b mo18715d() {
        return this.f25393g;
    }

    /* renamed from: e */
    public long mo18716e() {
        return this.f25392f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9304f fVar = (C9304f) obj;
        if (this.f25389c != fVar.f25389c || this.f25390d != fVar.f25390d || this.f25391e != fVar.f25391e || this.f25392f != fVar.f25392f || !C17992m.m81740a(this.f25393g, fVar.f25393g) || !C17992m.m81740a(this.f25387a, fVar.f25387a) || !C17992m.m81740a(this.f25388b, fVar.f25388b) || !C17992m.m81740a(this.f25394h, fVar.f25394h)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public long mo18718f() {
        return this.f25390d;
    }

    @C0359n0
    /* renamed from: g */
    public Set<String> mo18719g() {
        return this.f25394h;
    }

    /* renamed from: h */
    public boolean mo18720h() {
        return this.f25389c;
    }

    public int hashCode() {
        return C17992m.m81741b(this.f25393g, this.f25387a, this.f25388b, Boolean.valueOf(this.f25389c), Long.valueOf(this.f25390d), Integer.valueOf(this.f25391e), Long.valueOf(this.f25392f), this.f25394h);
    }

    public String toString() {
        return "JobInfo{action='" + this.f25387a + '\'' + ", airshipComponentName='" + this.f25388b + '\'' + ", isNetworkAccessRequired=" + this.f25389c + ", minDelayMs=" + this.f25390d + ", conflictStrategy=" + this.f25391e + ", initialBackOffMs=" + this.f25392f + ", extras=" + this.f25393g + ", rateLimitIds=" + this.f25394h + C12361b.f30259j;
    }

    public C9304f(@C0359n0 C9306b bVar) {
        this.f25387a = bVar.f25396b;
        this.f25388b = bVar.f25397c == null ? "" : bVar.f25397c;
        this.f25393g = bVar.f25399e != null ? bVar.f25399e : C9323b.f25440b;
        this.f25389c = bVar.f25398d;
        this.f25390d = bVar.f25402h;
        this.f25391e = bVar.f25400f;
        this.f25392f = bVar.f25401g;
        this.f25394h = new HashSet(bVar.f25403i);
    }
}
