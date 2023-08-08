package com.carrefour.fid.android.shared.presentation.p047ui.webview;

import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.carrefour.fid.android.shared.C28444b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.WebViewActivity$initHeader$1 */
public final class WebViewActivity$initHeader$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ WebViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewActivity$initHeader$1(WebViewActivity webViewActivity) {
        super(2);
        this.this$0 = webViewActivity;
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
                ComposerKt.m29845w0(-1219072811, i, -1, "com.carrefour.fid.android.shared.presentation.ui.webview.WebViewActivity.initHeader.<anonymous> (WebViewActivity.kt:64)");
            }
            final WebViewActivity webViewActivity = this.this$0;
            ThemeKt.m153788a(C8553b.m31048b(oVar, 262738904, true, new C11304p<C8592o, Integer, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C8592o) obj, ((Number) obj2).intValue());
                    return C11079d2.f28267a;
                }

                @C8540g
                @C8570j(applier = "androidx.compose.ui.UiComposable")
                public final void invoke(@C12580l C8592o oVar, int i) {
                    C8592o oVar2 = oVar;
                    int i2 = i;
                    if ((i2 & 11) != 2 || !oVar.mo15011p()) {
                        if (ComposerKt.m29813g0()) {
                            ComposerKt.m29845w0(262738904, i2, -1, "com.carrefour.fid.android.shared.presentation.ui.webview.WebViewActivity.initHeader.<anonymous>.<anonymous> (WebViewActivity.kt:65)");
                        }
                        String l = webViewActivity.mo83989g1().mo84042l();
                        if (l == null) {
                            l = "";
                        }
                        Painter d = C16015f.m71849d(C28444b.C28452h.ds_ic_symbol_cross, oVar2, 0);
                        String d2 = C16018i.m71858d(C28444b.C28462r.accessibility_general_close_page, oVar2, 0);
                        final WebViewActivity webViewActivity = webViewActivity;
                        HeaderComponentKt.m151505j(l, (C16361p0) null, 0, 0, 0, d, d2, new C11289a<C11079d2>() {
                            public final void invoke() {
                                webViewActivity.finish();
                            }
                        }, oVar, 262144, 30);
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
