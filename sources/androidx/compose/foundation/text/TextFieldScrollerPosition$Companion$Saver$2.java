package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"", "", "restored", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "a", "(Ljava/util/List;)Landroidx/compose/foundation/text/TextFieldScrollerPosition;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TextFieldScrollerPosition$Companion$Saver$2 extends Lambda implements C11300l<List<? extends Object>, TextFieldScrollerPosition> {

    /* renamed from: f */
    public static final TextFieldScrollerPosition$Companion$Saver$2 f7222f = new TextFieldScrollerPosition$Companion$Saver$2();

    public TextFieldScrollerPosition$Companion$Saver$2() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final TextFieldScrollerPosition invoke(@C12579k List<? extends Object> list) {
        Orientation orientation;
        Intrinsics.checkNotNullParameter(list, "restored");
        Object obj = list.get(1);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) obj).booleanValue()) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        Object obj2 = list.get(0);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
    }
}
