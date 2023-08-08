package com.carrefour.fid.android.design.components.compose;

import android.content.Context;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16051a0;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16415e;
import androidx.compose.p004ui.text.style.C16417f;
import androidx.compose.p004ui.text.style.C16426h;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16436k;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.text.style.C16442o;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPriceComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PriceComponent.kt\ncom/carrefour/fid/android/design/components/compose/PriceComponentKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,582:1\n74#2,7:583\n81#2:616\n74#2,7:617\n81#2:650\n85#2:656\n85#2:662\n74#2,7:697\n81#2:730\n85#2:736\n74#2,7:776\n81#2:809\n85#2:815\n75#2,6:823\n81#2:855\n85#2:860\n75#3:590\n76#3,11:592\n75#3:624\n76#3,11:626\n89#3:655\n89#3:661\n75#3:670\n76#3,11:672\n75#3:704\n76#3,11:706\n89#3:735\n89#3:740\n75#3:749\n76#3,11:751\n75#3:783\n76#3,11:785\n89#3:814\n89#3:820\n75#3:829\n76#3,11:831\n89#3:859\n75#3:871\n76#3,11:873\n89#3:901\n76#4:591\n76#4:625\n76#4:671\n76#4:705\n76#4:750\n76#4:784\n76#4:822\n76#4:830\n76#4:861\n76#4:862\n76#4:872\n460#5,13:603\n460#5,13:637\n473#5,3:652\n473#5,3:658\n460#5,13:683\n460#5,13:717\n473#5,3:732\n473#5,3:737\n460#5,13:762\n460#5,13:796\n473#5,3:811\n473#5,3:817\n460#5,13:842\n473#5,3:856\n460#5,13:884\n473#5,3:898\n154#6:651\n154#6:657\n154#6:731\n154#6:810\n154#6:816\n154#6:863\n154#6:864\n73#7,7:663\n80#7:696\n84#7:741\n73#7,7:742\n80#7:775\n84#7:821\n67#8,6:865\n73#8:897\n77#8:902\n*S KotlinDebug\n*F\n+ 1 PriceComponent.kt\ncom/carrefour/fid/android/design/components/compose/PriceComponentKt\n*L\n258#1:583,7\n258#1:616\n261#1:617,7\n261#1:650\n261#1:656\n258#1:662\n295#1:697,7\n295#1:730\n295#1:736\n324#1:776,7\n324#1:809\n324#1:815\n355#1:823,6\n355#1:855\n355#1:860\n258#1:590\n258#1:592,11\n261#1:624\n261#1:626,11\n261#1:655\n258#1:661\n294#1:670\n294#1:672,11\n295#1:704\n295#1:706,11\n295#1:735\n294#1:740\n323#1:749\n323#1:751,11\n324#1:783\n324#1:785,11\n324#1:814\n323#1:820\n355#1:829\n355#1:831,11\n355#1:859\n400#1:871\n400#1:873,11\n400#1:901\n258#1:591\n261#1:625\n294#1:671\n295#1:705\n323#1:750\n324#1:784\n353#1:822\n355#1:830\n384#1:861\n393#1:862\n400#1:872\n258#1:603,13\n261#1:637,13\n261#1:652,3\n258#1:658,3\n294#1:683,13\n295#1:717,13\n295#1:732,3\n294#1:737,3\n323#1:762,13\n324#1:796,13\n324#1:811,3\n323#1:817,3\n355#1:842,13\n355#1:856,3\n400#1:884,13\n400#1:898,3\n269#1:651\n279#1:657\n306#1:731\n334#1:810\n339#1:816\n402#1:863\n403#1:864\n294#1:663,7\n294#1:696\n294#1:741\n323#1:742,7\n323#1:775\n323#1:821\n400#1:865,6\n400#1:897\n400#1:902\n*E\n"})
public final class PriceComponentKt {

    /* renamed from: a */
    public static final long f92308a = C16506u.m74712m(24);

    /* renamed from: b */
    public static final long f92309b = C16506u.m74712m(16);

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m151564a(@C12579k String str, boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        String str2 = str;
        boolean z3 = z;
        boolean z4 = z2;
        int i6 = i;
        Intrinsics.checkNotNullParameter(str2, "price");
        C8592o o = oVar.mo15009o(366550704);
        if ((i6 & 14) == 0) {
            if (o.mo15006n0(str2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo14961b(z3)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14961b(z4)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(366550704, i2, -1, "com.carrefour.fid.android.design.components.compose.PriceDefaultLarge (PriceComponent.kt:45)");
            }
            long j2 = f92308a;
            C37475b bVar = C37475b.f94185a;
            if (z4) {
                j = bVar.mo114220Q();
            } else {
                j = bVar.mo114257y();
            }
            int i7 = i2 << 9;
            m151581r(str, j2, j, (String) null, z, z2, o, (i2 & 14) | 3120 | (57344 & i7) | (i7 & 458752), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceDefaultLarge$1(str2, z3, z4, i6));
        }
    }

    @C8540g
    @C16464c(backgroundColor = 4294967295L, showBackground = true, widthDp = 500)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m151565b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1646697830);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1646697830, i, -1, "com.carrefour.fid.android.design.components.compose.PriceDefaultPreview (PriceComponent.kt:420)");
            }
            ThemeKt.m153788a(ComposableSingletons$PriceComponentKt.f92252a.mo112116b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceDefaultPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m151566c(@C12579k String str, boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        String str2 = str;
        boolean z3 = z;
        boolean z4 = z2;
        int i6 = i;
        Intrinsics.checkNotNullParameter(str2, "price");
        C8592o o = oVar.mo15009o(-1401422492);
        if ((i6 & 14) == 0) {
            if (o.mo15006n0(str2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo14961b(z3)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14961b(z4)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1401422492, i2, -1, "com.carrefour.fid.android.design.components.compose.PriceDefaultSmall (PriceComponent.kt:61)");
            }
            long j2 = f92309b;
            C37475b bVar = C37475b.f94185a;
            if (z4) {
                j = bVar.mo114220Q();
            } else {
                j = bVar.mo114257y();
            }
            int i7 = i2 << 6;
            m151580q(str, j2, j, z, z2, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, o, (i2 & 14) | 48 | (i7 & 7168) | (i7 & 57344), 32);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceDefaultSmall$1(str2, z3, z4, i6));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m151567d(@C12579k String str, @C12579k String str2, boolean z, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        String str3 = str;
        String str4 = str2;
        boolean z2 = z;
        int i6 = i;
        Intrinsics.checkNotNullParameter(str3, "price");
        Intrinsics.checkNotNullParameter(str4, "loyaltyDetail");
        C8592o o = oVar.mo15009o(1176341124);
        if ((i6 & 14) == 0) {
            if (o.mo15006n0(str3)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo15006n0(str4)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14961b(z2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1176341124, i2, -1, "com.carrefour.fid.android.design.components.compose.PriceLoyaltyLarge (PriceComponent.kt:181)");
            }
            m151580q(str, f92308a, C37475b.f94185a.mo114218O(), z, true, C8553b.m31048b(o, 2134793241, true, new PriceComponentKt$PriceLoyaltyLarge$1(str4, i2)), o, 221232 | (i2 & 14) | ((i2 << 3) & 7168), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceLoyaltyLarge$2(str3, str4, z2, i6));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m151568e(@C12579k String str, boolean z, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(str, "price");
        C8592o o = oVar.mo15009o(-2080782503);
        if ((i & 14) == 0) {
            if (o.mo15006n0(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14961b(z)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-2080782503, i2, -1, "com.carrefour.fid.android.design.components.compose.PriceLoyaltyLarge (PriceComponent.kt:218)");
            }
            m151580q(str, f92308a, C37475b.f94185a.mo114218O(), z, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, o, (i2 & 14) | 24624 | ((i2 << 6) & 7168), 32);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceLoyaltyLarge$3(str, z, i));
        }
    }

    @C8540g
    @C16464c(backgroundColor = 4294967295L, showBackground = true, widthDp = 500)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m151569f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1979653919);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1979653919, i, -1, "com.carrefour.fid.android.design.components.compose.PriceLoyaltyPreview (PriceComponent.kt:545)");
            }
            ThemeKt.m153788a(ComposableSingletons$PriceComponentKt.f92252a.mo112119e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceLoyaltyPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m151570g(@C12579k String str, @C12579k String str2, boolean z, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        String str3 = str;
        String str4 = str2;
        boolean z2 = z;
        int i6 = i;
        Intrinsics.checkNotNullParameter(str3, "price");
        Intrinsics.checkNotNullParameter(str4, "loyaltyDetail");
        C8592o o = oVar.mo15009o(-1651636912);
        if ((i6 & 14) == 0) {
            if (o.mo15006n0(str3)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo15006n0(str4)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14961b(z2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1651636912, i2, -1, "com.carrefour.fid.android.design.components.compose.PriceLoyaltySmall (PriceComponent.kt:198)");
            }
            m151580q(str, f92309b, C37475b.f94185a.mo114218O(), z, true, C8553b.m31048b(o, -693184795, true, new PriceComponentKt$PriceLoyaltySmall$1(str4, i2)), o, 221232 | (i2 & 14) | ((i2 << 3) & 7168), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceLoyaltySmall$2(str3, str4, z2, i6));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m151571h(@C12579k String str, boolean z, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(str, "price");
        C8592o o = oVar.mo15009o(1231854093);
        if ((i & 14) == 0) {
            if (o.mo15006n0(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14961b(z)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1231854093, i2, -1, "com.carrefour.fid.android.design.components.compose.PriceLoyaltySmall (PriceComponent.kt:235)");
            }
            m151580q(str, f92309b, C37475b.f94185a.mo114257y(), z, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, o, (i2 & 14) | 24624 | ((i2 << 6) & 7168), 32);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceLoyaltySmall$3(str, z, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m151572i(@C12579k String str, @C12579k String str2, boolean z, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        String str3 = str;
        String str4 = str2;
        boolean z2 = z;
        int i6 = i;
        Intrinsics.checkNotNullParameter(str3, "price");
        Intrinsics.checkNotNullParameter(str4, "loyaltyDetail");
        C8592o o = oVar.mo15009o(710265018);
        if ((i6 & 14) == 0) {
            if (o.mo15006n0(str3)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo15006n0(str4)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14961b(z2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(710265018, i2, -1, "com.carrefour.fid.android.design.components.compose.PriceMixtureLarge (PriceComponent.kt:113)");
            }
            m151580q(str, f92308a, C37475b.f94185a.mo114228Y(), z, true, C8553b.m31048b(o, 1668717135, true, new PriceComponentKt$PriceMixtureLarge$1(str4, i2)), o, 221232 | (i2 & 14) | ((i2 << 3) & 7168), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceMixtureLarge$2(str3, str4, z2, i6));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: j */
    public static final void m151573j(@C12579k String str, boolean z, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(str, "price");
        C8592o o = oVar.mo15009o(-1313375773);
        if ((i & 14) == 0) {
            if (o.mo15006n0(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14961b(z)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1313375773, i2, -1, "com.carrefour.fid.android.design.components.compose.PriceMixtureLarge (PriceComponent.kt:150)");
            }
            m151580q(str, f92308a, C37475b.f94185a.mo114257y(), z, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, o, (i2 & 14) | 24624 | ((i2 << 6) & 7168), 32);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceMixtureLarge$3(str, z, i));
        }
    }

    @C8540g
    @C16464c(backgroundColor = 4294967295L, showBackground = true, widthDp = 500)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: k */
    public static final void m151574k(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1025298601);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1025298601, i, -1, "com.carrefour.fid.android.design.components.compose.PriceMixturePreview (PriceComponent.kt:506)");
            }
            ThemeKt.m153788a(ComposableSingletons$PriceComponentKt.f92252a.mo112118d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceMixturePreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: l */
    public static final void m151575l(@C12579k String str, @C12579k String str2, boolean z, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        String str3 = str;
        String str4 = str2;
        boolean z2 = z;
        int i6 = i;
        Intrinsics.checkNotNullParameter(str3, "price");
        Intrinsics.checkNotNullParameter(str4, "loyaltyDetail");
        C8592o o = oVar.mo15009o(-2117713018);
        if ((i6 & 14) == 0) {
            if (o.mo15006n0(str3)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo15006n0(str4)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14961b(z2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-2117713018, i2, -1, "com.carrefour.fid.android.design.components.compose.PriceMixtureSmall (PriceComponent.kt:130)");
            }
            m151580q(str, f92309b, C37475b.f94185a.mo114228Y(), z, true, C8553b.m31048b(o, -1159260901, true, new PriceComponentKt$PriceMixtureSmall$1(str4, i2)), o, 221232 | (i2 & 14) | ((i2 << 3) & 7168), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceMixtureSmall$2(str3, str4, z2, i6));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: m */
    public static final void m151576m(@C12579k String str, boolean z, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(str, "price");
        C8592o o = oVar.mo15009o(1999260823);
        if ((i & 14) == 0) {
            if (o.mo15006n0(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14961b(z)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1999260823, i2, -1, "com.carrefour.fid.android.design.components.compose.PriceMixtureSmall (PriceComponent.kt:167)");
            }
            m151580q(str, f92309b, C37475b.f94185a.mo114257y(), z, false, (C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2>) null, o, (i2 & 14) | 24624 | ((i2 << 6) & 7168), 32);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PriceMixtureSmall$3(str, z, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: n */
    public static final void m151577n(@C12579k String str, @C12580l String str2, boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        String str3 = str;
        boolean z3 = z2;
        int i7 = i;
        Intrinsics.checkNotNullParameter(str3, "price");
        C8592o o = oVar.mo15009o(-94341449);
        if ((i7 & 14) == 0) {
            if (o.mo15006n0(str3)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            i2 = i7;
        }
        String str4 = str2;
        if ((i7 & 112) == 0) {
            if (o.mo15006n0(str4)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        boolean z4 = z;
        if ((i7 & 896) == 0) {
            if (o.mo14961b(z4)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i7 & 7168) == 0) {
            if (o.mo14961b(z3)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-94341449, i2, -1, "com.carrefour.fid.android.design.components.compose.PricePromoLarge (PriceComponent.kt:76)");
            }
            long j2 = f92308a;
            C37475b bVar = C37475b.f94185a;
            if (z3) {
                j = bVar.mo114228Y();
            } else {
                j = bVar.mo114257y();
            }
            int i8 = i2 << 6;
            m151581r(str, j2, j, str2, z, z2, o, (i2 & 14) | 48 | (i8 & 7168) | (57344 & i8) | (i8 & 458752), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PricePromoLarge$1(str, str2, z, z2, i));
        }
    }

    @C8540g
    @C16464c(backgroundColor = 4294967295L, showBackground = true, widthDp = 500)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: o */
    public static final void m151578o(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1819617704);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1819617704, i, -1, "com.carrefour.fid.android.design.components.compose.PricePromoPreview (PriceComponent.kt:461)");
            }
            ThemeKt.m153788a(ComposableSingletons$PriceComponentKt.f92252a.mo112117c(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PricePromoPreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: p */
    public static final void m151579p(@C12579k String str, @C12580l String str2, boolean z, boolean z2, @C12580l C8592o oVar, int i) {
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        String str3 = str;
        String str4 = str2;
        boolean z3 = z2;
        int i7 = i;
        Intrinsics.checkNotNullParameter(str3, "price");
        C8592o o = oVar.mo15009o(-1522571901);
        if ((i7 & 14) == 0) {
            if (o.mo15006n0(str3)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i7;
        } else {
            i2 = i7;
        }
        if ((i7 & 112) == 0) {
            if (o.mo15006n0(str4)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        boolean z4 = z;
        if ((i7 & 896) == 0) {
            if (o.mo14961b(z4)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i7 & 7168) == 0) {
            if (o.mo14961b(z3)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1522571901, i2, -1, "com.carrefour.fid.android.design.components.compose.PricePromoSmall (PriceComponent.kt:93)");
            }
            long j2 = f92309b;
            C37475b bVar = C37475b.f94185a;
            if (z3) {
                j = bVar.mo114228Y();
            } else {
                j = bVar.mo114257y();
            }
            C8552a b = C8553b.m31048b(o, 1186984792, true, new PriceComponentKt$PricePromoSmall$1(str4, i2));
            int i8 = i2 << 3;
            m151580q(str, j2, j, z, z2, b, o, 196656 | (i2 & 14) | (i8 & 7168) | (i8 & 57344), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$PricePromoSmall$2(str, str2, z, z2, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151580q(java.lang.String r19, long r20, long r22, boolean r24, boolean r25, kotlin.jvm.functions.C11305q<? super androidx.compose.foundation.layout.C2373k, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r26, androidx.compose.runtime.C8592o r27, int r28, int r29) {
        /*
            r6 = r24
            r7 = r25
            r9 = r28
            r0 = -971114245(0xffffffffc61df8fb, float:-10110.245)
            r1 = r27
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r2 = r29 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r9 | 6
            r4 = r2
            r2 = r19
            goto L_0x002d
        L_0x0019:
            r2 = r9 & 14
            if (r2 != 0) goto L_0x002a
            r2 = r19
            boolean r4 = r1.mo15006n0(r2)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r9
            goto L_0x002d
        L_0x002a:
            r2 = r19
            r4 = r9
        L_0x002d:
            r5 = r29 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
            r14 = r20
            goto L_0x0048
        L_0x0036:
            r5 = r9 & 112(0x70, float:1.57E-43)
            r14 = r20
            if (r5 != 0) goto L_0x0048
            boolean r5 = r1.mo14980g(r14)
            if (r5 == 0) goto L_0x0045
            r5 = 32
            goto L_0x0047
        L_0x0045:
            r5 = 16
        L_0x0047:
            r4 = r4 | r5
        L_0x0048:
            r5 = r29 & 4
            if (r5 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
            r12 = r22
            goto L_0x0063
        L_0x0051:
            r5 = r9 & 896(0x380, float:1.256E-42)
            r12 = r22
            if (r5 != 0) goto L_0x0063
            boolean r5 = r1.mo14980g(r12)
            if (r5 == 0) goto L_0x0060
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r5
        L_0x0063:
            r5 = r29 & 8
            if (r5 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r5 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007a
            boolean r5 = r1.mo14961b(r6)
            if (r5 == 0) goto L_0x0077
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r4 = r4 | r5
        L_0x007a:
            r5 = r29 & 16
            if (r5 == 0) goto L_0x0081
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0093
        L_0x0081:
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r9
            if (r5 != 0) goto L_0x0093
            boolean r5 = r1.mo14961b(r7)
            if (r5 == 0) goto L_0x0090
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r4 = r4 | r5
        L_0x0093:
            r5 = r29 & 32
            if (r5 == 0) goto L_0x009b
            r8 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r8
            goto L_0x00af
        L_0x009b:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r9
            if (r8 != 0) goto L_0x00af
            r8 = r26
            boolean r10 = r1.mo14927P(r8)
            if (r10 == 0) goto L_0x00ab
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r4 = r4 | r10
            goto L_0x00b1
        L_0x00af:
            r8 = r26
        L_0x00b1:
            r10 = 374491(0x5b6db, float:5.24774E-40)
            r10 = r10 & r4
            r11 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r11) goto L_0x00c6
            boolean r10 = r1.mo15011p()
            if (r10 != 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            r1.mo14958a0()
            goto L_0x027b
        L_0x00c6:
            if (r5 == 0) goto L_0x00cf
            com.carrefour.fid.android.design.components.compose.ComposableSingletons$PriceComponentKt r5 = com.carrefour.fid.android.design.components.compose.ComposableSingletons$PriceComponentKt.f92252a
            kotlin.jvm.functions.q r5 = r5.mo112115a()
            goto L_0x00d0
        L_0x00cf:
            r5 = r8
        L_0x00d0:
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x00dc
            r8 = -1
            java.lang.String r10 = "com.carrefour.fid.android.design.components.compose.PriceWithUnderneath (PriceComponent.kt:285)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r4, r8, r10)
        L_0x00dc:
            r0 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r1.mo14918M(r0)
            androidx.compose.ui.m$a r0 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r10 = r8.mo7631r()
            androidx.compose.ui.c$a r11 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r3 = r11.mo17072u()
            r2 = 0
            androidx.compose.ui.layout.f0 r3 = androidx.compose.foundation.layout.ColumnKt.m9863b(r10, r3, r1, r2)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r10)
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.unit.d r10 = (androidx.compose.p004ui.unit.C16479d) r10
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r2 = r1.mo15032w(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.p004ui.unit.LayoutDirection) r2
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.platform.c4 r9 = (androidx.compose.p004ui.platform.C15863c4) r9
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r12 = r16.mo44585a()
            kotlin.jvm.functions.q r13 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r14 = r1.mo15017r()
            boolean r14 = r14 instanceof androidx.compose.runtime.C8428d
            if (r14 != 0) goto L_0x012e
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x012e:
            r1.mo14938T()
            boolean r14 = r1.mo14997l()
            if (r14 == 0) goto L_0x013b
            r1.mo14947W(r12)
            goto L_0x013e
        L_0x013b:
            r1.mo14888A()
        L_0x013e:
            r1.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r14 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r3, r14)
            kotlin.jvm.functions.p r3 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r3)
            kotlin.jvm.functions.p r3 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r2, r3)
            kotlin.jvm.functions.p r2 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r2)
            r1.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r3 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r13.invoke(r2, r1, r9)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r2)
            androidx.compose.foundation.layout.ColumnScopeInstance r3 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            androidx.compose.ui.c$c r9 = r11.mo17070q()
            r10 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r10)
            androidx.compose.foundation.layout.Arrangement$d r8 = r8.mo7630p()
            r10 = 48
            androidx.compose.ui.layout.f0 r8 = androidx.compose.foundation.layout.RowKt.m10071d(r8, r9, r1, r10)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r11 = r1.mo15032w(r11)
            androidx.compose.ui.platform.c4 r11 = (androidx.compose.p004ui.platform.C15863c4) r11
            kotlin.jvm.functions.a r12 = r16.mo44585a()
            kotlin.jvm.functions.q r13 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r0)
            androidx.compose.runtime.d r14 = r1.mo15017r()
            boolean r14 = r14 instanceof androidx.compose.runtime.C8428d
            if (r14 != 0) goto L_0x01c7
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01c7:
            r1.mo14938T()
            boolean r14 = r1.mo14997l()
            if (r14 == 0) goto L_0x01d4
            r1.mo14947W(r12)
            goto L_0x01d7
        L_0x01d4:
            r1.mo14888A()
        L_0x01d7:
            r1.mo14941U()
            androidx.compose.runtime.o r12 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r14 = r16.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r12, r8, r14)
            kotlin.jvm.functions.p r8 = r16.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r12, r9, r8)
            kotlin.jvm.functions.p r8 = r16.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r12, r10, r8)
            kotlin.jvm.functions.p r8 = r16.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r12, r11, r8)
            r1.mo14972e()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r8 = androidx.compose.runtime.C8684u1.m31905a(r8)
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r13.invoke(r8, r1, r10)
            r1.mo14918M(r2)
            androidx.compose.foundation.layout.RowScopeInstance r2 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            int r2 = r4 << 3
            r8 = r2 & 112(0x70, float:1.57E-43)
            r9 = 6
            r8 = r8 | r9
            r10 = r2 & 896(0x380, float:1.256E-42)
            r8 = r8 | r10
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r17 = r8 | r2
            r18 = 0
            r10 = r0
            r11 = r19
            r12 = r20
            r14 = r22
            r16 = r1
            m151582s(r10, r11, r12, r14, r16, r17, r18)
            r2 = 1139057324(0x43e4a2ac, float:457.27087)
            r1.mo14918M(r2)
            if (r6 == 0) goto L_0x024a
            r2 = 4
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10092H(r0, r2)
            androidx.compose.foundation.layout.C2428y0.m10726a(r0, r1, r9)
            int r0 = r4 >> 12
            r0 = r0 & 14
            r2 = 0
            m151585v(r7, r1, r0, r2)
        L_0x024a:
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            int r0 = r4 >> 12
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.invoke(r3, r1, r0)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x027a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x027a:
            r8 = r5
        L_0x027b:
            androidx.compose.runtime.t1 r11 = r1.mo15020s()
            if (r11 != 0) goto L_0x0282
            goto L_0x0299
        L_0x0282:
            com.carrefour.fid.android.design.components.compose.PriceComponentKt$PriceWithUnderneath$2 r12 = new com.carrefour.fid.android.design.components.compose.PriceComponentKt$PriceWithUnderneath$2
            r0 = r12
            r1 = r19
            r2 = r20
            r4 = r22
            r6 = r24
            r7 = r25
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10)
            r11.mo15202a(r12)
        L_0x0299:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.PriceComponentKt.m151580q(java.lang.String, long, long, boolean, boolean, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c9  */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151581r(java.lang.String r21, long r22, long r24, java.lang.String r26, boolean r27, boolean r28, androidx.compose.runtime.C8592o r29, int r30, int r31) {
        /*
            r7 = r27
            r8 = r28
            r9 = r30
            r0 = -1185460900(0xffffffffb9574d5c, float:-2.0532816E-4)
            r1 = r29
            androidx.compose.runtime.o r6 = r1.mo15009o(r0)
            r1 = r31 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r9 | 6
            r4 = r21
            goto L_0x002a
        L_0x0018:
            r1 = r9 & 14
            r4 = r21
            if (r1 != 0) goto L_0x0029
            boolean r1 = r6.mo15006n0(r4)
            if (r1 == 0) goto L_0x0026
            r1 = 4
            goto L_0x0027
        L_0x0026:
            r1 = 2
        L_0x0027:
            r1 = r1 | r9
            goto L_0x002a
        L_0x0029:
            r1 = r9
        L_0x002a:
            r2 = r31 & 2
            if (r2 == 0) goto L_0x0031
            r1 = r1 | 48
            goto L_0x0044
        L_0x0031:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0044
            r2 = r22
            boolean r10 = r6.mo14980g(r2)
            if (r10 == 0) goto L_0x0040
            r10 = 32
            goto L_0x0042
        L_0x0040:
            r10 = 16
        L_0x0042:
            r1 = r1 | r10
            goto L_0x0046
        L_0x0044:
            r2 = r22
        L_0x0046:
            r10 = r31 & 4
            if (r10 == 0) goto L_0x004f
            r1 = r1 | 384(0x180, float:5.38E-43)
            r14 = r24
            goto L_0x0061
        L_0x004f:
            r10 = r9 & 896(0x380, float:1.256E-42)
            r14 = r24
            if (r10 != 0) goto L_0x0061
            boolean r10 = r6.mo14980g(r14)
            if (r10 == 0) goto L_0x005e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r1 = r1 | r10
        L_0x0061:
            r10 = r31 & 8
            if (r10 == 0) goto L_0x0068
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r11 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x007b
            r11 = r26
            boolean r12 = r6.mo15006n0(r11)
            if (r12 == 0) goto L_0x0077
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r12
            goto L_0x007d
        L_0x007b:
            r11 = r26
        L_0x007d:
            r12 = r31 & 16
            if (r12 == 0) goto L_0x0084
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0096
        L_0x0084:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r9
            if (r12 != 0) goto L_0x0096
            boolean r12 = r6.mo14961b(r7)
            if (r12 == 0) goto L_0x0093
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r1 = r1 | r12
        L_0x0096:
            r12 = r31 & 32
            if (r12 == 0) goto L_0x009e
            r12 = 196608(0x30000, float:2.75506E-40)
        L_0x009c:
            r1 = r1 | r12
            goto L_0x00af
        L_0x009e:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r9
            if (r12 != 0) goto L_0x00af
            boolean r12 = r6.mo14961b(r8)
            if (r12 == 0) goto L_0x00ac
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x009c
        L_0x00ac:
            r12 = 65536(0x10000, float:9.18355E-41)
            goto L_0x009c
        L_0x00af:
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r1
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r13) goto L_0x00c9
            boolean r12 = r6.mo15011p()
            if (r12 != 0) goto L_0x00bf
            goto L_0x00c9
        L_0x00bf:
            r6.mo14958a0()
            r20 = r11
            r11 = r6
            r6 = r20
            goto L_0x02a4
        L_0x00c9:
            if (r10 == 0) goto L_0x00cf
            r10 = 0
            r19 = r10
            goto L_0x00d1
        L_0x00cf:
            r19 = r11
        L_0x00d1:
            boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r10 == 0) goto L_0x00dd
            r10 = -1
            java.lang.String r11 = "com.carrefour.fid.android.design.components.compose.SideBySideVariant (PriceComponent.kt:249)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r10, r11)
        L_0x00dd:
            androidx.compose.ui.c$a r0 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r10 = r0.mo17070q()
            r11 = 693286680(0x2952b718, float:4.6788176E-14)
            r6.mo14918M(r11)
            androidx.compose.ui.m$a r12 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement r13 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r5 = r13.mo7630p()
            r11 = 48
            androidx.compose.ui.layout.f0 r5 = androidx.compose.foundation.layout.RowKt.m10071d(r5, r10, r6, r11)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r6.mo14918M(r10)
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r11 = r6.mo15032w(r11)
            androidx.compose.ui.unit.d r11 = (androidx.compose.p004ui.unit.C16479d) r11
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r6.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r2 = r6.mo15032w(r2)
            androidx.compose.ui.platform.c4 r2 = (androidx.compose.p004ui.platform.C15863c4) r2
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r4 = r3.mo44585a()
            kotlin.jvm.functions.q r9 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r12)
            androidx.compose.runtime.d r14 = r6.mo15017r()
            boolean r14 = r14 instanceof androidx.compose.runtime.C8428d
            if (r14 != 0) goto L_0x0130
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x0130:
            r6.mo14938T()
            boolean r14 = r6.mo14997l()
            if (r14 == 0) goto L_0x013d
            r6.mo14947W(r4)
            goto L_0x0140
        L_0x013d:
            r6.mo14888A()
        L_0x0140:
            r6.mo14941U()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.Updater.m30180b(r6)
            kotlin.jvm.functions.p r14 = r3.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r4, r5, r14)
            kotlin.jvm.functions.p r5 = r3.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r4, r11, r5)
            kotlin.jvm.functions.p r5 = r3.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r4, r10, r5)
            kotlin.jvm.functions.p r5 = r3.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r4, r2, r5)
            r6.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r6)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r5 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r9.invoke(r2, r6, r4)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r6.mo14918M(r2)
            androidx.compose.foundation.layout.RowScopeInstance r4 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r9 = 693286680(0x2952b718, float:4.6788176E-14)
            r6.mo14918M(r9)
            androidx.compose.foundation.layout.Arrangement$d r9 = r13.mo7630p()
            androidx.compose.ui.c$c r0 = r0.mo17073w()
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.RowKt.m10071d(r9, r0, r6, r5)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r6.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r6.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r6.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r11 = r6.mo15032w(r11)
            androidx.compose.ui.platform.c4 r11 = (androidx.compose.p004ui.platform.C15863c4) r11
            kotlin.jvm.functions.a r13 = r3.mo44585a()
            kotlin.jvm.functions.q r14 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r12)
            androidx.compose.runtime.d r15 = r6.mo15017r()
            boolean r15 = r15 instanceof androidx.compose.runtime.C8428d
            if (r15 != 0) goto L_0x01c7
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01c7:
            r6.mo14938T()
            boolean r15 = r6.mo14997l()
            if (r15 == 0) goto L_0x01d4
            r6.mo14947W(r13)
            goto L_0x01d7
        L_0x01d4:
            r6.mo14888A()
        L_0x01d7:
            r6.mo14941U()
            androidx.compose.runtime.o r13 = androidx.compose.runtime.Updater.m30180b(r6)
            kotlin.jvm.functions.p r15 = r3.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r13, r0, r15)
            kotlin.jvm.functions.p r0 = r3.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r13, r9, r0)
            kotlin.jvm.functions.p r0 = r3.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r13, r10, r0)
            kotlin.jvm.functions.p r0 = r3.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r13, r11, r0)
            r6.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r6)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r14.invoke(r0, r6, r3)
            r6.mo14918M(r2)
            androidx.compose.ui.m r10 = r4.mo7843c(r12)
            int r0 = r1 << 3
            r2 = r0 & 112(0x70, float:1.57E-43)
            r3 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r17 = r2 | r0
            r18 = 0
            r11 = r21
            r0 = r12
            r12 = r22
            r14 = r24
            r16 = r6
            m151582s(r10, r11, r12, r14, r16, r17, r18)
            r2 = -408947019(0xffffffffe79ff6b5, float:-1.5108144E24)
            r6.mo14918M(r2)
            r9 = 6
            if (r19 == 0) goto L_0x025c
            r10 = 4
            float r2 = (float) r10
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r2 = androidx.compose.foundation.layout.SizeKt.m10092H(r0, r2)
            androidx.compose.foundation.layout.C2428y0.m10726a(r2, r6, r9)
            androidx.compose.ui.m r2 = r4.mo7843c(r0)
            r3 = 1
            int r4 = r1 >> 6
            r4 = r4 & 112(0x70, float:1.57E-43)
            r11 = r4 | 384(0x180, float:5.38E-43)
            r12 = 0
            r13 = r1
            r1 = r2
            r2 = r19
            r4 = r6
            r14 = r10
            r10 = r5
            r5 = r11
            r11 = r6
            r6 = r12
            m151583t(r1, r2, r3, r4, r5, r6)
            goto L_0x0260
        L_0x025c:
            r13 = r1
            r10 = r5
            r11 = r6
            r14 = 4
        L_0x0260:
            r11.mo15002m0()
            r11.mo15002m0()
            r11.mo14896D()
            r11.mo15002m0()
            r11.mo15002m0()
            r1 = 509084341(0x1e5802b5, float:1.14355046E-20)
            r11.mo14918M(r1)
            if (r7 == 0) goto L_0x028a
            float r1 = (float) r14
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10092H(r0, r1)
            androidx.compose.foundation.layout.C2428y0.m10726a(r0, r11, r9)
            int r0 = r13 >> 15
            r0 = r0 & 14
            m151585v(r8, r11, r0, r10)
        L_0x028a:
            r11.mo15002m0()
            r11.mo15002m0()
            r11.mo14896D()
            r11.mo15002m0()
            r11.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x02a2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x02a2:
            r6 = r19
        L_0x02a4:
            androidx.compose.runtime.t1 r11 = r11.mo15020s()
            if (r11 != 0) goto L_0x02ab
            goto L_0x02c2
        L_0x02ab:
            com.carrefour.fid.android.design.components.compose.PriceComponentKt$SideBySideVariant$2 r12 = new com.carrefour.fid.android.design.components.compose.PriceComponentKt$SideBySideVariant$2
            r0 = r12
            r1 = r21
            r2 = r22
            r4 = r24
            r7 = r27
            r8 = r28
            r9 = r30
            r10 = r31
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10)
            r11.mo15202a(r12)
        L_0x02c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.PriceComponentKt.m151581r(java.lang.String, long, long, java.lang.String, boolean, boolean, androidx.compose.runtime.o, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151582s(androidx.compose.p004ui.C8767m r37, java.lang.String r38, long r39, long r41, androidx.compose.runtime.C8592o r43, int r44, int r45) {
        /*
            r2 = r38
            r7 = r44
            r0 = -188119775(0xfffffffff4c98521, float:-1.277285E32)
            r1 = r43
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            r3 = r45 & 1
            if (r3 == 0) goto L_0x0017
            r4 = r7 | 6
            r5 = r4
            r4 = r37
            goto L_0x002b
        L_0x0017:
            r4 = r7 & 14
            if (r4 != 0) goto L_0x0028
            r4 = r37
            boolean r5 = r1.mo15006n0(r4)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r7
            goto L_0x002b
        L_0x0028:
            r4 = r37
            r5 = r7
        L_0x002b:
            r6 = r45 & 2
            if (r6 == 0) goto L_0x0032
            r5 = r5 | 48
            goto L_0x0042
        L_0x0032:
            r6 = r7 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0042
            boolean r6 = r1.mo15006n0(r2)
            if (r6 == 0) goto L_0x003f
            r6 = 32
            goto L_0x0041
        L_0x003f:
            r6 = 16
        L_0x0041:
            r5 = r5 | r6
        L_0x0042:
            r6 = r45 & 4
            if (r6 == 0) goto L_0x0049
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x0049:
            r8 = r7 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x005c
            r8 = r39
            boolean r10 = r1.mo14980g(r8)
            if (r10 == 0) goto L_0x0058
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r5 = r5 | r10
            goto L_0x005e
        L_0x005c:
            r8 = r39
        L_0x005e:
            r10 = r45 & 8
            if (r10 == 0) goto L_0x0065
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0078
        L_0x0065:
            r11 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0078
            r11 = r41
            boolean r13 = r1.mo14980g(r11)
            if (r13 == 0) goto L_0x0074
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r5 = r5 | r13
            goto L_0x007a
        L_0x0078:
            r11 = r41
        L_0x007a:
            r13 = r5 & 5851(0x16db, float:8.199E-42)
            r14 = 1170(0x492, float:1.64E-42)
            if (r13 != r14) goto L_0x008e
            boolean r13 = r1.mo15011p()
            if (r13 != 0) goto L_0x0087
            goto L_0x008e
        L_0x0087:
            r1.mo14958a0()
            r3 = r4
            r5 = r11
            goto L_0x01fe
        L_0x008e:
            if (r3 == 0) goto L_0x0093
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x0094
        L_0x0093:
            r3 = r4
        L_0x0094:
            if (r6 == 0) goto L_0x009c
            r4 = 24
            long r8 = androidx.compose.p004ui.unit.C16506u.m74712m(r4)
        L_0x009c:
            r33 = r8
            if (r10 == 0) goto L_0x00a9
            androidx.compose.ui.graphics.j2$a r4 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r8 = r4.mo42841a()
            r35 = r8
            goto L_0x00ab
        L_0x00a9:
            r35 = r11
        L_0x00ab:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x00b7
            r4 = -1
            java.lang.String r6 = "com.carrefour.fid.android.design.components.compose.SimplePrice (PriceComponent.kt:345)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r5, r4, r6)
        L_0x00b7:
            java.lang.String r0 = "€"
            java.lang.String r8 = kotlin.text.StringsKt__StringsKt.removeSuffix((java.lang.String) r2, (java.lang.CharSequence) r0)
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70952g()
            java.lang.Object r0 = r1.mo15032w(r0)
            android.content.Context r0 = (android.content.Context) r0
            androidx.compose.ui.c$a r4 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r4 = r4.mo17062a()
            r6 = r5 & 14
            r6 = r6 | 384(0x180, float:5.38E-43)
            r9 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r9)
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r9 = r9.mo7630p()
            int r10 = r6 >> 3
            r11 = r10 & 14
            r10 = r10 & 112(0x70, float:1.57E-43)
            r10 = r10 | r11
            androidx.compose.ui.layout.f0 r4 = androidx.compose.foundation.layout.RowKt.m10071d(r9, r4, r1, r10)
            int r6 = r6 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r11 = r1.mo15032w(r11)
            androidx.compose.ui.platform.c4 r11 = (androidx.compose.p004ui.platform.C15863c4) r11
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r13 = r12.mo44585a()
            kotlin.jvm.functions.q r14 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            int r6 = r6 << 9
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | 6
            androidx.compose.runtime.d r15 = r1.mo15017r()
            boolean r15 = r15 instanceof androidx.compose.runtime.C8428d
            if (r15 != 0) goto L_0x012b
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x012b:
            r1.mo14938T()
            boolean r15 = r1.mo14997l()
            if (r15 == 0) goto L_0x0138
            r1.mo14947W(r13)
            goto L_0x013b
        L_0x0138:
            r1.mo14888A()
        L_0x013b:
            r1.mo14941U()
            androidx.compose.runtime.o r13 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r15 = r12.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r13, r4, r15)
            kotlin.jvm.functions.p r4 = r12.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r13, r9, r4)
            kotlin.jvm.functions.p r4 = r12.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r13, r10, r4)
            kotlin.jvm.functions.p r4 = r12.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r13, r11, r4)
            r1.mo14972e()
            androidx.compose.runtime.o r4 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r4 = androidx.compose.runtime.C8684u1.m31905a(r4)
            int r6 = r6 >> 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.invoke(r4, r1, r6)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r4)
            androidx.compose.foundation.layout.RowScopeInstance r4 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.ui.m r9 = r4.mo7843c(r6)
            com.carrefour.fid.android.design.components.compose.PriceComponentKt$SimplePrice$1$1 r10 = new com.carrefour.fid.android.design.components.compose.PriceComponentKt$SimplePrice$1$1
            r10.<init>(r2, r0)
            r0 = 0
            r11 = 0
            r12 = 1
            androidx.compose.ui.m r9 = androidx.compose.p004ui.semantics.SemanticsModifierKt.m71868c(r9, r11, r10, r12, r0)
            androidx.compose.ui.text.font.i0$a r0 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r15 = r0.mo46943F()
            androidx.compose.ui.text.font.u r16 = com.carrefour.fid.android.design.theme.C37477d.m153888O()
            r14 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            int r10 = r5 >> 3
            r12 = r10 & 896(0x380, float:1.256E-42)
            r10 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 | r12
            int r5 = r5 << 3
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r30 = r10 | r5
            r31 = 0
            r32 = 130960(0x1ff90, float:1.83514E-40)
            r10 = r35
            r5 = r12
            r12 = r33
            r29 = r1
            androidx.compose.material.TextKt.m14196c(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            androidx.compose.ui.m r9 = r4.mo7843c(r6)
            r4 = 14
            long r12 = androidx.compose.p004ui.unit.C16506u.m74712m(r4)
            androidx.compose.ui.text.font.i0 r15 = r0.mo46943F()
            androidx.compose.ui.text.font.u r16 = com.carrefour.fid.android.design.theme.C37477d.m153883J()
            java.lang.String r8 = "€"
            r0 = 199686(0x30c06, float:2.7982E-40)
            r30 = r5 | r0
            androidx.compose.material.TextKt.m14196c(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x01fa
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01fa:
            r8 = r33
            r5 = r35
        L_0x01fe:
            androidx.compose.runtime.t1 r10 = r1.mo15020s()
            if (r10 != 0) goto L_0x0205
            goto L_0x0216
        L_0x0205:
            com.carrefour.fid.android.design.components.compose.PriceComponentKt$SimplePrice$2 r11 = new com.carrefour.fid.android.design.components.compose.PriceComponentKt$SimplePrice$2
            r0 = r11
            r1 = r3
            r2 = r38
            r3 = r8
            r7 = r44
            r8 = r45
            r0.<init>(r1, r2, r3, r5, r7, r8)
            r10.mo15202a(r11)
        L_0x0216:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.PriceComponentKt.m151582s(androidx.compose.ui.m, java.lang.String, long, long, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: t */
    public static final void m151583t(C8767m mVar, String str, boolean z, C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        C8767m mVar3;
        C8767m mVar4;
        C16361p0 p0Var;
        int i4;
        int i5;
        int i6;
        String str2 = str;
        boolean z2 = z;
        int i7 = i;
        C8592o o = oVar.mo15009o(789032837);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i7 | 6;
            mVar2 = mVar;
        } else if ((i7 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i7;
        } else {
            mVar2 = mVar;
            i3 = i7;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i7 & 112) == 0) {
            if (o.mo15006n0(str2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i7 & 896) == 0) {
            if (o.mo14961b(z2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        int i9 = i3;
        if ((i9 & 731) != 146 || !o.mo15011p()) {
            if (i8 != 0) {
                mVar4 = C8767m.f23478j;
            } else {
                mVar4 = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(789032837, i9, -1, "com.carrefour.fid.android.design.components.compose.SubPrice (PriceComponent.kt:378)");
            }
            C8767m c = SemanticsModifierKt.m71868c(mVar4, false, new PriceComponentKt$SubPrice$1(str2, (Context) o.mo15032w(AndroidCompositionLocals_androidKt.m70952g())), 1, (Object) null);
            long m = C16506u.m74712m(12);
            long d = C15258l2.m66179d(4283914071L);
            o.mo14918M(1881042009);
            if (z2) {
                p0Var = new C16361p0(0, 0, (C16209i0) null, (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, C16434j.f40726b.mo47681b(), (C15205e4) null, (C16432i) null, (C16436k) null, 0, (C16442o) null, (C16051a0) null, (C16426h) null, (C16417f) null, (C16415e) null, 4190207, (DefaultConstructorMarker) null);
            } else {
                p0Var = (C16361p0) o.mo15032w(TextKt.m14199f());
            }
            o.mo15002m0();
            String str3 = str;
            C8767m mVar5 = mVar4;
            C8767m mVar6 = c;
            oVar2 = o;
            long j = d;
            long j2 = m;
            TextKt.m14196c(str3, mVar6, j, j2, (C16190e0) null, (C16209i0) null, C37477d.m153883J(), 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, p0Var, oVar2, ((i9 >> 3) & 14) | 3456, 0, 65456);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar3 = mVar5;
        } else {
            o.mo14958a0();
            oVar2 = o;
            mVar3 = mVar2;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$SubPrice$2(mVar3, str, z, i, i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151584u(@org.jetbrains.annotations.C12579k java.lang.String r20, long r21, @org.jetbrains.annotations.C12580l java.lang.String r23, boolean r24, boolean r25, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r26, int r27, int r28) {
        /*
            r9 = r20
            r10 = r25
            r11 = r27
            java.lang.String r0 = "price"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = -1572492739(0xffffffffa245aa3d, float:-2.6788602E-18)
            r1 = r26
            androidx.compose.runtime.o r12 = r1.mo15009o(r0)
            r1 = r28 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r11 | 6
            goto L_0x002b
        L_0x001b:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x002a
            boolean r1 = r12.mo15006n0(r9)
            if (r1 == 0) goto L_0x0027
            r1 = 4
            goto L_0x0028
        L_0x0027:
            r1 = 2
        L_0x0028:
            r1 = r1 | r11
            goto L_0x002b
        L_0x002a:
            r1 = r11
        L_0x002b:
            r2 = r28 & 2
            if (r2 == 0) goto L_0x0034
            r1 = r1 | 48
            r14 = r21
            goto L_0x0046
        L_0x0034:
            r2 = r11 & 112(0x70, float:1.57E-43)
            r14 = r21
            if (r2 != 0) goto L_0x0046
            boolean r2 = r12.mo14980g(r14)
            if (r2 == 0) goto L_0x0043
            r2 = 32
            goto L_0x0045
        L_0x0043:
            r2 = 16
        L_0x0045:
            r1 = r1 | r2
        L_0x0046:
            r2 = r28 & 4
            if (r2 == 0) goto L_0x004d
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x004d:
            r3 = r11 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0060
            r3 = r23
            boolean r4 = r12.mo15006n0(r3)
            if (r4 == 0) goto L_0x005c
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r1 = r1 | r4
            goto L_0x0062
        L_0x0060:
            r3 = r23
        L_0x0062:
            r4 = r28 & 8
            if (r4 == 0) goto L_0x0069
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x0069:
            r5 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007c
            r5 = r24
            boolean r6 = r12.mo14961b(r5)
            if (r6 == 0) goto L_0x0078
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r1 = r1 | r6
            goto L_0x007e
        L_0x007c:
            r5 = r24
        L_0x007e:
            r6 = r28 & 16
            if (r6 == 0) goto L_0x0085
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0097
        L_0x0085:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r11
            if (r6 != 0) goto L_0x0097
            boolean r6 = r12.mo14961b(r10)
            if (r6 == 0) goto L_0x0094
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r1 = r1 | r6
        L_0x0097:
            r8 = r1
            r1 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r8
            r6 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r6) goto L_0x00ad
            boolean r1 = r12.mo15011p()
            if (r1 != 0) goto L_0x00a7
            goto L_0x00ad
        L_0x00a7:
            r12.mo14958a0()
            r4 = r3
            goto L_0x0286
        L_0x00ad:
            if (r2 == 0) goto L_0x00b3
            r1 = 0
            r16 = r1
            goto L_0x00b5
        L_0x00b3:
            r16 = r3
        L_0x00b5:
            r7 = 0
            if (r4 == 0) goto L_0x00bb
            r17 = r7
            goto L_0x00bd
        L_0x00bb:
            r17 = r5
        L_0x00bd:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00c9
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.design.components.compose.SubPriceUnderneathVariant (PriceComponent.kt:315)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r8, r1, r2)
        L_0x00c9:
            r0 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r12.mo14918M(r0)
            androidx.compose.ui.m$a r6 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.layout.Arrangement r0 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r1 = r0.mo7631r()
            androidx.compose.ui.c$a r2 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r3 = r2.mo17072u()
            androidx.compose.ui.layout.f0 r1 = androidx.compose.foundation.layout.ColumnKt.m9863b(r1, r3, r12, r7)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.mo14918M(r3)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r12.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r12.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r13 = r12.mo15032w(r13)
            androidx.compose.ui.platform.c4 r13 = (androidx.compose.p004ui.platform.C15863c4) r13
            androidx.compose.ui.node.ComposeUiNode$Companion r18 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r3 = r18.mo44585a()
            kotlin.jvm.functions.q r7 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            androidx.compose.runtime.d r9 = r12.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x011a
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x011a:
            r12.mo14938T()
            boolean r9 = r12.mo14997l()
            if (r9 == 0) goto L_0x0127
            r12.mo14947W(r3)
            goto L_0x012a
        L_0x0127:
            r12.mo14888A()
        L_0x012a:
            r12.mo14941U()
            androidx.compose.runtime.o r3 = androidx.compose.runtime.Updater.m30180b(r12)
            kotlin.jvm.functions.p r9 = r18.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r3, r1, r9)
            kotlin.jvm.functions.p r1 = r18.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r3, r4, r1)
            kotlin.jvm.functions.p r1 = r18.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r3, r5, r1)
            kotlin.jvm.functions.p r1 = r18.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r3, r13, r1)
            r12.mo14972e()
            androidx.compose.runtime.o r1 = androidx.compose.runtime.C8684u1.m31906b(r12)
            androidx.compose.runtime.u1 r1 = androidx.compose.runtime.C8684u1.m31905a(r1)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r7.invoke(r1, r12, r4)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r12.mo14918M(r1)
            androidx.compose.foundation.layout.ColumnScopeInstance r3 = androidx.compose.foundation.layout.ColumnScopeInstance.f6049a
            androidx.compose.ui.c$c r2 = r2.mo17070q()
            r3 = 693286680(0x2952b718, float:4.6788176E-14)
            r12.mo14918M(r3)
            androidx.compose.foundation.layout.Arrangement$d r0 = r0.mo7630p()
            r3 = 48
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.RowKt.m10071d(r0, r2, r12, r3)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.mo14918M(r2)
            androidx.compose.runtime.i1 r2 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r2 = r12.mo15032w(r2)
            androidx.compose.ui.unit.d r2 = (androidx.compose.p004ui.unit.C16479d) r2
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r3 = r12.mo15032w(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p004ui.unit.LayoutDirection) r3
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r4 = r12.mo15032w(r4)
            androidx.compose.ui.platform.c4 r4 = (androidx.compose.p004ui.platform.C15863c4) r4
            kotlin.jvm.functions.a r5 = r18.mo44585a()
            kotlin.jvm.functions.q r7 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r6)
            androidx.compose.runtime.d r9 = r12.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x01b3
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x01b3:
            r12.mo14938T()
            boolean r9 = r12.mo14997l()
            if (r9 == 0) goto L_0x01c0
            r12.mo14947W(r5)
            goto L_0x01c3
        L_0x01c0:
            r12.mo14888A()
        L_0x01c3:
            r12.mo14941U()
            androidx.compose.runtime.o r5 = androidx.compose.runtime.Updater.m30180b(r12)
            kotlin.jvm.functions.p r9 = r18.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r5, r0, r9)
            kotlin.jvm.functions.p r0 = r18.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r5, r2, r0)
            kotlin.jvm.functions.p r0 = r18.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r5, r3, r0)
            kotlin.jvm.functions.p r0 = r18.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r5, r4, r0)
            r12.mo14972e()
            androidx.compose.runtime.o r0 = androidx.compose.runtime.C8684u1.m31906b(r12)
            androidx.compose.runtime.u1 r0 = androidx.compose.runtime.C8684u1.m31905a(r0)
            r9 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r7.invoke(r0, r12, r2)
            r12.mo14918M(r1)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r4 = 0
            int r0 = r8 << 3
            r1 = r0 & 112(0x70, float:1.57E-43)
            r13 = 6
            r1 = r1 | r13
            r0 = r0 & 896(0x380, float:1.256E-42)
            r7 = r1 | r0
            r18 = 8
            r0 = r6
            r1 = r20
            r2 = r21
            r9 = r6
            r6 = r12
            r19 = r8
            r8 = r18
            m151582s(r0, r1, r2, r4, r6, r7, r8)
            r0 = 389413113(0x1735f8f9, float:5.87985E-25)
            r12.mo14918M(r0)
            if (r10 == 0) goto L_0x0234
            r0 = 4
            float r1 = (float) r0
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10092H(r9, r0)
            androidx.compose.foundation.layout.C2428y0.m10726a(r0, r12, r13)
            r0 = 1
            r1 = 0
            m151585v(r1, r12, r1, r0)
        L_0x0234:
            r12.mo15002m0()
            r12.mo15002m0()
            r12.mo14896D()
            r12.mo15002m0()
            r12.mo15002m0()
            r0 = 1030296429(0x3d69136d, float:0.05690329)
            r12.mo14918M(r0)
            if (r16 == 0) goto L_0x026a
            r0 = 4
            float r0 = (float) r0
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10115o(r9, r0)
            androidx.compose.foundation.layout.C2428y0.m10726a(r0, r12, r13)
            r1 = 0
            int r0 = r19 >> 3
            r2 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 & 896(0x380, float:1.256E-42)
            r5 = r2 | r0
            r6 = 1
            r2 = r16
            r3 = r17
            r4 = r12
            m151583t(r1, r2, r3, r4, r5, r6)
        L_0x026a:
            r12.mo15002m0()
            r12.mo15002m0()
            r12.mo14896D()
            r12.mo15002m0()
            r12.mo15002m0()
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0282
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0282:
            r4 = r16
            r5 = r17
        L_0x0286:
            androidx.compose.runtime.t1 r9 = r12.mo15020s()
            if (r9 != 0) goto L_0x028d
            goto L_0x02a0
        L_0x028d:
            com.carrefour.fid.android.design.components.compose.PriceComponentKt$SubPriceUnderneathVariant$2 r12 = new com.carrefour.fid.android.design.components.compose.PriceComponentKt$SubPriceUnderneathVariant$2
            r0 = r12
            r1 = r20
            r2 = r21
            r6 = r25
            r7 = r27
            r8 = r28
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            r9.mo15202a(r12)
        L_0x02a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.PriceComponentKt.m151584u(java.lang.String, long, java.lang.String, boolean, boolean, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: v */
    public static final void m151585v(boolean z, C8592o oVar, int i, int i2) {
        int i3;
        C15249k2 k2Var;
        int i4;
        C8592o o = oVar.mo15009o(1399234031);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo14961b(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !o.mo15011p()) {
            if (i5 != 0) {
                z = true;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1399234031, i, -1, "com.carrefour.fid.android.design.components.compose.VariableWeightIcon (PriceComponent.kt:398)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m h = BorderKt.m8852h(SizeKt.m10087C(aVar, C16483g.m74435M((float) 23)), C16483g.m74435M((float) 1), C37475b.f94185a.mo114206C(), C2694o.m12166h(C16483g.m74435M((float) 4)));
            o.mo14918M(733328855);
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(h);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, k, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            Painter d = C16015f.m71849d(C36896b.C36904h.ds_ic_variable_weight, o, 0);
            C8767m c = boxScopeInstance.mo7701c(aVar, aVar2.mo17066i());
            if (z) {
                k2Var = null;
            } else {
                k2Var = C15249k2.C15250a.m66144d(C15249k2.f37569b, C15258l2.m66179d(4287795858L), 0, 2, (Object) null);
            }
            ImageKt.m8967b(d, C16018i.m71858d(C36896b.C36912p.accessibility_variable_price, o, 0), c, (C8734c) null, (C15541c) null, 0.0f, k2Var, o, 8, 56);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new PriceComponentKt$VariableWeightIcon$2(z, i, i2));
        }
    }
}
