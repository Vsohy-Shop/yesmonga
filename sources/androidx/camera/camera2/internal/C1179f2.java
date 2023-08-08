package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.util.Rational;
import android.util.Size;
import android.view.WindowManager;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.camera2.internal.compat.C1073h;
import androidx.camera.camera2.internal.compat.C1127q;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.workaround.C1158c;
import androidx.camera.camera2.internal.compat.workaround.C1163h;
import androidx.camera.core.C1417i2;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.C1463i1;
import androidx.camera.core.impl.C1467j1;
import androidx.camera.core.impl.C1488o1;
import androidx.camera.core.impl.C1491p0;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.utils.C1515c;
import androidx.core.util.C18001r;
import androidx.core.view.C18378u;
import com.contentsquare.android.api.C14092c;
import com.google.maps.android.heatmaps.C33876b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.camera2.internal.f2 */
public final class C1179f2 {

    /* renamed from: n */
    public static final String f3394n = "SupportedSurfaceCombination";

    /* renamed from: o */
    public static final Size f3395o = new Size(1920, 1080);

    /* renamed from: p */
    public static final Size f3396p = new Size(640, C14092c.f34573Y0);

    /* renamed from: q */
    public static final Size f3397q = new Size(0, 0);

    /* renamed from: r */
    public static final Size f3398r = new Size(C18378u.f47062a, C18378u.f47063b);

    /* renamed from: s */
    public static final Size f3399s = new Size(1920, 1080);

    /* renamed from: t */
    public static final Size f3400t = new Size(C33876b.f82189s, 720);

    /* renamed from: u */
    public static final Size f3401u = new Size(720, C14092c.f34573Y0);

    /* renamed from: v */
    public static final int f3402v = 16;

    /* renamed from: w */
    public static final Rational f3403w = new Rational(4, 3);

    /* renamed from: x */
    public static final Rational f3404x = new Rational(3, 4);

    /* renamed from: y */
    public static final Rational f3405y = new Rational(16, 9);

    /* renamed from: z */
    public static final Rational f3406z = new Rational(9, 16);

    /* renamed from: a */
    public final List<C1463i1> f3407a = new ArrayList();

    /* renamed from: b */
    public final Map<Integer, Size> f3408b = new HashMap();

    /* renamed from: c */
    public final String f3409c;

    /* renamed from: d */
    public final C1170e f3410d;

    /* renamed from: e */
    public final C1073h f3411e;

    /* renamed from: f */
    public final C1158c f3412f;

    /* renamed from: g */
    public final int f3413g;

    /* renamed from: h */
    public final boolean f3414h;

    /* renamed from: i */
    public final Map<Integer, List<Size>> f3415i = new HashMap();

    /* renamed from: j */
    public boolean f3416j = false;

    /* renamed from: k */
    public boolean f3417k = false;

    /* renamed from: l */
    public C1467j1 f3418l;

    /* renamed from: m */
    public Map<Integer, Size[]> f3419m = new HashMap();

    /* renamed from: androidx.camera.camera2.internal.f2$a */
    public static final class C1180a implements Comparator<Rational> {

        /* renamed from: a */
        public Rational f3420a;

        public C1180a(Rational rational) {
            this.f3420a = rational;
        }

        /* renamed from: a */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            return (int) Math.signum(Float.valueOf(Math.abs(rational.floatValue() - this.f3420a.floatValue())).floatValue() - Float.valueOf(Math.abs(rational2.floatValue() - this.f3420a.floatValue())).floatValue());
        }
    }

    public C1179f2(@C0359n0 Context context, @C0359n0 String str, @C0359n0 C1127q qVar, @C0359n0 C1170e eVar) throws CameraUnavailableException {
        int i;
        String str2 = (String) C18001r.m81775l(str);
        this.f3409c = str2;
        this.f3410d = (C1170e) C18001r.m81775l(eVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f3412f = new C1158c(str);
        try {
            C1073h d = qVar.mo4410d(str2);
            this.f3411e = d;
            Integer num = (Integer) d.mo4323a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 2;
            }
            this.f3413g = i;
            this.f3414h = mo4478K();
            mo4488h();
            mo4489i(windowManager);
            mo4481a();
        } catch (CameraAccessExceptionCompat e) {
            throw C1172e1.m4889a(e);
        }
    }

    /* renamed from: F */
    public static boolean m4909F(Size size, Rational rational) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (m4912l(size) >= m4912l(f3396p)) {
            return m4910H(size, rational);
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m4910H(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i = width % 16;
        if (i == 0 && height % 16 == 0) {
            if (m4911L(Math.max(0, height - 16), width, rational) || m4911L(Math.max(0, width - 16), height, rational2)) {
                return true;
            }
            return false;
        } else if (i == 0) {
            return m4911L(height, width, rational);
        } else {
            if (height % 16 == 0) {
                return m4911L(width, height, rational2);
            }
            return false;
        }
    }

    /* renamed from: L */
    public static boolean m4911L(int i, int i2, Rational rational) {
        boolean z;
        if (i2 % 16 == 0) {
            z = true;
        } else {
            z = false;
        }
        C18001r.m81764a(z);
        double numerator = ((double) (i * rational.getNumerator())) / ((double) rational.getDenominator());
        if (numerator <= ((double) Math.max(0, i2 - 16)) || numerator >= ((double) (i2 + 16))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static int m4912l(Size size) {
        return size.getWidth() * size.getHeight();
    }

    @C0359n0
    /* renamed from: u */
    public static Size m4913u(@C0359n0 WindowManager windowManager) {
        Size size;
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        return (Size) Collections.min(Arrays.asList(new Size[]{new Size(size.getWidth(), size.getHeight()), f3395o}), new C1181b());
    }

    /* renamed from: A */
    public C1467j1 mo4470A() {
        return this.f3418l;
    }

    /* renamed from: B */
    public final Rational mo4471B(@C0359n0 C1491p0 p0Var) {
        Rational rational;
        int a = new C1163h().mo4445a(p0Var, this.f3409c, this.f3411e);
        if (a != 0) {
            if (a != 1) {
                if (a == 2) {
                    Size f = mo4486f(256);
                    return new Rational(f.getWidth(), f.getHeight());
                } else if (a != 3) {
                    return null;
                } else {
                    Size C = mo4472C(p0Var);
                    if (p0Var.mo5290A()) {
                        int D = p0Var.mo5291D();
                        if (D != 0) {
                            if (D != 1) {
                                C1417i2.m5913c(f3394n, "Undefined target aspect ratio: " + D);
                                return null;
                            } else if (this.f3414h) {
                                rational = f3405y;
                            } else {
                                rational = f3406z;
                            }
                        } else if (this.f3414h) {
                            rational = f3403w;
                        } else {
                            rational = f3404x;
                        }
                    } else if (C != null) {
                        return new Rational(C.getWidth(), C.getHeight());
                    } else {
                        return null;
                    }
                }
            } else if (this.f3414h) {
                rational = f3405y;
            } else {
                rational = f3406z;
            }
        } else if (this.f3414h) {
            rational = f3403w;
        } else {
            rational = f3404x;
        }
        return rational;
    }

    @C0363p0
    /* renamed from: C */
    public final Size mo4472C(@C0359n0 C1491p0 p0Var) {
        return mo4487g(p0Var.mo5295N((Size) null), p0Var.mo5293F(0));
    }

    /* renamed from: D */
    public final List<Integer> mo4473D(List<C1488o1<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (C1488o1<?> C : list) {
            int C2 = C.mo5278C(0);
            if (!arrayList2.contains(Integer.valueOf(C2))) {
                arrayList2.add(Integer.valueOf(C2));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        for (Integer intValue : arrayList2) {
            int intValue2 = intValue.intValue();
            for (C1488o1 next : list) {
                if (intValue2 == next.mo5278C(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(next)));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: E */
    public final Map<Rational, List<Size>> mo4474E(List<Size> list) {
        HashMap hashMap = new HashMap();
        hashMap.put(f3403w, new ArrayList());
        hashMap.put(f3405y, new ArrayList());
        for (Size next : list) {
            Rational rational = null;
            for (Rational rational2 : hashMap.keySet()) {
                if (m4909F(next, rational2)) {
                    List list2 = (List) hashMap.get(rational2);
                    if (!list2.contains(next)) {
                        list2.add(next);
                    }
                    rational = rational2;
                }
            }
            if (rational == null) {
                hashMap.put(new Rational(next.getWidth(), next.getHeight()), new ArrayList(Collections.singleton(next)));
            }
        }
        return hashMap;
    }

    /* renamed from: G */
    public boolean mo4475G() {
        return this.f3417k;
    }

    /* renamed from: I */
    public boolean mo4476I() {
        return this.f3416j;
    }

    /* renamed from: J */
    public final boolean mo4477J(int i) {
        boolean z;
        Integer num = (Integer) this.f3411e.mo4323a(CameraCharacteristics.SENSOR_ORIENTATION);
        C18001r.m81776m(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
        int c = C1515c.m6375c(i);
        Integer num2 = (Integer) this.f3411e.mo4323a(CameraCharacteristics.LENS_FACING);
        C18001r.m81776m(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
        if (1 == num2.intValue()) {
            z = true;
        } else {
            z = false;
        }
        int b = C1515c.m6374b(c, num.intValue(), z);
        if (b == 90 || b == 270) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final boolean mo4478K() {
        Size size = (Size) this.f3411e.mo4323a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        if (size == null || size.getWidth() >= size.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public final void mo4479M(List<Size> list, Size size) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int i = -1;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                int i4 = i;
                i = i3;
                if (i >= list.size()) {
                    break;
                }
                Size size2 = list.get(i);
                if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                    break;
                }
                if (i4 >= 0) {
                    arrayList.add(list.get(i4));
                }
                i2 = i + 1;
            }
            list.removeAll(arrayList);
        }
    }

    /* renamed from: N */
    public SurfaceConfig mo4480N(int i, Size size) {
        SurfaceConfig.ConfigType configType;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.NOT_SUPPORT;
        if (i == 35) {
            configType = SurfaceConfig.ConfigType.YUV;
        } else if (i == 256) {
            configType = SurfaceConfig.ConfigType.JPEG;
        } else if (i == 32) {
            configType = SurfaceConfig.ConfigType.RAW;
        } else {
            configType = SurfaceConfig.ConfigType.PRIV;
        }
        Size f = mo4486f(i);
        if (size.getWidth() * size.getHeight() <= this.f3418l.mo5211b().getWidth() * this.f3418l.mo5211b().getHeight()) {
            configSize = SurfaceConfig.ConfigSize.ANALYSIS;
        } else if (size.getWidth() * size.getHeight() <= this.f3418l.mo5212c().getWidth() * this.f3418l.mo5212c().getHeight()) {
            configSize = SurfaceConfig.ConfigSize.PREVIEW;
        } else if (size.getWidth() * size.getHeight() <= this.f3418l.mo5213d().getWidth() * this.f3418l.mo5213d().getHeight()) {
            configSize = SurfaceConfig.ConfigSize.RECORD;
        } else if (size.getWidth() * size.getHeight() <= f.getWidth() * f.getHeight()) {
            configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        }
        return SurfaceConfig.m6034a(configType, configSize);
    }

    /* renamed from: a */
    public final void mo4481a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0007 A[LOOP:0: B:1:0x0007->B:4:0x0017, LOOP_START, PHI: r1 
      PHI: (r1v1 boolean) = (r1v0 boolean), (r1v5 boolean) binds: [B:0:0x0000, B:4:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4482b(java.util.List<androidx.camera.core.impl.SurfaceConfig> r4) {
        /*
            r3 = this;
            java.util.List<androidx.camera.core.impl.i1> r0 = r3.f3407a
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0007:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.i1 r1 = (androidx.camera.core.impl.C1463i1) r1
            boolean r1 = r1.mo5228e(r4)
            if (r1 == 0) goto L_0x0007
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C1179f2.mo4482b(java.util.List):boolean");
    }

    @C0359n0
    /* renamed from: c */
    public final Size[] mo4483c(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f3411e.mo4323a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(i);
            if (outputSizes != null) {
                Size[] d = mo4484d(outputSizes, i);
                Arrays.sort(d, new C1181b(true));
                return d;
            }
            throw new IllegalArgumentException("Can not get supported output size for the format: " + i);
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    @C0359n0
    /* renamed from: d */
    public final Size[] mo4484d(@C0359n0 Size[] sizeArr, int i) {
        List<Size> e = mo4485e(i);
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        arrayList.removeAll(e);
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    @C0359n0
    /* renamed from: e */
    public final List<Size> mo4485e(int i) {
        List<Size> list = this.f3415i.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        List<Size> a = this.f3412f.mo4442a(i);
        this.f3415i.put(Integer.valueOf(i), a);
        return a;
    }

    /* renamed from: f */
    public final Size mo4486f(int i) {
        Size size = this.f3408b.get(Integer.valueOf(i));
        if (size != null) {
            return size;
        }
        Size t = mo4499t(i);
        this.f3408b.put(Integer.valueOf(i), t);
        return t;
    }

    @C0363p0
    /* renamed from: g */
    public final Size mo4487g(@C0363p0 Size size, int i) {
        if (size == null || !mo4477J(i)) {
            return size;
        }
        return new Size(size.getHeight(), size.getWidth());
    }

    /* renamed from: h */
    public final void mo4488h() {
        this.f3407a.addAll(mo4496q());
        int i = this.f3413g;
        if (i == 0 || i == 1 || i == 3) {
            this.f3407a.addAll(mo4498s());
        }
        int i2 = this.f3413g;
        if (i2 == 1 || i2 == 3) {
            this.f3407a.addAll(mo4495p());
        }
        int[] iArr = (int[]) this.f3411e.mo4323a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i3 : iArr) {
                if (i3 == 3) {
                    this.f3416j = true;
                } else if (i3 == 6) {
                    this.f3417k = true;
                }
            }
        }
        if (this.f3416j) {
            this.f3407a.addAll(mo4500v());
        }
        if (this.f3417k && this.f3413g == 0) {
            this.f3407a.addAll(mo4492m());
        }
        if (this.f3413g == 3) {
            this.f3407a.addAll(mo4497r());
        }
    }

    /* renamed from: i */
    public final void mo4489i(WindowManager windowManager) {
        this.f3418l = C1467j1.m6152a(new Size(640, C14092c.f34573Y0), m4913u(windowManager), mo4501w());
    }

    @C0359n0
    /* renamed from: j */
    public final Size[] mo4490j(int i) {
        Size[] sizeArr = this.f3419m.get(Integer.valueOf(i));
        if (sizeArr != null) {
            return sizeArr;
        }
        Size[] c = mo4483c(i);
        this.f3419m.put(Integer.valueOf(i), c);
        return c;
    }

    /* renamed from: k */
    public final List<List<Size>> mo4491k(List<List<Size>> list) {
        int i = 1;
        for (List<Size> size : list) {
            i *= size.size();
        }
        if (i != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new ArrayList());
            }
            int size2 = i / list.get(0).size();
            int i3 = i;
            for (int i4 = 0; i4 < list.size(); i4++) {
                List list2 = list.get(i4);
                for (int i5 = 0; i5 < i; i5++) {
                    ((List) arrayList.get(i5)).add((Size) list2.get((i5 % i3) / size2));
                }
                if (i4 < list.size() - 1) {
                    i3 = size2;
                    size2 /= list.get(i4 + 1).size();
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    /* renamed from: m */
    public List<C1463i1> mo4492m() {
        ArrayList arrayList = new ArrayList();
        C1463i1 i1Var = new C1463i1();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        i1Var.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        i1Var.mo5225a(SurfaceConfig.m6034a(configType, configSize2));
        arrayList.add(i1Var);
        C1463i1 i1Var2 = new C1463i1();
        i1Var2.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        i1Var2.mo5225a(SurfaceConfig.m6034a(configType2, configSize2));
        arrayList.add(i1Var2);
        C1463i1 i1Var3 = new C1463i1();
        i1Var3.mo5225a(SurfaceConfig.m6034a(configType2, configSize));
        i1Var3.mo5225a(SurfaceConfig.m6034a(configType2, configSize2));
        arrayList.add(i1Var3);
        return arrayList;
    }

    /* renamed from: n */
    public String mo4493n() {
        return this.f3409c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.util.Size[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.C0363p0
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Size[] mo4494o(int r4, @androidx.annotation.C0359n0 androidx.camera.core.impl.C1491p0 r5) {
        /*
            r3 = this;
            r0 = 0
            java.util.List r5 = r5.mo5297m(r0)
            if (r5 == 0) goto L_0x0026
            java.util.Iterator r5 = r5.iterator()
        L_0x000b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r5.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x000b
            java.lang.Object r5 = r1.second
            r0 = r5
            android.util.Size[] r0 = (android.util.Size[]) r0
        L_0x0026:
            if (r0 == 0) goto L_0x0035
            android.util.Size[] r0 = r3.mo4484d(r0, r4)
            androidx.camera.camera2.internal.f2$b r4 = new androidx.camera.camera2.internal.f2$b
            r5 = 1
            r4.<init>(r5)
            java.util.Arrays.sort(r0, r4)
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C1179f2.mo4494o(int, androidx.camera.core.impl.p0):android.util.Size[]");
    }

    /* renamed from: p */
    public List<C1463i1> mo4495p() {
        ArrayList arrayList = new ArrayList();
        C1463i1 i1Var = new C1463i1();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        i1Var.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        i1Var.mo5225a(SurfaceConfig.m6034a(configType, configSize2));
        arrayList.add(i1Var);
        C1463i1 i1Var2 = new C1463i1();
        i1Var2.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        i1Var2.mo5225a(SurfaceConfig.m6034a(configType2, configSize2));
        arrayList.add(i1Var2);
        C1463i1 i1Var3 = new C1463i1();
        i1Var3.mo5225a(SurfaceConfig.m6034a(configType2, configSize));
        i1Var3.mo5225a(SurfaceConfig.m6034a(configType2, configSize2));
        arrayList.add(i1Var3);
        C1463i1 i1Var4 = new C1463i1();
        i1Var4.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        i1Var4.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        i1Var4.mo5225a(SurfaceConfig.m6034a(SurfaceConfig.ConfigType.JPEG, configSize2));
        arrayList.add(i1Var4);
        C1463i1 i1Var5 = new C1463i1();
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.ANALYSIS;
        i1Var5.mo5225a(SurfaceConfig.m6034a(configType2, configSize3));
        i1Var5.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        i1Var5.mo5225a(SurfaceConfig.m6034a(configType2, configSize2));
        arrayList.add(i1Var5);
        C1463i1 i1Var6 = new C1463i1();
        i1Var6.mo5225a(SurfaceConfig.m6034a(configType2, configSize3));
        i1Var6.mo5225a(SurfaceConfig.m6034a(configType2, configSize));
        i1Var6.mo5225a(SurfaceConfig.m6034a(configType2, configSize2));
        arrayList.add(i1Var6);
        return arrayList;
    }

    /* renamed from: q */
    public List<C1463i1> mo4496q() {
        ArrayList arrayList = new ArrayList();
        C1463i1 i1Var = new C1463i1();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        i1Var.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        arrayList.add(i1Var);
        C1463i1 i1Var2 = new C1463i1();
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.JPEG;
        i1Var2.mo5225a(SurfaceConfig.m6034a(configType2, configSize));
        arrayList.add(i1Var2);
        C1463i1 i1Var3 = new C1463i1();
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        i1Var3.mo5225a(SurfaceConfig.m6034a(configType3, configSize));
        arrayList.add(i1Var3);
        C1463i1 i1Var4 = new C1463i1();
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        i1Var4.mo5225a(SurfaceConfig.m6034a(configType, configSize2));
        i1Var4.mo5225a(SurfaceConfig.m6034a(configType2, configSize));
        arrayList.add(i1Var4);
        C1463i1 i1Var5 = new C1463i1();
        i1Var5.mo5225a(SurfaceConfig.m6034a(configType3, configSize2));
        i1Var5.mo5225a(SurfaceConfig.m6034a(configType2, configSize));
        arrayList.add(i1Var5);
        C1463i1 i1Var6 = new C1463i1();
        i1Var6.mo5225a(SurfaceConfig.m6034a(configType, configSize2));
        i1Var6.mo5225a(SurfaceConfig.m6034a(configType, configSize2));
        arrayList.add(i1Var6);
        C1463i1 i1Var7 = new C1463i1();
        i1Var7.mo5225a(SurfaceConfig.m6034a(configType, configSize2));
        i1Var7.mo5225a(SurfaceConfig.m6034a(configType3, configSize2));
        arrayList.add(i1Var7);
        C1463i1 i1Var8 = new C1463i1();
        i1Var8.mo5225a(SurfaceConfig.m6034a(configType, configSize2));
        i1Var8.mo5225a(SurfaceConfig.m6034a(configType3, configSize2));
        i1Var8.mo5225a(SurfaceConfig.m6034a(configType2, configSize));
        arrayList.add(i1Var8);
        return arrayList;
    }

    /* renamed from: r */
    public List<C1463i1> mo4497r() {
        ArrayList arrayList = new ArrayList();
        C1463i1 i1Var = new C1463i1();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        i1Var.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.ANALYSIS;
        i1Var.mo5225a(SurfaceConfig.m6034a(configType, configSize2));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        i1Var.mo5225a(SurfaceConfig.m6034a(configType2, configSize3));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.RAW;
        i1Var.mo5225a(SurfaceConfig.m6034a(configType3, configSize3));
        arrayList.add(i1Var);
        C1463i1 i1Var2 = new C1463i1();
        i1Var2.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        i1Var2.mo5225a(SurfaceConfig.m6034a(configType, configSize2));
        i1Var2.mo5225a(SurfaceConfig.m6034a(SurfaceConfig.ConfigType.JPEG, configSize3));
        i1Var2.mo5225a(SurfaceConfig.m6034a(configType3, configSize3));
        arrayList.add(i1Var2);
        return arrayList;
    }

    /* renamed from: s */
    public List<C1463i1> mo4498s() {
        ArrayList arrayList = new ArrayList();
        C1463i1 i1Var = new C1463i1();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        i1Var.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.RECORD;
        i1Var.mo5225a(SurfaceConfig.m6034a(configType, configSize2));
        arrayList.add(i1Var);
        C1463i1 i1Var2 = new C1463i1();
        i1Var2.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        i1Var2.mo5225a(SurfaceConfig.m6034a(configType2, configSize2));
        arrayList.add(i1Var2);
        C1463i1 i1Var3 = new C1463i1();
        i1Var3.mo5225a(SurfaceConfig.m6034a(configType2, configSize));
        i1Var3.mo5225a(SurfaceConfig.m6034a(configType2, configSize2));
        arrayList.add(i1Var3);
        C1463i1 i1Var4 = new C1463i1();
        i1Var4.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        i1Var4.mo5225a(SurfaceConfig.m6034a(configType, configSize2));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        i1Var4.mo5225a(SurfaceConfig.m6034a(configType3, configSize2));
        arrayList.add(i1Var4);
        C1463i1 i1Var5 = new C1463i1();
        i1Var5.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        i1Var5.mo5225a(SurfaceConfig.m6034a(configType2, configSize2));
        i1Var5.mo5225a(SurfaceConfig.m6034a(configType3, configSize2));
        arrayList.add(i1Var5);
        C1463i1 i1Var6 = new C1463i1();
        i1Var6.mo5225a(SurfaceConfig.m6034a(configType2, configSize));
        i1Var6.mo5225a(SurfaceConfig.m6034a(configType2, configSize));
        i1Var6.mo5225a(SurfaceConfig.m6034a(configType3, SurfaceConfig.ConfigSize.MAXIMUM));
        arrayList.add(i1Var6);
        return arrayList;
    }

    /* renamed from: t */
    public Size mo4499t(int i) {
        return (Size) Collections.max(Arrays.asList(mo4490j(i)), new C1181b());
    }

    /* renamed from: v */
    public List<C1463i1> mo4500v() {
        ArrayList arrayList = new ArrayList();
        C1463i1 i1Var = new C1463i1();
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.RAW;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        i1Var.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        arrayList.add(i1Var);
        C1463i1 i1Var2 = new C1463i1();
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        i1Var2.mo5225a(SurfaceConfig.m6034a(configType2, configSize2));
        i1Var2.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        arrayList.add(i1Var2);
        C1463i1 i1Var3 = new C1463i1();
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        i1Var3.mo5225a(SurfaceConfig.m6034a(configType3, configSize2));
        i1Var3.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        arrayList.add(i1Var3);
        C1463i1 i1Var4 = new C1463i1();
        i1Var4.mo5225a(SurfaceConfig.m6034a(configType2, configSize2));
        i1Var4.mo5225a(SurfaceConfig.m6034a(configType2, configSize2));
        i1Var4.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        arrayList.add(i1Var4);
        C1463i1 i1Var5 = new C1463i1();
        i1Var5.mo5225a(SurfaceConfig.m6034a(configType2, configSize2));
        i1Var5.mo5225a(SurfaceConfig.m6034a(configType3, configSize2));
        i1Var5.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        arrayList.add(i1Var5);
        C1463i1 i1Var6 = new C1463i1();
        i1Var6.mo5225a(SurfaceConfig.m6034a(configType3, configSize2));
        i1Var6.mo5225a(SurfaceConfig.m6034a(configType3, configSize2));
        i1Var6.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        arrayList.add(i1Var6);
        C1463i1 i1Var7 = new C1463i1();
        i1Var7.mo5225a(SurfaceConfig.m6034a(configType2, configSize2));
        SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.JPEG;
        i1Var7.mo5225a(SurfaceConfig.m6034a(configType4, configSize));
        i1Var7.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        arrayList.add(i1Var7);
        C1463i1 i1Var8 = new C1463i1();
        i1Var8.mo5225a(SurfaceConfig.m6034a(configType3, configSize2));
        i1Var8.mo5225a(SurfaceConfig.m6034a(configType4, configSize));
        i1Var8.mo5225a(SurfaceConfig.m6034a(configType, configSize));
        arrayList.add(i1Var8);
        return arrayList;
    }

    @C0359n0
    /* renamed from: w */
    public final Size mo4501w() {
        Size size = f3401u;
        try {
            int parseInt = Integer.parseInt(this.f3409c);
            if (this.f3410d.mo4451a(parseInt, 8)) {
                return f3398r;
            }
            if (this.f3410d.mo4451a(parseInt, 6)) {
                return f3399s;
            }
            if (this.f3410d.mo4451a(parseInt, 5)) {
                return f3400t;
            }
            boolean a = this.f3410d.mo4451a(parseInt, 4);
            return size;
        } catch (NumberFormatException unused) {
            return mo4502x();
        }
    }

    @C0359n0
    /* renamed from: x */
    public final Size mo4502x() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f3411e.mo4323a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                return f3401u;
            }
            Arrays.sort(outputSizes, new C1181b(true));
            for (Size size : outputSizes) {
                int width = size.getWidth();
                Size size2 = f3399s;
                if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                    return size;
                }
            }
            return f3401u;
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    /* renamed from: y */
    public Map<C1488o1<?>, Size> mo4503y(List<SurfaceConfig> list, List<C1488o1<?>> list2) {
        HashMap hashMap = new HashMap();
        List<Integer> D = mo4473D(list2);
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : D) {
            arrayList.add(mo4504z(list2.get(intValue.intValue())));
        }
        Iterator<List<Size>> it = mo4491k(arrayList).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            List next = it.next();
            ArrayList arrayList2 = new ArrayList(list);
            for (int i = 0; i < next.size(); i++) {
                arrayList2.add(mo4480N(list2.get(D.get(i).intValue()).mo5210o(), (Size) next.get(i)));
            }
            if (mo4482b(arrayList2)) {
                for (C1488o1 next2 : list2) {
                    hashMap.put(next2, (Size) next.get(D.indexOf(Integer.valueOf(list2.indexOf(next2)))));
                }
            }
        }
        return hashMap;
    }

    @C0344h1
    @C0359n0
    /* renamed from: z */
    public List<Size> mo4504z(@C0359n0 C1488o1<?> o1Var) {
        int o = o1Var.mo5210o();
        C1491p0 p0Var = (C1491p0) o1Var;
        Size[] o2 = mo4494o(o, p0Var);
        if (o2 == null) {
            o2 = mo4490j(o);
        }
        ArrayList arrayList = new ArrayList();
        Size j = p0Var.mo5296j((Size) null);
        Size t = mo4499t(o);
        if (j == null || m4912l(t) < m4912l(j)) {
            j = t;
        }
        Arrays.sort(o2, new C1181b(true));
        Size C = mo4472C(p0Var);
        Size size = f3396p;
        int l = m4912l(size);
        if (m4912l(j) < l) {
            size = f3397q;
        } else if (C != null && m4912l(C) < l) {
            size = C;
        }
        for (Size size2 : o2) {
            if (m4912l(size2) <= m4912l(j) && m4912l(size2) >= m4912l(size) && !arrayList.contains(size2)) {
                arrayList.add(size2);
            }
        }
        if (!arrayList.isEmpty()) {
            Rational B = mo4471B(p0Var);
            if (C == null) {
                C = p0Var.mo5294I((Size) null);
            }
            ArrayList arrayList2 = new ArrayList();
            new HashMap();
            if (B == null) {
                arrayList2.addAll(arrayList);
                if (C != null) {
                    mo4479M(arrayList2, C);
                }
            } else {
                Map<Rational, List<Size>> E = mo4474E(arrayList);
                if (C != null) {
                    for (Rational rational : E.keySet()) {
                        mo4479M(E.get(rational), C);
                    }
                }
                ArrayList<Rational> arrayList3 = new ArrayList<>(E.keySet());
                Collections.sort(arrayList3, new C1180a(B));
                for (Rational rational2 : arrayList3) {
                    for (Size size3 : E.get(rational2)) {
                        if (!arrayList2.contains(size3)) {
                            arrayList2.add(size3);
                        }
                    }
                }
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("Can not get supported output size under supported maximum for the format: " + o);
    }

    /* renamed from: androidx.camera.camera2.internal.f2$b */
    public static final class C1181b implements Comparator<Size> {

        /* renamed from: a */
        public boolean f3421a;

        public C1181b() {
            this.f3421a = false;
        }

        /* renamed from: a */
        public int compare(Size size, Size size2) {
            int signum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            if (this.f3421a) {
                return signum * -1;
            }
            return signum;
        }

        public C1181b(boolean z) {
            this.f3421a = z;
        }
    }
}
