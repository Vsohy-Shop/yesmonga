package androidx.compose.p004ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", mo22502f = "AndroidFontLoader.android.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Landroid/graphics/Typeface;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2 */
public final class AndroidFontLoader_androidKt$loadAsync$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super Typeface>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ C16245u0 $this_loadAsync;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader_androidKt$loadAsync$2(C16245u0 u0Var, Context context, C11045c<? super AndroidFontLoader_androidKt$loadAsync$2> cVar) {
        super(2, cVar);
        this.$this_loadAsync = u0Var;
        this.$context = context;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new AndroidFontLoader_androidKt$loadAsync$2(this.$this_loadAsync, this.$context, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            return AndroidFontLoader_androidKt.m72827c(this.$this_loadAsync, this.$context);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super Typeface> cVar) {
        return ((AndroidFontLoader_androidKt$loadAsync$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
