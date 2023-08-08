package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.support.annotation.Nullable;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.internal.C32084r0;
import com.google.android.play.core.internal.C32092u;
import com.google.android.play.core.internal.C32094u1;
import com.google.android.play.core.splitcompat.C32150r;
import com.google.android.play.core.tasks.C32227d;
import com.google.android.play.core.tasks.C32229f;
import com.google.android.play.core.tasks.C32239p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.play.core.assetpacks.v */
public final class C31993v implements C31914d3 {

    /* renamed from: f */
    public static final C32062k f78142f = new C32062k("AssetPackServiceImpl");

    /* renamed from: g */
    public static final Intent f78143g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    public final String f78144a;

    /* renamed from: b */
    public final C31998w0 f78145b;
    @Nullable

    /* renamed from: c */
    public C32092u<C32094u1> f78146c;
    @Nullable

    /* renamed from: d */
    public C32092u<C32094u1> f78147d;

    /* renamed from: e */
    public final AtomicBoolean f78148e = new AtomicBoolean();

    public C31993v(Context context, C31998w0 w0Var) {
        this.f78144a = context.getPackageName();
        this.f78145b = w0Var;
        if (C32084r0.m129917a(context)) {
            Context c = C32150r.m130103c(context);
            C32062k kVar = f78142f;
            Intent intent = f78143g;
            this.f78146c = new C32092u(c, kVar, "AssetPackService", intent, C31919e3.f77845c);
            this.f78147d = new C32092u(C32150r.m130103c(context), kVar, "AssetPackService-keepAlive", intent, C31919e3.f77844b);
        }
        f78142f.mo92775a("AssetPackService initiated.", new Object[0]);
    }

    /* renamed from: B */
    public static <T> C32227d<T> m129681B() {
        f78142f.mo92776b("onError(%d)", -11);
        return C32229f.m130361d(new AssetPackException(-11));
    }

    /* renamed from: i */
    public static Bundle m129682i(int i, String str) {
        Bundle j = m129683j(i);
        j.putString("module_name", str);
        return j;
    }

    /* renamed from: j */
    public static Bundle m129683j(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* renamed from: k */
    public static Bundle m129684k() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11000);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList());
        return bundle;
    }

    /* renamed from: l */
    public static /* synthetic */ ArrayList m129685l(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: n */
    public static /* synthetic */ Bundle m129687n(Map map) {
        Bundle k = m129684k();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        k.putParcelableArrayList("installed_asset_module", arrayList);
        return k;
    }

    /* renamed from: t */
    public static /* synthetic */ Bundle m129692t(int i, String str, String str2, int i2) {
        Bundle i3 = m129682i(i, str);
        i3.putString("slice_id", str2);
        i3.putInt("chunk_number", i2);
        return i3;
    }

    /* renamed from: x */
    public static /* synthetic */ List m129696x(C31993v vVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AssetPackState next = C31920f.m129486b((Bundle) it.next(), vVar.f78145b).mo92554f().values().iterator().next();
            if (next == null) {
                f78142f.mo92776b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (C31987t1.m129671f(next.mo92465h())) {
                arrayList.add(next.mo92464g());
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public final void mo92691A(int i, String str, int i2) {
        if (this.f78146c != null) {
            f78142f.mo92778d("notifyModuleCompleted", new Object[0]);
            C32239p pVar = new C32239p();
            this.f78146c.mo92829a(new C31945k(this, pVar, i, str, pVar, i2));
            return;
        }
        throw new C31904bk("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: T0 */
    public final void mo92539T0(List<String> list) {
        if (this.f78146c != null) {
            f78142f.mo92778d("cancelDownloads(%s)", list);
            C32239p pVar = new C32239p();
            this.f78146c.mo92829a(new C31939i3(this, pVar, list, pVar));
        }
    }

    /* renamed from: a */
    public final C32227d<C31920f> mo92540a(List<String> list, List<String> list2, Map<String, Long> map) {
        if (this.f78146c == null) {
            return m129681B();
        }
        f78142f.mo92778d("startDownload(%s)", list2);
        C32239p pVar = new C32239p();
        this.f78146c.mo92829a(new C31934h3(this, pVar, list2, map, pVar, list));
        pVar.mo93032c().mo93017e(new C31924f3(this));
        return pVar.mo93032c();
    }

    /* renamed from: b */
    public final void mo92541b(int i) {
        if (this.f78146c != null) {
            f78142f.mo92778d("notifySessionFailed", new Object[0]);
            C32239p pVar = new C32239p();
            this.f78146c.mo92829a(new C31949l(this, pVar, i, pVar));
            return;
        }
        throw new C31904bk("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: c */
    public final void mo92542c(int i, String str, String str2, int i2) {
        if (this.f78146c != null) {
            f78142f.mo92778d("notifyChunkTransferred", new Object[0]);
            C32239p pVar = new C32239p();
            this.f78146c.mo92829a(new C31940j(this, pVar, i, str, str2, i2, pVar));
            return;
        }
        throw new C31904bk("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: d */
    public final void mo92543d(String str) {
        if (this.f78146c != null) {
            f78142f.mo92778d("removePack(%s)", str);
            C32239p pVar = new C32239p();
            this.f78146c.mo92829a(new C31929g3(this, pVar, str, pVar));
        }
    }

    /* renamed from: e */
    public final void mo92544e(int i, String str) {
        mo92691A(i, str, 10);
    }

    /* renamed from: f */
    public final C32227d<List<String>> mo92545f(Map<String, Long> map) {
        if (this.f78146c == null) {
            return m129681B();
        }
        f78142f.mo92778d("syncPacks", new Object[0]);
        C32239p pVar = new C32239p();
        this.f78146c.mo92829a(new C31944j3(this, pVar, map, pVar));
        return pVar.mo93032c();
    }

    /* renamed from: g */
    public final C32227d<ParcelFileDescriptor> mo92546g(int i, String str, String str2, int i2) {
        if (this.f78146c == null) {
            return m129681B();
        }
        f78142f.mo92778d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        C32239p pVar = new C32239p();
        this.f78146c.mo92829a(new C31953m(this, pVar, i, str, str2, i2, pVar));
        return pVar.mo93032c();
    }

    /* renamed from: h */
    public final C32227d<C31920f> mo92547h(List<String> list, C31895a0 a0Var, Map<String, Long> map) {
        if (this.f78146c == null) {
            return m129681B();
        }
        f78142f.mo92778d("getPackStates(%s)", list);
        C32239p pVar = new C32239p();
        this.f78146c.mo92829a(new C31935i(this, pVar, list, map, pVar, a0Var));
        return pVar.mo93032c();
    }

    /* renamed from: o */
    public final synchronized void mo92548o() {
        if (this.f78147d == null) {
            f78142f.mo92779e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        C32062k kVar = f78142f;
        kVar.mo92778d("keepAlive", new Object[0]);
        if (!this.f78148e.compareAndSet(false, true)) {
            kVar.mo92778d("Service is already kept alive.", new Object[0]);
            return;
        }
        C32239p pVar = new C32239p();
        this.f78147d.mo92829a(new C31961n(this, pVar, pVar));
    }
}
