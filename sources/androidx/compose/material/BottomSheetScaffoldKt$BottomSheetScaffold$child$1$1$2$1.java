package androidx.compose.material;

import androidx.compose.p004ui.unit.C16500q;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$2$1 extends Lambda implements C11304p<BottomSheetValue, C16500q, Float> {
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ float $peekHeightPx;

    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$2$1$a */
    public /* synthetic */ class C2894a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.material.BottomSheetValue[] r0 = androidx.compose.material.BottomSheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.BottomSheetValue r1 = androidx.compose.material.BottomSheetValue.Collapsed     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.BottomSheetValue r1 = androidx.compose.material.BottomSheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$2$1.C2894a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheetScaffold$child$1$1$2$1(int i, float f) {
        super(2);
        this.$layoutHeight = i;
        this.$peekHeightPx = f;
    }

    @C12580l
    /* renamed from: a */
    public final Float mo10048a(@C12579k BottomSheetValue bottomSheetValue, long j) {
        Intrinsics.checkNotNullParameter(bottomSheetValue, "state");
        int i = C2894a.$EnumSwitchMapping$0[bottomSheetValue.ordinal()];
        if (i == 1) {
            return Float.valueOf(((float) this.$layoutHeight) - this.$peekHeightPx);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        } else if (C16500q.m74659j(j) == C11409d.m43851L0(this.$peekHeightPx)) {
            return null;
        } else {
            return Float.valueOf(((float) this.$layoutHeight) - ((float) C16500q.m74659j(j)));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo10048a((BottomSheetValue) obj, ((C16500q) obj2).mo47895q());
    }
}
