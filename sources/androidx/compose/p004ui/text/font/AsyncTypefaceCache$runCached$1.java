package androidx.compose.p004ui.text.font;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.text.font.AsyncTypefaceCache", mo22502f = "FontListFontFamilyTypefaceAdapter.kt", mo22503i = {0, 0, 0}, mo22504l = {394}, mo22505m = "runCached", mo22506n = {"this", "key", "forever"}, mo22507s = {"L$0", "L$1", "Z$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 */
public final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncTypefaceCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, C11045c<? super AsyncTypefaceCache$runCached$1> cVar) {
        super(cVar);
        this.this$0 = asyncTypefaceCache;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo46768g((C16238t) null, (C16227o0) null, false, (C11300l<? super C11045c<Object>, ? extends Object>) null, this);
    }
}
