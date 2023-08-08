package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.sequences.i */
public final class C11551i<T, R, E> implements C11559m<E> {
    @C12579k

    /* renamed from: a */
    public final C11559m<T> f28717a;
    @C12579k

    /* renamed from: b */
    public final C11300l<T, R> f28718b;
    @C12579k

    /* renamed from: c */
    public final C11300l<R, Iterator<E>> f28719c;

    /* renamed from: kotlin.sequences.i$a */
    public static final class C11552a implements Iterator<E>, C11345a {
        @C12579k

        /* renamed from: a */
        public final Iterator<T> f28720a;
        @C12580l

        /* renamed from: b */
        public Iterator<? extends E> f28721b;

        /* renamed from: c */
        public final /* synthetic */ C11551i<T, R, E> f28722c;

        public C11552a(C11551i<T, R, E> iVar) {
            this.f28722c = iVar;
            this.f28720a = iVar.f28717a.iterator();
        }

        /* renamed from: b */
        public final boolean mo23223b() {
            boolean z;
            Iterator<? extends E> it = this.f28721b;
            if (it == null || it.hasNext()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f28721b = null;
            }
            while (true) {
                if (this.f28721b == null) {
                    if (this.f28720a.hasNext()) {
                        Iterator<? extends E> it2 = (Iterator) this.f28722c.f28719c.invoke(this.f28722c.f28718b.invoke(this.f28720a.next()));
                        if (it2.hasNext()) {
                            this.f28721b = it2;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        @C12580l
        /* renamed from: c */
        public final Iterator<E> mo23224c() {
            return this.f28721b;
        }

        @C12579k
        /* renamed from: d */
        public final Iterator<T> mo23225d() {
            return this.f28720a;
        }

        /* renamed from: e */
        public final void mo23226e(@C12580l Iterator<? extends E> it) {
            this.f28721b = it;
        }

        public boolean hasNext() {
            return mo23223b();
        }

        public E next() {
            if (mo23223b()) {
                Iterator<? extends E> it = this.f28721b;
                Intrinsics.checkNotNull(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11551i(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends R> lVar, @C12579k C11300l<? super R, ? extends Iterator<? extends E>> lVar2) {
        Intrinsics.checkNotNullParameter(mVar, "sequence");
        Intrinsics.checkNotNullParameter(lVar, "transformer");
        Intrinsics.checkNotNullParameter(lVar2, "iterator");
        this.f28717a = mVar;
        this.f28718b = lVar;
        this.f28719c = lVar2;
    }

    @C12579k
    public Iterator<E> iterator() {
        return new C11552a(this);
    }
}
