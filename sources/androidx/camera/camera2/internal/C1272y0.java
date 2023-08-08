package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.camera2.internal.y0 */
public class C1272y0 extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    public final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> f3642a = new HashMap();

    /* renamed from: b */
    public C1273a f3643b = null;

    /* renamed from: androidx.camera.camera2.internal.y0$a */
    public interface C1273a {
        /* renamed from: a */
        void mo4541a(@C0359n0 CameraCaptureSession cameraCaptureSession, int i, boolean z);
    }

    /* renamed from: a */
    public void mo4726a(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        List list2 = this.f3642a.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list.size() + list2.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            this.f3642a.put(captureRequest, arrayList);
            return;
        }
        this.f3642a.put(captureRequest, list);
    }

    /* renamed from: b */
    public final List<CameraCaptureSession.CaptureCallback> mo4727b(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = this.f3642a.get(captureRequest);
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    /* renamed from: c */
    public void mo4728c(@C0359n0 C1273a aVar) {
        this.f3643b = aVar;
    }

    @C0376v0(api = 24)
    public void onCaptureBufferLost(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 Surface surface, long j) {
        for (CameraCaptureSession.CaptureCallback onCaptureBufferLost : mo4727b(captureRequest)) {
            onCaptureBufferLost.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }
    }

    public void onCaptureCompleted(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 TotalCaptureResult totalCaptureResult) {
        for (CameraCaptureSession.CaptureCallback onCaptureCompleted : mo4727b(captureRequest)) {
            onCaptureCompleted.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    public void onCaptureFailed(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 CaptureFailure captureFailure) {
        for (CameraCaptureSession.CaptureCallback onCaptureFailed : mo4727b(captureRequest)) {
            onCaptureFailed.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    public void onCaptureProgressed(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, @C0359n0 CaptureResult captureResult) {
        for (CameraCaptureSession.CaptureCallback onCaptureProgressed : mo4727b(captureRequest)) {
            onCaptureProgressed.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    public void onCaptureSequenceAborted(@C0359n0 CameraCaptureSession cameraCaptureSession, int i) {
        C1273a aVar = this.f3643b;
        if (aVar != null) {
            aVar.mo4541a(cameraCaptureSession, i, true);
        }
    }

    public void onCaptureSequenceCompleted(@C0359n0 CameraCaptureSession cameraCaptureSession, int i, long j) {
        C1273a aVar = this.f3643b;
        if (aVar != null) {
            aVar.mo4541a(cameraCaptureSession, i, false);
        }
    }

    public void onCaptureStarted(@C0359n0 CameraCaptureSession cameraCaptureSession, @C0359n0 CaptureRequest captureRequest, long j, long j2) {
        for (CameraCaptureSession.CaptureCallback onCaptureStarted : mo4727b(captureRequest)) {
            onCaptureStarted.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }
}
