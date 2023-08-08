package androidx.compose.material;

import androidx.compose.runtime.saveable.C8629f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"", "T", "Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/material/SwipeableV2State;", "it", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/material/SwipeableV2State;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SwipeableV2State$Companion$Saver$1 extends Lambda implements C11304p<C8629f, SwipeableV2State<T>, T> {

    /* renamed from: f */
    public static final SwipeableV2State$Companion$Saver$1 f7921f = new SwipeableV2State$Companion$Saver$1();

    public SwipeableV2State$Companion$Saver$1() {
        super(2);
    }

    @C12580l
    /* renamed from: a */
    public final T invoke(@C12579k C8629f fVar, @C12579k SwipeableV2State<T> swipeableV2State) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        Intrinsics.checkNotNullParameter(swipeableV2State, "it");
        return swipeableV2State.mo10562n();
    }
}
