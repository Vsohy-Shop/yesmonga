package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.core.view.C18196h2;

/* renamed from: androidx.transition.f */
public class C20574f extends C20606h0 {

    /* renamed from: k1 */
    public static final String f53047k1 = "android:clipBounds:clip";

    /* renamed from: l1 */
    public static final String f53048l1 = "android:clipBounds:bounds";

    /* renamed from: m1 */
    public static final String[] f53049m1 = {f53047k1};

    /* renamed from: androidx.transition.f$a */
    public class C20575a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f53050a;

        public C20575a(View view) {
            this.f53050a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C18196h2.m82516M1(this.f53050a, (Rect) null);
        }
    }

    public C20574f() {
    }

    /* renamed from: V0 */
    public final void mo61677V0(C20657p0 p0Var) {
        View view = p0Var.f53280b;
        if (view.getVisibility() != 8) {
            Rect P = C18196h2.m82523P(view);
            p0Var.f53279a.put(f53047k1, P);
            if (P == null) {
                p0Var.f53279a.put(f53048l1, new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    @C0359n0
    /* renamed from: i0 */
    public String[] mo61634i0() {
        return f53049m1;
    }

    /* renamed from: m */
    public void mo61635m(@C0359n0 C20657p0 p0Var) {
        mo61677V0(p0Var);
    }

    /* renamed from: s */
    public void mo61636s(@C0359n0 C20657p0 p0Var) {
        mo61677V0(p0Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.graphics.Rect} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.C0363p0
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo61637x(@androidx.annotation.C0359n0 android.view.ViewGroup r8, @androidx.annotation.C0363p0 androidx.transition.C20657p0 r9, @androidx.annotation.C0363p0 androidx.transition.C20657p0 r10) {
        /*
            r7 = this;
            r8 = 0
            if (r9 == 0) goto L_0x007e
            if (r10 == 0) goto L_0x007e
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.f53279a
            java.lang.String r1 = "android:clipBounds:clip"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x007e
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.f53279a
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0018
            goto L_0x007e
        L_0x0018:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.f53279a
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r2 = r10.f53279a
            java.lang.Object r1 = r2.get(r1)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x002e
            r4 = r2
            goto L_0x002f
        L_0x002e:
            r4 = r3
        L_0x002f:
            if (r0 != 0) goto L_0x0034
            if (r1 != 0) goto L_0x0034
            return r8
        L_0x0034:
            java.lang.String r5 = "android:clipBounds:bounds"
            if (r0 != 0) goto L_0x0042
            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.f53279a
            java.lang.Object r9 = r9.get(r5)
            r0 = r9
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            goto L_0x004d
        L_0x0042:
            if (r1 != 0) goto L_0x004d
            java.util.Map<java.lang.String, java.lang.Object> r9 = r10.f53279a
            java.lang.Object r9 = r9.get(r5)
            r1 = r9
            android.graphics.Rect r1 = (android.graphics.Rect) r1
        L_0x004d:
            boolean r9 = r0.equals(r1)
            if (r9 == 0) goto L_0x0054
            return r8
        L_0x0054:
            android.view.View r8 = r10.f53280b
            androidx.core.view.C18196h2.m82516M1(r8, r0)
            androidx.transition.c0 r8 = new androidx.transition.c0
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r8.<init>(r9)
            android.view.View r9 = r10.f53280b
            android.util.Property<android.view.View, android.graphics.Rect> r5 = androidx.transition.C20554c1.f52993d
            r6 = 2
            android.graphics.Rect[] r6 = new android.graphics.Rect[r6]
            r6[r3] = r0
            r6[r2] = r1
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofObject(r9, r5, r8, r6)
            if (r4 == 0) goto L_0x007e
            android.view.View r9 = r10.f53280b
            androidx.transition.f$a r10 = new androidx.transition.f$a
            r10.<init>(r9)
            r8.addListener(r10)
        L_0x007e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C20574f.mo61637x(android.view.ViewGroup, androidx.transition.p0, androidx.transition.p0):android.animation.Animator");
    }

    public C20574f(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
