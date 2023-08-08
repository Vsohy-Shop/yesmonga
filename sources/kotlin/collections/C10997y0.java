package kotlin.collections;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.y0 */
public final class C10997y0<T> extends C10928d<T> {
    @C12579k

    /* renamed from: a */
    public final List<T> f28203a;

    public C10997y0(@C12579k List<T> list) {
        Intrinsics.checkNotNullParameter(list, "delegate");
        this.f28203a = list;
    }

    public void add(int i, T t) {
        this.f28203a.add(C10996y.m42384Z0(this, i), t);
    }

    public void clear() {
        this.f28203a.clear();
    }

    /* renamed from: e */
    public int mo15699e() {
        return this.f28203a.size();
    }

    public T get(int i) {
        return this.f28203a.get(C10996y.m42383Y0(this, i));
    }

    /* renamed from: h */
    public T mo15703h(int i) {
        return this.f28203a.remove(C10996y.m42383Y0(this, i));
    }

    public T set(int i, T t) {
        return this.f28203a.set(C10996y.m42383Y0(this, i), t);
    }
}
