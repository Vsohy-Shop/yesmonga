package androidx.compose.p004ui.text.font;

import androidx.compose.p004ui.text.platform.C16400z;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/text/font/k1;", "finalResult", "Lkotlin/d2;", "a", "(Landroidx/compose/ui/text/font/k1;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,248:1\n24#2:249\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n*L\n191#1:249\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1 */
public final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends Lambda implements C11300l<C16217k1, C11079d2> {
    final /* synthetic */ C16214j1 $typefaceRequest;
    final /* synthetic */ TypefaceRequestCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypefaceRequestCache$runCached$currentTypefaceResult$1(TypefaceRequestCache typefaceRequestCache, C16214j1 j1Var) {
        super(1);
        this.this$0 = typefaceRequestCache;
        this.$typefaceRequest = j1Var;
    }

    /* renamed from: a */
    public final void mo46810a(@C12579k C16217k1 k1Var) {
        Intrinsics.checkNotNullParameter(k1Var, "finalResult");
        C16400z c = this.this$0.mo46806c();
        TypefaceRequestCache typefaceRequestCache = this.this$0;
        C16214j1 j1Var = this.$typefaceRequest;
        synchronized (c) {
            if (k1Var.mo46977b()) {
                typefaceRequestCache.f40232b.mo46632k(j1Var, k1Var);
            } else {
                typefaceRequestCache.f40232b.mo46634m(j1Var);
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo46810a((C16217k1) obj);
        return C11079d2.f28267a;
    }
}
