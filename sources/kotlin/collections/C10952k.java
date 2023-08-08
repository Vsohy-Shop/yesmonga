package kotlin.collections;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import kotlin.C11532s0;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nArraysJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,61:1\n26#2:62\n*S KotlinDebug\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n18#1:62\n*E\n"})
/* renamed from: kotlin.collections.k */
public class C10952k {
    @C12579k
    /* renamed from: a */
    public static final <T> T[] m40997a(@C12579k T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    @C11314h(name = "contentDeepHashCode")
    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: b */
    public static final <T> int m40998b(@C12580l T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @C11665v0(version = "1.3")
    /* renamed from: c */
    public static final void m40999c(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ <T> T[] m41000d(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new Object[0];
    }

    @C11110f
    /* renamed from: e */
    public static final String m41001e(byte[] bArr, Charset charset) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bArr, charset);
    }

    /* renamed from: f */
    public static final /* synthetic */ <T> T[] m41002f(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.reifiedOperationMarker(0, "T?");
        return collection.toArray(new Object[0]);
    }
}
