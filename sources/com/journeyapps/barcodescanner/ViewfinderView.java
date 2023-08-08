package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.contentsquare.android.api.C14092c;
import com.google.zxing.C34762l;
import com.google.zxing.client.android.C34661l;
import com.journeyapps.barcodescanner.CameraPreview;
import java.util.ArrayList;
import java.util.List;

public class ViewfinderView extends View {

    /* renamed from: F0 */
    public static final String f84864F0 = "ViewfinderView";

    /* renamed from: G0 */
    public static final int[] f84865G0 = {0, 64, 128, C14092c.f34560U, 255, C14092c.f34560U, 128, 64};

    /* renamed from: H0 */
    public static final long f84866H0 = 80;

    /* renamed from: I0 */
    public static final int f84867I0 = 160;

    /* renamed from: J0 */
    public static final int f84868J0 = 20;

    /* renamed from: K0 */
    public static final int f84869K0 = 6;

    /* renamed from: E0 */
    public C34959u f84870E0;

    /* renamed from: a */
    public final Paint f84871a = new Paint(1);

    /* renamed from: b */
    public Bitmap f84872b;

    /* renamed from: c */
    public int f84873c;

    /* renamed from: d */
    public final int f84874d;

    /* renamed from: e */
    public final int f84875e;

    /* renamed from: f */
    public final int f84876f;

    /* renamed from: g */
    public boolean f84877g;

    /* renamed from: v */
    public int f84878v;

    /* renamed from: w */
    public List<C34762l> f84879w;

    /* renamed from: x */
    public List<C34762l> f84880x;

    /* renamed from: y */
    public CameraPreview f84881y;

    /* renamed from: z */
    public Rect f84882z;

    /* renamed from: com.journeyapps.barcodescanner.ViewfinderView$a */
    public class C34905a implements CameraPreview.C34902f {
        public C34905a() {
        }

        /* renamed from: a */
        public void mo103324a() {
            ViewfinderView.this.mo103365d();
            ViewfinderView.this.invalidate();
        }

        /* renamed from: b */
        public void mo103325b() {
        }

        /* renamed from: c */
        public void mo103326c(Exception exc) {
        }

        /* renamed from: d */
        public void mo103327d() {
        }

        /* renamed from: e */
        public void mo103328e() {
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34661l.C34672k.zxing_finder);
        this.f84873c = obtainStyledAttributes.getColor(C34661l.C34672k.zxing_finder_zxing_viewfinder_mask, resources.getColor(C34661l.C34663b.zxing_viewfinder_mask));
        this.f84874d = obtainStyledAttributes.getColor(C34661l.C34672k.zxing_finder_zxing_result_view, resources.getColor(C34661l.C34663b.zxing_result_view));
        this.f84875e = obtainStyledAttributes.getColor(C34661l.C34672k.zxing_finder_zxing_viewfinder_laser, resources.getColor(C34661l.C34663b.zxing_viewfinder_laser));
        this.f84876f = obtainStyledAttributes.getColor(C34661l.C34672k.zxing_finder_zxing_possible_result_points, resources.getColor(C34661l.C34663b.zxing_possible_result_points));
        this.f84877g = obtainStyledAttributes.getBoolean(C34661l.C34672k.zxing_finder_zxing_viewfinder_laser_visibility, true);
        obtainStyledAttributes.recycle();
        this.f84878v = 0;
        this.f84879w = new ArrayList(20);
        this.f84880x = new ArrayList(20);
    }

    /* renamed from: a */
    public void mo103362a(C34762l lVar) {
        if (this.f84879w.size() < 20) {
            this.f84879w.add(lVar);
        }
    }

    /* renamed from: b */
    public void mo103363b(Bitmap bitmap) {
        this.f84872b = bitmap;
        invalidate();
    }

    /* renamed from: c */
    public void mo103364c() {
        Bitmap bitmap = this.f84872b;
        this.f84872b = null;
        if (bitmap != null) {
            bitmap.recycle();
        }
        invalidate();
    }

    /* renamed from: d */
    public void mo103365d() {
        CameraPreview cameraPreview = this.f84881y;
        if (cameraPreview != null) {
            Rect framingRect = cameraPreview.getFramingRect();
            C34959u previewSize = this.f84881y.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.f84882z = framingRect;
                this.f84870E0 = previewSize;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        C34959u uVar;
        int i;
        mo103365d();
        Rect rect = this.f84882z;
        if (rect != null && (uVar = this.f84870E0) != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Paint paint = this.f84871a;
            if (this.f84872b != null) {
                i = this.f84874d;
            } else {
                i = this.f84873c;
            }
            paint.setColor(i);
            float f = (float) width;
            canvas.drawRect(0.0f, 0.0f, f, (float) rect.top, this.f84871a);
            canvas.drawRect(0.0f, (float) rect.top, (float) rect.left, (float) (rect.bottom + 1), this.f84871a);
            float f2 = f;
            canvas.drawRect((float) (rect.right + 1), (float) rect.top, f2, (float) (rect.bottom + 1), this.f84871a);
            canvas.drawRect(0.0f, (float) (rect.bottom + 1), f2, (float) height, this.f84871a);
            if (this.f84872b != null) {
                this.f84871a.setAlpha(160);
                canvas.drawBitmap(this.f84872b, (Rect) null, rect, this.f84871a);
                return;
            }
            if (this.f84877g) {
                this.f84871a.setColor(this.f84875e);
                Paint paint2 = this.f84871a;
                int[] iArr = f84865G0;
                paint2.setAlpha(iArr[this.f84878v]);
                this.f84878v = (this.f84878v + 1) % iArr.length;
                int height2 = (rect.height() / 2) + rect.top;
                canvas.drawRect((float) (rect.left + 2), (float) (height2 - 1), (float) (rect.right - 1), (float) (height2 + 2), this.f84871a);
            }
            float width2 = ((float) getWidth()) / ((float) uVar.f85046a);
            float height3 = ((float) getHeight()) / ((float) uVar.f85047b);
            if (!this.f84880x.isEmpty()) {
                this.f84871a.setAlpha(80);
                this.f84871a.setColor(this.f84876f);
                for (C34762l next : this.f84880x) {
                    canvas.drawCircle((float) ((int) (next.mo102883c() * width2)), (float) ((int) (next.mo102884d() * height3)), 3.0f, this.f84871a);
                }
                this.f84880x.clear();
            }
            if (!this.f84879w.isEmpty()) {
                this.f84871a.setAlpha(160);
                this.f84871a.setColor(this.f84876f);
                for (C34762l next2 : this.f84879w) {
                    canvas.drawCircle((float) ((int) (next2.mo102883c() * width2)), (float) ((int) (next2.mo102884d() * height3)), 6.0f, this.f84871a);
                }
                List<C34762l> list = this.f84879w;
                List<C34762l> list2 = this.f84880x;
                this.f84879w = list2;
                this.f84880x = list;
                list2.clear();
            }
            postInvalidateDelayed(80, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }

    public void setCameraPreview(CameraPreview cameraPreview) {
        this.f84881y = cameraPreview;
        cameraPreview.mo103289i(new C34905a());
    }

    public void setLaserVisibility(boolean z) {
        this.f84877g = z;
    }

    public void setMaskColor(int i) {
        this.f84873c = i;
    }
}
