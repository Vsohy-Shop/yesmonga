package androidx.compose.p004ui.text.font;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/text/font/k1;", "Lkotlin/d2;", "onAsyncCompletion", "a", "(Lkotlin/jvm/functions/l;)Landroidx/compose/ui/text/font/k1;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1 */
public final class FontFamilyResolverImpl$resolve$result$1 extends Lambda implements C11300l<C11300l<? super C16217k1, ? extends C11079d2>, C16217k1> {
    final /* synthetic */ C16214j1 $typefaceRequest;
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$resolve$result$1(FontFamilyResolverImpl fontFamilyResolverImpl, C16214j1 j1Var) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
        this.$typefaceRequest = j1Var;
    }

    @C12579k
    /* renamed from: a */
    public final C16217k1 invoke(@C12579k C11300l<? super C16217k1, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "onAsyncCompletion");
        C16217k1 a = this.this$0.f40218d.mo46792a(this.$typefaceRequest, this.this$0.mo46785h(), lVar, this.this$0.f40220f);
        if (a != null || (a = this.this$0.f40219e.mo46792a(this.$typefaceRequest, this.this$0.mo46785h(), lVar, this.this$0.f40220f)) != null) {
            return a;
        }
        throw new IllegalStateException("Could not load font");
    }
}
