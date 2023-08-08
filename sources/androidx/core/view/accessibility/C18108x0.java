package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.core.view.accessibility.x0 */
public class C18108x0 {

    /* renamed from: b */
    public static final int f46709b = -1;

    /* renamed from: c */
    public static final int f46710c = 1;

    /* renamed from: d */
    public static final int f46711d = 2;

    /* renamed from: e */
    public static final int f46712e = 3;

    /* renamed from: f */
    public static final int f46713f = 4;

    /* renamed from: g */
    public static final int f46714g = 5;

    /* renamed from: a */
    public final Object f46715a;

    @C0376v0(21)
    /* renamed from: androidx.core.view.accessibility.x0$a */
    public static class C18109a {
        @C0373u
        /* renamed from: a */
        public static void m82239a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @C0373u
        /* renamed from: b */
        public static AccessibilityWindowInfo m82240b(AccessibilityWindowInfo accessibilityWindowInfo, int i) {
            return accessibilityWindowInfo.getChild(i);
        }

        @C0373u
        /* renamed from: c */
        public static int m82241c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @C0373u
        /* renamed from: d */
        public static int m82242d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @C0373u
        /* renamed from: e */
        public static int m82243e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @C0373u
        /* renamed from: f */
        public static AccessibilityWindowInfo m82244f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @C0373u
        /* renamed from: g */
        public static AccessibilityNodeInfo m82245g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @C0373u
        /* renamed from: h */
        public static int m82246h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @C0373u
        /* renamed from: i */
        public static boolean m82247i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @C0373u
        /* renamed from: j */
        public static boolean m82248j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @C0373u
        /* renamed from: k */
        public static boolean m82249k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @C0373u
        /* renamed from: l */
        public static AccessibilityWindowInfo m82250l() {
            return AccessibilityWindowInfo.obtain();
        }

        @C0373u
        /* renamed from: m */
        public static AccessibilityWindowInfo m82251m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }

        @C0373u
        /* renamed from: n */
        public static void m82252n(AccessibilityWindowInfo accessibilityWindowInfo) {
            accessibilityWindowInfo.recycle();
        }
    }

    @C0376v0(24)
    /* renamed from: androidx.core.view.accessibility.x0$b */
    public static class C18110b {
        @C0373u
        /* renamed from: a */
        public static AccessibilityNodeInfo m82253a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @C0373u
        /* renamed from: b */
        public static CharSequence m82254b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    @C0376v0(33)
    /* renamed from: androidx.core.view.accessibility.x0$c */
    public static class C18111c {
        @C0373u
        /* renamed from: a */
        public static int m82255a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        @C0373u
        /* renamed from: b */
        public static void m82256b(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        @C0373u
        /* renamed from: c */
        public static boolean m82257c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    public C18108x0(Object obj) {
        this.f46715a = obj;
    }

    @C0363p0
    /* renamed from: q */
    public static C18108x0 m82217q() {
        return m82220v(C18109a.m82250l());
    }

    @C0363p0
    /* renamed from: r */
    public static C18108x0 m82218r(@C0363p0 C18108x0 x0Var) {
        if (x0Var == null) {
            return null;
        }
        return m82220v(C18109a.m82251m((AccessibilityWindowInfo) x0Var.f46715a));
    }

    /* renamed from: t */
    public static String m82219t(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    /* renamed from: v */
    public static C18108x0 m82220v(Object obj) {
        if (obj != null) {
            return new C18108x0(obj);
        }
        return null;
    }

    @C0363p0
    /* renamed from: a */
    public C18065l0 mo52768a() {
        return C18065l0.m81937d2(C18110b.m82253a((AccessibilityWindowInfo) this.f46715a));
    }

    /* renamed from: b */
    public void mo52769b(@C0359n0 Rect rect) {
        C18109a.m82239a((AccessibilityWindowInfo) this.f46715a, rect);
    }

    @C0363p0
    /* renamed from: c */
    public C18108x0 mo52770c(int i) {
        return m82220v(C18109a.m82240b((AccessibilityWindowInfo) this.f46715a, i));
    }

    /* renamed from: d */
    public int mo52771d() {
        return C18109a.m82241c((AccessibilityWindowInfo) this.f46715a);
    }

    /* renamed from: e */
    public int mo52772e() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C18111c.m82255a((AccessibilityWindowInfo) this.f46715a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C18108x0)) {
            return false;
        }
        C18108x0 x0Var = (C18108x0) obj;
        Object obj2 = this.f46715a;
        if (obj2 != null) {
            return obj2.equals(x0Var.f46715a);
        }
        if (x0Var.f46715a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo52774f() {
        return C18109a.m82242d((AccessibilityWindowInfo) this.f46715a);
    }

    /* renamed from: g */
    public int mo52775g() {
        return C18109a.m82243e((AccessibilityWindowInfo) this.f46715a);
    }

    @C0363p0
    /* renamed from: h */
    public C18108x0 mo52776h() {
        return m82220v(C18109a.m82244f((AccessibilityWindowInfo) this.f46715a));
    }

    public int hashCode() {
        Object obj = this.f46715a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: i */
    public void mo52778i(@C0359n0 Region region) {
        if (Build.VERSION.SDK_INT >= 33) {
            C18111c.m82256b((AccessibilityWindowInfo) this.f46715a, region);
            return;
        }
        Rect rect = new Rect();
        C18109a.m82239a((AccessibilityWindowInfo) this.f46715a, rect);
        region.set(rect);
    }

    @C0363p0
    /* renamed from: j */
    public C18065l0 mo52779j() {
        return C18065l0.m81937d2(C18109a.m82245g((AccessibilityWindowInfo) this.f46715a));
    }

    @C0363p0
    /* renamed from: k */
    public CharSequence mo52780k() {
        return C18110b.m82254b((AccessibilityWindowInfo) this.f46715a);
    }

    /* renamed from: l */
    public int mo52781l() {
        return C18109a.m82246h((AccessibilityWindowInfo) this.f46715a);
    }

    /* renamed from: m */
    public boolean mo52782m() {
        return C18109a.m82247i((AccessibilityWindowInfo) this.f46715a);
    }

    /* renamed from: n */
    public boolean mo52783n() {
        return C18109a.m82248j((AccessibilityWindowInfo) this.f46715a);
    }

    /* renamed from: o */
    public boolean mo52784o() {
        return C18109a.m82249k((AccessibilityWindowInfo) this.f46715a);
    }

    /* renamed from: p */
    public boolean mo52785p() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C18111c.m82257c((AccessibilityWindowInfo) this.f46715a);
        }
        return false;
    }

    /* renamed from: s */
    public void mo52786s() {
        C18109a.m82252n((AccessibilityWindowInfo) this.f46715a);
    }

    @C0359n0
    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        mo52769b(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(mo52774f());
        sb.append(", type=");
        sb.append(m82219t(mo52781l()));
        sb.append(", layer=");
        sb.append(mo52775g());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(mo52784o());
        sb.append(", active=");
        sb.append(mo52783n());
        sb.append(", hasParent=");
        boolean z2 = true;
        if (mo52776h() != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", hasChildren=");
        if (mo52771d() <= 0) {
            z2 = false;
        }
        sb.append(z2);
        sb.append(C12361b.f30261l);
        return sb.toString();
    }

    @C0363p0
    /* renamed from: u */
    public AccessibilityWindowInfo mo52788u() {
        return (AccessibilityWindowInfo) this.f46715a;
    }
}
