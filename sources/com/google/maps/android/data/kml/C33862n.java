package com.google.maps.android.data.kml;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import androidx.annotation.C0363p0;
import com.google.android.gms.maps.C30412c;
import com.google.android.gms.maps.model.C30573a;
import com.google.android.gms.maps.model.C30579d;
import com.google.android.gms.maps.model.C30587h;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.maps.android.collections.C33791b;
import com.google.maps.android.collections.C33796d;
import com.google.maps.android.collections.C33798e;
import com.google.maps.android.collections.C33800f;
import com.google.maps.android.data.C33818b;
import com.google.maps.android.data.C33819c;
import com.google.maps.android.data.C33823f;
import com.google.maps.android.data.C33845k;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.maps.android.data.kml.n */
public class C33862n extends C33845k {

    /* renamed from: B */
    public static final String f82126B = "KmlRenderer";

    /* renamed from: A */
    public ArrayList<C33849b> f82127A;

    /* renamed from: x */
    public final Set<String> f82128x = new HashSet();

    /* renamed from: y */
    public boolean f82129y = false;

    /* renamed from: z */
    public boolean f82130z = false;

    /* renamed from: com.google.maps.android.data.kml.n$a */
    public class C33863a extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: a */
        public final String f82131a;

        public C33863a(String str) {
            this.f82131a = str;
            C33862n.this.mo98439x();
        }

        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            try {
                return C33862n.this.mo98502S0(this.f82131a);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.f82131a);
            } catch (IOException unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Image [");
                sb.append(this.f82131a);
                sb.append("] download issue");
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Image at this URL could not be found ");
                sb.append(this.f82131a);
            } else {
                C33862n.this.mo98434s(this.f82131a, bitmap);
                if (C33862n.this.mo98399R()) {
                    C33862n nVar = C33862n.this;
                    nVar.mo98491H0(this.f82131a, nVar.mo98391I(), true);
                    C33862n nVar2 = C33862n.this;
                    nVar2.mo98490G0(this.f82131a, nVar2.f82127A, true);
                }
            }
            C33862n.this.mo98438w();
        }
    }

    /* renamed from: com.google.maps.android.data.kml.n$b */
    public class C33864b extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: a */
        public final String f82133a;

        public C33864b(String str) {
            this.f82133a = str;
            C33862n.this.mo98439x();
        }

        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            try {
                return C33862n.this.mo98502S0(this.f82133a);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.f82133a);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Image at this URL could not be found ");
                sb.append(this.f82133a);
            } else {
                C33862n.this.mo98434s(this.f82133a, bitmap);
                if (C33862n.this.mo98399R()) {
                    C33862n nVar = C33862n.this;
                    nVar.mo98496M0(this.f82133a, nVar.mo98440y());
                    C33862n nVar2 = C33862n.this;
                    nVar2.mo98487D0(this.f82133a, nVar2.f82127A);
                }
            }
            C33862n.this.mo98438w();
        }
    }

    public C33862n(C30412c cVar, Context context, C33796d dVar, C33798e eVar, C33800f fVar, C33791b bVar, @C0363p0 C33845k.C33847b bVar2) {
        super(cVar, context, dVar, eVar, fVar, bVar, bVar2);
    }

    /* renamed from: T0 */
    public static boolean m136307T0(C33849b bVar, boolean z) {
        boolean z2;
        if (!bVar.mo98457p("visibility") || Integer.parseInt(bVar.mo98449h("visibility")) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: D0 */
    public final void mo98487D0(String str, Iterable<C33849b> iterable) {
        for (C33849b next : iterable) {
            mo98496M0(str, next.mo98447f());
            if (next.mo98454m()) {
                mo98487D0(str, next.mo98443b());
            }
        }
    }

    /* renamed from: E0 */
    public final void mo98488E0(Iterable<C33849b> iterable, boolean z) {
        for (C33849b next : iterable) {
            boolean T0 = m136307T0(next, z);
            if (next.mo98453l() != null) {
                mo98405a0(next.mo98453l());
            }
            if (next.mo98452k() != null) {
                super.mo98432q(next.mo98452k(), mo98396O());
            }
            mo98489F0(next, T0);
            if (next.mo98454m()) {
                mo98488E0(next.mo98443b(), T0);
            }
        }
    }

    /* renamed from: F0 */
    public final void mo98489F0(C33849b bVar, boolean z) {
        boolean z2;
        for (C33818b next : bVar.mo98446e()) {
            boolean M = C33845k.m136153M(next);
            if (!z || !M) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z3 = z2;
            if (next.mo98222a() != null) {
                String b = next.mo98223b();
                C33819c a = next.mo98222a();
                C33865o L = mo98394L(b);
                C33859k kVar = (C33859k) next;
                Object h = mo98415h(kVar, a, L, kVar.mo98478l(), z3);
                bVar.mo98458q(kVar, h);
                mo98401W(h, next);
            }
        }
    }

    /* renamed from: G0 */
    public final void mo98490G0(String str, Iterable<C33849b> iterable, boolean z) {
        for (C33849b next : iterable) {
            boolean T0 = m136307T0(next, z);
            mo98491H0(str, next.mo98444c(), T0);
            if (next.mo98454m()) {
                mo98490G0(str, next.mo98443b(), T0);
            }
        }
    }

    /* renamed from: H0 */
    public final void mo98491H0(String str, HashMap<C33853e, C30579d> hashMap, boolean z) {
        C30573a z2 = mo98441z(str);
        for (C33853e next : hashMap.keySet()) {
            if (next.mo98461b().equals(str)) {
                C30579d r = mo98433r(next.mo98460a().mo86332j1(z2));
                if (!z) {
                    r.mo86533v(false);
                }
                hashMap.put(next, r);
            }
        }
    }

    /* renamed from: I0 */
    public final void mo98492I0(HashMap<C33853e, C30579d> hashMap) {
        for (C33853e next : hashMap.keySet()) {
            String b = next.mo98461b();
            if (!(b == null || next.mo98462c() == null)) {
                if (mo98441z(b) != null) {
                    mo98491H0(b, mo98391I(), true);
                } else {
                    this.f82128x.add(b);
                }
            }
        }
    }

    /* renamed from: J0 */
    public final void mo98493J0(HashMap<C33853e, C30579d> hashMap, Iterable<C33849b> iterable) {
        mo98492I0(hashMap);
        for (C33849b next : iterable) {
            mo98493J0(next.mo98444c(), next.mo98443b());
        }
    }

    /* renamed from: K0 */
    public final void mo98494K0(String str, C33865o oVar, C33865o oVar2, C33819c cVar, Object obj) {
        if (cVar != null) {
            if ("Point".equals(cVar.mo98233a())) {
                mo98495L0(str, oVar, oVar2, (C30587h) obj);
            } else if ("MultiGeometry".equals(cVar.mo98233a())) {
                mo98497N0(str, oVar, oVar2, (C33823f) cVar, (List) obj);
            }
        }
    }

    /* renamed from: L0 */
    public final void mo98495L0(String str, C33865o oVar, C33865o oVar2, C30587h hVar) {
        boolean z;
        boolean z2 = true;
        if (oVar2 == null || !str.equals(oVar2.mo98541p())) {
            z = false;
        } else {
            z = true;
        }
        if (oVar == null || !str.equals(oVar.mo98541p())) {
            z2 = false;
        }
        if (z) {
            mo98512d1(oVar2, hVar);
        } else if (z2) {
            mo98512d1(oVar, hVar);
        }
    }

    /* renamed from: M0 */
    public final void mo98496M0(String str, HashMap<C33859k, Object> hashMap) {
        for (C33818b next : hashMap.keySet()) {
            mo98494K0(str, mo98396O().get(next.mo98223b()), ((C33859k) next).mo98478l(), next.mo98222a(), hashMap.get(next));
        }
    }

    /* renamed from: N0 */
    public final void mo98497N0(String str, C33865o oVar, C33865o oVar2, C33823f fVar, List<Object> list) {
        Iterator<C33819c> it = fVar.mo98234d().iterator();
        Iterator<Object> it2 = list.iterator();
        while (it.hasNext() && it2.hasNext()) {
            mo98494K0(str, oVar, oVar2, it.next(), it2.next());
        }
    }

    /* renamed from: O0 */
    public void mo98498O0() {
        mo98424l0(true);
        this.f82127A = mo98385C();
        mo98404Z();
        mo98432q(mo98395N(), mo98396O());
        mo98493J0(mo98391I(), this.f82127A);
        mo98488E0(this.f82127A, true);
        mo98499P0(mo98440y());
        if (!this.f82130z) {
            mo98500Q0();
        }
        if (!this.f82129y) {
            mo98501R0();
        }
        mo98435t();
    }

    /* renamed from: P0 */
    public final void mo98499P0(HashMap<? extends C33818b, Object> hashMap) {
        for (C33818b e : hashMap.keySet()) {
            mo98409e(e);
        }
    }

    /* renamed from: Q0 */
    public final void mo98500Q0() {
        this.f82130z = true;
        Iterator<String> it = this.f82128x.iterator();
        while (it.hasNext()) {
            new C33863a(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    /* renamed from: R0 */
    public final void mo98501R0() {
        this.f82129y = true;
        Iterator<String> it = mo98393K().iterator();
        while (it.hasNext()) {
            new C33864b(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    /* renamed from: S0 */
    public final Bitmap mo98502S0(String str) throws IOException {
        return BitmapFactory.decodeStream(mo98508Z0((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())));
    }

    /* renamed from: U0 */
    public Iterable<C33853e> mo98503U0() {
        return mo98391I().keySet();
    }

    /* renamed from: V0 */
    public Iterable<? extends C33818b> mo98504V0() {
        return mo98390H();
    }

    /* renamed from: W0 */
    public Iterable<C33849b> mo98505W0() {
        return this.f82127A;
    }

    /* renamed from: X0 */
    public boolean mo98506X0() {
        return mo98398Q();
    }

    /* renamed from: Y0 */
    public boolean mo98507Y0() {
        return this.f82127A.size() > 0;
    }

    /* renamed from: Z0 */
    public final InputStream mo98508Z0(URLConnection uRLConnection) throws IOException {
        InputStream inputStream;
        boolean z;
        HttpURLConnection httpURLConnection;
        int responseCode;
        URL url;
        int i = 0;
        do {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).setInstanceFollowRedirects(false);
            }
            inputStream = uRLConnection.getInputStream();
            if (!(uRLConnection instanceof HttpURLConnection) || (responseCode = httpURLConnection.getResponseCode()) < 300 || responseCode > 307 || responseCode == 306 || responseCode == 304) {
                z = false;
                continue;
            } else {
                URL url2 = (httpURLConnection = (HttpURLConnection) uRLConnection).getURL();
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField != null) {
                    url = new URL(url2, headerField);
                } else {
                    url = null;
                }
                httpURLConnection.disconnect();
                if (url == null || ((!url.getProtocol().equals("http") && !url.getProtocol().equals("https")) || i >= 5)) {
                    throw new SecurityException("illegal URL redirect");
                }
                uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                i++;
                z = true;
                continue;
            }
        } while (z);
        return inputStream;
    }

    /* renamed from: a1 */
    public final void mo98509a1(Iterable<C33849b> iterable) {
        for (C33849b next : iterable) {
            mo98511c1(next.mo98447f());
            mo98412f0(next.mo98444c());
            mo98509a1(next.mo98443b());
        }
    }

    /* renamed from: b1 */
    public void mo98510b1() {
        mo98511c1(mo98440y());
        mo98412f0(mo98391I());
        if (mo98507Y0()) {
            mo98509a1(mo98505W0());
        }
        mo98424l0(false);
        mo98436u();
    }

    /* renamed from: c1 */
    public final void mo98511c1(HashMap<? extends C33818b, Object> hashMap) {
        mo98408d0(hashMap);
    }

    /* renamed from: d1 */
    public final void mo98512d1(C33865o oVar, C30587h hVar) {
        hVar.mo86575s(mo98383A(oVar.mo98541p(), oVar.mo98540o()));
    }

    /* renamed from: e1 */
    public void mo98513e1(HashMap<String, C33865o> hashMap, HashMap<String, String> hashMap2, HashMap<C33859k, Object> hashMap3, ArrayList<C33849b> arrayList, HashMap<C33853e, C30579d> hashMap4) {
        mo98431p0(hashMap, hashMap2, hashMap3, arrayList, hashMap4);
    }

    /* renamed from: f1 */
    public void mo98514f1(HashMap<String, C33865o> hashMap, HashMap<String, String> hashMap2, HashMap<C33859k, Object> hashMap3, ArrayList<C33849b> arrayList, HashMap<C33853e, C30579d> hashMap4, HashMap<String, Bitmap> hashMap5) {
        mo98431p0(hashMap, hashMap2, hashMap3, arrayList, hashMap4);
        for (Map.Entry next : hashMap5.entrySet()) {
            mo98434s((String) next.getKey(), (Bitmap) next.getValue());
        }
    }

    /* renamed from: m0 */
    public void mo98375m0(C30412c cVar) {
        mo98510b1();
        super.mo98375m0(cVar);
        mo98498O0();
    }
}
