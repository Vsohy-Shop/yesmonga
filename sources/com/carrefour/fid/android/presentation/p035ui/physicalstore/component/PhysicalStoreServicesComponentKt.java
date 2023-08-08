package com.carrefour.fid.android.presentation.p035ui.physicalstore.component;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
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
import com.bumptech.glide.C22090i;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37477d;
import com.carrefour.fid.android.design.theme.ThemeKt;
import com.skydoves.landscapist.C35314a;
import com.skydoves.landscapist.glide.C35325c;
import com.skydoves.landscapist.glide.C35326d;
import com.skydoves.landscapist.palette.BitmapPalette;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPhysicalStoreServicesComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreServicesComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreServicesComponentKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,139:1\n75#2,6:140\n81#2:172\n85#2:185\n75#2,6:186\n81#2:218\n85#2:232\n75#3:146\n76#3,11:148\n89#3:184\n75#3:192\n76#3,11:194\n89#3:231\n75#3:239\n76#3,11:241\n89#3:279\n76#4:147\n76#4:193\n76#4:240\n460#5,13:159\n36#5:173\n473#5,3:181\n460#5,13:205\n36#5:221\n473#5,3:228\n460#5,13:252\n36#5:267\n473#5,3:276\n1114#6,6:174\n1114#6,6:222\n1114#6,6:268\n154#7:180\n154#7:219\n154#7:220\n154#7:266\n154#7:274\n154#7:275\n74#8,6:233\n80#8:265\n84#8:280\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreServicesComponent.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/component/PhysicalStoreServicesComponentKt\n*L\n35#1:140,6\n35#1:172\n35#1:185\n62#1:186,6\n62#1:218\n62#1:232\n35#1:146\n35#1:148,11\n35#1:184\n62#1:192\n62#1:194,11\n62#1:231\n85#1:239\n85#1:241,11\n85#1:279\n35#1:147\n62#1:193\n85#1:240\n35#1:159,13\n44#1:173\n35#1:181,3\n62#1:205,13\n64#1:221\n62#1:228,3\n85#1:252,13\n87#1:267\n85#1:276,3\n44#1:174,6\n64#1:222,6\n87#1:268,6\n45#1:180\n66#1:219\n67#1:220\n88#1:266\n97#1:274\n105#1:275\n85#1:233,6\n85#1:265\n85#1:280\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreServicesComponentKt */
public final class PhysicalStoreServicesComponentKt {
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m109662a(@C12580l C8767m mVar, @C12579k String str, @C12579k String str2, @C12579k String str3, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        C8767m.C8768a aVar;
        C25394x1bb9c924 physicalStoreServicesComponentKt$PhysicalStoreServicesDetailsComponent$1$1$1;
        int i4;
        int i5;
        int i6;
        int i7;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i8 = i;
        Intrinsics.checkNotNullParameter(str4, "serviceName");
        Intrinsics.checkNotNullParameter(str5, "serviceDescription");
        Intrinsics.checkNotNullParameter(str6, "serviceIconUrl");
        C8592o o = oVar.mo15009o(1640648413);
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
        } else if ((i8 & 112) == 0) {
            if (o.mo15006n0(str4)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i8 & 896) == 0) {
            if (o.mo15006n0(str5)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (o.mo15006n0(str6)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        int i10 = i3;
        if ((i10 & 5851) != 1170 || !o.mo15011p()) {
            if (i9 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1640648413, i10, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreServicesDetailsComponent (PhysicalStoreServicesComponent.kt:78)");
            }
            int i11 = i10 & 14;
            o.mo14918M(-483455358);
            int i12 = i11 >> 3;
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), o, (i12 & 112) | (i12 & 14));
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
            int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
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
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i13 >> 3) & 112));
            o.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            C8767m.C8768a aVar2 = C8767m.f23478j;
            C8767m C = SizeKt.m10087C(aVar2, C16483g.m74435M((float) 48));
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(str6);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                C25394x1bb9c924 physicalStoreServicesComponentKt$PhysicalStoreServicesDetailsComponent$1$1$12 = new C25394x1bb9c924(str6);
                o.mo14893C(physicalStoreServicesComponentKt$PhysicalStoreServicesDetailsComponent$1$1$12);
                physicalStoreServicesComponentKt$PhysicalStoreServicesDetailsComponent$1$1$1 = physicalStoreServicesComponentKt$PhysicalStoreServicesDetailsComponent$1$1$12;
            } else {
                physicalStoreServicesComponentKt$PhysicalStoreServicesDetailsComponent$1$1$1 = N;
            }
            o.mo15002m0();
            C35325c.m145645b(physicalStoreServicesComponentKt$PhysicalStoreServicesDetailsComponent$1$1$1, C, (C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>>) null, (C11304p<? super C8592o, ? super Integer, ? extends C22561h>) null, (C22560g<Drawable>) null, (C8734c) null, (C15541c) null, (String) null, 0.0f, (C15249k2) null, (C35314a) null, (BitmapPalette) null, R.drawable.ds_il_store_active, ComposableSingletons$PhysicalStoreServicesComponentKt.f62484a.mo73982c(), (C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2>) null, (C11306r<? super C2362h, ? super C35326d.C35327a, ? super C8592o, ? super Integer, C11079d2>) null, o, 48, 3072, 53244);
            float f2 = (float) 8;
            C8767m o2 = PaddingKt.m10028o(aVar2, 0.0f, C16483g.m74435M(f2), 0.0f, 0.0f, 13, (Object) null);
            C16209i0 c = C16209i0.f40292b.mo46947c();
            C8767m.C8768a aVar3 = aVar2;
            float f3 = f2;
            C8592o oVar3 = o;
            C7933t0 t0Var = C7933t0.f19075a;
            int i14 = C7933t0.f19076b;
            C7933t0 t0Var2 = t0Var;
            int i15 = i14;
            TextKt.m14196c(str, o2, 0, 0, (C16190e0) null, c, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, t0Var.mo11077c(oVar3, i14).mo11097j(), oVar3, ((i10 >> 3) & 14) | 196656, 0, 65500);
            oVar2 = oVar3;
            oVar2.mo14918M(-1239191397);
            if (!C11622t.isBlank(str2)) {
                TextKt.m14196c(StringsKt__StringsKt.trim(str2).toString(), PaddingKt.m10028o(aVar3, 0.0f, C16483g.m74435M(f3), 0.0f, 0.0f, 13, (Object) null), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(t0Var2.mo11077c(oVar2, i15)), oVar2, 48, 0, 65532);
            }
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar2 = aVar;
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new C25395xf627e44b(mVar2, str, str2, str3, i, i2));
        }
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m109663b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-1040009889);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1040009889, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreServicesDetailsComponentPreview (PhysicalStoreServicesComponent.kt:118)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreServicesComponentKt.f62484a.mo73984e(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25396x3d1e97d8(i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m109664c(@C12580l C8767m mVar, @C12579k String str, @C12579k String str2, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        C8767m mVar2;
        C8592o oVar2;
        C8767m mVar3;
        C8767m.C8768a aVar;
        C25397x3b38ce2f physicalStoreServicesComponentKt$PhysicalStoreServicesItemComponent$1$1$1;
        int i4;
        int i5;
        int i6;
        String str3 = str;
        String str4 = str2;
        int i7 = i;
        Intrinsics.checkNotNullParameter(str3, "serviceName");
        Intrinsics.checkNotNullParameter(str4, "serviceIconUrl");
        C8592o o = oVar.mo15009o(1038998617);
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
            if (o.mo15006n0(str3)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i7 & 896) == 0) {
            if (o.mo15006n0(str4)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        int i9 = i3;
        if ((i9 & 731) != 146 || !o.mo15011p()) {
            if (i8 != 0) {
                aVar = C8767m.f23478j;
            } else {
                aVar = mVar2;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1038998617, i9, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreServicesItemComponent (PhysicalStoreServicesComponent.kt:56)");
            }
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), q, o, 48);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(n);
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
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            C8767m C = SizeKt.m10087C(PaddingKt.m10028o(C8767m.f23478j, 0.0f, 0.0f, C16483g.m74435M((float) 16), 0.0f, 11, (Object) null), C16483g.m74435M((float) 24));
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(str4);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                C25397x3b38ce2f physicalStoreServicesComponentKt$PhysicalStoreServicesItemComponent$1$1$12 = new C25397x3b38ce2f(str4);
                o.mo14893C(physicalStoreServicesComponentKt$PhysicalStoreServicesItemComponent$1$1$12);
                physicalStoreServicesComponentKt$PhysicalStoreServicesItemComponent$1$1$1 = physicalStoreServicesComponentKt$PhysicalStoreServicesItemComponent$1$1$12;
            } else {
                physicalStoreServicesComponentKt$PhysicalStoreServicesItemComponent$1$1$1 = N;
            }
            o.mo15002m0();
            C35325c.m145645b(physicalStoreServicesComponentKt$PhysicalStoreServicesItemComponent$1$1$1, C, (C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>>) null, (C11304p<? super C8592o, ? super Integer, ? extends C22561h>) null, (C22560g<Drawable>) null, (C8734c) null, (C15541c) null, (String) null, 0.0f, (C15249k2) null, (C35314a) null, (BitmapPalette) null, R.drawable.ds_il_store_active, ComposableSingletons$PhysicalStoreServicesComponentKt.f62484a.mo73981b(), (C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2>) null, (C11306r<? super C2362h, ? super C35326d.C35327a, ? super C8592o, ? super Integer, C11079d2>) null, o, 48, 3072, 53244);
            C8767m mVar4 = aVar;
            C8592o oVar3 = o;
            oVar2 = oVar3;
            TextKt.m14196c(str, (C8767m) null, 0, C16506u.m74712m(14), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153890b(C7933t0.f19075a.mo11077c(oVar3, C7933t0.f19076b)), oVar3, ((i9 >> 3) & 14) | 3072, 0, 65526);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            mVar3 = mVar4;
        } else {
            o.mo14958a0();
            mVar3 = mVar2;
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new C25398xb87126d6(mVar3, str, str2, i, i2));
        }
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m109665d(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(345592890);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(345592890, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreServicesItemComponentPreview (PhysicalStoreServicesComponent.kt:130)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreServicesComponentKt.f62484a.mo73985f(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25399x7b8a72ed(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreServicesComponentKt$PhysicalStoreServicesTitleComponent$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m109666e(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r29, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11289a<kotlin.C11079d2> r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32, int r33) {
        /*
            r0 = r32
            r1 = r33
            r2 = 1119659222(0x42bca4d6, float:94.321945)
            r3 = r31
            androidx.compose.runtime.o r15 = r3.mo15009o(r2)
            r3 = r1 & 1
            if (r3 == 0) goto L_0x0017
            r4 = r0 | 6
            r5 = r4
            r4 = r29
            goto L_0x002b
        L_0x0017:
            r4 = r0 & 14
            if (r4 != 0) goto L_0x0028
            r4 = r29
            boolean r5 = r15.mo15006n0(r4)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r0
            goto L_0x002b
        L_0x0028:
            r4 = r29
            r5 = r0
        L_0x002b:
            r6 = r1 & 2
            r14 = 16
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
            goto L_0x0046
        L_0x0034:
            r7 = r0 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0046
            r7 = r30
            boolean r8 = r15.mo14927P(r7)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0044
        L_0x0043:
            r8 = r14
        L_0x0044:
            r5 = r5 | r8
            goto L_0x0048
        L_0x0046:
            r7 = r30
        L_0x0048:
            r8 = r5 & 91
            r9 = 18
            if (r8 != r9) goto L_0x005c
            boolean r8 = r15.mo15011p()
            if (r8 != 0) goto L_0x0055
            goto L_0x005c
        L_0x0055:
            r15.mo14958a0()
            r2 = r7
            r0 = r15
            goto L_0x01d8
        L_0x005c:
            if (r3 == 0) goto L_0x0062
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r12 = r3
            goto L_0x0063
        L_0x0062:
            r12 = r4
        L_0x0063:
            if (r6 == 0) goto L_0x0069
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreServicesComponentKt$PhysicalStoreServicesTitleComponent$1 r3 = com.carrefour.fid.android.presentation.p035ui.physicalstore.component.C25400xbdb7eaf4.f62526f
            r13 = r3
            goto L_0x006a
        L_0x0069:
            r13 = r7
        L_0x006a:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0076
            r3 = -1
            java.lang.String r4 = "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreServicesTitleComponent (PhysicalStoreServicesComponent.kt:30)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r5, r3, r4)
        L_0x0076:
            androidx.compose.ui.c$a r2 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r2 = r2.mo17070q()
            r11 = 0
            r10 = 1
            r9 = 0
            androidx.compose.ui.m r3 = androidx.compose.foundation.layout.SizeKt.m10114n(r12, r11, r10, r9)
            r4 = 693286680(0x2952b718, float:4.6788176E-14)
            r15.mo14918M(r4)
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r4 = r4.mo7630p()
            r5 = 48
            androidx.compose.ui.layout.f0 r2 = androidx.compose.foundation.layout.RowKt.m10071d(r4, r2, r15, r5)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo14918M(r4)
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r4 = r15.mo15032w(r4)
            androidx.compose.ui.unit.d r4 = (androidx.compose.p004ui.unit.C16479d) r4
            androidx.compose.runtime.i1 r5 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r5 = r15.mo15032w(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p004ui.unit.LayoutDirection) r5
            androidx.compose.runtime.i1 r6 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r6 = r15.mo15032w(r6)
            androidx.compose.ui.platform.c4 r6 = (androidx.compose.p004ui.platform.C15863c4) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r8 = r7.mo44585a()
            kotlin.jvm.functions.q r3 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r3)
            androidx.compose.runtime.d r9 = r15.mo15017r()
            boolean r9 = r9 instanceof androidx.compose.runtime.C8428d
            if (r9 != 0) goto L_0x00ce
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x00ce:
            r15.mo14938T()
            boolean r9 = r15.mo14997l()
            if (r9 == 0) goto L_0x00db
            r15.mo14947W(r8)
            goto L_0x00de
        L_0x00db:
            r15.mo14888A()
        L_0x00de:
            r15.mo14941U()
            androidx.compose.runtime.o r8 = androidx.compose.runtime.Updater.m30180b(r15)
            kotlin.jvm.functions.p r9 = r7.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r8, r2, r9)
            kotlin.jvm.functions.p r2 = r7.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r8, r4, r2)
            kotlin.jvm.functions.p r2 = r7.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r8, r5, r2)
            kotlin.jvm.functions.p r2 = r7.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r8, r6, r2)
            r15.mo14972e()
            androidx.compose.runtime.o r2 = androidx.compose.runtime.C8684u1.m31906b(r15)
            androidx.compose.runtime.u1 r2 = androidx.compose.runtime.C8684u1.m31905a(r2)
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.invoke(r2, r15, r5)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15.mo14918M(r2)
            androidx.compose.foundation.layout.RowScopeInstance r16 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            r2 = 2131952700(0x7f13043c, float:1.954185E38)
            java.lang.String r3 = androidx.compose.p004ui.res.C16018i.m71858d(r2, r15, r4)
            androidx.compose.ui.m$a r17 = androidx.compose.p004ui.C8767m.f23478j
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r20 = 2
            r21 = 0
            androidx.compose.ui.m r4 = androidx.compose.foundation.layout.C2411u0.m10660e(r16, r17, r18, r19, r20, r21)
            r5 = 0
            r7 = 0
            r9 = 0
            r2 = 0
            androidx.compose.ui.text.font.i0$a r16 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r16 = r16.mo46947c()
            r10 = r16
            r16 = 0
            r11 = r16
            r16 = 0
            r28 = r12
            r2 = r13
            r12 = r16
            r16 = 0
            r14 = r16
            r5 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            androidx.compose.material.t0 r6 = androidx.compose.material.C7933t0.f19075a
            int r7 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r6 = r6.mo11077c(r5, r7)
            androidx.compose.ui.text.p0 r23 = r6.mo11097j()
            r25 = 196608(0x30000, float:2.75506E-40)
            r26 = 0
            r27 = 65500(0xffdc, float:9.1785E-41)
            r24 = r5
            r0 = r5
            r5 = 0
            r7 = 0
            androidx.compose.material.TextKt.m14196c(r3, r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r0.mo14918M(r3)
            boolean r3 = r0.mo15006n0(r2)
            java.lang.Object r4 = r0.mo14921N()
            if (r3 != 0) goto L_0x0190
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x0198
        L_0x0190:
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreServicesComponentKt$PhysicalStoreServicesTitleComponent$2$1$1 r4 = new com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreServicesComponentKt$PhysicalStoreServicesTitleComponent$2$1$1
            r4.<init>(r2)
            r0.mo14893C(r4)
        L_0x0198:
            r0.mo15002m0()
            r3 = r4
            kotlin.jvm.functions.a r3 = (kotlin.jvm.functions.C11289a) r3
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 16
            float r11 = (float) r11
            float r11 = androidx.compose.p004ui.unit.C16483g.m74435M(r11)
            r12 = 0
            r13 = 0
            r14 = 1
            androidx.compose.foundation.layout.i0 r11 = androidx.compose.foundation.layout.PaddingKt.m10016c(r13, r11, r14, r12)
            com.carrefour.fid.android.presentation.ui.physicalstore.component.ComposableSingletons$PhysicalStoreServicesComponentKt r12 = com.carrefour.fid.android.presentation.p035ui.physicalstore.component.ComposableSingletons$PhysicalStoreServicesComponentKt.f62484a
            kotlin.jvm.functions.q r12 = r12.mo73980a()
            r14 = 905969664(0x36000000, float:1.9073486E-6)
            r15 = 254(0xfe, float:3.56E-43)
            r13 = r0
            androidx.compose.material.ButtonKt.m13346d(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.mo15002m0()
            r0.mo14896D()
            r0.mo15002m0()
            r0.mo15002m0()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x01d6
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01d6:
            r4 = r28
        L_0x01d8:
            androidx.compose.runtime.t1 r0 = r0.mo15020s()
            if (r0 != 0) goto L_0x01df
            goto L_0x01e9
        L_0x01df:
            com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreServicesComponentKt$PhysicalStoreServicesTitleComponent$3 r3 = new com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreServicesComponentKt$PhysicalStoreServicesTitleComponent$3
            r5 = r32
            r3.<init>(r4, r2, r5, r1)
            r0.mo15202a(r3)
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreServicesComponentKt.m109666e(androidx.compose.ui.m, kotlin.jvm.functions.a, androidx.compose.runtime.o, int, int):void");
    }

    @C8540g
    @C16464c(showBackground = true)
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    public static final void m109667f(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-77972471);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-77972471, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.component.PhysicalStoreServicesTitleComponentPreview (PhysicalStoreServicesComponent.kt:112)");
            }
            ThemeKt.m153788a(ComposableSingletons$PhysicalStoreServicesComponentKt.f62484a.mo73983d(), o, 6);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new C25403x16239dee(i));
        }
    }
}
