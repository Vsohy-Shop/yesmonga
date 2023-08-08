package com.usabilla.sdk.ubform.screenshot.annotation.paint;

import com.usabilla.sdk.ubform.screenshot.annotation.paint.C9900a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/screenshot/annotation/paint/a;", "event", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbPaintPlugin$onActive$1$1 extends Lambda implements C11300l<C9900a, C11079d2> {
    final /* synthetic */ UbDrawingView $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbPaintPlugin$onActive$1$1(UbDrawingView ubDrawingView) {
        super(1);
        this.$view = ubDrawingView;
    }

    /* renamed from: a */
    public final void mo20499a(@C12579k C9900a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "event");
        if (aVar instanceof C9900a.C9902b) {
            this.$view.setStrokeWidth(((C9900a.C9902b) aVar).mo20502a());
        } else if (aVar instanceof C9900a.C9901a) {
            this.$view.setColor(((C9900a.C9901a) aVar).mo20501a());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo20499a((C9900a) obj);
        return C11079d2.f28267a;
    }
}
