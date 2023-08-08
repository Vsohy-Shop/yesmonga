package androidx.compose.material3;

import androidx.camera.view.C1814q;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.C8547h2;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
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
public final class InternalMutatorMutex {
    @C12579k

    /* renamed from: a */
    public final AtomicReference<C8036a> f19452a = new AtomicReference<>((Object) null);
    @C12579k

    /* renamed from: b */
    public final C12139a f19453b = MutexKt.m48606b(false, 1, (Object) null);

    /* renamed from: androidx.compose.material3.InternalMutatorMutex$a */
    public static final class C8036a {
        @C12579k

        /* renamed from: a */
        public final MutatePriority f19454a;
        @C12579k

        /* renamed from: b */
        public final C11723c2 f19455b;

        public C8036a(@C12579k MutatePriority mutatePriority, @C12579k C11723c2 c2Var) {
            Intrinsics.checkNotNullParameter(mutatePriority, "priority");
            Intrinsics.checkNotNullParameter(c2Var, "job");
            this.f19454a = mutatePriority;
            this.f19455b = c2Var;
        }

        /* renamed from: a */
        public final boolean mo11620a(@C12579k C8036a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "other");
            if (this.f19454a.compareTo(aVar.f19454a) >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void mo11621b() {
            C11723c2.C11724a.m46184b(this.f19455b, (CancellationException) null, 1, (Object) null);
        }

        @C12579k
        /* renamed from: c */
        public final C11723c2 mo11622c() {
            return this.f19455b;
        }

        @C12579k
        /* renamed from: d */
        public final MutatePriority mo11623d() {
            return this.f19454a;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ Object m25840e(InternalMutatorMutex internalMutatorMutex, MutatePriority mutatePriority, C11300l lVar, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mo11616d(mutatePriority, lVar, cVar);
    }

    /* renamed from: g */
    public static /* synthetic */ Object m25841g(InternalMutatorMutex internalMutatorMutex, Object obj, MutatePriority mutatePriority, C11304p pVar, C11045c cVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return internalMutatorMutex.mo11617f(obj, mutatePriority, pVar, cVar);
    }

    @C12580l
    /* renamed from: d */
    public final <R> Object mo11616d(@C12579k MutatePriority mutatePriority, @C12579k C11300l<? super C11045c<? super R>, ? extends Object> lVar, @C12579k C11045c<? super R> cVar) {
        return C12079p0.m48266g(new InternalMutatorMutex$mutate$2(mutatePriority, this, lVar, (C11045c<? super InternalMutatorMutex$mutate$2>) null), cVar);
    }

    @C12580l
    /* renamed from: f */
    public final <T, R> Object mo11617f(T t, @C12579k MutatePriority mutatePriority, @C12579k C11304p<? super T, ? super C11045c<? super R>, ? extends Object> pVar, @C12579k C11045c<? super R> cVar) {
        return C12079p0.m48266g(new InternalMutatorMutex$mutateWith$2(mutatePriority, this, pVar, t, (C11045c<? super InternalMutatorMutex$mutateWith$2>) null), cVar);
    }

    /* renamed from: h */
    public final boolean mo11618h(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        boolean c = C12139a.C12140a.m48649c(this.f19453b, (Object) null, 1, (Object) null);
        if (c) {
            try {
                aVar.invoke();
            } finally {
                C12139a.C12140a.m48650d(this.f19453b, (Object) null, 1, (Object) null);
            }
        }
        return c;
    }

    /* renamed from: i */
    public final void mo11619i(C8036a aVar) {
        C8036a aVar2;
        do {
            aVar2 = this.f19452a.get();
            if (aVar2 != null && !aVar.mo11620a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!C1814q.m7242a(this.f19452a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.mo11621b();
        }
    }
}
