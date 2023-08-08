package com.carrefour.fid.android.service.presentation.p044ui.delivery;

import android.content.Context;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0004\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\" \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, mo22516d2 = {"Lkotlin/Function0;", "Lkotlin/d2;", "Landroidx/compose/runtime/g;", "content", "ProvideDeliveryErrorMessageFormatter", "(Lkotlin/jvm/functions/p;Landroidx/compose/runtime/o;I)V", "Landroidx/compose/runtime/i1;", "Lcom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryErrorMessageFormatter;", "LocalDeliveryErrorMessageFormatter", "Landroidx/compose/runtime/i1;", "getLocalDeliveryErrorMessageFormatter", "()Landroidx/compose/runtime/i1;", "service_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDeliveryErrorMessageFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliveryErrorMessageFormatter.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryErrorMessageFormatterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,35:1\n76#2:36\n25#3:37\n1114#4,6:38\n*S KotlinDebug\n*F\n+ 1 DeliveryErrorMessageFormatter.kt\ncom/carrefour/fid/android/service/presentation/ui/delivery/DeliveryErrorMessageFormatterKt\n*L\n29#1:36\n30#1:37\n30#1:38,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.service.presentation.ui.delivery.DeliveryErrorMessageFormatterKt */
public final class DeliveryErrorMessageFormatterKt {
    @C12579k
    private static final C8550i1<DeliveryErrorMessageFormatter> LocalDeliveryErrorMessageFormatter = CompositionLocalKt.m29859e(C28358x4b35587d.INSTANCE);

    @C8540g
    @C8544h(scheme = "[0[0]]")
    public static final void ProvideDeliveryErrorMessageFormatter(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(-1136671642);
        if ((i & 14) == 0) {
            if (o.mo14927P(pVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1136671642, i2, -1, "com.carrefour.fid.android.service.presentation.ui.delivery.ProvideDeliveryErrorMessageFormatter (DeliveryErrorMessageFormatter.kt:27)");
            }
            Context context = (Context) o.mo15032w(AndroidCompositionLocals_androidKt.m70952g());
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = new DeliveryErrorMessageFormatter(context);
                o.mo14893C(N);
            }
            o.mo15002m0();
            CompositionLocalKt.m29856b(new C8572j1[]{LocalDeliveryErrorMessageFormatter.mo16141f((DeliveryErrorMessageFormatter) N)}, C8553b.m31048b(o, -2110482522, true, new C28359x5d373187(pVar, i2)), o, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C28360x5d373188(pVar, i));
        }
    }

    @C12579k
    public static final C8550i1<DeliveryErrorMessageFormatter> getLocalDeliveryErrorMessageFormatter() {
        return LocalDeliveryErrorMessageFormatter;
    }
}
