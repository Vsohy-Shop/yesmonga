package com.carrefour.fid.android.presentation.p035ui.home.arsenalGame;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.home.state.C26481a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.arsenalGame.ArsenalBannersHomeStatefulKt$ArsenalBannersHome$2 */
public final class ArsenalBannersHomeStatefulKt$ArsenalBannersHome$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11305q<String, String, String, C11079d2> $OnArsenalBannerClicked;
    final /* synthetic */ C26481a $arsenalBannersStatus;
    final /* synthetic */ C8767m $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArsenalBannersHomeStatefulKt$ArsenalBannersHome$2(C8767m mVar, C26481a aVar, C11305q<? super String, ? super String, ? super String, C11079d2> qVar, int i, int i2) {
        super(2);
        this.$modifier = mVar;
        this.$arsenalBannersStatus = aVar;
        this.$OnArsenalBannerClicked = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ArsenalBannersHomeStatefulKt.m106231a(this.$modifier, this.$arsenalBannersStatus, this.$OnArsenalBannerClicked, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
