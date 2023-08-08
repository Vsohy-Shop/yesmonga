package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.e */
public final class C8529e<E> extends C8528d<E> implements Iterator<E>, C11348d {
    @C12579k

    /* renamed from: d */
    public final C8527c<E> f22967d;
    @C12580l

    /* renamed from: e */
    public E f22968e;

    /* renamed from: f */
    public boolean f22969f;

    /* renamed from: g */
    public int f22970g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8529e(@C12579k C8527c<E> cVar) {
        super(cVar.mo16100h(), cVar.mo16101i());
        Intrinsics.checkNotNullParameter(cVar, "builder");
        this.f22967d = cVar;
        this.f22970g = cVar.mo16101i().mo15821f();
    }

    /* renamed from: f */
    public final void mo16111f() {
        if (this.f22967d.mo16101i().mo15821f() != this.f22970g) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: h */
    public final void mo16112h() {
        if (!this.f22969f) {
            throw new IllegalStateException();
        }
    }

    public E next() {
        mo16111f();
        E next = super.next();
        this.f22968e = next;
        this.f22969f = true;
        return next;
    }

    public void remove() {
        mo16112h();
        C8527c<E> cVar = this.f22967d;
        C11370u0.m43685a(cVar).remove(this.f22968e);
        this.f22968e = null;
        this.f22969f = false;
        this.f22970g = this.f22967d.mo16101i().mo15821f();
        mo16107e(mo16105c() - 1);
    }
}
