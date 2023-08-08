package androidx.compose.foundation;

import androidx.compose.p004ui.semantics.C16031g;
import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/semantics/q;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/ui/semantics/q;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ClickableKt$genericClickableWithoutGesture$clickSemantics$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11289a<C11079d2> $onClick;
    final /* synthetic */ String $onClickLabel;
    final /* synthetic */ C11289a<C11079d2> $onLongClick;
    final /* synthetic */ String $onLongClickLabel;
    final /* synthetic */ C16031g $role;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$genericClickableWithoutGesture$clickSemantics$1(C16031g gVar, String str, C11289a<C11079d2> aVar, String str2, boolean z, C11289a<C11079d2> aVar2) {
        super(1);
        this.$role = gVar;
        this.$onClickLabel = str;
        this.$onLongClick = aVar;
        this.$onLongClickLabel = str2;
        this.$enabled = z;
        this.$onClick = aVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        C16031g gVar = this.$role;
        if (gVar != null) {
            SemanticsPropertiesKt.m71981R0(qVar, gVar.mo46119n());
        }
        String str = this.$onClickLabel;
        final C11289a<C11079d2> aVar = this.$onClick;
        SemanticsPropertiesKt.m72015g0(qVar, str, new C11289a<Boolean>() {
            @C12579k
            public final Boolean invoke() {
                aVar.invoke();
                return Boolean.TRUE;
            }
        });
        final C11289a<C11079d2> aVar2 = this.$onLongClick;
        if (aVar2 != null) {
            SemanticsPropertiesKt.m72019i0(qVar, this.$onLongClickLabel, new C11289a<Boolean>() {
                @C12579k
                public final Boolean invoke() {
                    aVar2.invoke();
                    return Boolean.TRUE;
                }
            });
        }
        if (!this.$enabled) {
            SemanticsPropertiesKt.m72020j(qVar);
        }
    }
}
