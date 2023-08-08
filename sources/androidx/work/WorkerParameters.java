package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.C21345b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    @C0359n0

    /* renamed from: a */
    public UUID f54375a;
    @C0359n0

    /* renamed from: b */
    public C21091d f54376b;
    @C0359n0

    /* renamed from: c */
    public Set<String> f54377c;
    @C0359n0

    /* renamed from: d */
    public C21081a f54378d;

    /* renamed from: e */
    public int f54379e;
    @C0359n0

    /* renamed from: f */
    public Executor f54380f;
    @C0359n0

    /* renamed from: g */
    public C21345b f54381g;
    @C0359n0

    /* renamed from: h */
    public C21417x f54382h;
    @C0359n0

    /* renamed from: i */
    public C21407r f54383i;
    @C0359n0

    /* renamed from: j */
    public C21095g f54384j;

    /* renamed from: k */
    public int f54385k;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C21081a {
        @C0359n0

        /* renamed from: a */
        public List<String> f54386a = Collections.emptyList();
        @C0359n0

        /* renamed from: b */
        public List<Uri> f54387b = Collections.emptyList();
        @C0363p0
        @C0376v0(28)

        /* renamed from: c */
        public Network f54388c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerParameters(@C0359n0 UUID uuid, @C0359n0 C21091d dVar, @C0359n0 Collection<String> collection, @C0359n0 C21081a aVar, @C0337f0(from = 0) int i, @C0337f0(from = 0) int i2, @C0359n0 Executor executor, @C0359n0 C21345b bVar, @C0359n0 C21417x xVar, @C0359n0 C21407r rVar, @C0359n0 C21095g gVar) {
        this.f54375a = uuid;
        this.f54376b = dVar;
        this.f54377c = new HashSet(collection);
        this.f54378d = aVar;
        this.f54379e = i;
        this.f54385k = i2;
        this.f54380f = executor;
        this.f54381g = bVar;
        this.f54382h = xVar;
        this.f54383i = rVar;
        this.f54384j = gVar;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public Executor mo63081a() {
        return this.f54380f;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public C21095g mo63082b() {
        return this.f54384j;
    }

    @C0337f0(from = 0)
    /* renamed from: c */
    public int mo63083c() {
        return this.f54385k;
    }

    @C0359n0
    /* renamed from: d */
    public UUID mo63084d() {
        return this.f54375a;
    }

    @C0359n0
    /* renamed from: e */
    public C21091d mo63085e() {
        return this.f54376b;
    }

    @C0363p0
    @C0376v0(28)
    /* renamed from: f */
    public Network mo63086f() {
        return this.f54378d.f54388c;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public C21407r mo63087g() {
        return this.f54383i;
    }

    @C0337f0(from = 0)
    /* renamed from: h */
    public int mo63088h() {
        return this.f54379e;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: i */
    public C21081a mo63089i() {
        return this.f54378d;
    }

    @C0359n0
    /* renamed from: j */
    public Set<String> mo63090j() {
        return this.f54377c;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: k */
    public C21345b mo63091k() {
        return this.f54381g;
    }

    @C0359n0
    @C0376v0(24)
    /* renamed from: l */
    public List<String> mo63092l() {
        return this.f54378d.f54386a;
    }

    @C0359n0
    @C0376v0(24)
    /* renamed from: m */
    public List<Uri> mo63093m() {
        return this.f54378d.f54387b;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public C21417x mo63094n() {
        return this.f54382h;
    }
}
