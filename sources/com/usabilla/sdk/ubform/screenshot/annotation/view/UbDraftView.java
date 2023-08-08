package com.usabilla.sdk.ubform.screenshot.annotation.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.screenshot.annotation.UbDraft;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 72\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00104\u001a\u00020+¢\u0006\u0004\b5\u00106J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016R4\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0011\u00101\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00068"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/screenshot/annotation/view/UbDraftView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/d2;", "onDraw", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "Lkotlin/Function2;", "a", "Lkotlin/jvm/functions/p;", "getOnDraftMovingCallback", "()Lkotlin/jvm/functions/p;", "setOnDraftMovingCallback", "(Lkotlin/jvm/functions/p;)V", "onDraftMovingCallback", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "longPressedHandler", "Ljava/lang/Runnable;", "c", "Ljava/lang/Runnable;", "longPressedRunnable", "d", "Z", "isLongPressed", "", "e", "F", "dX", "f", "dY", "Landroid/graphics/Rect;", "g", "Landroid/graphics/Rect;", "viewBounds", "Lcom/usabilla/sdk/ubform/screenshot/annotation/UbDraft;", "v", "Lcom/usabilla/sdk/ubform/screenshot/annotation/UbDraft;", "mutableDraft", "getRelativeBounds", "()Landroid/graphics/Rect;", "relativeBounds", "Landroid/content/Context;", "context", "draft", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/screenshot/annotation/UbDraft;)V", "w", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
@SuppressLint({"ViewConstructor"})
public final class UbDraftView extends View {
    @C12579k

    /* renamed from: w */
    public static final C9905a f27206w = new C9905a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: x */
    public static final long f27207x = 200;
    @C12579k

    /* renamed from: a */
    public C11304p<? super UbDraftView, ? super Boolean, C11079d2> f27208a = UbDraftView$onDraftMovingCallback$1.f27216f;
    @C12579k

    /* renamed from: b */
    public final Handler f27209b = new Handler();
    @C12579k

    /* renamed from: c */
    public final Runnable f27210c = new C9907b(this);

    /* renamed from: d */
    public boolean f27211d;

    /* renamed from: e */
    public float f27212e;

    /* renamed from: f */
    public float f27213f;
    @C12579k

    /* renamed from: g */
    public Rect f27214g = new Rect();
    @C12579k

    /* renamed from: v */
    public UbDraft f27215v;

    /* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.view.UbDraftView$a */
    public static final class C9905a {
        public /* synthetic */ C9905a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9905a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbDraftView(@C12579k Context context, @C12579k UbDraft ubDraft) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(ubDraft, "draft");
        this.f27215v = ubDraft;
        setLongClickable(true);
    }

    /* renamed from: b */
    public static final void m37220b(UbDraftView ubDraftView) {
        Intrinsics.checkNotNullParameter(ubDraftView, "this$0");
        ubDraftView.f27211d = true;
        ubDraftView.getOnDraftMovingCallback().invoke(ubDraftView, Boolean.TRUE);
    }

    @C12579k
    public final C11304p<UbDraftView, Boolean, C11079d2> getOnDraftMovingCallback() {
        return this.f27208a;
    }

    @C12579k
    public final Rect getRelativeBounds() {
        return this.f27214g;
    }

    public void onDraw(@C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawBitmap(this.f27215v.mo20435h(), 0.0f, 0.0f, (Paint) null);
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension((int) ((float) Math.ceil((double) this.f27215v.mo20442n())), (int) ((float) Math.ceil((double) this.f27215v.mo20441m())));
    }

    public boolean onTouchEvent(@C12579k MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f27209b.postDelayed(this.f27210c, 200);
            this.f27212e = getX() - motionEvent.getRawX();
            this.f27213f = getY() - motionEvent.getRawY();
        } else if (action == 1) {
            this.f27209b.removeCallbacks(this.f27210c);
            this.f27211d = false;
            this.f27208a.invoke(this, Boolean.FALSE);
            this.f27215v = UbDraft.m37102g(this.f27215v, getX(), getY(), getX() + ((float) getWidth()), getY() + ((float) getHeight()), (Bitmap) null, 16, (Object) null);
        } else if (action == 2 && this.f27211d) {
            float rawX = motionEvent.getRawX() + this.f27212e;
            float rawY = motionEvent.getRawY() + this.f27213f;
            animate().x(rawX).y(rawY).setDuration(0).start();
            int L0 = C11409d.m43851L0(rawX);
            int L02 = C11409d.m43851L0(rawY);
            this.f27214g = new Rect(L0, L02, getWidth() + L0, getHeight() + L02);
            this.f27208a.invoke(this, Boolean.TRUE);
        }
        return true;
    }

    public final void setOnDraftMovingCallback(@C12579k C11304p<? super UbDraftView, ? super Boolean, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.f27208a = pVar;
    }
}
