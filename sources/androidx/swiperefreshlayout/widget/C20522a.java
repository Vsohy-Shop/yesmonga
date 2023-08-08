package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.C18196h2;
import androidx.swiperefreshlayout.C20500a;

/* renamed from: androidx.swiperefreshlayout.widget.a */
public class C20522a extends ImageView {

    /* renamed from: d */
    public static final int f52908d = -328966;

    /* renamed from: e */
    public static final int f52909e = 1023410176;

    /* renamed from: f */
    public static final int f52910f = 503316480;

    /* renamed from: g */
    public static final float f52911g = 0.0f;

    /* renamed from: v */
    public static final float f52912v = 1.75f;

    /* renamed from: w */
    public static final float f52913w = 3.5f;

    /* renamed from: x */
    public static final int f52914x = 4;

    /* renamed from: a */
    public Animation.AnimationListener f52915a;

    /* renamed from: b */
    public int f52916b;

    /* renamed from: c */
    public int f52917c;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    public static class C20523a extends OvalShape {

        /* renamed from: a */
        public Paint f52918a = new Paint();

        /* renamed from: b */
        public int f52919b;

        /* renamed from: c */
        public C20522a f52920c;

        public C20523a(C20522a aVar, int i) {
            this.f52920c = aVar;
            this.f52919b = i;
            mo61516b((int) rect().width());
        }

        /* renamed from: b */
        public final void mo61516b(int i) {
            float f = (float) (i / 2);
            this.f52918a.setShader(new RadialGradient(f, f, (float) this.f52919b, new int[]{C20522a.f52909e, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.f52920c.getWidth() / 2;
            float f = (float) width;
            float height = (float) (this.f52920c.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f52918a);
            canvas.drawCircle(f, height, (float) (width - this.f52919b), paint);
        }

        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            mo61516b((int) f);
        }
    }

    public C20522a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f52916b = (int) (3.5f * f);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C20500a.C20510j.SwipeRefreshLayout);
        this.f52917c = obtainStyledAttributes.getColor(C20500a.C20510j.f52836xaa980688, f52908d);
        obtainStyledAttributes.recycle();
        if (mo61509a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C18196h2.m82519N1(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C20523a(this, this.f52916b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f52916b, (float) i2, (float) i, f52910f);
            int i3 = this.f52916b;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f52917c);
        C18196h2.m82502I1(this, shapeDrawable);
    }

    /* renamed from: a */
    public final boolean mo61509a() {
        return true;
    }

    /* renamed from: b */
    public int mo61510b() {
        return this.f52917c;
    }

    /* renamed from: c */
    public void mo61511c(Animation.AnimationListener animationListener) {
        this.f52915a = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f52915a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f52915a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!mo61509a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f52916b * 2), getMeasuredHeight() + (this.f52916b * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f52917c = i;
        }
    }
}
