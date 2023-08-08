package androidx.compose.material3;

import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "", "it", "Landroidx/compose/material3/TopAppBarState;", "a", "(Ljava/util/List;)Landroidx/compose/material3/TopAppBarState;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TopAppBarState$Companion$Saver$2 extends Lambda implements C11300l<List<? extends Float>, TopAppBarState> {

    /* renamed from: f */
    public static final TopAppBarState$Companion$Saver$2 f19967f = new TopAppBarState$Companion$Saver$2();

    public TopAppBarState$Companion$Saver$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final TopAppBarState invoke(@C12579k List<Float> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        return new TopAppBarState(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue());
    }
}
