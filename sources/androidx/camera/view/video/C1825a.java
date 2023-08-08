package androidx.camera.view.video;

import android.location.Location;
import androidx.annotation.C0363p0;
import androidx.camera.view.video.C1833e;

/* renamed from: androidx.camera.view.video.a */
public final class C1825a extends C1833e {

    /* renamed from: a */
    public final Location f5015a;

    /* renamed from: androidx.camera.view.video.a$b */
    public static final class C1827b extends C1833e.C1834a {

        /* renamed from: a */
        public Location f5016a;

        /* renamed from: a */
        public C1833e mo6005a() {
            return new C1825a(this.f5016a);
        }

        /* renamed from: b */
        public C1833e.C1834a mo6006b(@C0363p0 Location location) {
            this.f5016a = location;
            return this;
        }
    }

    @C0363p0
    /* renamed from: b */
    public Location mo6001b() {
        return this.f5015a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1833e)) {
            return false;
        }
        Location location = this.f5015a;
        Location b = ((C1833e) obj).mo6001b();
        if (location != null) {
            return location.equals(b);
        }
        if (b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Location location = this.f5015a;
        return (location == null ? 0 : location.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "Metadata{location=" + this.f5015a + "}";
    }

    public C1825a(@C0363p0 Location location) {
        this.f5015a = location;
    }
}
