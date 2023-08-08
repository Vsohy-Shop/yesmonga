package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.C1185g2;
import androidx.camera.camera2.internal.compat.params.C1096d;
import androidx.camera.camera2.internal.compat.params.C1122z;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.C32487a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.camera2.internal.r2 */
public final class C1237r2 {

    /* renamed from: b */
    public static final String f3547b = "force_close";

    /* renamed from: c */
    public static final String f3548c = "deferrableSurface_close";

    /* renamed from: d */
    public static final String f3549d = "wait_for_request";
    @C0359n0

    /* renamed from: a */
    public final C1239b f3550a;

    /* renamed from: androidx.camera.camera2.internal.r2$a */
    public static class C1238a {

        /* renamed from: a */
        public final Executor f3551a;

        /* renamed from: b */
        public final ScheduledExecutorService f3552b;

        /* renamed from: c */
        public final Handler f3553c;

        /* renamed from: d */
        public final C1209m1 f3554d;

        /* renamed from: e */
        public final int f3555e;

        /* renamed from: f */
        public final Set<String> f3556f;

        public C1238a(@C0359n0 Executor executor, @C0359n0 ScheduledExecutorService scheduledExecutorService, @C0359n0 Handler handler, @C0359n0 C1209m1 m1Var, int i) {
            HashSet hashSet = new HashSet();
            this.f3556f = hashSet;
            this.f3551a = executor;
            this.f3552b = scheduledExecutorService;
            this.f3553c = handler;
            this.f3554d = m1Var;
            this.f3555e = i;
            if (i == 2) {
                hashSet.add(C1237r2.f3548c);
            }
            if (i == 2) {
                hashSet.add(C1237r2.f3549d);
            }
        }

        @C0359n0
        /* renamed from: a */
        public C1237r2 mo4643a() {
            if (this.f3556f.isEmpty()) {
                return new C1237r2(new C1211m2(this.f3554d, this.f3551a, this.f3552b, this.f3553c));
            }
            return new C1237r2(new C1230q2(this.f3556f, this.f3554d, this.f3551a, this.f3552b, this.f3553c));
        }
    }

    /* renamed from: androidx.camera.camera2.internal.r2$b */
    public interface C1239b {
        @C0359n0
        /* renamed from: a */
        Executor mo4569a();

        @C0359n0
        /* renamed from: l */
        C32487a<Void> mo4570l(@C0359n0 CameraDevice cameraDevice, @C0359n0 C1122z zVar, @C0359n0 List<DeferrableSurface> list);

        @C0359n0
        /* renamed from: m */
        C1122z mo4571m(int i, @C0359n0 List<C1096d> list, @C0359n0 C1185g2.C1186a aVar);

        @C0359n0
        /* renamed from: n */
        C32487a<List<Surface>> mo4572n(@C0359n0 List<DeferrableSurface> list, long j);

        boolean stop();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.camera2.internal.r2$c */
    public @interface C1240c {
    }

    public C1237r2(@C0359n0 C1239b bVar) {
        this.f3550a = bVar;
    }

    @C0359n0
    /* renamed from: a */
    public C1122z mo4638a(int i, @C0359n0 List<C1096d> list, @C0359n0 C1185g2.C1186a aVar) {
        return this.f3550a.mo4571m(i, list, aVar);
    }

    @C0359n0
    /* renamed from: b */
    public Executor mo4639b() {
        return this.f3550a.mo4569a();
    }

    @C0359n0
    /* renamed from: c */
    public C32487a<Void> mo4640c(@C0359n0 CameraDevice cameraDevice, @C0359n0 C1122z zVar, @C0359n0 List<DeferrableSurface> list) {
        return this.f3550a.mo4570l(cameraDevice, zVar, list);
    }

    @C0359n0
    /* renamed from: d */
    public C32487a<List<Surface>> mo4641d(@C0359n0 List<DeferrableSurface> list, long j) {
        return this.f3550a.mo4572n(list, j);
    }

    /* renamed from: e */
    public boolean mo4642e() {
        return this.f3550a.stop();
    }
}
