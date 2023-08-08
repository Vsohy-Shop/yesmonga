package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.transition.C20653o0;
import java.util.Map;

/* renamed from: androidx.transition.g */
public class C20588g extends C20606h0 {

    /* renamed from: k1 */
    public static final String f53064k1 = "android:changeImageTransform:matrix";

    /* renamed from: l1 */
    public static final String f53065l1 = "android:changeImageTransform:bounds";

    /* renamed from: m1 */
    public static final String[] f53066m1 = {f53064k1, f53065l1};

    /* renamed from: n1 */
    public static final TypeEvaluator<Matrix> f53067n1 = new C20589a();

    /* renamed from: o1 */
    public static final Property<ImageView, Matrix> f53068o1 = new C20590b(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.g$a */
    public class C20589a implements TypeEvaluator<Matrix> {
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: androidx.transition.g$b */
    public class C20590b extends Property<ImageView, Matrix> {
        public C20590b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        /* renamed from: b */
        public void set(ImageView imageView, Matrix matrix) {
            C20677u.m96136a(imageView, matrix);
        }
    }

    /* renamed from: androidx.transition.g$c */
    public static /* synthetic */ class C20591c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53069a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53069a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f53069a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C20588g.C20591c.<clinit>():void");
        }
    }

    public C20588g() {
    }

    /* renamed from: W0 */
    public static Matrix m95769W0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = (float) imageView.getWidth();
        float f = (float) intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = (float) imageView.getHeight();
        float f2 = (float) intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate((float) round, (float) round2);
        return matrix;
    }

    @C0359n0
    /* renamed from: X0 */
    public static Matrix m95770X0(@C0359n0 ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i = C20591c.f53069a[imageView.getScaleType().ordinal()];
        if (i == 1) {
            return m95771a1(imageView);
        }
        if (i != 2) {
            return new Matrix(imageView.getImageMatrix());
        }
        return m95769W0(imageView);
    }

    /* renamed from: a1 */
    public static Matrix m95771a1(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
        return matrix;
    }

    /* renamed from: V0 */
    public final void mo61689V0(C20657p0 p0Var) {
        View view = p0Var.f53280b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = p0Var.f53279a;
                map.put(f53065l1, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                map.put(f53064k1, m95770X0(imageView));
            }
        }
    }

    /* renamed from: Y0 */
    public final ObjectAnimator mo61690Y0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, f53068o1, new C20653o0.C20654a(), new Matrix[]{matrix, matrix2});
    }

    @C0359n0
    /* renamed from: Z0 */
    public final ObjectAnimator mo61691Z0(@C0359n0 ImageView imageView) {
        Property<ImageView, Matrix> property = f53068o1;
        TypeEvaluator<Matrix> typeEvaluator = f53067n1;
        Matrix matrix = C20679v.f53342a;
        return ObjectAnimator.ofObject(imageView, property, typeEvaluator, new Matrix[]{matrix, matrix});
    }

    @C0359n0
    /* renamed from: i0 */
    public String[] mo61634i0() {
        return f53066m1;
    }

    /* renamed from: m */
    public void mo61635m(@C0359n0 C20657p0 p0Var) {
        mo61689V0(p0Var);
    }

    /* renamed from: s */
    public void mo61636s(@C0359n0 C20657p0 p0Var) {
        mo61689V0(p0Var);
    }

    @C0363p0
    /* renamed from: x */
    public Animator mo61637x(@C0359n0 ViewGroup viewGroup, @C0363p0 C20657p0 p0Var, @C0363p0 C20657p0 p0Var2) {
        boolean z;
        if (p0Var == null || p0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) p0Var.f53279a.get(f53065l1);
        Rect rect2 = (Rect) p0Var2.f53279a.get(f53065l1);
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) p0Var.f53279a.get(f53064k1);
        Matrix matrix2 = (Matrix) p0Var2.f53279a.get(f53064k1);
        if (!(matrix == null && matrix2 == null) && (matrix == null || !matrix.equals(matrix2))) {
            z = false;
        } else {
            z = true;
        }
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) p0Var2.f53280b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return mo61691Z0(imageView);
        }
        if (matrix == null) {
            matrix = C20679v.f53342a;
        }
        if (matrix2 == null) {
            matrix2 = C20679v.f53342a;
        }
        f53068o1.set(imageView, matrix);
        return mo61690Y0(imageView, matrix, matrix2);
    }

    public C20588g(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
