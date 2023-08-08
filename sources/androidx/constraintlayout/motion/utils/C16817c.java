package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.C16686h;
import androidx.constraintlayout.motion.widget.C16881f;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.constraintlayout.motion.utils.c */
public abstract class C16817c extends C16686h {

    /* renamed from: i */
    public static final String f43170i = "ViewOscillator";

    /* renamed from: androidx.constraintlayout.motion.utils.c$a */
    public static class C16818a extends C16817c {
        /* renamed from: m */
        public void mo49938m(View view, float f) {
            view.setAlpha(mo49018a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.c$b */
    public static class C16819b extends C16817c {

        /* renamed from: j */
        public float[] f43171j = new float[1];

        /* renamed from: k */
        public ConstraintAttribute f43172k;

        /* renamed from: e */
        public void mo49021e(Object obj) {
            this.f43172k = (ConstraintAttribute) obj;
        }

        /* renamed from: m */
        public void mo49938m(View view, float f) {
            this.f43171j[0] = mo49018a(f);
            C16814a.m77332b(this.f43172k, view, this.f43171j);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.c$c */
    public static class C16820c extends C16817c {
        /* renamed from: m */
        public void mo49938m(View view, float f) {
            view.setElevation(mo49018a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.c$d */
    public static class C16821d extends C16817c {
        /* renamed from: m */
        public void mo49938m(View view, float f) {
        }

        /* renamed from: n */
        public void mo49939n(View view, float f, double d, double d2) {
            view.setRotation(mo49018a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.c$e */
    public static class C16822e extends C16817c {

        /* renamed from: j */
        public boolean f43173j = false;

        /* renamed from: m */
        public void mo49938m(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo49018a(f));
            } else if (!this.f43173j) {
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f43173j = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo49018a(f))});
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.c$f */
    public static class C16823f extends C16817c {
        /* renamed from: m */
        public void mo49938m(View view, float f) {
            view.setRotation(mo49018a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.c$g */
    public static class C16824g extends C16817c {
        /* renamed from: m */
        public void mo49938m(View view, float f) {
            view.setRotationX(mo49018a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.c$h */
    public static class C16825h extends C16817c {
        /* renamed from: m */
        public void mo49938m(View view, float f) {
            view.setRotationY(mo49018a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.c$i */
    public static class C16826i extends C16817c {
        /* renamed from: m */
        public void mo49938m(View view, float f) {
            view.setScaleX(mo49018a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.c$j */
    public static class C16827j extends C16817c {
        /* renamed from: m */
        public void mo49938m(View view, float f) {
            view.setScaleY(mo49018a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.c$k */
    public static class C16828k extends C16817c {
        /* renamed from: m */
        public void mo49938m(View view, float f) {
            view.setTranslationX(mo49018a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.c$l */
    public static class C16829l extends C16817c {
        /* renamed from: m */
        public void mo49938m(View view, float f) {
            view.setTranslationY(mo49018a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.utils.c$m */
    public static class C16830m extends C16817c {
        /* renamed from: m */
        public void mo49938m(View view, float f) {
            view.setTranslationZ(mo49018a(f));
        }
    }

    /* renamed from: l */
    public static C16817c m77339l(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C16819b();
        }
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
            case -40300674:
                if (str.equals(C16881f.f43375i)) {
                    c = 9;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 10;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 12;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C16824g();
            case 1:
                return new C16825h();
            case 2:
                return new C16828k();
            case 3:
                return new C16829l();
            case 4:
                return new C16830m();
            case 5:
                return new C16822e();
            case 6:
                return new C16826i();
            case 7:
                return new C16827j();
            case 8:
                return new C16818a();
            case 9:
                return new C16823f();
            case 10:
                return new C16820c();
            case 11:
                return new C16821d();
            case 12:
                return new C16818a();
            case 13:
                return new C16818a();
            default:
                return null;
        }
    }

    /* renamed from: m */
    public abstract void mo49938m(View view, float f);
}
