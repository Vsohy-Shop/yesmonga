package androidx.compose.foundation.text;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1946b;
import androidx.compose.animation.core.C1983k;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.DrawModifierKt;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15225h4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15242j3;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,100:1\n25#2:101\n1114#3,6:102\n652#4:108\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n*L\n47#1:101\n47#1:102,6\n48#1:108\n*E\n"})
public final class TextFieldCursorKt$cursor$1 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C15421z1 $cursorBrush;
    final /* synthetic */ C16281c0 $offsetMapping;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TextFieldValue $value;

    @C11067d(mo22501c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", mo22502f = "TextFieldCursor.kt", mo22503i = {}, mo22504l = {52}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1 */
    public static final class C27301 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C27301(animatable, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C2760b bVar = C2760b.f7261a;
                final Animatable<Float, C1983k> animatable = animatable;
                C27311 r1 = new C11304p<C12074o0, C11045c<? super C11079d2>, Object>((C11045c<? super C27311>) null) {
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public TextFieldCursorKt$cursor$1(C15421z1 z1Var, TextFieldState textFieldState, TextFieldValue textFieldValue, C16281c0 c0Var) {
                            super(3);
                            this.$cursorBrush = z1Var;
                            this.$state = textFieldState;
                            this.$value = textFieldValue;
                            this.$offsetMapping = c0Var;
                        }

                        @C8540g
                        @C12579k
                        /* renamed from: a */
                        public final C8767m mo9361a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
                            C8767m mVar2;
                            boolean z;
                            Intrinsics.checkNotNullParameter(mVar, "$this$composed");
                            oVar.mo14918M(1634330012);
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(1634330012, i, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
                            }
                            oVar.mo14918M(-492369756);
                            Object N = oVar.mo14921N();
                            if (N == C8592o.f23032a.mo16277a()) {
                                N = C1946b.m8288b(1.0f, 0.0f, 2, (Object) null);
                                oVar.mo14893C(N);
                            }
                            oVar.mo15002m0();
                            final Animatable animatable = (Animatable) N;
                            C15421z1 z1Var = this.$cursorBrush;
                            boolean z2 = true;
                            if (z1Var instanceof C15225h4) {
                                if (((C15225h4) z1Var).mo42781c() == C15240j2.f37547b.mo42851u()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    z2 = false;
                                }
                            }
                            if (!this.$state.mo9440d() || !C16356n0.m73736h(this.$value.mo47113h()) || !z2) {
                                mVar2 = C8767m.f23478j;
                            } else {
                                EffectsKt.m29895g(this.$value.mo47111f(), C16356n0.m73730b(this.$value.mo47113h()), new C27301((C11045c<? super C27301>) null), oVar, 512);
                                final C16281c0 c0Var = this.$offsetMapping;
                                final TextFieldValue textFieldValue = this.$value;
                                final TextFieldState textFieldState = this.$state;
                                final C15421z1 z1Var2 = this.$cursorBrush;
                                mVar2 = DrawModifierKt.m32438c(mVar, new C11300l<C15184c, C11079d2>() {
                                    /* renamed from: a */
                                    public final void mo9364a(@C12579k C15184c cVar) {
                                        boolean z;
                                        C15098i iVar;
                                        C16260h0 i;
                                        C15184c cVar2 = cVar;
                                        Intrinsics.checkNotNullParameter(cVar2, "$this$drawWithContent");
                                        cVar.mo42716g6();
                                        float H = C11479u.m44331H(animatable.mo6613u().floatValue(), 0.0f, 1.0f);
                                        if (H == 0.0f) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (!z) {
                                            int b = c0Var.mo9514b(C16356n0.m73742n(textFieldValue.mo47113h()));
                                            C2851y g = textFieldState.mo9443g();
                                            if (g == null || (i = g.mo9930i()) == null || (iVar = i.mo47049e(b)) == null) {
                                                iVar = new C15098i(0.0f, 0.0f, 0.0f, 0.0f);
                                            }
                                            float g5 = cVar2.mo7425g5(TextFieldCursorKt.m12376c());
                                            float f = g5 / ((float) 2);
                                            float A = C11479u.m44310A(iVar.mo42279t() + f, C15104m.m65023t(cVar.mo42718b()) - f);
                                            C15184c cVar3 = cVar;
                                            C15187e.m65712f6(cVar3, z1Var2, C15096g.m64898a(A, iVar.mo42249B()), C15096g.m64898a(A, iVar.mo42271j()), g5, 0, (C15242j3) null, H, (C15249k2) null, 0, 432, (Object) null);
                                        }
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        mo9364a((C15184c) obj);
                                        return C11079d2.f28267a;
                                    }
                                });
                            }
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29843v0();
                            }
                            oVar.mo15002m0();
                            return mVar2;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return mo9361a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
                        }
                    }
