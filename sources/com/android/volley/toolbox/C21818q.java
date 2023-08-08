package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import androidx.annotation.C0353k0;
import androidx.annotation.C0363p0;
import com.android.volley.C21764n;
import com.android.volley.C21771p;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.android.volley.toolbox.q */
public class C21818q {

    /* renamed from: a */
    public final C21764n f56441a;

    /* renamed from: b */
    public int f56442b = 100;

    /* renamed from: c */
    public final C21824f f56443c;

    /* renamed from: d */
    public final HashMap<String, C21823e> f56444d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, C21823e> f56445e = new HashMap<>();

    /* renamed from: f */
    public final Handler f56446f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    public Runnable f56447g;

    /* renamed from: com.android.volley.toolbox.q$a */
    public class C21819a implements C21826h {

        /* renamed from: a */
        public final /* synthetic */ int f56448a;

        /* renamed from: b */
        public final /* synthetic */ ImageView f56449b;

        /* renamed from: c */
        public final /* synthetic */ int f56450c;

        public C21819a(int i, ImageView imageView, int i2) {
            this.f56448a = i;
            this.f56449b = imageView;
            this.f56450c = i2;
        }

        /* renamed from: a */
        public void mo64978a(C21825g gVar, boolean z) {
            if (gVar.mo65056d() != null) {
                this.f56449b.setImageBitmap(gVar.mo65056d());
                return;
            }
            int i = this.f56450c;
            if (i != 0) {
                this.f56449b.setImageResource(i);
            }
        }

        /* renamed from: c */
        public void mo20312c(VolleyError volleyError) {
            int i = this.f56448a;
            if (i != 0) {
                this.f56449b.setImageResource(i);
            }
        }
    }

    /* renamed from: com.android.volley.toolbox.q$b */
    public class C21820b implements C21771p.C21773b<Bitmap> {

        /* renamed from: a */
        public final /* synthetic */ String f56451a;

        public C21820b(String str) {
            this.f56451a = str;
        }

        /* renamed from: a */
        public void mo20311b(Bitmap bitmap) {
            C21818q.this.mo65045n(this.f56451a, bitmap);
        }
    }

    /* renamed from: com.android.volley.toolbox.q$c */
    public class C21821c implements C21771p.C21772a {

        /* renamed from: a */
        public final /* synthetic */ String f56453a;

        public C21821c(String str) {
            this.f56453a = str;
        }

        /* renamed from: c */
        public void mo20312c(VolleyError volleyError) {
            C21818q.this.mo65044m(this.f56453a, volleyError);
        }
    }

    /* renamed from: com.android.volley.toolbox.q$d */
    public class C21822d implements Runnable {
        public C21822d() {
        }

        public void run() {
            for (C21823e eVar : C21818q.this.f56445e.values()) {
                for (C21825g gVar : eVar.f56459d) {
                    if (gVar.f56461b != null) {
                        if (eVar.mo65050e() == null) {
                            Bitmap unused = gVar.f56460a = eVar.f56457b;
                            gVar.f56461b.mo64978a(gVar, false);
                        } else {
                            gVar.f56461b.mo20312c(eVar.mo65050e());
                        }
                    }
                }
            }
            C21818q.this.f56445e.clear();
            Runnable unused2 = C21818q.this.f56447g = null;
        }
    }

    /* renamed from: com.android.volley.toolbox.q$e */
    public static class C21823e {

        /* renamed from: a */
        public final Request<?> f56456a;

        /* renamed from: b */
        public Bitmap f56457b;

        /* renamed from: c */
        public VolleyError f56458c;

        /* renamed from: d */
        public final List<C21825g> f56459d;

        public C21823e(Request<?> request, C21825g gVar) {
            ArrayList arrayList = new ArrayList();
            this.f56459d = arrayList;
            this.f56456a = request;
            arrayList.add(gVar);
        }

        /* renamed from: d */
        public void mo65049d(C21825g gVar) {
            this.f56459d.add(gVar);
        }

        /* renamed from: e */
        public VolleyError mo65050e() {
            return this.f56458c;
        }

        /* renamed from: f */
        public boolean mo65051f(C21825g gVar) {
            this.f56459d.remove(gVar);
            if (this.f56459d.size() != 0) {
                return false;
            }
            this.f56456a.mo64811q();
            return true;
        }

        /* renamed from: g */
        public void mo65052g(VolleyError volleyError) {
            this.f56458c = volleyError;
        }
    }

    /* renamed from: com.android.volley.toolbox.q$f */
    public interface C21824f {
        /* renamed from: a */
        void mo65053a(String str, Bitmap bitmap);

        @C0363p0
        /* renamed from: b */
        Bitmap mo65054b(String str);
    }

    /* renamed from: com.android.volley.toolbox.q$g */
    public class C21825g {

        /* renamed from: a */
        public Bitmap f56460a;

        /* renamed from: b */
        public final C21826h f56461b;

        /* renamed from: c */
        public final String f56462c;

        /* renamed from: d */
        public final String f56463d;

        public C21825g(Bitmap bitmap, String str, String str2, C21826h hVar) {
            this.f56460a = bitmap;
            this.f56463d = str;
            this.f56462c = str2;
            this.f56461b = hVar;
        }

        @C0353k0
        /* renamed from: c */
        public void mo65055c() {
            C21785b0.m100130a();
            if (this.f56461b != null) {
                C21823e eVar = (C21823e) C21818q.this.f56444d.get(this.f56462c);
                if (eVar == null) {
                    C21823e eVar2 = (C21823e) C21818q.this.f56445e.get(this.f56462c);
                    if (eVar2 != null) {
                        eVar2.mo65051f(this);
                        if (eVar2.f56459d.size() == 0) {
                            C21818q.this.f56445e.remove(this.f56462c);
                        }
                    }
                } else if (eVar.mo65051f(this)) {
                    C21818q.this.f56444d.remove(this.f56462c);
                }
            }
        }

        /* renamed from: d */
        public Bitmap mo65056d() {
            return this.f56460a;
        }

        /* renamed from: e */
        public String mo65057e() {
            return this.f56463d;
        }
    }

    /* renamed from: com.android.volley.toolbox.q$h */
    public interface C21826h extends C21771p.C21772a {
        /* renamed from: a */
        void mo64978a(C21825g gVar, boolean z);
    }

    public C21818q(C21764n nVar, C21824f fVar) {
        this.f56441a = nVar;
        this.f56443c = fVar;
    }

    /* renamed from: h */
    public static String m100242h(String str, int i, int i2, ImageView.ScaleType scaleType) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i);
        sb.append("#H");
        sb.append(i2);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: i */
    public static C21826h m100243i(ImageView imageView, int i, int i2) {
        return new C21819a(i2, imageView, i);
    }

    /* renamed from: d */
    public final void mo65037d(String str, C21823e eVar) {
        this.f56445e.put(str, eVar);
        if (this.f56447g == null) {
            C21822d dVar = new C21822d();
            this.f56447g = dVar;
            this.f56446f.postDelayed(dVar, (long) this.f56442b);
        }
    }

    /* renamed from: e */
    public C21825g mo65038e(String str, C21826h hVar) {
        return mo65039f(str, hVar, 0, 0);
    }

    /* renamed from: f */
    public C21825g mo65039f(String str, C21826h hVar, int i, int i2) {
        return mo65040g(str, hVar, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    @C0353k0
    /* renamed from: g */
    public C21825g mo65040g(String str, C21826h hVar, int i, int i2, ImageView.ScaleType scaleType) {
        C21826h hVar2 = hVar;
        C21785b0.m100130a();
        String h = m100242h(str, i, i2, scaleType);
        Bitmap b = this.f56443c.mo65054b(h);
        if (b != null) {
            C21825g gVar = new C21825g(b, str, (String) null, (C21826h) null);
            hVar2.mo64978a(gVar, true);
            return gVar;
        }
        C21825g gVar2 = new C21825g((Bitmap) null, str, h, hVar);
        hVar2.mo64978a(gVar2, true);
        C21823e eVar = this.f56444d.get(h);
        if (eVar == null) {
            eVar = this.f56445e.get(h);
        }
        if (eVar != null) {
            eVar.mo65049d(gVar2);
            return gVar2;
        }
        Request<Bitmap> l = mo65043l(str, i, i2, scaleType, h);
        this.f56441a.mo64944a(l);
        this.f56444d.put(h, new C21823e(l, gVar2));
        return gVar2;
    }

    /* renamed from: j */
    public boolean mo65041j(String str, int i, int i2) {
        return mo65042k(str, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    @C0353k0
    /* renamed from: k */
    public boolean mo65042k(String str, int i, int i2, ImageView.ScaleType scaleType) {
        C21785b0.m100130a();
        if (this.f56443c.mo65054b(m100242h(str, i, i2, scaleType)) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public Request<Bitmap> mo65043l(String str, int i, int i2, ImageView.ScaleType scaleType, String str2) {
        return new C21827r(str, new C21820b(str2), i, i2, scaleType, Bitmap.Config.RGB_565, new C21821c(str2));
    }

    /* renamed from: m */
    public void mo65044m(String str, VolleyError volleyError) {
        C21823e remove = this.f56444d.remove(str);
        if (remove != null) {
            remove.mo65052g(volleyError);
            mo65037d(str, remove);
        }
    }

    /* renamed from: n */
    public void mo65045n(String str, Bitmap bitmap) {
        this.f56443c.mo65053a(str, bitmap);
        C21823e remove = this.f56444d.remove(str);
        if (remove != null) {
            Bitmap unused = remove.f56457b = bitmap;
            mo65037d(str, remove);
        }
    }

    /* renamed from: o */
    public void mo65046o(int i) {
        this.f56442b = i;
    }
}
