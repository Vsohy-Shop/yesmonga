package androidx.compose.foundation.text;

import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/semantics/q;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/ui/semantics/q;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TextController$createSemanticsModifierFor$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ C16156d $text;
    final /* synthetic */ TextController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextController$createSemanticsModifierFor$1(C16156d dVar, TextController textController) {
        super(1);
        this.$text = dVar;
        this.this$0 = textController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        SemanticsPropertiesKt.m71993X0(qVar, this.$text);
        final TextController textController = this.this$0;
        SemanticsPropertiesKt.m71986U(qVar, (String) null, new C11300l<List<C16260h0>, Boolean>() {
            @C12579k
            /* renamed from: a */
            public final Boolean invoke(@C12579k List<C16260h0> list) {
                boolean z;
                Intrinsics.checkNotNullParameter(list, "it");
                if (textController.mo9331l().mo9469d() != null) {
                    C16260h0 d = textController.mo9331l().mo9469d();
                    Intrinsics.checkNotNull(d);
                    list.add(d);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, 1, (Object) null);
    }
}
