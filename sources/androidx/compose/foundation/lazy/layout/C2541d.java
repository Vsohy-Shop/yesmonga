package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2539c;
import androidx.compose.runtime.collection.C8423g;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,216:1\n48#2:217\n523#2:218\n523#2:219\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n*L\n192#1:217\n197#1:218\n206#1:219\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.layout.d */
public final class C2541d {
    @C2855v
    /* renamed from: b */
    public static final <T> int m11396b(C8423g<C2539c.C2540a<T>> gVar, int i) {
        int h0 = gVar.mo15469h0() - 1;
        int i2 = 0;
        while (i2 < h0) {
            int i3 = ((h0 - i2) / 2) + i2;
            int b = ((C2539c.C2540a) gVar.mo15462d0()[i3]).mo8730b();
            if (b == i) {
                return i3;
            }
            if (b < i) {
                i2 = i3 + 1;
                if (i < ((C2539c.C2540a) gVar.mo15462d0()[i2]).mo8730b()) {
                    return i3;
                }
            } else {
                h0 = i3 - 1;
            }
        }
        return i2;
    }
}
