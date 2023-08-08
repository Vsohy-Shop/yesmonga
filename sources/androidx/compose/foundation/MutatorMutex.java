package androidx.compose.foundation;

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

    /* renamed from: c */
    public static final int f5769c = 0;
    @C12579k

    /* renamed from: a */
    public final AtomicReference<C2096a> f5770a = new AtomicReference<>((Object) null);
    @C12579k

    /* renamed from: b */
    public final C12139a f5771b = MutexKt.m48606b(false, 1, (Object) null);

    /* renamed from: androidx.compose.foundation.MutatorMutex$a */
    public static final class C2096a {
        @C12579k

        /* renamed from: a */
        public final MutatePriority f5772a;
        @C12579k

        /* renamed from: b */
        public final C11723c2 f5773b;

        public C2096a(@C12579k MutatePriority mutatePriority, @C12579k C11723c2 c2Var) {
            Intrinsics.checkNotNullParameter(mutatePriority, "priority");
            Intrinsics.checkNotNullParameter(c2Var, "job");
            this.f5772a = mutatePriority;
            this.f5773b = c2Var;
        }

        /* renamed from: a */
        public final boolean mo7232a(@C12579k C2096a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "other");
            if (this.f5772a.compareTo(aVar.f5772a) >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void mo7233b() {
            C11723c2.C11724a.m46184b(this.f5773b, (CancellationException) null, 1, (Object) null);
        }

        @C12579k
        /* renamed from: c */
        public final C11723c2 mo7234c() {
            return this.f5773b;
        }

        @C12579k
        /* renamed from: d */
        public final MutatePriority mo7235d() {
            return this.f5772a;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ Object m9039e(MutatorMutex mutatorMutex, MutatePriority mutatePriority, C11300l lVar, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mo7229d(mutatePriority, lVar, cVar);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m9040g(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, C11304p pVar, C11045c cVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mo7230f(obj, mutatePriority, pVar, cVar);
    }

    @C12580l
    /* renamed from: d */
    public final <R> Object mo7229d(@C12579k MutatePriority mutatePriority, @C12579k C11300l<? super C11045c<? super R>, ? extends Object> lVar, @C12579k C11045c<? super R> cVar) {
        return C12079p0.m48266g(new MutatorMutex$mutate$2(mutatePriority, this, lVar, (C11045c<? super MutatorMutex$mutate$2>) null), cVar);
    }

    @C12580l
    /* renamed from: f */
    public final <T, R> Object mo7230f(T t, @C12579k MutatePriority mutatePriority, @C12579k C11304p<? super T, ? super C11045c<? super R>, ? extends Object> pVar, @C12579k C11045c<? super R> cVar) {
        return C12079p0.m48266g(new MutatorMutex$mutateWith$2(mutatePriority, this, pVar, t, (C11045c<? super MutatorMutex$mutateWith$2>) null), cVar);
    }

    /* renamed from: h */
    public final void mo7231h(C2096a aVar) {
        C2096a aVar2;
        do {
            aVar2 = this.f5770a.get();
            if (aVar2 != null && !aVar.mo7232a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!C1814q.m7242a(this.f5770a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.mo7233b();
        }
    }
}
