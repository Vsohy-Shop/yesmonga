package com.urbanairship.android.layout.util;

import com.urbanairship.android.layout.widget.CheckableView;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.urbanairship.android.layout.util.ViewExtensionsKt$checkedChanges$2", mo22502f = "ViewExtensions.kt", mo22503i = {}, mo22504l = {69}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class ViewExtensionsKt$checkedChanges$2 extends SuspendLambda implements C11304p<C11908f<? super Boolean>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ CheckableView<?> $this_checkedChanges;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewExtensionsKt$checkedChanges$2(CheckableView<?> checkableView, C11045c<? super ViewExtensionsKt$checkedChanges$2> cVar) {
        super(2, cVar);
        this.$this_checkedChanges = checkableView;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ViewExtensionsKt$checkedChanges$2 viewExtensionsKt$checkedChanges$2 = new ViewExtensionsKt$checkedChanges$2(this.$this_checkedChanges, cVar);
        viewExtensionsKt$checkedChanges$2.L$0 = obj;
        return viewExtensionsKt$checkedChanges$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super Boolean> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ViewExtensionsKt$checkedChanges$2) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            Boolean a = C11064a.m42615a(this.$this_checkedChanges.getCheckableView().mo107698a());
            this.label = 1;
            if (((C11908f) this.L$0).emit(a, this) == h) {
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
