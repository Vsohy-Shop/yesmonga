package com.google.android.libraries.vision.visionkit.pipeline.alt;

import androidx.annotation.C0363p0;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29080bi;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29526nm;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29827vr;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29908xy;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpl;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbqd;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

@UsedByNative("pipeline_jni.cc")
@Keep
public class PipelineException extends Exception {
    private static final String ROOT_CAUSE_DELIMITER = "#vk ";
    private final zbd statusCode;
    private final String statusMessage;
    @C0363p0
    private final C29526nm visionkitStatus;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PipelineException(int r5, @androidx.annotation.RecentlyNonNull java.lang.String r6) {
        /*
            r4 = this;
            com.google.android.libraries.vision.visionkit.pipeline.alt.zbd[] r0 = com.google.android.libraries.vision.visionkit.pipeline.alt.zbd.values()
            r0 = r0[r5]
            java.lang.String r0 = r0.mo87838g()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r6)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 2
            int r1 = r1 + r2
            r3.<init>(r1)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = r3.toString()
            r4.<init>(r0)
            com.google.android.libraries.vision.visionkit.pipeline.alt.zbd[] r0 = com.google.android.libraries.vision.visionkit.pipeline.alt.zbd.values()
            r5 = r0[r5]
            r4.statusCode = r5
            r4.statusMessage = r6
            r5 = 0
            r4.visionkitStatus = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException.<init>(int, java.lang.String):void");
    }

    @RecentlyNonNull
    public List<C29080bi> getComponentStatuses() {
        C29526nm nmVar = this.visionkitStatus;
        if (nmVar != null) {
            return nmVar.mo84742A();
        }
        return zbqd.m121463A();
    }

    public zbpl<String> getRootCauseMessage() {
        T t;
        T next;
        if (!this.statusMessage.contains(ROOT_CAUSE_DELIMITER)) {
            return zbpl.m121446d();
        }
        List<String> c = C29827vr.m121259b(ROOT_CAUSE_DELIMITER).mo84900c(this.statusMessage);
        if (!(c instanceof List)) {
            Iterator<T> it = c.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            t = next;
        } else if (!c.isEmpty()) {
            t = c.get(c.size() - 1);
        } else {
            throw new NoSuchElementException();
        }
        return zbpl.m121447e((String) t);
    }

    public zbd getStatusCode() {
        return this.statusCode;
    }

    @RecentlyNonNull
    public String getStatusMessage() {
        return this.statusMessage;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private PipelineException(com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29526nm r6) {
        /*
            r5 = this;
            com.google.android.libraries.vision.visionkit.pipeline.alt.zbd[] r0 = com.google.android.libraries.vision.visionkit.pipeline.alt.zbd.values()
            int r1 = r6.mo84743v()
            r0 = r0[r1]
            java.lang.String r0 = r0.mo87838g()
            java.lang.String r1 = r6.mo84744y()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 2
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = ": "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            r5.<init>(r0)
            com.google.android.libraries.vision.visionkit.pipeline.alt.zbd[] r0 = com.google.android.libraries.vision.visionkit.pipeline.alt.zbd.values()
            int r1 = r6.mo84743v()
            r0 = r0[r1]
            r5.statusCode = r0
            java.lang.String r0 = r6.mo84744y()
            r5.statusMessage = r0
            r5.visionkitStatus = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException.<init>(com.google.android.gms.internal.mlkit_vision_text_bundled_common.nm):void");
    }

    @UsedByNative("pipeline_jni.cc")
    @Keep
    public PipelineException(byte[] bArr) throws zbye {
        this(C29526nm.m120798x(bArr, C29908xy.m121340a()));
    }
}
