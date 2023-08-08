package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.C2762c;
import androidx.compose.material.C7933t0;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.tooling.preview.C16464c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.compose.ActiveState;
import com.carrefour.fid.android.design.components.compose.C37020p;
import com.carrefour.fid.android.design.components.compose.PhysicalStoreInfo;
import com.carrefour.fid.android.design.components.compose.Service;
import com.carrefour.fid.android.design.theme.C37474a;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSetServiceComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetServiceComponent.kt\ncom/carrefour/fid/android/design/components/compose/SetServiceComponentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,529:1\n154#2:530\n154#2:531\n154#2:532\n154#2:533\n154#2:534\n154#2:535\n154#2:536\n154#2:537\n154#2:538\n154#2:539\n154#2:540\n154#2:541\n154#2:542\n154#2:557\n154#2:558\n154#2:599\n154#2:600\n154#2:601\n154#2:602\n154#2:623\n154#2:624\n154#2:625\n154#2:626\n154#2:660\n25#3:543\n36#3:550\n36#3:559\n460#3,13:585\n473#3,3:603\n460#3,13:646\n473#3,3:661\n25#3:669\n25#3:676\n25#3:683\n25#3:690\n25#3:697\n25#3:704\n25#3:711\n25#3:718\n25#3:725\n25#3:732\n25#3:739\n25#3:746\n25#3:753\n25#3:760\n25#3:767\n25#3:774\n1114#4,6:544\n1114#4,6:551\n1114#4,6:560\n1114#4,6:670\n1114#4,6:677\n1114#4,6:684\n1114#4,6:691\n1114#4,6:698\n1114#4,6:705\n1114#4,6:712\n1114#4,6:719\n1114#4,6:726\n1114#4,6:733\n1114#4,6:740\n1114#4,6:747\n1114#4,6:754\n1114#4,6:761\n1114#4,6:768\n1114#4,6:775\n75#5,6:566\n81#5:598\n85#5:607\n75#5,6:627\n81#5:659\n85#5:665\n75#6:572\n76#6,11:574\n89#6:606\n75#6:633\n76#6,11:635\n89#6:664\n76#7:573\n76#7:634\n1098#8:608\n927#8,6:609\n1098#8:615\n927#8,6:616\n1098#8:622\n766#9:666\n857#9,2:667\n*S KotlinDebug\n*F\n+ 1 SetServiceComponent.kt\ncom/carrefour/fid/android/design/components/compose/SetServiceComponentKt\n*L\n63#1:530\n64#1:531\n65#1:532\n81#1:533\n82#1:534\n84#1:535\n202#1:536\n203#1:537\n211#1:538\n237#1:539\n238#1:540\n251#1:541\n260#1:542\n276#1:557\n277#1:558\n283#1:599\n291#1:600\n292#1:601\n299#1:602\n342#1:623\n343#1:624\n352#1:625\n364#1:626\n368#1:660\n262#1:543\n264#1:550\n278#1:559\n273#1:585,13\n273#1:603,3\n361#1:646,13\n361#1:661,3\n431#1:669\n439#1:676\n440#1:683\n441#1:690\n460#1:697\n461#1:704\n462#1:711\n463#1:718\n482#1:725\n483#1:732\n484#1:739\n485#1:746\n504#1:753\n512#1:760\n513#1:767\n514#1:774\n262#1:544,6\n264#1:551,6\n278#1:560,6\n431#1:670,6\n439#1:677,6\n440#1:684,6\n441#1:691,6\n460#1:698,6\n461#1:705,6\n462#1:712,6\n463#1:719,6\n482#1:726,6\n483#1:733,6\n484#1:740,6\n485#1:747,6\n504#1:754,6\n512#1:761,6\n513#1:768,6\n514#1:775,6\n273#1:566,6\n273#1:598\n273#1:607\n361#1:627,6\n361#1:659\n361#1:665\n273#1:572\n273#1:574,11\n273#1:606\n361#1:633\n361#1:635,11\n361#1:664\n273#1:573\n361#1:634\n319#1:608\n320#1:609,6\n328#1:615\n329#1:616,6\n337#1:622\n386#1:666\n386#1:667,2\n*E\n"})
public final class SetServiceComponentKt {
    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m151625a(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-643754656);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-643754656, i, -1, "com.carrefour.fid.android.design.components.compose.ClcvSteadyPreview (SetServiceComponent.kt:458)");
            }
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            C8592o.C8593a aVar = C8592o.f23032a;
            if (N == aVar.mo16277a()) {
                N = C8539f2.m30981g(ActiveState.Steady.f92086a, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C8700z0 z0Var = (C8700z0) N;
            o.mo14918M(-492369756);
            Object N2 = o.mo14921N();
            if (N2 == aVar.mo16277a()) {
                N2 = C8539f2.m30981g(Service.Clcv.f92317a, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N2);
            }
            o.mo15002m0();
            C8700z0 z0Var2 = (C8700z0) N2;
            o.mo14918M(-492369756);
            Object N3 = o.mo14921N();
            if (N3 == aVar.mo16277a()) {
                N3 = C8539f2.m30981g(C37020p.C37022b.f92538a, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N3);
            }
            o.mo15002m0();
            C8700z0 z0Var3 = (C8700z0) N3;
            o.mo14918M(-492369756);
            Object N4 = o.mo14921N();
            if (N4 == aVar.mo16277a()) {
                N4 = C8539f2.m30981g(0, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N4);
            }
            o.mo15002m0();
            C37018n nVar = new C37018n(C36896b.C36904h.ds_il_delivery_active, C16018i.m71858d(C36896b.C36912p.set_service_clcv_title, o, 0), C16018i.m71858d(C36896b.C36912p.set_service_clcv_steady_subtitle, o, 0));
            int intValue = ((Number) ((C8700z0) N4).getValue()).intValue();
            m151631g((Service.Clcv) z0Var2.getValue(), (ActiveState.Steady) z0Var.getValue(), (C37020p.C37022b) z0Var3.getValue(), nVar, intValue, SetServiceComponentKt$ClcvSteadyPreview$1.f92327f, o, 200704);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SetServiceComponentKt$ClcvSteadyPreview$2(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m151626b(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(-287463590);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-287463590, i, -1, "com.carrefour.fid.android.design.components.compose.DriveActivePreview (SetServiceComponent.kt:429)");
            }
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            C8592o.C8593a aVar = C8592o.f23032a;
            if (N == aVar.mo16277a()) {
                N = C8539f2.m30981g(new ActiveState.ActiveData("92000 Chatenay Malabry 115 rue des tillers", new Date()), (C8410b2) null, 2, (Object) null);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C8700z0 z0Var = (C8700z0) N;
            o.mo14918M(-492369756);
            Object N2 = o.mo14921N();
            if (N2 == aVar.mo16277a()) {
                N2 = C8539f2.m30981g(Service.Drive.f92319a, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N2);
            }
            o.mo15002m0();
            C8700z0 z0Var2 = (C8700z0) N2;
            o.mo14918M(-492369756);
            Object N3 = o.mo14921N();
            if (N3 == aVar.mo16277a()) {
                N3 = C8539f2.m30981g(C37020p.C37022b.f92538a, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N3);
            }
            o.mo15002m0();
            C8700z0 z0Var3 = (C8700z0) N3;
            o.mo14918M(-492369756);
            Object N4 = o.mo14921N();
            if (N4 == aVar.mo16277a()) {
                N4 = C8539f2.m30981g(0, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N4);
            }
            o.mo15002m0();
            C37018n nVar = new C37018n(C36896b.C36904h.ds_il_drive_active, C16018i.m71858d(C36896b.C36912p.set_service_drive_title, o, 0), C16018i.m71858d(C36896b.C36912p.set_service_drive_steady_subtitle, o, 0));
            int intValue = ((Number) ((C8700z0) N4).getValue()).intValue();
            m151631g((Service.Drive) z0Var2.getValue(), (ActiveState.ActiveData) z0Var.getValue(), (C37020p.C37022b) z0Var3.getValue(), nVar, intValue, SetServiceComponentKt$DriveActivePreview$1.f92328f, o, 200768);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SetServiceComponentKt$DriveActivePreview$2(i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m151627c(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1888424310);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1888424310, i, -1, "com.carrefour.fid.android.design.components.compose.H1h3ErrorPreview (SetServiceComponent.kt:480)");
            }
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            C8592o.C8593a aVar = C8592o.f23032a;
            if (N == aVar.mo16277a()) {
                N = C8539f2.m30981g(ActiveState.Error.f92084a, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C8700z0 z0Var = (C8700z0) N;
            o.mo14918M(-492369756);
            Object N2 = o.mo14921N();
            if (N2 == aVar.mo16277a()) {
                N2 = C8539f2.m30981g(Service.H1h3.f92321a, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N2);
            }
            o.mo15002m0();
            C8700z0 z0Var2 = (C8700z0) N2;
            o.mo14918M(-492369756);
            Object N3 = o.mo14921N();
            if (N3 == aVar.mo16277a()) {
                N3 = C8539f2.m30981g(C37020p.C37022b.f92538a, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N3);
            }
            o.mo15002m0();
            C8700z0 z0Var3 = (C8700z0) N3;
            o.mo14918M(-492369756);
            Object N4 = o.mo14921N();
            if (N4 == aVar.mo16277a()) {
                N4 = C8539f2.m30981g(0, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N4);
            }
            o.mo15002m0();
            C37018n nVar = new C37018n(C36896b.C36904h.ds_il_delivery_h1h3_active, C16018i.m71858d(C36896b.C36912p.set_service_h1h3_title, o, 0), C16018i.m71858d(C36896b.C36912p.set_service_h1h3_steady_subtitle, o, 0));
            int intValue = ((Number) ((C8700z0) N4).getValue()).intValue();
            m151631g((Service.H1h3) z0Var2.getValue(), (ActiveState.Error) z0Var.getValue(), (C37020p.C37022b) z0Var3.getValue(), nVar, intValue, SetServiceComponentKt$H1h3ErrorPreview$1.f92329f, o, 200704);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SetServiceComponentKt$H1h3ErrorPreview$2(i));
        }
    }

    /* JADX INFO: finally extract failed */
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    public static final void m151628d(String str, PhysicalStoreInfo physicalStoreInfo, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        C16156d dVar;
        String str2 = str;
        PhysicalStoreInfo physicalStoreInfo2 = physicalStoreInfo;
        int i3 = i;
        C8592o o = oVar.mo15009o(1103989991);
        if ((i3 & 14) == 0) {
            i2 = (o.mo15006n0(str2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= o.mo15006n0(physicalStoreInfo2) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 91) != 18 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1103989991, i4, -1, "com.carrefour.fid.android.design.components.compose.PhysicalStoreActiveInfo (SetServiceComponent.kt:312)");
            }
            if (physicalStoreInfo2 instanceof PhysicalStoreInfo.PhysicalStoreOpened) {
                o.mo14918M(2140777975);
                C16156d.C16157a aVar = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
                o.mo14918M(2140778028);
                int r = aVar.mo46713r(new C16151c0(C37475b.f94185a.mo114251s(), 0, (C16209i0) null, (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16382, (DefaultConstructorMarker) null));
                try {
                    aVar.mo46707l(C16018i.m71858d(C36896b.C36912p.set_service_opened, o, 0));
                    C11079d2 d2Var = C11079d2.f28267a;
                    aVar.mo46710o(r);
                    o.mo15002m0();
                    aVar.mo46707l(" ");
                    aVar.mo46707l(C16018i.m71859e(C36896b.C36912p.set_service_close_at, new Object[]{((PhysicalStoreInfo.PhysicalStoreOpened) physicalStoreInfo2).mo112245d()}, o, 64));
                    dVar = aVar.mo46716u();
                    o.mo15002m0();
                } catch (Throwable th) {
                    aVar.mo46710o(r);
                    throw th;
                }
            } else if (physicalStoreInfo2 instanceof PhysicalStoreInfo.PhysicalStoreClosed) {
                o.mo14918M(2140778391);
                C16156d.C16157a aVar2 = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
                o.mo14918M(2140778444);
                int r2 = aVar2.mo46713r(new C16151c0(C37475b.f94185a.mo114224U(), 0, (C16209i0) null, (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16382, (DefaultConstructorMarker) null));
                try {
                    aVar2.mo46707l(C16018i.m71858d(C36896b.C36912p.set_service_closed, o, 0));
                    C11079d2 d2Var2 = C11079d2.f28267a;
                    aVar2.mo46710o(r2);
                    o.mo15002m0();
                    aVar2.mo46707l(" ");
                    aVar2.mo46707l(C16018i.m71859e(C36896b.C36912p.set_service_open_at, new Object[]{((PhysicalStoreInfo.PhysicalStoreClosed) physicalStoreInfo2).mo112239d()}, o, 64));
                    dVar = aVar2.mo46716u();
                    o.mo15002m0();
                } catch (Throwable th2) {
                    aVar2.mo46710o(r2);
                    throw th2;
                }
            } else if (physicalStoreInfo2 instanceof PhysicalStoreInfo.NoInfo) {
                o.mo14918M(2140778791);
                C16156d.C16157a aVar3 = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
                C16018i.m71858d(C36896b.C36912p.set_service_store_unavailable, o, 0);
                dVar = aVar3.mo46716u();
                o.mo15002m0();
            } else {
                C8592o oVar3 = o;
                oVar3.mo14918M(2140765887);
                oVar3.mo15002m0();
                throw new NoWhenBranchMatchedException();
            }
            C16156d dVar2 = dVar;
            C8767m.C8768a aVar4 = C8767m.f23478j;
            float f = (float) 16;
            C8767m o2 = PaddingKt.m10028o(PaddingKt.m10026m(aVar4, C16483g.m74435M(f), 0.0f, 2, (Object) null), 0.0f, C16483g.m74435M(f), 0.0f, 0.0f, 13, (Object) null);
            C37475b bVar = C37475b.f94185a;
            long y = bVar.mo114257y();
            C7933t0 t0Var = C7933t0.f19075a;
            int i5 = C7933t0.f19076b;
            C8592o oVar4 = o;
            TextKt.m14196c(str, o2, y, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, C16449r.f40760b.mo47727c(), false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(t0Var.mo11077c(o, i5)), oVar4, (i4 & 14) | 48, 3120, 55288);
            oVar2 = oVar4;
            TextKt.m14197d(dVar2, PaddingKt.m10028o(aVar4, C16483g.m74435M(f), 0.0f, C16483g.m74435M((float) 8), 0.0f, 10, (Object) null), bVar.mo114257y(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (Map<String, C2762c>) null, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(t0Var.mo11077c(oVar2, i5)), oVar2, 48, 0, 131064);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new SetServiceComponentKt$PhysicalStoreActiveInfo$1(str2, physicalStoreInfo, i));
        }
    }

    @C8540g
    @C16464c
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m151629e(C8592o oVar, int i) {
        C8592o o = oVar.mo15009o(1062978714);
        if (i != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1062978714, i, -1, "com.carrefour.fid.android.design.components.compose.PhysicalStoreActivePreview (SetServiceComponent.kt:502)");
            }
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            C8592o.C8593a aVar = C8592o.f23032a;
            if (N == aVar.mo16277a()) {
                N = C8539f2.m30981g(new ActiveState.ActiveDataStore("92000 Chatenay Malabry 115 rue des tillers", new PhysicalStoreInfo.PhysicalStoreOpened("08h00")), (C8410b2) null, 2, (Object) null);
                o.mo14893C(N);
            }
            o.mo15002m0();
            C8700z0 z0Var = (C8700z0) N;
            o.mo14918M(-492369756);
            Object N2 = o.mo14921N();
            if (N2 == aVar.mo16277a()) {
                N2 = C8539f2.m30981g(Service.PhysicalStore.f92323a, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N2);
            }
            o.mo15002m0();
            C8700z0 z0Var2 = (C8700z0) N2;
            o.mo14918M(-492369756);
            Object N3 = o.mo14921N();
            if (N3 == aVar.mo16277a()) {
                N3 = C8539f2.m30981g(C37020p.C37022b.f92538a, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N3);
            }
            o.mo15002m0();
            C8700z0 z0Var3 = (C8700z0) N3;
            o.mo14918M(-492369756);
            Object N4 = o.mo14921N();
            if (N4 == aVar.mo16277a()) {
                N4 = C8539f2.m30981g(0, (C8410b2) null, 2, (Object) null);
                o.mo14893C(N4);
            }
            o.mo15002m0();
            C37018n nVar = new C37018n(C36896b.C36904h.ds_il_store_active, C16018i.m71858d(C36896b.C36912p.set_service_store_title, o, 0), C16018i.m71858d(C36896b.C36912p.set_service_store_steady_subtitle, o, 0));
            int intValue = ((Number) ((C8700z0) N4).getValue()).intValue();
            m151631g((Service.PhysicalStore) z0Var2.getValue(), (ActiveState.ActiveDataStore) z0Var.getValue(), (C37020p.C37022b) z0Var3.getValue(), nVar, intValue, SetServiceComponentKt$PhysicalStoreActivePreview$1.f92330f, o, 200704);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SetServiceComponentKt$PhysicalStoreActivePreview$2(i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: kotlin.jvm.functions.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151630f(java.lang.String r39, java.util.Date r40, com.carrefour.fid.android.design.components.compose.Service r41, com.carrefour.fid.android.design.components.compose.C37020p r42, int r43, kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.design.components.compose.C37014m, kotlin.C11079d2> r44, androidx.compose.runtime.C8592o r45, int r46) {
        /*
            r2 = r40
            r4 = r42
            r6 = r44
            r7 = r46
            r0 = 226692060(0xd830bdc, float:8.076353E-31)
            r1 = r45
            androidx.compose.runtime.o r1 = r1.mo15009o(r0)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x001d
            r3 = -1
            java.lang.String r5 = "com.carrefour.fid.android.design.components.compose.ServiceActiveInformation (SetServiceComponent.kt:218)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r7, r3, r5)
        L_0x001d:
            r0 = 861960730(0x33607a1a, float:5.2265115E-8)
            r1.mo14918M(r0)
            r0 = 2
            r3 = 0
            r5 = 1
            r8 = 0
            if (r2 != 0) goto L_0x002c
            r33 = r3
            goto L_0x0060
        L_0x002c:
            int r9 = com.carrefour.fid.android.design.components.C36896b.C36912p.order_withdrawal_date
            java.lang.Object[] r10 = new java.lang.Object[r0]
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            java.lang.String r12 = "HH:mm"
            java.util.Locale r13 = java.util.Locale.FRANCE
            r11.<init>(r12, r13)
            java.lang.String r11 = r11.format(r2)
            java.lang.String r12 = "SimpleDateFormat(\"HH:mm\"…Locale.FRANCE).format(it)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
            r10[r8] = r11
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            java.lang.String r12 = "EEE dd MMM"
            java.util.Locale r13 = java.util.Locale.FRANCE
            r11.<init>(r12, r13)
            java.lang.String r11 = r11.format(r2)
            java.lang.String r12 = "SimpleDateFormat(\"EEE dd…Locale.FRANCE).format(it)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
            r10[r5] = r11
            r11 = 64
            java.lang.String r9 = androidx.compose.p004ui.res.C16018i.m71859e(r9, r10, r1, r11)
            r33 = r9
        L_0x0060:
            r1.mo15002m0()
            androidx.compose.ui.m$a r15 = androidx.compose.p004ui.C8767m.f23478j
            r9 = 16
            float r14 = (float) r9
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r14)
            r12 = 0
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.PaddingKt.m10026m(r15, r9, r12, r0, r3)
            r17 = 0
            r0 = 8
            float r0 = (float) r0
            float r18 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r19 = 0
            r20 = 0
            r21 = 13
            r22 = 0
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10028o(r16, r17, r18, r19, r20, r21, r22)
            com.carrefour.fid.android.design.theme.b r34 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r10 = r34.mo114257y()
            androidx.compose.material.t0 r13 = androidx.compose.material.C7933t0.f19075a
            int r3 = androidx.compose.material.C7933t0.f19076b
            androidx.compose.material.w1 r16 = r13.mo11077c(r1, r3)
            androidx.compose.ui.text.p0 r28 = com.carrefour.fid.android.design.theme.C37477d.m153892d(r16)
            androidx.compose.ui.text.style.r$a r16 = androidx.compose.p004ui.text.style.C16449r.f40760b
            int r23 = r16.mo47727c()
            r16 = 0
            r5 = r13
            r12 = r16
            r16 = 0
            r37 = r14
            r14 = r16
            r38 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r24 = 0
            r25 = 1
            r26 = 0
            r27 = 0
            r29 = r7 & 14
            r30 = r29 | 48
            r31 = 3120(0xc30, float:4.372E-42)
            r32 = 55288(0xd7f8, float:7.7475E-41)
            r8 = r39
            r29 = r1
            androidx.compose.material.TextKt.m14196c(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            com.carrefour.fid.android.design.components.compose.p$b r8 = com.carrefour.fid.android.design.components.compose.C37020p.C37022b.f92538a
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r8)
            r15 = 1157296644(0x44faf204, float:2007.563)
            if (r8 == 0) goto L_0x01ec
            r8 = 861961312(0x33607c60, float:5.2267183E-8)
            r1.mo14918M(r8)
            r8 = 861961326(0x33607c6e, float:5.2267232E-8)
            r1.mo14918M(r8)
            if (r33 == 0) goto L_0x00f0
            int r8 = r33.length()
            if (r8 != 0) goto L_0x00ed
            goto L_0x00f0
        L_0x00ed:
            r35 = 0
            goto L_0x00f2
        L_0x00f0:
            r35 = 1
        L_0x00f2:
            if (r35 != 0) goto L_0x013c
            float r10 = androidx.compose.p004ui.unit.C16483g.m74435M(r37)
            r11 = 0
            float r12 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r13 = 0
            r14 = 10
            r8 = 0
            r9 = r38
            r2 = r15
            r15 = r8
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10028o(r9, r10, r11, r12, r13, r14, r15)
            long r10 = r34.mo114257y()
            androidx.compose.material.w1 r8 = r5.mo11077c(r1, r3)
            androidx.compose.ui.text.p0 r28 = com.carrefour.fid.android.design.theme.C37477d.m153893e(r8)
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r30 = 48
            r31 = 0
            r32 = 65528(0xfff8, float:9.1824E-41)
            r8 = r33
            r29 = r1
            androidx.compose.material.TextKt.m14196c(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x013d
        L_0x013c:
            r2 = r15
        L_0x013d:
            r1.mo15002m0()
            float r11 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            float r10 = androidx.compose.p004ui.unit.C16483g.m74435M(r37)
            r12 = 0
            r13 = 0
            r14 = 12
            r15 = 0
            r9 = r38
            androidx.compose.ui.m r16 = androidx.compose.foundation.layout.PaddingKt.m10028o(r9, r10, r11, r12, r13, r14, r15)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.mo14918M(r0)
            java.lang.Object r0 = r1.mo14921N()
            androidx.compose.runtime.o$a r15 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r8 = r15.mo16277a()
            if (r0 != r8) goto L_0x016c
            androidx.compose.foundation.interaction.g r0 = androidx.compose.foundation.interaction.C2242f.m9684a()
            r1.mo14893C(r0)
        L_0x016c:
            r1.mo15002m0()
            r17 = r0
            androidx.compose.foundation.interaction.g r17 = (androidx.compose.foundation.interaction.C2243g) r17
            r8 = 0
            r9 = 0
            long r10 = r34.mo114218O()
            r13 = 0
            r14 = 3
            r12 = r1
            androidx.compose.foundation.a0 r18 = androidx.compose.material.ripple.C7922j.m25285e(r8, r9, r10, r12, r13, r14)
            r19 = 0
            r20 = 0
            r21 = 0
            r1.mo14918M(r2)
            boolean r0 = r1.mo15006n0(r6)
            java.lang.Object r2 = r1.mo14921N()
            if (r0 != 0) goto L_0x0199
            java.lang.Object r0 = r15.mo16277a()
            if (r2 != r0) goto L_0x01a1
        L_0x0199:
            com.carrefour.fid.android.design.components.compose.SetServiceComponentKt$ServiceActiveInformation$2$1 r2 = new com.carrefour.fid.android.design.components.compose.SetServiceComponentKt$ServiceActiveInformation$2$1
            r2.<init>(r6)
            r1.mo14893C(r2)
        L_0x01a1:
            r1.mo15002m0()
            r22 = r2
            kotlin.jvm.functions.a r22 = (kotlin.jvm.functions.C11289a) r22
            r23 = 28
            r24 = 0
            androidx.compose.ui.m r9 = androidx.compose.foundation.ClickableKt.m8876c(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            int r0 = com.carrefour.fid.android.design.components.C36896b.C36912p.home_store_select_slot_button
            r15 = 0
            java.lang.String r8 = androidx.compose.p004ui.res.C16018i.m71858d(r0, r1, r15)
            long r10 = r34.mo114218O()
            androidx.compose.material.w1 r0 = r5.mo11077c(r1, r3)
            androidx.compose.ui.text.p0 r28 = com.carrefour.fid.android.design.theme.C37477d.m153896h(r0)
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r30 = 0
            r31 = 0
            r32 = 65528(0xfff8, float:9.1824E-41)
            r29 = r1
            androidx.compose.material.TextKt.m14196c(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r1.mo15002m0()
            goto L_0x03d5
        L_0x01ec:
            r2 = r15
            r15 = 0
            boolean r8 = r4 instanceof com.carrefour.fid.android.design.components.compose.C37020p.C37021a
            if (r8 == 0) goto L_0x03cc
            r8 = 861962340(0x33608064, float:5.2270835E-8)
            r1.mo14918M(r8)
            r14 = r38
            r8 = 0
            r9 = 1
            r10 = 0
            androidx.compose.ui.m r11 = androidx.compose.foundation.layout.SizeKt.m10114n(r14, r10, r9, r8)
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            float r12 = androidx.compose.p004ui.unit.C16483g.m74435M(r37)
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.PaddingKt.m10025l(r11, r12, r8)
            float r11 = (float) r9
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r11)
            long r12 = r34.mo114211H()
            com.carrefour.fid.android.design.theme.a r33 = com.carrefour.fid.android.design.theme.C37474a.f94133a
            float r16 = r33.mo114189l()
            androidx.compose.foundation.shape.n r10 = androidx.compose.foundation.shape.C2694o.m12166h(r16)
            androidx.compose.ui.m r16 = androidx.compose.foundation.BorderKt.m8852h(r8, r9, r12, r10)
            r17 = 0
            r18 = 0
            r19 = 0
            r1.mo14918M(r2)
            boolean r2 = r1.mo15006n0(r6)
            java.lang.Object r8 = r1.mo14921N()
            if (r2 != 0) goto L_0x023f
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r8 != r2) goto L_0x0247
        L_0x023f:
            com.carrefour.fid.android.design.components.compose.SetServiceComponentKt$ServiceActiveInformation$3$1 r8 = new com.carrefour.fid.android.design.components.compose.SetServiceComponentKt$ServiceActiveInformation$3$1
            r8.<init>(r6)
            r1.mo14893C(r8)
        L_0x0247:
            r1.mo15002m0()
            r20 = r8
            kotlin.jvm.functions.a r20 = (kotlin.jvm.functions.C11289a) r20
            r21 = 7
            r22 = 0
            androidx.compose.ui.m r2 = androidx.compose.foundation.ClickableKt.m8878e(r16, r17, r18, r19, r20, r21, r22)
            r8 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.mo14918M(r8)
            androidx.compose.foundation.layout.Arrangement r8 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$d r8 = r8.mo7630p()
            androidx.compose.ui.c$a r38 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$c r9 = r38.mo17073w()
            androidx.compose.ui.layout.f0 r8 = androidx.compose.foundation.layout.RowKt.m10071d(r8, r9, r1, r15)
            r9 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.mo14918M(r9)
            androidx.compose.runtime.i1 r9 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r9 = r1.mo15032w(r9)
            androidx.compose.ui.unit.d r9 = (androidx.compose.p004ui.unit.C16479d) r9
            androidx.compose.runtime.i1 r10 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r10 = r1.mo15032w(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p004ui.unit.LayoutDirection) r10
            androidx.compose.runtime.i1 r12 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71025w()
            java.lang.Object r12 = r1.mo15032w(r12)
            androidx.compose.ui.platform.c4 r12 = (androidx.compose.p004ui.platform.C15863c4) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.p004ui.node.ComposeUiNode.f38797m
            kotlin.jvm.functions.a r15 = r13.mo44585a()
            kotlin.jvm.functions.q r2 = androidx.compose.p004ui.layout.LayoutKt.m68908f(r2)
            androidx.compose.runtime.d r6 = r1.mo15017r()
            boolean r6 = r6 instanceof androidx.compose.runtime.C8428d
            if (r6 != 0) goto L_0x02a5
            androidx.compose.runtime.ComposablesKt.m29519n()
        L_0x02a5:
            r1.mo14938T()
            boolean r6 = r1.mo14997l()
            if (r6 == 0) goto L_0x02b2
            r1.mo14947W(r15)
            goto L_0x02b5
        L_0x02b2:
            r1.mo14888A()
        L_0x02b5:
            r1.mo14941U()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.Updater.m30180b(r1)
            kotlin.jvm.functions.p r15 = r13.mo44588d()
            androidx.compose.runtime.Updater.m30188j(r6, r8, r15)
            kotlin.jvm.functions.p r8 = r13.mo44586b()
            androidx.compose.runtime.Updater.m30188j(r6, r9, r8)
            kotlin.jvm.functions.p r8 = r13.mo44587c()
            androidx.compose.runtime.Updater.m30188j(r6, r10, r8)
            kotlin.jvm.functions.p r8 = r13.mo44590f()
            androidx.compose.runtime.Updater.m30188j(r6, r12, r8)
            r1.mo14972e()
            androidx.compose.runtime.o r6 = androidx.compose.runtime.C8684u1.m31906b(r1)
            androidx.compose.runtime.u1 r6 = androidx.compose.runtime.C8684u1.m31905a(r6)
            r15 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r2.invoke(r6, r1, r8)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.mo14918M(r2)
            androidx.compose.foundation.layout.RowScopeInstance r2 = androidx.compose.foundation.layout.RowScopeInstance.f6147a
            androidx.compose.ui.c$c r6 = r38.mo17070q()
            androidx.compose.ui.m r6 = r2.mo7845f(r14, r6)
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r37)
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            androidx.compose.ui.m r9 = androidx.compose.foundation.layout.PaddingKt.m10025l(r6, r8, r9)
            r6 = 14
            long r12 = androidx.compose.p004ui.unit.C16506u.m74712m(r6)
            r37 = r4
            com.carrefour.fid.android.design.components.compose.p$a r37 = (com.carrefour.fid.android.design.components.compose.C37020p.C37021a) r37
            java.lang.String r8 = r37.mo112658e()
            androidx.compose.material.w1 r10 = r5.mo11077c(r1, r3)
            androidx.compose.ui.text.p0 r28 = r10.mo11098k()
            long r16 = r34.mo114205B()
            r36 = r11
            r6 = 0
            r10 = r16
            r16 = 0
            r6 = r14
            r14 = r16
            r15 = r16
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r30 = 3072(0xc00, float:4.305E-42)
            r31 = 0
            r32 = 65520(0xfff0, float:9.1813E-41)
            r29 = r1
            androidx.compose.material.TextKt.m14196c(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r36)
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.SizeKt.m10092H(r6, r8)
            r9 = 18
            float r9 = (float) r9
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r9)
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.SizeKt.m10115o(r8, r9)
            androidx.compose.ui.c$c r9 = r38.mo17070q()
            androidx.compose.ui.m r10 = r2.mo7845f(r8, r9)
            long r11 = r34.mo114211H()
            r13 = 0
            r14 = 2
            r15 = 0
            androidx.compose.ui.m r8 = androidx.compose.foundation.BackgroundKt.m8825d(r10, r11, r13, r14, r15)
            float r9 = r33.mo114176B()
            r10 = 0
            r11 = 0
            r12 = 1
            androidx.compose.ui.m r8 = androidx.compose.foundation.layout.PaddingKt.m10026m(r8, r10, r9, r12, r11)
            r9 = 0
            androidx.compose.foundation.layout.C2428y0.m10726a(r8, r1, r9)
            float r10 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 14
            r9 = r6
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.PaddingKt.m10028o(r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.ui.c$c r6 = r38.mo17070q()
            androidx.compose.ui.m r9 = r2.mo7845f(r0, r6)
            r0 = 14
            long r12 = androidx.compose.p004ui.unit.C16506u.m74712m(r0)
            java.lang.String r8 = r37.mo112660f()
            androidx.compose.ui.text.font.i0$a r0 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r15 = r0.mo46947c()
            androidx.compose.material.w1 r0 = r5.mo11077c(r1, r3)
            androidx.compose.ui.text.p0 r28 = r0.mo11098k()
            long r10 = r34.mo114205B()
            r14 = 0
            r30 = 199680(0x30c00, float:2.79811E-40)
            r32 = 65488(0xffd0, float:9.1768E-41)
            androidx.compose.material.TextKt.m14196c(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r1.mo15002m0()
            r1.mo14896D()
            r1.mo15002m0()
            r1.mo15002m0()
            r1.mo15002m0()
            goto L_0x03d5
        L_0x03cc:
            r0 = 861963876(0x33608664, float:5.227629E-8)
            r1.mo14918M(r0)
            r1.mo15002m0()
        L_0x03d5:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x03de
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x03de:
            androidx.compose.runtime.t1 r8 = r1.mo15020s()
            if (r8 != 0) goto L_0x03e5
            goto L_0x03fc
        L_0x03e5:
            com.carrefour.fid.android.design.components.compose.SetServiceComponentKt$ServiceActiveInformation$5 r9 = new com.carrefour.fid.android.design.components.compose.SetServiceComponentKt$ServiceActiveInformation$5
            r0 = r9
            r1 = r39
            r2 = r40
            r3 = r41
            r4 = r42
            r5 = r43
            r6 = r44
            r7 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r9)
        L_0x03fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.SetServiceComponentKt.m151630f(java.lang.String, java.util.Date, com.carrefour.fid.android.design.components.compose.Service, com.carrefour.fid.android.design.components.compose.p, int, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m151631g(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.compose.Service r28, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.compose.ActiveState r29, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.compose.C37020p r30, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.design.components.compose.C37018n r31, int r32, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super com.carrefour.fid.android.design.components.compose.C37014m, kotlin.C11079d2> r33, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r34, int r35) {
        /*
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r33
            java.lang.String r0 = "serviceState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "activeState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "serviceSlotState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "serviceInfo"
            r12 = r31
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "actioner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 2062683044(0x7af20ba4, float:6.2838597E35)
            r1 = r34
            androidx.compose.runtime.o r15 = r1.mo15009o(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x003b
            r1 = -1
            java.lang.String r2 = "com.carrefour.fid.android.design.components.compose.ServiceComponent (SetServiceComponent.kt:54)"
            r14 = r35
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r14, r1, r2)
            goto L_0x003d
        L_0x003b:
            r14 = r35
        L_0x003d:
            r0 = 144(0x90, float:2.02E-43)
            float r0 = (float) r0
            float r0 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            r1 = 206(0xce, float:2.89E-43)
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            r2 = 253(0xfd, float:3.55E-43)
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            boolean r3 = r9 instanceof com.carrefour.fid.android.design.components.compose.ActiveState.ActiveDataStore
            r13 = 1
            if (r3 == 0) goto L_0x0059
            r3 = r13
            goto L_0x005b
        L_0x0059:
            boolean r3 = r9 instanceof com.carrefour.fid.android.design.components.compose.ActiveState.ActiveData
        L_0x005b:
            if (r3 == 0) goto L_0x0069
            boolean r0 = r8 instanceof com.carrefour.fid.android.design.components.compose.Service.PhysicalStore
            if (r0 == 0) goto L_0x0062
            goto L_0x006d
        L_0x0062:
            boolean r0 = r10 instanceof com.carrefour.fid.android.design.components.compose.C37020p.C37022b
            if (r0 == 0) goto L_0x0067
            goto L_0x006d
        L_0x0067:
            r0 = r2
            goto L_0x0077
        L_0x0069:
            boolean r2 = r9 instanceof com.carrefour.fid.android.design.components.compose.ActiveState.Error
            if (r2 == 0) goto L_0x006f
        L_0x006d:
            r0 = r1
            goto L_0x0077
        L_0x006f:
            com.carrefour.fid.android.design.components.compose.ActiveState$Steady r1 = com.carrefour.fid.android.design.components.compose.ActiveState.Steady.f92086a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x0118
        L_0x0077:
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            r2 = 151(0x97, float:2.12E-43)
            float r2 = (float) r2
            float r2 = androidx.compose.p004ui.unit.C16483g.m74435M(r2)
            androidx.compose.ui.m r0 = androidx.compose.foundation.layout.SizeKt.m10089E(r1, r0, r2)
            r1 = 8
            float r1 = (float) r1
            float r1 = androidx.compose.p004ui.unit.C16483g.m74435M(r1)
            androidx.compose.foundation.shape.n r1 = androidx.compose.foundation.shape.C2694o.m12166h(r1)
            androidx.compose.ui.m r2 = androidx.compose.p004ui.draw.C8744d.m32514a(r0, r1)
            com.carrefour.fid.android.design.theme.b r0 = com.carrefour.fid.android.design.theme.C37475b.f94185a
            long r3 = r0.mo114231a0()
            r5 = 0
            r6 = 2
            r7 = 0
            androidx.compose.ui.m r16 = androidx.compose.foundation.BackgroundKt.m8825d(r2, r3, r5, r6, r7)
            float r0 = (float) r13
            float r22 = androidx.compose.p004ui.unit.C16483g.m74435M(r0)
            com.carrefour.fid.android.design.components.compose.SetServiceComponentKt$ServiceComponent$1 r7 = new com.carrefour.fid.android.design.components.compose.SetServiceComponentKt$ServiceComponent$1
            r7.<init>(r9, r8, r11)
            r17 = 0
            r18 = 0
            r19 = 0
            r23 = 0
            r21 = 0
            r25 = 0
            com.carrefour.fid.android.design.components.compose.SetServiceComponentKt$ServiceComponent$2 r6 = new com.carrefour.fid.android.design.components.compose.SetServiceComponentKt$ServiceComponent$2
            r0 = r6
            r1 = r29
            r2 = r31
            r3 = r28
            r4 = r30
            r5 = r32
            r8 = r6
            r6 = r33
            r26 = r7
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 1397698301(0x534f2efd, float:8.8984656E11)
            androidx.compose.runtime.internal.a r0 = androidx.compose.runtime.internal.C8553b.m31048b(r15, r0, r13, r8)
            r1 = 817889280(0x30c00000, float:1.3969839E-9)
            r27 = 380(0x17c, float:5.32E-43)
            r13 = r26
            r14 = r16
            r2 = r15
            r15 = r17
            r16 = r18
            r17 = r19
            r19 = r23
            r23 = r25
            r24 = r0
            r25 = r2
            r26 = r1
            androidx.compose.material.SurfaceKt.m13880c(r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00f9
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00f9:
            androidx.compose.runtime.t1 r8 = r2.mo15020s()
            if (r8 != 0) goto L_0x0100
            goto L_0x0117
        L_0x0100:
            com.carrefour.fid.android.design.components.compose.SetServiceComponentKt$ServiceComponent$3 r13 = new com.carrefour.fid.android.design.components.compose.SetServiceComponentKt$ServiceComponent$3
            r0 = r13
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.mo15202a(r13)
        L_0x0117:
            return
        L_0x0118:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.compose.SetServiceComponentKt.m151631g(com.carrefour.fid.android.design.components.compose.Service, com.carrefour.fid.android.design.components.compose.ActiveState, com.carrefour.fid.android.design.components.compose.p, com.carrefour.fid.android.design.components.compose.n, int, kotlin.jvm.functions.l, androidx.compose.runtime.o, int):void");
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: h */
    public static final void m151632h(String str, C8592o oVar, int i) {
        int i2;
        C8592o oVar2;
        int i3;
        String str2 = str;
        int i4 = i;
        C8592o o = oVar.mo15009o(1002704470);
        if ((i4 & 14) == 0) {
            if (o.mo15006n0(str2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1002704470, i2, -1, "com.carrefour.fid.android.design.components.compose.ServiceSteadyInformation (SetServiceComponent.kt:196)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 16;
            float f2 = (float) 8;
            C8767m o2 = PaddingKt.m10028o(PaddingKt.m10026m(aVar, C16483g.m74435M(f), 0.0f, 2, (Object) null), 0.0f, C16483g.m74435M(f2), 0.0f, 0.0f, 13, (Object) null);
            C37475b bVar = C37475b.f94185a;
            long y = bVar.mo114257y();
            C7933t0 t0Var = C7933t0.f19075a;
            int i5 = C7933t0.f19076b;
            C8592o oVar3 = o;
            TextKt.m14196c(str, o2, y, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(t0Var.mo11077c(o, i5)), oVar3, (i2 & 14) | 48, 0, 65528);
            C8592o oVar4 = oVar3;
            oVar2 = oVar4;
            TextKt.m14196c(C16018i.m71858d(C36896b.C36912p.home_store_choose_button, oVar4, 0), PaddingKt.m10028o(aVar, C16483g.m74435M(f), C16483g.m74435M(f2), 0.0f, 0.0f, 12, (Object) null), bVar.mo114218O(), 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153896h(t0Var.mo11077c(oVar4, i5)), oVar2, 0, 0, 65528);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new SetServiceComponentKt$ServiceSteadyInformation$1(str, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: i */
    public static final void m151633i(C8592o oVar, int i) {
        C8592o oVar2;
        int i2 = i;
        C8592o o = oVar.mo15009o(458478043);
        if (i2 != 0 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(458478043, i2, -1, "com.carrefour.fid.android.design.components.compose.SetServiceError (SetServiceComponent.kt:359)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 16;
            float f2 = (float) 8;
            C8767m o2 = PaddingKt.m10028o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M(f), C16483g.m74435M(f2), C16483g.m74435M(f2), 0.0f, 8, (Object) null);
            o.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), C8734c.f23406a.mo17073w(), o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(o2);
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
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            ImageKt.m8967b(C16015f.m71849d(C36896b.C36904h.ds_gr_red_error, o, 0), (String) null, PaddingKt.m10028o(SizeKt.m10087C(aVar, C16483g.m74435M(f)), 0.0f, 0.0f, C37474a.f94133a.mo114176B(), 0.0f, 11, (Object) null), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, o, 56, 120);
            long y = C37475b.f94185a.mo114257y();
            oVar2 = o;
            TextKt.m14196c(C16018i.m71858d(C36896b.C36912p.set_service_error_message, o, 0), (C8767m) null, y, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, C37477d.m153892d(C7933t0.f19075a.mo11077c(o, C7933t0.f19076b)), oVar2, 0, 0, 65530);
            oVar2.mo15002m0();
            oVar2.mo14896D();
            oVar2.mo15002m0();
            oVar2.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
            oVar2 = o;
        }
        C8678t1 s = oVar2.mo15020s();
        if (s != null) {
            s.mo15202a(new SetServiceComponentKt$SetServiceError$2(i2));
        }
    }

    @C12579k
    /* renamed from: r */
    public static final List<Service> m151642r(@C12579k Service service) {
        Intrinsics.checkNotNullParameter(service, "service");
        Service[] serviceArr = {Service.Drive.f92319a, Service.H1h3.f92321a, Service.Clcv.f92317a};
        ArrayList arrayList = new ArrayList();
        for (Object next : CollectionsKt__CollectionsKt.m40448L(serviceArr)) {
            if (!Intrinsics.areEqual((Object) (Service) next, (Object) service)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
