package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15568h0;
import com.urbanairship.iam.C9168d0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, mo22516d2 = {"", "totalSize", "", "size", "Landroidx/compose/ui/layout/h0;", "measureScope", "outPosition", "Lkotlin/d2;", "a", "(I[ILandroidx/compose/ui/layout/h0;[I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$crossAxisRowArrangement$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,724:1\n1#2:725\n*E\n"})
public final class FlowLayoutKt$crossAxisRowArrangement$1 extends Lambda implements C11306r<Integer, int[], C15568h0, int[], C11079d2> {

    /* renamed from: f */
    public static final FlowLayoutKt$crossAxisRowArrangement$1 f6067f = new FlowLayoutKt$crossAxisRowArrangement$1();

    public FlowLayoutKt$crossAxisRowArrangement$1() {
        super(4);
    }

    /* renamed from: a */
    public final void mo7739a(int i, @C12579k int[] iArr, @C12579k C15568h0 h0Var, @C12579k int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, C9168d0.f24889w);
        Intrinsics.checkNotNullParameter(h0Var, "measureScope");
        Intrinsics.checkNotNullParameter(iArr2, "outPosition");
        Arrangement.f6010a.mo7631r().mo7656d(h0Var, i, iArr, iArr2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo7739a(((Number) obj).intValue(), (int[]) obj2, (C15568h0) obj3, (int[]) obj4);
        return C11079d2.f28267a;
    }
}
