package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.C0323b0;
import androidx.annotation.C0349j;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0374u0;
import androidx.annotation.C0375v;
import com.bumptech.glide.load.engine.C22234h;
import com.bumptech.glide.load.resource.gif.C22477c;
import com.bumptech.glide.manager.C22505c;
import com.bumptech.glide.manager.C22507d;
import com.bumptech.glide.manager.C22515l;
import com.bumptech.glide.manager.C22516m;
import com.bumptech.glide.manager.C22524r;
import com.bumptech.glide.manager.C22525s;
import com.bumptech.glide.manager.C22537v;
import com.bumptech.glide.request.C22557e;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.C22561h;
import com.bumptech.glide.request.target.C22569f;
import com.bumptech.glide.request.target.C22584p;
import com.bumptech.glide.request.transition.C22598f;
import com.bumptech.glide.util.C22635o;
import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bumptech.glide.j */
public class C22092j implements ComponentCallbacks2, C22516m, C22067g<C22090i<Drawable>> {

    /* renamed from: X */
    public static final C22561h f56741X = ((C22561h) C22561h.m102394u1(C22477c.class).mo66739E0());

    /* renamed from: Y */
    public static final C22561h f56742Y = ((C22561h) ((C22561h) C22561h.m102395v1(C22234h.f57125c).mo66767U0(Priority.LOW)).mo66782c1(true));

    /* renamed from: z */
    public static final C22561h f56743z = ((C22561h) C22561h.m102394u1(Bitmap.class).mo66739E0());

    /* renamed from: a */
    public final C22038b f56744a;

    /* renamed from: b */
    public final Context f56745b;

    /* renamed from: c */
    public final C22515l f56746c;
    @C0323b0("this")

    /* renamed from: d */
    public final C22525s f56747d;
    @C0323b0("this")

    /* renamed from: e */
    public final C22524r f56748e;
    @C0323b0("this")

    /* renamed from: f */
    public final C22537v f56749f;

    /* renamed from: g */
    public final Runnable f56750g;

    /* renamed from: v */
    public final C22505c f56751v;

    /* renamed from: w */
    public final CopyOnWriteArrayList<C22560g<Object>> f56752w;
    @C0323b0("this")

    /* renamed from: x */
    public C22561h f56753x;

    /* renamed from: y */
    public boolean f56754y;

    /* renamed from: com.bumptech.glide.j$a */
    public class C22093a implements Runnable {
        public C22093a() {
        }

        public void run() {
            C22092j jVar = C22092j.this;
            jVar.f56746c.mo66572b(jVar);
        }
    }

    /* renamed from: com.bumptech.glide.j$b */
    public static class C22094b extends C22569f<View, Object> {
        public C22094b(@C0359n0 View view) {
            super(view);
        }

        /* renamed from: l */
        public void mo65592l(@C0359n0 Object obj, @C0363p0 C22598f<? super Object> fVar) {
        }

        /* renamed from: m */
        public void mo65753m(@C0363p0 Drawable drawable) {
        }

        /* renamed from: o */
        public void mo65594o(@C0363p0 Drawable drawable) {
        }
    }

    /* renamed from: com.bumptech.glide.j$c */
    public class C22095c implements C22505c.C22506a {
        @C0323b0("RequestManager.this")

        /* renamed from: a */
        public final C22525s f56756a;

        public C22095c(@C0359n0 C22525s sVar) {
            this.f56756a = sVar;
        }

        /* renamed from: a */
        public void mo65754a(boolean z) {
            if (z) {
                synchronized (C22092j.this) {
                    this.f56756a.mo66630g();
                }
            }
        }
    }

    public C22092j(@C0359n0 C22038b bVar, @C0359n0 C22515l lVar, @C0359n0 C22524r rVar, @C0359n0 Context context) {
        this(bVar, lVar, rVar, new C22525s(), bVar.mo65481i(), context);
    }

    /* renamed from: A */
    public void mo65711A(@C0359n0 View view) {
        mo65712B(new C22094b(view));
    }

    /* renamed from: B */
    public void mo65712B(@C0363p0 C22584p<?> pVar) {
        if (pVar != null) {
            mo65739c0(pVar);
        }
    }

    @C0349j
    @C0359n0
    /* renamed from: C */
    public C22090i<File> mo65713C(@C0363p0 Object obj) {
        return mo65714D().mo65603s(obj);
    }

    @C0349j
    @C0359n0
    /* renamed from: D */
    public C22090i<File> mo65714D() {
        return mo65747v(File.class).mo65688b(f56742Y);
    }

    /* renamed from: E */
    public List<C22560g<Object>> mo65715E() {
        return this.f56752w;
    }

    /* renamed from: F */
    public synchronized C22561h mo65716F() {
        return this.f56753x;
    }

    @C0359n0
    /* renamed from: G */
    public <T> C22096k<?, T> mo65717G(Class<T> cls) {
        return this.f56744a.mo65483k().mo65521e(cls);
    }

    /* renamed from: H */
    public synchronized boolean mo65718H() {
        return this.f56747d.mo66627d();
    }

    @C0349j
    @C0359n0
    /* renamed from: I */
    public C22090i<Drawable> mo65602m(@C0363p0 Bitmap bitmap) {
        return mo65749x().mo65602m(bitmap);
    }

    @C0349j
    @C0359n0
    /* renamed from: J */
    public C22090i<Drawable> mo65601j(@C0363p0 Drawable drawable) {
        return mo65749x().mo65601j(drawable);
    }

    @C0349j
    @C0359n0
    /* renamed from: K */
    public C22090i<Drawable> mo65598f(@C0363p0 Uri uri) {
        return mo65749x().mo65598f(uri);
    }

    @C0349j
    @C0359n0
    /* renamed from: L */
    public C22090i<Drawable> mo65600i(@C0363p0 File file) {
        return mo65749x().mo65600i(file);
    }

    @C0349j
    @C0359n0
    /* renamed from: M */
    public C22090i<Drawable> mo65604t(@C0363p0 @C0375v @C0374u0 Integer num) {
        return mo65749x().mo65604t(num);
    }

    @C0349j
    @C0359n0
    /* renamed from: N */
    public C22090i<Drawable> mo65603s(@C0363p0 Object obj) {
        return mo65749x().mo65603s(obj);
    }

    @C0349j
    @C0359n0
    /* renamed from: O */
    public C22090i<Drawable> mo65605u(@C0363p0 String str) {
        return mo65749x().mo65605u(str);
    }

    @C0349j
    @Deprecated
    /* renamed from: P */
    public C22090i<Drawable> mo65597e(@C0363p0 URL url) {
        return mo65749x().mo65597e(url);
    }

    @C0349j
    @C0359n0
    /* renamed from: Q */
    public C22090i<Drawable> mo65599h(@C0363p0 byte[] bArr) {
        return mo65749x().mo65599h(bArr);
    }

    /* renamed from: R */
    public synchronized void mo65728R() {
        this.f56747d.mo66628e();
    }

    /* renamed from: S */
    public synchronized void mo65729S() {
        mo65728R();
        for (C22092j R : this.f56748e.mo66580a()) {
            R.mo65728R();
        }
    }

    /* renamed from: T */
    public synchronized void mo65730T() {
        this.f56747d.mo66629f();
    }

    /* renamed from: U */
    public synchronized void mo65731U() {
        mo65730T();
        for (C22092j T : this.f56748e.mo66580a()) {
            T.mo65730T();
        }
    }

    /* renamed from: V */
    public synchronized void mo65732V() {
        this.f56747d.mo66631h();
    }

    /* renamed from: W */
    public synchronized void mo65733W() {
        C22635o.m102627b();
        mo65732V();
        for (C22092j V : this.f56748e.mo66580a()) {
            V.mo65732V();
        }
    }

    @C0359n0
    /* renamed from: X */
    public synchronized C22092j mo65734X(@C0359n0 C22561h hVar) {
        mo65736Z(hVar);
        return this;
    }

    /* renamed from: Y */
    public void mo65735Y(boolean z) {
        this.f56754y = z;
    }

    /* renamed from: Z */
    public synchronized void mo65736Z(@C0359n0 C22561h hVar) {
        this.f56753x = (C22561h) ((C22561h) hVar.clone()).mo66780c();
    }

    /* renamed from: a */
    public synchronized void mo65585a() {
        mo65730T();
        this.f56749f.mo65585a();
    }

    /* renamed from: a0 */
    public synchronized void mo65737a0(@C0359n0 C22584p<?> pVar, @C0359n0 C22557e eVar) {
        this.f56749f.mo66664h(pVar);
        this.f56747d.mo66632i(eVar);
    }

    /* renamed from: b */
    public synchronized void mo65586b() {
        mo65732V();
        this.f56749f.mo65586b();
    }

    /* renamed from: b0 */
    public synchronized boolean mo65738b0(@C0359n0 C22584p<?> pVar) {
        C22557e request = pVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f56747d.mo66625b(request)) {
            return false;
        }
        this.f56749f.mo66665i(pVar);
        pVar.mo65593n((C22557e) null);
        return true;
    }

    /* renamed from: c */
    public synchronized void mo65587c() {
        this.f56749f.mo65587c();
        for (C22584p<?> B : this.f56749f.mo66663f()) {
            mo65712B(B);
        }
        this.f56749f.mo66662e();
        this.f56747d.mo66626c();
        this.f56746c.mo66571a(this);
        this.f56746c.mo66571a(this.f56751v);
        C22635o.m102650y(this.f56750g);
        this.f56744a.mo65476B(this);
    }

    /* renamed from: c0 */
    public final void mo65739c0(@C0359n0 C22584p<?> pVar) {
        boolean b0 = mo65738b0(pVar);
        C22557e request = pVar.getRequest();
        if (!b0 && !this.f56744a.mo65491w(pVar) && request != null) {
            pVar.mo65593n((C22557e) null);
            request.clear();
        }
    }

    /* renamed from: d0 */
    public final synchronized void mo65740d0(@C0359n0 C22561h hVar) {
        this.f56753x = (C22561h) this.f56753x.mo65688b(hVar);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        if (i == 60 && this.f56754y) {
            mo65729S();
        }
    }

    /* renamed from: q */
    public C22092j mo65744q(C22560g<Object> gVar) {
        this.f56752w.add(gVar);
        return this;
    }

    @C0359n0
    /* renamed from: r */
    public synchronized C22092j mo65745r(@C0359n0 C22561h hVar) {
        mo65740d0(hVar);
        return this;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f56747d + ", treeNode=" + this.f56748e + "}";
    }

    @C0349j
    @C0359n0
    /* renamed from: v */
    public <ResourceType> C22090i<ResourceType> mo65747v(@C0359n0 Class<ResourceType> cls) {
        return new C22090i<>(this.f56744a, this, cls, this.f56745b);
    }

    @C0349j
    @C0359n0
    /* renamed from: w */
    public C22090i<Bitmap> mo65748w() {
        return mo65747v(Bitmap.class).mo65688b(f56743z);
    }

    @C0349j
    @C0359n0
    /* renamed from: x */
    public C22090i<Drawable> mo65749x() {
        return mo65747v(Drawable.class);
    }

    @C0349j
    @C0359n0
    /* renamed from: y */
    public C22090i<File> mo65750y() {
        return mo65747v(File.class).mo65688b(C22561h.m102388S1(true));
    }

    @C0349j
    @C0359n0
    /* renamed from: z */
    public C22090i<C22477c> mo65751z() {
        return mo65747v(C22477c.class).mo65688b(f56741X);
    }

    public C22092j(C22038b bVar, C22515l lVar, C22524r rVar, C22525s sVar, C22507d dVar, Context context) {
        this.f56749f = new C22537v();
        C22093a aVar = new C22093a();
        this.f56750g = aVar;
        this.f56744a = bVar;
        this.f56746c = lVar;
        this.f56748e = rVar;
        this.f56747d = sVar;
        this.f56745b = context;
        C22505c a = dVar.mo66576a(context.getApplicationContext(), new C22095c(sVar));
        this.f56751v = a;
        if (C22635o.m102645t()) {
            C22635o.m102649x(aVar);
        } else {
            lVar.mo66572b(this);
        }
        lVar.mo66572b(a);
        this.f56752w = new CopyOnWriteArrayList<>(bVar.mo65483k().mo65519c());
        mo65736Z(bVar.mo65483k().mo65520d());
        bVar.mo65490v(this);
    }
}
