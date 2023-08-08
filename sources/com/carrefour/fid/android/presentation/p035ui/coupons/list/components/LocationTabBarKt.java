package com.carrefour.fid.android.presentation.p035ui.coupons.list.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TabRowKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.ThemeKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLocationTabBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationTabBar.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/LocationTabBarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,85:1\n154#2:86\n*S KotlinDebug\n*F\n+ 1 LocationTabBar.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/components/LocationTabBarKt\n*L\n33#1:86\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.components.LocationTabBarKt */
public final class LocationTabBarKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m105658a(String str, boolean z, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        C16209i0 i0Var;
        int i3;
        int i4;
        String str2 = str;
        boolean z2 = z;
        int i5 = i;
        C8592o o = oVar.mo15009o(1409074860);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(str2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14961b(z2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1409074860, i6, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.CouponsTabItem (LocationTabBar.kt:66)");
            }
            long O = C37475b.f94185a.mo114218O();
            C16209i0.C16210a aVar = C16209i0.f40292b;
            if (z2) {
                i0Var = aVar.mo46947c();
            } else {
                i0Var = aVar.mo46951k();
            }
            C16361p0 j = C7933t0.f19075a.mo11077c(o, C7933t0.f19076b).mo11097j();
            oVar2 = o;
            TextKt.m14196c(str, (C8767m) null, O, 0, (C16190e0) null, i0Var, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, C16449r.f40760b.mo47727c(), false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, j, oVar2, i6 & 14, 3120, 55258);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new LocationTabBarKt$CouponsTabItem$1(str, z, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m105659b(@C12579k TabPage tabPage, @C12579k C11300l<? super TabPage, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        int i4;
        TabPage tabPage2 = tabPage;
        C11300l<? super TabPage, C11079d2> lVar2 = lVar;
        int i5 = i;
        Intrinsics.checkNotNullParameter(tabPage2, "selectedTab");
        Intrinsics.checkNotNullParameter(lVar2, "onTabClicked");
        C8592o o = oVar.mo15009o(-646664310);
        if ((i5 & 14) == 0) {
            if (o.mo15006n0(tabPage2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i5 & 112) == 0) {
            if (o.mo14927P(lVar2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-646664310, i2, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.LocationTabBar (LocationTabBar.kt:26)");
            }
            C8767m n = SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null);
            int q = tabPage.mo69923q();
            C37475b bVar = C37475b.f94185a;
            long O = bVar.mo114218O();
            oVar2 = o;
            TabRowKt.m14103a(q, n, bVar.mo114231a0(), O, C16483g.m74435M((float) 0), C8553b.m31048b(o, 517265066, true, new LocationTabBarKt$LocationTabBar$1(tabPage2)), (C11304p<? super C8592o, ? super Integer, C11079d2>) null, C8553b.m31048b(o, 468346026, true, new LocationTabBarKt$LocationTabBar$2(tabPage2, lVar2, i2)), o, 12804144, 64);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new LocationTabBarKt$LocationTabBar$3(tabPage2, lVar2, i5));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m105660c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1085856639);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1085856639, i, -1, "com.carrefour.fid.android.presentation.ui.coupons.list.components.LocationTabBarPreview (LocationTabBar.kt:79)");
            }
            ThemeKt.m153788a(ComposableSingletons$LocationTabBarKt.f60023a.mo69874a(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new LocationTabBarKt$LocationTabBarPreview$1(i));
        }
    }
}
