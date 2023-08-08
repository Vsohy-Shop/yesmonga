package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8444c;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8450g;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.C10904b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAbstractPersistentList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n41#2:61\n41#2:62\n1726#3,3:63\n*S KotlinDebug\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n*L\n18#1:61\n22#1:62\n50#1:63,3\n*E\n"})
public abstract class AbstractPersistentList<E> extends C10904b<E> implements C8450g<E> {
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    @C12579k
    public Iterator<E> iterator() {
        return listIterator();
    }

    @C12579k
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @C12579k
    public C8450g<E> addAll(@C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        C8450g.C8451a builder = builder();
        builder.addAll(collection);
        return builder.mo15660g();
    }

    @C12579k
    public C8450g<E> clear() {
        return C8466j.m30637b();
    }

    @C12579k
    public C8450g<E> remove(E e) {
        int indexOf = indexOf(e);
        return indexOf != -1 ? mo15661Z0(indexOf) : this;
    }

    @C12579k
    public C8450g<E> removeAll(@C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return mo15652D(new AbstractPersistentList$removeAll$1(collection));
    }

    @C12579k
    public C8450g<E> retainAll(@C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return mo15652D(new AbstractPersistentList$retainAll$1(collection));
    }

    @C12579k
    public C8444c<E> subList(int i, int i2) {
        return super.subList(i, i2);
    }

    @C12579k
    public C8450g<E> addAll(int i, @C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "c");
        C8450g.C8451a builder = builder();
        builder.addAll(i, collection);
        return builder.mo15660g();
    }
}
