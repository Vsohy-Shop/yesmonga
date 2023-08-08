package com.carrefour.fid.android.core.extension;

import androidx.viewpager2.widget.ViewPager2;
import com.carrefour.fid.android.core.extension.ViewPagerKt;
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

@C11067d(mo22501c = "com.carrefour.fid.android.core.extension.ViewPagerKt$pageScrollStateChanges$1", mo22502f = "ViewPager.kt", mo22503i = {}, mo22504l = {47}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/channels/r;", "", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ViewPagerKt$pageScrollStateChanges$1 extends SuspendLambda implements C11304p<C11760r<? super Integer>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ ViewPager2 $this_pageScrollStateChanges;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewPagerKt$pageScrollStateChanges$1(ViewPager2 viewPager2, C11045c<? super ViewPagerKt$pageScrollStateChanges$1> cVar) {
        super(2, cVar);
        this.$this_pageScrollStateChanges = viewPager2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ViewPagerKt$pageScrollStateChanges$1 viewPagerKt$pageScrollStateChanges$1 = new ViewPagerKt$pageScrollStateChanges$1(this.$this_pageScrollStateChanges, cVar);
        viewPagerKt$pageScrollStateChanges$1.L$0 = obj;
        return viewPagerKt$pageScrollStateChanges$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<? super Integer> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ViewPagerKt$pageScrollStateChanges$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11760r rVar = (C11760r) this.L$0;
            final ViewPagerKt.C36300a b = ViewPagerKt.m148932d(rVar, new ViewPagerKt$pageScrollStateChanges$1$callback$1(rVar));
            this.$this_pageScrollStateChanges.mo62469n(b);
            final ViewPager2 viewPager2 = this.$this_pageScrollStateChanges;
            C363011 r3 = new C11289a<C11079d2>() {
                public final void invoke() {
                    viewPager2.mo62493w(b);
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
