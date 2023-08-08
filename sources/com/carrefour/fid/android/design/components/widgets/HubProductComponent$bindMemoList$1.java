package com.carrefour.fid.android.design.components.widgets;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.components.compose.MemoListInputComponentKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class HubProductComponent$bindMemoList$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ HubProductComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HubProductComponent$bindMemoList$1(HubProductComponent hubProductComponent) {
        super(2);
        this.this$0 = hubProductComponent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-478955978, i, -1, "com.carrefour.fid.android.design.components.widgets.HubProductComponent.bindMemoList.<anonymous> (HubProductComponent.kt:137)");
            }
            final HubProductComponent hubProductComponent = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, -321914605, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(-321914605, i2, -1, "com.carrefour.fid.android.design.components.widgets.HubProductComponent.bindMemoList.<anonymous>.<anonymous> (HubProductComponent.kt:138)");
                        }
                        C8767m o = PaddingKt.m10028o(C8767m.f23478j, 0.0f, C16483g.m74435M((float) 16), 0.0f, 0.0f, 13, (Object) null);
                        final HubProductComponent hubProductComponent = hubProductComponent;
                        MemoListInputComponentKt.m151532b(o, false, (C8700z0<Boolean>) null, (C11300l<? super String, C11079d2>) null, new C11289a<C11079d2>() {
                            public final void invoke() {
                                C11289a<C11079d2> onClickListener = hubProductComponent.getOnClickListener();
                                if (onClickListener != null) {
                                    onClickListener.invoke();
                                }
                            }
                        }, oVar, 54, 12);
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29843v0();
                            return;
                        }
                        return;
                    }
                    oVar.mo14958a0();
                }
            }), oVar, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
