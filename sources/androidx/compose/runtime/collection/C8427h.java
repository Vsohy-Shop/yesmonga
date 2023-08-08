package androidx.compose.runtime.collection;

import androidx.exifinterface.media.C19135a;
import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;

@C11363r0({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1194:1\n1161#1,2:1195\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1182#1:1195,2\n*E\n"})
/* renamed from: androidx.compose.runtime.collection.h */
public final class C8427h {
    /* renamed from: b */
    public static final /* synthetic */ <T> C8423g<T> m30409b(int i, C11300l<? super Integer, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "init");
        Intrinsics.reifiedOperationMarker(0, C19135a.f48928d5);
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = lVar.invoke(Integer.valueOf(i2));
        }
        return new C8423g<>(objArr, i);
    }

    /* renamed from: c */
    public static /* synthetic */ C8423g m30410c(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 16;
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new C8423g(new Object[i], 0);
    }

    /* renamed from: f */
    public static final void m30413f(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* renamed from: g */
    public static final void m30414g(List<?> list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
        } else if (i2 > size) {
            throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }
}
