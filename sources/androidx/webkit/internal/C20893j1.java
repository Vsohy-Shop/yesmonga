package androidx.webkit.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.webkit.C20959n;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* renamed from: androidx.webkit.internal.j1 */
public class C20893j1 implements WebMessagePayloadBoundaryInterface {
    @C0359n0

    /* renamed from: a */
    public final C20959n f53941a;

    public C20893j1(@C0359n0 C20959n nVar) {
        this.f53941a = nVar;
    }

    @C0359n0
    public byte[] getAsArrayBuffer() {
        return this.f53941a.mo62725a();
    }

    @C0363p0
    public String getAsString() {
        return this.f53941a.mo62726b();
    }

    @C0359n0
    public String[] getSupportedFeatures() {
        return new String[0];
    }

    public int getType() {
        int d = this.f53941a.mo62728d();
        if (d == 0) {
            return 0;
        }
        if (d == 1) {
            return 1;
        }
        throw C20908o1.m96934a();
    }
}
