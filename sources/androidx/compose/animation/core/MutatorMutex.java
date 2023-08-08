package androidx.compose.animation.core;

import androidx.camera.view.C1814q;
import androidx.compose.runtime.C8547h2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.sync.C12139a;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
public final class MutatorMutex {
    @C12579k

    /* renamed from: a */
    public final AtomicReference<C1923a> f5328a = new AtomicReference<>((Object) null);
    @C12579k

    /* renamed from: b */
    public final C12139a f5329b = MutexKt.m48606b(false, 1, (Object) null);

    /* renamed from: androidx.compose.animation.core.MutatorMutex$a */
    public static final class C1923a {
        @C12579k

        /* renamed from: a */
        public final MutatePriority f5330a;
        @C12579k

        /* renamed from: b */
        public final C11723c2 f5331b;

        public C1923a(@C12579k MutatePriority mutatePriority, @C12579k C11723c2 c2Var) {
            Intrinsics.checkNotNullParameter(mutatePriority, "priority");
            Intrinsics.checkNotNullParameter(c2Var, "job");
            this.f5330a = mutatePriority;
            this.f5331b = c2Var;
        }

        /* renamed from: a */
        public final boolean mo6666a(@C12579k C1923a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "other");
            if (this.f5330a.compareTo(aVar.f5330a) >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void mo6667b() {
            C11723c2.C11724a.m46184b(this.f5331b, (CancellationException) null, 1, (Object) null);
        }

        @C12579k
        /* renamed from: c */
        public final C11723c2 mo6668c() {
            return this.f5331b;
        }

        @C12579k
        /* renamed from: d */
        public final MutatePriority mo6669d() {
            return this.f5330a;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ Object m8048e(MutatorMutex mutatorMutex, MutatePriority mutatePriority, C11300l lVar, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mo6663d(mutatePriority, lVar, cVar);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m8049g(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, C11304p pVar, C11045c cVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mo6664f(obj, mutatePriority, pVar, cVar);
    }

    @C12580l
    /* renamed from: d */
    public final <R> Object mo6663d(@C12579k MutatePriority mutatePriority, @C12579k C11300l<? super C11045c<? super R>, ? extends Object> lVar, @C12579k C11045c<? super R> cVar) {
        return C12079p0.m48266g(new MutatorMutex$mutate$2(mutatePriority, this, lVar, (C11045c<? super MutatorMutex$mutate$2>) null), cVar);
    }

    @C12580l
    /* renamed from: f */
    public final <T, R> Object mo6664f(T t, @C12579k MutatePriority mutatePriority, @C12579k C11304p<? super T, ? super C11045c<? super R>, ? extends Object> pVar, @C12579k C11045c<? super R> cVar) {
        return C12079p0.m48266g(new MutatorMutex$mutateWith$2(mutatePriority, this, pVar, t, (C11045c<? super MutatorMutex$mutateWith$2>) null), cVar);
    }

    /* renamed from: h */
    public final void mo6665h(C1923a aVar) {
        C1923a aVar2;
        do {
            aVar2 = this.f5328a.get();
            if (aVar2 != null && !aVar.mo6666a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!C1814q.m7242a(this.f5328a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.mo6667b();
        }
    }
}
