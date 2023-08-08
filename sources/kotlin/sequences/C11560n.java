package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.sequences.n */
public final class C11560n<T> extends C11561o<T> implements Iterator<T>, C11045c<C11079d2>, C11345a {

    /* renamed from: a */
    public int f28737a;
    @C12580l

    /* renamed from: b */
    public T f28738b;
    @C12580l

    /* renamed from: c */
    public Iterator<? extends T> f28739c;
    @C12580l

    /* renamed from: d */
    public C11045c<? super C11079d2> f28740d;

    @C12580l
    /* renamed from: b */
    public Object mo23250b(T t, @C12579k C11045c<? super C11079d2> cVar) {
        this.f28738b = t;
        this.f28737a = 3;
        this.f28740d = cVar;
        Object h = C11063b.m42612h();
        if (h == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (h == C11063b.m42612h()) {
            return h;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: f */
    public Object mo23251f(@C12579k Iterator<? extends T> it, @C12579k C11045c<? super C11079d2> cVar) {
        if (!it.hasNext()) {
            return C11079d2.f28267a;
        }
        this.f28739c = it;
        this.f28737a = 2;
        this.f28740d = cVar;
        Object h = C11063b.m42612h();
        if (h == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (h == C11063b.m42612h()) {
            return h;
        }
        return C11079d2.f28267a;
    }

    @C12579k
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.f28243a;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.f28737a;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f28739c;
                    Intrinsics.checkNotNull(it);
                    if (it.hasNext()) {
                        this.f28737a = 2;
                        return true;
                    }
                    this.f28739c = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw mo23253l();
                }
            }
            this.f28737a = 5;
            C11045c<? super C11079d2> cVar = this.f28740d;
            Intrinsics.checkNotNull(cVar);
            this.f28740d = null;
            Result.C10852a aVar = Result.f28060a;
            cVar.resumeWith(Result.m38702b(C11079d2.f28267a));
        }
    }

    /* renamed from: l */
    public final Throwable mo23253l() {
        int i = this.f28737a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f28737a);
    }

    @C12580l
    /* renamed from: m */
    public final C11045c<C11079d2> mo23254m() {
        return this.f28740d;
    }

    /* renamed from: n */
    public final T mo23255n() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public T next() {
        int i = this.f28737a;
        if (i == 0 || i == 1) {
            return mo23255n();
        }
        if (i == 2) {
            this.f28737a = 1;
            Iterator<? extends T> it = this.f28739c;
            Intrinsics.checkNotNull(it);
            return it.next();
        } else if (i == 3) {
            this.f28737a = 0;
            T t = this.f28738b;
            this.f28738b = null;
            return t;
        } else {
            throw mo23253l();
        }
    }

    /* renamed from: o */
    public final void mo23257o(@C12580l C11045c<? super C11079d2> cVar) {
        this.f28740d = cVar;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(@C12579k Object obj) {
        C11661u0.m45747n(obj);
        this.f28737a = 4;
    }
}
