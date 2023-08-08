package androidx.compose.animation.core;

import androidx.compose.p004ui.geometry.C15094f;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/geometry/f;", "it", "Landroidx/compose/animation/core/l;", "a", "(J)Landroidx/compose/animation/core/l;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class VectorConvertersKt$OffsetToVector$1 extends Lambda implements C11300l<C15094f, C1986l> {

    /* renamed from: f */
    public static final VectorConvertersKt$OffsetToVector$1 f5414f = new VectorConvertersKt$OffsetToVector$1();

    public VectorConvertersKt$OffsetToVector$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final C1986l mo6785a(long j) {
        return new C1986l(C15094f.m64880p(j), C15094f.m64882r(j));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo6785a(((C15094f) obj).mo42242A());
    }
}
