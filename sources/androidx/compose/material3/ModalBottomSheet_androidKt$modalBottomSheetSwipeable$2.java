package androidx.compose.material3;

import androidx.compose.p004ui.unit.C16500q;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/compose/material3/SheetValue;", "value", "Landroidx/compose/ui/unit/q;", "sheetSize", "", "a", "(Landroidx/compose/material3/SheetValue;J)Ljava/lang/Float;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ModalBottomSheet_androidKt$modalBottomSheetSwipeable$2 extends Lambda implements C11304p<SheetValue, C16500q, Float> {
    final /* synthetic */ float $bottomPadding;
    final /* synthetic */ float $screenHeight;
    final /* synthetic */ SheetState $sheetState;

    /* renamed from: androidx.compose.material3.ModalBottomSheet_androidKt$modalBottomSheetSwipeable$2$a */
    public /* synthetic */ class C8061a {
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
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Hidden     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt$modalBottomSheetSwipeable$2.C8061a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$modalBottomSheetSwipeable$2(float f, float f2, SheetState sheetState) {
        super(2);
        this.$screenHeight = f;
        this.$bottomPadding = f2;
        this.$sheetState = sheetState;
    }

    @C12580l
    /* renamed from: a */
    public final Float mo11688a(@C12579k SheetValue sheetValue, long j) {
        Intrinsics.checkNotNullParameter(sheetValue, "value");
        int i = C8061a.$EnumSwitchMapping$0[sheetValue.ordinal()];
        if (i == 1) {
            return Float.valueOf(this.$screenHeight + this.$bottomPadding);
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            } else if (C16500q.m74659j(j) != 0) {
                return Float.valueOf(Math.max(0.0f, this.$screenHeight - ((float) C16500q.m74659j(j))));
            } else {
                return null;
            }
        } else if (((float) C16500q.m74659j(j)) >= this.$screenHeight / ((float) 2) && !this.$sheetState.mo11861i()) {
            return Float.valueOf(this.$screenHeight / 2.0f);
        } else {
            return null;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo11688a((SheetValue) obj, ((C16500q) obj2).mo47895q());
    }
}
