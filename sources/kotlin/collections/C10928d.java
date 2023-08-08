package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import kotlin.C11665v0;
import kotlin.jvm.internal.markers.C11349e;

@C11665v0(version = "1.1")
/* renamed from: kotlin.collections.d */
public abstract class C10928d<E> extends AbstractList<E> implements List<E>, C11349e {
    public abstract void add(int i, E e);

    /* renamed from: e */
    public abstract int mo15699e();

    /* renamed from: h */
    public abstract E mo15703h(int i);

    public final /* bridge */ E remove(int i) {
        return mo15703h(i);
    }

    public abstract E set(int i, E e);

    public final /* bridge */ int size() {
        return mo15699e();
    }
}
