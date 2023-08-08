package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.C16944e;

public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: E0 */
    public boolean f44039E0 = true;

    /* renamed from: F0 */
    public Drawable f44040F0 = null;

    /* renamed from: G0 */
    public Drawable f44041G0 = null;

    /* renamed from: H0 */
    public float f44042H0 = Float.NaN;

    /* renamed from: I0 */
    public float f44043I0 = Float.NaN;

    /* renamed from: J0 */
    public float f44044J0 = Float.NaN;

    /* renamed from: K0 */
    public float f44045K0 = Float.NaN;

    /* renamed from: d */
    public ImageFilterView.C16919c f44046d = new ImageFilterView.C16919c();

    /* renamed from: e */
    public float f44047e = 0.0f;

    /* renamed from: f */
    public float f44048f = 0.0f;

    /* renamed from: g */
    public float f44049g = Float.NaN;

    /* renamed from: v */
    public Path f44050v;

    /* renamed from: w */
    public ViewOutlineProvider f44051w;

    /* renamed from: x */
    public RectF f44052x;

    /* renamed from: y */
    public Drawable[] f44053y = new Drawable[2];

    /* renamed from: z */
    public LayerDrawable f44054z;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$a */
    public class C16915a extends ViewOutlineProvider {
        public C16915a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterButton.this.f44048f) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$b */
    public class C16916b extends ViewOutlineProvider {
        public C16916b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f44049g);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        mo50494c(context, (AttributeSet) null);
    }

    private void setOverlay(boolean z) {
        this.f44039E0 = z;
    }

    /* renamed from: c */
    public final void mo50494c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f44040F0 = obtainStyledAttributes.getDrawable(C16944e.C16957m.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.ImageFilterView_crossfade) {
                    this.f44047e = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C16944e.C16957m.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C16944e.C16957m.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C16944e.C16957m.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C16944e.C16957m.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C16944e.C16957m.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C16944e.C16957m.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f44039E0));
                } else if (index == C16944e.C16957m.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f44042H0));
                } else if (index == C16944e.C16957m.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f44043I0));
                } else if (index == C16944e.C16957m.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f44045K0));
                } else if (index == C16944e.C16957m.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f44044J0));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f44041G0 = drawable;
            if (this.f44040F0 == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f44041G0 = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f44053y;
                    Drawable mutate = drawable2.mutate();
                    this.f44041G0 = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f44053y;
            Drawable mutate2 = getDrawable().mutate();
            this.f44041G0 = mutate2;
            drawableArr2[0] = mutate2;
            this.f44053y[1] = this.f44040F0.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f44053y);
            this.f44054z = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f44047e * 255.0f));
            if (!this.f44039E0) {
                this.f44054z.getDrawable(0).setAlpha((int) ((1.0f - this.f44047e) * 255.0f));
            }
            super.setImageDrawable(this.f44054z);
        }
    }

    /* renamed from: d */
    public final void mo50495d() {
        float f;
        float f2;
        float f3;
        float f4;
        if (!Float.isNaN(this.f44042H0) || !Float.isNaN(this.f44043I0) || !Float.isNaN(this.f44044J0) || !Float.isNaN(this.f44045K0)) {
            float f5 = 0.0f;
            if (Float.isNaN(this.f44042H0)) {
                f = 0.0f;
            } else {
                f = this.f44042H0;
            }
            if (Float.isNaN(this.f44043I0)) {
                f2 = 0.0f;
            } else {
                f2 = this.f44043I0;
            }
            if (Float.isNaN(this.f44044J0)) {
                f3 = 1.0f;
            } else {
                f3 = this.f44044J0;
            }
            if (!Float.isNaN(this.f44045K0)) {
                f5 = this.f44045K0;
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

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: f */
    public final void mo50497f() {
        if (!Float.isNaN(this.f44042H0) || !Float.isNaN(this.f44043I0) || !Float.isNaN(this.f44044J0) || !Float.isNaN(this.f44045K0)) {
            mo50495d();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public float getContrast() {
        return this.f44046d.f44080f;
    }

    public float getCrossfade() {
        return this.f44047e;
    }

    public float getImagePanX() {
        return this.f44042H0;
    }

    public float getImagePanY() {
        return this.f44043I0;
    }

    public float getImageRotate() {
        return this.f44045K0;
    }

    public float getImageZoom() {
        return this.f44044J0;
    }

    public float getRound() {
        return this.f44049g;
    }

    public float getRoundPercent() {
        return this.f44048f;
    }

    public float getSaturation() {
        return this.f44046d.f44079e;
    }

    public float getWarmth() {
        return this.f44046d.f44081g;
    }

    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        mo50495d();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = C0507a.m2346b(getContext(), i).mutate();
        this.f44040F0 = mutate;
        Drawable[] drawableArr = this.f44053y;
        drawableArr[0] = this.f44041G0;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f44053y);
        this.f44054z = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f44047e);
    }

    public void setBrightness(float f) {
        ImageFilterView.C16919c cVar = this.f44046d;
        cVar.f44078d = f;
        cVar.mo50555c(this);
    }

    public void setContrast(float f) {
        ImageFilterView.C16919c cVar = this.f44046d;
        cVar.f44080f = f;
        cVar.mo50555c(this);
    }

    public void setCrossfade(float f) {
        this.f44047e = f;
        if (this.f44053y != null) {
            if (!this.f44039E0) {
                this.f44054z.getDrawable(0).setAlpha((int) ((1.0f - this.f44047e) * 255.0f));
            }
            this.f44054z.getDrawable(1).setAlpha((int) (this.f44047e * 255.0f));
            super.setImageDrawable(this.f44054z);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f44040F0 == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f44041G0 = mutate;
        Drawable[] drawableArr = this.f44053y;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f44040F0;
        LayerDrawable layerDrawable = new LayerDrawable(this.f44053y);
        this.f44054z = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f44047e);
    }

    public void setImagePanX(float f) {
        this.f44042H0 = f;
        mo50497f();
    }

    public void setImagePanY(float f) {
        this.f44043I0 = f;
        mo50497f();
    }

    public void setImageResource(int i) {
        if (this.f44040F0 != null) {
            Drawable mutate = C0507a.m2346b(getContext(), i).mutate();
            this.f44041G0 = mutate;
            Drawable[] drawableArr = this.f44053y;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f44040F0;
            LayerDrawable layerDrawable = new LayerDrawable(this.f44053y);
            this.f44054z = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f44047e);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f44045K0 = f;
        mo50497f();
    }

    public void setImageZoom(float f) {
        this.f44044J0 = f;
        mo50497f();
    }

    @C0376v0(21)
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f44049g = f;
            float f2 = this.f44048f;
            this.f44048f = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f44049g != f) {
            z = true;
        } else {
            z = false;
        }
        this.f44049g = f;
        if (f != 0.0f) {
            if (this.f44050v == null) {
                this.f44050v = new Path();
            }
            if (this.f44052x == null) {
                this.f44052x = new RectF();
            }
            if (this.f44051w == null) {
                C16916b bVar = new C16916b();
                this.f44051w = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f44052x.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f44050v.reset();
            Path path = this.f44050v;
            RectF rectF = this.f44052x;
            float f3 = this.f44049g;
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
        if (this.f44048f != f) {
            z = true;
        } else {
            z = false;
        }
        this.f44048f = f;
        if (f != 0.0f) {
            if (this.f44050v == null) {
                this.f44050v = new Path();
            }
            if (this.f44052x == null) {
                this.f44052x = new RectF();
            }
            if (this.f44051w == null) {
                C16915a aVar = new C16915a();
                this.f44051w = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f44048f) / 2.0f;
            this.f44052x.set(0.0f, 0.0f, (float) width, (float) height);
            this.f44050v.reset();
            this.f44050v.addRoundRect(this.f44052x, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.C16919c cVar = this.f44046d;
        cVar.f44079e = f;
        cVar.mo50555c(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.C16919c cVar = this.f44046d;
        cVar.f44081g = f;
        cVar.mo50555c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo50494c(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo50494c(context, attributeSet);
    }
}
