package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.util.C18001r;

/* renamed from: androidx.core.view.u */
public final class C18378u {

    /* renamed from: a */
    public static final int f47062a = 3840;

    /* renamed from: b */
    public static final int f47063b = 2160;

    @C0376v0(17)
    /* renamed from: androidx.core.view.u$a */
    public static class C18379a {
        /* renamed from: a */
        public static void m83162a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    @C0376v0(23)
    /* renamed from: androidx.core.view.u$b */
    public static class C18380b {
        @C0359n0
        /* renamed from: a */
        public static C18381c m83163a(@C0359n0 Context context, @C0359n0 Display display) {
            Display.Mode mode = display.getMode();
            Point a = C18378u.m83152a(context, display);
            if (a == null || m83166d(mode, a)) {
                return new C18381c(mode, true);
            }
            return new C18381c(mode, a);
        }

        @SuppressLint({"ArrayReturn"})
        @C0359n0
        /* renamed from: b */
        public static C18381c[] m83164b(@C0359n0 Context context, @C0359n0 Display display) {
            C18381c cVar;
            Display.Mode[] supportedModes = display.getSupportedModes();
            C18381c[] cVarArr = new C18381c[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point a = C18378u.m83152a(context, display);
            if (a == null || m83166d(mode, a)) {
                for (int i = 0; i < supportedModes.length; i++) {
                    cVarArr[i] = new C18381c(supportedModes[i], m83167e(supportedModes[i], mode));
                }
            } else {
                for (int i2 = 0; i2 < supportedModes.length; i2++) {
                    if (m83167e(supportedModes[i2], mode)) {
                        cVar = new C18381c(supportedModes[i2], a);
                    } else {
                        cVar = new C18381c(supportedModes[i2], false);
                    }
                    cVarArr[i2] = cVar;
                }
            }
            return cVarArr;
        }

        /* renamed from: c */
        public static boolean m83165c(@C0359n0 Display display) {
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: d */
        public static boolean m83166d(Display.Mode mode, Point point) {
            if ((mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x)) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public static boolean m83167e(Display.Mode mode, Display.Mode mode2) {
            if (mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static Point m83152a(@C0359n0 Context context, @C0359n0 Display display) {
        Point point;
        if (Build.VERSION.SDK_INT < 28) {
            point = m83161j("sys.display-size", display);
        } else {
            point = m83161j("vendor.display-size", display);
        }
        if (point != null) {
            return point;
        }
        if (!m83158g(context) || !m83157f(display)) {
            return null;
        }
        return new Point(f47062a, f47063b);
    }

    @C0359n0
    /* renamed from: b */
    public static Point m83153b(@C0359n0 Context context, @C0359n0 Display display) {
        Point a = m83152a(context, display);
        if (a != null) {
            return a;
        }
        Point point = new Point();
        C18379a.m83162a(display, point);
        return point;
    }

    @C0359n0
    /* renamed from: c */
    public static C18381c m83154c(@C0359n0 Context context, @C0359n0 Display display) {
        return C18380b.m83163a(context, display);
    }

    @SuppressLint({"ArrayReturn"})
    @C0359n0
    /* renamed from: d */
    public static C18381c[] m83155d(@C0359n0 Context context, @C0359n0 Display display) {
        return C18380b.m83164b(context, display);
    }

    @C0363p0
    /* renamed from: e */
    public static String m83156e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m83157f(@C0359n0 Display display) {
        return C18380b.m83165c(display);
    }

    /* renamed from: g */
    public static boolean m83158g(@C0359n0 Context context) {
        if (!m83159h(context) || !"Sony".equals(Build.MANUFACTURER) || !Build.MODEL.startsWith("BRAVIA") || !context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m83159h(@C0359n0 Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static Point m83160i(@C0359n0 String str) throws NumberFormatException {
        String[] split = str.trim().split("x", -1);
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new Point(parseInt, parseInt2);
            }
        }
        throw new NumberFormatException();
    }

    @C0363p0
    /* renamed from: j */
    public static Point m83161j(@C0359n0 String str, @C0359n0 Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String e = m83156e(str);
        if (!TextUtils.isEmpty(e) && e != null) {
            try {
                return m83160i(e);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: androidx.core.view.u$c */
    public static final class C18381c {

        /* renamed from: a */
        public final Display.Mode f47064a;

        /* renamed from: b */
        public final Point f47065b;

        /* renamed from: c */
        public final boolean f47066c;

        @C0376v0(23)
        /* renamed from: androidx.core.view.u$c$a */
        public static class C18382a {
            @C0373u
            /* renamed from: a */
            public static int m83172a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @C0373u
            /* renamed from: b */
            public static int m83173b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        public C18381c(@C0359n0 Point point) {
            C18001r.m81776m(point, "physicalSize == null");
            this.f47065b = point;
            this.f47064a = null;
            this.f47066c = true;
        }

        /* renamed from: a */
        public int mo53034a() {
            return this.f47065b.y;
        }

        /* renamed from: b */
        public int mo53035b() {
            return this.f47065b.x;
        }

        @Deprecated
        /* renamed from: c */
        public boolean mo53036c() {
            return this.f47066c;
        }

        @C0363p0
        @C0376v0(23)
        /* renamed from: d */
        public Display.Mode mo53037d() {
            return this.f47064a;
        }

        @C0376v0(23)
        public C18381c(@C0359n0 Display.Mode mode, boolean z) {
            C18001r.m81776m(mode, "mode == null, can't wrap a null reference");
            this.f47065b = new Point(C18382a.m83173b(mode), C18382a.m83172a(mode));
            this.f47064a = mode;
            this.f47066c = z;
        }

        @C0376v0(23)
        public C18381c(@C0359n0 Display.Mode mode, @C0359n0 Point point) {
            C18001r.m81776m(mode, "mode == null, can't wrap a null reference");
            C18001r.m81776m(point, "physicalSize == null");
            this.f47065b = point;
            this.f47064a = mode;
            this.f47066c = true;
        }
    }
}
