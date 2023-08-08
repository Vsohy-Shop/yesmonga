package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12247f;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.internal.c1 */
public final class C12261c1 {
    @C12247f
    /* renamed from: a */
    public static final void m49255a(@C12579k int[] iArr, @C12579k int[] iArr2, @C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(iArr, "seenArray");
        Intrinsics.checkNotNullParameter(iArr2, "goldenMaskArray");
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = iArr2[i] & (~iArr[i]);
            if (i3 != 0) {
                int i4 = 0;
                while (i4 < 32) {
                    int i5 = i4 + 1;
                    if ((i3 & 1) != 0) {
                        arrayList.add(fVar.mo24824e((i * 32) + i4));
                    }
                    i3 >>>= 1;
                    i4 = i5;
                }
            }
            i = i2;
        }
        throw new MissingFieldException((List<String>) arrayList, fVar.mo24830h());
    }

    @C12247f
    /* renamed from: b */
    public static final void m49256b(int i, int i2, @C12579k C12217f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        int i4 = 0;
        while (i4 < 32) {
            int i5 = i4 + 1;
            if ((i3 & 1) != 0) {
                arrayList.add(fVar.mo24824e(i4));
            }
            i3 >>>= 1;
            i4 = i5;
        }
        throw new MissingFieldException((List<String>) arrayList, fVar.mo24830h());
    }
}
