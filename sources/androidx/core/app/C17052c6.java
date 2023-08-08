package androidx.core.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.core.app.c6 */
public abstract class C17052c6 {

    /* renamed from: b */
    public static final int f45013b = 1048576;

    /* renamed from: c */
    public static final String f45014c = "sharedElement:snapshot:bitmap";

    /* renamed from: d */
    public static final String f45015d = "sharedElement:snapshot:imageScaleType";

    /* renamed from: e */
    public static final String f45016e = "sharedElement:snapshot:imageMatrix";

    /* renamed from: a */
    public Matrix f45017a;

    /* renamed from: androidx.core.app.c6$a */
    public interface C17053a {
        /* renamed from: a */
        void mo51251a();
    }

    /* renamed from: a */
    public static Bitmap m78867a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float min = Math.min(1.0f, 1048576.0f / ((float) (intrinsicWidth * intrinsicHeight)));
        if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int i = (int) (((float) intrinsicWidth) * min);
        int i2 = (int) (((float) intrinsicHeight) * min);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        drawable.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    /* renamed from: b */
    public Parcelable mo51244b(View view, Matrix matrix, RectF rectF) {
        Bitmap a;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (!(drawable == null || background != null || (a = m78867a(drawable)) == null)) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(f45014c, a);
                bundle.putString(f45015d, imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray(f45016e, fArr);
                }
                return bundle;
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        float min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
        int i = (int) (((float) round) * min);
        int i2 = (int) (((float) round2) * min);
        if (this.f45017a == null) {
            this.f45017a = new Matrix();
        }
        this.f45017a.set(matrix);
        this.f45017a.postTranslate(-rectF.left, -rectF.top);
        this.f45017a.postScale(min, min);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.concat(this.f45017a);
        view.draw(canvas);
        return createBitmap;
    }

    /* renamed from: c */
    public View mo51245c(Context context, Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable(f45014c);
            if (bitmap == null) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString(f45015d)));
            if (imageView.getScaleType() != ImageView.ScaleType.MATRIX) {
                return imageView;
            }
            float[] floatArray = bundle.getFloatArray(f45016e);
            Matrix matrix = new Matrix();
            matrix.setValues(floatArray);
            imageView.setImageMatrix(matrix);
            return imageView;
        } else if (!(parcelable instanceof Bitmap)) {
            return null;
        } else {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap((Bitmap) parcelable);
            return imageView2;
        }
    }

    /* renamed from: d */
    public void mo51246d(List<String> list, Map<String, View> map) {
    }

    /* renamed from: e */
    public void mo51247e(List<View> list) {
    }

    /* renamed from: f */
    public void mo51248f(List<String> list, List<View> list2, List<View> list3) {
    }

    /* renamed from: g */
    public void mo51249g(List<String> list, List<View> list2, List<View> list3) {
    }

    /* renamed from: h */
    public void mo51250h(List<String> list, List<View> list2, C17053a aVar) {
        aVar.mo51251a();
    }
}
