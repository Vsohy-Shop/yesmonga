package com.urbanairship.automation.limits;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.util.C9654i;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.limits.b */
public class C8906b {

    /* renamed from: a */
    public final String f23870a;

    /* renamed from: b */
    public final long f23871b;

    /* renamed from: c */
    public final int f23872c;

    /* renamed from: com.urbanairship.automation.limits.b$b */
    public static class C8908b {

        /* renamed from: a */
        public String f23873a;

        /* renamed from: b */
        public long f23874b;

        /* renamed from: c */
        public int f23875c;

        @C0359n0
        /* renamed from: d */
        public C8906b mo17544d() {
            boolean z;
            C9654i.m36166b(this.f23873a, "missing id");
            boolean z2 = true;
            if (this.f23874b > 0) {
                z = true;
            } else {
                z = false;
            }
            C9654i.m36165a(z, "missing range");
            if (this.f23875c <= 0) {
                z2 = false;
            }
            C9654i.m36165a(z2, "missing count");
            return new C8906b(this);
        }

        @C0359n0
        /* renamed from: e */
        public C8908b mo17545e(int i) {
            this.f23875c = i;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C8908b mo17546f(@C0363p0 String str) {
            this.f23873a = str;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C8908b mo17547g(@C0359n0 TimeUnit timeUnit, long j) {
            this.f23874b = timeUnit.toMillis(j);
            return this;
        }

        public C8908b() {
        }
    }

    /* renamed from: d */
    public static C8908b m33042d() {
        return new C8908b();
    }

    /* renamed from: a */
    public int mo17538a() {
        return this.f23872c;
    }

    @C0359n0
    /* renamed from: b */
    public String mo17539b() {
        return this.f23870a;
    }

    /* renamed from: c */
    public long mo17540c() {
        return this.f23871b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8906b bVar = (C8906b) obj;
        if (this.f23871b == bVar.f23871b && this.f23872c == bVar.f23872c) {
            return this.f23870a.equals(bVar.f23870a);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f23871b;
        return (((this.f23870a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f23872c;
    }

    public String toString() {
        return "FrequencyConstraint{id='" + this.f23870a + '\'' + ", range=" + this.f23871b + ", count=" + this.f23872c + C12361b.f30259j;
    }

    public C8906b(C8908b bVar) {
        this.f23870a = bVar.f23873a;
        this.f23871b = bVar.f23874b;
        this.f23872c = bVar.f23875c;
    }
}
