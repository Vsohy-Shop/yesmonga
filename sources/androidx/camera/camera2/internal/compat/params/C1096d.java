package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import java.util.List;

@C0376v0(21)
/* renamed from: androidx.camera.camera2.internal.compat.params.d */
public final class C1096d {

    /* renamed from: b */
    public static final int f3309b = -1;

    /* renamed from: a */
    public final C1097a f3310a;

    /* renamed from: androidx.camera.camera2.internal.compat.params.d$a */
    public interface C1097a {
        @C0363p0
        /* renamed from: a */
        Surface mo4367a();

        /* renamed from: b */
        void mo4368b(@C0359n0 Surface surface);

        /* renamed from: c */
        void mo4369c(@C0359n0 Surface surface);

        /* renamed from: d */
        void mo4370d(@C0363p0 String str);

        /* renamed from: e */
        int mo4371e();

        /* renamed from: f */
        List<Surface> mo4372f();

        /* renamed from: g */
        int mo4373g();

        @C0363p0
        /* renamed from: h */
        String mo4374h();

        /* renamed from: i */
        void mo4375i();

        @C0363p0
        /* renamed from: j */
        Object mo4376j();
    }

    public C1096d(@C0359n0 Surface surface) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f3310a = new C1108m(surface);
        } else if (i >= 26) {
            this.f3310a = new C1103i(surface);
        } else {
            this.f3310a = new C1098e(surface);
        }
    }

    @C0363p0
    /* renamed from: k */
    public static C1096d m4691k(@C0363p0 Object obj) {
        C1097a aVar;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            aVar = C1108m.m4739p((OutputConfiguration) obj);
        } else if (i >= 26) {
            aVar = C1103i.m4726o((OutputConfiguration) obj);
        } else {
            aVar = C1098e.m4712l((OutputConfiguration) obj);
        }
        if (aVar == null) {
            return null;
        }
        return new C1096d(aVar);
    }

    /* renamed from: a */
    public void mo4355a(@C0359n0 Surface surface) {
        this.f3310a.mo4368b(surface);
    }

    /* renamed from: b */
    public void mo4356b() {
        this.f3310a.mo4375i();
    }

    /* renamed from: c */
    public int mo4357c() {
        return this.f3310a.mo4371e();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: d */
    public String mo4358d() {
        return this.f3310a.mo4374h();
    }

    @C0363p0
    /* renamed from: e */
    public Surface mo4359e() {
        return this.f3310a.mo4367a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1096d)) {
            return false;
        }
        return this.f3310a.equals(((C1096d) obj).f3310a);
    }

    /* renamed from: f */
    public int mo4361f() {
        return this.f3310a.mo4373g();
    }

    @C0359n0
    /* renamed from: g */
    public List<Surface> mo4362g() {
        return this.f3310a.mo4372f();
    }

    /* renamed from: h */
    public void mo4363h(@C0359n0 Surface surface) {
        this.f3310a.mo4369c(surface);
    }

    public int hashCode() {
        return this.f3310a.hashCode();
    }

    /* renamed from: i */
    public void mo4365i(@C0363p0 String str) {
        this.f3310a.mo4370d(str);
    }

    @C0363p0
    /* renamed from: j */
    public Object mo4366j() {
        return this.f3310a.mo4376j();
    }

    @C0376v0(26)
    public <T> C1096d(@C0359n0 Size size, @C0359n0 Class<T> cls) {
        C1095c.m4690a();
        OutputConfiguration a = C1094b.m4689a(size, cls);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3310a = C1108m.m4739p(a);
        } else {
            this.f3310a = C1103i.m4726o(a);
        }
    }

    public C1096d(@C0359n0 C1097a aVar) {
        this.f3310a = aVar;
    }
}
