package androidx.compose.material;

import androidx.compose.foundation.gestures.C2193f;
import androidx.compose.foundation.gestures.C2198j;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
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
@C11363r0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$sliderTapModifier$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1189:1\n474#2,4:1190\n478#2,2:1198\n482#2:1204\n25#3:1194\n1114#4,3:1195\n1117#4,3:1201\n474#5:1200\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$sliderTapModifier$2\n*L\n907#1:1190,4\n907#1:1198,2\n907#1:1204\n907#1:1194\n907#1:1195,3\n907#1:1201,3\n907#1:1200\n*E\n"})
public final class SliderKt$sliderTapModifier$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C2193f $draggableState;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C8578k2<C11300l<Float, C11079d2>> $gestureEndAction;
    final /* synthetic */ C2243g $interactionSource;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $maxPx;
    final /* synthetic */ C8700z0<Float> $pressOffset;
    final /* synthetic */ C8578k2<Float> $rawOffset;

    @C11067d(mo22501c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1", mo22502f = "Slider.kt", mo22503i = {}, mo22504l = {909}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1 */
    public static final class C29871 extends SuspendLambda implements C11304p<C15472e0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C29871 r0 = new C29871(z, f, z0Var, k2Var, a, fVar, k2Var2, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C15472e0 e0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C29871) create(e0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                final boolean z = z;
                final float f = f;
                final C8700z0<Float> z0Var = z0Var;
                final C8578k2<Float> k2Var = k2Var;
                C29881 r6 = new C11305q<C2198j, C15094f, C11045c<? super C11079d2>, Object>((C11045c<? super C29881>) null) {
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    @C12580l
                    /* renamed from: g */
                    public final Object mo10421g(@C12579k C2198j jVar, long j, @C12580l C11045c<? super C11079d2> cVar) {
                        C29881 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public SliderKt$sliderTapModifier$2(boolean z, C2193f fVar, C2243g gVar, float f, boolean z2, C8700z0<Float> z0Var, C8578k2<Float> k2Var, C8578k2<? extends C11300l<? super Float, C11079d2>> k2Var2) {
                            super(3);
                            this.$enabled = z;
                            this.$draggableState = fVar;
                            this.$interactionSource = gVar;
                            this.$maxPx = f;
                            this.$isRtl = z2;
                            this.$pressOffset = z0Var;
                            this.$rawOffset = k2Var;
                            this.$gestureEndAction = k2Var2;
                        }

                        @C8540g
                        @C12579k
                        /* renamed from: a */
                        public final C8767m mo10419a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
                            Intrinsics.checkNotNullParameter(mVar, "$this$composed");
                            oVar.mo14918M(1945228890);
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(1945228890, i, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:904)");
                            }
                            if (this.$enabled) {
                                oVar.mo14918M(773894976);
                                oVar.mo14918M(-492369756);
                                Object N = oVar.mo14921N();
                                if (N == C8592o.f23032a.mo16277a()) {
                                    C8690w wVar = new C8690w(EffectsKt.m29901m(EmptyCoroutineContext.f28243a, oVar));
                                    oVar.mo14893C(wVar);
                                    N = wVar;
                                }
                                oVar.mo15002m0();
                                final C12074o0 a = ((C8690w) N).mo16831a();
                                oVar.mo15002m0();
                                Object[] objArr = {this.$draggableState, this.$interactionSource, Float.valueOf(this.$maxPx), Boolean.valueOf(this.$isRtl)};
                                final boolean z = this.$isRtl;
                                final float f = this.$maxPx;
                                final C8700z0<Float> z0Var = this.$pressOffset;
                                final C8578k2<Float> k2Var = this.$rawOffset;
                                final C2193f fVar = this.$draggableState;
                                final C8578k2<C11300l<Float, C11079d2>> k2Var2 = this.$gestureEndAction;
                                mVar = SuspendingPointerInputFilterKt.m68439e(mVar, objArr, new C29871((C11045c<? super C29871>) null));
                            }
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29843v0();
                            }
                            oVar.mo15002m0();
                            return mVar;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return mo10419a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
                        }
                    }
