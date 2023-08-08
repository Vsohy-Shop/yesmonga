package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.collections.C10934f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11353h;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001b\b\u0000\u0012\u0010\u0010\u001b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b!\u0010\"B\t\b\u0016¢\u0006\u0004\b!\u0010#B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u001d¢\u0006\u0004\b!\u0010%J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002J\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0018\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u0016\u0010\u0019\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016R\u001e\u0010\u001b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006&"}, mo22516d2 = {"Lkotlin/collections/builders/SetBuilder;", "E", "", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "h", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "Lkotlin/d2;", "clear", "add", "remove", "", "iterator", "", "elements", "addAll", "removeAll", "retainAll", "Lkotlin/collections/builders/MapBuilder;", "backing", "Lkotlin/collections/builders/MapBuilder;", "", "e", "()I", "size", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "()V", "initialCapacity", "(I)V", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class SetBuilder<E> extends C10934f<E> implements Set<E>, Serializable, C11353h {
    @C12579k
    private final MapBuilder<E, ?> backing;

    public SetBuilder(@C12579k MapBuilder<E, ?> mapBuilder) {
        Intrinsics.checkNotNullParameter(mapBuilder, "backing");
        this.backing = mapBuilder;
    }

    private final Object writeReplace() {
        if (this.backing.mo22128E()) {
            return new SerializedCollection(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public boolean add(E e) {
        return this.backing.mo22147h(e) >= 0;
    }

    public boolean addAll(@C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        this.backing.mo22153l();
        return super.addAll(collection);
    }

    public void clear() {
        this.backing.clear();
    }

    public boolean contains(Object obj) {
        return this.backing.containsKey(obj);
    }

    /* renamed from: e */
    public int mo15840e() {
        return this.backing.size();
    }

    @C12579k
    /* renamed from: h */
    public final Set<E> mo22203h() {
        this.backing.mo22151j();
        return this;
    }

    public boolean isEmpty() {
        return this.backing.isEmpty();
    }

    @C12579k
    public Iterator<E> iterator() {
        return this.backing.mo22129F();
    }

    public boolean remove(Object obj) {
        return this.backing.mo22136M(obj) >= 0;
    }

    public boolean removeAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        this.backing.mo22153l();
        return super.removeAll(collection);
    }

    public boolean retainAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        this.backing.mo22153l();
        return super.retainAll(collection);
    }

    public SetBuilder() {
        this(new MapBuilder());
    }

    public SetBuilder(int i) {
        this(new MapBuilder(i));
    }
}
