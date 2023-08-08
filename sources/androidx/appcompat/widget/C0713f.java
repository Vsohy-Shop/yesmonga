package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.widget.C18472d;

/* renamed from: androidx.appcompat.widget.f */
public class C0713f {
    @C0359n0

    /* renamed from: a */
    public final CompoundButton f2366a;

    /* renamed from: b */
    public ColorStateList f2367b = null;

    /* renamed from: c */
    public PorterDuff.Mode f2368c = null;

    /* renamed from: d */
    public boolean f2369d = false;

    /* renamed from: e */
    public boolean f2370e = false;

    /* renamed from: f */
    public boolean f2371f;

    public C0713f(@C0359n0 CompoundButton compoundButton) {
        this.f2366a = compoundButton;
    }

    /* renamed from: a */
    public void mo3418a() {
        Drawable a = C18472d.m83645a(this.f2366a);
        if (a == null) {
            return;
        }
        if (this.f2369d || this.f2370e) {
            Drawable mutate = C17549d.m80456r(a).mutate();
            if (this.f2369d) {
                C17549d.m80453o(mutate, this.f2367b);
            }
            if (this.f2370e) {
                C17549d.m80454p(mutate, this.f2368c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f2366a.getDrawableState());
            }
            this.f2366a.setButtonDrawable(mutate);
        }
    }

    /* renamed from: b */
    public int mo3419b(int i) {
        return i;
    }

    /* renamed from: c */
    public ColorStateList mo3420c() {
        return this.f2367b;
    }

    /* renamed from: d */
    public PorterDuff.Mode mo3421d() {
        return this.f2368c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3422e(@androidx.annotation.C0363p0 android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f2366a
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.C0387a.C0400m.CompoundButton
            r8 = 0
            androidx.appcompat.widget.h1 r0 = androidx.appcompat.widget.C0722h1.m3539G(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f2366a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo3454B()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C18196h2.m82658z1(r1, r2, r3, r4, r5, r6, r7)
            int r10 = androidx.appcompat.C0387a.C0400m.CompoundButton_buttonCompat     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo3455C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo3479u(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CompoundButton r11 = r9.f2366a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.C0507a.m2346b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = r8
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = androidx.appcompat.C0387a.C0400m.CompoundButton_android_button     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo3455C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo3479u(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CompoundButton r11 = r9.f2366a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.C0507a.m2346b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = androidx.appcompat.C0387a.C0400m.CompoundButton_buttonTint     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo3455C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CompoundButton r11 = r9.f2366a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo3462d(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C18472d.m83648d(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = androidx.appcompat.C0387a.C0400m.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo3455C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CompoundButton r11 = r9.f2366a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo3473o(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0725i0.m3584e(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C18472d.m83649e(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo3458I()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo3458I()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0713f.mo3422e(android.util.AttributeSet, int):void");
    }

    /* renamed from: f */
    public void mo3423f() {
        if (this.f2371f) {
            this.f2371f = false;
            return;
        }
        this.f2371f = true;
        mo3418a();
    }

    /* renamed from: g */
    public void mo3424g(ColorStateList colorStateList) {
        this.f2367b = colorStateList;
        this.f2369d = true;
        mo3418a();
    }

    /* renamed from: h */
    public void mo3425h(@C0363p0 PorterDuff.Mode mode) {
        this.f2368c = mode;
        this.f2370e = true;
        mo3418a();
    }
}
