package com.google.mlkit.vision.common.internal;

import androidx.annotation.RecentlyNonNull;
import androidx.lifecycle.C19428i0;
import androidx.lifecycle.C19475v;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40777k;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.mlkit_vision_common.C39272r6;
import com.google.android.gms.tasks.C31029b;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import com.google.android.odml.image.C31850h;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.C33941g;
import com.google.mlkit.vision.common.C34025b;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@C40473a
public class MobileVisionBase<DetectionResultT> implements Closeable, C19475v {

    /* renamed from: e */
    public static final C40777k f82659e = new C40777k("MobileVisionBase", "");

    /* renamed from: f */
    public static final /* synthetic */ int f82660f = 0;

    /* renamed from: a */
    public final AtomicBoolean f82661a = new AtomicBoolean(false);

    /* renamed from: b */
    public final C33941g<DetectionResultT, C34025b> f82662b;

    /* renamed from: c */
    public final C31029b f82663c;

    /* renamed from: d */
    public final Executor f82664d;

    @C40473a
    public MobileVisionBase(@RecentlyNonNull C33941g<DetectionResultT, C34025b> gVar, @RecentlyNonNull Executor executor) {
        this.f82662b = gVar;
        C31029b bVar = new C31029b();
        this.f82663c = bVar;
        this.f82664d = executor;
        gVar.mo98729d();
        gVar.mo98726a(executor, C34045l.f82687a, bVar.mo87709b()).mo87724h(C34042i.f82682a);
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public synchronized C31047k<DetectionResultT> mo98972a(@RecentlyNonNull C31850h hVar) {
        C40843u.m166203m(hVar, "MlImage can not be null");
        if (this.f82661a.get()) {
            return C31053n.m124524f(new MlKitException("This detector is already closed!", 14));
        } else if (hVar.getWidth() < 32 || hVar.getHeight() < 32) {
            return C31053n.m124524f(new MlKitException("MlImage width and height should be at least 32!", 3));
        } else {
            hVar.mo92361b().mo92368a();
            return this.f82662b.mo98726a(this.f82664d, new C34043j(this, hVar), this.f82663c.mo87709b()).mo87721e(new C34041h(hVar));
        }
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: b */
    public synchronized C31047k<DetectionResultT> mo98973b(@RecentlyNonNull C34025b bVar) {
        C40843u.m166203m(bVar, "InputImage can not be null");
        if (this.f82661a.get()) {
            return C31053n.m124524f(new MlKitException("This detector is already closed!", 14));
        } else if (bVar.mo98963m() < 32 || bVar.mo98959i() < 32) {
            return C31053n.m124524f(new MlKitException("InputImage width and height should be at least 32!", 3));
        } else {
            return this.f82662b.mo98726a(this.f82664d, new C34044k(this, bVar), this.f82663c.mo87709b());
        }
    }

    @RecentlyNonNull
    /* renamed from: c */
    public final /* synthetic */ Object mo98974c(@RecentlyNonNull C34025b bVar) throws Exception {
        C39272r6 g = C39272r6.m161335g("detectorTaskWithResource#run");
        g.mo123317b();
        try {
            DetectionResultT i = this.f82662b.mo98710i(bVar);
            g.close();
            return i;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @C40473a
    @C19428i0(Lifecycle.C19372Event.ON_DESTROY)
    public synchronized void close() {
        if (!this.f82661a.getAndSet(true)) {
            this.f82663c.mo87708a();
            this.f82662b.mo98731f(this.f82664d);
        }
    }

    @RecentlyNonNull
    /* renamed from: d */
    public final /* synthetic */ Object mo98976d(@RecentlyNonNull C31850h hVar) throws Exception {
        C34025b c = C34033c.m136927c(hVar);
        if (c != null) {
            return this.f82662b.mo98710i(c);
        }
        throw new MlKitException("Current type of MlImage is not supported.", 13);
    }
}
