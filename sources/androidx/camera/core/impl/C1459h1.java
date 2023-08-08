package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.camera.core.C1353a2;
import androidx.camera.core.C1741z1;
import androidx.camera.core.impl.utils.futures.C1548f;
import com.google.common.util.concurrent.C32487a;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.impl.h1 */
public final class C1459h1 implements C1497q0 {

    /* renamed from: a */
    public final int f4215a;

    /* renamed from: b */
    public final C1353a2 f4216b;

    public C1459h1(@C0359n0 C1353a2 a2Var, @C0359n0 String str) {
        C1741z1 q3 = a2Var.mo4977q3();
        if (q3 != null) {
            Integer d = q3.mo5101b().mo5239d(str);
            if (d != null) {
                this.f4215a = d.intValue();
                this.f4216b = a2Var;
                return;
            }
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }

    @C0359n0
    /* renamed from: a */
    public List<Integer> mo5081a() {
        return Collections.singletonList(Integer.valueOf(this.f4215a));
    }

    @C0359n0
    /* renamed from: b */
    public C32487a<C1353a2> mo5082b(int i) {
        if (i != this.f4215a) {
            return C1548f.m6477f(new IllegalArgumentException("Capture id does not exist in the bundle"));
        }
        return C1548f.m6479h(this.f4216b);
    }

    /* renamed from: c */
    public void mo5223c() {
        this.f4216b.close();
    }

    public C1459h1(@C0359n0 C1353a2 a2Var, int i) {
        this.f4215a = i;
        this.f4216b = a2Var;
    }
}
