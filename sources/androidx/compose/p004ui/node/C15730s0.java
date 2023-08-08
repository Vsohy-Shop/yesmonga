package androidx.compose.p004ui.node;

import androidx.compose.runtime.collection.C8423g;
import androidx.vectordrawable.graphics.drawable.C20729i;
import java.util.Arrays;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nNestedVectorStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,57:1\n1182#2:58\n1161#2,2:59\n523#3:61\n523#3:62\n*S KotlinDebug\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n*L\n26#1:58\n26#1:59,2\n41#1:61\n47#1:62\n*E\n"})
/* renamed from: androidx.compose.ui.node.s0 */
public final class C15730s0<T> {

    /* renamed from: a */
    public int f39053a = -1;

    /* renamed from: b */
    public int f39054b;
    @C12579k

    /* renamed from: c */
    public int[] f39055c = new int[16];
    @C12579k

    /* renamed from: d */
    public final C8423g<C8423g<T>> f39056d = new C8423g<>(new C8423g[16], 0);

    /* renamed from: a */
    public final boolean mo45192a() {
        int i = this.f39053a;
        return i >= 0 && this.f39055c[i] >= 0;
    }

    /* renamed from: b */
    public final T mo45193b() {
        int i = this.f39053a;
        int i2 = this.f39055c[i];
        C8423g gVar = (C8423g) this.f39056d.mo15462d0()[i];
        if (i2 > 0) {
            int[] iArr = this.f39055c;
            iArr[i] = iArr[i] - 1;
        } else if (i2 == 0) {
            this.f39056d.mo15437D0(i);
            this.f39053a--;
        }
        return gVar.mo15462d0()[i2];
    }

    /* renamed from: c */
    public final void mo45194c(@C12579k C8423g<T> gVar) {
        Intrinsics.checkNotNullParameter(gVar, C20729i.f53485E0);
        if (gVar.mo15477m0()) {
            this.f39056d.mo15463e(gVar);
            mo45195d(gVar.mo15469h0() - 1);
            this.f39053a++;
        }
    }

    /* renamed from: d */
    public final void mo45195d(int i) {
        int i2 = this.f39054b;
        int[] iArr = this.f39055c;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f39055c = copyOf;
        }
        int[] iArr2 = this.f39055c;
        int i3 = this.f39054b;
        this.f39054b = i3 + 1;
        iArr2[i3] = i;
    }
}
