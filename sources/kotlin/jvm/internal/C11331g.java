package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.jvm.internal.g */
public final class C11331g<T> implements Iterator<T>, C11345a {
    @C12579k

    /* renamed from: a */
    public final T[] f28447a;

    /* renamed from: b */
    public int f28448b;

    public C11331g(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        this.f28447a = tArr;
    }

    @C12579k
    /* renamed from: b */
    public final T[] mo22776b() {
        return this.f28447a;
    }

    public boolean hasNext() {
        return this.f28448b < this.f28447a.length;
    }

    public T next() {
        try {
            T[] tArr = this.f28447a;
            int i = this.f28448b;
            this.f28448b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f28448b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
