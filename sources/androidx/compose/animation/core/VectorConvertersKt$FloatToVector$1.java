package androidx.compose.animation.core;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Landroidx/compose/animation/core/k;", "a", "(F)Landroidx/compose/animation/core/k;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class VectorConvertersKt$FloatToVector$1 extends Lambda implements C11300l<Float, C1983k> {

    /* renamed from: f */
    public static final VectorConvertersKt$FloatToVector$1 f5406f = new VectorConvertersKt$FloatToVector$1();

    public VectorConvertersKt$FloatToVector$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final C1983k mo6777a(float f) {
        return new C1983k(f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo6777a(((Number) obj).floatValue());
    }
}
