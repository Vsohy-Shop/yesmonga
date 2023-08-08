package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0368r0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.C1631k0;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewView;
import androidx.camera.view.internal.compat.quirk.C1796a;
import androidx.camera.view.internal.compat.quirk.C1798c;
import androidx.camera.view.internal.compat.quirk.C1800e;
import androidx.core.util.C18001r;

/* renamed from: androidx.camera.view.o */
public final class C1811o {

    /* renamed from: h */
    public static final String f4981h = "PreviewTransform";

    /* renamed from: i */
    public static final PreviewView.ScaleType f4982i = PreviewView.ScaleType.FILL_CENTER;

    /* renamed from: a */
    public Size f4983a;

    /* renamed from: b */
    public Rect f4984b;

    /* renamed from: c */
    public Rect f4985c;

    /* renamed from: d */
    public int f4986d;

    /* renamed from: e */
    public int f4987e;

    /* renamed from: f */
    public boolean f4988f;

    /* renamed from: g */
    public PreviewView.ScaleType f4989g = f4982i;

    /* renamed from: androidx.camera.view.o$a */
    public static /* synthetic */ class C1812a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4990a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.view.PreviewView$ScaleType[] r0 = androidx.camera.view.PreviewView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4990a = r0
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4990a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4990a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4990a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_END     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4990a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f4990a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.C1811o.C1812a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public static RectF m7225b(RectF rectF, float f) {
        float f2 = f + f;
        return new RectF(f2 - rectF.right, rectF.top, f2 - rectF.left, rectF.bottom);
    }

    /* renamed from: n */
    public static void m7226n(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.ScaleType scaleType) {
        Matrix.ScaleToFit scaleToFit;
        boolean z;
        switch (C1812a.f4990a[scaleType.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                C1417i2.m5913c(f4981h, "Unexpected crop rect: " + scaleType);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (scaleType == PreviewView.ScaleType.FIT_CENTER || scaleType == PreviewView.ScaleType.FIT_START || scaleType == PreviewView.ScaleType.FIT_END) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            return;
        }
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        matrix.invert(matrix);
    }

    /* renamed from: a */
    public Bitmap mo5961a(@C0359n0 Bitmap bitmap, Size size, int i) {
        if (!mo5971l()) {
            return bitmap;
        }
        Matrix j = mo5969j();
        RectF k = mo5970k(size, i);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(j);
        matrix.postScale(k.width() / ((float) this.f4983a.getWidth()), k.height() / ((float) this.f4983a.getHeight()));
        matrix.postTranslate(k.left, k.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return createBitmap;
    }

    /* renamed from: c */
    public final Rect mo5962c(Rect rect) {
        C1798c cVar = (C1798c) C1796a.m7182a(C1798c.class);
        if (cVar == null) {
            return rect;
        }
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setScale(cVar.mo5949a(), 1.0f, (float) rect.centerX(), (float) rect.centerY());
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    @C0363p0
    /* renamed from: d */
    public Matrix mo5963d(Size size, int i) {
        if (!mo5971l()) {
            return null;
        }
        Matrix matrix = new Matrix();
        mo5968i(size, i).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, (float) this.f4983a.getWidth(), (float) this.f4983a.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* renamed from: e */
    public RectF mo5964e(Size size, int i) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) size.getWidth(), (float) size.getHeight());
        Size f = mo5965f();
        RectF rectF2 = new RectF(0.0f, 0.0f, (float) f.getWidth(), (float) f.getHeight());
        Matrix matrix = new Matrix();
        m7226n(matrix, rectF2, rectF, this.f4989g);
        matrix.mapRect(rectF2);
        if (i == 1) {
            return m7225b(rectF2, ((float) size.getWidth()) / 2.0f);
        }
        return rectF2;
    }

    /* renamed from: f */
    public final Size mo5965f() {
        if (C1805k0.m7198e(this.f4986d)) {
            return new Size(this.f4985c.height(), this.f4985c.width());
        }
        return new Size(this.f4985c.width(), this.f4985c.height());
    }

    /* renamed from: g */
    public PreviewView.ScaleType mo5966g() {
        return this.f4989g;
    }

    @C0363p0
    /* renamed from: h */
    public Rect mo5967h() {
        return this.f4984b;
    }

    /* renamed from: i */
    public Matrix mo5968i(Size size, int i) {
        RectF rectF;
        C18001r.m81777n(mo5971l());
        if (mo5972m(size)) {
            rectF = new RectF(0.0f, 0.0f, (float) size.getWidth(), (float) size.getHeight());
        } else {
            rectF = mo5964e(size, i);
        }
        Matrix d = C1805k0.m7197d(new RectF(this.f4984b), rectF, this.f4986d);
        if (this.f4988f) {
            if (C1805k0.m7198e(this.f4986d)) {
                d.preScale(1.0f, -1.0f, (float) this.f4984b.centerX(), (float) this.f4984b.centerY());
            } else {
                d.preScale(-1.0f, 1.0f, (float) this.f4984b.centerX(), (float) this.f4984b.centerY());
            }
        }
        return d;
    }

    @C0344h1
    /* renamed from: j */
    public Matrix mo5969j() {
        C18001r.m81777n(mo5971l());
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f4983a.getWidth(), (float) this.f4983a.getHeight());
        int i = -C1805k0.m7205l(this.f4987e);
        C1800e eVar = (C1800e) C1796a.m7182a(C1800e.class);
        if (eVar != null) {
            i += eVar.mo5950a(this.f4988f);
        }
        return C1805k0.m7197d(rectF, rectF, i);
    }

    /* renamed from: k */
    public final RectF mo5970k(Size size, int i) {
        C18001r.m81777n(mo5971l());
        Matrix i2 = mo5968i(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f4983a.getWidth(), (float) this.f4983a.getHeight());
        i2.mapRect(rectF);
        return rectF;
    }

    /* renamed from: l */
    public final boolean mo5971l() {
        return (this.f4984b == null || this.f4983a == null) ? false : true;
    }

    @C0344h1
    /* renamed from: m */
    public boolean mo5972m(Size size) {
        return C1805k0.m7199f(size, true, mo5965f(), false);
    }

    /* renamed from: o */
    public void mo5973o(PreviewView.ScaleType scaleType) {
        this.f4989g = scaleType;
    }

    @C0368r0(markerClass = {C1631k0.class})
    /* renamed from: p */
    public void mo5974p(@C0359n0 SurfaceRequest.C1342f fVar, Size size, boolean z) {
        C1417i2.m5911a(f4981h, "Transformation info set: " + fVar + " " + size + " " + z);
        this.f4984b = mo5962c(fVar.mo4940a());
        this.f4985c = fVar.mo4940a();
        this.f4986d = fVar.mo4941b();
        this.f4987e = fVar.mo4942c();
        this.f4983a = size;
        this.f4988f = z;
    }

    /* renamed from: q */
    public void mo5975q(Size size, int i, @C0359n0 View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            C1417i2.m5924n(f4981h, "Transform not applied due to PreviewView size: " + size);
        } else if (mo5971l()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(mo5969j());
            } else {
                Display display = view.getDisplay();
                if (!(display == null || display.getRotation() == this.f4987e)) {
                    C1417i2.m5913c(f4981h, "Non-display rotation not supported with SurfaceView / PERFORMANCE mode.");
                }
            }
            RectF k = mo5970k(size, i);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(k.width() / ((float) this.f4983a.getWidth()));
            view.setScaleY(k.height() / ((float) this.f4983a.getHeight()));
            view.setTranslationX(k.left - ((float) view.getLeft()));
            view.setTranslationY(k.top - ((float) view.getTop()));
        }
    }
}
