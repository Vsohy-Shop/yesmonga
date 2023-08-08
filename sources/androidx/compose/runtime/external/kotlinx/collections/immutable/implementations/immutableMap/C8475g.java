package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.g */
public class C8475g<K, V, T> extends C8473e<K, V, T> implements Iterator<T>, C11348d {
    @C12579k

    /* renamed from: d */
    public final C8474f<K, V> f22861d;
    @C12580l

    /* renamed from: e */
    public K f22862e;

    /* renamed from: f */
    public boolean f22863f;

    /* renamed from: g */
    public int f22864g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8475g(@C12579k C8474f<K, V> fVar, @C12579k C8492v<K, V, T>[] vVarArr) {
        super(fVar.mo15823h(), vVarArr);
        Intrinsics.checkNotNullParameter(fVar, "builder");
        Intrinsics.checkNotNullParameter(vVarArr, "path");
        this.f22861d = fVar;
        this.f22864g = fVar.mo15821f();
    }

    /* renamed from: m */
    public final void mo15834m() {
        if (this.f22861d.mo15821f() != this.f22864g) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: n */
    public final void mo15835n() {
        if (!this.f22863f) {
            throw new IllegalStateException();
        }
    }

    public T next() {
        mo15834m();
        this.f22862e = mo15805c();
        this.f22863f = true;
        return super.next();
    }

    /* renamed from: o */
    public final void mo15836o(int i, C8489u<?, ?> uVar, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            mo15807f()[i2].mo15925n(uVar.mo15902s(), uVar.mo15902s().length, 0);
            while (!Intrinsics.areEqual(mo15807f()[i2].mo15915b(), (Object) k)) {
                mo15807f()[i2].mo15922j();
            }
            mo15811l(i2);
            return;
        }
        int f = 1 << C8495y.m30775f(i, i3);
        if (uVar.mo15903t(f)) {
            mo15807f()[i2].mo15925n(uVar.mo15902s(), uVar.mo15899p() * 2, uVar.mo15900q(f));
            mo15811l(i2);
            return;
        }
        int R = uVar.mo15875R(f);
        C8489u<?, ?> Q = uVar.mo15874Q(R);
        mo15807f()[i2].mo15925n(uVar.mo15902s(), uVar.mo15899p() * 2, R);
        mo15836o(i, Q, k, i2 + 1);
    }

    /* renamed from: p */
    public final void mo15837p(K k, V v) {
        int i;
        if (this.f22861d.containsKey(k)) {
            if (hasNext()) {
                Object c = mo15805c();
                this.f22861d.put(k, v);
                if (c != null) {
                    i = c.hashCode();
                } else {
                    i = 0;
                }
                mo15836o(i, this.f22861d.mo15823h(), c, 0);
            } else {
                this.f22861d.put(k, v);
            }
            this.f22864g = this.f22861d.mo15821f();
        }
    }

    public void remove() {
        int i;
        mo15835n();
        if (hasNext()) {
            Object c = mo15805c();
            C11370u0.m43695k(this.f22861d).remove(this.f22862e);
            if (c != null) {
                i = c.hashCode();
            } else {
                i = 0;
            }
            mo15836o(i, this.f22861d.mo15823h(), c, 0);
        } else {
            C11370u0.m43695k(this.f22861d).remove(this.f22862e);
        }
        this.f22862e = null;
        this.f22863f = false;
        this.f22864g = this.f22861d.mo15821f();
    }
}
