package androidx.compose.material;

import androidx.compose.runtime.saveable.C8629f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/material/DismissState;", "it", "Landroidx/compose/material/DismissValue;", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/material/DismissState;)Landroidx/compose/material/DismissValue;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DismissState$Companion$Saver$1 extends Lambda implements C11304p<C8629f, DismissState, DismissValue> {

    /* renamed from: f */
    public static final DismissState$Companion$Saver$1 f7635f = new DismissState$Companion$Saver$1();

    public DismissState$Companion$Saver$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final DismissValue invoke(@C12579k C8629f fVar, @C12579k DismissState dismissState) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        Intrinsics.checkNotNullParameter(dismissState, "it");
        return (DismissValue) dismissState.mo10513p();
    }
}
