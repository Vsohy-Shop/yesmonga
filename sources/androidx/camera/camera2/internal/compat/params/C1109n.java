package androidx.camera.camera2.internal.compat.params;

import android.annotation.SuppressLint;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.camera.camera2.internal.compat.params.C1096d;
import androidx.camera.core.C1417i2;
import androidx.core.util.C18001r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@C0376v0(21)
/* renamed from: androidx.camera.camera2.internal.compat.params.n */
public class C1109n implements C1096d.C1097a {

    /* renamed from: b */
    public static final String f3318b = "OutputConfigCompat";

    /* renamed from: a */
    public final Object f3319a;

    /* renamed from: androidx.camera.camera2.internal.compat.params.n$a */
    public static final class C1110a {

        /* renamed from: g */
        public static final int f3320g = 1;

        /* renamed from: h */
        public static final String f3321h = "android.hardware.camera2.legacy.LegacyCameraDevice";

        /* renamed from: i */
        public static final String f3322i = "getSurfaceSize";

        /* renamed from: j */
        public static final String f3323j = "detectSurfaceType";

        /* renamed from: k */
        public static final String f3324k = "getGenerationId";

        /* renamed from: a */
        public final List<Surface> f3325a;

        /* renamed from: b */
        public final Size f3326b;

        /* renamed from: c */
        public final int f3327c;

        /* renamed from: d */
        public final int f3328d;
        @C0363p0

        /* renamed from: e */
        public String f3329e;

        /* renamed from: f */
        public boolean f3330f = false;

        public C1110a(@C0359n0 Surface surface) {
            C18001r.m81776m(surface, "Surface must not be null");
            this.f3325a = Collections.singletonList(surface);
            this.f3326b = m4758c(surface);
            this.f3327c = m4756a(surface);
            this.f3328d = m4757b(surface);
        }

        @SuppressLint({"BlockedPrivateApi"})
        /* renamed from: a */
        public static int m4756a(@C0359n0 Surface surface) {
            try {
                return ((Integer) Class.forName(f3321h).getDeclaredMethod(f3323j, new Class[]{Surface.class}).invoke((Object) null, new Object[]{surface})).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C1417i2.m5914d(C1109n.f3318b, "Unable to retrieve surface format.", e);
                return 0;
            }
        }

        @SuppressLint({"SoonBlockedPrivateApi"})
        /* renamed from: b */
        public static int m4757b(@C0359n0 Surface surface) {
            try {
                return ((Integer) Surface.class.getDeclaredMethod(f3324k, new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C1417i2.m5914d(C1109n.f3318b, "Unable to retrieve surface generation id.", e);
                return -1;
            }
        }

        @SuppressLint({"BlockedPrivateApi"})
        /* renamed from: c */
        public static Size m4758c(@C0359n0 Surface surface) {
            try {
                Method declaredMethod = Class.forName(f3321h).getDeclaredMethod(f3322i, new Class[]{Surface.class});
                declaredMethod.setAccessible(true);
                return (Size) declaredMethod.invoke((Object) null, new Object[]{surface});
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C1417i2.m5914d(C1109n.f3318b, "Unable to retrieve surface size.", e);
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1110a)) {
                return false;
            }
            C1110a aVar = (C1110a) obj;
            if (!this.f3326b.equals(aVar.f3326b) || this.f3327c != aVar.f3327c || this.f3328d != aVar.f3328d || this.f3330f != aVar.f3330f || !Objects.equals(this.f3329e, aVar.f3329e)) {
                return false;
            }
            int min = Math.min(this.f3325a.size(), aVar.f3325a.size());
            for (int i = 0; i < min; i++) {
                if (this.f3325a.get(i) != aVar.f3325a.get(i)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = this.f3325a.hashCode() ^ 31;
            int i2 = this.f3328d ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f3326b.hashCode() ^ ((i2 << 5) - i2);
            int i3 = this.f3327c ^ ((hashCode2 << 5) - hashCode2);
            boolean z = this.f3330f ^ ((i3 << 5) - i3);
            int i4 = ((z ? 1 : 0) << true) - z;
            String str = this.f3329e;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            return i ^ i4;
        }
    }

    public C1109n(@C0359n0 Surface surface) {
        this.f3319a = new C1110a(surface);
    }

    @C0363p0
    /* renamed from: a */
    public Surface mo4367a() {
        List<Surface> list = ((C1110a) this.f3319a).f3325a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: b */
    public void mo4368b(@C0359n0 Surface surface) {
        C18001r.m81776m(surface, "Surface must not be null");
        if (mo4367a() == surface) {
            throw new IllegalStateException("Surface is already added!");
        } else if (!mo4377k()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        } else {
            throw new IllegalArgumentException("Exceeds maximum number of surfaces");
        }
    }

    /* renamed from: c */
    public void mo4369c(@C0359n0 Surface surface) {
        if (mo4367a() == surface) {
            throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
        }
        throw new IllegalArgumentException("Surface is not part of this output configuration");
    }

    /* renamed from: d */
    public void mo4370d(@C0363p0 String str) {
        ((C1110a) this.f3319a).f3329e = str;
    }

    /* renamed from: e */
    public int mo4371e() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1109n)) {
            return false;
        }
        return Objects.equals(this.f3319a, ((C1109n) obj).f3319a);
    }

    @C0359n0
    /* renamed from: f */
    public List<Surface> mo4372f() {
        return ((C1110a) this.f3319a).f3325a;
    }

    /* renamed from: g */
    public int mo4373g() {
        return -1;
    }

    @C0363p0
    /* renamed from: h */
    public String mo4374h() {
        return ((C1110a) this.f3319a).f3329e;
    }

    public int hashCode() {
        return this.f3319a.hashCode();
    }

    /* renamed from: i */
    public void mo4375i() {
        ((C1110a) this.f3319a).f3330f = true;
    }

    @C0363p0
    /* renamed from: j */
    public Object mo4376j() {
        return null;
    }

    /* renamed from: k */
    public boolean mo4377k() {
        return ((C1110a) this.f3319a).f3330f;
    }

    public C1109n(@C0359n0 Object obj) {
        this.f3319a = obj;
    }
}
