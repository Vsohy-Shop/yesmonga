package com.urbanairship.images;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.C0348i1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.content.C17318d;
import com.bumptech.glide.load.resource.drawable.C22452a;
import com.bumptech.glide.load.resource.drawable.C22453b;
import com.urbanairship.C36044d;
import com.urbanairship.C36051i;
import com.urbanairship.C36059m;
import com.urbanairship.util.C9684y;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.concurrent.Executor;

/* renamed from: com.urbanairship.images.e */
public abstract class C9278e {

    /* renamed from: j */
    public static final int f25300j = 200;

    /* renamed from: a */
    public final Executor f25301a = C36044d.m148370b();

    /* renamed from: b */
    public final C9282f f25302b;

    /* renamed from: c */
    public final C9272b f25303c;

    /* renamed from: d */
    public final WeakReference<ImageView> f25304d;

    /* renamed from: e */
    public final Context f25305e;

    /* renamed from: f */
    public final C36051i f25306f = new C36051i();

    /* renamed from: g */
    public ViewTreeObserver.OnPreDrawListener f25307g;

    /* renamed from: h */
    public int f25308h;

    /* renamed from: i */
    public int f25309i;

    /* renamed from: com.urbanairship.images.e$a */
    public class C9279a implements ViewTreeObserver.OnPreDrawListener {
        public C9279a() {
        }

        public boolean onPreDraw() {
            ImageView imageView = (ImageView) C9278e.this.f25304d.get();
            if (imageView == null) {
                return true;
            }
            imageView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (!imageView.getViewTreeObserver().isAlive()) {
                return true;
            }
            if (imageView.getHeight() == 0 && imageView.getWidth() == 0) {
                C9278e.this.mo18653j(imageView, false);
                return true;
            }
            C9278e.this.mo18662g();
            return true;
        }
    }

    /* renamed from: com.urbanairship.images.e$b */
    public class C9280b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ImageView f25311a;

        /* renamed from: com.urbanairship.images.e$b$a */
        public class C9281a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Drawable f25313a;

            public C9281a(Drawable drawable) {
                this.f25313a = drawable;
            }

            public void run() {
                if (!C9278e.this.f25306f.isCancelled()) {
                    boolean d = C9278e.this.mo18660e(this.f25313a);
                    C9280b bVar = C9280b.this;
                    C9278e.this.mo18653j(bVar.f25311a, d);
                }
            }
        }

        public C9280b(ImageView imageView) {
            this.f25311a = imageView;
        }

        public void run() {
            if (!C9278e.this.f25306f.isCancelled()) {
                try {
                    Drawable c = C9278e.this.mo18663h();
                    if (c != null) {
                        C9278e.this.f25306f.mo107801e(new C9281a(c));
                        C9278e.this.f25306f.run();
                    }
                } catch (IOException e) {
                    C36059m.m148407c(e, "Unable to fetch bitmap", new Object[0]);
                }
            }
        }
    }

    public C9278e(@C0359n0 Context context, @C0359n0 C9272b bVar, @C0359n0 ImageView imageView, @C0359n0 C9282f fVar) {
        this.f25305e = context;
        this.f25303c = bVar;
        this.f25302b = fVar;
        this.f25304d = new WeakReference<>(imageView);
    }

    @C0353k0
    /* renamed from: e */
    public final boolean mo18660e(Drawable drawable) {
        ImageView imageView = this.f25304d.get();
        boolean z = false;
        if (!(drawable == null || imageView == null)) {
            z = true;
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(C17318d.m79723f(this.f25305e, 17170445)), drawable});
            imageView.setImageDrawable(transitionDrawable);
            transitionDrawable.startTransition(200);
            if (Build.VERSION.SDK_INT >= 28 && C22452a.m101899a(drawable)) {
                C22453b.m101900a(drawable).start();
            }
        }
        return z;
    }

    @C0353k0
    /* renamed from: f */
    public void mo18661f() {
        ImageView imageView = this.f25304d.get();
        if (!(imageView == null || this.f25307g == null)) {
            imageView.getViewTreeObserver().removeOnPreDrawListener(this.f25307g);
            this.f25304d.clear();
        }
        this.f25306f.cancel();
    }

    @C0353k0
    /* renamed from: g */
    public void mo18662g() {
        if (!this.f25306f.isCancelled()) {
            ImageView imageView = this.f25304d.get();
            if (imageView == null) {
                mo18653j((ImageView) null, false);
                return;
            }
            this.f25308h = imageView.getWidth();
            int height = imageView.getHeight();
            this.f25309i = height;
            if (this.f25308h == 0 && height == 0) {
                this.f25307g = new C9279a();
                imageView.getViewTreeObserver().addOnPreDrawListener(this.f25307g);
                return;
            }
            Drawable b = this.f25303c.mo18655b(mo18664i());
            if (b != null) {
                imageView.setImageDrawable(b);
                mo18653j(imageView, true);
                return;
            }
            if (this.f25302b.mo18669b() != 0) {
                imageView.setImageResource(this.f25302b.mo18669b());
            } else {
                imageView.setImageDrawable((Drawable) null);
            }
            this.f25301a.execute(new C9280b(imageView));
        }
    }

    @C0348i1
    @C0363p0
    /* renamed from: h */
    public final Drawable mo18663h() throws IOException {
        C9684y.C9686b k;
        this.f25303c.mo18656c();
        if (this.f25304d.get() == null || this.f25302b.mo18670c() == null || (k = C9684y.m36257k(this.f25305e, new URL(this.f25302b.mo18670c()), this.f25308h, this.f25309i, this.f25302b.mo18672e(), this.f25302b.mo18671d())) == null) {
            return null;
        }
        this.f25303c.mo18654a(mo18664i(), k.f26517a, k.f26518b);
        return k.f26517a;
    }

    @C0359n0
    /* renamed from: i */
    public final String mo18664i() {
        if (this.f25302b.mo18670c() == null) {
            return "";
        }
        return this.f25302b.mo18670c() + ",size(" + this.f25308h + "x" + this.f25309i + ")";
    }

    /* renamed from: j */
    public abstract void mo18653j(@C0363p0 ImageView imageView, boolean z);
}
