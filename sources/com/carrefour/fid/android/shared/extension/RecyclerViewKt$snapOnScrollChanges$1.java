package com.carrefour.fid.android.shared.extension;

import androidx.recyclerview.widget.C20115d0;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.shared.extension.RecyclerViewKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.channels.ProduceKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.extension.RecyclerViewKt$snapOnScrollChanges$1", mo22502f = "RecyclerView.kt", mo22503i = {}, mo22504l = {102}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/channels/r;", "", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class RecyclerViewKt$snapOnScrollChanges$1 extends SuspendLambda implements C11304p<C11760r<? super Integer>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C20115d0 $snapHelper;
    final /* synthetic */ RecyclerView $this_snapOnScrollChanges;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerViewKt$snapOnScrollChanges$1(C20115d0 d0Var, RecyclerView recyclerView, C11045c<? super RecyclerViewKt$snapOnScrollChanges$1> cVar) {
        super(2, cVar);
        this.$snapHelper = d0Var;
        this.$this_snapOnScrollChanges = recyclerView;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        RecyclerViewKt$snapOnScrollChanges$1 recyclerViewKt$snapOnScrollChanges$1 = new RecyclerViewKt$snapOnScrollChanges$1(this.$snapHelper, this.$this_snapOnScrollChanges, cVar);
        recyclerViewKt$snapOnScrollChanges$1.L$0 = obj;
        return recyclerViewKt$snapOnScrollChanges$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<? super Integer> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((RecyclerViewKt$snapOnScrollChanges$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11760r rVar = (C11760r) this.L$0;
            final RecyclerViewKt.C28726c d = RecyclerViewKt.m118879r(rVar, this.$snapHelper, new RecyclerViewKt$snapOnScrollChanges$1$callback$1(rVar));
            this.$this_snapOnScrollChanges.mo59613r(d);
            final RecyclerView recyclerView = this.$this_snapOnScrollChanges;
            C287281 r3 = new C11289a<C11079d2>() {
                public final void invoke() {
                    recyclerView.mo59656w1(d);
                }
            };
            this.label = 1;
            if (ProduceKt.m46525a(rVar, r3, this) == h) {
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
