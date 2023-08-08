package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.urbanairship.iam.C9168d0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class FlowLayoutKt$mainAxisColumnArrangement$1$1 extends Lambda implements C11307s<Integer, int[], LayoutDirection, C16479d, int[], C11079d2> {
    final /* synthetic */ Arrangement.C2279l $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$mainAxisColumnArrangement$1$1(Arrangement.C2279l lVar) {
        super(5);
        this.$verticalArrangement = lVar;
    }

    /* renamed from: a */
    public final void mo7758a(int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar, @C12579k int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, C9168d0.f24889w);
        Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 2>");
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(iArr2, "outPosition");
        this.$verticalArrangement.mo7656d(dVar, i, iArr, iArr2);
    }

    /* renamed from: v5 */
    public /* bridge */ /* synthetic */ Object mo7709v5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        mo7758a(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (C16479d) obj4, (int[]) obj5);
        return C11079d2.f28267a;
    }
}
