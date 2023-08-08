package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.core.view.accessibility.u0 */
public class C18089u0 {

    /* renamed from: b */
    public static final int f46704b = -1;
    @C0363p0

    /* renamed from: a */
    public final Object f46705a;

    @C0376v0(16)
    /* renamed from: androidx.core.view.accessibility.u0$a */
    public static class C18090a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C18089u0 f46706a;

        public C18090a(C18089u0 u0Var) {
            this.f46706a = u0Var;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C18065l0 b = this.f46706a.mo52699b(i);
            if (b == null) {
                return null;
            }
            return b.mo52601b2();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C18065l0> c = this.f46706a.mo52700c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).mo52601b2());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f46706a.mo52703f(i, i2, bundle);
        }
    }

    @C0376v0(19)
    /* renamed from: androidx.core.view.accessibility.u0$b */
    public static class C18091b extends C18090a {
        public C18091b(C18089u0 u0Var) {
            super(u0Var);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C18065l0 d = this.f46706a.mo52701d(i);
            if (d == null) {
                return null;
            }
            return d.mo52601b2();
        }
    }

    @C0376v0(26)
    /* renamed from: androidx.core.view.accessibility.u0$c */
    public static class C18092c extends C18091b {
        public C18092c(C18089u0 u0Var) {
            super(u0Var);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f46706a.mo52698a(i, C18065l0.m81936c2(accessibilityNodeInfo), str, bundle);
        }
    }

    public C18089u0() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f46705a = new C18092c(this);
        } else {
            this.f46705a = new C18091b(this);
        }
    }

    /* renamed from: a */
    public void mo52698a(int i, @C0359n0 C18065l0 l0Var, @C0359n0 String str, @C0363p0 Bundle bundle) {
    }

    @C0363p0
    /* renamed from: b */
    public C18065l0 mo52699b(int i) {
        return null;
    }

    @C0363p0
    /* renamed from: c */
    public List<C18065l0> mo52700c(@C0359n0 String str, int i) {
        return null;
    }

    @C0363p0
    /* renamed from: d */
    public C18065l0 mo52701d(int i) {
        return null;
    }

    @C0363p0
    /* renamed from: e */
    public Object mo52702e() {
        return this.f46705a;
    }

    /* renamed from: f */
    public boolean mo52703f(int i, int i2, @C0363p0 Bundle bundle) {
        return false;
    }

    public C18089u0(@C0363p0 Object obj) {
        this.f46705a = obj;
    }
}
