package androidx.camera.core.internal;

import androidx.annotation.C0359n0;
import androidx.camera.core.C1741z1;
import androidx.camera.core.impl.C1456h;
import androidx.camera.core.impl.C1472k1;
import androidx.camera.core.impl.utils.ExifData;

/* renamed from: androidx.camera.core.internal.b */
public final class C1592b implements C1741z1 {

    /* renamed from: a */
    public final C1456h f4530a;

    public C1592b(@C0359n0 C1456h hVar) {
        this.f4530a = hVar;
    }

    /* renamed from: a */
    public void mo5112a(@C0359n0 ExifData.C1509b bVar) {
        this.f4530a.mo4459a(bVar);
    }

    @C0359n0
    /* renamed from: b */
    public C1472k1 mo5101b() {
        return this.f4530a.mo4460b();
    }

    /* renamed from: c */
    public int mo5102c() {
        return 0;
    }

    @C0359n0
    /* renamed from: d */
    public C1456h mo5595d() {
        return this.f4530a;
    }

    public long getTimestamp() {
        return this.f4530a.getTimestamp();
    }
}
