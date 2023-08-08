package com.contentsquare.android.sdk;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: com.contentsquare.android.sdk.o9 */
public class C14587o9 {

    /* renamed from: a */
    public final ArrayList<C14792v5> f36074a;

    /* renamed from: b */
    public final C14588a f36075b;

    /* renamed from: c */
    public int f36076c;

    /* renamed from: d */
    public final Paint f36077d;

    /* renamed from: com.contentsquare.android.sdk.o9$a */
    public static class C14588a {
        /* renamed from: a */
        public C14792v5 mo36056a(int i, int i2) {
            return new C14792v5(i, i2);
        }
    }

    public C14587o9() {
        this(new C14588a());
    }

    /* renamed from: a */
    public Bitmap mo36049a() {
        return this.f36074a.get(this.f36076c - 1).mo36618a();
    }

    /* renamed from: b */
    public Bitmap mo36050b(int i) {
        return this.f36074a.get(Math.min(i, this.f36076c - 1)).mo36618a();
    }

    /* renamed from: c */
    public final C14792v5 mo36051c(int i, int i2, int i3) {
        if (this.f36074a.size() <= i3) {
            return this.f36075b.mo36056a(i, i2);
        }
        C14792v5 v5Var = this.f36074a.get(i3);
        v5Var.mo36619b(i, i2);
        return v5Var;
    }

    /* renamed from: d */
    public void mo36052d(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f36076c = 0;
        if (width > i || height > i2) {
            mo36053e(bitmap, i, i2, width, height);
        } else {
            mo36055g(bitmap, i, i2);
        }
    }

    /* renamed from: e */
    public final void mo36053e(Bitmap bitmap, int i, int i2, int i3, int i4) {
        while (true) {
            if (i3 != i || i4 != i2) {
                i3 = Math.max(i3 / 2, i);
                i4 = Math.max(i4 / 2, i2);
                C14792v5 c = mo36051c(i3, i4, this.f36076c);
                int i5 = this.f36076c;
                if (i5 == 0) {
                    c.mo36623f(bitmap, i3, i4, this.f36077d);
                } else {
                    c.mo36623f(this.f36074a.get(i5 - 1).mo36618a(), i3, i4, this.f36077d);
                }
                mo36054f(c);
                this.f36076c++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final void mo36054f(C14792v5 v5Var) {
        int size = this.f36074a.size();
        int i = this.f36076c;
        if (size > i) {
            this.f36074a.set(i, v5Var);
        } else {
            this.f36074a.add(v5Var);
        }
    }

    /* renamed from: g */
    public final void mo36055g(Bitmap bitmap, int i, int i2) {
        C14792v5 c = mo36051c(i, i2, this.f36076c);
        c.mo36620c(bitmap, i, i2);
        mo36054f(c);
        this.f36076c++;
    }

    public C14587o9(C14588a aVar) {
        this.f36074a = new ArrayList<>();
        Paint paint = new Paint();
        this.f36077d = paint;
        this.f36075b = aVar;
        paint.setFilterBitmap(true);
    }
}
