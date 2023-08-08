package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.C16677b;
import androidx.constraintlayout.core.motion.utils.C16703o;
import androidx.constraintlayout.motion.widget.C16881f;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.constraintlayout.motion.utils.d */
public abstract class C16831d extends C16703o {

    /* renamed from: g */
    public static final String f43174g = "ViewSpline";

    /* renamed from: androidx.constraintlayout.motion.utils.d$a */
    public static class C16832a extends C16831d {
        /* renamed from: m */
        public void mo49940m(View view, float f) {
            view.setAlpha(mo49071a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$b */
    public static class C16833b extends C16831d {

        /* renamed from: h */
        public String f43175h;

        /* renamed from: i */
        public SparseArray<ConstraintAttribute> f43176i;

        /* renamed from: j */
        public float[] f43177j;

        public C16833b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f43175h = str.split(",")[1];
            this.f43176i = sparseArray;
        }

        /* renamed from: g */
        public void mo49074g(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        /* renamed from: j */
        public void mo49077j(int i) {
            int size = this.f43176i.size();
            int p = this.f43176i.valueAt(0).mo50637p();
            double[] dArr = new double[size];
            this.f43177j = new float[p];
            int[] iArr = new int[2];
            iArr[1] = p;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = ((double) this.f43176i.keyAt(i2)) * 0.01d;
                this.f43176i.valueAt(i2).mo50633l(this.f43177j);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f43177j;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.f42046a = C16677b.m76154a(i, dArr, dArr2);
        }

        /* renamed from: m */
        public void mo49940m(View view, float f) {
            this.f42046a.mo48983e((double) f, this.f43177j);
            C16814a.m77332b(this.f43176i.valueAt(0), view, this.f43177j);
        }

        /* renamed from: n */
        public void mo49941n(int i, ConstraintAttribute constraintAttribute) {
            this.f43176i.append(i, constraintAttribute);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$c */
    public static class C16834c extends C16831d {
        /* renamed from: m */
        public void mo49940m(View view, float f) {
            view.setElevation(mo49071a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$d */
    public static class C16835d extends C16831d {
        /* renamed from: m */
        public void mo49940m(View view, float f) {
        }

        /* renamed from: n */
        public void mo49942n(View view, float f, double d, double d2) {
            view.setRotation(mo49071a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$e */
    public static class C16836e extends C16831d {
        /* renamed from: m */
        public void mo49940m(View view, float f) {
            view.setPivotX(mo49071a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$f */
    public static class C16837f extends C16831d {
        /* renamed from: m */
        public void mo49940m(View view, float f) {
            view.setPivotY(mo49071a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$g */
    public static class C16838g extends C16831d {

        /* renamed from: h */
        public boolean f43178h = false;

        /* renamed from: m */
        public void mo49940m(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo49071a(f));
            } else if (!this.f43178h) {
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f43178h = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo49071a(f))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$h */
    public static class C16839h extends C16831d {
        /* renamed from: m */
        public void mo49940m(View view, float f) {
            view.setRotation(mo49071a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$i */
    public static class C16840i extends C16831d {
        /* renamed from: m */
        public void mo49940m(View view, float f) {
            view.setRotationX(mo49071a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$j */
    public static class C16841j extends C16831d {
        /* renamed from: m */
        public void mo49940m(View view, float f) {
            view.setRotationY(mo49071a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$k */
    public static class C16842k extends C16831d {
        /* renamed from: m */
        public void mo49940m(View view, float f) {
            view.setScaleX(mo49071a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$l */
    public static class C16843l extends C16831d {
        /* renamed from: m */
        public void mo49940m(View view, float f) {
            view.setScaleY(mo49071a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$m */
    public static class C16844m extends C16831d {
        /* renamed from: m */
        public void mo49940m(View view, float f) {
            view.setTranslationX(mo49071a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$n */
    public static class C16845n extends C16831d {
        /* renamed from: m */
        public void mo49940m(View view, float f) {
            view.setTranslationY(mo49071a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.d$o */
    public static class C16846o extends C16831d {
        /* renamed from: m */
        public void mo49940m(View view, float f) {
            view.setTranslationZ(mo49071a(f));
        }
    }

    /* renamed from: k */
    public static C16831d m77356k(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new C16833b(str, sparseArray);
    }

    /* renamed from: l */
    public static C16831d m77357l(String str) {
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
            case -797520672:
                if (str.equals(C16881f.f43386t)) {
                    c = 8;
                    break;
                }
                break;
            case -760884510:
                if (str.equals(C16881f.f43378l)) {
                    c = 9;
                    break;
                }
                break;
            case -760884509:
                if (str.equals(C16881f.f43379m)) {
                    c = 10;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(C16881f.f43375i)) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 12;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 13;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C16840i();
            case 1:
                return new C16841j();
            case 2:
                return new C16844m();
            case 3:
                return new C16845n();
            case 4:
                return new C16846o();
            case 5:
                return new C16838g();
            case 6:
                return new C16842k();
            case 7:
                return new C16843l();
            case 8:
                return new C16832a();
            case 9:
                return new C16836e();
            case 10:
                return new C16837f();
            case 11:
                return new C16839h();
            case 12:
                return new C16834c();
            case 13:
                return new C16835d();
            case 14:
                return new C16832a();
            case 15:
                return new C16832a();
            default:
                return null;
        }
    }

    /* renamed from: m */
    public abstract void mo49940m(View view, float f);
}
