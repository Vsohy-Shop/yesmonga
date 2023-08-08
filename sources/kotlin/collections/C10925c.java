package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;
import kotlin.C11665v0;
import kotlin.jvm.internal.markers.C11346b;

@C11665v0(version = "1.1")
/* renamed from: kotlin.collections.c */
public abstract class C10925c<E> extends AbstractCollection<E> implements Collection<E>, C11346b {
    public abstract boolean add(E e);

    /* renamed from: e */
    public abstract int mo15855e();

    public final /* bridge */ int size() {
        return mo15855e();
    }
}
