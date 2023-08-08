package com.carrefour.fid.android.design.components.compose;

import android.graphics.drawable.Drawable;
import androidx.compose.foundation.gestures.TransformableKt;
import androidx.compose.foundation.gestures.TransformableStateKt;
import androidx.compose.foundation.layout.C2362h;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15320t2;
import androidx.compose.p004ui.graphics.C15329u3;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.libs.pager.C37465b;
import com.carrefour.fid.android.design.libs.pager.PagerState;
import com.skydoves.landscapist.C35314a;
import com.skydoves.landscapist.glide.C35325c;
import com.skydoves.landscapist.glide.C35326d;
import com.skydoves.landscapist.palette.BitmapPalette;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCarouselComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselComponent.kt\ncom/carrefour/fid/android/design/components/compose/CarouselComponentKt$ImagesFullScreen$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,256:1\n25#2:257\n25#2:264\n50#2:271\n49#2:272\n36#2:279\n1114#3,6:258\n1114#3,6:265\n1114#3,6:273\n1114#3,6:280\n154#4:286\n76#5:287\n102#5,2:288\n76#5:290\n102#5,2:291\n*S KotlinDebug\n*F\n+ 1 CarouselComponent.kt\ncom/carrefour/fid/android/design/components/compose/CarouselComponentKt$ImagesFullScreen$1$1\n*L\n166#1:257\n167#1:264\n168#1:271\n168#1:272\n182#1:279\n166#1:258,6\n167#1:265,6\n168#1:273,6\n182#1:280,6\n186#1:286\n166#1:287\n166#1:288,2\n167#1:290\n167#1:291,2\n*E\n"})
public final class CarouselComponentKt$ImagesFullScreen$1$1 extends Lambda implements C11306r<C37465b, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ PagerState $fullScreenCarouselState;
    final /* synthetic */ C12074o0 $scope;
    final /* synthetic */ List<String> $urls;

    @C11067d(mo22501c = "com.carrefour.fid.android.design.components.compose.CarouselComponentKt$ImagesFullScreen$1$1$2", mo22502f = "CarouselComponent.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.design.components.compose.CarouselComponentKt$ImagesFullScreen$1$1$2 */
    public static final class C369212 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C369212(o0Var, pagerState, z0Var4, z0Var5, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C12074o0 o0Var = o0Var;
                final PagerState pagerState = pagerState;
                final C8700z0<Float> z0Var = z0Var4;
                final C8700z0<C15094f> z0Var2 = z0Var5;
                C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C11304p<C12074o0, C11045c<? super C11079d2>, Object>((C11045c<? super C369221>) null) {
                    int label;

                    /* renamed from: com.carrefour.fid.android.design.components.compose.CarouselComponentKt$ImagesFullScreen$1$1$2$1$a */
                    public static final class C36924a implements C11908f<Integer> {

                        /* renamed from: a */
                        public final /* synthetic */ C8700z0<Float> f92111a;

                        /* renamed from: b */
                        public final /* synthetic */ C8700z0<C15094f> f92112b;

                        public C36924a(C8700z0<Float> z0Var, C8700z0<C15094f> z0Var2) {
                            this.f92111a = z0Var;
                            this.f92112b = z0Var2;
                        }

                        @C12580l
                        /* renamed from: c */
                        public final Object mo111984c(int i, @C12579k C11045c<? super C11079d2> cVar) {
                            CarouselComponentKt$ImagesFullScreen$1$1.m151365g(this.f92111a, 1.0f);
                            CarouselComponentKt$ImagesFullScreen$1$1.m151367i(this.f92112b, C15094f.f37256b.mo42248e());
                            return C11079d2.f28267a;
                        }

                        public /* bridge */ /* synthetic */ Object emit(Object obj, C11045c cVar) {
                            return mo111984c(((Number) obj).intValue(), cVar);
                        }
                    }

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public CarouselComponentKt$ImagesFullScreen$1$1(List<String> list, C12074o0 o0Var, PagerState pagerState) {
                            super(4);
                            this.$urls = list;
                            this.$scope = o0Var;
                            this.$fullScreenCarouselState = pagerState;
                        }

                        /* renamed from: f */
                        public static final float m151364f(C8700z0<Float> z0Var) {
                            return z0Var.getValue().floatValue();
                        }

                        /* renamed from: g */
                        public static final void m151365g(C8700z0<Float> z0Var, float f) {
                            z0Var.setValue(Float.valueOf(f));
                        }

                        /* renamed from: h */
                        public static final long m151366h(C8700z0<C15094f> z0Var) {
                            return z0Var.getValue().mo42242A();
                        }

                        /* renamed from: i */
                        public static final void m151367i(C8700z0<C15094f> z0Var, long j) {
                            z0Var.setValue(C15094f.m64868d(j));
                        }

                        @C8540g
                        @C8570j(applier = "androidx.compose.ui.UiComposable")
                        /* renamed from: e */
                        public final void mo111981e(@C12579k C37465b bVar, int i, @C12580l C8592o oVar, int i2) {
                            int i3;
                            int i4;
                            int i5 = i;
                            C8592o oVar2 = oVar;
                            int i6 = i2;
                            Intrinsics.checkNotNullParameter(bVar, "$this$HorizontalPager");
                            if ((i6 & 112) == 0) {
                                if (oVar2.mo14976f(i5)) {
                                    i4 = 32;
                                } else {
                                    i4 = 16;
                                }
                                i3 = i4 | i6;
                            } else {
                                i3 = i6;
                            }
                            if ((i3 & 721) != 144 || !oVar.mo15011p()) {
                                if (ComposerKt.m29813g0()) {
                                    ComposerKt.m29845w0(209508459, i6, -1, "com.carrefour.fid.android.design.components.compose.ImagesFullScreen.<anonymous>.<anonymous> (CarouselComponent.kt:163)");
                                }
                                oVar2.mo14918M(-492369756);
                                Object N = oVar.mo14921N();
                                C8592o.C8593a aVar = C8592o.f23032a;
                                if (N == aVar.mo16277a()) {
                                    N = C8539f2.m30981g(Float.valueOf(1.0f), (C8410b2) null, 2, (Object) null);
                                    oVar2.mo14893C(N);
                                }
                                oVar.mo15002m0();
                                C8700z0 z0Var = (C8700z0) N;
                                oVar2.mo14918M(-492369756);
                                Object N2 = oVar.mo14921N();
                                if (N2 == aVar.mo16277a()) {
                                    N2 = C8539f2.m30981g(C15094f.m64868d(C15094f.f37256b.mo42248e()), (C8410b2) null, 2, (Object) null);
                                    oVar2.mo14893C(N2);
                                }
                                oVar.mo15002m0();
                                C8700z0 z0Var2 = (C8700z0) N2;
                                oVar2.mo14918M(511388516);
                                boolean n0 = oVar2.mo15006n0(z0Var) | oVar2.mo15006n0(z0Var2);
                                Object N3 = oVar.mo14921N();
                                if (n0 || N3 == aVar.mo16277a()) {
                                    N3 = new CarouselComponentKt$ImagesFullScreen$1$1$state$1$1(z0Var, z0Var2);
                                    oVar2.mo14893C(N3);
                                }
                                oVar.mo15002m0();
                                C8767m d = TransformableKt.m9470d(C15320t2.m66561e(C8767m.f23478j, C11479u.m44310A(C11479u.m44444t(m151364f(z0Var), 1.0f), 4.0f), C11479u.m44310A(C11479u.m44444t(m151364f(z0Var), 1.0f), 4.0f), 0.0f, C15094f.m64880p(m151366h(z0Var2)), C15094f.m64882r(m151366h(z0Var2)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (C15218g4) null, false, (C15329u3) null, 0, 0, 0, 131044, (Object) null), TransformableStateKt.m9484i((C11305q) N3, oVar2, 0), false, false, 6, (Object) null);
                                C11079d2 d2Var = C11079d2.f28267a;
                                oVar2.mo14918M(1157296644);
                                boolean n02 = oVar2.mo15006n0(z0Var);
                                Object N4 = oVar.mo14921N();
                                if (n02 || N4 == aVar.mo16277a()) {
                                    N4 = new CarouselComponentKt$ImagesFullScreen$1$1$1$1(z0Var, (C11045c<? super CarouselComponentKt$ImagesFullScreen$1$1$1$1>) null);
                                    oVar2.mo14893C(N4);
                                }
                                oVar.mo15002m0();
                                C11079d2 d2Var2 = d2Var;
                                C8700z0 z0Var3 = z0Var2;
                                C35325c.m145645b(this.$urls.get(i5), PaddingKt.m10024k(SuspendingPointerInputFilterKt.m68437c(d, d2Var, (C11304p) N4), C16483g.m74435M((float) 16)), (C11304p<? super C8592o, ? super Integer, ? extends C22090i<Drawable>>) null, (C11304p<? super C8592o, ? super Integer, ? extends C22561h>) null, (C22560g<Drawable>) null, (C8734c) null, C15541c.f38696a.mo44373i(), (String) null, 0.0f, (C15249k2) null, (C35314a) null, (BitmapPalette) null, C36896b.C36904h.ds_ic_placeholder, ComposableSingletons$CarouselComponentKt.f92161a.mo112048b(), (C11306r<? super C2362h, ? super C35326d.C35330d, ? super C8592o, ? super Integer, C11079d2>) null, (C11306r<? super C2362h, ? super C35326d.C35327a, ? super C8592o, ? super Integer, C11079d2>) null, oVar, 1572864, 3072, 53180);
                                final C12074o0 o0Var = this.$scope;
                                final PagerState pagerState = this.$fullScreenCarouselState;
                                final C8700z0 z0Var4 = z0Var;
                                final C8700z0 z0Var5 = z0Var3;
                                EffectsKt.m29896h(d2Var2, new C369212((C11045c<? super C369212>) null), oVar, 70);
                                if (ComposerKt.m29813g0()) {
                                    ComposerKt.m29843v0();
                                    return;
                                }
                                return;
                            }
                            oVar.mo14958a0();
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            mo111981e((C37465b) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
                            return C11079d2.f28267a;
                        }
                    }
