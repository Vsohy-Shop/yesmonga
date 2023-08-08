package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C2237c;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "d", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,116:1\n474#2,4:117\n478#2,2:125\n482#2:131\n25#3:121\n25#3:132\n50#3:139\n49#3:140\n67#3,3:147\n66#3:150\n1114#4,3:122\n1117#4,3:128\n1114#4,6:133\n1114#4,6:141\n1114#4,6:151\n474#5:127\n76#6:157\n102#6,2:158\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2\n*L\n56#1:117,4\n56#1:125,2\n56#1:131\n56#1:121\n57#1:132\n83#1:139\n83#1:140\n86#1:147,3\n86#1:150\n56#1:122,3\n56#1:128,3\n57#1:133,6\n83#1:141,6\n86#1:151,6\n56#1:127\n57#1:157\n57#1:158,2\n*E\n"})
public final class HoverableKt$hoverable$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C2243g $interactionSource;

    @C11067d(mo22501c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", mo22502f = "Hoverable.kt", mo22503i = {}, mo22504l = {102}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    @C11363r0({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$3\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,116:1\n329#2:117\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$3\n*L\n101#1:117\n*E\n"})
    /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3 */
    public static final class C20843 extends SuspendLambda implements C11304p<C15472e0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C20843 r0 = new C20843(a, gVar3, z0Var, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C15472e0 e0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C20843) create(e0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                final CoroutineContext context = getContext();
                final C12074o0 o0Var = a;
                final C2243g gVar = gVar3;
                final C8700z0<C2237c.C2238a> z0Var = z0Var;
                C20851 r3 = new C11304p<C15465c, C11045c<? super C11079d2>, Object>((C11045c<? super C20851>) null) {
                    private /* synthetic */ Object L$0;
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        C20851 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public HoverableKt$hoverable$2(C2243g gVar, boolean z) {
                            super(3);
                            this.$interactionSource = gVar;
                            this.$enabled = z;
                        }

                        /* renamed from: e */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public static final java.lang.Object m8956e(androidx.compose.foundation.interaction.C2243g r4, androidx.compose.runtime.C8700z0<androidx.compose.foundation.interaction.C2237c.C2238a> r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
                            /*
                                boolean r0 = r6 instanceof androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r6
                                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1 r0 = (androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1 r0 = new androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1
                                r0.<init>(r6)
                            L_0x0018:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L_0x0039
                                if (r2 != r3) goto L_0x0031
                                java.lang.Object r4 = r0.L$1
                                androidx.compose.foundation.interaction.c$a r4 = (androidx.compose.foundation.interaction.C2237c.C2238a) r4
                                java.lang.Object r5 = r0.L$0
                                androidx.compose.runtime.z0 r5 = (androidx.compose.runtime.C8700z0) r5
                                kotlin.C11661u0.m45747n(r6)
                                goto L_0x0055
                            L_0x0031:
                                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                r4.<init>(r5)
                                throw r4
                            L_0x0039:
                                kotlin.C11661u0.m45747n(r6)
                                androidx.compose.foundation.interaction.c$a r6 = m8958g(r5)
                                if (r6 != 0) goto L_0x0058
                                androidx.compose.foundation.interaction.c$a r6 = new androidx.compose.foundation.interaction.c$a
                                r6.<init>()
                                r0.L$0 = r5
                                r0.L$1 = r6
                                r0.label = r3
                                java.lang.Object r4 = r4.mo7604a(r6, r0)
                                if (r4 != r1) goto L_0x0054
                                return r1
                            L_0x0054:
                                r4 = r6
                            L_0x0055:
                                m8959h(r5, r4)
                            L_0x0058:
                                kotlin.d2 r4 = kotlin.C11079d2.f28267a
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt$hoverable$2.m8956e(androidx.compose.foundation.interaction.g, androidx.compose.runtime.z0, kotlin.coroutines.c):java.lang.Object");
                        }

                        /* renamed from: f */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public static final java.lang.Object m8957f(androidx.compose.runtime.C8700z0<androidx.compose.foundation.interaction.C2237c.C2238a> r4, androidx.compose.foundation.interaction.C2243g r5, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
                            /*
                                boolean r0 = r6 instanceof androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r6
                                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1 r0 = (androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1 r0 = new androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1
                                r0.<init>(r6)
                            L_0x0018:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L_0x0035
                                if (r2 != r3) goto L_0x002d
                                java.lang.Object r4 = r0.L$0
                                androidx.compose.runtime.z0 r4 = (androidx.compose.runtime.C8700z0) r4
                                kotlin.C11661u0.m45747n(r6)
                                goto L_0x004e
                            L_0x002d:
                                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                r4.<init>(r5)
                                throw r4
                            L_0x0035:
                                kotlin.C11661u0.m45747n(r6)
                                androidx.compose.foundation.interaction.c$a r6 = m8958g(r4)
                                if (r6 == 0) goto L_0x0052
                                androidx.compose.foundation.interaction.c$b r2 = new androidx.compose.foundation.interaction.c$b
                                r2.<init>(r6)
                                r0.L$0 = r4
                                r0.label = r3
                                java.lang.Object r5 = r5.mo7604a(r2, r0)
                                if (r5 != r1) goto L_0x004e
                                return r1
                            L_0x004e:
                                r5 = 0
                                m8959h(r4, r5)
                            L_0x0052:
                                kotlin.d2 r4 = kotlin.C11079d2.f28267a
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt$hoverable$2.m8957f(androidx.compose.runtime.z0, androidx.compose.foundation.interaction.g, kotlin.coroutines.c):java.lang.Object");
                        }

                        /* renamed from: g */
                        public static final C2237c.C2238a m8958g(C8700z0<C2237c.C2238a> z0Var) {
                            return z0Var.getValue();
                        }

                        /* renamed from: h */
                        public static final void m8959h(C8700z0<C2237c.C2238a> z0Var, C2237c.C2238a aVar) {
                            z0Var.setValue(aVar);
                        }

                        /* renamed from: i */
                        public static final void m8960i(C8700z0<C2237c.C2238a> z0Var, C2243g gVar) {
                            C2237c.C2238a g = m8958g(z0Var);
                            if (g != null) {
                                gVar.mo7605b(new C2237c.C2239b(g));
                                m8959h(z0Var, (C2237c.C2238a) null);
                            }
                        }

                        @C8540g
                        @C12579k
                        /* renamed from: d */
                        public final C8767m mo7188d(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
                            C8767m mVar2;
                            Intrinsics.checkNotNullParameter(mVar, "$this$composed");
                            oVar.mo14918M(1294013553);
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(1294013553, i, -1, "androidx.compose.foundation.hoverable.<anonymous> (Hoverable.kt:54)");
                            }
                            oVar.mo14918M(773894976);
                            oVar.mo14918M(-492369756);
                            Object N = oVar.mo14921N();
                            C8592o.C8593a aVar = C8592o.f23032a;
                            if (N == aVar.mo16277a()) {
                                C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, oVar));
                                oVar.mo14893C(wVar);
                                N = wVar;
                            }
                            oVar.mo15002m0();
                            final C12074o0 a = ((C8690w) N).mo16831a();
                            oVar.mo15002m0();
                            oVar.mo14918M(-492369756);
                            Object N2 = oVar.mo14921N();
                            if (N2 == aVar.mo16277a()) {
                                N2 = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);
                                oVar.mo14893C(N2);
                            }
                            oVar.mo15002m0();
                            final C8700z0 z0Var = (C8700z0) N2;
                            C2243g gVar = this.$interactionSource;
                            oVar.mo14918M(511388516);
                            boolean n0 = oVar.mo15006n0(z0Var) | oVar.mo15006n0(gVar);
                            Object N3 = oVar.mo14921N();
                            if (n0 || N3 == aVar.mo16277a()) {
                                N3 = new HoverableKt$hoverable$2$1$1(z0Var, gVar);
                                oVar.mo14893C(N3);
                            }
                            oVar.mo15002m0();
                            EffectsKt.m29891c(gVar, (C11300l) N3, oVar, 0);
                            Boolean valueOf = Boolean.valueOf(this.$enabled);
                            Boolean valueOf2 = Boolean.valueOf(this.$enabled);
                            C2243g gVar2 = this.$interactionSource;
                            boolean z = this.$enabled;
                            oVar.mo14918M(1618982084);
                            boolean n02 = oVar.mo15006n0(valueOf2) | oVar.mo15006n0(z0Var) | oVar.mo15006n0(gVar2);
                            Object N4 = oVar.mo14921N();
                            if (n02 || N4 == aVar.mo16277a()) {
                                N4 = new HoverableKt$hoverable$2$2$1(z, z0Var, gVar2, (C11045c<? super HoverableKt$hoverable$2$2$1>) null);
                                oVar.mo14893C(N4);
                            }
                            oVar.mo15002m0();
                            EffectsKt.m29896h(valueOf, (C11304p) N4, oVar, 64);
                            if (this.$enabled) {
                                C8767m.C8768a aVar2 = C8767m.f23478j;
                                final C2243g gVar3 = this.$interactionSource;
                                mVar2 = SuspendingPointerInputFilterKt.m68437c(aVar2, gVar3, new C20843((C11045c<? super C20843>) null));
                            } else {
                                mVar2 = C8767m.f23478j;
                            }
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29843v0();
                            }
                            oVar.mo15002m0();
                            return mVar2;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return mo7188d((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
                        }
                    }
