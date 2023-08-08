package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8532c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.a */
public final class C8524a {
    @C12580l

    /* renamed from: a */
    public final Object f22953a;
    @C12580l

    /* renamed from: b */
    public final Object f22954b;

    public C8524a(@C12580l Object obj, @C12580l Object obj2) {
        this.f22953a = obj;
        this.f22954b = obj2;
    }

    /* renamed from: a */
    public final boolean mo16088a() {
        return this.f22954b != C8532c.f22972a;
    }

    /* renamed from: b */
    public final boolean mo16089b() {
        return this.f22953a != C8532c.f22972a;
    }

    @C12580l
    /* renamed from: c */
    public final Object mo16090c() {
        return this.f22954b;
    }

    @C12580l
    /* renamed from: d */
    public final Object mo16091d() {
        return this.f22953a;
    }

    @C12579k
    /* renamed from: e */
    public final C8524a mo16092e(@C12580l Object obj) {
        return new C8524a(this.f22953a, obj);
    }

    @C12579k
    /* renamed from: f */
    public final C8524a mo16093f(@C12580l Object obj) {
        return new C8524a(obj, this.f22954b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8524a() {
        /*
            r1 = this;
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8532c.f22972a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.C8524a.<init>():void");
    }

    public C8524a(@C12580l Object obj) {
        this(obj, C8532c.f22972a);
    }
}
