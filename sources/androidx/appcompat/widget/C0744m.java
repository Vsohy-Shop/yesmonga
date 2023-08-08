package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.C0344h1;
import androidx.annotation.C0376v0;
import androidx.core.graphics.drawable.C17568s;

/* renamed from: androidx.appcompat.widget.m */
public class C0744m {

    /* renamed from: c */
    public static final int[] f2436c = {16843067, 16843068};

    /* renamed from: a */
    public final ProgressBar f2437a;

    /* renamed from: b */
    public Bitmap f2438b;

    @C0376v0(23)
    /* renamed from: androidx.appcompat.widget.m$a */
    public static class C0745a {
        /* renamed from: a */
        public static void m3636a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
            layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
            layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
            layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
            layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
            layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
            layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
            layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
            layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
            layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
        }
    }

    public C0744m(ProgressBar progressBar) {
        this.f2437a = progressBar;
    }

    /* renamed from: a */
    public final Shape mo3532a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* renamed from: b */
    public Bitmap mo3533b() {
        return this.f2438b;
    }

    /* renamed from: c */
    public void mo3534c(AttributeSet attributeSet, int i) {
        C0722h1 G = C0722h1.m3539G(this.f2437a.getContext(), attributeSet, f2436c, i, 0);
        Drawable i2 = G.mo3467i(0);
        if (i2 != null) {
            this.f2437a.setIndeterminateDrawable(mo3536e(i2));
        }
        Drawable i3 = G.mo3467i(1);
        if (i3 != null) {
            this.f2437a.setProgressDrawable(mo3535d(i3, false));
        }
        G.mo3458I();
    }

    @C0344h1
    /* renamed from: d */
    public Drawable mo3535d(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof C17568s) {
            C17568s sVar = (C17568s) drawable;
            Drawable a = sVar.mo51983a();
            if (a != null) {
                sVar.mo51984b(mo3535d(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id == 16908301 || id == 16908303) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawableArr[i] = mo3535d(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                C0745a.m3636a(layerDrawable, layerDrawable2, i2);
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f2438b == null) {
                this.f2438b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo3532a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: e */
    public final Drawable mo3536e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable d = mo3535d(animationDrawable.getFrame(i), true);
            d.setLevel(10000);
            animationDrawable2.addFrame(d, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }
}
