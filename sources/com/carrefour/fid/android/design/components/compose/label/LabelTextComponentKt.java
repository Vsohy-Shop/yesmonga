package com.carrefour.fid.android.design.components.compose.label;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLabelTextComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LabelTextComponent.kt\ncom/carrefour/fid/android/design/components/compose/label/LabelTextComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,127:1\n154#2:128\n154#2:129\n*S KotlinDebug\n*F\n+ 1 LabelTextComponent.kt\ncom/carrefour/fid/android/design/components/compose/label/LabelTextComponentKt\n*L\n25#1:128\n54#1:129\n*E\n"})
public final class LabelTextComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m151872a(@C12580l C8767m mVar, long j, long j2, @C12579k String str, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8767m mVar3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j3 = j2;
        String str2 = str;
        int i8 = i;
        Intrinsics.checkNotNullParameter(str2, "text");
        C8592o o = oVar.mo15009o(-1295414658);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i8 | 6;
            mVar2 = mVar;
        } else if ((i8 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i8;
        } else {
            mVar2 = mVar;
            i3 = i8;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            long j4 = j;
        } else {
            long j5 = j;
            if ((i8 & 112) == 0) {
                if (o.mo14980g(j5)) {
                    i6 = 32;
                } else {
                    i6 = 16;
                }
                i3 |= i6;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i8 & 896) == 0) {
            if (o.mo14980g(j3)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (o.mo15006n0(str2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 5851) != 1170 || !o.mo15011p()) {
            if (i9 != 0) {
                mVar3 = C8767m.f23478j;
            } else {
                mVar3 = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1295414658, i3, -1, "com.carrefour.fid.android.design.components.compose.label.LabelTextLarge (LabelTextComponent.kt:15)");
            }
            BaseLabelComponentKt.m151754e(j, mVar3, C16483g.m74435M((float) 4), C8553b.m31048b(o, -877003487, true, new LabelTextComponentKt$LabelTextLarge$1(j3, str2, i3)), o, ((i3 >> 3) & 14) | 3456 | ((i3 << 3) & 112), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar2 = mVar3;
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelTextComponentKt$LabelTextLarge$2(mVar2, j, j2, str, i, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m151873b(@C12579k String str, @C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(str, "text");
        C8592o o = oVar.mo15009o(906433806);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo15006n0(mVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (i6 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(906433806, i3, -1, "com.carrefour.fid.android.design.components.compose.label.LabelTextLargeLoyalty (LabelTextComponent.kt:68)");
            }
            C37475b bVar = C37475b.f94185a;
            m151872a(mVar, bVar.mo114236d(), bVar.mo114220Q(), str, o, ((i3 >> 3) & 14) | ((i3 << 9) & 7168), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelTextComponentKt$LabelTextLargeLoyalty$1(str, mVar, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m151874c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(723253710);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(723253710, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelTextLargePreview (LabelTextComponent.kt:77)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelTextComponentKt.f92499a.mo112528b(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelTextComponentKt$LabelTextLargePreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m151875d(@C12579k String str, @C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(str, "text");
        C8592o o = oVar.mo15009o(2055888043);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo15006n0(mVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (i6 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2055888043, i3, -1, "com.carrefour.fid.android.design.components.compose.label.LabelTextLargePromotion (LabelTextComponent.kt:60)");
            }
            C37475b bVar = C37475b.f94185a;
            m151872a(mVar, bVar.mo114222S(), bVar.mo114221R(), str, o, ((i3 >> 3) & 14) | ((i3 << 9) & 7168), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelTextComponentKt$LabelTextLargePromotion$1(str, mVar, i, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m151876e(@C12579k String str, @C12580l C8767m mVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(str, "text");
        C8592o o = oVar.mo15009o(-1470956648);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo15006n0(mVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !o.mo15011p()) {
            if (i6 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1470956648, i3, -1, "com.carrefour.fid.android.design.components.compose.label.LabelTextLargeUnavailable (LabelTextComponent.kt:31)");
            }
            C37475b bVar = C37475b.f94185a;
            m151872a(mVar, bVar.mo114206C(), bVar.mo114257y(), str, o, ((i3 >> 3) & 14) | ((i3 << 9) & 7168), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelTextComponentKt$LabelTextLargeUnavailable$1(str, mVar, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m151877f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-30367314);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-30367314, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelTextLargeUnavailablePreview (LabelTextComponent.kt:105)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelTextComponentKt.f92499a.mo112532f(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelTextComponentKt$LabelTextLargeUnavailablePreview$1(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    public static final void m151878g(@C12580l C8767m mVar, long j, long j2, @C12579k String str, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8767m mVar3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j3 = j2;
        String str2 = str;
        int i8 = i;
        Intrinsics.checkNotNullParameter(str2, "text");
        C8592o o = oVar.mo15009o(1700982090);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i8 | 6;
            mVar2 = mVar;
        } else if ((i8 & 14) == 0) {
            mVar2 = mVar;
            if (o.mo15006n0(mVar2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i8;
        } else {
            mVar2 = mVar;
            i3 = i8;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            long j4 = j;
        } else {
            long j5 = j;
            if ((i8 & 112) == 0) {
                if (o.mo14980g(j5)) {
                    i6 = 32;
                } else {
                    i6 = 16;
                }
                i3 |= i6;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i8 & 896) == 0) {
            if (o.mo14980g(j3)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (o.mo15006n0(str2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 5851) != 1170 || !o.mo15011p()) {
            if (i9 != 0) {
                mVar3 = C8767m.f23478j;
            } else {
                mVar3 = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1700982090, i3, -1, "com.carrefour.fid.android.design.components.compose.label.LabelTextSmall (LabelTextComponent.kt:44)");
            }
            BaseLabelComponentKt.m151754e(j, mVar3, C16483g.m74435M((float) 4), C8553b.m31048b(o, 2119393261, true, new LabelTextComponentKt$LabelTextSmall$1(j3, str2, i3)), o, ((i3 >> 3) & 14) | 3456 | ((i3 << 3) & 112), 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar2 = mVar3;
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelTextComponentKt$LabelTextSmall$2(mVar2, j, j2, str, i, i2));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m151879h(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(2016524954);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2016524954, i, -1, "com.carrefour.fid.android.design.components.compose.label.LabelTextSmallPreview (LabelTextComponent.kt:91)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelTextComponentKt.f92499a.mo112530d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelTextComponentKt$LabelTextSmallPreview$1(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m151880i(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-281954900);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-281954900, i, -1, "com.carrefour.fid.android.design.components.compose.label.PreformatLabelTextLargePreview (LabelTextComponent.kt:117)");
            }
            ThemeKt.m153788a(ComposableSingletons$LabelTextComponentKt.f92499a.mo112533g(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LabelTextComponentKt$PreformatLabelTextLargePreview$1(i));
        }
    }
}
