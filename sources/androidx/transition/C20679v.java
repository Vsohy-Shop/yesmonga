package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: androidx.transition.v */
public class C20679v {

    /* renamed from: a */
    public static final Matrix f53342a = new C20680a();

    /* renamed from: androidx.transition.v$a */
    public class C20680a extends Matrix {
        /* renamed from: a */
        public void mo61896a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        public boolean postConcat(Matrix matrix) {
            mo61896a();
            return false;
        }

        public boolean postRotate(float f, float f2, float f3) {
            mo61896a();
            return false;
        }

        public boolean postScale(float f, float f2, float f3, float f4) {
            mo61896a();
            return false;
        }

        public boolean postSkew(float f, float f2, float f3, float f4) {
            mo61896a();
            return false;
        }

        public boolean postTranslate(float f, float f2) {
            mo61896a();
            return false;
        }

        public boolean preConcat(Matrix matrix) {
            mo61896a();
            return false;
        }

        public boolean preRotate(float f, float f2, float f3) {
            mo61896a();
            return false;
        }

        public boolean preScale(float f, float f2, float f3, float f4) {
            mo61896a();
            return false;
        }

        public boolean preSkew(float f, float f2, float f3, float f4) {
            mo61896a();
            return false;
        }

        public boolean preTranslate(float f, float f2) {
            mo61896a();
            return false;
        }

        public void reset() {
            mo61896a();
        }

        public void set(Matrix matrix) {
            mo61896a();
        }

        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            mo61896a();
            return false;
        }

        public boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            mo61896a();
            return false;
        }

        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            mo61896a();
            return false;
        }

        public void setRotate(float f, float f2, float f3) {
            mo61896a();
        }

        public void setScale(float f, float f2, float f3, float f4) {
            mo61896a();
        }

        public void setSinCos(float f, float f2, float f3, float f4) {
            mo61896a();
        }

        public void setSkew(float f, float f2, float f3, float f4) {
            mo61896a();
        }

        public void setTranslate(float f, float f2) {
            mo61896a();
        }

        public void setValues(float[] fArr) {
            mo61896a();
        }

        public boolean postRotate(float f) {
            mo61896a();
            return false;
        }

        public boolean postScale(float f, float f2) {
            mo61896a();
            return false;
        }

        public boolean postSkew(float f, float f2) {
            mo61896a();
            return false;
        }

        public boolean preRotate(float f) {
            mo61896a();
            return false;
        }

        public boolean preScale(float f, float f2) {
            mo61896a();
            return false;
        }

        public boolean preSkew(float f, float f2) {
            mo61896a();
            return false;
        }

        public void setRotate(float f) {
            mo61896a();
        }

        public void setScale(float f, float f2) {
            mo61896a();
        }

        public void setSinCos(float f, float f2) {
            mo61896a();
        }

        public void setSkew(float f, float f2) {
            mo61896a();
        }
    }
}
