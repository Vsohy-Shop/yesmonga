package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.C40587m;

/* renamed from: com.google.android.gms.common.internal.n0 */
public abstract class C40792n0 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static C40792n0 m165972b(Activity activity, @C0363p0 Intent intent, int i) {
        return new C40778k0(intent, activity, i);
    }

    /* renamed from: c */
    public static C40792n0 m165973c(@C0359n0 Fragment fragment, @C0363p0 Intent intent, int i) {
        return new C40782l0(intent, fragment, i);
    }

    /* renamed from: d */
    public static C40792n0 m165974d(@C0359n0 C40587m mVar, @C0363p0 Intent intent, int i) {
        return new C40787m0(intent, mVar, 2);
    }

    /* renamed from: a */
    public abstract void mo134447a();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        android.os.Build.FINGERPRINT.contains("generic");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r2.dismiss();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r2, int r3) {
        /*
            r1 = this;
            r1.mo134447a()     // Catch:{ ActivityNotFoundException -> 0x0009 }
            r2.dismiss()
            return
        L_0x0007:
            r3 = move-exception
            goto L_0x0014
        L_0x0009:
            java.lang.String r3 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x0007 }
            java.lang.String r0 = "generic"
            r3.contains(r0)     // Catch:{ all -> 0x0007 }
            r2.dismiss()
            return
        L_0x0014:
            r2.dismiss()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C40792n0.onClick(android.content.DialogInterface, int):void");
    }
}
