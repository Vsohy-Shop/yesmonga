package androidx.compose.p004ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16217k1;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, mo22516d2 = {"Landroidx/compose/ui/text/font/u;", "fontFamily", "Landroidx/compose/ui/text/font/i0;", "fontWeight", "Landroidx/compose/ui/text/font/e0;", "fontStyle", "Landroidx/compose/ui/text/font/f0;", "fontSynthesis", "Landroid/graphics/Typeface;", "a", "(Landroidx/compose/ui/text/font/u;Landroidx/compose/ui/text/font/i0;II)Landroid/graphics/Typeface;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1 */
public final class AndroidParagraphIntrinsics$resolveTypeface$1 extends Lambda implements C11306r<C16242u, C16209i0, C16190e0, C16194f0, Typeface> {
    final /* synthetic */ AndroidParagraphIntrinsics this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidParagraphIntrinsics$resolveTypeface$1(AndroidParagraphIntrinsics androidParagraphIntrinsics) {
        super(4);
        this.this$0 = androidParagraphIntrinsics;
    }

    @C12579k
    /* renamed from: a */
    public final Typeface mo47530a(@C12580l C16242u uVar, @C12579k C16209i0 i0Var, int i, int i2) {
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        C8578k2<Object> b = this.this$0.mo47522h().mo46784b(uVar, i0Var, i, i2);
        if (!(b instanceof C16217k1.C16219b)) {
            C16364a0 a0Var = new C16364a0(b, this.this$0.f40618j);
            this.this$0.f40618j = a0Var;
            return a0Var.mo47532b();
        }
        Object value = b.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) value;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return mo47530a((C16242u) obj, (C16209i0) obj2, ((C16190e0) obj3).mo46880j(), ((C16194f0) obj4).mo46893m());
    }
}
