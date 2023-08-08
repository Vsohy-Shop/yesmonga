package androidx.compose.foundation.text;

import androidx.compose.animation.core.C1990m0;
import com.carrefour.fid.android.presentation.p035ui.coupons.views.C23975b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/animation/core/m0$b;", "", "Lkotlin/d2;", "a", "(Landroidx/compose/animation/core/m0$b;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TextFieldCursorKt$cursorAnimationSpec$1 extends Lambda implements C11300l<C1990m0.C1992b<Float>, C11079d2> {

    /* renamed from: f */
    public static final TextFieldCursorKt$cursorAnimationSpec$1 f7186f = new TextFieldCursorKt$cursorAnimationSpec$1();

    public TextFieldCursorKt$cursorAnimationSpec$1() {
        super(1);
    }

    /* renamed from: a */
    public final void mo9365a(@C12579k C1990m0.C1992b<Float> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "$this$keyframes");
        bVar.mo6921g(1000);
        Float valueOf = Float.valueOf(1.0f);
        bVar.mo6914a(valueOf, 0);
        bVar.mo6914a(valueOf, C23975b.f60174c);
        Float valueOf2 = Float.valueOf(0.0f);
        bVar.mo6914a(valueOf2, 500);
        bVar.mo6914a(valueOf2, 999);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9365a((C1990m0.C1992b) obj);
        return C11079d2.f28267a;
    }
}
