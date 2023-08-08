package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C2192e;
import androidx.compose.foundation.gestures.C2193f;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SwipeableV2State$swipeDraggableState$1 implements C2193f {
    @C12579k

    /* renamed from: a */
    public final C8127a f19807a;

    /* renamed from: b */
    public final /* synthetic */ SwipeableV2State<T> f19808b;

    /* renamed from: androidx.compose.material3.SwipeableV2State$swipeDraggableState$1$a */
    public static final class C8127a implements C2192e {

        /* renamed from: a */
        public final /* synthetic */ SwipeableV2State<T> f19809a;

        public C8127a(SwipeableV2State<T> swipeableV2State) {
            this.f19809a = swipeableV2State;
        }

        /* renamed from: a */
        public void mo7352a(float f) {
            this.f19809a.mo12108l(f);
        }
    }

    public SwipeableV2State$swipeDraggableState$1(SwipeableV2State<T> swipeableV2State) {
        this.f19808b = swipeableV2State;
        this.f19807a = new C8127a(swipeableV2State);
    }

    /* renamed from: b */
    public void mo7349b(float f) {
        this.f19808b.mo12108l(f);
    }

    @C12580l
    /* renamed from: d */
    public Object mo7350d(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2192e, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object h = this.f19808b.mo12103O(mutatePriority, new SwipeableV2State$swipeDraggableState$1$drag$2(pVar, this, (C11045c<? super SwipeableV2State$swipeDraggableState$1$drag$2>) null), cVar);
        return h == C11063b.m42612h() ? h : C11079d2.f28267a;
    }
}
