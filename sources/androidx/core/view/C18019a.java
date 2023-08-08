package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.C16986a;
import androidx.core.view.accessibility.C18032a;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.view.accessibility.C18089u0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.view.a */
public class C18019a {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f46535c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f46536a;

    /* renamed from: b */
    public final View.AccessibilityDelegate f46537b;

    /* renamed from: androidx.core.view.a$a */
    public static final class C18020a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C18019a f46538a;

        public C18020a(C18019a aVar) {
            this.f46538a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f46538a.mo52489a(view, accessibilityEvent);
        }

        @C0376v0(16)
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C18089u0 b = this.f46538a.mo45416b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.mo52702e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f46538a.mo52492f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C18065l0 c2 = C18065l0.m81936c2(accessibilityNodeInfo);
            c2.mo52540H1(C18196h2.m82554Z0(view));
            c2.mo52639n1(C18196h2.m82518N0(view));
            c2.mo52525B1(C18196h2.m82504J(view));
            c2.mo52557N1(C18196h2.m82641v0(view));
            this.f46538a.mo19938g(view, c2);
            c2.mo52612f(accessibilityNodeInfo.getText(), view);
            List<C18065l0.C18066a> c = C18019a.m81858c(view);
            for (int i = 0; i < c.size(); i++) {
                c2.mo52598b(c.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f46538a.mo52493h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f46538a.mo52494i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f46538a.mo19939j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f46538a.mo52496l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f46538a.mo52497m(view, accessibilityEvent);
        }
    }

    @C0376v0(16)
    /* renamed from: androidx.core.view.a$b */
    public static class C18021b {
        @C0373u
        /* renamed from: a */
        public static AccessibilityNodeProvider m81871a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        @C0373u
        /* renamed from: b */
        public static boolean m81872b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public C18019a() {
        this(f46535c);
    }

    /* renamed from: c */
    public static List<C18065l0.C18066a> m81858c(View view) {
        List<C18065l0.C18066a> list = (List) view.getTag(C16986a.C16991e.tag_accessibility_actions);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: a */
    public boolean mo52489a(@C0359n0 View view, @C0359n0 AccessibilityEvent accessibilityEvent) {
        return this.f46536a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @C0363p0
    /* renamed from: b */
    public C18089u0 mo45416b(@C0359n0 View view) {
        AccessibilityNodeProvider a = C18021b.m81871a(this.f46536a, view);
        if (a != null) {
            return new C18089u0(a);
        }
        return null;
    }

    /* renamed from: d */
    public View.AccessibilityDelegate mo52490d() {
        return this.f46537b;
    }

    /* renamed from: e */
    public final boolean mo52491e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] x = C18065l0.m81939x(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (x != null && i < x.length) {
                if (clickableSpan.equals(x[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo52492f(@C0359n0 View view, @C0359n0 AccessibilityEvent accessibilityEvent) {
        this.f46536a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo19938g(@C0359n0 View view, @C0359n0 C18065l0 l0Var) {
        this.f46536a.onInitializeAccessibilityNodeInfo(view, l0Var.mo52601b2());
    }

    /* renamed from: h */
    public void mo52493h(@C0359n0 View view, @C0359n0 AccessibilityEvent accessibilityEvent) {
        this.f46536a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo52494i(@C0359n0 ViewGroup viewGroup, @C0359n0 View view, @C0359n0 AccessibilityEvent accessibilityEvent) {
        return this.f46536a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo19939j(@C0359n0 View view, int i, @C0363p0 Bundle bundle) {
        List<C18065l0.C18066a> c = m81858c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C18065l0.C18066a aVar = c.get(i2);
            if (aVar.mo52676b() == i) {
                z = aVar.mo52678d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z) {
            z = C18021b.m81872b(this.f46536a, view, i, bundle);
        }
        if (z || i != C16986a.C16991e.accessibility_action_clickable_span || bundle == null) {
            return z;
        }
        return mo52495k(bundle.getInt(C18032a.f46545d, -1), view);
    }

    /* renamed from: k */
    public final boolean mo52495k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C16986a.C16991e.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!mo52491e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: l */
    public void mo52496l(@C0359n0 View view, int i) {
        this.f46536a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo52497m(@C0359n0 View view, @C0359n0 AccessibilityEvent accessibilityEvent) {
        this.f46536a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C18019a(@C0359n0 View.AccessibilityDelegate accessibilityDelegate) {
        this.f46536a = accessibilityDelegate;
        this.f46537b = new C18020a(this);
    }
}
