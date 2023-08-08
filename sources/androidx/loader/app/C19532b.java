package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1887m;
import androidx.core.util.C17978f;
import androidx.lifecycle.C19392a1;
import androidx.lifecycle.C19423g0;
import androidx.lifecycle.C19426h0;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.C19502x0;
import androidx.loader.app.C19530a;
import androidx.loader.content.C19547c;
import com.bumptech.glide.load.engine.GlideException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import kotlinx.serialization.json.C12412q;

/* renamed from: androidx.loader.app.b */
public class C19532b extends C19530a {

    /* renamed from: c */
    public static final String f49913c = "LoaderManager";

    /* renamed from: d */
    public static boolean f49914d = false;
    @C0359n0

    /* renamed from: a */
    public final C19499w f49915a;
    @C0359n0

    /* renamed from: b */
    public final C19535c f49916b;

    /* renamed from: androidx.loader.app.b$a */
    public static class C19533a<D> extends C19423g0<D> implements C19547c.C19550c<D> {

        /* renamed from: m */
        public final int f49917m;
        @C0363p0

        /* renamed from: n */
        public final Bundle f49918n;
        @C0359n0

        /* renamed from: o */
        public final C19547c<D> f49919o;

        /* renamed from: p */
        public C19499w f49920p;

        /* renamed from: q */
        public C19534b<D> f49921q;

        /* renamed from: r */
        public C19547c<D> f49922r;

        public C19533a(int i, @C0363p0 Bundle bundle, @C0359n0 C19547c<D> cVar, @C0363p0 C19547c<D> cVar2) {
            this.f49917m = i;
            this.f49918n = bundle;
            this.f49919o = cVar;
            this.f49922r = cVar2;
            cVar.mo57824u(i, this);
        }

        /* renamed from: a */
        public void mo57732a(@C0359n0 C19547c<D> cVar, @C0363p0 D d) {
            if (C19532b.f49914d) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo57496r(d);
                return;
            }
            boolean z = C19532b.f49914d;
            mo57493o(d);
        }

        /* renamed from: m */
        public void mo57444m() {
            if (C19532b.f49914d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
            }
            this.f49919o.mo57828y();
        }

        /* renamed from: n */
        public void mo57445n() {
            if (C19532b.f49914d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
            }
            this.f49919o.mo57829z();
        }

        /* renamed from: p */
        public void mo57494p(@C0359n0 C19426h0<? super D> h0Var) {
            super.mo57494p(h0Var);
            this.f49920p = null;
            this.f49921q = null;
        }

        /* renamed from: r */
        public void mo57496r(D d) {
            super.mo57496r(d);
            C19547c<D> cVar = this.f49922r;
            if (cVar != null) {
                cVar.mo57826w();
                this.f49922r = null;
            }
        }

        @C0353k0
        /* renamed from: s */
        public C19547c<D> mo57733s(boolean z) {
            if (C19532b.f49914d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
            }
            this.f49919o.mo57811b();
            this.f49919o.mo57810a();
            C19534b<D> bVar = this.f49921q;
            if (bVar != null) {
                mo57494p(bVar);
                if (z) {
                    bVar.mo57742d();
                }
            }
            this.f49919o.mo57808B(this);
            if ((bVar == null || bVar.mo57741c()) && !z) {
                return this.f49919o;
            }
            this.f49919o.mo57826w();
            return this.f49922r;
        }

        /* renamed from: t */
        public void mo57734t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f49917m);
            printWriter.print(" mArgs=");
            printWriter.println(this.f49918n);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f49919o);
            C19547c<D> cVar = this.f49919o;
            cVar.mo57784g(str + GlideException.C22148a.f56917d, fileDescriptor, printWriter, strArr);
            if (this.f49921q != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f49921q);
                C19534b<D> bVar = this.f49921q;
                bVar.mo57740b(str + GlideException.C22148a.f56917d, printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(mo57736u().mo57813d(mo4610f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(mo57488h());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f49917m);
            sb.append(" : ");
            C17978f.m81683a(this.f49919o, sb);
            sb.append("}}");
            return sb.toString();
        }

        @C0359n0
        /* renamed from: u */
        public C19547c<D> mo57736u() {
            return this.f49919o;
        }

        /* renamed from: v */
        public boolean mo57737v() {
            C19534b<D> bVar;
            if (mo57488h() && (bVar = this.f49921q) != null && !bVar.mo57741c()) {
                return true;
            }
            return false;
        }

        /* renamed from: w */
        public void mo57738w() {
            C19499w wVar = this.f49920p;
            C19534b<D> bVar = this.f49921q;
            if (wVar != null && bVar != null) {
                super.mo57494p(bVar);
                mo57491k(wVar, bVar);
            }
        }

        @C0353k0
        @C0359n0
        /* renamed from: x */
        public C19547c<D> mo57739x(@C0359n0 C19499w wVar, @C0359n0 C19530a.C19531a<D> aVar) {
            C19534b<D> bVar = new C19534b<>(this.f49919o, aVar);
            mo57491k(wVar, bVar);
            C19534b<D> bVar2 = this.f49921q;
            if (bVar2 != null) {
                mo57494p(bVar2);
            }
            this.f49920p = wVar;
            this.f49921q = bVar;
            return this.f49919o;
        }
    }

    /* renamed from: androidx.loader.app.b$b */
    public static class C19534b<D> implements C19426h0<D> {
        @C0359n0

        /* renamed from: a */
        public final C19547c<D> f49923a;
        @C0359n0

        /* renamed from: b */
        public final C19530a.C19531a<D> f49924b;

        /* renamed from: c */
        public boolean f49925c = false;

        public C19534b(@C0359n0 C19547c<D> cVar, @C0359n0 C19530a.C19531a<D> aVar) {
            this.f49923a = cVar;
            this.f49924b = aVar;
        }

        /* renamed from: a */
        public void mo4590a(@C0363p0 D d) {
            if (C19532b.f49914d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.f49923a);
                sb.append(": ");
                sb.append(this.f49923a.mo57813d(d));
            }
            this.f49924b.mo57727a(this.f49923a, d);
            this.f49925c = true;
        }

        /* renamed from: b */
        public void mo57740b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f49925c);
        }

        /* renamed from: c */
        public boolean mo57741c() {
            return this.f49925c;
        }

        @C0353k0
        /* renamed from: d */
        public void mo57742d() {
            if (this.f49925c) {
                if (C19532b.f49914d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.f49923a);
                }
                this.f49924b.mo57729c(this.f49923a);
            }
        }

        public String toString() {
            return this.f49924b.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$c */
    public static class C19535c extends C19476v0 {

        /* renamed from: c */
        public static final C19502x0.C19506b f49926c = new C19536a();

        /* renamed from: a */
        public C1887m<C19533a> f49927a = new C1887m<>();

        /* renamed from: b */
        public boolean f49928b = false;

        /* renamed from: androidx.loader.app.b$c$a */
        public static class C19536a implements C19502x0.C19506b {
            @C0359n0
            /* renamed from: b */
            public <T extends C19476v0> T mo21645b(@C0359n0 Class<T> cls) {
                return new C19535c();
            }
        }

        @C0359n0
        /* renamed from: e0 */
        public static C19535c m90935e0(C19392a1 a1Var) {
            return (C19535c) new C19502x0(a1Var, f49926c).mo57693a(C19535c.class);
        }

        /* renamed from: c0 */
        public void mo57744c0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f49927a.mo6353G() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + C12412q.f30348a;
                for (int i = 0; i < this.f49927a.mo6353G(); i++) {
                    C19533a H = this.f49927a.mo6354H(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f49927a.mo6368s(i));
                    printWriter.print(": ");
                    printWriter.println(H.toString());
                    H.mo57734t(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: d0 */
        public void mo57745d0() {
            this.f49928b = false;
        }

        /* renamed from: f0 */
        public <D> C19533a<D> mo57746f0(int i) {
            return this.f49927a.mo6363k(i);
        }

        /* renamed from: g0 */
        public boolean mo57747g0() {
            int G = this.f49927a.mo6353G();
            for (int i = 0; i < G; i++) {
                if (this.f49927a.mo6354H(i).mo57737v()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h0 */
        public boolean mo57748h0() {
            return this.f49928b;
        }

        /* renamed from: i0 */
        public void mo57749i0() {
            int G = this.f49927a.mo6353G();
            for (int i = 0; i < G; i++) {
                this.f49927a.mo6354H(i).mo57738w();
            }
        }

        /* renamed from: j0 */
        public void mo57750j0(int i, @C0359n0 C19533a aVar) {
            this.f49927a.mo6369t(i, aVar);
        }

        /* renamed from: k0 */
        public void mo57751k0(int i) {
            this.f49927a.mo6373x(i);
        }

        /* renamed from: l0 */
        public void mo57752l0() {
            this.f49928b = true;
        }

        public void onCleared() {
            super.onCleared();
            int G = this.f49927a.mo6353G();
            for (int i = 0; i < G; i++) {
                this.f49927a.mo6354H(i).mo57733s(true);
            }
            this.f49927a.mo6356c();
        }
    }

    public C19532b(@C0359n0 C19499w wVar, @C0359n0 C19392a1 a1Var) {
        this.f49915a = wVar;
        this.f49916b = C19535c.m90935e0(a1Var);
    }

    @C0353k0
    /* renamed from: a */
    public void mo57720a(int i) {
        if (this.f49916b.mo57748h0()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f49914d) {
                StringBuilder sb = new StringBuilder();
                sb.append("destroyLoader in ");
                sb.append(this);
                sb.append(" of ");
                sb.append(i);
            }
            C19533a f0 = this.f49916b.mo57746f0(i);
            if (f0 != null) {
                f0.mo57733s(true);
                this.f49916b.mo57751k0(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo57721b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f49916b.mo57744c0(str, fileDescriptor, printWriter, strArr);
    }

    @C0363p0
    /* renamed from: e */
    public <D> C19547c<D> mo57722e(int i) {
        if (!this.f49916b.mo57748h0()) {
            C19533a f0 = this.f49916b.mo57746f0(i);
            if (f0 != null) {
                return f0.mo57736u();
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    /* renamed from: f */
    public boolean mo57723f() {
        return this.f49916b.mo57747g0();
    }

    @C0353k0
    @C0359n0
    /* renamed from: g */
    public <D> C19547c<D> mo57724g(int i, @C0363p0 Bundle bundle, @C0359n0 C19530a.C19531a<D> aVar) {
        if (this.f49916b.mo57748h0()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C19533a f0 = this.f49916b.mo57746f0(i);
            if (f49914d) {
                StringBuilder sb = new StringBuilder();
                sb.append("initLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
            }
            if (f0 == null) {
                return mo57730j(i, bundle, aVar, (C19547c) null);
            }
            if (f49914d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Re-using existing loader ");
                sb2.append(f0);
            }
            return f0.mo57739x(this.f49915a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* renamed from: h */
    public void mo57725h() {
        this.f49916b.mo57749i0();
    }

    @C0353k0
    @C0359n0
    /* renamed from: i */
    public <D> C19547c<D> mo57726i(int i, @C0363p0 Bundle bundle, @C0359n0 C19530a.C19531a<D> aVar) {
        C19547c cVar;
        if (this.f49916b.mo57748h0()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f49914d) {
                StringBuilder sb = new StringBuilder();
                sb.append("restartLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
            }
            C19533a f0 = this.f49916b.mo57746f0(i);
            if (f0 != null) {
                cVar = f0.mo57733s(false);
            } else {
                cVar = null;
            }
            return mo57730j(i, bundle, aVar, cVar);
        } else {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
    }

    /* JADX INFO: finally extract failed */
    @C0353k0
    @C0359n0
    /* renamed from: j */
    public final <D> C19547c<D> mo57730j(int i, @C0363p0 Bundle bundle, @C0359n0 C19530a.C19531a<D> aVar, @C0363p0 C19547c<D> cVar) {
        try {
            this.f49916b.mo57752l0();
            C19547c<D> b = aVar.mo57728b(i, bundle);
            if (b != null) {
                if (b.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(b.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + b);
                    }
                }
                C19533a aVar2 = new C19533a(i, bundle, b, cVar);
                if (f49914d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Created new loader ");
                    sb.append(aVar2);
                }
                this.f49916b.mo57750j0(i, aVar2);
                this.f49916b.mo57745d0();
                return aVar2.mo57739x(this.f49915a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f49916b.mo57745d0();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C17978f.m81683a(this.f49915a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
