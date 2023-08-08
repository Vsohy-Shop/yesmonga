package androidx.webkit.internal;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.webkit.C20841d;
import androidx.webkit.C20845e;
import androidx.webkit.internal.C20851a;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;

/* renamed from: androidx.webkit.internal.w0 */
public class C20937w0 extends C20845e {

    /* renamed from: a */
    public ProxyControllerBoundaryInterface f54028a;

    @C0344h1
    @C0359n0
    /* renamed from: e */
    public static String[][] m96993e(@C0359n0 List<C20841d.C20843b> list) {
        int size = list.size();
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = size;
        String[][] strArr = (String[][]) Array.newInstance(String.class, iArr);
        for (int i = 0; i < list.size(); i++) {
            strArr[i][0] = list.get(i).mo62597a();
            strArr[i][1] = list.get(i).mo62598b();
        }
        return strArr;
    }

    /* renamed from: a */
    public void mo62599a(@C0359n0 Executor executor, @C0359n0 Runnable runnable) {
        if (C20908o1.f53963P.mo62608d()) {
            mo62701d().clearProxyOverride(runnable, executor);
            return;
        }
        throw C20908o1.m96934a();
    }

    /* renamed from: c */
    public void mo62600c(@C0359n0 C20841d dVar, @C0359n0 Executor executor, @C0359n0 Runnable runnable) {
        C20851a.C20855d dVar2 = C20908o1.f53963P;
        C20851a.C20855d dVar3 = C20908o1.f53970W;
        String[][] e = m96993e(dVar.mo62583b());
        String[] strArr = (String[]) dVar.mo62582a().toArray(new String[0]);
        if (dVar2.mo62608d() && !dVar.mo62584c()) {
            mo62701d().setProxyOverride(e, strArr, runnable, executor);
        } else if (!dVar2.mo62608d() || !dVar3.mo62608d()) {
            throw C20908o1.m96934a();
        } else {
            mo62701d().setProxyOverride(e, strArr, runnable, executor, dVar.mo62584c());
        }
    }

    /* renamed from: d */
    public final ProxyControllerBoundaryInterface mo62701d() {
        if (this.f54028a == null) {
            this.f54028a = C20912p1.m96946d().getProxyController();
        }
        return this.f54028a;
    }
}
