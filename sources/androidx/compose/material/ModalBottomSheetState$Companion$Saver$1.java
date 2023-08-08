package androidx.compose.material;

import androidx.compose.runtime.saveable.C8629f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/material/ModalBottomSheetState;", "it", "Landroidx/compose/material/ModalBottomSheetValue;", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/material/ModalBottomSheetState;)Landroidx/compose/material/ModalBottomSheetValue;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ModalBottomSheetState$Companion$Saver$1 extends Lambda implements C11304p<C8629f, ModalBottomSheetState, ModalBottomSheetValue> {

    /* renamed from: f */
    public static final ModalBottomSheetState$Companion$Saver$1 f7723f = new ModalBottomSheetState$Companion$Saver$1();

    public ModalBottomSheetState$Companion$Saver$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final ModalBottomSheetValue invoke(@C12579k C8629f fVar, @C12579k ModalBottomSheetState modalBottomSheetState) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        Intrinsics.checkNotNullParameter(modalBottomSheetState, "it");
        return modalBottomSheetState.mo10285e();
    }
}
