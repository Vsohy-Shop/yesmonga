package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.C0376v0;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.C16944e;

public class ImageFilterView extends AppCompatImageView {

    /* renamed from: E0 */
    public RectF f44057E0;

    /* renamed from: F0 */
    public Drawable[] f44058F0 = new Drawable[2];

    /* renamed from: G0 */
    public LayerDrawable f44059G0;

    /* renamed from: H0 */
    public float f44060H0 = Float.NaN;

    /* renamed from: I0 */
    public float f44061I0 = Float.NaN;

    /* renamed from: J0 */
    public float f44062J0 = Float.NaN;

    /* renamed from: K0 */
    public float f44063K0 = Float.NaN;

    /* renamed from: d */
    public C16919c f44064d = new C16919c();

    /* renamed from: e */
    public boolean f44065e = true;

    /* renamed from: f */
    public Drawable f44066f = null;

    /* renamed from: g */
    public Drawable f44067g = null;

    /* renamed from: v */
    public float f44068v = 0.0f;

    /* renamed from: w */
    public float f44069w = 0.0f;

    /* renamed from: x */
    public float f44070x = Float.NaN;

    /* renamed from: y */
    public Path f44071y;

    /* renamed from: z */
    public ViewOutlineProvider f44072z;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$a */
    public class C16917a extends ViewOutlineProvider {
        public C16917a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterView.this.f44069w) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$b */
    public class C16918b extends ViewOutlineProvider {
        public C16918b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f44070x);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$c */
    public static class C16919c {

        /* renamed from: a */
        public float[] f44075a = new float[20];

        /* renamed from: b */
        public ColorMatrix f44076b = new ColorMatrix();

        /* renamed from: c */
        public ColorMatrix f44077c = new ColorMatrix();

        /* renamed from: d */
        public float f44078d = 1.0f;

        /* renamed from: e */
        public float f44079e = 1.0f;

        /* renamed from: f */
        public float f44080f = 1.0f;

        /* renamed from: g */
        public float f44081g = 1.0f;

        /* renamed from: a */
        public final void mo50553a(float f) {
            float[] fArr = this.f44075a;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: b */
        public final void mo50554b(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.f44075a;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: c */
        public void mo50555c(ImageView imageView) {
            boolean z;
            this.f44076b.reset();
            float f = this.f44079e;
            boolean z2 = true;
            if (f != 1.0f) {
                mo50554b(f);
                this.f44076b.set(this.f44075a);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.f44080f;
            if (f2 != 1.0f) {
                this.f44077c.setScale(f2, f2, f2, 1.0f);
                this.f44076b.postConcat(this.f44077c);
                z = true;
            }
            float f3 = this.f44081g;
            if (f3 != 1.0f) {
                mo50556d(f3);
                this.f44077c.set(this.f44075a);
                this.f44076b.postConcat(this.f44077c);
                z = true;
            }
            float f4 = this.f44078d;
            if (f4 != 1.0f) {
                mo50553a(f4);
                this.f44077c.set(this.f44075a);
                this.f44076b.postConcat(this.f44077c);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f44076b));
            } else {
                imageView.clearColorFilter();
            }
        }

        /* renamed from: d */
        public final void mo50556d(float f) {
            float f2;
            float f3;
            float f4;
            if (f <= 0.0f) {
                f = 0.01f;
            }
            float f5 = (5000.0f / f) / 100.0f;
            if (f5 > 66.0f) {
                double d = (double) (f5 - 60.0f);
                f3 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                f2 = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                f2 = (((float) Math.log((double) f5)) * 99.4708f) - 161.11957f;
                f3 = 255.0f;
            }
            if (f5 >= 66.0f) {
                f4 = 255.0f;
            } else if (f5 > 19.0f) {
                f4 = (((float) Math.log((double) (f5 - 10.0f))) * 138.51773f) - 305.0448f;
            } else {
                f4 = 0.0f;
            }
            float min = Math.min(255.0f, Math.max(f3, 0.0f));
            float min2 = Math.min(255.0f, Math.max(f2, 0.0f));
            float min3 = Math.min(255.0f, Math.max(f4, 0.0f));
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log((double) 50.0f)) * 99.4708f) - 161.11957f, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log((double) 40.0f)) * 138.51773f) - 305.0448f, 0.0f));
            float[] fArr = this.f44075a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        mo50524e(context, (AttributeSet) null);
    }

    private void setOverlay(boolean z) {
        this.f44065e = z;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: e */
    public final void mo50524e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f44066f = obtainStyledAttributes.getDrawable(C16944e.C16957m.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.ImageFilterView_crossfade) {
                    this.f44068v = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C16944e.C16957m.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C16944e.C16957m.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C16944e.C16957m.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C16944e.C16957m.ImageFilterView_brightness) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C16944e.C16957m.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C16944e.C16957m.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C16944e.C16957m.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f44065e));
                } else if (index == C16944e.C16957m.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f44060H0));
                } else if (index == C16944e.C16957m.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f44061I0));
                } else if (index == C16944e.C16957m.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f44063K0));
                } else if (index == C16944e.C16957m.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f44062J0));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f44067g = drawable;
            if (this.f44066f == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f44067g = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f44058F0;
                    Drawable mutate = drawable2.mutate();
                    this.f44067g = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f44058F0;
            Drawable mutate2 = getDrawable().mutate();
            this.f44067g = mutate2;
            drawableArr2[0] = mutate2;
            this.f44058F0[1] = this.f44066f.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f44058F0);
            this.f44059G0 = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f44068v * 255.0f));
            if (!this.f44065e) {
                this.f44059G0.getDrawable(0).setAlpha((int) ((1.0f - this.f44068v) * 255.0f));
            }
            super.setImageDrawable(this.f44059G0);
        }
    }

    /* renamed from: f */
    public final void mo50525f() {
        float f;
        float f2;
        float f3;
        float f4;
        if (!Float.isNaN(this.f44060H0) || !Float.isNaN(this.f44061I0) || !Float.isNaN(this.f44062J0) || !Float.isNaN(this.f44063K0)) {
            float f5 = 0.0f;
            if (Float.isNaN(this.f44060H0)) {
                f = 0.0f;
            } else {
                f = this.f44060H0;
            }
            if (Float.isNaN(this.f44061I0)) {
                f2 = 0.0f;
            } else {
                f2 = this.f44061I0;
            }
            if (Float.isNaN(this.f44062J0)) {
                f3 = 1.0f;
            } else {
                f3 = this.f44062J0;
            }
            if (!Float.isNaN(this.f44063K0)) {
                f5 = this.f44063K0;
            }
            Matrix matrix = new Matrix();
            matrix.reset();
            float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
            float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
            float width = (float) getWidth();
            float height = (float) getHeight();
            if (intrinsicWidth * height < intrinsicHeight * width) {
                f4 = width / intrinsicWidth;
            } else {
                f4 = height / intrinsicHeight;
            }
            float f6 = f3 * f4;
            matrix.postScale(f6, f6);
            float f7 = intrinsicWidth * f6;
            float f8 = f6 * intrinsicHeight;
            matrix.postTranslate((((f * (width - f7)) + width) - f7) * 0.5f, (((f2 * (height - f8)) + height) - f8) * 0.5f);
            matrix.postRotate(f5, width / 2.0f, height / 2.0f);
            setImageMatrix(matrix);
            setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    /* renamed from: g */
    public final void mo50526g() {
        if (!Float.isNaN(this.f44060H0) || !Float.isNaN(this.f44061I0) || !Float.isNaN(this.f44062J0) || !Float.isNaN(this.f44063K0)) {
            mo50525f();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public float getBrightness() {
        return this.f44064d.f44078d;
    }

    public float getContrast() {
        return this.f44064d.f44080f;
    }

    public float getCrossfade() {
        return this.f44068v;
    }

    public float getImagePanX() {
        return this.f44060H0;
    }

    public float getImagePanY() {
        return this.f44061I0;
    }

    public float getImageRotate() {
        return this.f44063K0;
    }

    public float getImageZoom() {
        return this.f44062J0;
    }

    public float getRound() {
        return this.f44070x;
    }

    public float getRoundPercent() {
        return this.f44069w;
    }

    public float getSaturation() {
        return this.f44064d.f44079e;
    }

    public float getWarmth() {
        return this.f44064d.f44081g;
    }

    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        mo50525f();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = C0507a.m2346b(getContext(), i).mutate();
        this.f44066f = mutate;
        Drawable[] drawableArr = this.f44058F0;
        drawableArr[0] = this.f44067g;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f44058F0);
        this.f44059G0 = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f44068v);
    }

    public void setBrightness(float f) {
        C16919c cVar = this.f44064d;
        cVar.f44078d = f;
        cVar.mo50555c(this);
    }

    public void setContrast(float f) {
        C16919c cVar = this.f44064d;
        cVar.f44080f = f;
        cVar.mo50555c(this);
    }

    public void setCrossfade(float f) {
        this.f44068v = f;
        if (this.f44058F0 != null) {
            if (!this.f44065e) {
                this.f44059G0.getDrawable(0).setAlpha((int) ((1.0f - this.f44068v) * 255.0f));
            }
            this.f44059G0.getDrawable(1).setAlpha((int) (this.f44068v * 255.0f));
            super.setImageDrawable(this.f44059G0);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f44066f == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f44067g = mutate;
        Drawable[] drawableArr = this.f44058F0;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f44066f;
        LayerDrawable layerDrawable = new LayerDrawable(this.f44058F0);
        this.f44059G0 = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f44068v);
    }

    public void setImagePanX(float f) {
        this.f44060H0 = f;
        mo50526g();
    }

    public void setImagePanY(float f) {
        this.f44061I0 = f;
        mo50526g();
    }

    public void setImageResource(int i) {
        if (this.f44066f != null) {
            Drawable mutate = C0507a.m2346b(getContext(), i).mutate();
            this.f44067g = mutate;
            Drawable[] drawableArr = this.f44058F0;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f44066f;
            LayerDrawable layerDrawable = new LayerDrawable(this.f44058F0);
            this.f44059G0 = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f44068v);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f44063K0 = f;
        mo50526g();
    }

    public void setImageZoom(float f) {
        this.f44062J0 = f;
        mo50526g();
    }

    @C0376v0(21)
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f44070x = f;
            float f2 = this.f44069w;
            this.f44069w = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f44070x != f) {
            z = true;
        } else {
            z = false;
        }
        this.f44070x = f;
        if (f != 0.0f) {
            if (this.f44071y == null) {
                this.f44071y = new Path();
            }
            if (this.f44057E0 == null) {
                this.f44057E0 = new RectF();
            }
            if (this.f44072z == null) {
                C16918b bVar = new C16918b();
                this.f44072z = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f44057E0.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f44071y.reset();
            Path path = this.f44071y;
            RectF rectF = this.f44057E0;
            float f3 = this.f44070x;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @C0376v0(21)
    public void setRoundPercent(float f) {
        boolean z;
        if (this.f44069w != f) {
            z = true;
        } else {
            z = false;
        }
        this.f44069w = f;
        if (f != 0.0f) {
            if (this.f44071y == null) {
                this.f44071y = new Path();
            }
            if (this.f44057E0 == null) {
                this.f44057E0 = new RectF();
            }
            if (this.f44072z == null) {
                C16917a aVar = new C16917a();
                this.f44072z = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f44069w) / 2.0f;
            this.f44057E0.set(0.0f, 0.0f, (float) width, (float) height);
            this.f44071y.reset();
            this.f44071y.addRoundRect(this.f44057E0, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        C16919c cVar = this.f44064d;
        cVar.f44079e = f;
        cVar.mo50555c(this);
    }

    public void setWarmth(float f) {
        C16919c cVar = this.f44064d;
        cVar.f44081g = f;
        cVar.mo50555c(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo50524e(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo50524e(context, attributeSet);
    }
}
