package com.google.mlkit.vision.common.internal;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40777k;
import com.google.android.gms.common.internal.C40843u;
import com.google.mlkit.vision.common.C34025b;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

@C40473a
/* renamed from: com.google.mlkit.vision.common.internal.b */
public class C34032b {

    /* renamed from: c */
    public static final C40777k f82671c = new C40777k("StreamingFormatChecker", "");

    /* renamed from: a */
    public final LinkedList<Long> f82672a = new LinkedList<>();

    /* renamed from: b */
    public long f82673b = -1;

    @C40473a
    /* renamed from: a */
    public void mo98979a(@RecentlyNonNull C34025b bVar) {
        if (bVar.mo98958h() == -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f82672a.add(Long.valueOf(elapsedRealtime));
            if (this.f82672a.size() > 5) {
                this.f82672a.removeFirst();
            }
            if (this.f82672a.size() == 5 && elapsedRealtime - ((Long) C40843u.m166202l(this.f82672a.peekFirst())).longValue() < 5000) {
                long j = this.f82673b;
                if (j == -1 || elapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5)) {
                    this.f82673b = elapsedRealtime;
                    f82671c.mo134441n("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
    }
}
