package com.carrefour.fid.android.presentation.p035ui.checkout.p036al.screen;

import android.content.Context;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.foundation.lazy.C2517l;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8690w;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.BlockDividerKt;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.C23493a;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.PromoCodeComponentKt;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.type.C28897f;
import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/foundation/lazy/e;", "Lkotlin/d2;", "invoke", "(Landroidx/compose/foundation/lazy/e;Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutStep2Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep2ScreenKt$promoCodeSection$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,739:1\n474#2,4:740\n478#2,2:748\n482#2:754\n25#3:744\n1114#4,3:745\n1117#4,3:751\n474#5:750\n76#6:755\n*S KotlinDebug\n*F\n+ 1 CheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/screen/CheckoutStep2ScreenKt$promoCodeSection$1\n*L\n389#1:740,4\n389#1:748,2\n389#1:754\n389#1:744\n389#1:745,3\n389#1:751,3\n389#1:750\n393#1:755\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$promoCodeSection$1 */
public final class CheckoutStep2ScreenKt$promoCodeSection$1 extends Lambda implements C11305q<C2455e, C8592o, Integer, C11079d2> {
    final /* synthetic */ String $key;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ C11289a<C11079d2> $onCodeRemove;
    final /* synthetic */ C11300l<String, C11079d2> $onCodeValidation;
    final /* synthetic */ C28892e<String> $promoCodeState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep2ScreenKt$promoCodeSection$1(C28892e<String> eVar, C11300l<? super String, C11079d2> lVar, C11289a<C11079d2> aVar, LazyListState lazyListState, String str) {
        super(3);
        this.$promoCodeState = eVar;
        this.$onCodeValidation = lVar;
        this.$onCodeRemove = aVar;
        this.$listState = lazyListState;
        this.$key = str;
    }

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
                ComposerKt.m29845w0(-1775581967, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.screen.promoCodeSection.<anonymous> (CheckoutStep2Screen.kt:385)");
            }
            BlockDividerKt.m104587a(oVar, 0);
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
            String str = (String) C28897f.m119478b(this.$promoCodeState);
            Context context = (Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g());
            C28892e<String> eVar2 = this.$promoCodeState;
            Throwable th = null;
            C28892e.C28893a aVar = eVar2 instanceof C28892e.C28893a ? (C28892e.C28893a) eVar2 : null;
            if (aVar != null) {
                th = aVar.mo84083d();
            }
            String a2 = C23493a.m104659a(context, th);
            boolean z = this.$promoCodeState instanceof C28892e.C28894b;
            C11300l<String, C11079d2> lVar = this.$onCodeValidation;
            C11289a<C11079d2> aVar2 = this.$onCodeRemove;
            final LazyListState lazyListState = this.$listState;
            final String str2 = this.$key;
            PromoCodeComponentKt.m104635d(str, a2, z, lVar, aVar2, new C11289a<C11079d2>() {

                @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$promoCodeSection$1$1$1", mo22502f = "CheckoutStep2Screen.kt", mo22503i = {}, mo22504l = {404}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
                @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
                /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.screen.CheckoutStep2ScreenKt$promoCodeSection$1$1$1 */
                public static final class C234131 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
                    int label;

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        return new C234131(lazyListState, index, cVar);
                    }

                    @C12580l
                    public final Object invokeSuspend(@C12579k Object obj) {
                        Object h = C11063b.m42612h();
                        int i = this.label;
                        if (i == 0) {
                            C11661u0.m45747n(obj);
                            LazyListState lazyListState = lazyListState;
                            int i2 = index;
                            this.label = 1;
                            if (LazyListState.m10849H(lazyListState, i2, 0, this, 2, (Object) null) == h) {
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
                        return ((C234131) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
                    }
                }

                public final void invoke() {
                    Object obj;
                    String str = str2;
                    Iterator it = lazyListState.mo8343u().mo8378i().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual(((C2517l) obj).getKey(), (Object) str)) {
                            break;
                        }
                    }
                    C2517l lVar = (C2517l) obj;
                    final int index = lVar != null ? lVar.getIndex() : -1;
                    C12074o0 o0Var = a;
                    final LazyListState lazyListState = lazyListState;
                    C11723c2 unused = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C234131((C11045c<? super C234131>) null), 3, (Object) null);
                }
            }, C234142.f59230f, oVar, 1572864);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
