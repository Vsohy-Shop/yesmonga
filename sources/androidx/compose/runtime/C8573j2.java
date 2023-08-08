package androidx.compose.runtime;

import java.util.ArrayList;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.j2 */
public final class C8573j2<T> {
    @C12579k

    /* renamed from: a */
    public final ArrayList<T> f23010a = new ArrayList<>();

    /* renamed from: a */
    public final void mo16234a() {
        this.f23010a.clear();
    }

    /* renamed from: b */
    public final int mo16235b() {
        return this.f23010a.size();
    }

    /* renamed from: c */
    public final boolean mo16236c() {
        return this.f23010a.isEmpty();
    }

    /* renamed from: d */
    public final boolean mo16237d() {
        return !mo16236c();
    }

    /* renamed from: e */
    public final T mo16238e() {
        return this.f23010a.get(mo16235b() - 1);
    }

    /* renamed from: f */
    public final T mo16239f(int i) {
        return this.f23010a.get(i);
    }

    /* renamed from: g */
    public final T mo16240g() {
        return this.f23010a.remove(mo16235b() - 1);
    }

    /* renamed from: h */
    public final boolean mo16241h(T t) {
        return this.f23010a.add(t);
    }

    @C12579k
    /* renamed from: i */
    public final T[] mo16242i() {
        int size = this.f23010a.size();
        T[] tArr = new Object[size];
        for (int i = 0; i < size; i++) {
            tArr[i] = this.f23010a.get(i);
        }
        return tArr;
    }
}
