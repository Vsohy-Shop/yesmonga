package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8532c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.a */
public final class C8505a<V> {

    /* renamed from: a */
    public final V f22918a;
    @C12580l

    /* renamed from: b */
    public final Object f22919b;
    @C12580l

    /* renamed from: c */
    public final Object f22920c;

    public C8505a(V v, @C12580l Object obj, @C12580l Object obj2) {
        this.f22918a = v;
        this.f22919b = obj;
        this.f22920c = obj2;
    }

    /* renamed from: a */
    public final boolean mo16011a() {
        return this.f22920c != C8532c.f22972a;
    }

    /* renamed from: b */
    public final boolean mo16012b() {
        return this.f22919b != C8532c.f22972a;
    }

    @C12580l
    /* renamed from: c */
    public final Object mo16013c() {
        return this.f22920c;
    }

    @C12580l
    /* renamed from: d */
    public final Object mo16014d() {
        return this.f22919b;
    }

    /* renamed from: e */
    public final V mo16015e() {
        return this.f22918a;
    }

    @C12579k
    /* renamed from: f */
    public final C8505a<V> mo16016f(@C12580l Object obj) {
        return new C8505a<>(this.f22918a, this.f22919b, obj);
    }

    @C12579k
    /* renamed from: g */
    public final C8505a<V> mo16017g(@C12580l Object obj) {
        return new C8505a<>(this.f22918a, obj, this.f22920c);
    }

    @C12579k
    /* renamed from: h */
    public final C8505a<V> mo16018h(V v) {
        return new C8505a<>(v, this.f22919b, this.f22920c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8505a(V r2) {
        /*
            r1 = this;
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8532c.f22972a
            r1.<init>(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.C8505a.<init>(java.lang.Object):void");
    }

    public C8505a(V v, @C12580l Object obj) {
        this(v, obj, C8532c.f22972a);
    }
}
