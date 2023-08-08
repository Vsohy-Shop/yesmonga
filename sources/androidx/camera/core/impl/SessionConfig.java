package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.annotation.C0359n0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.impl.C1583y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class SessionConfig {

    /* renamed from: a */
    public final List<DeferrableSurface> f4143a;

    /* renamed from: b */
    public final List<CameraDevice.StateCallback> f4144b;

    /* renamed from: c */
    public final List<CameraCaptureSession.StateCallback> f4145c;

    /* renamed from: d */
    public final List<C1448f> f4146d;

    /* renamed from: e */
    public final List<C1425c> f4147e;

    /* renamed from: f */
    public final C1583y f4148f;

    public enum SessionError {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$a */
    public static class C1423a {

        /* renamed from: a */
        public final Set<DeferrableSurface> f4152a = new HashSet();

        /* renamed from: b */
        public final C1583y.C1584a f4153b = new C1583y.C1584a();

        /* renamed from: c */
        public final List<CameraDevice.StateCallback> f4154c = new ArrayList();

        /* renamed from: d */
        public final List<CameraCaptureSession.StateCallback> f4155d = new ArrayList();

        /* renamed from: e */
        public final List<C1425c> f4156e = new ArrayList();

        /* renamed from: f */
        public final List<C1448f> f4157f = new ArrayList();
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$b */
    public static class C1424b extends C1423a {
        @C0359n0
        /* renamed from: p */
        public static C1424b m6009p(@C0359n0 C1488o1<?> o1Var) {
            C1426d X = o1Var.mo5286X((C1426d) null);
            if (X != null) {
                C1424b bVar = new C1424b();
                X.mo4714a(o1Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + o1Var.mo5602v(o1Var.toString()));
        }

        /* renamed from: a */
        public void mo5153a(@C0359n0 Collection<C1448f> collection) {
            this.f4153b.mo5553a(collection);
            this.f4157f.addAll(collection);
        }

        /* renamed from: b */
        public void mo5154b(@C0359n0 Collection<CameraDevice.StateCallback> collection) {
            for (CameraDevice.StateCallback f : collection) {
                mo5158f(f);
            }
        }

        /* renamed from: c */
        public void mo5155c(@C0359n0 Collection<C1448f> collection) {
            this.f4153b.mo5553a(collection);
        }

        /* renamed from: d */
        public void mo5156d(@C0359n0 List<CameraCaptureSession.StateCallback> list) {
            for (CameraCaptureSession.StateCallback k : list) {
                mo5163k(k);
            }
        }

        /* renamed from: e */
        public void mo5157e(@C0359n0 C1448f fVar) {
            this.f4153b.mo5555c(fVar);
            this.f4157f.add(fVar);
        }

        /* renamed from: f */
        public void mo5158f(@C0359n0 CameraDevice.StateCallback stateCallback) {
            if (!this.f4154c.contains(stateCallback)) {
                this.f4154c.add(stateCallback);
                return;
            }
            throw new IllegalArgumentException("Duplicate device state callback.");
        }

        /* renamed from: g */
        public void mo5159g(@C0359n0 C1425c cVar) {
            this.f4156e.add(cVar);
        }

        /* renamed from: h */
        public void mo5160h(@C0359n0 Config config) {
            this.f4153b.mo5557e(config);
        }

        /* renamed from: i */
        public void mo5161i(@C0359n0 DeferrableSurface deferrableSurface) {
            this.f4152a.add(deferrableSurface);
        }

        /* renamed from: j */
        public void mo5162j(@C0359n0 C1448f fVar) {
            this.f4153b.mo5555c(fVar);
        }

        /* renamed from: k */
        public void mo5163k(@C0359n0 CameraCaptureSession.StateCallback stateCallback) {
            if (!this.f4155d.contains(stateCallback)) {
                this.f4155d.add(stateCallback);
                return;
            }
            throw new IllegalArgumentException("Duplicate session state callback.");
        }

        /* renamed from: l */
        public void mo5164l(@C0359n0 DeferrableSurface deferrableSurface) {
            this.f4152a.add(deferrableSurface);
            this.f4153b.mo5558f(deferrableSurface);
        }

        /* renamed from: m */
        public void mo5165m(@C0359n0 String str, @C0359n0 Integer num) {
            this.f4153b.mo5559g(str, num);
        }

        @C0359n0
        /* renamed from: n */
        public SessionConfig mo5166n() {
            return new SessionConfig(new ArrayList(this.f4152a), this.f4154c, this.f4155d, this.f4157f, this.f4156e, this.f4153b.mo5560h());
        }

        /* renamed from: o */
        public void mo5167o() {
            this.f4152a.clear();
            this.f4153b.mo5561i();
        }

        @C0359n0
        /* renamed from: q */
        public List<C1448f> mo5168q() {
            return Collections.unmodifiableList(this.f4157f);
        }

        /* renamed from: r */
        public void mo5169r(@C0359n0 DeferrableSurface deferrableSurface) {
            this.f4152a.remove(deferrableSurface);
            this.f4153b.mo5567q(deferrableSurface);
        }

        /* renamed from: s */
        public void mo5170s(@C0359n0 Config config) {
            this.f4153b.mo5568r(config);
        }

        /* renamed from: t */
        public void mo5171t(int i) {
            this.f4153b.mo5569s(i);
        }
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$c */
    public interface C1425c {
        /* renamed from: a */
        void mo5030a(@C0359n0 SessionConfig sessionConfig, @C0359n0 SessionError sessionError);
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$d */
    public interface C1426d {
        /* renamed from: a */
        void mo4714a(@C0359n0 C1488o1<?> o1Var, @C0359n0 C1424b bVar);
    }

    /* renamed from: androidx.camera.core.impl.SessionConfig$e */
    public static final class C1427e extends C1423a {

        /* renamed from: i */
        public static final String f4158i = "ValidatingBuilder";

        /* renamed from: g */
        public boolean f4159g = true;

        /* renamed from: h */
        public boolean f4160h = false;

        /* renamed from: a */
        public void mo5172a(@C0359n0 SessionConfig sessionConfig) {
            C1583y f = sessionConfig.mo5148f();
            if (f.mo5551f() != -1) {
                if (!this.f4160h) {
                    this.f4153b.mo5569s(f.mo5551f());
                    this.f4160h = true;
                } else if (this.f4153b.mo5565o() != f.mo5551f()) {
                    C1417i2.m5911a(f4158i, "Invalid configuration due to template type: " + this.f4153b.mo5565o() + " != " + f.mo5551f());
                    this.f4159g = false;
                }
            }
            this.f4153b.mo5554b(sessionConfig.mo5148f().mo5550e());
            this.f4154c.addAll(sessionConfig.mo5144b());
            this.f4155d.addAll(sessionConfig.mo5149g());
            this.f4153b.mo5553a(sessionConfig.mo5147e());
            this.f4157f.addAll(sessionConfig.mo5150h());
            this.f4156e.addAll(sessionConfig.mo5145c());
            this.f4152a.addAll(sessionConfig.mo5151i());
            this.f4153b.mo5563m().addAll(f.mo5549d());
            if (!this.f4152a.containsAll(this.f4153b.mo5563m())) {
                C1417i2.m5911a(f4158i, "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f4159g = false;
            }
            this.f4153b.mo5557e(f.mo5548c());
        }

        @C0359n0
        /* renamed from: b */
        public SessionConfig mo5173b() {
            if (this.f4159g) {
                return new SessionConfig(new ArrayList(this.f4152a), this.f4154c, this.f4155d, this.f4157f, this.f4156e, this.f4153b.mo5560h());
            }
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }

        /* renamed from: c */
        public boolean mo5174c() {
            return this.f4160h && this.f4159g;
        }
    }

    public SessionConfig(List<DeferrableSurface> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<C1448f> list4, List<C1425c> list5, C1583y yVar) {
        this.f4143a = list;
        this.f4144b = Collections.unmodifiableList(list2);
        this.f4145c = Collections.unmodifiableList(list3);
        this.f4146d = Collections.unmodifiableList(list4);
        this.f4147e = Collections.unmodifiableList(list5);
        this.f4148f = yVar;
    }

    @C0359n0
    /* renamed from: a */
    public static SessionConfig m5999a() {
        return new SessionConfig(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new C1583y.C1584a().mo5560h());
    }

    @C0359n0
    /* renamed from: b */
    public List<CameraDevice.StateCallback> mo5144b() {
        return this.f4144b;
    }

    @C0359n0
    /* renamed from: c */
    public List<C1425c> mo5145c() {
        return this.f4147e;
    }

    @C0359n0
    /* renamed from: d */
    public Config mo5146d() {
        return this.f4148f.mo5548c();
    }

    @C0359n0
    /* renamed from: e */
    public List<C1448f> mo5147e() {
        return this.f4148f.mo5547b();
    }

    @C0359n0
    /* renamed from: f */
    public C1583y mo5148f() {
        return this.f4148f;
    }

    @C0359n0
    /* renamed from: g */
    public List<CameraCaptureSession.StateCallback> mo5149g() {
        return this.f4145c;
    }

    @C0359n0
    /* renamed from: h */
    public List<C1448f> mo5150h() {
        return this.f4146d;
    }

    @C0359n0
    /* renamed from: i */
    public List<DeferrableSurface> mo5151i() {
        return Collections.unmodifiableList(this.f4143a);
    }

    /* renamed from: j */
    public int mo5152j() {
        return this.f4148f.mo5551f();
    }
}
