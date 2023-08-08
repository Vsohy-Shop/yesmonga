package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.annotation.C0359n0;
import androidx.camera.camera2.internal.compat.quirk.C1138f;
import androidx.camera.camera2.internal.compat.quirk.C1140h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.compat.workaround.c */
public class C1158c {
    @C0359n0

    /* renamed from: a */
    public final String f3367a;

    public C1158c(@C0359n0 String str) {
        this.f3367a = str;
    }

    @C0359n0
    /* renamed from: a */
    public List<Size> mo4442a(int i) {
        C1140h hVar = (C1140h) C1138f.m4835a(C1140h.class);
        if (hVar == null) {
            return new ArrayList();
        }
        return hVar.mo4433a(this.f3367a, i);
    }
}
