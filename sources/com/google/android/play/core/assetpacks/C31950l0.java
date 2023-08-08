package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.internal.C32040c1;
import com.google.android.play.core.tasks.C32229f;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.play.core.assetpacks.l0 */
public final class C31950l0 {

    /* renamed from: a */
    public final C32040c1<C31914d3> f77954a;

    public C31950l0(C32040c1<C31914d3> c1Var) {
        this.f77954a = c1Var;
    }

    /* renamed from: a */
    public final InputStream mo92620a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C32229f.m130359b(this.f77954a.mo92734a().mo92546g(i, str, str2, i2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new C31904bk(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), i);
        } catch (ExecutionException e) {
            throw new C31904bk(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), e, i);
        } catch (InterruptedException e2) {
            throw new C31904bk("Extractor was interrupted while waiting for chunk file.", e2, i);
        }
    }
}
