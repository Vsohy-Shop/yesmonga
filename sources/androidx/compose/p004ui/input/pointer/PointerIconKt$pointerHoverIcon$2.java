package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt$pointerHoverIcon$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,101:1\n76#2:102\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt$pointerHoverIcon$2\n*L\n80#1:102\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2 */
public final class PointerIconKt$pointerHoverIcon$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C15496s $icon;
    final /* synthetic */ boolean $overrideDescendants;

    @C11067d(mo22501c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1", mo22502f = "PointerIcon.kt", mo22503i = {}, mo22504l = {85}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$1 */
    public static final class C154501 extends SuspendLambda implements C11304p<C15472e0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C154501 r0 = new C154501(z, tVar, sVar2, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C15472e0 e0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C154501) create(e0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                final boolean z = z;
                final C15498t tVar = tVar;
                final C15496s sVar = sVar2;
                C154511 r1 = new C11304p<C15465c, C11045c<? super C11079d2>, Object>((C11045c<? super C154511>) null) {
                    private /* synthetic */ Object L$0;
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        C154511 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public PointerIconKt$pointerHoverIcon$2(C15496s sVar, boolean z) {
                            super(3);
                            this.$icon = sVar;
                            this.$overrideDescendants = z;
                        }

                        @C8540g
                        @C12579k
                        /* renamed from: a */
                        public final C8767m mo43968a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
                            C8767m mVar2;
                            Intrinsics.checkNotNullParameter(mVar, "$this$composed");
                            oVar.mo14918M(811087536);
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(811087536, i, -1, "androidx.compose.ui.input.pointer.pointerHoverIcon.<anonymous> (PointerIcon.kt:78)");
                            }
                            final C15498t tVar = (C15498t) oVar.mo15032w(CompositionLocalsKt.m71021s());
                            if (tVar == null) {
                                mVar2 = C8767m.f23478j;
                            } else {
                                C15496s sVar = this.$icon;
                                Boolean valueOf = Boolean.valueOf(this.$overrideDescendants);
                                final boolean z = this.$overrideDescendants;
                                final C15496s sVar2 = this.$icon;
                                mVar2 = SuspendingPointerInputFilterKt.m68436b(mVar, sVar, valueOf, new C154501((C11045c<? super C154501>) null));
                            }
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29843v0();
                            }
                            oVar.mo15002m0();
                            return mVar2;
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return mo43968a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
                        }
                    }
