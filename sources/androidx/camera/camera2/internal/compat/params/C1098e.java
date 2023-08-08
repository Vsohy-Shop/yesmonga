package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.core.util.C18001r;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@C0376v0(24)
/* renamed from: androidx.camera.camera2.internal.compat.params.e */
public class C1098e extends C1109n {

    /* renamed from: androidx.camera.camera2.internal.compat.params.e$a */
    public static final class C1099a {

        /* renamed from: a */
        public final OutputConfiguration f3311a;
        @C0363p0

        /* renamed from: b */
        public String f3312b;

        /* renamed from: c */
        public boolean f3313c;

        public C1099a(@C0359n0 OutputConfiguration outputConfiguration) {
            this.f3311a = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1099a)) {
                return false;
            }
            C1099a aVar = (C1099a) obj;
            if (!Objects.equals(this.f3311a, aVar.f3311a) || this.f3313c != aVar.f3313c || !Objects.equals(this.f3312b, aVar.f3312b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = this.f3311a.hashCode() ^ 31;
            boolean z = this.f3313c ^ ((hashCode << 5) - hashCode);
            int i2 = ((z ? 1 : 0) << true) - z;
            String str = this.f3312b;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            return i ^ i2;
        }
    }

    public C1098e(@C0359n0 Surface surface) {
        this((Object) new C1099a(new OutputConfiguration(surface)));
    }

    @C0376v0(24)
    /* renamed from: l */
    public static C1098e m4712l(@C0359n0 OutputConfiguration outputConfiguration) {
        return new C1098e((Object) new C1099a(outputConfiguration));
    }

    @C0363p0
    /* renamed from: a */
    public Surface mo4367a() {
        return ((OutputConfiguration) mo4376j()).getSurface();
    }

    /* renamed from: d */
    public void mo4370d(@C0363p0 String str) {
        ((C1099a) this.f3319a).f3312b = str;
    }

    @C0359n0
    /* renamed from: f */
    public List<Surface> mo4372f() {
        return Collections.singletonList(mo4367a());
    }

    /* renamed from: g */
    public int mo4373g() {
        return ((OutputConfiguration) mo4376j()).getSurfaceGroupId();
    }

    @C0363p0
    /* renamed from: h */
    public String mo4374h() {
        return ((C1099a) this.f3319a).f3312b;
    }

    /* renamed from: i */
    public void mo4375i() {
        ((C1099a) this.f3319a).f3313c = true;
    }

    /* renamed from: j */
    public Object mo4376j() {
        C18001r.m81764a(this.f3319a instanceof C1099a);
        return ((C1099a) this.f3319a).f3311a;
    }

    /* renamed from: k */
    public boolean mo4377k() {
        return ((C1099a) this.f3319a).f3313c;
    }

    public C1098e(@C0359n0 Object obj) {
        super(obj);
    }
}
