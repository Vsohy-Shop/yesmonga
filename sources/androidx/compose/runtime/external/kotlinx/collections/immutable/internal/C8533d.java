package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.internal.d */
public final class C8533d {
    /* renamed from: a */
    public static final void m30959a(int i, @C12579k C11304p<? super Integer, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "body");
        int i2 = 0;
        while (i != 0) {
            int lowestOneBit = Integer.lowestOneBit(i);
            pVar.invoke(Integer.valueOf(lowestOneBit), Integer.valueOf(i2));
            i2++;
            i ^= lowestOneBit;
        }
    }
}
