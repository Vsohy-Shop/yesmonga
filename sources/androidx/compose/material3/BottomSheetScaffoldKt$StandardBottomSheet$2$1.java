package androidx.compose.material3;

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
public final class BottomSheetScaffoldKt$StandardBottomSheet$2$1 extends Lambda implements C11304p<SheetValue, C16500q, Float> {
    final /* synthetic */ float $layoutHeight;
    final /* synthetic */ float $peekHeightPx;
    final /* synthetic */ SheetState $state;

    /* renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$a */
    public /* synthetic */ class C7965a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material3.SheetValue[] r0 = androidx.compose.material3.SheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Hidden     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1.C7965a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$2$1(SheetState sheetState, float f, float f2) {
        super(2);
        this.$state = sheetState;
        this.$layoutHeight = f;
        this.$peekHeightPx = f2;
    }

    @C12580l
    /* renamed from: a */
    public final Float mo11195a(@C12579k SheetValue sheetValue, long j) {
        Intrinsics.checkNotNullParameter(sheetValue, "value");
        int i = C7965a.$EnumSwitchMapping$0[sheetValue.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                } else if (this.$state.mo11860h()) {
                    return null;
                } else {
                    return Float.valueOf(this.$layoutHeight);
                }
            } else if (C16500q.m74659j(j) == C11409d.m43851L0(this.$peekHeightPx)) {
                return null;
            } else {
                return Float.valueOf(Float.max(0.0f, this.$layoutHeight - ((float) C16500q.m74659j(j))));
            }
        } else if (this.$state.mo11861i()) {
            return null;
        } else {
            return Float.valueOf(this.$layoutHeight - this.$peekHeightPx);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo11195a((SheetValue) obj, ((C16500q) obj2).mo47895q());
    }
}
