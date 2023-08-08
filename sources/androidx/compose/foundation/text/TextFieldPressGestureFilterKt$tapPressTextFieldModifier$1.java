package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.C2198j;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.foundation.interaction.C2245i;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
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

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTextFieldPressGestureFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,86:1\n474#2,4:87\n478#2,2:95\n482#2:101\n25#3:91\n25#3:102\n50#3:109\n49#3:110\n1114#4,3:92\n1117#4,3:98\n1114#4,6:103\n1114#4,6:111\n474#5:97\n*S KotlinDebug\n*F\n+ 1 TextFieldPressGestureFilter.kt\nandroidx/compose/foundation/text/TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1\n*L\n42#1:87,4\n42#1:95,2\n42#1:101\n42#1:91\n43#1:102\n45#1:109\n45#1:110\n42#1:92,3\n42#1:98,3\n43#1:103,6\n45#1:111,6\n42#1:97\n*E\n"})
public final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ C11300l<C15094f, C11079d2> $onTap;

    @C11067d(mo22501c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", mo22502f = "TextFieldPressGestureFilter.kt", mo22503i = {}, mo22504l = {55}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2 */
    public static final class C27442 extends SuspendLambda implements C11304p<C15472e0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C27442 r0 = new C27442(a, z0Var, gVar3, t, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C15472e0 e0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C27442) create(e0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                final C12074o0 o0Var = a;
                final C8700z0<C2245i.C2247b> z0Var = z0Var;
                final C2243g gVar = gVar3;
                C27451 r1 = new C11305q<C2198j, C15094f, C11045c<? super C11079d2>, Object>((C11045c<? super C27451>) null) {
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    @C12580l
                    /* renamed from: g */
                    public final Object mo9407g(@C12579k C2198j jVar, long j, @C12580l C11045c<? super C11079d2> cVar) {
                        C27451 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(C11300l<? super C15094f, C11079d2> lVar, C2243g gVar) {
                            super(3);
                            this.$onTap = lVar;
                            this.$interactionSource = gVar;
                        }

                        @C8540g
                        @C12579k
                        /* renamed from: a */
                        public final C8767m mo9405a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
                            Intrinsics.checkNotNullParameter(mVar, "$this$composed");
                            oVar.mo14918M(-102778667);
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(-102778667, i, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
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
                            final C8578k2<T> t = C8415c2.m30251t(this.$onTap, oVar, 0);
                            C2243g gVar = this.$interactionSource;
                            oVar.mo14918M(511388516);
                            boolean n0 = oVar.mo15006n0(z0Var) | oVar.mo15006n0(gVar);
                            Object N3 = oVar.mo14921N();
                            if (n0 || N3 == aVar.mo16277a()) {
                                N3 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1(z0Var, gVar);
                                oVar.mo14893C(N3);
                            }
                            oVar.mo15002m0();
                            EffectsKt.m29891c(gVar, (C11300l) N3, oVar, 0);
                            C8767m.C8768a aVar2 = C8767m.f23478j;
                            C2243g gVar2 = this.$interactionSource;
                            final C2243g gVar3 = gVar2;
                            C8767m c = SuspendingPointerInputFilterKt.m68437c(aVar2, gVar2, new C27442((C11045c<? super C27442>) null));
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29843v0();
                            }
                            oVar.mo15002m0();
                            return c;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return mo9405a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
                        }
                    }
