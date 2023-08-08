package com.carrefour.fid.android.presentation.p035ui.physicalstore;

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
import com.carrefour.fid.android.domain.models.service.models.C38154g;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.presentation.p035ui.physicalstore.component.PhysicalStoreInfoOpeningsComponentKt;
import com.carrefour.fid.android.shared.util.C28932h;
import java.util.ArrayList;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nPhysicalStoreOpeningsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalStoreOpeningsScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,137:1\n154#2:138\n*S KotlinDebug\n*F\n+ 1 PhysicalStoreOpeningsScreen.kt\ncom/carrefour/fid/android/presentation/ui/physicalstore/PhysicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$3\n*L\n93#1:138\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$3 */
public final class PhysicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$3 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ C38163l $store;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreOpeningsScreenKt$PhysicalStoreOpeningsScreen$3(C38163l lVar) {
        super(3);
        this.$store = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(i0Var, "paddingValues");
        if ((i & 14) == 0) {
            i2 = (oVar.mo15006n0(i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(623973200, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreOpeningsScreen.<anonymous> (PhysicalStoreOpeningsScreen.kt:89)");
            }
            C8767m j = PaddingKt.m10023j(C8767m.f23478j, i0Var);
            C2366i0 b = PaddingKt.m10015b(C16483g.m74435M((float) 16), C16483g.m74435M((float) 24));
            final C38163l lVar = this.$store;
            LazyDslKt.m10737b(j, (LazyListState) null, b, false, (Arrangement.C2279l) null, (C8734c.C8736b) null, (C2195g) null, false, new C11300l<LazyListScope, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LazyListScope) obj);
                    return C11079d2.f28267a;
                }

                public final void invoke(@C12579k LazyListScope lazyListScope) {
                    Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
                    final C38163l lVar = lVar;
                    LazyListScope.m10824g(lazyListScope, "PhysicalStoreOpeningsWeekly", (Object) null, C8553b.m31049c(737723876, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
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
                                    ComposerKt.m29845w0(737723876, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreOpeningsScreen.<anonymous>.<anonymous>.<anonymous> (PhysicalStoreOpeningsScreen.kt:94)");
                                }
                                PhysicalStoreInfoOpeningsComponentKt.m109614k((C8767m) null, lVar, oVar, 64, 1);
                                if (ComposerKt.m29813g0()) {
                                    ComposerKt.m29843v0();
                                    return;
                                }
                                return;
                            }
                            oVar.mo14958a0();
                        }
                    }), 2, (Object) null);
                    LazyListScope.m10824g(lazyListScope, "PhysicalStorePassInfo", (Object) null, ComposableSingletons$PhysicalStoreOpeningsScreenKt.f62362a.mo73759a(), 2, (Object) null);
                    final C38163l lVar2 = lVar;
                    LazyListScope.m10824g(lazyListScope, "PhysicalStoreExceptionalOpeningsComponent", (Object) null, C8553b.m31049c(1196749084, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
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
                                    ComposerKt.m29845w0(1196749084, i, -1, "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreOpeningsScreen.<anonymous>.<anonymous>.<anonymous> (PhysicalStoreOpeningsScreen.kt:104)");
                                }
                                ArrayList arrayList = new ArrayList();
                                for (Object next : lVar2.mo119362F()) {
                                    if (C28932h.f70914a.mo84234c(((C38154g) next).mo119299i(), 7)) {
                                        arrayList.add(next);
                                    }
                                }
                                PhysicalStoreInfoOpeningsComponentKt.m109606c((C8767m) null, false, arrayList, oVar, 512, 3);
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
            }, oVar, 0, 250);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
