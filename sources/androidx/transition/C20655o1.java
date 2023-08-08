package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.transition.C20538b0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.o1 */
public class C20655o1 {

    /* renamed from: b */
    public static final String f53270b = "ViewUtilsBase";

    /* renamed from: c */
    public static Method f53271c = null;

    /* renamed from: d */
    public static boolean f53272d = false;

    /* renamed from: e */
    public static Field f53273e = null;

    /* renamed from: f */
    public static boolean f53274f = false;

    /* renamed from: g */
    public static final int f53275g = 12;

    /* renamed from: a */
    public float[] f53276a;

    /* renamed from: a */
    public void mo61685a(@C0359n0 View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C20538b0.C20545g.save_non_transition_alpha, (Object) null);
        }
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    /* renamed from: b */
    public final void mo61856b() {
        if (!f53272d) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f53271c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f53272d = true;
        }
    }

    /* renamed from: c */
    public float mo61686c(@C0359n0 View view) {
        Float f = (Float) view.getTag(C20538b0.C20545g.save_non_transition_alpha);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo61687d(@C0359n0 View view) {
        int i = C20538b0.C20545g.save_non_transition_alpha;
        if (view.getTag(i) == null) {
            view.setTag(i, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: e */
    public void mo61809e(@C0359n0 View view, @C0363p0 Matrix matrix) {
        int i;
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX((float) (view.getWidth() / 2));
            view.setPivotY((float) (view.getHeight() / 2));
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f53276a;
        if (fArr == null) {
            fArr = new float[9];
            this.f53276a = fArr;
        }
        matrix.getValues(fArr);
        float f = fArr[3];
        float sqrt = (float) Math.sqrt((double) (1.0f - (f * f)));
        if (fArr[0] < 0.0f) {
            i = -1;
        } else {
            i = 1;
        }
        float f2 = sqrt * ((float) i);
        float degrees = (float) Math.toDegrees(Math.atan2((double) f, (double) f2));
        float f3 = fArr[0] / f2;
        float f4 = fArr[4] / f2;
        float f5 = fArr[2];
        float f6 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        view.setRotation(degrees);
        view.setScaleX(f3);
        view.setScaleY(f4);
    }

    /* renamed from: f */
    public void mo61822f(@C0359n0 View view, int i, int i2, int i3, int i4) {
        mo61856b();
        Method method = f53271c;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: g */
    public void mo61688g(@C0359n0 View view, float f) {
        Float f2 = (Float) view.getTag(C20538b0.C20545g.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: h */
    public void mo61851h(@C0359n0 View view, int i) {
        if (!f53274f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f53273e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f53274f = true;
        }
        Field field = f53273e;
        if (field != null) {
            try {
                f53273e.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: i */
    public void mo61810i(@C0359n0 View view, @C0359n0 Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo61810i(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: j */
    public void mo61811j(@C0359n0 View view, @C0359n0 Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo61811j(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
