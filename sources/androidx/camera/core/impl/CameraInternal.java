package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1624j;
import androidx.camera.core.C1641m;
import androidx.camera.core.CameraControl;
import androidx.camera.core.UseCase;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import com.google.common.util.concurrent.C32487a;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public interface CameraInternal extends C1624j, UseCase.C1346c {

    public enum State {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);
        
        private final boolean mHoldsCameraSlot;

        /* access modifiers changed from: public */
        State(boolean z) {
            this.mHoldsCameraSlot = z;
        }

        /* renamed from: g */
        public boolean mo5124g() {
            return this.mHoldsCameraSlot;
        }
    }

    @C0359n0
    /* renamed from: a */
    CameraControl mo5119a() {
        return mo4133h();
    }

    @C0359n0
    /* renamed from: b */
    C1464j mo5120b() {
        return C1468k.m6156a();
    }

    @C0359n0
    /* renamed from: c */
    C1641m mo5121c() {
        return mo4139l();
    }

    void close();

    /* renamed from: d */
    void mo5122d(@C0363p0 C1464j jVar) throws CameraUseCaseAdapter.CameraException {
    }

    @C0359n0
    /* renamed from: e */
    LinkedHashSet<CameraInternal> mo5123e() {
        return new LinkedHashSet<>(Collections.singleton(this));
    }

    @C0359n0
    /* renamed from: h */
    CameraControlInternal mo4133h();

    /* renamed from: j */
    void mo4135j(@C0359n0 Collection<UseCase> collection);

    /* renamed from: k */
    void mo4137k(@C0359n0 Collection<UseCase> collection);

    @C0359n0
    /* renamed from: l */
    C1496q mo4139l();

    @C0359n0
    /* renamed from: m */
    C1432a1<State> mo4141m();

    void open();

    @C0359n0
    C32487a<Void> release();
}
