package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.C0348i1;
import androidx.annotation.C0363p0;
import androidx.annotation.C0374u0;
import androidx.browser.browseractions.C0897f;
import androidx.multidex.MultiDexExtractor;
import com.airbnb.lottie.model.C21575f;
import com.airbnb.lottie.parser.C21649t;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.C21682f;
import com.airbnb.lottie.utils.C21686j;
import com.google.mlkit.common.sdkinternal.C33935d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.C12465c0;
import okio.C12507o;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.h */
public class C21499h {

    /* renamed from: a */
    public static final Map<String, C21656q<C21495g>> f55461a = new HashMap();

    /* renamed from: b */
    public static final byte[] f55462b = {80, 75, 3, 4};

    /* renamed from: com.airbnb.lottie.h$a */
    public class C21500a implements C21537l<C21495g> {

        /* renamed from: a */
        public final /* synthetic */ String f55463a;

        public C21500a(String str) {
            this.f55463a = str;
        }

        /* renamed from: a */
        public void onResult(C21495g gVar) {
            C21499h.f55461a.remove(this.f55463a);
        }
    }

    /* renamed from: com.airbnb.lottie.h$b */
    public class C21501b implements C21537l<Throwable> {

        /* renamed from: a */
        public final /* synthetic */ String f55464a;

        public C21501b(String str) {
            this.f55464a = str;
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            C21499h.f55461a.remove(this.f55464a);
        }
    }

    /* renamed from: com.airbnb.lottie.h$c */
    public class C21502c implements Callable<C21602p<C21495g>> {

        /* renamed from: a */
        public final /* synthetic */ Context f55465a;

        /* renamed from: b */
        public final /* synthetic */ String f55466b;

        /* renamed from: c */
        public final /* synthetic */ String f55467c;

        public C21502c(Context context, String str, String str2) {
            this.f55465a = context;
            this.f55466b = str;
            this.f55467c = str2;
        }

        /* renamed from: a */
        public C21602p<C21495g> call() {
            C21602p<C21495g> c = C21492e.m99020d(this.f55465a).mo64534c(this.f55466b, this.f55467c);
            if (!(this.f55467c == null || c.mo64539b() == null)) {
                C21575f.m99425c().mo64440d(this.f55467c, c.mo64539b());
            }
            return c;
        }
    }

    /* renamed from: com.airbnb.lottie.h$d */
    public class C21503d implements Callable<C21602p<C21495g>> {

        /* renamed from: a */
        public final /* synthetic */ Context f55468a;

        /* renamed from: b */
        public final /* synthetic */ String f55469b;

        /* renamed from: c */
        public final /* synthetic */ String f55470c;

        public C21503d(Context context, String str, String str2) {
            this.f55468a = context;
            this.f55469b = str;
            this.f55470c = str2;
        }

        /* renamed from: a */
        public C21602p<C21495g> call() {
            return C21499h.m99078h(this.f55468a, this.f55469b, this.f55470c);
        }
    }

    /* renamed from: com.airbnb.lottie.h$e */
    public class C21504e implements Callable<C21602p<C21495g>> {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f55471a;

        /* renamed from: b */
        public final /* synthetic */ Context f55472b;

        /* renamed from: c */
        public final /* synthetic */ int f55473c;

        /* renamed from: d */
        public final /* synthetic */ String f55474d;

        public C21504e(WeakReference weakReference, Context context, int i, String str) {
            this.f55471a = weakReference;
            this.f55472b = context;
            this.f55473c = i;
            this.f55474d = str;
        }

        /* renamed from: a */
        public C21602p<C21495g> call() {
            Context context = (Context) this.f55471a.get();
            if (context == null) {
                context = this.f55472b;
            }
            return C21499h.m99092v(context, this.f55473c, this.f55474d);
        }
    }

    /* renamed from: com.airbnb.lottie.h$f */
    public class C21505f implements Callable<C21602p<C21495g>> {

        /* renamed from: a */
        public final /* synthetic */ InputStream f55475a;

        /* renamed from: b */
        public final /* synthetic */ String f55476b;

        public C21505f(InputStream inputStream, String str) {
            this.f55475a = inputStream;
            this.f55476b = str;
        }

        /* renamed from: a */
        public C21602p<C21495g> call() {
            return C21499h.m99081k(this.f55475a, this.f55476b);
        }
    }

    /* renamed from: com.airbnb.lottie.h$g */
    public class C21506g implements Callable<C21602p<C21495g>> {

        /* renamed from: a */
        public final /* synthetic */ JSONObject f55477a;

        /* renamed from: b */
        public final /* synthetic */ String f55478b;

        public C21506g(JSONObject jSONObject, String str) {
            this.f55477a = jSONObject;
            this.f55478b = str;
        }

        /* renamed from: a */
        public C21602p<C21495g> call() {
            return C21499h.m99088r(this.f55477a, this.f55478b);
        }
    }

    /* renamed from: com.airbnb.lottie.h$h */
    public class C21507h implements Callable<C21602p<C21495g>> {

        /* renamed from: a */
        public final /* synthetic */ String f55479a;

        /* renamed from: b */
        public final /* synthetic */ String f55480b;

        public C21507h(String str, String str2) {
            this.f55479a = str;
            this.f55480b = str2;
        }

        /* renamed from: a */
        public C21602p<C21495g> call() {
            return C21499h.m99087q(this.f55479a, this.f55480b);
        }
    }

    /* renamed from: com.airbnb.lottie.h$i */
    public class C21508i implements Callable<C21602p<C21495g>> {

        /* renamed from: a */
        public final /* synthetic */ JsonReader f55481a;

        /* renamed from: b */
        public final /* synthetic */ String f55482b;

        public C21508i(JsonReader jsonReader, String str) {
            this.f55481a = jsonReader;
            this.f55482b = str;
        }

        /* renamed from: a */
        public C21602p<C21495g> call() {
            return C21499h.m99084n(this.f55481a, this.f55482b);
        }
    }

    /* renamed from: com.airbnb.lottie.h$j */
    public class C21509j implements Callable<C21602p<C21495g>> {

        /* renamed from: a */
        public final /* synthetic */ ZipInputStream f55483a;

        /* renamed from: b */
        public final /* synthetic */ String f55484b;

        public C21509j(ZipInputStream zipInputStream, String str) {
            this.f55483a = zipInputStream;
            this.f55484b = str;
        }

        /* renamed from: a */
        public C21602p<C21495g> call() {
            return C21499h.m99065B(this.f55483a, this.f55484b);
        }
    }

    /* renamed from: com.airbnb.lottie.h$k */
    public class C21510k implements Callable<C21602p<C21495g>> {

        /* renamed from: a */
        public final /* synthetic */ C21495g f55485a;

        public C21510k(C21495g gVar) {
            this.f55485a = gVar;
        }

        /* renamed from: a */
        public C21602p<C21495g> call() {
            return new C21602p<>(this.f55485a);
        }
    }

    /* renamed from: A */
    public static C21656q<C21495g> m99064A(ZipInputStream zipInputStream, @C0363p0 String str) {
        return m99072b(str, new C21509j(zipInputStream, str));
    }

    @C0348i1
    /* renamed from: B */
    public static C21602p<C21495g> m99065B(ZipInputStream zipInputStream, @C0363p0 String str) {
        try {
            return m99066C(zipInputStream, str);
        } finally {
            C21686j.m99802c(zipInputStream);
        }
    }

    @C0348i1
    /* renamed from: C */
    public static C21602p<C21495g> m99066C(ZipInputStream zipInputStream, @C0363p0 String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C21495g gVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase(C33935d.f82353c)) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    gVar = m99085o(JsonReader.m99610n(C12465c0.m50481d(C12465c0.m50496s(zipInputStream))), (String) null, false).mo64539b();
                } else {
                    if (!name.contains(C0897f.f2797K0) && !name.contains(".webp") && !name.contains(".jpg")) {
                        if (!name.contains(".jpeg")) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (gVar == null) {
                return new C21602p<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C21536k d = m99074d(gVar, (String) entry.getKey());
                if (d != null) {
                    d.mo64277h(C21686j.m99812m((Bitmap) entry.getValue(), d.mo64275f(), d.mo64273d()));
                }
            }
            for (Map.Entry next : gVar.mo64127j().entrySet()) {
                if (((C21536k) next.getValue()).mo64270a() == null) {
                    return new C21602p<>((Throwable) new IllegalStateException("There is no image for " + ((C21536k) next.getValue()).mo64272c()));
                }
            }
            if (str != null) {
                C21575f.m99425c().mo64440d(str, gVar);
            }
            return new C21602p<>(gVar);
        } catch (IOException e) {
            return new C21602p<>((Throwable) e);
        }
    }

    /* renamed from: D */
    public static boolean m99067D(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: E */
    public static Boolean m99068E(C12507o oVar) {
        try {
            C12507o R3 = oVar.mo27281R3();
            for (byte b : f55462b) {
                if (R3.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            R3.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            C21682f.m99758c("Failed to check zip file header", e);
            return Boolean.FALSE;
        }
    }

    /* renamed from: F */
    public static String m99069F(Context context, @C0374u0 int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(m99067D(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: G */
    public static void m99070G(int i) {
        C21575f.m99425c().mo64441e(i);
    }

    /* renamed from: b */
    public static C21656q<C21495g> m99072b(@C0363p0 String str, Callable<C21602p<C21495g>> callable) {
        C21495g gVar;
        if (str == null) {
            gVar = null;
        } else {
            gVar = C21575f.m99425c().mo64439b(str);
        }
        if (gVar != null) {
            return new C21656q<>(new C21510k(gVar));
        }
        if (str != null) {
            Map<String, C21656q<C21495g>> map = f55461a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C21656q<C21495g> qVar = new C21656q<>(callable);
        if (str != null) {
            qVar.mo64639f(new C21500a(str));
            qVar.mo64638e(new C21501b(str));
            f55461a.put(str, qVar);
        }
        return qVar;
    }

    /* renamed from: c */
    public static void m99073c(Context context) {
        f55461a.clear();
        C21575f.m99425c().mo64438a();
        C21492e.m99019c(context).mo64526a();
    }

    @C0363p0
    /* renamed from: d */
    public static C21536k m99074d(C21495g gVar, String str) {
        for (C21536k next : gVar.mo64127j().values()) {
            if (next.mo64272c().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static C21656q<C21495g> m99075e(Context context, String str) {
        return m99076f(context, str, "asset_" + str);
    }

    /* renamed from: f */
    public static C21656q<C21495g> m99076f(Context context, String str, @C0363p0 String str2) {
        return m99072b(str2, new C21503d(context.getApplicationContext(), str, str2));
    }

    @C0348i1
    /* renamed from: g */
    public static C21602p<C21495g> m99077g(Context context, String str) {
        return m99078h(context, str, "asset_" + str);
    }

    @C0348i1
    /* renamed from: h */
    public static C21602p<C21495g> m99078h(Context context, String str, @C0363p0 String str2) {
        try {
            if (!str.endsWith(MultiDexExtractor.f50287y)) {
                if (!str.endsWith(".lottie")) {
                    return m99081k(context.getAssets().open(str), str2);
                }
            }
            return m99065B(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new C21602p<>((Throwable) e);
        }
    }

    @Deprecated
    /* renamed from: i */
    public static C21656q<C21495g> m99079i(JSONObject jSONObject, @C0363p0 String str) {
        return m99072b(str, new C21506g(jSONObject, str));
    }

    /* renamed from: j */
    public static C21656q<C21495g> m99080j(InputStream inputStream, @C0363p0 String str) {
        return m99072b(str, new C21505f(inputStream, str));
    }

    @C0348i1
    /* renamed from: k */
    public static C21602p<C21495g> m99081k(InputStream inputStream, @C0363p0 String str) {
        return m99082l(inputStream, str, true);
    }

    @C0348i1
    /* renamed from: l */
    public static C21602p<C21495g> m99082l(InputStream inputStream, @C0363p0 String str, boolean z) {
        try {
            return m99084n(JsonReader.m99610n(C12465c0.m50481d(C12465c0.m50496s(inputStream))), str);
        } finally {
            if (z) {
                C21686j.m99802c(inputStream);
            }
        }
    }

    /* renamed from: m */
    public static C21656q<C21495g> m99083m(JsonReader jsonReader, @C0363p0 String str) {
        return m99072b(str, new C21508i(jsonReader, str));
    }

    @C0348i1
    /* renamed from: n */
    public static C21602p<C21495g> m99084n(JsonReader jsonReader, @C0363p0 String str) {
        return m99085o(jsonReader, str, true);
    }

    /* renamed from: o */
    public static C21602p<C21495g> m99085o(JsonReader jsonReader, @C0363p0 String str, boolean z) {
        try {
            C21495g a = C21649t.m99704a(jsonReader);
            if (str != null) {
                C21575f.m99425c().mo64440d(str, a);
            }
            C21602p<C21495g> pVar = new C21602p<>(a);
            if (z) {
                C21686j.m99802c(jsonReader);
            }
            return pVar;
        } catch (Exception e) {
            C21602p<C21495g> pVar2 = new C21602p<>((Throwable) e);
            if (z) {
                C21686j.m99802c(jsonReader);
            }
            return pVar2;
        } catch (Throwable th) {
            if (z) {
                C21686j.m99802c(jsonReader);
            }
            throw th;
        }
    }

    /* renamed from: p */
    public static C21656q<C21495g> m99086p(String str, @C0363p0 String str2) {
        return m99072b(str2, new C21507h(str, str2));
    }

    @C0348i1
    /* renamed from: q */
    public static C21602p<C21495g> m99087q(String str, @C0363p0 String str2) {
        return m99084n(JsonReader.m99610n(C12465c0.m50481d(C12465c0.m50496s(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @C0348i1
    @Deprecated
    /* renamed from: r */
    public static C21602p<C21495g> m99088r(JSONObject jSONObject, @C0363p0 String str) {
        return m99087q(jSONObject.toString(), str);
    }

    /* renamed from: s */
    public static C21656q<C21495g> m99089s(Context context, @C0374u0 int i) {
        return m99090t(context, i, m99069F(context, i));
    }

    /* renamed from: t */
    public static C21656q<C21495g> m99090t(Context context, @C0374u0 int i, @C0363p0 String str) {
        return m99072b(str, new C21504e(new WeakReference(context), context.getApplicationContext(), i, str));
    }

    @C0348i1
    /* renamed from: u */
    public static C21602p<C21495g> m99091u(Context context, @C0374u0 int i) {
        return m99092v(context, i, m99069F(context, i));
    }

    @C0348i1
    /* renamed from: v */
    public static C21602p<C21495g> m99092v(Context context, @C0374u0 int i, @C0363p0 String str) {
        try {
            C12507o d = C12465c0.m50481d(C12465c0.m50496s(context.getResources().openRawResource(i)));
            if (m99068E(d).booleanValue()) {
                return m99065B(new ZipInputStream(d.mo27294h0()), str);
            }
            return m99081k(d.mo27294h0(), str);
        } catch (Resources.NotFoundException e) {
            return new C21602p<>((Throwable) e);
        }
    }

    /* renamed from: w */
    public static C21656q<C21495g> m99093w(Context context, String str) {
        return m99094x(context, str, "url_" + str);
    }

    /* renamed from: x */
    public static C21656q<C21495g> m99094x(Context context, String str, @C0363p0 String str2) {
        return m99072b(str2, new C21502c(context, str, str2));
    }

    @C0348i1
    /* renamed from: y */
    public static C21602p<C21495g> m99095y(Context context, String str) {
        return m99096z(context, str, str);
    }

    @C0348i1
    /* renamed from: z */
    public static C21602p<C21495g> m99096z(Context context, String str, @C0363p0 String str2) {
        C21602p<C21495g> c = C21492e.m99020d(context).mo64534c(str, str2);
        if (!(str2 == null || c.mo64539b() == null)) {
            C21575f.m99425c().mo64440d(str2, c.mo64539b());
        }
        return c;
    }
}
