package androidx.compose.foundation;

import androidx.compose.p004ui.focus.FocusProperties;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/focus/FocusProperties;", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/focus/FocusProperties;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FocusableKt$focusGroup$1 extends Lambda implements C11300l<FocusProperties, C11079d2> {

    /* renamed from: f */
    public static final FocusableKt$focusGroup$1 f5738f = new FocusableKt$focusGroup$1();

    public FocusableKt$focusGroup$1() {
        super(1);
    }

    /* renamed from: a */
    public final void mo7172a(@C12579k FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
        focusProperties.mo42102h(false);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7172a((FocusProperties) obj);
        return C11079d2.f28267a;
    }
}
