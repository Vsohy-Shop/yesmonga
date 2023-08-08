package androidx.core.view;

import android.graphics.Point;
import android.view.View;
import androidx.annotation.C0359n0;

/* renamed from: androidx.core.view.k0 */
public class C18285k0 {

    /* renamed from: a */
    public final View f46923a;

    /* renamed from: b */
    public final C18286a f46924b;

    /* renamed from: c */
    public int f46925c;

    /* renamed from: d */
    public int f46926d;

    /* renamed from: e */
    public boolean f46927e;

    /* renamed from: f */
    public final View.OnLongClickListener f46928f = new C18232i0(this);

    /* renamed from: g */
    public final View.OnTouchListener f46929g = new C18267j0(this);

    /* renamed from: androidx.core.view.k0$a */
    public interface C18286a {
        /* renamed from: a */
        boolean mo52966a(@C0359n0 View view, @C0359n0 C18285k0 k0Var);
    }

    public C18285k0(@C0359n0 View view, @C0359n0 C18286a aVar) {
        this.f46923a = view;
        this.f46924b = aVar;
    }

    /* renamed from: a */
    public void mo52961a() {
        this.f46923a.setOnLongClickListener(this.f46928f);
        this.f46923a.setOnTouchListener(this.f46929g);
    }

    /* renamed from: b */
    public void mo52962b() {
        this.f46923a.setOnLongClickListener((View.OnLongClickListener) null);
        this.f46923a.setOnTouchListener((View.OnTouchListener) null);
    }

    /* renamed from: c */
    public void mo52963c(@C0359n0 Point point) {
        point.set(this.f46925c, this.f46926d);
    }

    /* renamed from: d */
    public boolean mo52964d(@C0359n0 View view) {
        return this.f46924b.mo52966a(view, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r2 != 3) goto L_0x004d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo52965e(@androidx.annotation.C0359n0 android.view.View r7, @androidx.annotation.C0359n0 android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L_0x0049
            r4 = 1
            if (r2 == r4) goto L_0x0046
            r5 = 2
            if (r2 == r5) goto L_0x001b
            r7 = 3
            if (r2 == r7) goto L_0x0046
            goto L_0x004d
        L_0x001b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = androidx.core.view.C18327o1.m83041l(r8, r2)
            if (r2 == 0) goto L_0x004d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L_0x002b
            goto L_0x004d
        L_0x002b:
            boolean r8 = r6.f46927e
            if (r8 == 0) goto L_0x0030
            goto L_0x004d
        L_0x0030:
            int r8 = r6.f46925c
            if (r8 != r0) goto L_0x0039
            int r8 = r6.f46926d
            if (r8 != r1) goto L_0x0039
            goto L_0x004d
        L_0x0039:
            r6.f46925c = r0
            r6.f46926d = r1
            androidx.core.view.k0$a r8 = r6.f46924b
            boolean r7 = r8.mo52966a(r7, r6)
            r6.f46927e = r7
            return r7
        L_0x0046:
            r6.f46927e = r3
            goto L_0x004d
        L_0x0049:
            r6.f46925c = r0
            r6.f46926d = r1
        L_0x004d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C18285k0.mo52965e(android.view.View, android.view.MotionEvent):boolean");
    }
}
