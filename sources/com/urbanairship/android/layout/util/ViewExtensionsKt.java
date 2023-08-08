package com.urbanairship.android.layout.util;

import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.urbanairship.android.layout.view.PagerView;
import com.urbanairship.android.layout.view.ScoreView;
import com.urbanairship.android.layout.widget.CheckableView;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;

public final class ViewExtensionsKt {
    /* renamed from: b */
    public static final void m148027b() throws IllegalStateException {
        if (!Intrinsics.areEqual((Object) Thread.currentThread(), (Object) Looper.getMainLooper().getThread())) {
            throw new IllegalStateException("Must be called from main thread!".toString());
        }
    }

    @C12579k
    /* renamed from: c */
    public static final C11907e<Boolean> m148028c(@C12579k CheckableView<?> checkableView) {
        Intrinsics.checkNotNullParameter(checkableView, "<this>");
        return C11909g.m47414W(C11909g.m47472m1(C11909g.m47488s(new ViewExtensionsKt$checkedChanges$1(checkableView, (C11045c<? super ViewExtensionsKt$checkedChanges$1>) null)), new ViewExtensionsKt$checkedChanges$2(checkableView, (C11045c<? super ViewExtensionsKt$checkedChanges$2>) null)));
    }

    @C12579k
    /* renamed from: d */
    public static final C11907e<C11079d2> m148029d(@C12579k View view, long j) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return C11909g.m47414W(C11909g.m47427a0(C11909g.m47488s(new ViewExtensionsKt$debouncedClicks$1(view, (C11045c<? super ViewExtensionsKt$debouncedClicks$1>) null)), j));
    }

    /* renamed from: e */
    public static /* synthetic */ C11907e m148030e(View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 100;
        }
        return m148029d(view, j);
    }

    /* renamed from: f */
    public static final boolean m148031f(@C12579k MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "<this>");
        if ((motionEvent.getAction() & 255) == 1) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: g */
    public static final C11907e<C35919k> m148032g(@C12579k PagerView pagerView) {
        Intrinsics.checkNotNullParameter(pagerView, "<this>");
        return C11909g.m47414W(C11909g.m47488s(new ViewExtensionsKt$pagerScrolls$1(pagerView, (C11045c<? super ViewExtensionsKt$pagerScrolls$1>) null)));
    }

    @C12579k
    /* renamed from: h */
    public static final C11907e<Integer> m148033h(@C12579k ScoreView scoreView) {
        Intrinsics.checkNotNullParameter(scoreView, "<this>");
        return C11909g.m47414W(C11909g.m47488s(new ViewExtensionsKt$scoreChanges$1(scoreView, (C11045c<? super ViewExtensionsKt$scoreChanges$1>) null)));
    }

    @C12579k
    /* renamed from: i */
    public static final C11907e<String> m148034i(@C12579k EditText editText, long j) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        return C11909g.m47414W(C11909g.m47427a0(C11909g.m47451g0(C11909g.m47472m1(C11909g.m47488s(new ViewExtensionsKt$textChanges$1(editText, (C11045c<? super ViewExtensionsKt$textChanges$1>) null)), new ViewExtensionsKt$textChanges$2(editText, (C11045c<? super ViewExtensionsKt$textChanges$2>) null))), j));
    }

    /* renamed from: j */
    public static /* synthetic */ C11907e m148035j(EditText editText, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 100;
        }
        return m148034i(editText, j);
    }
}
