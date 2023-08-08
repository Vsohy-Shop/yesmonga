package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.input.pointer.C15481i0;
import androidx.compose.p004ui.input.pointer.C15507w;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ScrollableKt$pointerScrollable$1 extends Lambda implements C11300l<C15507w, Boolean> {

    /* renamed from: f */
    public static final ScrollableKt$pointerScrollable$1 f5900f = new ScrollableKt$pointerScrollable$1();

    public ScrollableKt$pointerScrollable$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12579k C15507w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "down");
        return Boolean.valueOf(!C15481i0.m68620i(wVar.mo44185y(), C15481i0.f38500b.mo44073b()));
    }
}
