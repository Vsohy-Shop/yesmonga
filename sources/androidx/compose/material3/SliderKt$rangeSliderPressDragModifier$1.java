package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1", mo22502f = "Slider.kt", mo22503i = {}, mo22504l = {1249}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/e0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SliderKt$rangeSliderPressDragModifier$1 extends SuspendLambda implements C11304p<C15472e0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C2243g $endInteractionSource;
    final /* synthetic */ C8578k2<C11300l<Boolean, C11079d2>> $gestureEndAction;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ int $maxPx;
    final /* synthetic */ C8578k2<C11304p<Boolean, Float, C11079d2>> $onDrag;
    final /* synthetic */ C8578k2<Float> $rawOffsetEnd;
    final /* synthetic */ C8578k2<Float> $rawOffsetStart;
    final /* synthetic */ C2243g $startInteractionSource;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", mo22502f = "Slider.kt", mo22503i = {}, mo22504l = {1250}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1 */
    public static final class C80941 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C80941 r0 = new C80941(e0Var, z, i2, rangeSliderLogic2, k2Var, k2Var2, k2Var3, k2Var4, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                final C12074o0 o0Var = (C12074o0) this.L$0;
                C15472e0 e0Var = e0Var;
                final boolean z = z;
                final int i2 = i2;
                final RangeSliderLogic rangeSliderLogic = rangeSliderLogic2;
                final C8578k2<Float> k2Var = k2Var;
                final C8578k2<C11300l<Boolean, C11079d2>> k2Var2 = k2Var2;
                final C8578k2<Float> k2Var3 = k2Var3;
                final C8578k2<C11304p<Boolean, Float, C11079d2>> k2Var4 = k2Var4;
                C80951 r3 = new C11304p<C15465c, C11045c<? super C11079d2>, Object>((C11045c<? super C80951>) null) {
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        C80951 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public SliderKt$rangeSliderPressDragModifier$1(C2243g gVar, C2243g gVar2, C8578k2<Float> k2Var, C8578k2<Float> k2Var2, C8578k2<? extends C11304p<? super Boolean, ? super Float, C11079d2>> k2Var3, boolean z, int i, C8578k2<? extends C11300l<? super Boolean, C11079d2>> k2Var4, C11045c<? super SliderKt$rangeSliderPressDragModifier$1> cVar) {
                            super(2, cVar);
                            this.$startInteractionSource = gVar;
                            this.$endInteractionSource = gVar2;
                            this.$rawOffsetStart = k2Var;
                            this.$rawOffsetEnd = k2Var2;
                            this.$onDrag = k2Var3;
                            this.$isRtl = z;
                            this.$maxPx = i;
                            this.$gestureEndAction = k2Var4;
                        }

                        @C12579k
                        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                            SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, cVar);
                            sliderKt$rangeSliderPressDragModifier$1.L$0 = obj;
                            return sliderKt$rangeSliderPressDragModifier$1;
                        }

                        @C12580l
                        /* renamed from: g */
                        public final Object invoke(@C12579k C15472e0 e0Var, @C12580l C11045c<? super C11079d2> cVar) {
                            return ((SliderKt$rangeSliderPressDragModifier$1) create(e0Var, cVar)).invokeSuspend(C11079d2.f28267a);
                        }

                        @C12580l
                        public final Object invokeSuspend(@C12579k Object obj) {
                            Object h = C11063b.m42612h();
                            int i = this.label;
                            if (i == 0) {
                                C11661u0.m45747n(obj);
                                final C15472e0 e0Var = (C15472e0) this.L$0;
                                RangeSliderLogic rangeSliderLogic = new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag);
                                final boolean z = this.$isRtl;
                                final int i2 = this.$maxPx;
                                final C8578k2<Float> k2Var = this.$rawOffsetStart;
                                final C8578k2<C11300l<Boolean, C11079d2>> k2Var2 = this.$gestureEndAction;
                                final C8578k2<Float> k2Var3 = this.$rawOffsetEnd;
                                final C8578k2<C11304p<Boolean, Float, C11079d2>> k2Var4 = this.$onDrag;
                                final RangeSliderLogic rangeSliderLogic2 = rangeSliderLogic;
                                C80941 r3 = new C80941((C11045c<? super C80941>) null);
                                this.label = 1;
                                if (C12079p0.m48266g(r3, this) == h) {
                                    return h;
                                }
                            } else if (i == 1) {
                                C11661u0.m45747n(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return C11079d2.f28267a;
                        }
                    }
