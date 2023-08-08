package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.appcompat.C0387a;
import androidx.constraintlayout.motion.widget.C16878c;
import androidx.constraintlayout.motion.widget.C16880e;
import androidx.constraintlayout.widget.C16944e;
import androidx.core.view.C18306m0;
import com.bumptech.glide.load.engine.GlideException;

public class MotionLabel extends View implements C16880e {

    /* renamed from: o1 */
    public static String f44100o1 = "MotionLabel";

    /* renamed from: p1 */
    public static final int f44101p1 = 1;

    /* renamed from: q1 */
    public static final int f44102q1 = 2;

    /* renamed from: r1 */
    public static final int f44103r1 = 3;

    /* renamed from: E0 */
    public int f44104E0;

    /* renamed from: F0 */
    public float f44105F0 = 0.0f;

    /* renamed from: G0 */
    public String f44106G0 = "Hello World";

    /* renamed from: H0 */
    public boolean f44107H0 = true;

    /* renamed from: I0 */
    public Rect f44108I0 = new Rect();

    /* renamed from: J0 */
    public CharSequence f44109J0;

    /* renamed from: K0 */
    public int f44110K0 = 1;

    /* renamed from: L0 */
    public int f44111L0 = 1;

    /* renamed from: M0 */
    public int f44112M0 = 1;

    /* renamed from: N0 */
    public int f44113N0 = 1;

    /* renamed from: O0 */
    public String f44114O0;

    /* renamed from: P0 */
    public Layout f44115P0;

    /* renamed from: Q0 */
    public int f44116Q0 = 8388659;

    /* renamed from: R0 */
    public int f44117R0 = 0;

    /* renamed from: S0 */
    public boolean f44118S0 = false;

    /* renamed from: T0 */
    public float f44119T0;

    /* renamed from: U0 */
    public float f44120U0;

    /* renamed from: V0 */
    public float f44121V0;

    /* renamed from: W0 */
    public Drawable f44122W0;

    /* renamed from: X0 */
    public Matrix f44123X0;

    /* renamed from: Y0 */
    public Bitmap f44124Y0;

    /* renamed from: Z0 */
    public BitmapShader f44125Z0;

    /* renamed from: a */
    public TextPaint f44126a = new TextPaint();

    /* renamed from: a1 */
    public Matrix f44127a1;

    /* renamed from: b */
    public Path f44128b = new Path();

    /* renamed from: b1 */
    public float f44129b1 = Float.NaN;

    /* renamed from: c */
    public int f44130c = 65535;

    /* renamed from: c1 */
    public float f44131c1 = Float.NaN;

    /* renamed from: d */
    public int f44132d = 65535;

    /* renamed from: d1 */
    public float f44133d1 = 0.0f;

    /* renamed from: e */
    public boolean f44134e = false;

    /* renamed from: e1 */
    public float f44135e1 = 0.0f;

    /* renamed from: f */
    public float f44136f = 0.0f;

    /* renamed from: f1 */
    public Paint f44137f1 = new Paint();

    /* renamed from: g */
    public float f44138g = Float.NaN;

    /* renamed from: g1 */
    public int f44139g1 = 0;

    /* renamed from: h1 */
    public Rect f44140h1;

    /* renamed from: i1 */
    public Paint f44141i1;

    /* renamed from: j1 */
    public float f44142j1;

    /* renamed from: k1 */
    public float f44143k1 = Float.NaN;

    /* renamed from: l1 */
    public float f44144l1 = Float.NaN;

    /* renamed from: m1 */
    public float f44145m1 = Float.NaN;

    /* renamed from: n1 */
    public float f44146n1 = Float.NaN;

    /* renamed from: v */
    public ViewOutlineProvider f44147v;

    /* renamed from: w */
    public RectF f44148w;

    /* renamed from: x */
    public float f44149x = 48.0f;

    /* renamed from: y */
    public float f44150y = Float.NaN;

    /* renamed from: z */
    public int f44151z;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$a */
    public class C16922a extends ViewOutlineProvider {
        public C16922a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * MotionLabel.this.f44136f) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$b */
    public class C16923b extends ViewOutlineProvider {
        public C16923b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f44138g);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        mo50570g(context, (AttributeSet) null);
    }

    private float getHorizontalOffset() {
        float f;
        float f2;
        if (Float.isNaN(this.f44150y)) {
            f = 1.0f;
        } else {
            f = this.f44149x / this.f44150y;
        }
        TextPaint textPaint = this.f44126a;
        String str = this.f44106G0;
        float measureText = f * textPaint.measureText(str, 0, str.length());
        if (Float.isNaN(this.f44120U0)) {
            f2 = (float) getMeasuredWidth();
        } else {
            f2 = this.f44120U0;
        }
        return ((((f2 - ((float) getPaddingLeft())) - ((float) getPaddingRight())) - measureText) * (this.f44133d1 + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f;
        float f2;
        if (Float.isNaN(this.f44150y)) {
            f = 1.0f;
        } else {
            f = this.f44149x / this.f44150y;
        }
        Paint.FontMetrics fontMetrics = this.f44126a.getFontMetrics();
        if (Float.isNaN(this.f44121V0)) {
            f2 = (float) getMeasuredHeight();
        } else {
            f2 = this.f44121V0;
        }
        float paddingTop = (f2 - ((float) getPaddingTop())) - ((float) getPaddingBottom());
        float f3 = fontMetrics.descent;
        float f4 = fontMetrics.ascent;
        return (((paddingTop - ((f3 - f4) * f)) * (1.0f - this.f44135e1)) / 2.0f) - (f * f4);
    }

    /* renamed from: a */
    public void mo50155a(float f, float f2, float f3, float f4) {
        float f5;
        int i = (int) (f + 0.5f);
        this.f44119T0 = f - ((float) i);
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f6 = f3 - f;
        this.f44120U0 = f6;
        float f7 = f4 - f2;
        this.f44121V0 = f7;
        mo50567d(f, f2, f3, f4);
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.f44118S0) {
            if (this.f44140h1 == null) {
                this.f44141i1 = new Paint();
                this.f44140h1 = new Rect();
                this.f44141i1.set(this.f44126a);
                this.f44142j1 = this.f44141i1.getTextSize();
            }
            this.f44120U0 = f6;
            this.f44121V0 = f7;
            Paint paint = this.f44141i1;
            String str = this.f44106G0;
            paint.getTextBounds(str, 0, str.length(), this.f44140h1);
            int width = this.f44140h1.width();
            float height = ((float) this.f44140h1.height()) * 1.3f;
            float f8 = (f6 - ((float) this.f44111L0)) - ((float) this.f44110K0);
            float f9 = (f7 - ((float) this.f44113N0)) - ((float) this.f44112M0);
            float f10 = (float) width;
            if (f10 * f9 > height * f8) {
                this.f44126a.setTextSize((this.f44142j1 * f8) / f10);
            } else {
                this.f44126a.setTextSize((this.f44142j1 * f9) / height);
            }
            if (this.f44134e || !Float.isNaN(this.f44150y)) {
                if (Float.isNaN(this.f44150y)) {
                    f5 = 1.0f;
                } else {
                    f5 = this.f44149x / this.f44150y;
                }
                mo50569f(f5);
            }
        }
    }

    /* renamed from: d */
    public final void mo50567d(float f, float f2, float f3, float f4) {
        if (this.f44127a1 != null) {
            this.f44120U0 = f3 - f;
            this.f44121V0 = f4 - f2;
            mo50588l();
        }
    }

    /* renamed from: e */
    public Bitmap mo50568e(Bitmap bitmap, int i) {
        System.nanoTime();
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i2 = 0; i2 < i && width >= 32 && height >= 32; i2++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    /* renamed from: f */
    public void mo50569f(float f) {
        if (this.f44134e || f != 1.0f) {
            this.f44128b.reset();
            String str = this.f44106G0;
            int length = str.length();
            this.f44126a.getTextBounds(str, 0, length, this.f44108I0);
            this.f44126a.getTextPath(str, 0, length, 0.0f, 0.0f, this.f44128b);
            if (f != 1.0f) {
                StringBuilder sb = new StringBuilder();
                sb.append(C16878c.m77583f());
                sb.append(" scale ");
                sb.append(f);
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.f44128b.transform(matrix);
            }
            Rect rect = this.f44108I0;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = (float) getHeight();
            rectF.right = (float) getWidth();
            this.f44107H0 = false;
        }
    }

    /* renamed from: g */
    public final void mo50570g(Context context, AttributeSet attributeSet) {
        mo50585i(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.MotionLabel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.MotionLabel_android_text) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == C16944e.C16957m.MotionLabel_android_fontFamily) {
                    this.f44114O0 = obtainStyledAttributes.getString(index);
                } else if (index == C16944e.C16957m.MotionLabel_scaleFromTextSize) {
                    this.f44150y = (float) obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f44150y);
                } else if (index == C16944e.C16957m.MotionLabel_android_textSize) {
                    this.f44149x = (float) obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f44149x);
                } else if (index == C16944e.C16957m.MotionLabel_android_textStyle) {
                    this.f44151z = obtainStyledAttributes.getInt(index, this.f44151z);
                } else if (index == C16944e.C16957m.MotionLabel_android_typeface) {
                    this.f44104E0 = obtainStyledAttributes.getInt(index, this.f44104E0);
                } else if (index == C16944e.C16957m.MotionLabel_android_textColor) {
                    this.f44130c = obtainStyledAttributes.getColor(index, this.f44130c);
                } else if (index == C16944e.C16957m.MotionLabel_borderRound) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f44138g);
                    this.f44138g = dimension;
                    setRound(dimension);
                } else if (index == C16944e.C16957m.MotionLabel_borderRoundPercent) {
                    float f = obtainStyledAttributes.getFloat(index, this.f44136f);
                    this.f44136f = f;
                    setRoundPercent(f);
                } else if (index == C16944e.C16957m.MotionLabel_android_gravity) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == C16944e.C16957m.MotionLabel_android_autoSizeTextType) {
                    this.f44117R0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C16944e.C16957m.MotionLabel_textOutlineColor) {
                    this.f44132d = obtainStyledAttributes.getInt(index, this.f44132d);
                    this.f44134e = true;
                } else if (index == C16944e.C16957m.MotionLabel_textOutlineThickness) {
                    this.f44105F0 = obtainStyledAttributes.getDimension(index, this.f44105F0);
                    this.f44134e = true;
                } else if (index == C16944e.C16957m.MotionLabel_textBackground) {
                    this.f44122W0 = obtainStyledAttributes.getDrawable(index);
                    this.f44134e = true;
                } else if (index == C16944e.C16957m.MotionLabel_textBackgroundPanX) {
                    this.f44143k1 = obtainStyledAttributes.getFloat(index, this.f44143k1);
                } else if (index == C16944e.C16957m.MotionLabel_textBackgroundPanY) {
                    this.f44144l1 = obtainStyledAttributes.getFloat(index, this.f44144l1);
                } else if (index == C16944e.C16957m.MotionLabel_textPanX) {
                    this.f44133d1 = obtainStyledAttributes.getFloat(index, this.f44133d1);
                } else if (index == C16944e.C16957m.MotionLabel_textPanY) {
                    this.f44135e1 = obtainStyledAttributes.getFloat(index, this.f44135e1);
                } else if (index == C16944e.C16957m.MotionLabel_textBackgroundRotate) {
                    this.f44146n1 = obtainStyledAttributes.getFloat(index, this.f44146n1);
                } else if (index == C16944e.C16957m.MotionLabel_textBackgroundZoom) {
                    this.f44145m1 = obtainStyledAttributes.getFloat(index, this.f44145m1);
                } else if (index == C16944e.C16957m.MotionLabel_textureHeight) {
                    this.f44129b1 = obtainStyledAttributes.getDimension(index, this.f44129b1);
                } else if (index == C16944e.C16957m.MotionLabel_textureWidth) {
                    this.f44131c1 = obtainStyledAttributes.getDimension(index, this.f44131c1);
                } else if (index == C16944e.C16957m.MotionLabel_textureEffect) {
                    this.f44139g1 = obtainStyledAttributes.getInt(index, this.f44139g1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        mo50587k();
        mo50586j();
    }

    public float getRound() {
        return this.f44138g;
    }

    public float getRoundPercent() {
        return this.f44136f;
    }

    public float getScaleFromTextSize() {
        return this.f44150y;
    }

    public float getTextBackgroundPanX() {
        return this.f44143k1;
    }

    public float getTextBackgroundPanY() {
        return this.f44144l1;
    }

    public float getTextBackgroundRotate() {
        return this.f44146n1;
    }

    public float getTextBackgroundZoom() {
        return this.f44145m1;
    }

    public int getTextOutlineColor() {
        return this.f44132d;
    }

    public float getTextPanX() {
        return this.f44133d1;
    }

    public float getTextPanY() {
        return this.f44135e1;
    }

    public float getTextureHeight() {
        return this.f44129b1;
    }

    public float getTextureWidth() {
        return this.f44131c1;
    }

    public Typeface getTypeface() {
        return this.f44126a.getTypeface();
    }

    /* renamed from: h */
    public final void mo50584h(String str, int i, int i2) {
        Typeface typeface;
        Typeface typeface2;
        int i3;
        if (str != null) {
            typeface = Typeface.create(str, i2);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z = true;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else if (i == 3) {
            typeface = Typeface.MONOSPACE;
        }
        float f = 0.0f;
        if (i2 > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i2);
            } else {
                typeface2 = Typeface.create(typeface, i2);
            }
            setTypeface(typeface2);
            if (typeface2 != null) {
                i3 = typeface2.getStyle();
            } else {
                i3 = 0;
            }
            int i4 = (~i3) & i2;
            TextPaint textPaint = this.f44126a;
            if ((i4 & 1) == 0) {
                z = false;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f44126a;
            if ((i4 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f44126a.setFakeBoldText(false);
        this.f44126a.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    /* renamed from: i */
    public final void mo50585i(Context context, @C0363p0 AttributeSet attributeSet) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0387a.C0389b.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f44126a;
        int i = typedValue.data;
        this.f44130c = i;
        textPaint.setColor(i);
    }

    /* renamed from: j */
    public void mo50586j() {
        this.f44110K0 = getPaddingLeft();
        this.f44111L0 = getPaddingRight();
        this.f44112M0 = getPaddingTop();
        this.f44113N0 = getPaddingBottom();
        mo50584h(this.f44114O0, this.f44104E0, this.f44151z);
        this.f44126a.setColor(this.f44130c);
        this.f44126a.setStrokeWidth(this.f44105F0);
        this.f44126a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f44126a.setFlags(128);
        setTextSize(this.f44149x);
        this.f44126a.setAntiAlias(true);
    }

    /* renamed from: k */
    public final void mo50587k() {
        if (this.f44122W0 != null) {
            this.f44127a1 = new Matrix();
            int intrinsicWidth = this.f44122W0.getIntrinsicWidth();
            int intrinsicHeight = this.f44122W0.getIntrinsicHeight();
            int i = 128;
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                if (Float.isNaN(this.f44131c1)) {
                    intrinsicWidth = 128;
                } else {
                    intrinsicWidth = (int) this.f44131c1;
                }
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (!Float.isNaN(this.f44129b1)) {
                    i = (int) this.f44129b1;
                }
                intrinsicHeight = i;
            }
            if (this.f44139g1 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f44124Y0 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f44124Y0);
            this.f44122W0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f44122W0.setFilterBitmap(true);
            this.f44122W0.draw(canvas);
            if (this.f44139g1 != 0) {
                this.f44124Y0 = mo50568e(this.f44124Y0, 4);
            }
            Bitmap bitmap = this.f44124Y0;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f44125Z0 = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    /* renamed from: l */
    public final void mo50588l() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = 0.0f;
        if (Float.isNaN(this.f44143k1)) {
            f = 0.0f;
        } else {
            f = this.f44143k1;
        }
        if (Float.isNaN(this.f44144l1)) {
            f2 = 0.0f;
        } else {
            f2 = this.f44144l1;
        }
        if (Float.isNaN(this.f44145m1)) {
            f3 = 1.0f;
        } else {
            f3 = this.f44145m1;
        }
        if (!Float.isNaN(this.f44146n1)) {
            f7 = this.f44146n1;
        }
        this.f44127a1.reset();
        float width = (float) this.f44124Y0.getWidth();
        float height = (float) this.f44124Y0.getHeight();
        if (Float.isNaN(this.f44131c1)) {
            f4 = this.f44120U0;
        } else {
            f4 = this.f44131c1;
        }
        if (Float.isNaN(this.f44129b1)) {
            f5 = this.f44121V0;
        } else {
            f5 = this.f44129b1;
        }
        if (width * f5 < height * f4) {
            f6 = f4 / width;
        } else {
            f6 = f5 / height;
        }
        float f8 = f3 * f6;
        this.f44127a1.postScale(f8, f8);
        float f9 = width * f8;
        float f10 = f4 - f9;
        float f11 = f8 * height;
        float f12 = f5 - f11;
        if (!Float.isNaN(this.f44129b1)) {
            f12 = this.f44129b1 / 2.0f;
        }
        if (!Float.isNaN(this.f44131c1)) {
            f10 = this.f44131c1 / 2.0f;
        }
        this.f44127a1.postTranslate((((f * f10) + f4) - f9) * 0.5f, (((f2 * f12) + f5) - f11) * 0.5f);
        this.f44127a1.postRotate(f7, f4 / 2.0f, f5 / 2.0f);
        this.f44125Z0.setLocalMatrix(this.f44127a1);
    }

    public void layout(int i, int i2, int i3, int i4) {
        float f;
        super.layout(i, i2, i3, i4);
        boolean isNaN = Float.isNaN(this.f44150y);
        if (isNaN) {
            f = 1.0f;
        } else {
            f = this.f44149x / this.f44150y;
        }
        this.f44120U0 = (float) (i3 - i);
        this.f44121V0 = (float) (i4 - i2);
        if (this.f44118S0) {
            if (this.f44140h1 == null) {
                this.f44141i1 = new Paint();
                this.f44140h1 = new Rect();
                this.f44141i1.set(this.f44126a);
                this.f44142j1 = this.f44141i1.getTextSize();
            }
            Paint paint = this.f44141i1;
            String str = this.f44106G0;
            paint.getTextBounds(str, 0, str.length(), this.f44140h1);
            int width = this.f44140h1.width();
            int height = (int) (((float) this.f44140h1.height()) * 1.3f);
            float f2 = (this.f44120U0 - ((float) this.f44111L0)) - ((float) this.f44110K0);
            float f3 = (this.f44121V0 - ((float) this.f44113N0)) - ((float) this.f44112M0);
            if (isNaN) {
                float f4 = (float) width;
                float f5 = (float) height;
                if (f4 * f3 > f5 * f2) {
                    this.f44126a.setTextSize((this.f44142j1 * f2) / f4);
                } else {
                    this.f44126a.setTextSize((this.f44142j1 * f3) / f5);
                }
            } else {
                float f6 = (float) width;
                float f7 = (float) height;
                if (f6 * f3 > f7 * f2) {
                    f = f2 / f6;
                } else {
                    f = f3 / f7;
                }
            }
        }
        if (this.f44134e || !isNaN) {
            mo50567d((float) i, (float) i2, (float) i3, (float) i4);
            mo50569f(f);
        }
    }

    public void onDraw(Canvas canvas) {
        float f;
        if (Float.isNaN(this.f44150y)) {
            f = 1.0f;
        } else {
            f = this.f44149x / this.f44150y;
        }
        super.onDraw(canvas);
        if (this.f44134e || f != 1.0f) {
            if (this.f44107H0) {
                mo50569f(f);
            }
            if (this.f44123X0 == null) {
                this.f44123X0 = new Matrix();
            }
            if (this.f44134e) {
                this.f44137f1.set(this.f44126a);
                this.f44123X0.reset();
                float horizontalOffset = ((float) this.f44110K0) + getHorizontalOffset();
                float verticalOffset = ((float) this.f44112M0) + getVerticalOffset();
                this.f44123X0.postTranslate(horizontalOffset, verticalOffset);
                this.f44123X0.preScale(f, f);
                this.f44128b.transform(this.f44123X0);
                if (this.f44125Z0 != null) {
                    this.f44126a.setFilterBitmap(true);
                    this.f44126a.setShader(this.f44125Z0);
                } else {
                    this.f44126a.setColor(this.f44130c);
                }
                this.f44126a.setStyle(Paint.Style.FILL);
                this.f44126a.setStrokeWidth(this.f44105F0);
                canvas.drawPath(this.f44128b, this.f44126a);
                if (this.f44125Z0 != null) {
                    this.f44126a.setShader((Shader) null);
                }
                this.f44126a.setColor(this.f44132d);
                this.f44126a.setStyle(Paint.Style.STROKE);
                this.f44126a.setStrokeWidth(this.f44105F0);
                canvas.drawPath(this.f44128b, this.f44126a);
                this.f44123X0.reset();
                this.f44123X0.postTranslate(-horizontalOffset, -verticalOffset);
                this.f44128b.transform(this.f44123X0);
                this.f44126a.set(this.f44137f1);
                return;
            }
            float horizontalOffset2 = ((float) this.f44110K0) + getHorizontalOffset();
            float verticalOffset2 = ((float) this.f44112M0) + getVerticalOffset();
            this.f44123X0.reset();
            this.f44123X0.preTranslate(horizontalOffset2, verticalOffset2);
            this.f44128b.transform(this.f44123X0);
            this.f44126a.setColor(this.f44130c);
            this.f44126a.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f44126a.setStrokeWidth(this.f44105F0);
            canvas.drawPath(this.f44128b, this.f44126a);
            this.f44123X0.reset();
            this.f44123X0.preTranslate(-horizontalOffset2, -verticalOffset2);
            this.f44128b.transform(this.f44123X0);
            return;
        }
        canvas.drawText(this.f44106G0, this.f44119T0 + ((float) this.f44110K0) + getHorizontalOffset(), ((float) this.f44112M0) + getVerticalOffset(), this.f44126a);
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f44118S0 = false;
        this.f44110K0 = getPaddingLeft();
        this.f44111L0 = getPaddingRight();
        this.f44112M0 = getPaddingTop();
        this.f44113N0 = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f44126a;
            String str = this.f44106G0;
            textPaint.getTextBounds(str, 0, str.length(), this.f44108I0);
            if (mode != 1073741824) {
                size = (int) (((float) this.f44108I0.width()) + 0.99999f);
            }
            size += this.f44110K0 + this.f44111L0;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (((float) this.f44126a.getFontMetricsInt((Paint.FontMetricsInt) null)) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f44112M0 + this.f44113N0 + fontMetricsInt;
            }
        } else if (this.f44117R0 != 0) {
            this.f44118S0 = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i) {
        if ((i & C18306m0.f46962d) == 0) {
            i |= C18306m0.f46960b;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.f44116Q0) {
            invalidate();
        }
        this.f44116Q0 = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.f44135e1 = -1.0f;
        } else if (i2 != 80) {
            this.f44135e1 = 0.0f;
        } else {
            this.f44135e1 = 1.0f;
        }
        int i3 = i & C18306m0.f46962d;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.f44133d1 = 0.0f;
                        return;
                    }
                }
            }
            this.f44133d1 = 1.0f;
            return;
        }
        this.f44133d1 = -1.0f;
    }

    @C0376v0(21)
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f44138g = f;
            float f2 = this.f44136f;
            this.f44136f = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f44138g != f) {
            z = true;
        } else {
            z = false;
        }
        this.f44138g = f;
        if (f != 0.0f) {
            if (this.f44128b == null) {
                this.f44128b = new Path();
            }
            if (this.f44148w == null) {
                this.f44148w = new RectF();
            }
            if (this.f44147v == null) {
                C16923b bVar = new C16923b();
                this.f44147v = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f44148w.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f44128b.reset();
            Path path = this.f44128b;
            RectF rectF = this.f44148w;
            float f3 = this.f44138g;
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
        if (this.f44136f != f) {
            z = true;
        } else {
            z = false;
        }
        this.f44136f = f;
        if (f != 0.0f) {
            if (this.f44128b == null) {
                this.f44128b = new Path();
            }
            if (this.f44148w == null) {
                this.f44148w = new RectF();
            }
            if (this.f44147v == null) {
                C16922a aVar = new C16922a();
                this.f44147v = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f44136f) / 2.0f;
            this.f44148w.set(0.0f, 0.0f, (float) width, (float) height);
            this.f44128b.reset();
            this.f44128b.addRoundRect(this.f44148w, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f44150y = f;
    }

    public void setText(CharSequence charSequence) {
        this.f44106G0 = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.f44143k1 = f;
        mo50588l();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.f44144l1 = f;
        mo50588l();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.f44146n1 = f;
        mo50588l();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.f44145m1 = f;
        mo50588l();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.f44130c = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.f44132d = i;
        this.f44134e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f44105F0 = f;
        this.f44134e = true;
        if (Float.isNaN(f)) {
            this.f44105F0 = 1.0f;
            this.f44134e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.f44133d1 = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.f44135e1 = f;
        invalidate();
    }

    public void setTextSize(float f) {
        float f2;
        this.f44149x = f;
        StringBuilder sb = new StringBuilder();
        sb.append(C16878c.m77583f());
        sb.append(GlideException.C22148a.f56917d);
        sb.append(f);
        sb.append(" / ");
        sb.append(this.f44150y);
        TextPaint textPaint = this.f44126a;
        if (!Float.isNaN(this.f44150y)) {
            f = this.f44150y;
        }
        textPaint.setTextSize(f);
        if (Float.isNaN(this.f44150y)) {
            f2 = 1.0f;
        } else {
            f2 = this.f44149x / this.f44150y;
        }
        mo50569f(f2);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.f44129b1 = f;
        mo50588l();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.f44131c1 = f;
        mo50588l();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f44126a.getTypeface() != typeface) {
            this.f44126a.setTypeface(typeface);
            if (this.f44115P0 != null) {
                this.f44115P0 = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public MotionLabel(Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        mo50570g(context, attributeSet);
    }

    public MotionLabel(Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo50570g(context, attributeSet);
    }
}
