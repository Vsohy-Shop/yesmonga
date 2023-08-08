package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.play.core.assetpacks.model.C31958b;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.internal.C32028a0;
import com.google.android.play.core.internal.C32040c1;
import com.google.android.play.core.internal.C32061j1;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.tasks.C32227d;
import com.google.android.play.core.tasks.C32229f;
import com.google.android.play.core.tasks.C32239p;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.play.core.assetpacks.s1 */
public final class C31983s1 implements C31914d3 {

    /* renamed from: h */
    public static final C32062k f78083h = new C32062k("FakeAssetPackService");

    /* renamed from: i */
    public static final AtomicInteger f78084i = new AtomicInteger(1);

    /* renamed from: a */
    public final String f78085a;

    /* renamed from: b */
    public final C32009z f78086b;

    /* renamed from: c */
    public final C31998w0 f78087c;

    /* renamed from: d */
    public final Context f78088d;

    /* renamed from: e */
    public final C31918e2 f78089e;

    /* renamed from: f */
    public final C32040c1<Executor> f78090f;

    /* renamed from: g */
    public final Handler f78091g = new Handler(Looper.getMainLooper());

    public C31983s1(File file, C32009z zVar, C31998w0 w0Var, Context context, C31918e2 e2Var, C32040c1<Executor> c1Var) {
        this.f78085a = file.getAbsolutePath();
        this.f78086b = zVar;
        this.f78087c = w0Var;
        this.f78088d = context;
        this.f78089e = e2Var;
        this.f78090f = c1Var;
    }

    /* renamed from: i */
    public static long m129624i(@C31958b int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    /* renamed from: q */
    public static String m129625q(File file) throws LocalTestingException {
        try {
            return C31987t1.m129666a(Arrays.asList(new File[]{file}));
        } catch (NoSuchAlgorithmException e) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e);
        } catch (IOException e2) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", new Object[]{file}), e2);
        }
    }

    /* renamed from: T0 */
    public final void mo92539T0(List<String> list) {
        f78083h.mo92778d("cancelDownload(%s)", list);
    }

    /* renamed from: a */
    public final C32227d<C31920f> mo92540a(List<String> list, List<String> list2, Map<String, Long> map) {
        f78083h.mo92778d("startDownload(%s)", list2);
        C32239p pVar = new C32239p();
        this.f78090f.mo92734a().execute(new C31963n1(this, list2, pVar, list));
        return pVar.mo93032c();
    }

    /* renamed from: b */
    public final void mo92541b(int i) {
        f78083h.mo92778d("notifySessionFailed", new Object[0]);
    }

    /* renamed from: c */
    public final void mo92542c(int i, String str, String str2, int i2) {
        f78083h.mo92778d("notifyChunkTransferred", new Object[0]);
    }

    /* renamed from: d */
    public final void mo92543d(String str) {
        f78083h.mo92778d("removePack(%s)", str);
    }

    /* renamed from: e */
    public final void mo92544e(int i, String str) {
        f78083h.mo92778d("notifyModuleCompleted", new Object[0]);
        this.f78090f.mo92734a().execute(new C31971p1(this, i, str));
    }

    /* renamed from: f */
    public final C32227d<List<String>> mo92545f(Map<String, Long> map) {
        f78083h.mo92778d("syncPacks()", new Object[0]);
        return C32229f.m130358a(new ArrayList());
    }

    /* renamed from: g */
    public final C32227d<ParcelFileDescriptor> mo92546g(int i, String str, String str2, int i2) {
        f78083h.mo92778d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        C32239p pVar = new C32239p();
        try {
            for (File file : mo92675p(str)) {
                if (C32028a0.m129762b(file).equals(str2)) {
                    pVar.mo93030a(ParcelFileDescriptor.open(file, 268435456));
                    return pVar.mo93032c();
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e) {
            f78083h.mo92779e("getChunkFileDescriptor failed", e);
            pVar.mo93031b(new LocalTestingException("Asset Slice file not found.", e));
        } catch (LocalTestingException e2) {
            f78083h.mo92779e("getChunkFileDescriptor failed", e2);
            pVar.mo93031b(e2);
        }
    }

    /* renamed from: h */
    public final C32227d<C31920f> mo92547h(List<String> list, C31895a0 a0Var, Map<String, Long> map) {
        f78083h.mo92778d("getPackStates(%s)", list);
        C32239p pVar = new C32239p();
        this.f78090f.mo92734a().execute(new C31967o1(this, list, a0Var, pVar));
        return pVar.mo93032c();
    }

    /* renamed from: j */
    public final /* synthetic */ void mo92670j(Intent intent) {
        this.f78086b.mo92414a(this.f78088d, intent);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo92671k(int i, String str) {
        try {
            mo92676r(i, str, 4);
        } catch (LocalTestingException e) {
            f78083h.mo92779e("notifyModuleCompleted failed", e);
        }
    }

    /* renamed from: l */
    public final /* synthetic */ void mo92672l(List list, C31895a0 a0Var, C32239p pVar) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AssetPackState n = mo92674n(str, a0Var.mo92479c(8, str));
                j += n.mo92466i();
                hashMap.put(str, n);
            } catch (LocalTestingException e) {
                pVar.mo93031b(e);
                return;
            }
        }
        pVar.mo93030a(C31920f.m129485a(j, hashMap));
    }

    /* renamed from: m */
    public final /* synthetic */ void mo92673m(List list, C32239p pVar, List list2) {
        C32239p pVar2 = pVar;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AssetPackState n = mo92674n(str, 1);
                j += n.mo92466i();
                hashMap.put(str, n);
            } catch (LocalTestingException e) {
                pVar2.mo93031b(e);
                return;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            try {
                int andIncrement = f78084i.getAndIncrement();
                mo92676r(andIncrement, str2, 1);
                mo92676r(andIncrement, str2, 2);
                mo92676r(andIncrement, str2, 3);
            } catch (LocalTestingException e2) {
                pVar2.mo93031b(e2);
                return;
            }
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            String str3 = (String) it3.next();
            hashMap.put(str3, AssetPackState.m129378d(str3, 4, 0, 0, 0, 0.0d, 1, ""));
        }
        pVar2.mo93030a(C31920f.m129485a(j, hashMap));
    }

    /* renamed from: n */
    public final AssetPackState mo92674n(String str, @C31958b int i) throws LocalTestingException {
        long j = 0;
        for (File length : mo92675p(str)) {
            j += length.length();
        }
        return AssetPackState.m129378d(str, i, 0, m129624i(i, j), j, this.f78087c.mo92703b(str), 1, "");
    }

    /* renamed from: o */
    public final void mo92548o() {
        f78083h.mo92778d("keepAlive", new Object[0]);
    }

    /* renamed from: p */
    public final File[] mo92675p(String str) throws LocalTestingException {
        File file = new File(this.f78085a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new C31975q1(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File b : listFiles) {
                        if (C32028a0.m129762b(b).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No master slice available for pack '%s'.", new Object[]{str}));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    /* renamed from: r */
    public final void mo92676r(int i, String str, @C31958b int i2) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f78089e.mo92553a());
        bundle.putInt("session_id", i);
        File[] p = mo92675p(str);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (File file : p) {
            j += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String b = C32028a0.m129762b(file);
            bundle.putParcelableArrayList(C32061j1.m129825f("chunk_intents", str, b), arrayList2);
            bundle.putString(C32061j1.m129825f("uncompressed_hash_sha256", str, b), m129625q(file));
            bundle.putLong(C32061j1.m129825f("uncompressed_size", str, b), file.length());
            arrayList.add(b);
        }
        bundle.putStringArrayList(C32061j1.m129824e("slice_ids", str), arrayList);
        bundle.putLong(C32061j1.m129824e("pack_version", str), (long) this.f78089e.mo92553a());
        bundle.putInt(C32061j1.m129824e("status", str), i2);
        bundle.putInt(C32061j1.m129824e("error_code", str), 0);
        bundle.putLong(C32061j1.m129824e("bytes_downloaded", str), m129624i(i2, j));
        bundle.putLong(C32061j1.m129824e("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", m129624i(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        this.f78091g.post(new C31979r1(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }
}
