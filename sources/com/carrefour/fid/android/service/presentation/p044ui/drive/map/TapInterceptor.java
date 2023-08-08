package com.carrefour.fid.android.service.presentation.p044ui.drive.map;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.zxing.client.android.C34651e;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0015\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0015\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R?\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/map/TapInterceptor;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/MotionEvent;", "event", "", "dispatchTouchEvent", "Lkotlin/Function1;", "Lkotlin/n0;", "name", "Lkotlin/d2;", "onSingleTap", "Lkotlin/jvm/functions/l;", "getOnSingleTap", "()Lkotlin/jvm/functions/l;", "setOnSingleTap", "(Lkotlin/jvm/functions/l;)V", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "SingleTapGestureListener", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.TapInterceptor */
public final class TapInterceptor extends ConstraintLayout {
    public static final int $stable = 8;
    @C12579k
    private final GestureDetector gestureDetector;
    @C12580l
    private C11300l<? super MotionEvent, C11079d2> onSingleTap;

    @C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/presentation/ui/drive/map/TapInterceptor$SingleTapGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e", "", "onSingleTapConfirmed", "Lkotlin/Function1;", "Lkotlin/d2;", "onSingleTap", "Lkotlin/jvm/functions/l;", "<init>", "(Lkotlin/jvm/functions/l;)V", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.service.presentation.ui.drive.map.TapInterceptor$SingleTapGestureListener */
    public static final class SingleTapGestureListener extends GestureDetector.SimpleOnGestureListener {
        public static final int $stable = 0;
        @C12579k
        private final C11300l<MotionEvent, C11079d2> onSingleTap;

        public SingleTapGestureListener(@C12579k C11300l<? super MotionEvent, C11079d2> lVar) {
            Intrinsics.checkNotNullParameter(lVar, "onSingleTap");
            this.onSingleTap = lVar;
        }

        public boolean onSingleTapConfirmed(@C12579k MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, C34651e.f83829d);
            super.onSingleTapConfirmed(motionEvent);
            this.onSingleTap.invoke(motionEvent);
            return true;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TapInterceptor(@C12579k Context context) {
        this(context, (AttributeSet) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    public boolean dispatchTouchEvent(@C12579k MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        this.gestureDetector.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @C12580l
    public final C11300l<MotionEvent, C11079d2> getOnSingleTap() {
        return this.onSingleTap;
    }

    public final void setOnSingleTap(@C12580l C11300l<? super MotionEvent, C11079d2> lVar) {
        this.onSingleTap = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TapInterceptor(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapInterceptor(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.gestureDetector = new GestureDetector(getContext(), new SingleTapGestureListener(new TapInterceptor$gestureDetector$1(this)));
    }
}
