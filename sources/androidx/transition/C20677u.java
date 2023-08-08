package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import java.lang.reflect.Field;

/* renamed from: androidx.transition.u */
public class C20677u {

    /* renamed from: a */
    public static boolean f53339a = true;

    /* renamed from: b */
    public static Field f53340b;

    /* renamed from: c */
    public static boolean f53341c;

    /* renamed from: a */
    public static void m96136a(@C0359n0 ImageView imageView, @C0363p0 Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else {
            m96138c(imageView, matrix);
        }
    }

    /* renamed from: b */
    public static void m96137b() {
        if (!f53341c) {
            try {
                Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
                f53340b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f53341c = true;
        }
    }

    @SuppressLint({"NewApi"})
    @C0376v0(21)
    /* renamed from: c */
    public static void m96138c(@C0359n0 ImageView imageView, @C0363p0 Matrix matrix) {
        if (f53339a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                f53339a = false;
            }
        }
    }
}
