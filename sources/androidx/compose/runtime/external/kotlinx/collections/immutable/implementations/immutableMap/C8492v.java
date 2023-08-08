package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.v */
public abstract class C8492v<K, V, T> implements Iterator<T>, C11345a {
    @C12579k

    /* renamed from: a */
    public Object[] f22881a = C8489u.f22873e.mo15910a().mo15902s();

    /* renamed from: b */
    public int f22882b;

    /* renamed from: c */
    public int f22883c;

    /* renamed from: b */
    public final K mo15915b() {
        C8530a.m30952a(mo15919f());
        return this.f22881a[this.f22883c];
    }

    @C12579k
    /* renamed from: c */
    public final C8489u<? extends K, ? extends V> mo15916c() {
        C8530a.m30952a(mo15920h());
        Object obj = this.f22881a[this.f22883c];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (C8489u) obj;
    }

    @C12579k
    /* renamed from: d */
    public final Object[] mo15917d() {
        return this.f22881a;
    }

    /* renamed from: e */
    public final int mo15918e() {
        return this.f22883c;
    }

    /* renamed from: f */
    public final boolean mo15919f() {
        return this.f22883c < this.f22882b;
    }

    /* renamed from: h */
    public final boolean mo15920h() {
        boolean z;
        if (this.f22883c >= this.f22882b) {
            z = true;
        } else {
            z = false;
        }
        C8530a.m30952a(z);
        if (this.f22883c < this.f22881a.length) {
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        return mo15919f();
    }

    /* renamed from: j */
    public final void mo15922j() {
        C8530a.m30952a(mo15919f());
        this.f22883c += 2;
    }

    /* renamed from: l */
    public final void mo15923l() {
        C8530a.m30952a(mo15920h());
        this.f22883c++;
    }

    /* renamed from: m */
    public final void mo15924m(@C12579k Object[] objArr, int i) {
        Intrinsics.checkNotNullParameter(objArr, "buffer");
        mo15925n(objArr, i, 0);
    }

    /* renamed from: n */
    public final void mo15925n(@C12579k Object[] objArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(objArr, "buffer");
        this.f22881a = objArr;
        this.f22882b = i;
        this.f22883c = i2;
    }

    /* renamed from: o */
    public final void mo15926o(int i) {
        this.f22883c = i;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
