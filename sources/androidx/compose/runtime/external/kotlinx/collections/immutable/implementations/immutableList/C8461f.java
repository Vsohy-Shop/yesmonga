package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11350f;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.f */
public final class C8461f<T> extends C8456a<T> implements ListIterator<T>, C11350f {
    @C12579k

    /* renamed from: c */
    public final PersistentVectorBuilder<T> f22829c;

    /* renamed from: d */
    public int f22830d;
    @C12580l

    /* renamed from: e */
    public C8465i<? extends T> f22831e;

    /* renamed from: f */
    public int f22832f = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8461f(@C12579k PersistentVectorBuilder<T> persistentVectorBuilder, int i) {
        super(i, persistentVectorBuilder.size());
        Intrinsics.checkNotNullParameter(persistentVectorBuilder, "builder");
        this.f22829c = persistentVectorBuilder;
        this.f22830d = persistentVectorBuilder.mo15714r();
        mo15762n();
    }

    public void add(T t) {
        mo15759j();
        this.f22829c.add(mo15731d(), t);
        mo15733f(mo15731d() + 1);
        mo15761m();
    }

    /* renamed from: j */
    public final void mo15759j() {
        if (this.f22830d != this.f22829c.mo15714r()) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: l */
    public final void mo15760l() {
        if (this.f22832f == -1) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: m */
    public final void mo15761m() {
        mo15734h(this.f22829c.size());
        this.f22830d = this.f22829c.mo15714r();
        this.f22832f = -1;
        mo15762n();
    }

    /* renamed from: n */
    public final void mo15762n() {
        Object[] w = this.f22829c.mo15722w();
        if (w == null) {
            this.f22831e = null;
            return;
        }
        int d = C8466j.m30639d(this.f22829c.size());
        int B = C11479u.m44313B(mo15731d(), d);
        int y = (this.f22829c.mo15724y() / 5) + 1;
        C8465i<? extends T> iVar = this.f22831e;
        if (iVar == null) {
            this.f22831e = new C8465i<>(w, B, d, y);
            return;
        }
        Intrinsics.checkNotNull(iVar);
        iVar.mo15772n(w, B, d, y);
    }

    public T next() {
        mo15759j();
        mo15729b();
        this.f22832f = mo15731d();
        C8465i<? extends T> iVar = this.f22831e;
        if (iVar == null) {
            T[] H = this.f22829c.mo15683H();
            int d = mo15731d();
            mo15733f(d + 1);
            return H[d];
        } else if (iVar.hasNext()) {
            mo15733f(mo15731d() + 1);
            return iVar.next();
        } else {
            T[] H2 = this.f22829c.mo15683H();
            int d2 = mo15731d();
            mo15733f(d2 + 1);
            return H2[d2 - iVar.mo15732e()];
        }
    }

    public T previous() {
        mo15759j();
        mo15730c();
        this.f22832f = mo15731d() - 1;
        C8465i<? extends T> iVar = this.f22831e;
        if (iVar == null) {
            T[] H = this.f22829c.mo15683H();
            mo15733f(mo15731d() - 1);
            return H[mo15731d()];
        } else if (mo15731d() > iVar.mo15732e()) {
            T[] H2 = this.f22829c.mo15683H();
            mo15733f(mo15731d() - 1);
            return H2[mo15731d() - iVar.mo15732e()];
        } else {
            mo15733f(mo15731d() - 1);
            return iVar.previous();
        }
    }

    public void remove() {
        mo15759j();
        mo15760l();
        this.f22829c.remove(this.f22832f);
        if (this.f22832f < mo15731d()) {
            mo15733f(this.f22832f);
        }
        mo15761m();
    }

    public void set(T t) {
        mo15759j();
        mo15760l();
        this.f22829c.set(this.f22832f, t);
        this.f22830d = this.f22829c.mo15714r();
        mo15762n();
    }
}
