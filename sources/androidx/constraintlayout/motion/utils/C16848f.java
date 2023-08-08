package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.C16677b;
import androidx.constraintlayout.core.motion.utils.C16685g;
import androidx.constraintlayout.core.motion.utils.C16712t;
import androidx.constraintlayout.motion.widget.C16881f;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.constraintlayout.motion.utils.f */
public abstract class C16848f extends C16712t {

    /* renamed from: p */
    public static final String f43184p = "ViewTimeCycle";

    /* renamed from: androidx.constraintlayout.motion.utils.f$a */
    public static class C16849a extends C16848f {
        /* renamed from: j */
        public boolean mo49947j(View view, float f, long j, C16685g gVar) {
            view.setAlpha(mo49946g(f, j, view, gVar));
            return this.f42101h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.f$b */
    public static class C16850b extends C16848f {

        /* renamed from: q */
        public String f43185q;

        /* renamed from: r */
        public SparseArray<ConstraintAttribute> f43186r;

        /* renamed from: s */
        public SparseArray<float[]> f43187s = new SparseArray<>();

        /* renamed from: t */
        public float[] f43188t;

        /* renamed from: u */
        public float[] f43189u;

        public C16850b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f43185q = str.split(",")[1];
            this.f43186r = sparseArray;
        }

        /* renamed from: c */
        public void mo49097c(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        /* renamed from: f */
        public void mo49100f(int i) {
            int size = this.f43186r.size();
            int p = this.f43186r.valueAt(0).mo50637p();
            double[] dArr = new double[size];
            int i2 = p + 2;
            this.f43188t = new float[i2];
            this.f43189u = new float[p];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.f43186r.keyAt(i3);
                float[] valueAt = this.f43187s.valueAt(i3);
                dArr[i3] = ((double) keyAt) * 0.01d;
                this.f43186r.valueAt(i3).mo50633l(this.f43188t);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f43188t;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                double[] dArr3 = dArr2[i3];
                dArr3[p] = (double) valueAt[0];
                dArr3[p + 1] = (double) valueAt[1];
            }
            this.f42094a = C16677b.m76154a(i, dArr, dArr2);
        }

        /* renamed from: j */
        public boolean mo49947j(View view, float f, long j, C16685g gVar) {
            boolean z;
            View view2 = view;
            long j2 = j;
            this.f42094a.mo48983e((double) f, this.f43188t);
            float[] fArr = this.f43188t;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j3 = j2 - this.f42102i;
            if (Float.isNaN(this.f42103j)) {
                float a = gVar.mo49016a(view2, this.f43185q, 0);
                this.f42103j = a;
                if (Float.isNaN(a)) {
                    this.f42103j = 0.0f;
                }
            }
            float f4 = (float) ((((double) this.f42103j) + ((((double) j3) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f42103j = f4;
            this.f42102i = j2;
            float a2 = mo49095a(f4);
            this.f42101h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f43189u;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z2 = this.f42101h;
                float f5 = this.f43188t[i];
                if (((double) f5) != 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                this.f42101h = z2 | z;
                fArr2[i] = (f5 * a2) + f3;
                i++;
            }
            C16814a.m77332b(this.f43186r.valueAt(0), view2, this.f43189u);
            if (f2 != 0.0f) {
                this.f42101h = true;
            }
            return this.f42101h;
        }

        /* renamed from: k */
        public void mo49948k(int i, ConstraintAttribute constraintAttribute, float f, int i2, float f2) {
            this.f43186r.append(i, constraintAttribute);
            this.f43187s.append(i, new float[]{f, f2});
            this.f42095b = Math.max(this.f42095b, i2);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.f$c */
    public static class C16851c extends C16848f {
        /* renamed from: j */
        public boolean mo49947j(View view, float f, long j, C16685g gVar) {
            view.setElevation(mo49946g(f, j, view, gVar));
            return this.f42101h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.f$d */
    public static class C16852d extends C16848f {
        /* renamed from: j */
        public boolean mo49947j(View view, float f, long j, C16685g gVar) {
            return this.f42101h;
        }

        /* renamed from: k */
        public boolean mo49949k(View view, C16685g gVar, float f, long j, double d, double d2) {
            view.setRotation(mo49946g(f, j, view, gVar) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f42101h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.f$e */
    public static class C16853e extends C16848f {

        /* renamed from: q */
        public boolean f43190q = false;

        /* renamed from: j */
        public boolean mo49947j(View view, float f, long j, C16685g gVar) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo49946g(f, j, view, gVar));
            } else if (this.f43190q) {
                return false;
            } else {
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f43190q = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo49946g(f, j, view, gVar))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.f42101h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.f$f */
    public static class C16854f extends C16848f {
        /* renamed from: j */
        public boolean mo49947j(View view, float f, long j, C16685g gVar) {
            view.setRotation(mo49946g(f, j, view, gVar));
            return this.f42101h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.f$g */
    public static class C16855g extends C16848f {
        /* renamed from: j */
        public boolean mo49947j(View view, float f, long j, C16685g gVar) {
            view.setRotationX(mo49946g(f, j, view, gVar));
            return this.f42101h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.f$h */
    public static class C16856h extends C16848f {
        /* renamed from: j */
        public boolean mo49947j(View view, float f, long j, C16685g gVar) {
            view.setRotationY(mo49946g(f, j, view, gVar));
            return this.f42101h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.f$i */
    public static class C16857i extends C16848f {
        /* renamed from: j */
        public boolean mo49947j(View view, float f, long j, C16685g gVar) {
            view.setScaleX(mo49946g(f, j, view, gVar));
            return this.f42101h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.f$j */
    public static class C16858j extends C16848f {
        /* renamed from: j */
        public boolean mo49947j(View view, float f, long j, C16685g gVar) {
            view.setScaleY(mo49946g(f, j, view, gVar));
            return this.f42101h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.f$k */
    public static class C16859k extends C16848f {
        /* renamed from: j */
        public boolean mo49947j(View view, float f, long j, C16685g gVar) {
            view.setTranslationX(mo49946g(f, j, view, gVar));
            return this.f42101h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.f$l */
    public static class C16860l extends C16848f {
        /* renamed from: j */
        public boolean mo49947j(View view, float f, long j, C16685g gVar) {
            view.setTranslationY(mo49946g(f, j, view, gVar));
            return this.f42101h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.f$m */
    public static class C16861m extends C16848f {
        /* renamed from: j */
        public boolean mo49947j(View view, float f, long j, C16685g gVar) {
            view.setTranslationZ(mo49946g(f, j, view, gVar));
            return this.f42101h;
        }
    }

    /* renamed from: h */
    public static C16848f m77381h(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new C16850b(str, sparseArray);
    }

    /* renamed from: i */
    public static C16848f m77382i(String str, long j) {
        C16848f fVar;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(C16881f.f43375i)) {
                    c = 8;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 9;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 10;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                fVar = new C16855g();
                break;
            case 1:
                fVar = new C16856h();
                break;
            case 2:
                fVar = new C16859k();
                break;
            case 3:
                fVar = new C16860l();
                break;
            case 4:
                fVar = new C16861m();
                break;
            case 5:
                fVar = new C16853e();
                break;
            case 6:
                fVar = new C16857i();
                break;
            case 7:
                fVar = new C16858j();
                break;
            case 8:
                fVar = new C16854f();
                break;
            case 9:
                fVar = new C16851c();
                break;
            case 10:
                fVar = new C16852d();
                break;
            case 11:
                fVar = new C16849a();
                break;
            default:
                return null;
        }
        fVar.mo49098d(j);
        return fVar;
    }

    /* renamed from: g */
    public float mo49946g(float f, long j, View view, C16685g gVar) {
        boolean z;
        long j2 = j;
        View view2 = view;
        C16685g gVar2 = gVar;
        this.f42094a.mo48983e((double) f, this.f42100g);
        float[] fArr = this.f42100g;
        float f2 = fArr[1];
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i == 0) {
            this.f42101h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f42103j)) {
            float a = gVar2.mo49016a(view2, this.f42099f, 0);
            this.f42103j = a;
            if (Float.isNaN(a)) {
                this.f42103j = 0.0f;
            }
        }
        float f3 = (float) ((((double) this.f42103j) + ((((double) (j2 - this.f42102i)) * 1.0E-9d) * ((double) f2))) % 1.0d);
        this.f42103j = f3;
        gVar2.mo49017b(view2, this.f42099f, 0, f3);
        this.f42102i = j2;
        float f4 = this.f42100g[0];
        float a2 = (mo49095a(this.f42103j) * f4) + this.f42100g[2];
        if (f4 == 0.0f && i == 0) {
            z = false;
        } else {
            z = true;
        }
        this.f42101h = z;
        return a2;
    }

    /* renamed from: j */
    public abstract boolean mo49947j(View view, float f, long j, C16685g gVar);
}
