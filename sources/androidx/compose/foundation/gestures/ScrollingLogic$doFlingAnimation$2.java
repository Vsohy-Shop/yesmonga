package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", mo22502f = "Scrollable.kt", mo22503i = {}, mo22504l = {442}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/foundation/gestures/l;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements C11304p<C2201l, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref.LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* renamed from: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$a */
    public static final class C2157a implements C2201l {

        /* renamed from: a */
        public final /* synthetic */ ScrollingLogic f5910a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<C15094f, C15094f> f5911b;

        public C2157a(ScrollingLogic scrollingLogic, C11300l<? super C15094f, C15094f> lVar) {
            this.f5910a = scrollingLogic;
            this.f5911b = lVar;
        }

        /* renamed from: a */
        public float mo7360a(float f) {
            ScrollingLogic scrollingLogic = this.f5910a;
            return scrollingLogic.mo7477s(this.f5911b.invoke(C15094f.m64868d(scrollingLogic.mo7478t(f))).mo42242A());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref.LongRef longRef, long j, C11045c<? super ScrollingLogic$doFlingAnimation$2> cVar) {
        super(2, cVar);
        this.this$0 = scrollingLogic;
        this.$result = longRef;
        this.$available = j;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, cVar);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C2201l lVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ScrollingLogic$doFlingAnimation$2) create(lVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        ScrollingLogic scrollingLogic;
        ScrollingLogic scrollingLogic2;
        Ref.LongRef longRef;
        long j;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C2157a aVar = new C2157a(this.this$0, new ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(this.this$0, (C2201l) this.L$0));
            scrollingLogic2 = this.this$0;
            Ref.LongRef longRef2 = this.$result;
            long j2 = this.$available;
            C2195g c = scrollingLogic2.mo7461c();
            long j3 = longRef2.element;
            float m = scrollingLogic2.mo7471m(scrollingLogic2.mo7476r(j2));
            this.L$0 = scrollingLogic2;
            this.L$1 = scrollingLogic2;
            this.L$2 = longRef2;
            this.J$0 = j3;
            this.label = 1;
            obj = c.mo7354a(aVar, m, this);
            if (obj == h) {
                return h;
            }
            longRef = longRef2;
            scrollingLogic = scrollingLogic2;
            j = j3;
        } else if (i == 1) {
            j = this.J$0;
            longRef = (Ref.LongRef) this.L$2;
            scrollingLogic2 = (ScrollingLogic) this.L$1;
            scrollingLogic = (ScrollingLogic) this.L$0;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        longRef.element = scrollingLogic2.mo7479u(j, scrollingLogic.mo7471m(((Number) obj).floatValue()));
        return C11079d2.f28267a;
    }
}
