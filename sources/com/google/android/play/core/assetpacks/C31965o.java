package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C32097v1;
import com.google.android.play.core.tasks.C32239p;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.o */
public class C31965o<T> extends C32097v1 {

    /* renamed from: n */
    public final C32239p<T> f78011n;

    /* renamed from: o */
    public final /* synthetic */ C31993v f78012o;

    public C31965o(C31993v vVar, C32239p<T> pVar) {
        this.f78012o = vVar;
        this.f78011n = pVar;
    }

    /* renamed from: D0 */
    public void mo92636D0(int i, Bundle bundle) {
        this.f78012o.f78146c.mo92830b();
        C31993v.f78142f.mo92778d("onStartDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: I3 */
    public void mo92637I3(Bundle bundle) {
        this.f78012o.f78146c.mo92830b();
        C31993v.f78142f.mo92778d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: K7 */
    public void mo92638K7(Bundle bundle, Bundle bundle2) {
        this.f78012o.f78147d.mo92830b();
        C31993v.f78142f.mo92778d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    /* renamed from: R0 */
    public void mo92639R0(List<Bundle> list) {
        this.f78012o.f78146c.mo92830b();
        C31993v.f78142f.mo92778d("onGetSessionStates", new Object[0]);
    }

    /* renamed from: V7 */
    public void mo92640V7(Bundle bundle) {
        this.f78012o.f78146c.mo92830b();
        int i = bundle.getInt("error_code");
        C31993v.f78142f.mo92776b("onError(%d)", Integer.valueOf(i));
        this.f78011n.mo93033d(new AssetPackException(i));
    }

    /* renamed from: W2 */
    public final void mo92641W2(int i) {
        this.f78012o.f78146c.mo92830b();
        C31993v.f78142f.mo92778d("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: X7 */
    public void mo92642X7(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f78012o.f78146c.mo92830b();
        C31993v.f78142f.mo92778d("onGetChunkFileDescriptor", new Object[0]);
    }

    /* renamed from: a2 */
    public final void mo92643a2(int i) {
        this.f78012o.f78146c.mo92830b();
        C31993v.f78142f.mo92778d("onCancelDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: b3 */
    public void mo92644b3(Bundle bundle) {
        this.f78012o.f78146c.mo92830b();
        C31993v.f78142f.mo92778d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: b6 */
    public void mo92645b6(Bundle bundle) {
        this.f78012o.f78146c.mo92830b();
        C31993v.f78142f.mo92778d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: i */
    public void mo92646i() {
        this.f78012o.f78146c.mo92830b();
        C31993v.f78142f.mo92778d("onCancelDownloads()", new Object[0]);
    }

    /* renamed from: n */
    public void mo92647n() {
        this.f78012o.f78146c.mo92830b();
        C31993v.f78142f.mo92778d("onRemoveModule()", new Object[0]);
    }

    /* renamed from: p8 */
    public void mo92648p8(Bundle bundle, Bundle bundle2) {
        this.f78012o.f78146c.mo92830b();
        C31993v.f78142f.mo92778d("onRequestDownloadInfo()", new Object[0]);
    }

    public C31965o(C31993v vVar, C32239p pVar, byte[] bArr) {
        this(vVar, pVar);
    }

    public C31965o(C31993v vVar, C32239p pVar, char[] cArr) {
        this(vVar, pVar);
    }

    public C31965o(C31993v vVar, C32239p pVar, int[] iArr) {
        this(vVar, pVar);
    }

    public C31965o(C31993v vVar, C32239p pVar, short[] sArr) {
        this(vVar, pVar);
    }
}
