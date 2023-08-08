package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

/* renamed from: androidx.vectordrawable.graphics.drawable.b */
public interface C20715b extends Animatable {

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$a */
    public static abstract class C20716a {

        /* renamed from: a */
        public Animatable2.AnimationCallback f53447a;

        /* renamed from: androidx.vectordrawable.graphics.drawable.b$a$a */
        public class C20717a extends Animatable2.AnimationCallback {
            public C20717a() {
            }

            public void onAnimationEnd(Drawable drawable) {
                C20716a.this.mo61953b(drawable);
            }

            public void onAnimationStart(Drawable drawable) {
                C20716a.this.mo61954c(drawable);
            }
        }

        @C0376v0(23)
        /* renamed from: a */
        public Animatable2.AnimationCallback mo61952a() {
            if (this.f53447a == null) {
                this.f53447a = new C20717a();
            }
            return this.f53447a;
        }

        /* renamed from: b */
        public void mo61953b(Drawable drawable) {
        }

        /* renamed from: c */
        public void mo61954c(Drawable drawable) {
        }
    }

    /* renamed from: b */
    void mo61949b(@C0359n0 C20716a aVar);

    /* renamed from: c */
    void mo61950c();

    /* renamed from: d */
    boolean mo61951d(@C0359n0 C20716a aVar);
}
