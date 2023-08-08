package androidx.camera.camera2.interop;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.C1004b;
import androidx.camera.core.C1643m0;
import androidx.camera.core.impl.C1441c1;
import androidx.camera.core.impl.C1455g1;
import androidx.camera.core.impl.C1582x0;
import androidx.camera.core.impl.C1586y0;
import androidx.camera.core.impl.Config;

@C1298p
/* renamed from: androidx.camera.camera2.interop.o */
public class C1296o implements C1455g1 {

    /* renamed from: v */
    public final Config f3683v;

    /* renamed from: androidx.camera.camera2.interop.o$a */
    public static final class C1297a implements C1643m0<C1296o> {

        /* renamed from: a */
        public final C1586y0 f3684a = C1586y0.m6573d0();

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: f */
        public static C1297a m5319f(@C0359n0 Config config) {
            C1297a aVar = new C1297a();
            config.mo5127d(C1004b.f3071w, new C1295n(aVar, config));
            return aVar;
        }

        @C0359n0
        /* renamed from: d */
        public C1296o mo4098g() {
            return new C1296o(C1441c1.m6059b0(this.f3684a));
        }

        @C0359n0
        /* renamed from: e */
        public <ValueT> C1297a mo4767e(@C0359n0 CaptureRequest.Key<ValueT> key) {
            this.f3684a.mo5546z(C1004b.m4370b0(key));
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: h */
        public C1582x0 mo4099h() {
            return this.f3684a;
        }

        @C0359n0
        /* renamed from: k */
        public <ValueT> C1297a mo4768k(@C0359n0 CaptureRequest.Key<ValueT> key, @C0359n0 ValueT valuet) {
            this.f3684a.mo5545t(C1004b.m4370b0(key), valuet);
            return this;
        }
    }

    public C1296o(@C0359n0 Config config) {
        this.f3683v = config;
    }

    @C0363p0
    /* renamed from: Z */
    public <ValueT> ValueT mo4764Z(@C0359n0 CaptureRequest.Key<ValueT> key) {
        return this.f3683v.mo5131h(C1004b.m4370b0(key), null);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public Config mo4458a() {
        return this.f3683v;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a0 */
    public <ValueT> ValueT mo4765a0(@C0359n0 CaptureRequest.Key<ValueT> key, @C0363p0 ValueT valuet) {
        return this.f3683v.mo5131h(C1004b.m4370b0(key), valuet);
    }
}
