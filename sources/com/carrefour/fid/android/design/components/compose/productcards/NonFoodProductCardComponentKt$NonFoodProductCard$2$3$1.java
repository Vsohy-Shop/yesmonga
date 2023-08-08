package com.carrefour.fid.android.design.components.compose.productcards;

import androidx.constraintlayout.compose.C16591e;
import androidx.constraintlayout.compose.C16618o0;
import androidx.constraintlayout.compose.C16635z;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.Dimension;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NonFoodProductCardComponentKt$NonFoodProductCard$2$3$1 extends Lambda implements C11300l<ConstrainScope, C11079d2> {
    final /* synthetic */ C16591e $picture;
    final /* synthetic */ C16591e $quantity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductCardComponentKt$NonFoodProductCard$2$3$1(C16591e eVar, C16591e eVar2) {
        super(1);
        this.$picture = eVar;
        this.$quantity = eVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ConstrainScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k ConstrainScope constrainScope) {
        Intrinsics.checkNotNullParameter(constrainScope, "$this$constrainAs");
        C16635z.C16636a.m75678a(constrainScope.mo48169H(), constrainScope.mo48218x().mo48482n(), 0.0f, 0.0f, 6, (Object) null);
        C16618o0.C16619a.m75595a(constrainScope.mo48167F(), this.$picture.mo48479i(), 0.0f, 0.0f, 6, (Object) null);
        C16618o0.C16619a.m75595a(constrainScope.mo48214t(), this.$quantity.mo48481l(), 0.0f, 0.0f, 6, (Object) null);
        constrainScope.mo48206l0(Dimension.f41160a.mo48363a());
    }
}
