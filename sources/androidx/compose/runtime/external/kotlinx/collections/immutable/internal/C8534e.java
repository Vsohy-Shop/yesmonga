package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.internal.e */
public final class C8534e {
    @C12579k

    /* renamed from: a */
    public static final C8534e f22973a = new C8534e();

    @C11384m
    /* renamed from: a */
    public static final void m30960a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    @C11384m
    /* renamed from: b */
    public static final void m30961b(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    @C11384m
    /* renamed from: c */
    public static final void m30962c(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        } else if (i > i2) {
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }
    }

    @C11384m
    /* renamed from: d */
    public static final boolean m30963d(@C12579k Collection<?> collection, @C12579k Collection<?> collection2) {
        Intrinsics.checkNotNullParameter(collection, "c");
        Intrinsics.checkNotNullParameter(collection2, "other");
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator<?> it = collection2.iterator();
        for (Object areEqual : collection) {
            if (!Intrinsics.areEqual((Object) areEqual, (Object) it.next())) {
                return false;
            }
        }
        return true;
    }

    @C11384m
    /* renamed from: e */
    public static final int m30964e(@C12579k Collection<?> collection) {
        int i;
        Intrinsics.checkNotNullParameter(collection, "c");
        int i2 = 1;
        for (Object next : collection) {
            int i3 = i2 * 31;
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }
}
