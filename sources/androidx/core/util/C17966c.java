package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.AtomicFile;
import androidx.annotation.C0376v0;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import org.jetbrains.annotations.C12579k;

@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.util.c */
public final class C17966c {
    @C0376v0(17)
    @C12579k
    /* renamed from: a */
    public static final byte[] m81613a(@C12579k AtomicFile atomicFile) {
        Intrinsics.checkNotNullParameter(atomicFile, "<this>");
        byte[] readFully = atomicFile.readFully();
        Intrinsics.checkNotNullExpressionValue(readFully, "readFully()");
        return readFully;
    }

    @C0376v0(17)
    @C12579k
    /* renamed from: b */
    public static final String m81614b(@C12579k AtomicFile atomicFile, @C12579k Charset charset) {
        Intrinsics.checkNotNullParameter(atomicFile, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        Intrinsics.checkNotNullExpressionValue(readFully, "readFully()");
        return new String(readFully, charset);
    }

    /* renamed from: c */
    public static /* synthetic */ String m81615c(AtomicFile atomicFile, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        return m81614b(atomicFile, charset);
    }

    @C0376v0(17)
    /* renamed from: d */
    public static final void m81616d(@C12579k AtomicFile atomicFile, @C12579k C11300l<? super FileOutputStream, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(atomicFile, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            Intrinsics.checkNotNullExpressionValue(startWrite, "stream");
            lVar.invoke(startWrite);
            C11322b0.m43481d(1);
            atomicFile.finishWrite(startWrite);
            C11322b0.m43480c(1);
        } catch (Throwable th) {
            C11322b0.m43481d(1);
            atomicFile.failWrite(startWrite);
            C11322b0.m43480c(1);
            throw th;
        }
    }

    @C0376v0(17)
    /* renamed from: e */
    public static final void m81617e(@C12579k AtomicFile atomicFile, @C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(atomicFile, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "array");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            Intrinsics.checkNotNullExpressionValue(startWrite, "stream");
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    @C0376v0(17)
    /* renamed from: f */
    public static final void m81618f(@C12579k AtomicFile atomicFile, @C12579k String str, @C12579k Charset charset) {
        Intrinsics.checkNotNullParameter(atomicFile, "<this>");
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        m81617e(atomicFile, bytes);
    }

    /* renamed from: g */
    public static /* synthetic */ void m81619g(AtomicFile atomicFile, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C11602d.f28868b;
        }
        m81618f(atomicFile, str, charset);
    }
}
