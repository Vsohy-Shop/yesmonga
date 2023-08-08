package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import android.content.Context;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.presentation.p035ui.coupons.analytics.C23787a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$handleSideEffects$2 */
public final class CouponsListStatefulKt$handleSideEffects$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C23787a $analytics;
    final /* synthetic */ Context $context;
    final /* synthetic */ C11304p<Boolean, Pair<String, String>, C11079d2> $displaySnackbar;
    final /* synthetic */ C8700z0<List<String>> $loadingButtonIds;
    final /* synthetic */ C11289a<C11079d2> $navigateToBarCode;
    final /* synthetic */ C11907e<C23886i> $sideEffect;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$handleSideEffects$2(Context context, C11907e<? extends C23886i> eVar, C8700z0<List<String>> z0Var, C23787a aVar, C11304p<? super Boolean, ? super Pair<String, String>, C11079d2> pVar, C11289a<C11079d2> aVar2, int i) {
        super(2);
        this.$context = context;
        this.$sideEffect = eVar;
        this.$loadingButtonIds = z0Var;
        this.$analytics = aVar;
        this.$displaySnackbar = pVar;
        this.$navigateToBarCode = aVar2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CouponsListStatefulKt.m105550q(this.$context, this.$sideEffect, this.$loadingButtonIds, this.$analytics, this.$displaySnackbar, this.$navigateToBarCode, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}
