package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0329d0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import com.google.android.material.C31076a;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.C31423q;
import com.google.android.material.internal.ParcelableSparseArray;

@C31140c
/* renamed from: com.google.android.material.badge.b */
public class C31135b {

    /* renamed from: a */
    public static final boolean f74647a = false;

    /* renamed from: b */
    public static final String f74648b = "BadgeUtils";

    /* renamed from: com.google.android.material.badge.b$a */
    public class C31136a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Toolbar f74649a;

        /* renamed from: b */
        public final /* synthetic */ int f74650b;

        /* renamed from: c */
        public final /* synthetic */ C31132a f74651c;

        /* renamed from: d */
        public final /* synthetic */ FrameLayout f74652d;

        public C31136a(Toolbar toolbar, int i, C31132a aVar, FrameLayout frameLayout) {
            this.f74649a = toolbar;
            this.f74650b = i;
            this.f74651c = aVar;
            this.f74652d = frameLayout;
        }

        public void run() {
            ActionMenuItemView a = C31423q.m126972a(this.f74649a, this.f74650b);
            if (a != null) {
                C31135b.m125071n(this.f74651c, this.f74649a.getResources());
                C31135b.m125061d(this.f74651c, a, this.f74652d);
                C31135b.m125059b(this.f74651c, a);
            }
        }
    }

    /* renamed from: com.google.android.material.badge.b$b */
    public class C31137b extends C18019a {

        /* renamed from: d */
        public final /* synthetic */ C31132a f74653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31137b(View.AccessibilityDelegate accessibilityDelegate, C31132a aVar) {
            super(accessibilityDelegate);
            this.f74653d = aVar;
        }

        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52607d1(this.f74653d.mo88252o());
        }
    }

    /* renamed from: com.google.android.material.badge.b$c */
    public class C31138c extends C18019a {

        /* renamed from: d */
        public final /* synthetic */ C31132a f74654d;

        public C31138c(C31132a aVar) {
            this.f74654d = aVar;
        }

        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52607d1(this.f74654d.mo88252o());
        }
    }

    /* renamed from: com.google.android.material.badge.b$d */
    public class C31139d extends C18019a {
        public C31139d(View.AccessibilityDelegate accessibilityDelegate) {
            super(accessibilityDelegate);
        }

        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52607d1((CharSequence) null);
        }
    }

    /* renamed from: b */
    public static void m125059b(@C0359n0 C31132a aVar, @C0359n0 View view) {
        if (Build.VERSION.SDK_INT < 29 || !C18196h2.m82493G0(view)) {
            C18196h2.m82474B1(view, new C31138c(aVar));
        } else {
            C18196h2.m82474B1(view, new C31137b(view.getAccessibilityDelegate(), aVar));
        }
    }

    /* renamed from: c */
    public static void m125060c(@C0359n0 C31132a aVar, @C0359n0 View view) {
        m125061d(aVar, view, (FrameLayout) null);
    }

    /* renamed from: d */
    public static void m125061d(@C0359n0 C31132a aVar, @C0359n0 View view, @C0363p0 FrameLayout frameLayout) {
        m125070m(aVar, view, frameLayout);
        if (aVar.mo88254p() != null) {
            aVar.mo88254p().setForeground(aVar);
        } else if (!f74647a) {
            view.getOverlay().add(aVar);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    /* renamed from: e */
    public static void m125062e(@C0359n0 C31132a aVar, @C0359n0 Toolbar toolbar, @C0329d0 int i) {
        m125063f(aVar, toolbar, i, (FrameLayout) null);
    }

    /* renamed from: f */
    public static void m125063f(@C0359n0 C31132a aVar, @C0359n0 Toolbar toolbar, @C0329d0 int i, @C0363p0 FrameLayout frameLayout) {
        toolbar.post(new C31136a(toolbar, i, aVar, frameLayout));
    }

    @C0359n0
    /* renamed from: g */
    public static SparseArray<C31132a> m125064g(Context context, @C0359n0 ParcelableSparseArray parcelableSparseArray) {
        SparseArray<C31132a> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        int i = 0;
        while (i < parcelableSparseArray.size()) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i);
            if (state != null) {
                sparseArray.put(keyAt, C31132a.m124997f(context, state));
                i++;
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    @C0359n0
    /* renamed from: h */
    public static ParcelableSparseArray m125065h(@C0359n0 SparseArray<C31132a> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            C31132a valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                parcelableSparseArray.put(keyAt, valueAt.mo88262v());
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    /* renamed from: i */
    public static void m125066i(@C0359n0 View view) {
        if (Build.VERSION.SDK_INT < 29 || !C18196h2.m82493G0(view)) {
            C18196h2.m82474B1(view, (C18019a) null);
        } else {
            C18196h2.m82474B1(view, new C31139d(view.getAccessibilityDelegate()));
        }
    }

    /* renamed from: j */
    public static void m125067j(@C0363p0 C31132a aVar, @C0359n0 View view) {
        if (aVar != null) {
            if (f74647a || aVar.mo88254p() != null) {
                aVar.mo88254p().setForeground((Drawable) null);
            } else {
                view.getOverlay().remove(aVar);
            }
        }
    }

    /* renamed from: k */
    public static void m125068k(@C0363p0 C31132a aVar, @C0359n0 Toolbar toolbar, @C0329d0 int i) {
        if (aVar != null) {
            ActionMenuItemView a = C31423q.m126972a(toolbar, i);
            if (a != null) {
                m125069l(aVar);
                m125067j(aVar, a);
                m125066i(a);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to remove badge from a null menuItemView: ");
            sb.append(i);
        }
    }

    @C0344h1
    /* renamed from: l */
    public static void m125069l(C31132a aVar) {
        aVar.mo88209K(0);
        aVar.mo88210L(0);
    }

    /* renamed from: m */
    public static void m125070m(@C0359n0 C31132a aVar, @C0359n0 View view, @C0363p0 FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.mo88243i0(view, frameLayout);
    }

    @C0344h1
    /* renamed from: n */
    public static void m125071n(C31132a aVar, Resources resources) {
        aVar.mo88209K(resources.getDimensionPixelOffset(C31076a.C31082f.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
        aVar.mo88210L(resources.getDimensionPixelOffset(C31076a.C31082f.mtrl_badge_toolbar_action_menu_item_vertical_offset));
    }

    /* renamed from: o */
    public static void m125072o(@C0359n0 Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
