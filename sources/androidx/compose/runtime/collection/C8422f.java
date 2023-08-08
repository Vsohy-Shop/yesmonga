package androidx.compose.runtime.collection;

import android.util.SparseArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.collection.f */
public final class C8422f<E> {
    @C12579k

    /* renamed from: a */
    public final SparseArray<E> f22781a;

    public C8422f(SparseArray<E> sparseArray) {
        this.f22781a = sparseArray;
    }

    /* renamed from: a */
    public final void mo15425a() {
        this.f22781a.clear();
    }

    /* renamed from: b */
    public final boolean mo15426b(int i) {
        return this.f22781a.indexOfKey(i) >= 0;
    }

    @C12580l
    /* renamed from: c */
    public final E mo15427c(int i) {
        return this.f22781a.get(i);
    }

    /* renamed from: d */
    public final E mo15428d(int i, E e) {
        return this.f22781a.get(i, e);
    }

    /* renamed from: e */
    public final int mo15429e() {
        return this.f22781a.size();
    }

    /* renamed from: f */
    public final void mo15430f(int i) {
        this.f22781a.remove(i);
    }

    /* renamed from: g */
    public final void mo15431g(int i, E e) {
        this.f22781a.put(i, e);
    }

    public C8422f(int i) {
        this(new SparseArray(i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8422f(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
