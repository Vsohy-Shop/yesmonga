package androidx.compose.p004ui.viewinterop;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "it", "Lkotlin/d2;", "b", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onCommitAffectingUpdate$1 */
public final class AndroidViewHolder$onCommitAffectingUpdate$1 extends Lambda implements C11300l<AndroidViewHolder, C11079d2> {
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onCommitAffectingUpdate$1(AndroidViewHolder androidViewHolder) {
        super(1);
        this.this$0 = androidViewHolder;
    }

    /* renamed from: c */
    public static final void m74824c(C11289a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$tmp0");
        aVar.invoke();
    }

    /* renamed from: b */
    public final void mo47970b(@C12579k AndroidViewHolder androidViewHolder) {
        Intrinsics.checkNotNullParameter(androidViewHolder, "it");
        this.this$0.getHandler().post(new C16521a(this.this$0.f40924G0));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo47970b((AndroidViewHolder) obj);
        return C11079d2.f28267a;
    }
}
