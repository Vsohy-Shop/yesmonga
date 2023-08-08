package androidx.compose.p004ui.text.font;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/text/font/j1;", "it", "", "a", "(Landroidx/compose/ui/text/font/j1;)Ljava/lang/Object;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1 */
public final class FontFamilyResolverImpl$createDefaultTypeface$1 extends Lambda implements C11300l<C16214j1, Object> {
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$createDefaultTypeface$1(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
    }

    @C12579k
    /* renamed from: a */
    public final Object invoke(@C12579k C16214j1 j1Var) {
        Intrinsics.checkNotNullParameter(j1Var, "it");
        return this.this$0.mo46786i(C16214j1.m73085g(j1Var, (C16242u) null, (C16209i0) null, 0, 0, (Object) null, 30, (Object) null)).getValue();
    }
}
