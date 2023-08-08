package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.urbanairship.iam.C9168d0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\n¢\u0006\u0004\b\n\u0010\u000b"}, mo22516d2 = {"", "totalSize", "", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/d;", "density", "outPosition", "Lkotlin/d2;", "a", "(I[ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/d;[I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt$DefaultRowMeasurePolicy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
public final class RowKt$DefaultRowMeasurePolicy$1 extends Lambda implements C11307s<Integer, int[], LayoutDirection, C16479d, int[], C11079d2> {

    /* renamed from: f */
    public static final RowKt$DefaultRowMeasurePolicy$1 f6146f = new RowKt$DefaultRowMeasurePolicy$1();

    public RowKt$DefaultRowMeasurePolicy$1() {
        super(5);
    }

    /* renamed from: a */
    public final void mo7839a(int i, @C12579k int[] iArr, @C12579k LayoutDirection layoutDirection, @C12579k C16479d dVar, @C12579k int[] iArr2) {
        Intrinsics.checkNotNullParameter(iArr, C9168d0.f24889w);
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(iArr2, "outPosition");
        Arrangement.f6010a.mo7630p().mo7649e(dVar, i, iArr, layoutDirection, iArr2);
    }

    /* renamed from: v5 */
    public /* bridge */ /* synthetic */ Object mo7709v5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        mo7839a(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (C16479d) obj4, (int[]) obj5);
        return C11079d2.f28267a;
    }
}
