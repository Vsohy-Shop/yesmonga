package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import androidx.annotation.C0348i1;
import androidx.annotation.C0363p0;
import androidx.annotation.C0374u0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1875h;
import androidx.collection.C1887m;
import com.airbnb.lottie.model.C21558b;
import com.airbnb.lottie.model.C21559c;
import com.airbnb.lottie.model.C21576g;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.C21682f;
import com.airbnb.lottie.utils.C21685i;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.g */
public class C21495g {

    /* renamed from: a */
    public final C21660s f55444a = new C21660s();

    /* renamed from: b */
    public final HashSet<String> f55445b = new HashSet<>();

    /* renamed from: c */
    public Map<String, List<Layer>> f55446c;

    /* renamed from: d */
    public Map<String, C21536k> f55447d;

    /* renamed from: e */
    public Map<String, C21558b> f55448e;

    /* renamed from: f */
    public List<C21576g> f55449f;

    /* renamed from: g */
    public C1887m<C21559c> f55450g;

    /* renamed from: h */
    public C1875h<Layer> f55451h;

    /* renamed from: i */
    public List<Layer> f55452i;

    /* renamed from: j */
    public Rect f55453j;

    /* renamed from: k */
    public float f55454k;

    /* renamed from: l */
    public float f55455l;

    /* renamed from: m */
    public float f55456m;

    /* renamed from: n */
    public boolean f55457n;

    /* renamed from: o */
    public int f55458o = 0;

    @Deprecated
    /* renamed from: com.airbnb.lottie.g$b */
    public static class C21497b {

        /* renamed from: com.airbnb.lottie.g$b$a */
        public static final class C21498a implements C21537l<C21495g>, C21489b {

            /* renamed from: a */
            public final C21659r f55459a;

            /* renamed from: b */
            public boolean f55460b;

            /* renamed from: a */
            public void onResult(C21495g gVar) {
                if (!this.f55460b) {
                    this.f55459a.mo64648a(gVar);
                }
            }

            public void cancel() {
                this.f55460b = true;
            }

            public C21498a(C21659r rVar) {
                this.f55460b = false;
                this.f55459a = rVar;
            }
        }

        @Deprecated
        /* renamed from: a */
        public static C21489b m99052a(Context context, String str, C21659r rVar) {
            C21498a aVar = new C21498a(rVar);
            C21499h.m99075e(context, str).mo64639f(aVar);
            return aVar;
        }

        @C0348i1
        @C0363p0
        @Deprecated
        /* renamed from: b */
        public static C21495g m99053b(Context context, String str) {
            return C21499h.m99077g(context, str).mo64539b();
        }

        @Deprecated
        /* renamed from: c */
        public static C21489b m99054c(InputStream inputStream, C21659r rVar) {
            C21498a aVar = new C21498a(rVar);
            C21499h.m99080j(inputStream, (String) null).mo64639f(aVar);
            return aVar;
        }

        @C0348i1
        @C0363p0
        @Deprecated
        /* renamed from: d */
        public static C21495g m99055d(InputStream inputStream) {
            return C21499h.m99081k(inputStream, (String) null).mo64539b();
        }

        @C0348i1
        @C0363p0
        @Deprecated
        /* renamed from: e */
        public static C21495g m99056e(InputStream inputStream, boolean z) {
            if (z) {
                C21682f.m99760e("Lottie now auto-closes input stream!");
            }
            return C21499h.m99081k(inputStream, (String) null).mo64539b();
        }

        @Deprecated
        /* renamed from: f */
        public static C21489b m99057f(JsonReader jsonReader, C21659r rVar) {
            C21498a aVar = new C21498a(rVar);
            C21499h.m99083m(jsonReader, (String) null).mo64639f(aVar);
            return aVar;
        }

        @Deprecated
        /* renamed from: g */
        public static C21489b m99058g(String str, C21659r rVar) {
            C21498a aVar = new C21498a(rVar);
            C21499h.m99086p(str, (String) null).mo64639f(aVar);
            return aVar;
        }

        @C0348i1
        @C0363p0
        @Deprecated
        /* renamed from: h */
        public static C21495g m99059h(Resources resources, JSONObject jSONObject) {
            return C21499h.m99088r(jSONObject, (String) null).mo64539b();
        }

        @C0348i1
        @C0363p0
        @Deprecated
        /* renamed from: i */
        public static C21495g m99060i(JsonReader jsonReader) {
            return C21499h.m99084n(jsonReader, (String) null).mo64539b();
        }

        @C0348i1
        @C0363p0
        @Deprecated
        /* renamed from: j */
        public static C21495g m99061j(String str) {
            return C21499h.m99087q(str, (String) null).mo64539b();
        }

        @Deprecated
        /* renamed from: k */
        public static C21489b m99062k(Context context, @C0374u0 int i, C21659r rVar) {
            C21498a aVar = new C21498a(rVar);
            C21499h.m99089s(context, i).mo64639f(aVar);
            return aVar;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public void mo64118a(String str) {
        C21682f.m99760e(str);
        this.f55445b.add(str);
    }

    /* renamed from: b */
    public Rect mo64119b() {
        return this.f55453j;
    }

    /* renamed from: c */
    public C1887m<C21559c> mo64120c() {
        return this.f55450g;
    }

    /* renamed from: d */
    public float mo64121d() {
        return (float) ((long) ((mo64122e() / this.f55456m) * 1000.0f));
    }

    /* renamed from: e */
    public float mo64122e() {
        return this.f55455l - this.f55454k;
    }

    /* renamed from: f */
    public float mo64123f() {
        return this.f55455l;
    }

    /* renamed from: g */
    public Map<String, C21558b> mo64124g() {
        return this.f55448e;
    }

    /* renamed from: h */
    public float mo64125h(float f) {
        return C21685i.m99797k(this.f55454k, this.f55455l, f);
    }

    /* renamed from: i */
    public float mo64126i() {
        return this.f55456m;
    }

    /* renamed from: j */
    public Map<String, C21536k> mo64127j() {
        return this.f55447d;
    }

    /* renamed from: k */
    public List<Layer> mo64128k() {
        return this.f55452i;
    }

    @C0363p0
    /* renamed from: l */
    public C21576g mo64129l(String str) {
        int size = this.f55449f.size();
        for (int i = 0; i < size; i++) {
            C21576g gVar = this.f55449f.get(i);
            if (gVar.mo64442a(str)) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    public List<C21576g> mo64130m() {
        return this.f55449f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: n */
    public int mo64131n() {
        return this.f55458o;
    }

    /* renamed from: o */
    public C21660s mo64132o() {
        return this.f55444a;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: p */
    public List<Layer> mo64133p(String str) {
        return this.f55446c.get(str);
    }

    /* renamed from: q */
    public float mo64134q(float f) {
        float f2 = this.f55454k;
        return (f - f2) / (this.f55455l - f2);
    }

    /* renamed from: r */
    public float mo64135r() {
        return this.f55454k;
    }

    /* renamed from: s */
    public ArrayList<String> mo64136s() {
        HashSet<String> hashSet = this.f55445b;
        return new ArrayList<>(Arrays.asList(hashSet.toArray(new String[hashSet.size()])));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: t */
    public boolean mo64137t() {
        return this.f55457n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer w : this.f55452i) {
            sb.append(w.mo64470w("\t"));
        }
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo64139u() {
        return !this.f55447d.isEmpty();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: v */
    public void mo64140v(int i) {
        this.f55458o += i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: w */
    public void mo64141w(Rect rect, float f, float f2, float f3, List<Layer> list, C1875h<Layer> hVar, Map<String, List<Layer>> map, Map<String, C21536k> map2, C1887m<C21559c> mVar, Map<String, C21558b> map3, List<C21576g> list2) {
        this.f55453j = rect;
        this.f55454k = f;
        this.f55455l = f2;
        this.f55456m = f3;
        this.f55452i = list;
        this.f55451h = hVar;
        this.f55446c = map;
        this.f55447d = map2;
        this.f55450g = mVar;
        this.f55448e = map3;
        this.f55449f = list2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: x */
    public Layer mo64142x(long j) {
        return this.f55451h.mo6223k(j);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: y */
    public void mo64143y(boolean z) {
        this.f55457n = z;
    }

    /* renamed from: z */
    public void mo64144z(boolean z) {
        this.f55444a.mo64655g(z);
    }
}
