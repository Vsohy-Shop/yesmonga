package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.C8541g0;
import androidx.compose.runtime.C8595o0;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2191:1\n1686#2:2192\n1686#2:2194\n70#3:2193\n70#3:2195\n1#4:2196\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n84#1:2192\n233#1:2194\n84#1:2193\n233#1:2195\n*E\n"})
/* renamed from: androidx.compose.runtime.snapshots.f */
public abstract class C8646f {
    @C12579k

    /* renamed from: e */
    public static final C8647a f23196e = new C8647a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f23197f = 8;
    @C12579k

    /* renamed from: a */
    public SnapshotIdSet f23198a;

    /* renamed from: b */
    public int f23199b;

    /* renamed from: c */
    public boolean f23200c;

    /* renamed from: d */
    public int f23201d;

    @C11363r0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1#2:2192\n122#3,5:2193\n122#3,5:2198\n122#3,5:2203\n1686#4:2208\n1686#4:2210\n1686#4:2212\n70#5:2209\n70#5:2211\n70#5:2213\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n424#1:2193,5\n461#1:2198,5\n483#1:2203,5\n499#1:2208\n526#1:2210\n564#1:2212\n499#1:2209\n526#1:2211\n564#1:2213\n*E\n"})
    /* renamed from: androidx.compose.runtime.snapshots.f$a */
    public static final class C8647a {

        @C11363r0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion$registerApplyObserver$2\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion$registerApplyObserver$2\n*L\n503#1:2192\n503#1:2193\n*E\n"})
        /* renamed from: androidx.compose.runtime.snapshots.f$a$a */
        public static final class C8648a implements C8642d {

            /* renamed from: a */
            public final /* synthetic */ C11304p<Set<? extends Object>, C8646f, C11079d2> f23202a;

            public C8648a(C11304p<? super Set<? extends Object>, ? super C8646f, C11079d2> pVar) {
                this.f23202a = pVar;
            }

            /* renamed from: g */
            public final void mo16593g() {
                C11304p<Set<? extends Object>, C8646f, C11079d2> pVar = this.f23202a;
                synchronized (SnapshotKt.m31447E()) {
                    SnapshotKt.f23132h.remove(pVar);
                    C11079d2 d2Var = C11079d2.f28267a;
                }
            }
        }

        @C11363r0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion$registerGlobalWriteObserver$2\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2191:1\n1686#2:2192\n70#3:2193\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion$registerGlobalWriteObserver$2\n*L\n531#1:2192\n531#1:2193\n*E\n"})
        /* renamed from: androidx.compose.runtime.snapshots.f$a$b */
        public static final class C8649b implements C8642d {

            /* renamed from: a */
            public final /* synthetic */ C11300l<Object, C11079d2> f23203a;

            public C8649b(C11300l<Object, C11079d2> lVar) {
                this.f23203a = lVar;
            }

            /* renamed from: g */
            public final void mo16593g() {
                C11300l<Object, C11079d2> lVar = this.f23203a;
                synchronized (SnapshotKt.m31447E()) {
                    SnapshotKt.f23133i.remove(lVar);
                }
                SnapshotKt.m31504y();
            }
        }

        public /* synthetic */ C8647a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: f */
        public static /* synthetic */ Object m31747f(C8647a aVar, C11300l lVar, C11300l lVar2, C11289a aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                lVar = null;
            }
            if ((i & 2) != 0) {
                lVar2 = null;
            }
            return aVar.mo16625e(lVar, lVar2, aVar2);
        }

        /* renamed from: n */
        public static /* synthetic */ C8637b m31748n(C8647a aVar, C11300l lVar, C11300l lVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                lVar = null;
            }
            if ((i & 2) != 0) {
                lVar2 = null;
            }
            return aVar.mo16632m(lVar, lVar2);
        }

        /* renamed from: p */
        public static /* synthetic */ C8646f m31749p(C8647a aVar, C11300l lVar, int i, Object obj) {
            if ((i & 1) != 0) {
                lVar = null;
            }
            return aVar.mo16633o(lVar);
        }

        @C12579k
        @C11532s0
        /* renamed from: a */
        public final C8646f mo16621a() {
            return SnapshotKt.m31443A((C8646f) SnapshotKt.f23127c.mo16131a(), (C11300l) null, false, 6, (Object) null);
        }

        @C12579k
        /* renamed from: b */
        public final C8646f mo16622b() {
            return SnapshotKt.m31446D();
        }

        /* renamed from: c */
        public final <T> T mo16623c(@C12579k C11289a<? extends T> aVar) {
            Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
            C8646f j = mo16629j();
            T invoke = aVar.invoke();
            C8646f.f23196e.mo16630k(j);
            return invoke;
        }

        /* renamed from: d */
        public final void mo16624d() {
            SnapshotKt.m31446D().mo16418s();
        }

        /* renamed from: e */
        public final <T> T mo16625e(@C12580l C11300l<Object, C11079d2> lVar, @C12580l C11300l<Object, C11079d2> lVar2, @C12579k C11289a<? extends T> aVar) {
            C8646f fVar;
            C8646f p;
            C8637b bVar;
            Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
            if (lVar == null && lVar2 == null) {
                return aVar.invoke();
            }
            C8646f fVar2 = (C8646f) SnapshotKt.f23127c.mo16131a();
            if (fVar2 == null || (fVar2 instanceof C8637b)) {
                if (fVar2 instanceof C8637b) {
                    bVar = (C8637b) fVar2;
                } else {
                    bVar = null;
                }
                fVar = new C8643d0(bVar, lVar, lVar2, true, false);
            } else if (lVar == null) {
                return aVar.invoke();
            } else {
                fVar = fVar2.mo16410A(lVar);
            }
            try {
                p = fVar.mo16617p();
                T invoke = aVar.invoke();
                fVar.mo16619w(p);
                fVar.mo16415d();
                return invoke;
            } catch (Throwable th) {
                fVar.mo16415d();
                throw th;
            }
        }

        @C8595o0
        /* renamed from: g */
        public final int mo16626g() {
            return CollectionsKt___CollectionsKt.m40557Q5(SnapshotKt.f23129e).size();
        }

        @C12579k
        /* renamed from: h */
        public final C8642d mo16627h(@C12579k C11304p<? super Set<? extends Object>, ? super C8646f, C11079d2> pVar) {
            Intrinsics.checkNotNullParameter(pVar, "observer");
            Object unused = SnapshotKt.m31503x(SnapshotKt.f23125a);
            synchronized (SnapshotKt.m31447E()) {
                SnapshotKt.f23132h.add(pVar);
            }
            return new C8648a(pVar);
        }

        @C12579k
        /* renamed from: i */
        public final C8642d mo16628i(@C12579k C11300l<Object, C11079d2> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "observer");
            synchronized (SnapshotKt.m31447E()) {
                SnapshotKt.f23133i.add(lVar);
            }
            SnapshotKt.m31504y();
            return new C8649b(lVar);
        }

        @C12580l
        @C11532s0
        /* renamed from: j */
        public final C8646f mo16629j() {
            C8646f fVar = (C8646f) SnapshotKt.f23127c.mo16131a();
            if (fVar != null) {
                SnapshotKt.f23127c.mo16132b(null);
            }
            return fVar;
        }

        @C11532s0
        /* renamed from: k */
        public final void mo16630k(@C12580l C8646f fVar) {
            if (fVar != null) {
                SnapshotKt.f23127c.mo16132b(fVar);
            }
        }

        /* renamed from: l */
        public final void mo16631l() {
            boolean z;
            synchronized (SnapshotKt.m31447E()) {
                Set<C8635a0> i = ((GlobalSnapshot) SnapshotKt.f23134j.get()).mo16428i();
                z = false;
                if (i != null && (!i.isEmpty())) {
                    z = true;
                }
            }
            if (z) {
                SnapshotKt.m31504y();
            }
        }

        @C12579k
        /* renamed from: m */
        public final C8637b mo16632m(@C12580l C11300l<Object, C11079d2> lVar, @C12580l C11300l<Object, C11079d2> lVar2) {
            C8637b bVar;
            C8637b X;
            C8646f D = SnapshotKt.m31446D();
            if (D instanceof C8637b) {
                bVar = (C8637b) D;
            } else {
                bVar = null;
            }
            if (bVar != null && (X = bVar.mo16412X(lVar, lVar2)) != null) {
                return X;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }

        @C12579k
        /* renamed from: o */
        public final C8646f mo16633o(@C12580l C11300l<Object, C11079d2> lVar) {
            return SnapshotKt.m31446D().mo16410A(lVar);
        }

        /* renamed from: q */
        public final <R> R mo16634q(@C12579k C11289a<? extends R> aVar) {
            C8646f p;
            Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
            C8637b n = m31748n(this, (C11300l) null, (C11300l) null, 3, (Object) null);
            try {
                p = n.mo16617p();
                R invoke = aVar.invoke();
                C11322b0.m43481d(1);
                n.mo16619w(p);
                C11322b0.m43480c(1);
                n.mo16411J().mo16636a();
                C11322b0.m43481d(1);
                n.mo16415d();
                C11322b0.m43480c(1);
                return invoke;
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                n.mo16415d();
                C11322b0.m43480c(1);
                throw th;
            }
        }

        /* renamed from: r */
        public final <T> T mo16635r(@C12579k C11289a<? extends T> aVar) {
            C8646f p;
            Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
            C8646f a = mo16621a();
            try {
                p = a.mo16617p();
                T invoke = aVar.invoke();
                C11322b0.m43481d(1);
                a.mo16619w(p);
                C11322b0.m43480c(1);
                C11322b0.m43481d(1);
                a.mo16415d();
                C11322b0.m43480c(1);
                return invoke;
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                a.mo16415d();
                C11322b0.m43480c(1);
                throw th;
            }
        }

        public C8647a() {
        }
    }

    public /* synthetic */ C8646f(int i, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, snapshotIdSet);
    }

    /* renamed from: B */
    public static /* synthetic */ C8646f m31715B(C8646f fVar, C11300l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                lVar = null;
            }
            return fVar.mo16410A(lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
    }

    @C12579k
    /* renamed from: A */
    public abstract C8646f mo16410A(@C12580l C11300l<Object, C11079d2> lVar);

    /* renamed from: C */
    public final int mo16609C() {
        int i = this.f23201d;
        this.f23201d = -1;
        return i;
    }

    @C8541g0
    @C12580l
    /* renamed from: D */
    public final C8646f mo16610D() {
        return mo16617p();
    }

    @C8541g0
    /* renamed from: E */
    public final void mo16611E(@C12580l C8646f fVar) {
        boolean z;
        if (SnapshotKt.f23127c.mo16131a() == this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo16619w(fVar);
            return;
        }
        throw new IllegalStateException(("Cannot leave snapshot; " + this + " is not the current snapshot").toString());
    }

    /* renamed from: F */
    public final void mo16612F() {
        if (!(!this.f23200c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }

    /* renamed from: b */
    public final void mo16613b() {
        synchronized (SnapshotKt.m31447E()) {
            mo16546c();
            mo16547v();
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: c */
    public void mo16546c() {
        SnapshotKt.f23129e = SnapshotKt.f23129e.mo16437H(mo16599g());
    }

    /* renamed from: d */
    public void mo16415d() {
        this.f23200c = true;
        synchronized (SnapshotKt.m31447E()) {
            mo16618u();
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: e */
    public final <T> T mo16614e(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        C8646f p = mo16617p();
        try {
            return aVar.invoke();
        } finally {
            C11322b0.m43481d(1);
            mo16619w(p);
            C11322b0.m43480c(1);
        }
    }

    /* renamed from: f */
    public final boolean mo16615f() {
        return this.f23200c;
    }

    /* renamed from: g */
    public int mo16599g() {
        return this.f23199b;
    }

    @C12579k
    /* renamed from: h */
    public SnapshotIdSet mo16600h() {
        return this.f23198a;
    }

    @C12580l
    /* renamed from: i */
    public abstract Set<C8635a0> mo16428i();

    @C12580l
    /* renamed from: j */
    public abstract C11300l<Object, C11079d2> mo16429j();

    /* renamed from: k */
    public abstract boolean mo16430k();

    @C12579k
    /* renamed from: l */
    public abstract C8646f mo16431l();

    @C12580l
    /* renamed from: m */
    public abstract C11300l<Object, C11079d2> mo16432m();

    /* renamed from: n */
    public abstract boolean mo16433n();

    /* renamed from: o */
    public final boolean mo16616o() {
        return this.f23201d >= 0;
    }

    @C12580l
    @C11532s0
    /* renamed from: p */
    public C8646f mo16617p() {
        C8646f fVar = (C8646f) SnapshotKt.f23127c.mo16131a();
        SnapshotKt.f23127c.mo16132b(this);
        return fVar;
    }

    /* renamed from: q */
    public abstract void mo16416q(@C12579k C8646f fVar);

    /* renamed from: r */
    public abstract void mo16417r(@C12579k C8646f fVar);

    /* renamed from: s */
    public abstract void mo16418s();

    /* renamed from: t */
    public abstract void mo16434t(@C12579k C8635a0 a0Var);

    /* renamed from: u */
    public final void mo16618u() {
        int i = this.f23201d;
        if (i >= 0) {
            SnapshotKt.m31466X(i);
            this.f23201d = -1;
        }
    }

    /* renamed from: v */
    public void mo16547v() {
        mo16618u();
    }

    @C11532s0
    /* renamed from: w */
    public void mo16619w(@C12580l C8646f fVar) {
        SnapshotKt.f23127c.mo16132b(fVar);
    }

    /* renamed from: x */
    public final void mo16620x(boolean z) {
        this.f23200c = z;
    }

    /* renamed from: y */
    public void mo16601y(int i) {
        this.f23199b = i;
    }

    /* renamed from: z */
    public void mo16602z(@C12579k SnapshotIdSet snapshotIdSet) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "<set-?>");
        this.f23198a = snapshotIdSet;
    }

    public C8646f(int i, SnapshotIdSet snapshotIdSet) {
        this.f23198a = snapshotIdSet;
        this.f23199b = i;
        this.f23201d = i != 0 ? SnapshotKt.m31474c0(i, mo16600h()) : -1;
    }
}
