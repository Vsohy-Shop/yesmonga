package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.core.impl.g */
public final class C1451g {

    /* renamed from: androidx.camera.core.impl.g$a */
    public static final class C1452a extends C1448f {

        /* renamed from: a */
        public final List<C1448f> f4208a = new ArrayList();

        public C1452a(@C0359n0 List<C1448f> list) {
            for (C1448f next : list) {
                if (!(next instanceof C1453b)) {
                    this.f4208a.add(next);
                }
            }
        }

        /* renamed from: a */
        public void mo4262a() {
            for (C1448f a : this.f4208a) {
                a.mo4262a();
            }
        }

        /* renamed from: b */
        public void mo4263b(@C0359n0 C1456h hVar) {
            for (C1448f b : this.f4208a) {
                b.mo4263b(hVar);
            }
        }

        /* renamed from: c */
        public void mo4264c(@C0359n0 CameraCaptureFailure cameraCaptureFailure) {
            for (C1448f c : this.f4208a) {
                c.mo4264c(cameraCaptureFailure);
            }
        }

        @C0359n0
        /* renamed from: d */
        public List<C1448f> mo5221d() {
            return this.f4208a;
        }
    }

    /* renamed from: androidx.camera.core.impl.g$b */
    public static final class C1453b extends C1448f {
        /* renamed from: b */
        public void mo4263b(@C0359n0 C1456h hVar) {
        }

        /* renamed from: c */
        public void mo4264c(@C0359n0 CameraCaptureFailure cameraCaptureFailure) {
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C1448f m6085a(@C0359n0 List<C1448f> list) {
        if (list.isEmpty()) {
            return m6087c();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new C1452a(list);
    }

    @C0359n0
    /* renamed from: b */
    public static C1448f m6086b(@C0359n0 C1448f... fVarArr) {
        return m6085a(Arrays.asList(fVarArr));
    }

    @C0359n0
    /* renamed from: c */
    public static C1448f m6087c() {
        return new C1453b();
    }
}
