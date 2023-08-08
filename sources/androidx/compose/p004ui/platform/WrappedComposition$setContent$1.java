package androidx.compose.p004ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.p004ui.C8776o;
import androidx.compose.p004ui.platform.AndroidComposeView;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8598p;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.lifecycle.Lifecycle;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1 */
public final class WrappedComposition$setContent$1 extends Lambda implements C11300l<AndroidComposeView.C15753b, C11079d2> {
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ WrappedComposition this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrappedComposition$setContent$1(WrappedComposition wrappedComposition, C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        super(1);
        this.this$0 = wrappedComposition;
        this.$content = pVar;
    }

    /* renamed from: a */
    public final void mo45611a(@C12579k AndroidComposeView.C15753b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "it");
        if (!this.this$0.f39445c) {
            Lifecycle lifecycle = bVar.mo45365a().getLifecycle();
            this.this$0.f39447e = this.$content;
            if (this.this$0.f39446d == null) {
                this.this$0.f39446d = lifecycle;
                lifecycle.mo57464a(this.this$0);
            } else if (lifecycle.mo57465b().mo57474q(Lifecycle.State.CREATED)) {
                C8598p E = this.this$0.mo45609E();
                final WrappedComposition wrappedComposition = this.this$0;
                final C11304p<C8592o, Integer, C11079d2> pVar = this.$content;
                E.mo16286j(C8553b.m31049c(-2000640158, true, new C11304p<C8592o, Integer, C11079d2>() {

                    @C11067d(mo22501c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", mo22502f = "Wrapper.android.kt", mo22503i = {}, mo22504l = {153}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
                    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
                    /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1 */
                    public static final class C158271 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
                        int label;

                        @C12579k
                        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                            return new C158271(wrappedComposition, cVar);
                        }

                        @C12580l
                        public final Object invokeSuspend(@C12579k Object obj) {
                            Object h = C11063b.m42612h();
                            int i = this.label;
                            if (i == 0) {
                                C11661u0.m45747n(obj);
                                AndroidComposeView F = wrappedComposition.mo45610F();
                                this.label = 1;
                                if (F.mo45308b0(this) == h) {
                                    return h;
                                }
                            } else if (i == 1) {
                                C11661u0.m45747n(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return C11079d2.f28267a;
                        }

                        @C12580l
                        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
                            return ((C158271) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
                        }
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((C8592o) obj, ((Number) obj2).intValue());
                        return C11079d2.f28267a;
                    }

                    @C8540g
                    public final void invoke(@C12580l C8592o oVar, int i) {
                        if ((i & 11) != 2 || !oVar.mo15011p()) {
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29845w0(-2000640158, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:139)");
                            }
                            AndroidComposeView F = wrappedComposition.mo45610F();
                            int i2 = C8776o.C8778b.inspection_slot_table_set;
                            Object tag = F.getTag(i2);
                            Set set = C11370u0.m43680J(tag) ? (Set) tag : null;
                            if (set == null) {
                                ViewParent parent = wrappedComposition.mo45610F().getParent();
                                View view = parent instanceof View ? (View) parent : null;
                                Object tag2 = view != null ? view.getTag(i2) : null;
                                set = C11370u0.m43680J(tag2) ? (Set) tag2 : null;
                            }
                            if (set != null) {
                                set.add(oVar.mo14924O());
                                oVar.mo14909J();
                            }
                            AndroidComposeView F2 = wrappedComposition.mo45610F();
                            final WrappedComposition wrappedComposition = wrappedComposition;
                            EffectsKt.m29896h(F2, new C158271((C11045c<? super C158271>) null), oVar, 72);
                            C8572j1[] j1VarArr = {InspectionTablesKt.m31883a().mo16141f(set)};
                            final WrappedComposition wrappedComposition2 = wrappedComposition;
                            final C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                            CompositionLocalKt.m29856b(j1VarArr, C8553b.m31048b(oVar, -1193460702, true, new C11304p<C8592o, Integer, C11079d2>() {
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((C8592o) obj, ((Number) obj2).intValue());
                                    return C11079d2.f28267a;
                                }

                                @C8540g
                                public final void invoke(@C12580l C8592o oVar, int i) {
                                    if ((i & 11) != 2 || !oVar.mo15011p()) {
                                        if (ComposerKt.m29813g0()) {
                                            ComposerKt.m29845w0(-1193460702, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)");
                                        }
                                        AndroidCompositionLocals_androidKt.m70946a(wrappedComposition2.mo45610F(), pVar, oVar, 8);
                                        if (ComposerKt.m29813g0()) {
                                            ComposerKt.m29843v0();
                                            return;
                                        }
                                        return;
                                    }
                                    oVar.mo14958a0();
                                }
                            }), oVar, 56);
                            if (ComposerKt.m29813g0()) {
                                ComposerKt.m29843v0();
                                return;
                            }
                            return;
                        }
                        oVar.mo14958a0();
                    }
                }));
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo45611a((AndroidComposeView.C15753b) obj);
        return C11079d2.f28267a;
    }
}
