package androidx.compose.animation.core;

import androidx.compose.p004ui.geometry.C15104m;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/geometry/m;", "it", "Landroidx/compose/animation/core/l;", "a", "(J)Landroidx/compose/animation/core/l;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class VectorConvertersKt$SizeToVector$1 extends Lambda implements C11300l<C15104m, C1986l> {

    /* renamed from: f */
    public static final VectorConvertersKt$SizeToVector$1 f5418f = new VectorConvertersKt$SizeToVector$1();

    public VectorConvertersKt$SizeToVector$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final C1986l mo6789a(long j) {
        return new C1986l(C15104m.m65023t(j), C15104m.m65016m(j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo6789a(((C15104m) obj).mo42315y());
    }
}
