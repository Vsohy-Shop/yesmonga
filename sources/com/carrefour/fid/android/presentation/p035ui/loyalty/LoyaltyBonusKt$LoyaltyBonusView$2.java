package com.carrefour.fid.android.presentation.p035ui.loyalty;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.cms.domain.models.LoyaltyBonus;
import com.carrefour.fid.android.design.theme.C37475b;
import com.skydoves.landscapist.C35314a;
import com.skydoves.landscapist.glide.C35325c;
import com.skydoves.landscapist.palette.BitmapPalette;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLoyaltyBonus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyBonus.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/LoyaltyBonusKt$LoyaltyBonusView$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,404:1\n154#2:405\n154#2:441\n154#2:442\n154#2:443\n154#2:444\n154#2:445\n154#2:446\n154#2:447\n154#2:448\n154#2:449\n79#3,2:406\n81#3:434\n85#3:454\n75#4:408\n76#4,11:410\n89#4:453\n76#5:409\n460#6,13:421\n473#6,3:450\n223#7,2:435\n223#7,2:437\n223#7,2:439\n*S KotlinDebug\n*F\n+ 1 LoyaltyBonus.kt\ncom/carrefour/fid/android/presentation/ui/loyalty/LoyaltyBonusKt$LoyaltyBonusView$2\n*L\n210#1:405\n221#1:441\n222#1:442\n234#1:443\n235#1:444\n247#1:445\n248#1:446\n261#1:447\n263#1:448\n269#1:449\n207#1:406,2\n207#1:434\n207#1:454\n207#1:408\n207#1:410,11\n207#1:453\n207#1:409\n207#1:421,13\n207#1:450,3\n215#1:435,2\n216#1:437,2\n217#1:439,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusKt$LoyaltyBonusView$2 */
public final class LoyaltyBonusKt$LoyaltyBonusView$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ boolean $bioBonusAvailable;
    final /* synthetic */ boolean $familyBonusAvailable;
    final /* synthetic */ boolean $marketBonusAvailable;
    final /* synthetic */ List<LoyaltyBonus> $primes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoyaltyBonusKt$LoyaltyBonusView$2(List<LoyaltyBonus> list, boolean z, boolean z2, boolean z3) {
        super(2);
        this.$primes = list;
        this.$bioBonusAvailable = z;
        this.$familyBonusAvailable = z2;
        this.$marketBonusAvailable = z3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-800716593, i2, -1, "com.carrefour.fid.android.presentation.ui.loyalty.LoyaltyBonusView.<anonymous> (LoyaltyBonus.kt:204)");
            }
            boolean z = false;
            C8767m m = PaddingKt.m10026m(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C16483g.m74435M((float) 20), 0.0f, 2, (Object) null);
            Arrangement.C2271e l = Arrangement.f6010a.mo7628l();
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            List<LoyaltyBonus> list = this.$primes;
            boolean z2 = this.$bioBonusAvailable;
            boolean z3 = this.$familyBonusAvailable;
            boolean z4 = this.$marketBonusAvailable;
            oVar2.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(l, q, oVar2, 54);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(m);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b = Updater.m30180b(oVar);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            boolean z5 = false;
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            Iterable<LoyaltyBonus> iterable = list;
            for (LoyaltyBonus loyaltyBonus : iterable) {
                if (Intrinsics.areEqual((Object) loyaltyBonus.getPrimeId(), (Object) "CLUB_BIO")) {
                    for (LoyaltyBonus loyaltyBonus2 : iterable) {
                        if (Intrinsics.areEqual((Object) loyaltyBonus2.getPrimeId(), (Object) "CLUB_FAMILLE")) {
                            for (LoyaltyBonus loyaltyBonus3 : iterable) {
                                if (Intrinsics.areEqual((Object) loyaltyBonus3.getPrimeId(), (Object) "CLUB_MARCHE")) {
                                    C8767m.C8768a aVar = C8767m.f23478j;
                                    float f2 = (float) 5;
                                    float f3 = (float) 50;
                                    float f4 = f3;
                                    C8767m C = SizeKt.m10087C(PaddingKt.m10028o(aVar, C16483g.m74435M(f2), 0.0f, 0.0f, 0.0f, 14, (Object) null), C16483g.m74435M(f3));
                                    LoyaltyBonusKt$LoyaltyBonusView$2$1$1 loyaltyBonusKt$LoyaltyBonusView$2$1$1 = r12;
                                    LoyaltyBonusKt$LoyaltyBonusView$2$1$1 loyaltyBonusKt$LoyaltyBonusView$2$1$12 = new LoyaltyBonusKt$LoyaltyBonusView$2$1$1(z2, loyaltyBonus);
                                    float f5 = f2;
                                    LoyaltyBonus loyaltyBonus4 = loyaltyBonus3;
                                    RowScopeInstance rowScopeInstance2 = rowScopeInstance;
                                    C8767m.C8768a aVar2 = aVar;
                                    C35325c.m145647d(loyaltyBonusKt$LoyaltyBonusView$2$1$1, C, (C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>>) null, (C11304p<? super C8592o, ? super Integer, ? extends C22561h>) null, (C22560g<Drawable>) null, (C8734c) null, (C15541c) null, (String) null, 0.0f, (C15249k2) null, (C35314a) null, (BitmapPalette) null, (Object) null, (Object) null, 0, oVar, 48, 0, 32764);
                                    C8767m C2 = SizeKt.m10087C(PaddingKt.m10028o(aVar2, C16483g.m74435M(f5), 0.0f, 0.0f, 0.0f, 14, (Object) null), C16483g.m74435M(f4));
                                    LoyaltyBonusKt$LoyaltyBonusView$2$1$2 loyaltyBonusKt$LoyaltyBonusView$2$1$2 = r3;
                                    LoyaltyBonusKt$LoyaltyBonusView$2$1$2 loyaltyBonusKt$LoyaltyBonusView$2$1$22 = new LoyaltyBonusKt$LoyaltyBonusView$2$1$2(z3, loyaltyBonus2);
                                    C35325c.m145647d(loyaltyBonusKt$LoyaltyBonusView$2$1$2, C2, (C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>>) null, (C11304p<? super C8592o, ? super Integer, ? extends C22561h>) null, (C22560g<Drawable>) null, (C8734c) null, (C15541c) null, (String) null, 0.0f, (C15249k2) null, (C35314a) null, (BitmapPalette) null, (Object) null, (Object) null, 0, oVar, 48, 0, 32764);
                                    C8767m C3 = SizeKt.m10087C(PaddingKt.m10028o(aVar2, C16483g.m74435M(f5), 0.0f, 0.0f, 0.0f, 14, (Object) null), C16483g.m74435M(f4));
                                    LoyaltyBonusKt$LoyaltyBonusView$2$1$3 loyaltyBonusKt$LoyaltyBonusView$2$1$3 = r3;
                                    LoyaltyBonusKt$LoyaltyBonusView$2$1$3 loyaltyBonusKt$LoyaltyBonusView$2$1$32 = new LoyaltyBonusKt$LoyaltyBonusView$2$1$3(z4, loyaltyBonus4);
                                    C35325c.m145647d(loyaltyBonusKt$LoyaltyBonusView$2$1$3, C3, (C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>>) null, (C11304p<? super C8592o, ? super Integer, ? extends C22561h>) null, (C22560g<Drawable>) null, (C8734c) null, (C15541c) null, (String) null, 0.0f, (C15249k2) null, (C35314a) null, (BitmapPalette) null, (Object) null, (Object) null, 0, oVar, 48, 0, 32764);
                                    C37475b bVar = C37475b.f94185a;
                                    C8592o oVar3 = oVar;
                                    DividerKt.m13428a(SizeKt.m10092H(SizeKt.m10110j(PaddingKt.m10028o(aVar2, C16483g.m74435M((float) 10), 0.0f, 0.0f, 0.0f, 14, (Object) null), 0.0f, 1, (Object) null), C16483g.m74435M((float) 1)), bVar.mo114206C(), 0.0f, 0.0f, oVar3, 6, 12);
                                    IconKt.m13539b(C16015f.m71849d(R.drawable.ic_right_arrow, oVar, 0), (String) null, PaddingKt.m10028o(rowScopeInstance2.mo7845f(aVar2, C8734c.f23406a.mo17070q()), 0.0f, 0.0f, C16483g.m74435M(f5), 0.0f, 11, (Object) null), bVar.mo114218O(), oVar3, 56, 0);
                                    oVar.mo15002m0();
                                    oVar.mo14896D();
                                    oVar.mo15002m0();
                                    oVar.mo15002m0();
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29843v0();
                                        return;
                                    }
                                    return;
                                }
                                boolean z6 = z;
                                boolean z7 = z5;
                                boolean z8 = z6;
                                boolean z9 = z7;
                                z = z8;
                                z5 = z9;
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        boolean z10 = z;
                        boolean z11 = z5;
                        boolean z12 = z10;
                        boolean z13 = z11;
                        z = z12;
                        z5 = z13;
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                boolean z14 = z;
                boolean z15 = z5;
                boolean z16 = z14;
                boolean z17 = z15;
                z = z16;
                z5 = z17;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        oVar.mo14958a0();
    }
}
