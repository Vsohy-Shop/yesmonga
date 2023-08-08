package androidx.work.impl.model;

import androidx.annotation.C0337f0;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.C0843a;
import androidx.room.C20305f;
import androidx.room.C20340m0;
import androidx.room.C20348o;
import androidx.room.C20350o1;
import androidx.room.C20351p;
import androidx.room.Index;
import androidx.work.BackoffPolicy;
import androidx.work.C21087c;
import androidx.work.C21091d;
import androidx.work.C21377l;
import androidx.work.C21414w;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.C10978t;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20351p(indices = {@Index({"schedule_requested_at"}), @Index({"last_enqueue_time"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.model.u */
public final class C21249u {
    @C12579k

    /* renamed from: u */
    public static final C21250a f54800u = new C21250a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: v */
    public static final String f54801v;

    /* renamed from: w */
    public static final long f54802w = -1;
    @C12579k
    @C11287e

    /* renamed from: x */
    public static final C0843a<List<C21252c>, List<WorkInfo>> f54803x = new C21248t();
    @C20305f(name = "id")
    @C20340m0
    @C12579k
    @C11287e

    /* renamed from: a */
    public final String f54804a;
    @C20305f(name = "state")
    @C12579k
    @C11287e

    /* renamed from: b */
    public WorkInfo.State f54805b;
    @C20305f(name = "worker_class_name")
    @C12579k
    @C11287e

    /* renamed from: c */
    public String f54806c;
    @C12580l
    @C20305f(name = "input_merger_class_name")
    @C11287e

    /* renamed from: d */
    public String f54807d;
    @C20305f(name = "input")
    @C12579k
    @C11287e

    /* renamed from: e */
    public C21091d f54808e;
    @C20305f(name = "output")
    @C12579k
    @C11287e

    /* renamed from: f */
    public C21091d f54809f;
    @C20305f(name = "initial_delay")
    @C11287e

    /* renamed from: g */
    public long f54810g;
    @C20305f(name = "interval_duration")
    @C11287e

    /* renamed from: h */
    public long f54811h;
    @C20305f(name = "flex_duration")
    @C11287e

    /* renamed from: i */
    public long f54812i;
    @C12579k
    @C20348o
    @C11287e

    /* renamed from: j */
    public C21087c f54813j;
    @C20305f(name = "run_attempt_count")
    @C11287e

    /* renamed from: k */
    public int f54814k;
    @C20305f(name = "backoff_policy")
    @C12579k
    @C11287e

    /* renamed from: l */
    public BackoffPolicy f54815l;
    @C20305f(name = "backoff_delay_duration")
    @C11287e

    /* renamed from: m */
    public long f54816m;
    @C20305f(name = "last_enqueue_time")
    @C11287e

    /* renamed from: n */
    public long f54817n;
    @C20305f(name = "minimum_retention_duration")
    @C11287e

    /* renamed from: o */
    public long f54818o;
    @C20305f(name = "schedule_requested_at")
    @C11287e

    /* renamed from: p */
    public long f54819p;
    @C20305f(name = "run_in_foreground")
    @C11287e

    /* renamed from: q */
    public boolean f54820q;
    @C20305f(name = "out_of_quota_policy")
    @C12579k
    @C11287e

    /* renamed from: r */
    public OutOfQuotaPolicy f54821r;
    @C20305f(defaultValue = "0", name = "period_count")

    /* renamed from: s */
    public int f54822s;
    @C20305f(defaultValue = "0")

    /* renamed from: t */
    public final int f54823t;

    /* renamed from: androidx.work.impl.model.u$a */
    public static final class C21250a {
        public /* synthetic */ C21250a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C21250a() {
        }
    }

    /* renamed from: androidx.work.impl.model.u$b */
    public static final class C21251b {
        @C20305f(name = "id")
        @C12579k
        @C11287e

        /* renamed from: a */
        public String f54824a;
        @C20305f(name = "state")
        @C12579k
        @C11287e

        /* renamed from: b */
        public WorkInfo.State f54825b;

        public C21251b(@C12579k String str, @C12579k WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f54824a = str;
            this.f54825b = state;
        }

        /* renamed from: d */
        public static /* synthetic */ C21251b m98153d(C21251b bVar, String str, WorkInfo.State state, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f54824a;
            }
            if ((i & 2) != 0) {
                state = bVar.f54825b;
            }
            return bVar.mo63489c(str, state);
        }

        @C12579k
        /* renamed from: a */
        public final String mo63487a() {
            return this.f54824a;
        }

        @C12579k
        /* renamed from: b */
        public final WorkInfo.State mo63488b() {
            return this.f54825b;
        }

        @C12579k
        /* renamed from: c */
        public final C21251b mo63489c(@C12579k String str, @C12579k WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            return new C21251b(str, state);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21251b)) {
                return false;
            }
            C21251b bVar = (C21251b) obj;
            return Intrinsics.areEqual((Object) this.f54824a, (Object) bVar.f54824a) && this.f54825b == bVar.f54825b;
        }

        public int hashCode() {
            return (this.f54824a.hashCode() * 31) + this.f54825b.hashCode();
        }

        @C12579k
        public String toString() {
            return "IdAndState(id=" + this.f54824a + ", state=" + this.f54825b + ')';
        }
    }

    /* renamed from: androidx.work.impl.model.u$c */
    public static final class C21252c {
        @C20305f(name = "id")
        @C12579k

        /* renamed from: a */
        public String f54826a;
        @C20305f(name = "state")
        @C12579k

        /* renamed from: b */
        public WorkInfo.State f54827b;
        @C20305f(name = "output")
        @C12579k

        /* renamed from: c */
        public C21091d f54828c;
        @C20305f(name = "run_attempt_count")

        /* renamed from: d */
        public int f54829d;
        @C20305f(name = "generation")

        /* renamed from: e */
        public final int f54830e;
        @C20350o1(entity = C21274y.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        @C12579k

        /* renamed from: f */
        public List<String> f54831f;
        @C20350o1(entity = C21242q.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        @C12579k

        /* renamed from: g */
        public List<C21091d> f54832g;

        public C21252c(@C12579k String str, @C12579k WorkInfo.State state, @C12579k C21091d dVar, int i, int i2, @C12579k List<String> list, @C12579k List<C21091d> list2) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(dVar, "output");
            Intrinsics.checkNotNullParameter(list, "tags");
            Intrinsics.checkNotNullParameter(list2, "progress");
            this.f54826a = str;
            this.f54827b = state;
            this.f54828c = dVar;
            this.f54829d = i;
            this.f54830e = i2;
            this.f54831f = list;
            this.f54832g = list2;
        }

        /* renamed from: i */
        public static /* synthetic */ C21252c m98157i(C21252c cVar, String str, WorkInfo.State state, C21091d dVar, int i, int i2, List<String> list, List<C21091d> list2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = cVar.f54826a;
            }
            if ((i3 & 2) != 0) {
                state = cVar.f54827b;
            }
            WorkInfo.State state2 = state;
            if ((i3 & 4) != 0) {
                dVar = cVar.f54828c;
            }
            C21091d dVar2 = dVar;
            if ((i3 & 8) != 0) {
                i = cVar.f54829d;
            }
            int i4 = i;
            if ((i3 & 16) != 0) {
                i2 = cVar.f54830e;
            }
            int i5 = i2;
            if ((i3 & 32) != 0) {
                list = cVar.f54831f;
            }
            List<String> list3 = list;
            if ((i3 & 64) != 0) {
                list2 = cVar.f54832g;
            }
            return cVar.mo63501h(str, state2, dVar2, i4, i5, list3, list2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo63493a() {
            return this.f54826a;
        }

        @C12579k
        /* renamed from: b */
        public final WorkInfo.State mo63494b() {
            return this.f54827b;
        }

        @C12579k
        /* renamed from: c */
        public final C21091d mo63495c() {
            return this.f54828c;
        }

        /* renamed from: d */
        public final int mo63496d() {
            return this.f54829d;
        }

        /* renamed from: e */
        public final int mo63497e() {
            return this.f54830e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21252c)) {
                return false;
            }
            C21252c cVar = (C21252c) obj;
            return Intrinsics.areEqual((Object) this.f54826a, (Object) cVar.f54826a) && this.f54827b == cVar.f54827b && Intrinsics.areEqual((Object) this.f54828c, (Object) cVar.f54828c) && this.f54829d == cVar.f54829d && this.f54830e == cVar.f54830e && Intrinsics.areEqual((Object) this.f54831f, (Object) cVar.f54831f) && Intrinsics.areEqual((Object) this.f54832g, (Object) cVar.f54832g);
        }

        @C12579k
        /* renamed from: f */
        public final List<String> mo63499f() {
            return this.f54831f;
        }

        @C12579k
        /* renamed from: g */
        public final List<C21091d> mo63500g() {
            return this.f54832g;
        }

        @C12579k
        /* renamed from: h */
        public final C21252c mo63501h(@C12579k String str, @C12579k WorkInfo.State state, @C12579k C21091d dVar, int i, int i2, @C12579k List<String> list, @C12579k List<C21091d> list2) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(dVar, "output");
            Intrinsics.checkNotNullParameter(list, "tags");
            List<C21091d> list3 = list2;
            Intrinsics.checkNotNullParameter(list3, "progress");
            return new C21252c(str, state, dVar, i, i2, list, list3);
        }

        public int hashCode() {
            return (((((((((((this.f54826a.hashCode() * 31) + this.f54827b.hashCode()) * 31) + this.f54828c.hashCode()) * 31) + Integer.hashCode(this.f54829d)) * 31) + Integer.hashCode(this.f54830e)) * 31) + this.f54831f.hashCode()) * 31) + this.f54832g.hashCode();
        }

        /* renamed from: j */
        public final int mo63503j() {
            return this.f54830e;
        }

        @C12579k
        /* renamed from: k */
        public final String mo63504k() {
            return this.f54826a;
        }

        @C12579k
        /* renamed from: l */
        public final C21091d mo63505l() {
            return this.f54828c;
        }

        @C12579k
        /* renamed from: m */
        public final List<C21091d> mo63506m() {
            return this.f54832g;
        }

        /* renamed from: n */
        public final int mo63507n() {
            return this.f54829d;
        }

        @C12579k
        /* renamed from: o */
        public final WorkInfo.State mo63508o() {
            return this.f54827b;
        }

        @C12579k
        /* renamed from: p */
        public final List<String> mo63509p() {
            return this.f54831f;
        }

        /* renamed from: q */
        public final void mo63510q(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f54826a = str;
        }

        /* renamed from: r */
        public final void mo63511r(@C12579k C21091d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
            this.f54828c = dVar;
        }

        /* renamed from: s */
        public final void mo63512s(@C12579k List<C21091d> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f54832g = list;
        }

        /* renamed from: t */
        public final void mo63513t(int i) {
            this.f54829d = i;
        }

        @C12579k
        public String toString() {
            return "WorkInfoPojo(id=" + this.f54826a + ", state=" + this.f54827b + ", output=" + this.f54828c + ", runAttemptCount=" + this.f54829d + ", generation=" + this.f54830e + ", tags=" + this.f54831f + ", progress=" + this.f54832g + ')';
        }

        /* renamed from: u */
        public final void mo63515u(@C12579k WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(state, "<set-?>");
            this.f54827b = state;
        }

        /* renamed from: v */
        public final void mo63516v(@C12579k List<String> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f54831f = list;
        }

        @C12579k
        /* renamed from: w */
        public final WorkInfo mo63517w() {
            C21091d dVar;
            if (!this.f54832g.isEmpty()) {
                dVar = this.f54832g.get(0);
            } else {
                dVar = C21091d.f54440c;
            }
            return new WorkInfo(UUID.fromString(this.f54826a), this.f54827b, this.f54828c, this.f54831f, dVar, this.f54829d, this.f54830e);
        }
    }

    static {
        String i = C21377l.m98584i("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(i, "tagWithPrefix(\"WorkSpec\")");
        f54801v = i;
    }

    public C21249u(@C12579k String str, @C12579k WorkInfo.State state, @C12579k String str2, @C12580l String str3, @C12579k C21091d dVar, @C12579k C21091d dVar2, long j, long j2, long j3, @C12579k C21087c cVar, @C0337f0(from = 0) int i, @C12579k BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, @C12579k OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3) {
        C21091d dVar3 = dVar2;
        C21087c cVar2 = cVar;
        BackoffPolicy backoffPolicy2 = backoffPolicy;
        OutOfQuotaPolicy outOfQuotaPolicy2 = outOfQuotaPolicy;
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(str2, "workerClassName");
        Intrinsics.checkNotNullParameter(dVar, "input");
        Intrinsics.checkNotNullParameter(dVar3, "output");
        Intrinsics.checkNotNullParameter(cVar2, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy2, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy2, "outOfQuotaPolicy");
        this.f54804a = str;
        this.f54805b = state;
        this.f54806c = str2;
        this.f54807d = str3;
        this.f54808e = dVar;
        this.f54809f = dVar3;
        this.f54810g = j;
        this.f54811h = j2;
        this.f54812i = j3;
        this.f54813j = cVar2;
        this.f54814k = i;
        this.f54815l = backoffPolicy2;
        this.f54816m = j4;
        this.f54817n = j5;
        this.f54818o = j6;
        this.f54819p = j7;
        this.f54820q = z;
        this.f54821r = outOfQuotaPolicy2;
        this.f54822s = i2;
        this.f54823t = i3;
    }

    /* renamed from: b */
    public static final List m98120b(List list) {
        if (list == null) {
            return null;
        }
        Iterable<C21252c> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (C21252c w : iterable) {
            arrayList.add(w.mo63517w());
        }
        return arrayList;
    }

    /* renamed from: y */
    public static /* synthetic */ C21249u m98121y(C21249u uVar, String str, WorkInfo.State state, String str2, String str3, C21091d dVar, C21091d dVar2, long j, long j2, long j3, C21087c cVar, int i, BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3, int i4, Object obj) {
        C21249u uVar2 = uVar;
        int i5 = i4;
        return uVar.mo63485x((i5 & 1) != 0 ? uVar2.f54804a : str, (i5 & 2) != 0 ? uVar2.f54805b : state, (i5 & 4) != 0 ? uVar2.f54806c : str2, (i5 & 8) != 0 ? uVar2.f54807d : str3, (i5 & 16) != 0 ? uVar2.f54808e : dVar, (i5 & 32) != 0 ? uVar2.f54809f : dVar2, (i5 & 64) != 0 ? uVar2.f54810g : j, (i5 & 128) != 0 ? uVar2.f54811h : j2, (i5 & 256) != 0 ? uVar2.f54812i : j3, (i5 & 512) != 0 ? uVar2.f54813j : cVar, (i5 & 1024) != 0 ? uVar2.f54814k : i, (i5 & 2048) != 0 ? uVar2.f54815l : backoffPolicy, (i5 & 4096) != 0 ? uVar2.f54816m : j4, (i5 & 8192) != 0 ? uVar2.f54817n : j5, (i5 & 16384) != 0 ? uVar2.f54818o : j6, (i5 & 32768) != 0 ? uVar2.f54819p : j7, (i5 & 65536) != 0 ? uVar2.f54820q : z, (131072 & i5) != 0 ? uVar2.f54821r : outOfQuotaPolicy, (i5 & 262144) != 0 ? uVar2.f54822s : i2, (i5 & 524288) != 0 ? uVar2.f54823t : i3);
    }

    /* renamed from: A */
    public final int mo63453A() {
        return this.f54822s;
    }

    /* renamed from: B */
    public final boolean mo63454B() {
        return !Intrinsics.areEqual((Object) C21087c.f54420j, (Object) this.f54813j);
    }

    /* renamed from: C */
    public final boolean mo63455C() {
        return this.f54805b == WorkInfo.State.ENQUEUED && this.f54814k > 0;
    }

    /* renamed from: D */
    public final boolean mo63456D() {
        return this.f54811h != 0;
    }

    /* renamed from: E */
    public final void mo63457E(long j) {
        if (j > C21414w.f55161f) {
            C21377l.m98582e().mo63782l(f54801v, "Backoff delay duration exceeds maximum value");
        }
        if (j < 10000) {
            C21377l.m98582e().mo63782l(f54801v, "Backoff delay duration less than minimum value");
        }
        this.f54816m = C11479u.m44340K(j, 10000, C21414w.f55161f);
    }

    /* renamed from: F */
    public final void mo63458F(int i) {
        this.f54822s = i;
    }

    /* renamed from: G */
    public final void mo63459G(long j) {
        if (j < 900000) {
            C21377l.m98582e().mo63782l(f54801v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        mo63460H(C11479u.m44450v(j, 900000), C11479u.m44450v(j, 900000));
    }

    /* renamed from: H */
    public final void mo63460H(long j, long j2) {
        if (j < 900000) {
            C21377l.m98582e().mo63782l(f54801v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f54811h = C11479u.m44450v(j, 900000);
        if (j2 < 300000) {
            C21377l.m98582e().mo63782l(f54801v, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.f54811h) {
            C21377l e = C21377l.m98582e();
            String str = f54801v;
            e.mo63782l(str, "Flex duration greater than interval duration; Changed to " + j);
        }
        this.f54812i = C11479u.m44340K(j2, 300000, this.f54811h);
    }

    /* renamed from: c */
    public final long mo63461c() {
        long j;
        boolean z = false;
        if (mo63455C()) {
            if (this.f54815l == BackoffPolicy.LINEAR) {
                z = true;
            }
            if (z) {
                j = this.f54816m * ((long) this.f54814k);
            } else {
                j = (long) Math.scalb((float) this.f54816m, this.f54814k - 1);
            }
            return this.f54817n + C11479u.m44316C(j, C21414w.f55161f);
        }
        long j2 = 0;
        if (mo63456D()) {
            int i = this.f54822s;
            long j3 = this.f54817n;
            if (i == 0) {
                j3 += this.f54810g;
            }
            long j4 = this.f54812i;
            long j5 = this.f54811h;
            if (j4 != j5) {
                z = true;
            }
            if (z) {
                if (i == 0) {
                    j2 = ((long) -1) * j4;
                }
                j3 += j5;
            } else if (i != 0) {
                j2 = j5;
            }
            return j3 + j2;
        }
        long j6 = this.f54817n;
        if (j6 == 0) {
            j6 = System.currentTimeMillis();
        }
        return this.f54810g + j6;
    }

    @C12579k
    /* renamed from: d */
    public final String mo63462d() {
        return this.f54804a;
    }

    @C12579k
    /* renamed from: e */
    public final C21087c mo63463e() {
        return this.f54813j;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21249u)) {
            return false;
        }
        C21249u uVar = (C21249u) obj;
        return Intrinsics.areEqual((Object) this.f54804a, (Object) uVar.f54804a) && this.f54805b == uVar.f54805b && Intrinsics.areEqual((Object) this.f54806c, (Object) uVar.f54806c) && Intrinsics.areEqual((Object) this.f54807d, (Object) uVar.f54807d) && Intrinsics.areEqual((Object) this.f54808e, (Object) uVar.f54808e) && Intrinsics.areEqual((Object) this.f54809f, (Object) uVar.f54809f) && this.f54810g == uVar.f54810g && this.f54811h == uVar.f54811h && this.f54812i == uVar.f54812i && Intrinsics.areEqual((Object) this.f54813j, (Object) uVar.f54813j) && this.f54814k == uVar.f54814k && this.f54815l == uVar.f54815l && this.f54816m == uVar.f54816m && this.f54817n == uVar.f54817n && this.f54818o == uVar.f54818o && this.f54819p == uVar.f54819p && this.f54820q == uVar.f54820q && this.f54821r == uVar.f54821r && this.f54822s == uVar.f54822s && this.f54823t == uVar.f54823t;
    }

    /* renamed from: f */
    public final int mo63465f() {
        return this.f54814k;
    }

    @C12579k
    /* renamed from: g */
    public final BackoffPolicy mo63466g() {
        return this.f54815l;
    }

    /* renamed from: h */
    public final long mo63467h() {
        return this.f54816m;
    }

    public int hashCode() {
        int hashCode = ((((this.f54804a.hashCode() * 31) + this.f54805b.hashCode()) * 31) + this.f54806c.hashCode()) * 31;
        String str = this.f54807d;
        int hashCode2 = (((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f54808e.hashCode()) * 31) + this.f54809f.hashCode()) * 31) + Long.hashCode(this.f54810g)) * 31) + Long.hashCode(this.f54811h)) * 31) + Long.hashCode(this.f54812i)) * 31) + this.f54813j.hashCode()) * 31) + Integer.hashCode(this.f54814k)) * 31) + this.f54815l.hashCode()) * 31) + Long.hashCode(this.f54816m)) * 31) + Long.hashCode(this.f54817n)) * 31) + Long.hashCode(this.f54818o)) * 31) + Long.hashCode(this.f54819p)) * 31;
        boolean z = this.f54820q;
        if (z) {
            z = true;
        }
        return ((((((hashCode2 + (z ? 1 : 0)) * 31) + this.f54821r.hashCode()) * 31) + Integer.hashCode(this.f54822s)) * 31) + Integer.hashCode(this.f54823t);
    }

    /* renamed from: i */
    public final long mo63469i() {
        return this.f54817n;
    }

    /* renamed from: j */
    public final long mo63470j() {
        return this.f54818o;
    }

    /* renamed from: k */
    public final long mo63471k() {
        return this.f54819p;
    }

    /* renamed from: l */
    public final boolean mo63472l() {
        return this.f54820q;
    }

    @C12579k
    /* renamed from: m */
    public final OutOfQuotaPolicy mo63473m() {
        return this.f54821r;
    }

    /* renamed from: n */
    public final int mo63474n() {
        return this.f54822s;
    }

    @C12579k
    /* renamed from: o */
    public final WorkInfo.State mo63475o() {
        return this.f54805b;
    }

    /* renamed from: p */
    public final int mo63476p() {
        return this.f54823t;
    }

    @C12579k
    /* renamed from: q */
    public final String mo63477q() {
        return this.f54806c;
    }

    @C12580l
    /* renamed from: r */
    public final String mo63478r() {
        return this.f54807d;
    }

    @C12579k
    /* renamed from: s */
    public final C21091d mo63479s() {
        return this.f54808e;
    }

    @C12579k
    /* renamed from: t */
    public final C21091d mo63480t() {
        return this.f54809f;
    }

    @C12579k
    public String toString() {
        return "{WorkSpec: " + this.f54804a + C12361b.f30259j;
    }

    /* renamed from: u */
    public final long mo63482u() {
        return this.f54810g;
    }

    /* renamed from: v */
    public final long mo63483v() {
        return this.f54811h;
    }

    /* renamed from: w */
    public final long mo63484w() {
        return this.f54812i;
    }

    @C12579k
    /* renamed from: x */
    public final C21249u mo63485x(@C12579k String str, @C12579k WorkInfo.State state, @C12579k String str2, @C12580l String str3, @C12579k C21091d dVar, @C12579k C21091d dVar2, long j, long j2, long j3, @C12579k C21087c cVar, @C0337f0(from = 0) int i, @C12579k BackoffPolicy backoffPolicy, long j4, long j5, long j6, long j7, boolean z, @C12579k OutOfQuotaPolicy outOfQuotaPolicy, int i2, int i3) {
        String str4 = str;
        Intrinsics.checkNotNullParameter(str4, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(str2, "workerClassName");
        Intrinsics.checkNotNullParameter(dVar, "input");
        Intrinsics.checkNotNullParameter(dVar2, "output");
        Intrinsics.checkNotNullParameter(cVar, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new C21249u(str4, state, str2, str3, dVar, dVar2, j, j2, j3, cVar, i, backoffPolicy, j4, j5, j6, j7, z, outOfQuotaPolicy, i2, i3);
    }

    /* renamed from: z */
    public final int mo63486z() {
        return this.f54823t;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C21249u(java.lang.String r31, androidx.work.WorkInfo.State r32, java.lang.String r33, java.lang.String r34, androidx.work.C21091d r35, androidx.work.C21091d r36, long r37, long r39, long r41, androidx.work.C21087c r43, int r44, androidx.work.BackoffPolicy r45, long r46, long r48, long r50, long r52, boolean r54, androidx.work.OutOfQuotaPolicy r55, int r56, int r57, int r58, kotlin.jvm.internal.DefaultConstructorMarker r59) {
        /*
            r30 = this;
            r0 = r58
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.ENQUEUED
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r32
        L_0x000c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0013
            r1 = 0
            r6 = r1
            goto L_0x0015
        L_0x0013:
            r6 = r34
        L_0x0015:
            r1 = r0 & 16
            java.lang.String r2 = "EMPTY"
            if (r1 == 0) goto L_0x0022
            androidx.work.d r1 = androidx.work.C21091d.f54440c
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r7 = r1
            goto L_0x0024
        L_0x0022:
            r7 = r35
        L_0x0024:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002f
            androidx.work.d r1 = androidx.work.C21091d.f54440c
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r8 = r1
            goto L_0x0031
        L_0x002f:
            r8 = r36
        L_0x0031:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0039
            r9 = r2
            goto L_0x003b
        L_0x0039:
            r9 = r37
        L_0x003b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0041
            r11 = r2
            goto L_0x0043
        L_0x0041:
            r11 = r39
        L_0x0043:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0049
            r13 = r2
            goto L_0x004b
        L_0x0049:
            r13 = r41
        L_0x004b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0053
            androidx.work.c r1 = androidx.work.C21087c.f54420j
            r15 = r1
            goto L_0x0055
        L_0x0053:
            r15 = r43
        L_0x0055:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r1 == 0) goto L_0x005d
            r16 = r5
            goto L_0x005f
        L_0x005d:
            r16 = r44
        L_0x005f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0068
            androidx.work.BackoffPolicy r1 = androidx.work.BackoffPolicy.EXPONENTIAL
            r17 = r1
            goto L_0x006a
        L_0x0068:
            r17 = r45
        L_0x006a:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0071
            r18 = 30000(0x7530, double:1.4822E-319)
            goto L_0x0073
        L_0x0071:
            r18 = r46
        L_0x0073:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x007a
            r20 = r2
            goto L_0x007c
        L_0x007a:
            r20 = r48
        L_0x007c:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0083
            r22 = r2
            goto L_0x0085
        L_0x0083:
            r22 = r50
        L_0x0085:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0090
            r1 = -1
            r24 = r1
            goto L_0x0092
        L_0x0090:
            r24 = r52
        L_0x0092:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009a
            r26 = r5
            goto L_0x009c
        L_0x009a:
            r26 = r54
        L_0x009c:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a6
            androidx.work.OutOfQuotaPolicy r1 = androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            r27 = r1
            goto L_0x00a8
        L_0x00a6:
            r27 = r55
        L_0x00a8:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b0
            r28 = r5
            goto L_0x00b2
        L_0x00b0:
            r28 = r56
        L_0x00b2:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00ba
            r29 = r5
            goto L_0x00bc
        L_0x00ba:
            r29 = r57
        L_0x00bc:
            r2 = r30
            r3 = r31
            r5 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r24, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.C21249u.<init>(java.lang.String, androidx.work.WorkInfo$State, java.lang.String, java.lang.String, androidx.work.d, androidx.work.d, long, long, long, androidx.work.c, int, androidx.work.BackoffPolicy, long, long, long, long, boolean, androidx.work.OutOfQuotaPolicy, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C21249u(@C12579k String str, @C12579k String str2) {
        this(str, (WorkInfo.State) null, str2, (String) null, (C21091d) null, (C21091d) null, 0, 0, 0, (C21087c) null, 0, (BackoffPolicy) null, 0, 0, 0, 0, false, (OutOfQuotaPolicy) null, 0, 0, 1048570, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "workerClassName_");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21249u(@org.jetbrains.annotations.C12579k java.lang.String r34, @org.jetbrains.annotations.C12579k androidx.work.impl.model.C21249u r35) {
        /*
            r33 = this;
            r0 = r35
            r1 = r33
            r2 = r34
            java.lang.String r3 = "newId"
            r4 = r34
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r3 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r4 = r0.f54806c
            androidx.work.WorkInfo$State r3 = r0.f54805b
            java.lang.String r5 = r0.f54807d
            androidx.work.d r7 = new androidx.work.d
            r6 = r7
            androidx.work.d r8 = r0.f54808e
            r7.<init>((androidx.work.C21091d) r8)
            androidx.work.d r8 = new androidx.work.d
            r7 = r8
            androidx.work.d r9 = r0.f54809f
            r8.<init>((androidx.work.C21091d) r9)
            long r8 = r0.f54810g
            long r10 = r0.f54811h
            long r12 = r0.f54812i
            androidx.work.c r15 = new androidx.work.c
            r14 = r15
            r31 = r1
            androidx.work.c r1 = r0.f54813j
            r15.<init>(r1)
            int r15 = r0.f54814k
            androidx.work.BackoffPolicy r1 = r0.f54815l
            r16 = r1
            r32 = r2
            long r1 = r0.f54816m
            r17 = r1
            long r1 = r0.f54817n
            r19 = r1
            long r1 = r0.f54818o
            r21 = r1
            long r1 = r0.f54819p
            r23 = r1
            boolean r1 = r0.f54820q
            r25 = r1
            androidx.work.OutOfQuotaPolicy r1 = r0.f54821r
            r26 = r1
            int r0 = r0.f54822s
            r27 = r0
            r28 = 0
            r29 = 524288(0x80000, float:7.34684E-40)
            r30 = 0
            r1 = r31
            r2 = r32
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.C21249u.<init>(java.lang.String, androidx.work.impl.model.u):void");
    }
}
