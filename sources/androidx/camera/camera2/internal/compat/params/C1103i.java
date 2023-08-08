package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.camera.core.C1417i2;
import androidx.core.util.C18001r;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

@C0376v0(26)
/* renamed from: androidx.camera.camera2.internal.compat.params.i */
public class C1103i extends C1098e {

    /* renamed from: c */
    public static final String f3314c = "MAX_SURFACES_COUNT";

    /* renamed from: d */
    public static final String f3315d = "mSurfaces";

    /* renamed from: androidx.camera.camera2.internal.compat.params.i$a */
    public static final class C1104a {

        /* renamed from: a */
        public final OutputConfiguration f3316a;
        @C0363p0

        /* renamed from: b */
        public String f3317b;

        public C1104a(@C0359n0 OutputConfiguration outputConfiguration) {
            this.f3316a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1104a)) {
                return false;
            }
            C1104a aVar = (C1104a) obj;
            if (!Objects.equals(this.f3316a, aVar.f3316a) || !Objects.equals(this.f3317b, aVar.f3317b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = this.f3316a.hashCode() ^ 31;
            int i2 = (hashCode << 5) - hashCode;
            String str = this.f3317b;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            return i ^ i2;
        }
    }

    public C1103i(@C0359n0 Surface surface) {
        this((Object) new C1104a(new OutputConfiguration(surface)));
    }

    /* renamed from: m */
    public static int m4724m() throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = OutputConfiguration.class.getDeclaredField(f3314c);
        declaredField.setAccessible(true);
        return declaredField.getInt((Object) null);
    }

    /* renamed from: n */
    public static List<Surface> m4725n(OutputConfiguration outputConfiguration) throws NoSuchFieldException, IllegalAccessException {
        Field declaredField = OutputConfiguration.class.getDeclaredField(f3315d);
        declaredField.setAccessible(true);
        return (List) declaredField.get(outputConfiguration);
    }

    @C0376v0(26)
    /* renamed from: o */
    public static C1103i m4726o(@C0359n0 OutputConfiguration outputConfiguration) {
        return new C1103i((Object) new C1104a(outputConfiguration));
    }

    /* renamed from: b */
    public void mo4368b(@C0359n0 Surface surface) {
        ((OutputConfiguration) mo4376j()).addSurface(surface);
    }

    /* renamed from: c */
    public void mo4369c(@C0359n0 Surface surface) {
        if (mo4367a() != surface) {
            try {
                if (!m4725n((OutputConfiguration) mo4376j()).remove(surface)) {
                    throw new IllegalArgumentException("Surface is not part of this output configuration");
                }
            } catch (IllegalAccessException | NoSuchFieldException e) {
                C1417i2.m5914d(C1109n.f3318b, "Unable to remove surface from this output configuration.", e);
            }
        } else {
            throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
        }
    }

    /* renamed from: d */
    public void mo4370d(@C0363p0 String str) {
        ((C1104a) this.f3319a).f3317b = str;
    }

    /* renamed from: e */
    public int mo4371e() {
        try {
            return m4724m();
        } catch (IllegalAccessException | NoSuchFieldException e) {
            C1417i2.m5914d(C1109n.f3318b, "Unable to retrieve max shared surface count.", e);
            return super.mo4371e();
        }
    }

    @C0359n0
    /* renamed from: f */
    public List<Surface> mo4372f() {
        return ((OutputConfiguration) mo4376j()).getSurfaces();
    }

    @C0363p0
    /* renamed from: h */
    public String mo4374h() {
        return ((C1104a) this.f3319a).f3317b;
    }

    /* renamed from: i */
    public void mo4375i() {
        ((OutputConfiguration) mo4376j()).enableSurfaceSharing();
    }

    /* renamed from: j */
    public Object mo4376j() {
        C18001r.m81764a(this.f3319a instanceof C1104a);
        return ((C1104a) this.f3319a).f3316a;
    }

    /* renamed from: k */
    public final boolean mo4377k() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    public C1103i(@C0359n0 Object obj) {
        super(obj);
    }
}
