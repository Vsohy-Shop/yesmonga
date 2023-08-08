package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.e */
public abstract class C8473e<K, V, T> implements Iterator<T>, C11345a {
    @C12579k

    /* renamed from: a */
    public final C8492v<K, V, T>[] f22852a;

    /* renamed from: b */
    public int f22853b;

    /* renamed from: c */
    public boolean f22854c = true;

    public C8473e(@C12579k C8489u<K, V> uVar, @C12579k C8492v<K, V, T>[] vVarArr) {
        Intrinsics.checkNotNullParameter(uVar, "node");
        Intrinsics.checkNotNullParameter(vVarArr, "path");
        this.f22852a = vVarArr;
        vVarArr[0].mo15924m(uVar.mo15902s(), uVar.mo15899p() * 2);
        this.f22853b = 0;
        mo15806d();
    }

    /* renamed from: e */
    public static /* synthetic */ void m30662e() {
    }

    /* renamed from: b */
    public final void mo15804b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: c */
    public final K mo15805c() {
        mo15804b();
        return this.f22852a[this.f22853b].mo15915b();
    }

    /* renamed from: d */
    public final void mo15806d() {
        if (!this.f22852a[this.f22853b].mo15919f()) {
            for (int i = this.f22853b; -1 < i; i--) {
                int j = mo15810j(i);
                if (j == -1 && this.f22852a[i].mo15920h()) {
                    this.f22852a[i].mo15923l();
                    j = mo15810j(i);
                }
                if (j != -1) {
                    this.f22853b = j;
                    return;
                }
                if (i > 0) {
                    this.f22852a[i - 1].mo15923l();
                }
                this.f22852a[i].mo15924m(C8489u.f22873e.mo15910a().mo15902s(), 0);
            }
            this.f22854c = false;
        }
    }

    @C12579k
    /* renamed from: f */
    public final C8492v<K, V, T>[] mo15807f() {
        return this.f22852a;
    }

    /* renamed from: h */
    public final int mo15808h() {
        return this.f22853b;
    }

    public boolean hasNext() {
        return this.f22854c;
    }

    /* renamed from: j */
    public final int mo15810j(int i) {
        if (this.f22852a[i].mo15919f()) {
            return i;
        }
        if (!this.f22852a[i].mo15920h()) {
            return -1;
        }
        C8489u<? extends K, ? extends V> c = this.f22852a[i].mo15916c();
        if (i == 6) {
            this.f22852a[i + 1].mo15924m(c.mo15902s(), c.mo15902s().length);
        } else {
            this.f22852a[i + 1].mo15924m(c.mo15902s(), c.mo15899p() * 2);
        }
        return mo15810j(i + 1);
    }

    /* renamed from: l */
    public final void mo15811l(int i) {
        this.f22853b = i;
    }

    public T next() {
        mo15804b();
        T next = this.f22852a[this.f22853b].next();
        mo15806d();
        return next;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
