package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

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
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCheckoutBasketsListFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutBasketsListFormatter.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/CheckoutBasketsListFormatterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,76:1\n76#2:77\n25#3:78\n1114#4,6:79\n*S KotlinDebug\n*F\n+ 1 CheckoutBasketsListFormatter.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/CheckoutBasketsListFormatterKt\n*L\n68#1:77\n69#1:78\n69#1:79,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListFormatterKt */
public final class CheckoutBasketsListFormatterKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<C23465c> f59303a = CompositionLocalKt.m29859e(C23441xb03eafc7.f59304f);

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: a */
    public static final void m104507a(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(-2024757854);
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
                ComposerKt.m29845w0(-2024757854, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.ProvideCheckoutBasketsListFormatter (CheckoutBasketsListFormatter.kt:66)");
            }
            Context context = (Context) o.mo15032w(AndroidCompositionLocals_androidKt.m70952g());
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = new C23465c(context);
                o.mo14893C(N);
            }
            o.mo15002m0();
            CompositionLocalKt.m29856b(new C8572j1[]{f59303a.mo16141f((C23465c) N)}, C8553b.m31048b(o, -1554143006, true, new C23442x6e6329fd(pVar, i2)), o, 56);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C23443x6e6329fe(pVar, i));
        }
    }

    @C12579k
    /* renamed from: b */
    public static final C8550i1<C23465c> m104508b() {
        return f59303a;
    }
}
