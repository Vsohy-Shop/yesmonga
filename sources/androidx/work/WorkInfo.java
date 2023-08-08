package androidx.work;

import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlinx.serialization.json.internal.C12361b;

public final class WorkInfo {
    @C0359n0

    /* renamed from: a */
    public UUID f54352a;
    @C0359n0

    /* renamed from: b */
    public State f54353b;
    @C0359n0

    /* renamed from: c */
    public C21091d f54354c;
    @C0359n0

    /* renamed from: d */
    public Set<String> f54355d;
    @C0359n0

    /* renamed from: e */
    public C21091d f54356e;

    /* renamed from: f */
    public int f54357f;

    /* renamed from: g */
    public final int f54358g;

    public enum State {
        ENQUEUED,
        f54360b,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        /* renamed from: q */
        public boolean mo63047q() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkInfo(@C0359n0 UUID uuid, @C0359n0 State state, @C0359n0 C21091d dVar, @C0359n0 List<String> list, @C0359n0 C21091d dVar2, int i, int i2) {
        this.f54352a = uuid;
        this.f54353b = state;
        this.f54354c = dVar;
        this.f54355d = new HashSet(list);
        this.f54356e = dVar2;
        this.f54357f = i;
        this.f54358g = i2;
    }

    /* renamed from: a */
    public int mo63037a() {
        return this.f54358g;
    }

    @C0359n0
    /* renamed from: b */
    public UUID mo63038b() {
        return this.f54352a;
    }

    @C0359n0
    /* renamed from: c */
    public C21091d mo63039c() {
        return this.f54354c;
    }

    @C0359n0
    /* renamed from: d */
    public C21091d mo63040d() {
        return this.f54356e;
    }

    @C0337f0(from = 0)
    /* renamed from: e */
    public int mo63041e() {
        return this.f54357f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WorkInfo.class != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f54357f == workInfo.f54357f && this.f54358g == workInfo.f54358g && this.f54352a.equals(workInfo.f54352a) && this.f54353b == workInfo.f54353b && this.f54354c.equals(workInfo.f54354c) && this.f54355d.equals(workInfo.f54355d)) {
            return this.f54356e.equals(workInfo.f54356e);
        }
        return false;
    }

    @C0359n0
    /* renamed from: f */
    public State mo63043f() {
        return this.f54353b;
    }

    @C0359n0
    /* renamed from: g */
    public Set<String> mo63044g() {
        return this.f54355d;
    }

    public int hashCode() {
        return (((((((((((this.f54352a.hashCode() * 31) + this.f54353b.hashCode()) * 31) + this.f54354c.hashCode()) * 31) + this.f54355d.hashCode()) * 31) + this.f54356e.hashCode()) * 31) + this.f54357f) * 31) + this.f54358g;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f54352a + '\'' + ", mState=" + this.f54353b + ", mOutputData=" + this.f54354c + ", mTags=" + this.f54355d + ", mProgress=" + this.f54356e + C12361b.f30259j;
    }
}
