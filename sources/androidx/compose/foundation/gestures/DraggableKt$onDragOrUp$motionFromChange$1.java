package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15492p;
import androidx.compose.p004ui.input.pointer.C15507w;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/w;", "it", "", "a", "(Landroidx/compose/ui/input/pointer/w;)Ljava/lang/Float;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class DraggableKt$onDragOrUp$motionFromChange$1 extends Lambda implements C11300l<C15507w, Float> {

    /* renamed from: f */
    public static final DraggableKt$onDragOrUp$motionFromChange$1 f5883f = new DraggableKt$onDragOrUp$motionFromChange$1();

    public DraggableKt$onDragOrUp$motionFromChange$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final Float invoke(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "it");
        return Float.valueOf(C15094f.m64882r(C15492p.m68693m(wVar)));
    }
}
