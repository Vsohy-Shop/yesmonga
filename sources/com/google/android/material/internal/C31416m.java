package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.google.android.material.resources.C31501d;
import com.google.android.material.resources.C31505f;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.m */
public class C31416m {

    /* renamed from: a */
    public final TextPaint f75950a = new TextPaint(1);

    /* renamed from: b */
    public final C31505f f75951b = new C31417a();

    /* renamed from: c */
    public float f75952c;

    /* renamed from: d */
    public boolean f75953d = true;
    @C0363p0

    /* renamed from: e */
    public WeakReference<C31418b> f75954e = new WeakReference<>((Object) null);
    @C0363p0

    /* renamed from: f */
    public C31501d f75955f;

    /* renamed from: com.google.android.material.internal.m$a */
    public class C31417a extends C31505f {
        public C31417a() {
        }

        /* renamed from: a */
        public void mo88913a(int i) {
            boolean unused = C31416m.this.f75953d = true;
            C31418b bVar = (C31418b) C31416m.this.f75954e.get();
            if (bVar != null) {
                bVar.mo88225a();
            }
        }

        /* renamed from: b */
        public void mo88914b(@C0359n0 Typeface typeface, boolean z) {
            if (!z) {
                boolean unused = C31416m.this.f75953d = true;
                C31418b bVar = (C31418b) C31416m.this.f75954e.get();
                if (bVar != null) {
                    bVar.mo88225a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.m$b */
    public interface C31418b {
        /* renamed from: a */
        void mo88225a();

        @C0359n0
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C31416m(@C0363p0 C31418b bVar) {
        mo90167h(bVar);
    }

    /* renamed from: c */
    public final float mo90162c(@C0363p0 CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f75950a.measureText(charSequence, 0, charSequence.length());
    }

    @C0363p0
    /* renamed from: d */
    public C31501d mo90163d() {
        return this.f75955f;
    }

    @C0359n0
    /* renamed from: e */
    public TextPaint mo90164e() {
        return this.f75950a;
    }

    /* renamed from: f */
    public float mo90165f(String str) {
        if (!this.f75953d) {
            return this.f75952c;
        }
        float c = mo90162c(str);
        this.f75952c = c;
        this.f75953d = false;
        return c;
    }

    /* renamed from: g */
    public boolean mo90166g() {
        return this.f75953d;
    }

    /* renamed from: h */
    public void mo90167h(@C0363p0 C31418b bVar) {
        this.f75954e = new WeakReference<>(bVar);
    }

    /* renamed from: i */
    public void mo90168i(@C0363p0 C31501d dVar, Context context) {
        if (this.f75955f != dVar) {
            this.f75955f = dVar;
            if (dVar != null) {
                dVar.mo90655o(context, this.f75950a, this.f75951b);
                C31418b bVar = this.f75954e.get();
                if (bVar != null) {
                    this.f75950a.drawableState = bVar.getState();
                }
                dVar.mo90654n(context, this.f75950a, this.f75951b);
                this.f75953d = true;
            }
            C31418b bVar2 = this.f75954e.get();
            if (bVar2 != null) {
                bVar2.mo88225a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: j */
    public void mo90169j(boolean z) {
        this.f75953d = z;
    }

    /* renamed from: k */
    public void mo90170k(Context context) {
        this.f75955f.mo90654n(context, this.f75950a, this.f75951b);
    }
}
