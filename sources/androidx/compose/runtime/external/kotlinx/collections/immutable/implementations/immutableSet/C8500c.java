package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.c */
public class C8500c<E> implements Iterator<E>, C11345a {
    @C12579k

    /* renamed from: a */
    public final List<C8504f<E>> f22904a;

    /* renamed from: b */
    public int f22905b;

    /* renamed from: c */
    public boolean f22906c = true;

    public C8500c(@C12579k C8502e<E> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "node");
        List<C8504f<E>> P = CollectionsKt__CollectionsKt.m40452P(new C8504f());
        this.f22904a = P;
        C8504f.m30858i(P.get(0), eVar.mo15989n(), 0, 2, (Object) null);
        this.f22905b = 0;
        mo15950c();
    }

    /* renamed from: d */
    public static /* synthetic */ void m30804d() {
    }

    /* renamed from: h */
    private final int m30805h(int i) {
        if (this.f22904a.get(i).mo16006d()) {
            return i;
        }
        if (!this.f22904a.get(i).mo16007e()) {
            return -1;
        }
        C8502e b = this.f22904a.get(i).mo16004b();
        int i2 = i + 1;
        if (i2 == this.f22904a.size()) {
            this.f22904a.add(new C8504f());
        }
        C8504f.m30858i(this.f22904a.get(i2), b.mo15989n(), 0, 2, (Object) null);
        return m30805h(i2);
    }

    /* renamed from: b */
    public final E mo15949b() {
        C8530a.m30952a(hasNext());
        return this.f22904a.get(this.f22905b).mo16003a();
    }

    /* renamed from: c */
    public final void mo15950c() {
        if (!this.f22904a.get(this.f22905b).mo16006d()) {
            for (int i = this.f22905b; -1 < i; i--) {
                int h = m30805h(i);
                if (h == -1 && this.f22904a.get(i).mo16005c()) {
                    this.f22904a.get(i).mo16008f();
                    h = m30805h(i);
                }
                if (h != -1) {
                    this.f22905b = h;
                    return;
                }
                if (i > 0) {
                    this.f22904a.get(i - 1).mo16008f();
                }
                this.f22904a.get(i).mo16010h(C8502e.f22911d.mo16002a().mo15989n(), 0);
            }
            this.f22906c = false;
        }
    }

    @C12579k
    /* renamed from: e */
    public final List<C8504f<E>> mo15951e() {
        return this.f22904a;
    }

    /* renamed from: f */
    public final int mo15952f() {
        return this.f22905b;
    }

    public boolean hasNext() {
        return this.f22906c;
    }

    /* renamed from: j */
    public final void mo15954j(int i) {
        this.f22905b = i;
    }

    public E next() {
        if (this.f22906c) {
            E g = this.f22904a.get(this.f22905b).mo16009g();
            mo15950c();
            return g;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
