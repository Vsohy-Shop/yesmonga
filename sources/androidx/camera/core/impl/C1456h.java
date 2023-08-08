package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.utils.ExifData;

/* renamed from: androidx.camera.core.impl.h */
public interface C1456h {

    /* renamed from: androidx.camera.core.impl.h$a */
    public static final class C1457a implements C1456h {
        @C0359n0
        /* renamed from: h */
        public static C1456h m6110h() {
            return new C1457a();
        }

        @C0359n0
        /* renamed from: b */
        public C1472k1 mo4460b() {
            return C1472k1.m6168b();
        }

        @C0359n0
        /* renamed from: c */
        public CameraCaptureMetaData.FlashState mo4461c() {
            return CameraCaptureMetaData.FlashState.UNKNOWN;
        }

        @C0359n0
        /* renamed from: d */
        public CameraCaptureMetaData.AfState mo4462d() {
            return CameraCaptureMetaData.AfState.UNKNOWN;
        }

        @C0359n0
        /* renamed from: e */
        public CameraCaptureMetaData.AwbState mo4463e() {
            return CameraCaptureMetaData.AwbState.UNKNOWN;
        }

        @C0359n0
        /* renamed from: f */
        public CameraCaptureMetaData.AfMode mo4464f() {
            return CameraCaptureMetaData.AfMode.UNKNOWN;
        }

        @C0359n0
        /* renamed from: g */
        public CameraCaptureMetaData.AeState mo4465g() {
            return CameraCaptureMetaData.AeState.UNKNOWN;
        }

        public long getTimestamp() {
            return -1;
        }
    }

    /* renamed from: a */
    void mo4459a(@C0359n0 ExifData.C1509b bVar) {
        bVar.mo5345h(mo4461c());
    }

    @C0359n0
    /* renamed from: b */
    C1472k1 mo4460b();

    @C0359n0
    /* renamed from: c */
    CameraCaptureMetaData.FlashState mo4461c();

    @C0359n0
    /* renamed from: d */
    CameraCaptureMetaData.AfState mo4462d();

    @C0359n0
    /* renamed from: e */
    CameraCaptureMetaData.AwbState mo4463e();

    @C0359n0
    /* renamed from: f */
    CameraCaptureMetaData.AfMode mo4464f();

    @C0359n0
    /* renamed from: g */
    CameraCaptureMetaData.AeState mo4465g();

    long getTimestamp();
}
