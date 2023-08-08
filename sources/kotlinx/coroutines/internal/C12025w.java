package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C16563a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.internal.w */
public class C12025w<E> {
    @C12579k

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f29636a = AtomicReferenceFieldUpdater.newUpdater(C12025w.class, Object.class, "_cur");
    @C11394v
    @C12580l
    private volatile Object _cur;

    public C12025w(boolean z) {
        this._cur = new C12027x(8, z);
    }

    /* renamed from: a */
    public final boolean mo24415a(@C12579k E e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29636a;
        while (true) {
            C12027x xVar = (C12027x) atomicReferenceFieldUpdater.get(this);
            int a = xVar.mo24423a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                C16563a.m75000a(f29636a, this, xVar, xVar.mo24435m());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo24416b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29636a;
        while (true) {
            C12027x xVar = (C12027x) atomicReferenceFieldUpdater.get(this);
            if (!xVar.mo24426d()) {
                C16563a.m75000a(f29636a, this, xVar, xVar.mo24435m());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo24417c() {
        return ((C12027x) f29636a.get(this)).mo24428f();
    }

    /* renamed from: d */
    public final boolean mo24418d() {
        return ((C12027x) f29636a.get(this)).mo24429g();
    }

    /* renamed from: e */
    public final boolean mo24419e() {
        return ((C12027x) f29636a.get(this)).mo24430h();
    }

    /* renamed from: f */
    public final void mo24420f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11300l<Object, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @C12579k
    /* renamed from: g */
    public final <R> List<R> mo24421g(@C12579k C11300l<? super E, ? extends R> lVar) {
        return ((C12027x) f29636a.get(this)).mo24433k(lVar);
    }

    @C12580l
    /* renamed from: h */
    public final E mo24422h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29636a;
        while (true) {
            C12027x xVar = (C12027x) atomicReferenceFieldUpdater.get(this);
            E n = xVar.mo24436n();
            if (n != C12027x.f29652t) {
                return n;
            }
            C16563a.m75000a(f29636a, this, xVar, xVar.mo24435m());
        }
    }
}
