package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.C0344h1;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.utils.C21301d;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C10930d1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import p073j$.time.Duration;

/* renamed from: androidx.work.w */
public abstract class C21414w {
    @C12579k

    /* renamed from: d */
    public static final C21416b f55159d = new C21416b((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final long f55160e = 30000;
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: f */
    public static final long f55161f = 18000000;
    @SuppressLint({"MinMaxConstant"})

    /* renamed from: g */
    public static final long f55162g = 10000;
    @C12579k

    /* renamed from: a */
    public final UUID f55163a;
    @C12579k

    /* renamed from: b */
    public final C21249u f55164b;
    @C12579k

    /* renamed from: c */
    public final Set<String> f55165c;

    /* renamed from: androidx.work.w$a */
    public static abstract class C21415a<B extends C21415a<B, ?>, W extends C21414w> {
        @C12579k

        /* renamed from: a */
        public final Class<? extends C21372k> f55166a;

        /* renamed from: b */
        public boolean f55167b;
        @C12579k

        /* renamed from: c */
        public UUID f55168c;
        @C12579k

        /* renamed from: d */
        public C21249u f55169d;
        @C12579k

        /* renamed from: e */
        public final Set<String> f55170e;

        public C21415a(@C12579k Class<? extends C21372k> cls) {
            Intrinsics.checkNotNullParameter(cls, "workerClass");
            this.f55166a = cls;
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            this.f55168c = randomUUID;
            String uuid = this.f55168c.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            String name = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            this.f55169d = new C21249u(uuid, name);
            String name2 = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "workerClass.name");
            this.f55170e = C10930d1.m40898q(name2);
        }

        @C12579k
        /* renamed from: a */
        public final B mo63861a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "tag");
            this.f55170e.add(str);
            return mo63788g();
        }

        @C12579k
        /* renamed from: b */
        public final W mo63862b() {
            boolean z;
            W c = mo63787c();
            C21087c cVar = this.f55169d.f54813j;
            boolean z2 = false;
            if (cVar.mo63129e() || cVar.mo63131f() || cVar.mo63132g() || cVar.mo63133h()) {
                z = true;
            } else {
                z = false;
            }
            C21249u uVar = this.f55169d;
            if (uVar.f54820q) {
                if (!z) {
                    if (uVar.f54810g <= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
            }
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            mo63875q(randomUUID);
            return c;
        }

        @C12579k
        /* renamed from: c */
        public abstract W mo63787c();

        /* renamed from: d */
        public final boolean mo63863d() {
            return this.f55167b;
        }

        @C12579k
        /* renamed from: e */
        public final UUID mo63864e() {
            return this.f55168c;
        }

        @C12579k
        /* renamed from: f */
        public final Set<String> mo63865f() {
            return this.f55170e;
        }

        @C12579k
        /* renamed from: g */
        public abstract B mo63788g();

        @C12579k
        /* renamed from: h */
        public final C21249u mo63866h() {
            return this.f55169d;
        }

        @C12579k
        /* renamed from: i */
        public final Class<? extends C21372k> mo63867i() {
            return this.f55166a;
        }

        @C12579k
        /* renamed from: j */
        public final B mo63868j(long j, @C12579k TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f55169d.f54818o = timeUnit.toMillis(j);
            return mo63788g();
        }

        @C0376v0(26)
        @C12579k
        /* renamed from: k */
        public final B mo63869k(@C12579k Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f55169d.f54818o = C21301d.m98372a(duration);
            return mo63788g();
        }

        @C12579k
        /* renamed from: l */
        public final B mo63870l(@C12579k BackoffPolicy backoffPolicy, long j, @C12579k TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f55167b = true;
            C21249u uVar = this.f55169d;
            uVar.f54815l = backoffPolicy;
            uVar.mo63457E(timeUnit.toMillis(j));
            return mo63788g();
        }

        @C0376v0(26)
        @C12579k
        /* renamed from: m */
        public final B mo63871m(@C12579k BackoffPolicy backoffPolicy, @C12579k Duration duration) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f55167b = true;
            C21249u uVar = this.f55169d;
            uVar.f54815l = backoffPolicy;
            uVar.mo63457E(C21301d.m98372a(duration));
            return mo63788g();
        }

        /* renamed from: n */
        public final void mo63872n(boolean z) {
            this.f55167b = z;
        }

        @C12579k
        /* renamed from: o */
        public final B mo63873o(@C12579k C21087c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "constraints");
            this.f55169d.f54813j = cVar;
            return mo63788g();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @C12579k
        /* renamed from: p */
        public B mo63874p(@C12579k OutOfQuotaPolicy outOfQuotaPolicy) {
            Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "policy");
            C21249u uVar = this.f55169d;
            uVar.f54820q = true;
            uVar.f54821r = outOfQuotaPolicy;
            return mo63788g();
        }

        @C12579k
        /* renamed from: q */
        public final B mo63875q(@C12579k UUID uuid) {
            Intrinsics.checkNotNullParameter(uuid, "id");
            this.f55168c = uuid;
            String uuid2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "id.toString()");
            this.f55169d = new C21249u(uuid2, this.f55169d);
            return mo63788g();
        }

        /* renamed from: r */
        public final void mo63876r(@C12579k UUID uuid) {
            Intrinsics.checkNotNullParameter(uuid, "<set-?>");
            this.f55168c = uuid;
        }

        @C12579k
        /* renamed from: s */
        public B mo63877s(long j, @C12579k TimeUnit timeUnit) {
            boolean z;
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f55169d.f54810g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f55169d.f54810g) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return mo63788g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        @C0376v0(26)
        @C12579k
        /* renamed from: t */
        public B mo63878t(@C12579k Duration duration) {
            boolean z;
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f55169d.f54810g = C21301d.m98372a(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f55169d.f54810g) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return mo63788g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        @C0344h1
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C12579k
        /* renamed from: u */
        public final B mo63879u(int i) {
            this.f55169d.f54814k = i;
            return mo63788g();
        }

        @C0344h1
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C12579k
        /* renamed from: v */
        public final B mo63880v(@C12579k WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f55169d.f54805b = state;
            return mo63788g();
        }

        @C12579k
        /* renamed from: w */
        public final B mo63881w(@C12579k C21091d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "inputData");
            this.f55169d.f54808e = dVar;
            return mo63788g();
        }

        @C0344h1
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C12579k
        /* renamed from: x */
        public final B mo63882x(long j, @C12579k TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f55169d.f54817n = timeUnit.toMillis(j);
            return mo63788g();
        }

        @C0344h1
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @C12579k
        /* renamed from: y */
        public final B mo63883y(long j, @C12579k TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.f55169d.f54819p = timeUnit.toMillis(j);
            return mo63788g();
        }

        /* renamed from: z */
        public final void mo63884z(@C12579k C21249u uVar) {
            Intrinsics.checkNotNullParameter(uVar, "<set-?>");
            this.f55169d = uVar;
        }
    }

    /* renamed from: androidx.work.w$b */
    public static final class C21416b {
        public /* synthetic */ C21416b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C21416b() {
        }
    }

    public C21414w(@C12579k UUID uuid, @C12579k C21249u uVar, @C12579k Set<String> set) {
        Intrinsics.checkNotNullParameter(uuid, "id");
        Intrinsics.checkNotNullParameter(uVar, "workSpec");
        Intrinsics.checkNotNullParameter(set, "tags");
        this.f55163a = uuid;
        this.f55164b = uVar;
        this.f55165c = set;
    }

    @C12579k
    /* renamed from: a */
    public UUID mo63857a() {
        return this.f55163a;
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public final String mo63858b() {
        String uuid = mo63857a().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        return uuid;
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: c */
    public final Set<String> mo63859c() {
        return this.f55165c;
    }

    @C12579k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public final C21249u mo63860d() {
        return this.f55164b;
    }
}
