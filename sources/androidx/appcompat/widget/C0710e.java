package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.widget.C18467c;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.appcompat.widget.e */
public class C0710e {
    @C0359n0

    /* renamed from: a */
    public final CheckedTextView f2356a;

    /* renamed from: b */
    public ColorStateList f2357b = null;

    /* renamed from: c */
    public PorterDuff.Mode f2358c = null;

    /* renamed from: d */
    public boolean f2359d = false;

    /* renamed from: e */
    public boolean f2360e = false;

    /* renamed from: f */
    public boolean f2361f;

    public C0710e(@C0359n0 CheckedTextView checkedTextView) {
        this.f2356a = checkedTextView;
    }

    /* renamed from: a */
    public void mo3407a() {
        Drawable a = C18467c.m83634a(this.f2356a);
        if (a == null) {
            return;
        }
        if (this.f2359d || this.f2360e) {
            Drawable mutate = C17549d.m80456r(a).mutate();
            if (this.f2359d) {
                C17549d.m80453o(mutate, this.f2357b);
            }
            if (this.f2360e) {
                C17549d.m80454p(mutate, this.f2358c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f2356a.getDrawableState());
            }
            this.f2356a.setCheckMarkDrawable(mutate);
        }
    }

    /* renamed from: b */
    public ColorStateList mo3408b() {
        return this.f2357b;
    }

    /* renamed from: c */
    public PorterDuff.Mode mo3409c() {
        return this.f2358c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[SYNTHETIC, Splitter:B:12:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[Catch:{ all -> 0x0084 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3410d(@androidx.annotation.C0363p0 android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CheckedTextView r0 = r9.f2356a
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.C0387a.C0400m.CheckedTextView
            r8 = 0
            androidx.appcompat.widget.h1 r0 = androidx.appcompat.widget.C0722h1.m3539G(r0, r10, r3, r11, r8)
            android.widget.CheckedTextView r1 = r9.f2356a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.mo3454B()
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.C18196h2.m82658z1(r1, r2, r3, r4, r5, r6, r7)
            int r10 = androidx.appcompat.C0387a.C0400m.CheckedTextView_checkMarkCompat     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo3455C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x003a
            int r10 = r0.mo3479u(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x003a
            android.widget.CheckedTextView r11 = r9.f2356a     // Catch:{ NotFoundException -> 0x003a }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x003a }
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.C0507a.m2346b(r1, r10)     // Catch:{ NotFoundException -> 0x003a }
            r11.setCheckMarkDrawable(r10)     // Catch:{ NotFoundException -> 0x003a }
            r10 = 1
            goto L_0x003b
        L_0x003a:
            r10 = r8
        L_0x003b:
            if (r10 != 0) goto L_0x0058
            int r10 = androidx.appcompat.C0387a.C0400m.CheckedTextView_android_checkMark     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo3455C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0058
            int r10 = r0.mo3479u(r10, r8)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x0058
            android.widget.CheckedTextView r11 = r9.f2356a     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0084 }
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.C0507a.m2346b(r1, r10)     // Catch:{ all -> 0x0084 }
            r11.setCheckMarkDrawable(r10)     // Catch:{ all -> 0x0084 }
        L_0x0058:
            int r10 = androidx.appcompat.C0387a.C0400m.CheckedTextView_checkMarkTint     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo3455C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0069
            android.widget.CheckedTextView r11 = r9.f2356a     // Catch:{ all -> 0x0084 }
            android.content.res.ColorStateList r10 = r0.mo3462d(r10)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C18467c.m83637d(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0069:
            int r10 = androidx.appcompat.C0387a.C0400m.CheckedTextView_checkMarkTintMode     // Catch:{ all -> 0x0084 }
            boolean r11 = r0.mo3455C(r10)     // Catch:{ all -> 0x0084 }
            if (r11 == 0) goto L_0x0080
            android.widget.CheckedTextView r11 = r9.f2356a     // Catch:{ all -> 0x0084 }
            r1 = -1
            int r10 = r0.mo3473o(r10, r1)     // Catch:{ all -> 0x0084 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.C0725i0.m3584e(r10, r1)     // Catch:{ all -> 0x0084 }
            androidx.core.widget.C18467c.m83638e(r11, r10)     // Catch:{ all -> 0x0084 }
        L_0x0080:
            r0.mo3458I()
            return
        L_0x0084:
            r10 = move-exception
            r0.mo3458I()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0710e.mo3410d(android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public void mo3411e() {
        if (this.f2361f) {
            this.f2361f = false;
            return;
        }
        this.f2361f = true;
        mo3407a();
    }

    /* renamed from: f */
    public void mo3412f(ColorStateList colorStateList) {
        this.f2357b = colorStateList;
        this.f2359d = true;
        mo3407a();
    }

    /* renamed from: g */
    public void mo3413g(@C0363p0 PorterDuff.Mode mode) {
        this.f2358c = mode;
        this.f2360e = true;
        mo3407a();
    }
}
