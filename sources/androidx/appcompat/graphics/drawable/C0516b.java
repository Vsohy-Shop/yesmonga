package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.core.graphics.drawable.C17549d;

/* renamed from: androidx.appcompat.graphics.drawable.b */
public class C0516b extends Drawable implements Drawable.Callback {

    /* renamed from: X */
    public static final boolean f1316X = false;

    /* renamed from: Y */
    public static final String f1317Y = "DrawableContainerCompat";

    /* renamed from: Z */
    public static final boolean f1318Z = true;

    /* renamed from: a */
    public C0520d f1319a;

    /* renamed from: b */
    public Rect f1320b;

    /* renamed from: c */
    public Drawable f1321c;

    /* renamed from: d */
    public Drawable f1322d;

    /* renamed from: e */
    public int f1323e = 255;

    /* renamed from: f */
    public boolean f1324f;

    /* renamed from: g */
    public int f1325g = -1;

    /* renamed from: v */
    public boolean f1326v;

    /* renamed from: w */
    public Runnable f1327w;

    /* renamed from: x */
    public long f1328x;

    /* renamed from: y */
    public long f1329y;

    /* renamed from: z */
    public C0519c f1330z;

    /* renamed from: androidx.appcompat.graphics.drawable.b$a */
    public class C0517a implements Runnable {
        public C0517a() {
        }

        public void run() {
            C0516b.this.mo1597a(true);
            C0516b.this.invalidateSelf();
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.appcompat.graphics.drawable.b$b */
    public static class C0518b {
        /* renamed from: a */
        public static boolean m2399a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m2400b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m2401c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.b$c */
    public static class C0519c implements Drawable.Callback {

        /* renamed from: a */
        public Drawable.Callback f1332a;

        /* renamed from: a */
        public Drawable.Callback mo1638a() {
            Drawable.Callback callback = this.f1332a;
            this.f1332a = null;
            return callback;
        }

        /* renamed from: b */
        public C0519c mo1639b(Drawable.Callback callback) {
            this.f1332a = callback;
            return this;
        }

        public void invalidateDrawable(@C0359n0 Drawable drawable) {
        }

        public void scheduleDrawable(@C0359n0 Drawable drawable, @C0359n0 Runnable runnable, long j) {
            Drawable.Callback callback = this.f1332a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(@C0359n0 Drawable drawable, @C0359n0 Runnable runnable) {
            Drawable.Callback callback = this.f1332a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.b$d */
    public static abstract class C0520d extends Drawable.ConstantState {

        /* renamed from: A */
        public int f1333A = 0;

        /* renamed from: B */
        public int f1334B = 0;

        /* renamed from: C */
        public boolean f1335C;

        /* renamed from: D */
        public ColorFilter f1336D;

        /* renamed from: E */
        public boolean f1337E;

        /* renamed from: F */
        public ColorStateList f1338F;

        /* renamed from: G */
        public PorterDuff.Mode f1339G;

        /* renamed from: H */
        public boolean f1340H;

        /* renamed from: I */
        public boolean f1341I;

        /* renamed from: a */
        public final C0516b f1342a;

        /* renamed from: b */
        public Resources f1343b;

        /* renamed from: c */
        public int f1344c;

        /* renamed from: d */
        public int f1345d;

        /* renamed from: e */
        public int f1346e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f1347f;

        /* renamed from: g */
        public Drawable[] f1348g;

        /* renamed from: h */
        public int f1349h;

        /* renamed from: i */
        public boolean f1350i = false;

        /* renamed from: j */
        public boolean f1351j;

        /* renamed from: k */
        public Rect f1352k;

        /* renamed from: l */
        public boolean f1353l = false;

        /* renamed from: m */
        public boolean f1354m;

        /* renamed from: n */
        public int f1355n;

        /* renamed from: o */
        public int f1356o;

        /* renamed from: p */
        public int f1357p;

        /* renamed from: q */
        public int f1358q;

        /* renamed from: r */
        public boolean f1359r;

        /* renamed from: s */
        public int f1360s;

        /* renamed from: t */
        public boolean f1361t;

        /* renamed from: u */
        public boolean f1362u;

        /* renamed from: v */
        public boolean f1363v;

        /* renamed from: w */
        public boolean f1364w;

        /* renamed from: x */
        public boolean f1365x = true;

        /* renamed from: y */
        public boolean f1366y;

        /* renamed from: z */
        public int f1367z;

        public C0520d(C0520d dVar, C0516b bVar, Resources resources) {
            Resources resources2;
            int i;
            this.f1342a = bVar;
            Rect rect = null;
            if (resources != null) {
                resources2 = resources;
            } else if (dVar != null) {
                resources2 = dVar.f1343b;
            } else {
                resources2 = null;
            }
            this.f1343b = resources2;
            if (dVar != null) {
                i = dVar.f1344c;
            } else {
                i = 0;
            }
            int g = C0516b.m2386g(resources, i);
            this.f1344c = g;
            if (dVar != null) {
                this.f1345d = dVar.f1345d;
                this.f1346e = dVar.f1346e;
                this.f1363v = true;
                this.f1364w = true;
                this.f1350i = dVar.f1350i;
                this.f1353l = dVar.f1353l;
                this.f1365x = dVar.f1365x;
                this.f1366y = dVar.f1366y;
                this.f1367z = dVar.f1367z;
                this.f1333A = dVar.f1333A;
                this.f1334B = dVar.f1334B;
                this.f1335C = dVar.f1335C;
                this.f1336D = dVar.f1336D;
                this.f1337E = dVar.f1337E;
                this.f1338F = dVar.f1338F;
                this.f1339G = dVar.f1339G;
                this.f1340H = dVar.f1340H;
                this.f1341I = dVar.f1341I;
                if (dVar.f1344c == g) {
                    if (dVar.f1351j) {
                        this.f1352k = dVar.f1352k != null ? new Rect(dVar.f1352k) : rect;
                        this.f1351j = true;
                    }
                    if (dVar.f1354m) {
                        this.f1355n = dVar.f1355n;
                        this.f1356o = dVar.f1356o;
                        this.f1357p = dVar.f1357p;
                        this.f1358q = dVar.f1358q;
                        this.f1354m = true;
                    }
                }
                if (dVar.f1359r) {
                    this.f1360s = dVar.f1360s;
                    this.f1359r = true;
                }
                if (dVar.f1361t) {
                    this.f1362u = dVar.f1362u;
                    this.f1361t = true;
                }
                Drawable[] drawableArr = dVar.f1348g;
                this.f1348g = new Drawable[drawableArr.length];
                this.f1349h = dVar.f1349h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f1347f;
                if (sparseArray != null) {
                    this.f1347f = sparseArray.clone();
                } else {
                    this.f1347f = new SparseArray<>(this.f1349h);
                }
                int i2 = this.f1349h;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f1347f.put(i3, constantState);
                        } else {
                            this.f1348g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f1348g = new Drawable[10];
            this.f1349h = 0;
        }

        /* renamed from: A */
        public final boolean mo1643A(int i, int i2) {
            int i3 = this.f1349h;
            Drawable[] drawableArr = this.f1348g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    boolean m = C17549d.m80451m(drawable, i);
                    if (i4 == i2) {
                        z = m;
                    }
                }
            }
            this.f1367z = i;
            return z;
        }

        /* renamed from: B */
        public final void mo1644B(boolean z) {
            this.f1350i = z;
        }

        /* renamed from: C */
        public final void mo1645C(Resources resources) {
            if (resources != null) {
                this.f1343b = resources;
                int g = C0516b.m2386g(resources, this.f1344c);
                int i = this.f1344c;
                this.f1344c = g;
                if (i != g) {
                    this.f1354m = false;
                    this.f1351j = false;
                }
            }
        }

        /* renamed from: a */
        public final int mo1646a(Drawable drawable) {
            int i = this.f1349h;
            if (i >= this.f1348g.length) {
                mo1665r(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f1342a);
            this.f1348g[i] = drawable;
            this.f1349h++;
            this.f1346e = drawable.getChangingConfigurations() | this.f1346e;
            mo1666s();
            this.f1352k = null;
            this.f1351j = false;
            this.f1354m = false;
            this.f1363v = false;
            return i;
        }

        @C0376v0(21)
        /* renamed from: b */
        public final void mo1647b(Resources.Theme theme) {
            if (theme != null) {
                mo1652f();
                int i = this.f1349h;
                Drawable[] drawableArr = this.f1348g;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null && C17549d.m80440b(drawable)) {
                        C17549d.m80439a(drawableArr[i2], theme);
                        this.f1346e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo1645C(C0518b.m2401c(theme));
            }
        }

        /* renamed from: c */
        public boolean mo1648c() {
            if (this.f1363v) {
                return this.f1364w;
            }
            mo1652f();
            this.f1363v = true;
            int i = this.f1349h;
            Drawable[] drawableArr = this.f1348g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f1364w = false;
                    return false;
                }
            }
            this.f1364w = true;
            return true;
        }

        @C0376v0(21)
        public boolean canApplyTheme() {
            int i = this.f1349h;
            Drawable[] drawableArr = this.f1348g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f1347f.get(i2);
                    if (constantState != null && C0518b.m2399a(constantState)) {
                        return true;
                    }
                } else if (C17549d.m80440b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final void mo1650d() {
            this.f1366y = false;
        }

        /* renamed from: e */
        public void mo1651e() {
            this.f1354m = true;
            mo1652f();
            int i = this.f1349h;
            Drawable[] drawableArr = this.f1348g;
            this.f1356o = -1;
            this.f1355n = -1;
            this.f1358q = 0;
            this.f1357p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f1355n) {
                    this.f1355n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f1356o) {
                    this.f1356o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f1357p) {
                    this.f1357p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f1358q) {
                    this.f1358q = minimumHeight;
                }
            }
        }

        /* renamed from: f */
        public final void mo1652f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f1347f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f1348g[this.f1347f.keyAt(i)] = mo1669w(this.f1347f.valueAt(i).newDrawable(this.f1343b));
                }
                this.f1347f = null;
            }
        }

        /* renamed from: g */
        public final int mo1653g() {
            return this.f1348g.length;
        }

        public int getChangingConfigurations() {
            return this.f1345d | this.f1346e;
        }

        /* renamed from: h */
        public final Drawable mo1655h(int i) {
            int indexOfKey;
            Drawable drawable = this.f1348g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f1347f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable w = mo1669w(this.f1347f.valueAt(indexOfKey).newDrawable(this.f1343b));
            this.f1348g[i] = w;
            this.f1347f.removeAt(indexOfKey);
            if (this.f1347f.size() == 0) {
                this.f1347f = null;
            }
            return w;
        }

        /* renamed from: i */
        public final int mo1656i() {
            return this.f1349h;
        }

        /* renamed from: j */
        public final int mo1657j() {
            if (!this.f1354m) {
                mo1651e();
            }
            return this.f1356o;
        }

        /* renamed from: k */
        public final int mo1658k() {
            if (!this.f1354m) {
                mo1651e();
            }
            return this.f1358q;
        }

        /* renamed from: l */
        public final int mo1659l() {
            if (!this.f1354m) {
                mo1651e();
            }
            return this.f1357p;
        }

        /* renamed from: m */
        public final Rect mo1660m() {
            Rect rect = null;
            if (this.f1350i) {
                return null;
            }
            Rect rect2 = this.f1352k;
            if (rect2 != null || this.f1351j) {
                return rect2;
            }
            mo1652f();
            Rect rect3 = new Rect();
            int i = this.f1349h;
            Drawable[] drawableArr = this.f1348g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f1351j = true;
            this.f1352k = rect;
            return rect;
        }

        /* renamed from: n */
        public final int mo1661n() {
            if (!this.f1354m) {
                mo1651e();
            }
            return this.f1355n;
        }

        /* renamed from: o */
        public final int mo1662o() {
            return this.f1333A;
        }

        /* renamed from: p */
        public final int mo1663p() {
            return this.f1334B;
        }

        /* renamed from: q */
        public final int mo1664q() {
            int i;
            if (this.f1359r) {
                return this.f1360s;
            }
            mo1652f();
            int i2 = this.f1349h;
            Drawable[] drawableArr = this.f1348g;
            if (i2 > 0) {
                i = drawableArr[0].getOpacity();
            } else {
                i = -2;
            }
            for (int i3 = 1; i3 < i2; i3++) {
                i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
            }
            this.f1360s = i;
            this.f1359r = true;
            return i;
        }

        /* renamed from: r */
        public void mo1665r(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f1348g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f1348g = drawableArr;
        }

        /* renamed from: s */
        public void mo1666s() {
            this.f1359r = false;
            this.f1361t = false;
        }

        /* renamed from: t */
        public final boolean mo1667t() {
            return this.f1353l;
        }

        /* renamed from: u */
        public final boolean mo1668u() {
            if (this.f1361t) {
                return this.f1362u;
            }
            mo1652f();
            int i = this.f1349h;
            Drawable[] drawableArr = this.f1348g;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f1362u = z;
            this.f1361t = true;
            return z;
        }

        /* renamed from: v */
        public void mo1591v() {
            int i = this.f1349h;
            Drawable[] drawableArr = this.f1348g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f1366y = true;
        }

        /* renamed from: w */
        public final Drawable mo1669w(Drawable drawable) {
            C17549d.m80451m(drawable, this.f1367z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f1342a);
            return mutate;
        }

        /* renamed from: x */
        public final void mo1670x(boolean z) {
            this.f1353l = z;
        }

        /* renamed from: y */
        public final void mo1671y(int i) {
            this.f1333A = i;
        }

        /* renamed from: z */
        public final void mo1672z(int i) {
            this.f1334B = i;
        }
    }

    /* renamed from: g */
    public static int m2386g(@C0363p0 Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1597a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f1324f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f1321c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f1328x
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f1323e
            r3.setAlpha(r9)
            r13.f1328x = r6
            goto L_0x0038
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            androidx.appcompat.graphics.drawable.b$d r10 = r13.f1319a
            int r10 = r10.f1333A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f1323e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L_0x0039
        L_0x0036:
            r13.f1328x = r6
        L_0x0038:
            r3 = r8
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f1322d
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f1329y
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0050
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f1322d = r0
            r13.f1329y = r6
            goto L_0x0063
        L_0x0050:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.b$d r4 = r13.f1319a
            int r4 = r4.f1334B
            int r3 = r3 / r4
            int r4 = r13.f1323e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f1329y = r6
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f1327w
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.C0516b.mo1597a(boolean):void");
    }

    @C0376v0(21)
    public void applyTheme(@C0359n0 Resources.Theme theme) {
        this.f1319a.mo1647b(theme);
    }

    /* renamed from: b */
    public void mo1568b() {
        this.f1319a.mo1650d();
        this.f1326v = false;
    }

    /* renamed from: c */
    public C0520d mo1569c() {
        return this.f1319a;
    }

    @C0376v0(21)
    public boolean canApplyTheme() {
        return this.f1319a.canApplyTheme();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo1600d() {
        return this.f1325g;
    }

    public void draw(@C0359n0 Canvas canvas) {
        Drawable drawable = this.f1321c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f1322d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public final void mo1602e(Drawable drawable) {
        if (this.f1330z == null) {
            this.f1330z = new C0519c();
        }
        drawable.setCallback(this.f1330z.mo1639b(drawable.getCallback()));
        try {
            if (this.f1319a.f1333A <= 0 && this.f1324f) {
                drawable.setAlpha(this.f1323e);
            }
            C0520d dVar = this.f1319a;
            if (dVar.f1337E) {
                drawable.setColorFilter(dVar.f1336D);
            } else {
                if (dVar.f1340H) {
                    C17549d.m80453o(drawable, dVar.f1338F);
                }
                C0520d dVar2 = this.f1319a;
                if (dVar2.f1341I) {
                    C17549d.m80454p(drawable, dVar2.f1339G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f1319a.f1365x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            C17549d.m80451m(drawable, C17549d.m80444f(this));
            C17549d.m80448j(drawable, this.f1319a.f1335C);
            Rect rect = this.f1320b;
            if (rect != null) {
                C17549d.m80450l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f1330z.mo1638a());
        }
    }

    /* renamed from: f */
    public final boolean mo1603f() {
        if (!isAutoMirrored() || C17549d.m80444f(this) != 1) {
            return false;
        }
        return true;
    }

    public int getAlpha() {
        return this.f1323e;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1319a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f1319a.mo1648c()) {
            return null;
        }
        this.f1319a.f1345d = getChangingConfigurations();
        return this.f1319a;
    }

    @C0359n0
    public Drawable getCurrent() {
        return this.f1321c;
    }

    public void getHotspotBounds(@C0359n0 Rect rect) {
        Rect rect2 = this.f1320b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f1319a.mo1667t()) {
            return this.f1319a.mo1657j();
        }
        Drawable drawable = this.f1321c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f1319a.mo1667t()) {
            return this.f1319a.mo1661n();
        }
        Drawable drawable = this.f1321c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f1319a.mo1667t()) {
            return this.f1319a.mo1658k();
        }
        Drawable drawable = this.f1321c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f1319a.mo1667t()) {
            return this.f1319a.mo1659l();
        }
        Drawable drawable = this.f1321c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f1321c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f1319a.mo1664q();
    }

    @C0376v0(21)
    public void getOutline(@C0359n0 Outline outline) {
        Drawable drawable = this.f1321c;
        if (drawable != null) {
            C0518b.m2400b(drawable, outline);
        }
    }

    public boolean getPadding(@C0359n0 Rect rect) {
        boolean z;
        Rect m = this.f1319a.mo1660m();
        if (m != null) {
            rect.set(m);
            if ((m.right | m.left | m.top | m.bottom) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            Drawable drawable = this.f1321c;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (mo1603f()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1616h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f1325g
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f1319a
            int r0 = r0.f1334B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f1322d
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f1321c
            if (r0 == 0) goto L_0x0029
            r9.f1322d = r0
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f1319a
            int r0 = r0.f1334B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f1329y = r0
            goto L_0x0035
        L_0x0029:
            r9.f1322d = r4
            r9.f1329y = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f1321c
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f1319a
            int r1 = r0.f1349h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo1655h(r10)
            r9.f1321c = r0
            r9.f1325g = r10
            if (r0 == 0) goto L_0x005a
            androidx.appcompat.graphics.drawable.b$d r10 = r9.f1319a
            int r10 = r10.f1333A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f1328x = r2
        L_0x0051:
            r9.mo1602e(r0)
            goto L_0x005a
        L_0x0055:
            r9.f1321c = r4
            r10 = -1
            r9.f1325g = r10
        L_0x005a:
            long r0 = r9.f1328x
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L_0x0067
            long r1 = r9.f1329y
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r10 = r9.f1327w
            if (r10 != 0) goto L_0x0073
            androidx.appcompat.graphics.drawable.b$a r10 = new androidx.appcompat.graphics.drawable.b$a
            r10.<init>()
            r9.f1327w = r10
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r10)
        L_0x0076:
            r9.mo1597a(r0)
        L_0x0079:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.C0516b.mo1616h(int):boolean");
    }

    /* renamed from: i */
    public void mo1570i(C0520d dVar) {
        this.f1319a = dVar;
        int i = this.f1325g;
        if (i >= 0) {
            Drawable h = dVar.mo1655h(i);
            this.f1321c = h;
            if (h != null) {
                mo1602e(h);
            }
        }
        this.f1322d = null;
    }

    public void invalidateDrawable(@C0359n0 Drawable drawable) {
        C0520d dVar = this.f1319a;
        if (dVar != null) {
            dVar.mo1666s();
        }
        if (drawable == this.f1321c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f1319a.f1335C;
    }

    public boolean isStateful() {
        return this.f1319a.mo1668u();
    }

    /* renamed from: j */
    public void mo1619j(int i) {
        mo1616h(i);
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f1322d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f1322d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f1321c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f1324f) {
                this.f1321c.setAlpha(this.f1323e);
            }
        }
        if (this.f1329y != 0) {
            this.f1329y = 0;
            z = true;
        }
        if (this.f1328x != 0) {
            this.f1328x = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    /* renamed from: k */
    public void mo1620k(int i) {
        this.f1319a.f1333A = i;
    }

    /* renamed from: l */
    public void mo1621l(int i) {
        this.f1319a.f1334B = i;
    }

    /* renamed from: m */
    public final void mo1622m(Resources resources) {
        this.f1319a.mo1645C(resources);
    }

    public Drawable mutate() {
        if (!this.f1326v && super.mutate() == this) {
            C0520d c = mo1569c();
            c.mo1591v();
            mo1570i(c);
            this.f1326v = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1322d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f1321c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f1319a.mo1643A(i, mo1600d());
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f1322d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f1321c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public boolean onStateChange(@C0359n0 int[] iArr) {
        Drawable drawable = this.f1322d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f1321c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(@C0359n0 Drawable drawable, @C0359n0 Runnable runnable, long j) {
        if (drawable == this.f1321c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f1324f || this.f1323e != i) {
            this.f1324f = true;
            this.f1323e = i;
            Drawable drawable = this.f1321c;
            if (drawable == null) {
                return;
            }
            if (this.f1328x == 0) {
                drawable.setAlpha(i);
            } else {
                mo1597a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C0520d dVar = this.f1319a;
        if (dVar.f1335C != z) {
            dVar.f1335C = z;
            Drawable drawable = this.f1321c;
            if (drawable != null) {
                C17549d.m80448j(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C0520d dVar = this.f1319a;
        dVar.f1337E = true;
        if (dVar.f1336D != colorFilter) {
            dVar.f1336D = colorFilter;
            Drawable drawable = this.f1321c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C0520d dVar = this.f1319a;
        if (dVar.f1365x != z) {
            dVar.f1365x = z;
            Drawable drawable = this.f1321c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f1321c;
        if (drawable != null) {
            C17549d.m80449k(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f1320b;
        if (rect == null) {
            this.f1320b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f1321c;
        if (drawable != null) {
            C17549d.m80450l(drawable, i, i2, i3, i4);
        }
    }

    public void setTint(@C0354l int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        C0520d dVar = this.f1319a;
        dVar.f1340H = true;
        if (dVar.f1338F != colorStateList) {
            dVar.f1338F = colorStateList;
            C17549d.m80453o(this.f1321c, colorStateList);
        }
    }

    public void setTintMode(@C0359n0 PorterDuff.Mode mode) {
        C0520d dVar = this.f1319a;
        dVar.f1341I = true;
        if (dVar.f1339G != mode) {
            dVar.f1339G = mode;
            C17549d.m80454p(this.f1321c, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f1322d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f1321c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(@C0359n0 Drawable drawable, @C0359n0 Runnable runnable) {
        if (drawable == this.f1321c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
