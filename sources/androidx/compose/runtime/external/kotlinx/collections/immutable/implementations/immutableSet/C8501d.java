package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.d */
public final class C8501d<E> extends C8500c<E> implements Iterator<E>, C11348d {
    @C12579k

    /* renamed from: d */
    public final C8499b<E> f22907d;
    @C12580l

    /* renamed from: e */
    public E f22908e;

    /* renamed from: f */
    public boolean f22909f;

    /* renamed from: g */
    public int f22910g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8501d(@C12579k C8499b<E> bVar) {
        super(bVar.mo15943q());
        Intrinsics.checkNotNullParameter(bVar, "builder");
        this.f22907d = bVar;
        this.f22910g = bVar.mo15941i();
    }

    /* renamed from: l */
    public final void mo15957l() {
        if (this.f22907d.mo15941i() != this.f22910g) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: m */
    public final void mo15958m() {
        if (!this.f22909f) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: n */
    public final boolean mo15959n(C8502e<?> eVar) {
        return eVar.mo15988m() == 0;
    }

    public E next() {
        mo15957l();
        E next = super.next();
        this.f22908e = next;
        this.f22909f = true;
        return next;
    }

    /* renamed from: o */
    public final void mo15960o(int i, C8502e<?> eVar, E e, int i2) {
        boolean z = true;
        if (mo15959n(eVar)) {
            int jg = ArraysKt___ArraysKt.m39905jg(eVar.mo15989n(), e);
            if (jg == -1) {
                z = false;
            }
            C8530a.m30952a(z);
            ((C8504f) mo15951e().get(i2)).mo16010h(eVar.mo15989n(), jg);
            mo15954j(i2);
            return;
        }
        int q = eVar.mo15992q(1 << TrieNodeKt.m30787f(i, i2 * 5));
        ((C8504f) mo15951e().get(i2)).mo16010h(eVar.mo15989n(), q);
        Object obj = eVar.mo15989n()[q];
        if (obj instanceof C8502e) {
            mo15960o(i, (C8502e) obj, e, i2 + 1);
        } else {
            mo15954j(i2);
        }
    }

    public void remove() {
        int i;
        mo15958m();
        if (hasNext()) {
            Object b = mo15949b();
            C11370u0.m43685a(this.f22907d).remove(this.f22908e);
            if (b != null) {
                i = b.hashCode();
            } else {
                i = 0;
            }
            mo15960o(i, this.f22907d.mo15943q(), b, 0);
        } else {
            C11370u0.m43685a(this.f22907d).remove(this.f22908e);
        }
        this.f22908e = null;
        this.f22909f = false;
        this.f22910g = this.f22907d.mo15941i();
    }
}
