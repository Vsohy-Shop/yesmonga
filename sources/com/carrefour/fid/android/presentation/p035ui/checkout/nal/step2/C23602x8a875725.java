package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import androidx.compose.foundation.lazy.C2517l;
import androidx.compose.foundation.lazy.LazyListState;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.C23617b;
import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nNonFoodCheckoutStep2Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3$1$6$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,932:1\n1#2:933\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Screen$3$1$6$3$1 */
public final class C23602x8a875725 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11300l<C23617b, C11079d2> $actioner;
    final /* synthetic */ LazyListState $listState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23602x8a875725(C11300l<? super C23617b, C11079d2> lVar, LazyListState lazyListState) {
        super(0);
        this.$actioner = lVar;
        this.$listState = lazyListState;
    }

    public final void invoke() {
        Object obj;
        C11300l<C23617b, C11079d2> lVar = this.$actioner;
        Iterator it = this.$listState.mo8343u().mo8378i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((C2517l) obj).getKey(), (Object) "PromoCodeComponent")) {
                break;
            }
        }
        C2517l lVar2 = (C2517l) obj;
        lVar.invoke(new C23617b.C23632h.C23634b(lVar2 != null ? lVar2.getIndex() : -1));
    }
}
