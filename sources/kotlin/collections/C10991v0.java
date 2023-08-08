package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.v0 */
public final class C10991v0<E> extends C10904b<E> implements RandomAccess {
    @C12579k

    /* renamed from: b */
    public final List<E> f28198b;

    /* renamed from: c */
    public int f28199c;

    /* renamed from: d */
    public int f28200d;

    public C10991v0(@C12579k List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f28198b = list;
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f28200d;
    }

    public E get(int i) {
        C10904b.f28138a.mo22056b(i, this.f28200d);
        return this.f28198b.get(this.f28199c + i);
    }

    /* renamed from: h */
    public final void mo22422h(int i, int i2) {
        C10904b.f28138a.mo22058d(i, i2, this.f28198b.size());
        this.f28199c = i;
        this.f28200d = i2 - i;
    }
}
