package com.urbanairship.android.layout.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.C11748i;
import kotlinx.coroutines.channels.C11749j;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000f"}, mo22516d2 = {"Lcom/urbanairship/android/layout/widget/TouchAwareWebView;", "Landroid/webkit/WebView;", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "Lkotlinx/coroutines/flow/e;", "a", "Lkotlinx/coroutines/channels/g;", "Lkotlinx/coroutines/channels/g;", "touchesChannel", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class TouchAwareWebView extends WebView {
    @C12579k

    /* renamed from: a */
    public final C11744g<MotionEvent> f88980a = C11748i.m46625d(Integer.MAX_VALUE, (BufferOverflow) null, (C11300l) null, 6, (Object) null);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchAwareWebView(@C12579k Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    @C12579k
    /* renamed from: a */
    public final C11907e<MotionEvent> mo107670a() {
        return C11909g.m47490s1(this.f88980a);
    }

    public boolean onTouchEvent(@C12580l MotionEvent motionEvent) {
        if (motionEvent != null) {
            C11749j.m46631b(this.f88980a.mo23751L(motionEvent));
        }
        return super.onTouchEvent(motionEvent);
    }
}
