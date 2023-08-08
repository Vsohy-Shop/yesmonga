package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.C8530a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.f */
public final class C8504f<E> {
    @C12579k

    /* renamed from: a */
    public Object[] f22916a = C8502e.f22911d.mo16002a().mo15989n();

    /* renamed from: b */
    public int f22917b;

    /* renamed from: i */
    public static /* synthetic */ void m30858i(C8504f fVar, Object[] objArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        fVar.mo16010h(objArr, i);
    }

    /* renamed from: a */
    public final E mo16003a() {
        C8530a.m30952a(mo16006d());
        return this.f22916a[this.f22917b];
    }

    @C12579k
    /* renamed from: b */
    public final C8502e<? extends E> mo16004b() {
        C8530a.m30952a(mo16007e());
        Object obj = this.f22916a[this.f22917b];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (C8502e) obj;
    }

    /* renamed from: c */
    public final boolean mo16005c() {
        return this.f22917b < this.f22916a.length;
    }

    /* renamed from: d */
    public final boolean mo16006d() {
        return mo16005c() && !(this.f22916a[this.f22917b] instanceof C8502e);
    }

    /* renamed from: e */
    public final boolean mo16007e() {
        return mo16005c() && (this.f22916a[this.f22917b] instanceof C8502e);
    }

    /* renamed from: f */
    public final void mo16008f() {
        C8530a.m30952a(mo16005c());
        this.f22917b++;
    }

    /* renamed from: g */
    public final E mo16009g() {
        C8530a.m30952a(mo16006d());
        E[] eArr = this.f22916a;
        int i = this.f22917b;
        this.f22917b = i + 1;
        return eArr[i];
    }

    /* renamed from: h */
    public final void mo16010h(@C12579k Object[] objArr, int i) {
        Intrinsics.checkNotNullParameter(objArr, "buffer");
        this.f22916a = objArr;
        this.f22917b = i;
    }
}
