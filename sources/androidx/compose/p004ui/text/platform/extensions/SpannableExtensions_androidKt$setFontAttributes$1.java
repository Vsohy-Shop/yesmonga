package androidx.compose.p004ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.android.style.C16133o;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"Landroidx/compose/ui/text/c0;", "spanStyle", "", "start", "end", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/text/c0;II)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$setFontAttributes$1 */
public final class SpannableExtensions_androidKt$setFontAttributes$1 extends Lambda implements C11305q<C16151c0, Integer, Integer, C11079d2> {
    final /* synthetic */ C11306r<C16242u, C16209i0, C16190e0, C16194f0, Typeface> $resolveTypeface;
    final /* synthetic */ Spannable $this_setFontAttributes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpannableExtensions_androidKt$setFontAttributes$1(Spannable spannable, C11306r<? super C16242u, ? super C16209i0, ? super C16190e0, ? super C16194f0, ? extends Typeface> rVar) {
        super(3);
        this.$this_setFontAttributes = spannable;
        this.$resolveTypeface = rVar;
    }

    /* renamed from: a */
    public final void mo47538a(@C12579k C16151c0 c0Var, int i, int i2) {
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(c0Var, "spanStyle");
        Spannable spannable = this.$this_setFontAttributes;
        C11306r<C16242u, C16209i0, C16190e0, C16194f0, Typeface> rVar = this.$resolveTypeface;
        C16242u r = c0Var.mo46613r();
        C16209i0 w = c0Var.mo46619w();
        if (w == null) {
            w = C16209i0.f40292b.mo46952m();
        }
        C16190e0 u = c0Var.mo46617u();
        if (u != null) {
            i3 = u.mo46880j();
        } else {
            i3 = C16190e0.f40252b.mo46883b();
        }
        C16190e0 c = C16190e0.m72948c(i3);
        C16194f0 v = c0Var.mo46618v();
        if (v != null) {
            i4 = v.mo46893m();
        } else {
            i4 = C16194f0.f40257b.mo46895a();
        }
        spannable.setSpan(new C16133o(rVar.invoke(r, w, c, C16194f0.m72968e(i4))), i, i2, 33);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo47538a((C16151c0) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
