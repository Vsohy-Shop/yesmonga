package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.executor.C1525a;
import androidx.camera.core.impl.utils.futures.C1544c;
import androidx.camera.core.impl.utils.futures.C1548f;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.C17970d;
import androidx.core.util.C18001r;
import com.google.auto.value.C32455c;
import com.google.common.util.concurrent.C32487a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class SurfaceRequest {

    /* renamed from: a */
    public final Size f3859a;

    /* renamed from: b */
    public final boolean f3860b;

    /* renamed from: c */
    public final CameraInternal f3861c;

    /* renamed from: d */
    public final C32487a<Surface> f3862d;

    /* renamed from: e */
    public final CallbackToFutureAdapter.C16559a<Surface> f3863e;

    /* renamed from: f */
    public final C32487a<Void> f3864f;

    /* renamed from: g */
    public final CallbackToFutureAdapter.C16559a<Void> f3865g;

    /* renamed from: h */
    public final DeferrableSurface f3866h;
    @C0363p0

    /* renamed from: i */
    public C1342f f3867i;
    @C0363p0

    /* renamed from: j */
    public C1343g f3868j;
    @C0363p0

    /* renamed from: k */
    public Executor f3869k;

    public static final class RequestCancelledException extends RuntimeException {
        public RequestCancelledException(@C0359n0 String str, @C0359n0 Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$a */
    public class C1336a implements C1544c<Void> {

        /* renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.C16559a f3870a;

        /* renamed from: b */
        public final /* synthetic */ C32487a f3871b;

        public C1336a(CallbackToFutureAdapter.C16559a aVar, C32487a aVar2) {
            this.f3870a = aVar;
            this.f3871b = aVar2;
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            if (th instanceof RequestCancelledException) {
                C18001r.m81777n(this.f3871b.cancel(false));
            } else {
                C18001r.m81777n(this.f3870a.mo48125c(null));
            }
        }

        /* renamed from: c */
        public void mo4160a(@C0363p0 Void voidR) {
            C18001r.m81777n(this.f3870a.mo48125c(null));
        }
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$b */
    public class C1337b extends DeferrableSurface {
        public C1337b() {
        }

        @C0359n0
        /* renamed from: l */
        public C32487a<Surface> mo4935l() {
            return SurfaceRequest.this.f3862d;
        }
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$c */
    public class C1338c implements C1544c<Surface> {

        /* renamed from: a */
        public final /* synthetic */ C32487a f3874a;

        /* renamed from: b */
        public final /* synthetic */ CallbackToFutureAdapter.C16559a f3875b;

        /* renamed from: c */
        public final /* synthetic */ String f3876c;

        public C1338c(C32487a aVar, CallbackToFutureAdapter.C16559a aVar2, String str) {
            this.f3874a = aVar;
            this.f3875b = aVar2;
            this.f3876c = str;
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            if (th instanceof CancellationException) {
                CallbackToFutureAdapter.C16559a aVar = this.f3875b;
                C18001r.m81777n(aVar.mo48128f(new RequestCancelledException(this.f3876c + " cancelled.", th)));
                return;
            }
            this.f3875b.mo48125c(null);
        }

        /* renamed from: c */
        public void mo4160a(@C0363p0 Surface surface) {
            C1548f.m6482k(this.f3874a, this.f3875b);
        }
    }

    /* renamed from: androidx.camera.core.SurfaceRequest$d */
    public class C1339d implements C1544c<Void> {

        /* renamed from: a */
        public final /* synthetic */ C17970d f3878a;

        /* renamed from: b */
        public final /* synthetic */ Surface f3879b;

        public C1339d(C17970d dVar, Surface surface) {
            this.f3878a = dVar;
            this.f3879b = surface;
        }

        /* renamed from: b */
        public void mo4161b(Throwable th) {
            C18001r.m81778o(th instanceof RequestCancelledException, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.f3878a.accept(C1340e.m5640c(1, this.f3879b));
        }

        /* renamed from: c */
        public void mo4160a(@C0363p0 Void voidR) {
            this.f3878a.accept(C1340e.m5640c(0, this.f3879b));
        }
    }

    @C32455c
    /* renamed from: androidx.camera.core.SurfaceRequest$e */
    public static abstract class C1340e {

        /* renamed from: a */
        public static final int f3881a = 0;

        /* renamed from: b */
        public static final int f3882b = 1;

        /* renamed from: c */
        public static final int f3883c = 2;

        /* renamed from: d */
        public static final int f3884d = 3;

        /* renamed from: e */
        public static final int f3885e = 4;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.camera.core.SurfaceRequest$e$a */
        public @interface C1341a {
        }

        @C0359n0
        /* renamed from: c */
        public static C1340e m5640c(int i, @C0359n0 Surface surface) {
            return new C1409h(i, surface);
        }

        /* renamed from: a */
        public abstract int mo4938a();

        @C0359n0
        /* renamed from: b */
        public abstract Surface mo4939b();
    }

    @C1631k0
    @C32455c
    /* renamed from: androidx.camera.core.SurfaceRequest$f */
    public static abstract class C1342f {
        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: d */
        public static C1342f m5643d(@C0359n0 Rect rect, int i, int i2) {
            return new C1414i(rect, i, i2);
        }

        @C0359n0
        /* renamed from: a */
        public abstract Rect mo4940a();

        /* renamed from: b */
        public abstract int mo4941b();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: c */
        public abstract int mo4942c();
    }

    @C1631k0
    /* renamed from: androidx.camera.core.SurfaceRequest$g */
    public interface C1343g {
        /* renamed from: a */
        void mo4943a(@C0359n0 C1342f fVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SurfaceRequest(@C0359n0 Size size, @C0359n0 CameraInternal cameraInternal, boolean z) {
        this.f3859a = size;
        this.f3861c = cameraInternal;
        this.f3860b = z;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference((Object) null);
        C32487a a = CallbackToFutureAdapter.m74987a(new C1418i3(atomicReference, str));
        CallbackToFutureAdapter.C16559a<Void> aVar = (CallbackToFutureAdapter.C16559a) C18001r.m81775l((CallbackToFutureAdapter.C16559a) atomicReference.get());
        this.f3865g = aVar;
        AtomicReference atomicReference2 = new AtomicReference((Object) null);
        C32487a<Void> a2 = CallbackToFutureAdapter.m74987a(new C1628j3(atomicReference2, str));
        this.f3864f = a2;
        C1548f.m6473b(a2, new C1336a(aVar, a), C1525a.m6437a());
        AtomicReference atomicReference3 = new AtomicReference((Object) null);
        C32487a<Surface> a3 = CallbackToFutureAdapter.m74987a(new C1634k3(atomicReference3, str));
        this.f3862d = a3;
        this.f3863e = (CallbackToFutureAdapter.C16559a) C18001r.m81775l((CallbackToFutureAdapter.C16559a) atomicReference3.get());
        C1337b bVar = new C1337b();
        this.f3866h = bVar;
        C32487a<Void> f = bVar.mo5139f();
        C1548f.m6473b(a3, new C1338c(f, (CallbackToFutureAdapter.C16559a) C18001r.m81775l((CallbackToFutureAdapter.C16559a) atomicReference2.get()), str), C1525a.m6437a());
        f.mo5489q(new C1640l3(this), C1525a.m6437a());
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m5615r() {
        this.f3862d.cancel(true);
    }

    @SuppressLint({"PairedRegistration"})
    /* renamed from: i */
    public void mo4924i(@C0359n0 Executor executor, @C0359n0 Runnable runnable) {
        this.f3865g.mo48123a(runnable, executor);
    }

    @C1631k0
    /* renamed from: j */
    public void mo4925j() {
        this.f3868j = null;
        this.f3869k = null;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: k */
    public CameraInternal mo4926k() {
        return this.f3861c;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: l */
    public DeferrableSurface mo4927l() {
        return this.f3866h;
    }

    @C0359n0
    /* renamed from: m */
    public Size mo4928m() {
        return this.f3859a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public boolean mo4929n() {
        return this.f3860b;
    }

    /* renamed from: w */
    public void mo4930w(@C0359n0 Surface surface, @C0359n0 Executor executor, @C0359n0 C17970d<C1340e> dVar) {
        if (this.f3863e.mo48125c(surface) || this.f3862d.isCancelled()) {
            C1548f.m6473b(this.f3864f, new C1339d(dVar, surface), executor);
            return;
        }
        C18001r.m81777n(this.f3862d.isDone());
        try {
            this.f3862d.get();
            executor.execute(new C1408g3(dVar, surface));
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new C1413h3(dVar, surface));
        }
    }

    @C1631k0
    /* renamed from: x */
    public void mo4931x(@C0359n0 Executor executor, @C0359n0 C1343g gVar) {
        this.f3868j = gVar;
        this.f3869k = executor;
        C1342f fVar = this.f3867i;
        if (fVar != null) {
            executor.execute(new C1646m3(gVar, fVar));
        }
    }

    @C1631k0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: y */
    public void mo4932y(@C0359n0 C1342f fVar) {
        this.f3867i = fVar;
        C1343g gVar = this.f3868j;
        if (gVar != null) {
            this.f3869k.execute(new C1655n3(gVar, fVar));
        }
    }

    /* renamed from: z */
    public boolean mo4933z() {
        return this.f3863e.mo48128f(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }
}
