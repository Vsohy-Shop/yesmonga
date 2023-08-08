package com.usabilla.sdk.ubform.screenshot.annotation.paint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.screenshot.annotation.UbDraft;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 K2\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0006\u0010\u0010\u001a\u00020\u0007J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0007H\u0002J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R*\u0010\u0013\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00128\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010\u0011\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R0\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010+8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00128\u0002XD¢\u0006\u0006\n\u0004\b\u001a\u0010!R&\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001404038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u00105R\u0016\u00108\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u00107R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u00109R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010!R\u0016\u0010<\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0016\u0010=\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0016\u0010>\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0016\u0010@\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010!R\u0016\u0010B\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010!R\u0013\u0010F\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006L"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/screenshot/annotation/paint/UbDrawingView;", "Landroid/view/View;", "", "w", "h", "oldw", "oldh", "Lkotlin/d2;", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "f", "color", "", "strokeWidth", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Bitmap;", "a", "x", "y", "d", "c", "e", "Landroid/graphics/Path;", "path", "g", "value", "F", "getStrokeWidth", "()F", "setStrokeWidth", "(F)V", "I", "getColor", "()I", "setColor", "(I)V", "Lkotlin/Function1;", "Lkotlin/jvm/functions/l;", "getUndoListener", "()Lkotlin/jvm/functions/l;", "setUndoListener", "(Lkotlin/jvm/functions/l;)V", "undoListener", "touchTolerance", "", "Lkotlin/Pair;", "Ljava/util/List;", "paths", "Landroid/graphics/Paint;", "userPaint", "Landroid/graphics/Path;", "v", "xCoordinate", "yCoordinate", "rectLeft", "rectTop", "z", "rectRight", "E0", "rectBottom", "Lcom/usabilla/sdk/ubform/screenshot/annotation/UbDraft;", "getPaintItem", "()Lcom/usabilla/sdk/ubform/screenshot/annotation/UbDraft;", "paintItem", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "F0", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class UbDrawingView extends View {
    @C12579k

    /* renamed from: F0 */
    public static final C9899a f27160F0 = new C9899a((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: G0 */
    public static final float f27161G0 = 2.0f;
    @Deprecated

    /* renamed from: H0 */
    public static final float f27162H0 = 4.0f;

    /* renamed from: E0 */
    public float f27163E0;

    /* renamed from: a */
    public float f27164a = 2.0f;

    /* renamed from: b */
    public int f27165b = -16711936;
    @C12580l

    /* renamed from: c */
    public C11300l<? super Boolean, C11079d2> f27166c = UbDrawingView$undoListener$1.f27176f;

    /* renamed from: d */
    public final float f27167d = 4.0f;
    @C12579k

    /* renamed from: e */
    public final List<Pair<Path, Paint>> f27168e = new ArrayList();
    @C12579k

    /* renamed from: f */
    public Paint f27169f = mo20475b(this.f27165b, this.f27164a);
    @C12579k

    /* renamed from: g */
    public Path f27170g = new Path();

    /* renamed from: v */
    public float f27171v;

    /* renamed from: w */
    public float f27172w;

    /* renamed from: x */
    public float f27173x;

    /* renamed from: y */
    public float f27174y;

    /* renamed from: z */
    public float f27175z;

    /* renamed from: com.usabilla.sdk.ubform.screenshot.annotation.paint.UbDrawingView$a */
    public static final class C9899a {
        public /* synthetic */ C9899a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C9899a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbDrawingView(@C12579k Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: a */
    public final Bitmap mo20474a() {
        Rect rect = new Rect((int) this.f27173x, (int) this.f27174y, (int) this.f27175z, (int) this.f27163E0);
        int width = rect.width();
        int height = rect.height();
        if (width <= 0 && height <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        draw(new Canvas(createBitmap));
        Bitmap createBitmap2 = Bitmap.createBitmap(width, height, createBitmap.getConfig());
        new Canvas(createBitmap2).drawBitmap(createBitmap, rect, new Rect(0, 0, width, height), (Paint) null);
        createBitmap.recycle();
        return createBitmap2;
    }

    /* renamed from: b */
    public final Paint mo20475b(int i, float f) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(f);
        return paint;
    }

    /* renamed from: c */
    public final void mo20476c(float f, float f2) {
        float abs = Math.abs(f - this.f27171v);
        float abs2 = Math.abs(f2 - this.f27172w);
        float f3 = this.f27167d;
        if (abs >= f3 || abs2 >= f3) {
            Path path = this.f27170g;
            float f4 = this.f27171v;
            float f5 = this.f27172w;
            float f6 = (float) 2;
            path.quadTo(f4, f5, (f + f4) / f6, (f2 + f5) / f6);
            this.f27171v = f;
            this.f27172w = f2;
        }
    }

    /* renamed from: d */
    public final void mo20477d(float f, float f2) {
        this.f27170g.reset();
        this.f27170g.moveTo(f, f2);
        this.f27171v = f;
        this.f27172w = f2;
    }

    /* renamed from: e */
    public final void mo20478e() {
        this.f27170g.lineTo(this.f27171v, this.f27172w);
        this.f27168e.add(C11078d1.m42659a(this.f27170g, this.f27169f));
        C11300l<? super Boolean, C11079d2> lVar = this.f27166c;
        if (lVar != null) {
            lVar.invoke(Boolean.TRUE);
        }
        mo20480g(this.f27170g);
        this.f27170g = new Path();
    }

    /* renamed from: f */
    public final void mo20479f() {
        boolean z;
        List<Pair<Path, Paint>> list = this.f27168e;
        list.remove(CollectionsKt__CollectionsKt.m40443G(list));
        invalidate();
        C11300l<? super Boolean, C11079d2> lVar = this.f27166c;
        if (lVar != null) {
            if (this.f27168e.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            lVar.invoke(Boolean.valueOf(z));
        }
    }

    /* renamed from: g */
    public final void mo20480g(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        float f = this.f27164a / ((float) 2);
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        if (f2 < this.f27173x) {
            this.f27173x = Math.max(0.0f, (float) Math.floor((double) (f2 - f)));
        }
        if (f3 < this.f27174y) {
            this.f27174y = Math.max(0.0f, (float) Math.floor((double) (f3 - f)));
        }
        if (f4 > this.f27175z) {
            this.f27175z = Math.min((float) getWidth(), (float) Math.ceil((double) (f4 + f)));
        }
        if (f5 > this.f27163E0) {
            this.f27163E0 = Math.min((float) getHeight(), (float) Math.ceil((double) (f5 + f)));
        }
    }

    public final int getColor() {
        return this.f27165b;
    }

    @C12580l
    public final UbDraft getPaintItem() {
        Bitmap a = mo20474a();
        if (a == null) {
            return null;
        }
        return new UbDraft(this.f27173x, this.f27174y, this.f27175z, this.f27163E0, a);
    }

    public final float getStrokeWidth() {
        return this.f27164a;
    }

    @C12580l
    public final C11300l<Boolean, C11079d2> getUndoListener() {
        return this.f27166c;
    }

    public void onDraw(@C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        for (Pair pair : this.f27168e) {
            canvas.drawPath((Path) pair.mo21849e(), (Paint) pair.mo21851f());
        }
        canvas.drawPath(this.f27170g, this.f27169f);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f27173x = (float) i;
        this.f27174y = (float) i2;
    }

    public boolean onTouchEvent(@C12579k MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            mo20477d(x, y);
            invalidate();
        } else if (action == 1) {
            mo20478e();
            invalidate();
        } else if (action == 2) {
            mo20476c(x, y);
            invalidate();
        }
        return true;
    }

    public final void setColor(int i) {
        this.f27165b = i;
        this.f27169f = mo20475b(i, this.f27164a);
    }

    public final void setStrokeWidth(float f) {
        this.f27164a = f;
        this.f27169f = mo20475b(this.f27165b, f);
    }

    public final void setUndoListener(@C12580l C11300l<? super Boolean, C11079d2> lVar) {
        this.f27166c = lVar;
    }
}
