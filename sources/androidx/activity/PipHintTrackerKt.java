package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.C0376v0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.C12095s1;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PipHintTrackerKt {

    /* renamed from: androidx.activity.PipHintTrackerKt$a */
    public static final class C0205a<T> implements C11908f {

        /* renamed from: a */
        public final /* synthetic */ Activity f688a;

        public C0205a(Activity activity) {
            this.f688a = activity;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k Rect rect, @C12579k C11045c<? super C11079d2> cVar) {
            C0239g.f734a.mo830a(this.f688a, rect);
            return C11079d2.f28267a;
        }
    }

    @C12580l
    @C12095s1
    @C0376v0(26)
    /* renamed from: b */
    public static final Object m1255b(@C12579k Activity activity, @C12579k View view, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = C11909g.m47488s(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, (C11045c<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1>) null)).collect(new C0205a(activity), cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: c */
    public static final Rect m1256c(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
