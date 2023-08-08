package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import androidx.autofill.C0861a;
import androidx.compose.foundation.gestures.C2195g;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.cms.domain.models.FuelPriceDomain;
import com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreContactComponentKt;
import com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStorePetrolComponentKt;
import com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreRatingComponentKt;
import com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreServicesComponentKt;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27136a;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27152g;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27156h;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27160i;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.C27164j;
import com.carrefour.fid.android.shared.util.C28932h;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nPhysicalStoreInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreInfoScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,374:1\n154#2:375\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreInfoScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2\n*L\n155#1:375\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2 */
public final class PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C27136a, C11079d2> $actioner;
    final /* synthetic */ C27152g $petrolState;
    final /* synthetic */ C27156h $reviewState;
    final /* synthetic */ C27160i $servicesState;
    final /* synthetic */ C27164j.C27167c $storeState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2(C27160i iVar, C27152g gVar, C27156h hVar, C27164j.C27167c cVar, C11300l<? super C27136a, C11079d2> lVar, int i) {
        super(3);
        this.$servicesState = iVar;
        this.$petrolState = gVar;
        this.$reviewState = hVar;
        this.$storeState = cVar;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        int i2;
        C2366i0 i0Var2 = i0Var;
        int i3 = i;
        Intrinsics.checkNotNullParameter(i0Var2, "paddingValues");
        if ((i3 & 14) == 0) {
            i2 = (oVar.mo15006n0(i0Var2) ? 4 : 2) | i3;
        } else {
            C8592o oVar2 = oVar;
            i2 = i3;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(940791688, i3, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreen.<anonymous> (PhysicalStoreInfoScreen.kt:152)");
            }
            C2366i0 a = PaddingKt.m10014a(C16483g.m74435M((float) 16));
            C8767m j = PaddingKt.m10023j(C8767m.f23478j, i0Var2);
            final C27160i iVar = this.$servicesState;
            final C27152g gVar = this.$petrolState;
            final C27156h hVar = this.$reviewState;
            C27164j.C27167c cVar = this.$storeState;
            final C11300l<C27136a, C11079d2> lVar = this.$actioner;
            final C27164j.C27167c cVar2 = cVar;
            final int i4 = this.$$dirty;
            LazyDslKt.m10737b(j, (LazyListState) null, a, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, new C11300l<LazyListScope, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LazyListScope) obj);
                    return C11079d2.f28267a;
                }

                public final void invoke(@C12579k LazyListScope lazyListScope) {
                    Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
                    final C27164j.C27167c cVar = cVar2;
                    final C11300l<C27136a, C11079d2> lVar = lVar;
                    final int i = i4;
                    LazyListScope.m10824g(lazyListScope, "PhysicalStoreInfoOpenings", (Object) null, C8553b.m31049c(1826443380, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                            return C11079d2.f28267a;
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: kotlin.jvm.functions.a} */
                        /* JADX WARNING: Multi-variable type inference failed */
                        @androidx.compose.runtime.C8540g
                        @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void invoke(@org.jetbrains.annotations.C12579k androidx.compose.foundation.lazy.C2455e r10, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r11, int r12) {
                            /*
                                r9 = this;
                                java.lang.String r0 = "$this$item"
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                                r10 = r12 & 81
                                r0 = 16
                                if (r10 != r0) goto L_0x0016
                                boolean r10 = r11.mo15011p()
                                if (r10 != 0) goto L_0x0012
                                goto L_0x0016
                            L_0x0012:
                                r11.mo14958a0()
                                goto L_0x0076
                            L_0x0016:
                                boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
                                if (r10 == 0) goto L_0x0025
                                r10 = -1
                                java.lang.String r0 = "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreen.<anonymous>.<anonymous>.<anonymous> (PhysicalStoreInfoScreen.kt:157)"
                                r1 = 1826443380(0x6cdd5074, float:2.1404203E27)
                                androidx.compose.runtime.ComposerKt.m29845w0(r1, r12, r10, r0)
                            L_0x0025:
                                r2 = 0
                                com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.j$c r10 = r1
                                com.carrefour.fid.android.domain.models.service.models.l r10 = r10.mo78958d()
                                java.lang.String r3 = r10.mo119394x()
                                com.carrefour.fid.android.shared.util.ServiceUtil r10 = com.carrefour.fid.android.shared.util.ServiceUtil.f70805a
                                com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.j$c r12 = r1
                                com.carrefour.fid.android.domain.models.service.models.l r12 = r12.mo78958d()
                                com.carrefour.fid.android.design.components.widgets.r1 r4 = r10.mo84119a(r12)
                                kotlin.jvm.functions.l<com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.a, kotlin.d2> r10 = r4
                                r12 = 1157296644(0x44faf204, float:2007.563)
                                r11.mo14918M(r12)
                                boolean r12 = r11.mo15006n0(r10)
                                java.lang.Object r0 = r11.mo14921N()
                                if (r12 != 0) goto L_0x0056
                                androidx.compose.runtime.o$a r12 = androidx.compose.runtime.C8592o.f23032a
                                java.lang.Object r12 = r12.mo16277a()
                                if (r0 != r12) goto L_0x005e
                            L_0x0056:
                                com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2$1$1$1$1 r0 = new com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2$1$1$1$1
                                r0.<init>(r10)
                                r11.mo14893C(r0)
                            L_0x005e:
                                r11.mo15002m0()
                                r5 = r0
                                kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
                                int r10 = com.carrefour.fid.android.design.components.widgets.C37396r1.f93965d
                                int r7 = r10 << 6
                                r8 = 1
                                r6 = r11
                                com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt.m109610g(r2, r3, r4, r5, r6, r7, r8)
                                boolean r10 = androidx.compose.runtime.ComposerKt.m29813g0()
                                if (r10 == 0) goto L_0x0076
                                androidx.compose.runtime.ComposerKt.m29843v0()
                            L_0x0076:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.physicalstore.PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2.C253021.C253031.invoke(androidx.compose.foundation.lazy.e, androidx.compose.runtime.o, int):void");
                        }
                    }), 2, (Object) null);
                    final C27164j.C27167c cVar2 = cVar2;
                    final C11300l<C27136a, C11079d2> lVar2 = lVar;
                    LazyListScope.m10824g(lazyListScope, "PhysicalStoreContactComponent", (Object) null, C8553b.m31049c(-334403875, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                            return C11079d2.f28267a;
                        }

                        @C8540g
                        @C8570j(applier = "androidx.compose.ui.UiComposable")
                        public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
                            Intrinsics.checkNotNullParameter(eVar, "$this$item");
                            if ((i & 81) != 16 || !oVar.mo15011p()) {
                                if (ComposerKt.m29813g0()) {
                                    ComposerKt.m29845w0(-334403875, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreen.<anonymous>.<anonymous>.<anonymous> (PhysicalStoreInfoScreen.kt:165)");
                                }
                                C8767m m = PaddingKt.m10026m(C8767m.f23478j, 0.0f, C16483g.m74435M((float) 16), 1, (Object) null);
                                String h = PhysicalStoreInfoScreenKt.m109445j(cVar2.mo78958d());
                                String i2 = PhysicalStoreInfoScreenKt.m109446k(cVar2.mo78958d());
                                String J = cVar2.mo78958d().mo119366J();
                                final C11300l<C27136a, C11079d2> lVar = lVar2;
                                final C27164j.C27167c cVar = cVar2;
                                C253051 r7 = new C11289a<C11079d2>() {
                                    public final void invoke() {
                                        lVar.invoke(new C27136a.C27139c(cVar.mo78958d().mo119393w()));
                                    }
                                };
                                final C11300l<C27136a, C11079d2> lVar2 = lVar2;
                                final C27164j.C27167c cVar2 = cVar2;
                                PhysicalStoreContactComponentKt.m109594a(m, h, i2, J, r7, new C11300l<String, C11079d2>() {
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((String) obj);
                                        return C11079d2.f28267a;
                                    }

                                    public final void invoke(@C12579k String str) {
                                        Intrinsics.checkNotNullParameter(str, C0861a.f2689A);
                                        lVar2.invoke(new C27136a.C27140d(cVar2.mo78958d().mo119393w(), str));
                                    }
                                }, oVar, 6, 0);
                                if (ComposerKt.m29813g0()) {
                                    ComposerKt.m29843v0();
                                    return;
                                }
                                return;
                            }
                            oVar.mo14958a0();
                        }
                    }), 2, (Object) null);
                    C27160i iVar = iVar;
                    C25299x718f5ea8 physicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2$1$invoke$$inlined$itemsIndexed$default$1 = null;
                    if (!Intrinsics.areEqual((Object) iVar, (Object) C27160i.C27161a.f66033a)) {
                        if (Intrinsics.areEqual((Object) iVar, (Object) C27160i.C27162b.f66035a)) {
                            LazyListScope.m10824g(lazyListScope, "PhysicalStoreServiceItemShimmer", (Object) null, ComposableSingletons$PhysicalStoreInfoScreenKt.f62350a.mo73748a(), 2, (Object) null);
                        } else if (iVar instanceof C27160i.C27163c) {
                            if (!((C27160i.C27163c) iVar).mo78952d().isEmpty()) {
                                final C11300l<C27136a, C11079d2> lVar3 = lVar;
                                final int i2 = i4;
                                LazyListScope.m10824g(lazyListScope, "PhysicalStoreServicesTitleComponent", (Object) null, C8553b.m31049c(970830201, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                                        return C11079d2.f28267a;
                                    }

                                    @C8540g
                                    @C8570j(applier = "androidx.compose.ui.UiComposable")
                                    public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
                                        Intrinsics.checkNotNullParameter(eVar, "$this$item");
                                        if ((i & 81) != 16 || !oVar.mo15011p()) {
                                            if (ComposerKt.m29813g0()) {
                                                ComposerKt.m29845w0(970830201, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreen.<anonymous>.<anonymous>.<anonymous> (PhysicalStoreInfoScreen.kt:192)");
                                            }
                                            C8767m o = PaddingKt.m10028o(C8767m.f23478j, 0.0f, 0.0f, 0.0f, C16483g.m74435M((float) 16), 7, (Object) null);
                                            C11300l<C27136a, C11079d2> lVar = lVar3;
                                            oVar.mo14918M(1157296644);
                                            boolean n0 = oVar.mo15006n0(lVar);
                                            Object N = oVar.mo14921N();
                                            if (n0 || N == C8592o.f23032a.mo16277a()) {
                                                N = new PhysicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2$1$3$1$1(lVar);
                                                oVar.mo14893C(N);
                                            }
                                            oVar.mo15002m0();
                                            PhysicalStoreServicesComponentKt.m109666e(o, (C11289a) N, oVar, 6, 0);
                                            if (ComposerKt.m29813g0()) {
                                                ComposerKt.m29843v0();
                                                return;
                                            }
                                            return;
                                        }
                                        oVar.mo14958a0();
                                    }
                                }), 2, (Object) null);
                            }
                            List E5 = CollectionsKt___CollectionsKt.m40497E5(((C27160i.C27163c) iVar).mo78952d(), 3);
                            C253084 r1 = C253084.f62376f;
                            lazyListScope.mo8310k(E5.size(), r1 != null ? new C25296x846f075e(r1, E5) : null, new C25297x846f075f(C25295x846f075d.f62375f, E5), C8553b.m31049c(-632812321, true, new C25298x846f0760(E5)));
                        }
                    }
                    C27152g gVar = gVar;
                    if (!Intrinsics.areEqual((Object) gVar, (Object) C27152g.C27153a.f66020a)) {
                        if (Intrinsics.areEqual((Object) gVar, (Object) C27152g.C27154b.f66022a)) {
                            LazyListScope.m10824g(lazyListScope, "PhysicalStorePetrolItemShimmer", (Object) null, ComposableSingletons$PhysicalStoreInfoScreenKt.f62350a.mo73749b(), 2, (Object) null);
                        } else if (gVar instanceof C27152g.C27155c) {
                            LazyListScope.m10824g(lazyListScope, "PhysicalStoreTitleComponent", (Object) null, ComposableSingletons$PhysicalStoreInfoScreenKt.f62350a.mo73750c(), 2, (Object) null);
                            List<FuelPriceDomain> d = ((C27152g.C27155c) gVar).mo78938d();
                            C253096 r12 = C253096.f62377f;
                            C27152g gVar2 = gVar;
                            int size = d.size();
                            if (r12 != null) {
                                physicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2$1$invoke$$inlined$itemsIndexed$default$1 = new C25299x718f5ea8(r12, d);
                            }
                            lazyListScope.mo8310k(size, physicalStoreInfoScreenKt$PhysicalStoreInfoScreen$2$1$invoke$$inlined$itemsIndexed$default$1, new C25300x718f5ea9(d), C8553b.m31049c(-1091073711, true, new C25301x718f5eaa(d, gVar2)));
                            final C27152g gVar3 = gVar;
                            LazyListScope.m10824g(lazyListScope, (Object) null, (Object) null, C8553b.m31049c(-968481978, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                                    return C11079d2.f28267a;
                                }

                                @C8540g
                                @C8570j(applier = "androidx.compose.ui.UiComposable")
                                public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
                                    Intrinsics.checkNotNullParameter(eVar, "$this$item");
                                    if ((i & 81) != 16 || !oVar.mo15011p()) {
                                        if (ComposerKt.m29813g0()) {
                                            ComposerKt.m29845w0(-968481978, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreen.<anonymous>.<anonymous>.<anonymous> (PhysicalStoreInfoScreen.kt:242)");
                                        }
                                        C8767m m = PaddingKt.m10026m(C8767m.f23478j, 0.0f, C16483g.m74435M((float) 16), 1, (Object) null);
                                        C28932h.C28933a aVar = C28932h.f70914a;
                                        Iterable<FuelPriceDomain> d = ((C27152g.C27155c) gVar3).mo78938d();
                                        ArrayList arrayList = new ArrayList(C10978t.m41495Y(d, 10));
                                        for (FuelPriceDomain updateDate : d) {
                                            arrayList.add(updateDate.getUpdateDate());
                                        }
                                        PhysicalStorePetrolComponentKt.m109649c(m, aVar.mo84253y(arrayList), (C11289a<C11079d2>) null, oVar, 6, 4);
                                        if (ComposerKt.m29813g0()) {
                                            ComposerKt.m29843v0();
                                            return;
                                        }
                                        return;
                                    }
                                    oVar.mo14958a0();
                                }
                            }), 3, (Object) null);
                        }
                    }
                    if (hVar instanceof C27156h.C27159c) {
                        LazyListScope.m10824g(lazyListScope, "PhysicalStoreTitleComponent2", (Object) null, ComposableSingletons$PhysicalStoreInfoScreenKt.f62350a.mo73751d(), 2, (Object) null);
                        final C27156h hVar = hVar;
                        final C11300l<C27136a, C11079d2> lVar4 = lVar;
                        final C27164j.C27167c cVar3 = cVar2;
                        LazyListScope.m10824g(lazyListScope, "PhysicalStoreRatingComponent", (Object) null, C8553b.m31049c(-966647827, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                                return C11079d2.f28267a;
                            }

                            @C8540g
                            @C8570j(applier = "androidx.compose.ui.UiComposable")
                            public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
                                Intrinsics.checkNotNullParameter(eVar, "$this$item");
                                if ((i & 81) != 16 || !oVar.mo15011p()) {
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29845w0(-966647827, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreen.<anonymous>.<anonymous>.<anonymous> (PhysicalStoreInfoScreen.kt:261)");
                                    }
                                    if (((C27156h.C27159c) hVar).mo78947f() == 0.0d) {
                                        oVar.mo14918M(-1862917166);
                                        final C11300l<C27136a, C11079d2> lVar = lVar4;
                                        final C27164j.C27167c cVar = cVar3;
                                        PhysicalStoreRatingComponentKt.m109654a((C8767m) null, new C11289a<C11079d2>() {
                                            public final void invoke() {
                                                lVar.invoke(new C27136a.C27138b(cVar.mo78958d().mo119393w()));
                                            }
                                        }, oVar, 0, 1);
                                        oVar.mo15002m0();
                                    } else {
                                        oVar.mo14918M(-1862916893);
                                        double f = ((C27156h.C27159c) hVar).mo78947f();
                                        int e = ((C27156h.C27159c) hVar).mo78945e();
                                        final C11300l<C27136a, C11079d2> lVar2 = lVar4;
                                        final C27164j.C27167c cVar2 = cVar3;
                                        PhysicalStoreRatingComponentKt.m109656c((C8767m) null, f, e, new C11289a<C11079d2>() {
                                            public final void invoke() {
                                                lVar2.invoke(new C27136a.C27141e(cVar2.mo78958d().mo119393w()));
                                            }
                                        }, oVar, 0, 1);
                                        oVar.mo15002m0();
                                    }
                                    if (ComposerKt.m29813g0()) {
                                        ComposerKt.m29843v0();
                                        return;
                                    }
                                    return;
                                }
                                oVar.mo14958a0();
                            }
                        }), 2, (Object) null);
                    }
                }
            }, oVar, C22132b.f56831b, 250);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
