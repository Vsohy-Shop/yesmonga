package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.usabilla.sdk.ubform.net.C9851c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.channels.ProduceKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", mo22502f = "PipHintTracker.kt", mo22503i = {}, mo22504l = {87}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/channels/r;", "Landroid/graphics/Rect;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements C11304p<C11760r<? super Rect>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$a */
    public static final class C0207a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C11760r<Rect> f689a;

        /* renamed from: b */
        public final /* synthetic */ View f690b;

        /* renamed from: c */
        public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f691c;

        /* renamed from: d */
        public final /* synthetic */ View.OnLayoutChangeListener f692d;

        public C0207a(C11760r<? super Rect> rVar, View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener) {
            this.f689a = rVar;
            this.f690b = view;
            this.f691c = onScrollChangedListener;
            this.f692d = onLayoutChangeListener;
        }

        public void onViewAttachedToWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
            this.f689a.mo23751L(PipHintTrackerKt.m1256c(this.f690b));
            this.f690b.getViewTreeObserver().addOnScrollChangedListener(this.f691c);
            this.f690b.addOnLayoutChangeListener(this.f692d);
        }

        public void onViewDetachedFromWindow(@C12579k View view) {
            Intrinsics.checkNotNullParameter(view, C9851c.f26937h);
            view.getViewTreeObserver().removeOnScrollChangedListener(this.f691c);
            view.removeOnLayoutChangeListener(this.f692d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, C11045c<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> cVar) {
        super(2, cVar);
        this.$view = view;
    }

    /* renamed from: k */
    public static final void m1260k(C11760r rVar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i3 != i7 || i2 != i6 || i4 != i8) {
            Intrinsics.checkNotNullExpressionValue(view, C9851c.f26937h);
            rVar.mo23751L(PipHintTrackerKt.m1256c(view));
        }
    }

    /* renamed from: l */
    public static final void m1261l(C11760r rVar, View view) {
        rVar.mo23751L(PipHintTrackerKt.m1256c(view));
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, cVar);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    @C12580l
    /* renamed from: i */
    public final Object invoke(@C12579k C11760r<? super Rect> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11760r rVar = (C11760r) this.L$0;
            final C0215b0 b0Var = new C0215b0(rVar);
            final C0217c0 c0Var = new C0217c0(rVar, this.$view);
            final C0207a aVar = new C0207a(rVar, this.$view, c0Var, b0Var);
            if (C0212a.f697a.mo786a(this.$view)) {
                rVar.mo23751L(PipHintTrackerKt.m1256c(this.$view));
                this.$view.getViewTreeObserver().addOnScrollChangedListener(c0Var);
                this.$view.addOnLayoutChangeListener(b0Var);
            }
            this.$view.addOnAttachStateChangeListener(aVar);
            final View view = this.$view;
            C02061 r5 = new C11289a<C11079d2>() {
                public final void invoke() {
                    view.getViewTreeObserver().removeOnScrollChangedListener(c0Var);
                    view.removeOnLayoutChangeListener(b0Var);
                    view.removeOnAttachStateChangeListener(aVar);
                }
            };
            this.label = 1;
            if (ProduceKt.m46525a(rVar, r5, this) == h) {
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
