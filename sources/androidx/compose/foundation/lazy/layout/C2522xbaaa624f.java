package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1 */
public final class C2522xbaaa624f extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ LazyLayoutItemContentFactory this$0;
    final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2522xbaaa624f(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
        super(2);
        this.this$0 = lazyLayoutItemContentFactory;
        this.this$1 = cachedItemContent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    public final void invoke(@C12580l C8592o oVar, int i) {
        final int i2;
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1403994769, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:89)");
            }
            final C2549h invoke = this.this$0.mo8680d().invoke();
            Integer num = invoke.mo8292f().get(this.this$1.mo8683e());
            if (num != null) {
                this.this$1.mo8686h(num.intValue());
                i2 = num.intValue();
            } else {
                i2 = this.this$1.mo8684f();
            }
            oVar.mo14918M(-715770513);
            if (i2 < invoke.mo8288a()) {
                Object g = invoke.mo8293g(i2);
                if (Intrinsics.areEqual(g, this.this$1.mo8683e())) {
                    this.this$0.f6692a.mo8711d(g, C8553b.m31048b(oVar, -1238863364, true, new C11304p<C8592o, Integer, C11079d2>() {
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((C8592o) obj, ((Number) obj2).intValue());
                            return C11079d2.f28267a;
                        }

                        @C8540g
                        public final void invoke(@C12580l C8592o oVar, int i) {
                            if ((i & 11) != 2 || !oVar.mo15011p()) {
                                if (ComposerKt.m29813g0()) {
                                    ComposerKt.m29845w0(-1238863364, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous>.<anonymous> (LazyLayoutItemContentFactory.kt:97)");
                                }
                                invoke.mo8291e(i2, oVar, 0);
                                if (ComposerKt.m29813g0()) {
                                    ComposerKt.m29843v0();
                                    return;
                                }
                                return;
                            }
                            oVar.mo14958a0();
                        }
                    }), oVar, 568);
                }
            }
            oVar.mo15002m0();
            Object e = this.this$1.mo8683e();
            final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.this$1;
            EffectsKt.m29891c(e, new C11300l<C8434e0, C8430d0>() {

                @C11363r0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2\n*L\n1#1,484:1\n106#2,2:485\n*E\n"})
                /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$a */
                public static final class C2525a implements C8430d0 {

                    /* renamed from: a */
                    public final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent f6700a;

                    public C2525a(LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
                        this.f6700a = cachedItemContent;
                    }

                    /* renamed from: g */
                    public void mo791g() {
                        this.f6700a.f6698d = null;
                    }
                }

                @C12579k
                /* renamed from: a */
                public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
                    Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
                    return new C2525a(cachedItemContent);
                }
            }, oVar, 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
