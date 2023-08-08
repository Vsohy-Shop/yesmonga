package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.service.presentation.model.DrivePoint;
import com.google.accompanist.pager.PagerState;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$1", mo22502f = "DriveCarouselStateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$1 */
public final class DriveCarouselStatefulKt$DriveCarouselStateful$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ List<DrivePoint> $drivePoints;
    final /* synthetic */ C8700z0<Boolean> $isAnimating$delegate;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ C8578k2<DrivePoint> $selection$delegate;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$1$1", mo22502f = "DriveCarouselStateful.kt", mo22503i = {}, mo22504l = {57}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.DriveCarouselStatefulKt$DriveCarouselStateful$1$1 */
    public static final class C284011 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C284011(pagerState, list, k2Var, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                PagerState pagerState = pagerState;
                int u = C11479u.m44447u(CollectionsKt___CollectionsKt.m40594Y2(list, DriveCarouselStatefulKt.DriveCarouselStateful$lambda$1(k2Var)), 0);
                this.label = 1;
                if (PagerState.m64379n(pagerState, u, 0.0f, this, 2, (Object) null) == h) {
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
            return ((C284011) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DriveCarouselStatefulKt$DriveCarouselStateful$1(PagerState pagerState, C8700z0<Boolean> z0Var, List<DrivePoint> list, C8578k2<DrivePoint> k2Var, C11045c<? super DriveCarouselStatefulKt$DriveCarouselStateful$1> cVar) {
        super(2, cVar);
        this.$pagerState = pagerState;
        this.$isAnimating$delegate = z0Var;
        this.$drivePoints = list;
        this.$selection$delegate = k2Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        DriveCarouselStatefulKt$DriveCarouselStateful$1 driveCarouselStatefulKt$DriveCarouselStateful$1 = new DriveCarouselStatefulKt$DriveCarouselStateful$1(this.$pagerState, this.$isAnimating$delegate, this.$drivePoints, this.$selection$delegate, cVar);
        driveCarouselStatefulKt$DriveCarouselStateful$1.L$0 = obj;
        return driveCarouselStatefulKt$DriveCarouselStateful$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C12074o0 o0Var = (C12074o0) this.L$0;
            if (this.$pagerState.mo7251e()) {
                return C11079d2.f28267a;
            }
            DriveCarouselStatefulKt.DriveCarouselStateful$lambda$4(this.$isAnimating$delegate, true);
            final PagerState pagerState = this.$pagerState;
            final List<DrivePoint> list = this.$drivePoints;
            final C8578k2<DrivePoint> k2Var = this.$selection$delegate;
            C11723c2 e = C12038j.m48061f(o0Var, (CoroutineContext) null, (CoroutineStart) null, new C284011((C11045c<? super C284011>) null), 3, (Object) null);
            final C8700z0<Boolean> z0Var = this.$isAnimating$delegate;
            e.mo23589D(new C11300l<Throwable, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C11079d2.f28267a;
                }

                public final void invoke(@C12580l Throwable th) {
                    DriveCarouselStatefulKt.DriveCarouselStateful$lambda$4(z0Var, false);
                }
            });
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((DriveCarouselStatefulKt$DriveCarouselStateful$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
