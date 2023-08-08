package kotlin.collections;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.z0 */
public class C10999z0<T> extends C10904b<T> {
    @C12579k

    /* renamed from: b */
    public final List<T> f28204b;

    public C10999z0(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "delegate");
        this.f28204b = list;
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f28204b.size();
    }

    public T get(int i) {
        return this.f28204b.get(C10996y.m42383Y0(this, i));
    }
}
