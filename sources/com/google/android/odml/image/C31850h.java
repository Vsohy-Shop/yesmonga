package com.google.android.odml.image;

import android.graphics.Rect;
import androidx.annotation.C0359n0;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.odml.image.h */
public class C31850h implements Closeable {

    /* renamed from: E0 */
    public static final int f77681E0 = 9;

    /* renamed from: F0 */
    public static final int f77682F0 = 1;

    /* renamed from: G0 */
    public static final int f77683G0 = 2;

    /* renamed from: H0 */
    public static final int f77684H0 = 3;

    /* renamed from: X */
    public static final int f77685X = 6;

    /* renamed from: Y */
    public static final int f77686Y = 7;

    /* renamed from: Z */
    public static final int f77687Z = 8;

    /* renamed from: g */
    public static final int f77688g = 0;

    /* renamed from: v */
    public static final int f77689v = 1;

    /* renamed from: w */
    public static final int f77690w = 2;

    /* renamed from: x */
    public static final int f77691x = 3;

    /* renamed from: y */
    public static final int f77692y = 4;

    /* renamed from: z */
    public static final int f77693z = 5;

    /* renamed from: a */
    public final C31861p f77694a;

    /* renamed from: b */
    public final int f77695b;

    /* renamed from: c */
    public final Rect f77696c;

    /* renamed from: d */
    public final int f77697d;

    /* renamed from: e */
    public final int f77698e;

    /* renamed from: f */
    public int f77699f = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.odml.image.h$a */
    public @interface C31851a {
    }

    /* renamed from: com.google.android.odml.image.h$b */
    public static final class C31852b {

        /* renamed from: a */
        public final C31850h f77700a;

        public /* synthetic */ C31852b(C31850h hVar, C31864s sVar) {
            this.f77700a = hVar;
        }

        /* renamed from: a */
        public void mo92368a() {
            this.f77700a.mo92367i();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.odml.image.h$c */
    public @interface C31853c {
    }

    public C31850h(C31861p pVar, int i, Rect rect, long j, int i2, int i3) {
        this.f77694a = pVar;
        this.f77695b = i;
        Rect rect2 = new Rect();
        this.f77696c = rect2;
        rect2.set(rect);
        this.f77697d = i2;
        this.f77698e = i3;
    }

    /* renamed from: g */
    public static void m129227g(int i) {
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            StringBuilder sb = new StringBuilder(68);
            sb.append("Rotation value ");
            sb.append(i);
            sb.append(" is not valid. Use only 0, 90, 180 or 270.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @C0359n0
    /* renamed from: a */
    public List<C31847e> mo92360a() {
        return Collections.singletonList(this.f77694a.zzb());
    }

    @C0359n0
    /* renamed from: b */
    public C31852b mo92361b() {
        return new C31852b(this, (C31864s) null);
    }

    /* renamed from: c */
    public int mo92362c() {
        return this.f77695b;
    }

    public synchronized void close() {
        int i = this.f77699f - 1;
        this.f77699f = i;
        if (i == 0) {
            this.f77694a.mo92376d();
        }
    }

    /* renamed from: d */
    public final C31861p mo92364d() {
        return this.f77694a;
    }

    public int getHeight() {
        return this.f77698e;
    }

    public int getWidth() {
        return this.f77697d;
    }

    /* renamed from: i */
    public final synchronized void mo92367i() {
        this.f77699f++;
    }
}
