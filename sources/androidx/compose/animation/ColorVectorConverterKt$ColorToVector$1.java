package androidx.compose.animation;

import androidx.compose.animation.core.C1945a1;
import androidx.compose.animation.core.C1994n;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.graphics.colorspace.C15138c;
import androidx.compose.p004ui.graphics.colorspace.C15144g;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "Landroidx/compose/animation/core/a1;", "Landroidx/compose/ui/graphics/j2;", "Landroidx/compose/animation/core/n;", "a", "(Landroidx/compose/ui/graphics/colorspace/c;)Landroidx/compose/animation/core/a1;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements C11300l<C15138c, C1945a1<C15240j2, C1994n>> {

    /* renamed from: f */
    public static final ColorVectorConverterKt$ColorToVector$1 f5222f = new ColorVectorConverterKt$ColorToVector$1();

    public ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final C1945a1<C15240j2, C1994n> invoke(@C12579k final C15138c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "colorSpace");
        return VectorConvertersKt.m8216a(C19061.f5223f, new C11300l<C1994n, C15240j2>() {
            /* renamed from: a */
            public final long mo6507a(@C12579k C1994n nVar) {
                Intrinsics.checkNotNullParameter(nVar, "it");
                double d = (double) 3.0f;
                float pow = (float) Math.pow((double) nVar.mo6926g(), d);
                float pow2 = (float) Math.pow((double) nVar.mo6927h(), d);
                float pow3 = (float) Math.pow((double) nVar.mo6929i(), d);
                float c = ColorVectorConverterKt.m7784e(0, pow, pow2, pow3, ColorVectorConverterKt.f5221c);
                float c2 = ColorVectorConverterKt.m7784e(1, pow, pow2, pow3, ColorVectorConverterKt.f5221c);
                float c3 = ColorVectorConverterKt.m7784e(2, pow, pow2, pow3, ColorVectorConverterKt.f5221c);
                return C15240j2.m66078u(C15258l2.m66176a(C11479u.m44331H(c, -2.0f, 2.0f), C11479u.m44331H(c2, -2.0f, 2.0f), C11479u.m44331H(c3, -2.0f, 2.0f), C11479u.m44331H(nVar.mo6925f(), 0.0f, 1.0f), C15144g.f37408a.mo42599k()), cVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return C15240j2.m66071n(mo6507a((C1994n) obj));
            }
        });
    }
}
