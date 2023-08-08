package com.airbnb.lottie.network;

import android.util.Pair;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.C21499h;
import com.airbnb.lottie.C21602p;
import com.airbnb.lottie.utils.C21682f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.network.g */
public class C21599g {
    @C0359n0

    /* renamed from: a */
    public final C21598f f55870a;
    @C0359n0

    /* renamed from: b */
    public final C21597e f55871b;

    public C21599g(@C0359n0 C21598f fVar, @C0359n0 C21597e eVar) {
        this.f55870a = fVar;
        this.f55871b = eVar;
    }

    @C0348i1
    @C0363p0
    /* renamed from: a */
    public final C21495g mo64532a(@C0359n0 String str, @C0363p0 String str2) {
        Pair<FileExtension, InputStream> b;
        C21602p<C21495g> pVar;
        if (str2 == null || (b = this.f55870a.mo64527b(str)) == null) {
            return null;
        }
        FileExtension fileExtension = (FileExtension) b.first;
        InputStream inputStream = (InputStream) b.second;
        if (fileExtension == FileExtension.ZIP) {
            pVar = C21499h.m99065B(new ZipInputStream(inputStream), str);
        } else {
            pVar = C21499h.m99081k(inputStream, str);
        }
        if (pVar.mo64539b() != null) {
            return pVar.mo64539b();
        }
        return null;
    }

    @C0348i1
    @C0359n0
    /* renamed from: b */
    public final C21602p<C21495g> mo64533b(@C0359n0 String str, @C0363p0 String str2) {
        boolean z;
        C21682f.m99756a("Fetching " + str);
        C21595c cVar = null;
        try {
            cVar = this.f55871b.mo64525a(str);
            if (cVar.isSuccessful()) {
                C21602p<C21495g> d = mo64535d(str, cVar.mo64524u1(), cVar.mo64522h(), str2);
                StringBuilder sb = new StringBuilder();
                sb.append("Completed fetch from network. Success: ");
                if (d.mo64539b() != null) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z);
                C21682f.m99756a(sb.toString());
                try {
                    cVar.close();
                } catch (IOException e) {
                    C21682f.m99761f("LottieFetchResult close failed ", e);
                }
                return d;
            }
            C21602p<C21495g> pVar = new C21602p<>((Throwable) new IllegalArgumentException(cVar.mo64521f3()));
            try {
                cVar.close();
            } catch (IOException e2) {
                C21682f.m99761f("LottieFetchResult close failed ", e2);
            }
            return pVar;
        } catch (Exception e3) {
            C21602p<C21495g> pVar2 = new C21602p<>((Throwable) e3);
            if (cVar != null) {
                try {
                    cVar.close();
                } catch (IOException e4) {
                    C21682f.m99761f("LottieFetchResult close failed ", e4);
                }
            }
            return pVar2;
        } catch (Throwable th) {
            if (cVar != null) {
                try {
                    cVar.close();
                } catch (IOException e5) {
                    C21682f.m99761f("LottieFetchResult close failed ", e5);
                }
            }
            throw th;
        }
    }

    @C0348i1
    @C0359n0
    /* renamed from: c */
    public C21602p<C21495g> mo64534c(@C0359n0 String str, @C0363p0 String str2) {
        C21495g a = mo64532a(str, str2);
        if (a != null) {
            return new C21602p<>(a);
        }
        C21682f.m99756a("Animation for " + str + " not found in cache. Fetching from network.");
        return mo64533b(str, str2);
    }

    @C0359n0
    /* renamed from: d */
    public final C21602p<C21495g> mo64535d(@C0359n0 String str, @C0359n0 InputStream inputStream, @C0363p0 String str2, @C0363p0 String str3) throws IOException {
        FileExtension fileExtension;
        C21602p<C21495g> pVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str.split("\\?")[0].endsWith(".lottie")) {
            C21682f.m99756a("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            pVar = mo64537f(str, inputStream, str3);
        } else {
            C21682f.m99756a("Received json response.");
            fileExtension = FileExtension.f55865a;
            pVar = mo64536e(str, inputStream, str3);
        }
        if (!(str3 == null || pVar.mo64539b() == null)) {
            this.f55870a.mo64530f(str, fileExtension);
        }
        return pVar;
    }

    @C0359n0
    /* renamed from: e */
    public final C21602p<C21495g> mo64536e(@C0359n0 String str, @C0359n0 InputStream inputStream, @C0363p0 String str2) throws IOException {
        if (str2 == null) {
            return C21499h.m99081k(inputStream, (String) null);
        }
        return C21499h.m99081k(new FileInputStream(new File(this.f55870a.mo64531g(str, inputStream, FileExtension.f55865a).getAbsolutePath())), str);
    }

    @C0359n0
    /* renamed from: f */
    public final C21602p<C21495g> mo64537f(@C0359n0 String str, @C0359n0 InputStream inputStream, @C0363p0 String str2) throws IOException {
        if (str2 == null) {
            return C21499h.m99065B(new ZipInputStream(inputStream), (String) null);
        }
        return C21499h.m99065B(new ZipInputStream(new FileInputStream(this.f55870a.mo64531g(str, inputStream, FileExtension.ZIP))), str);
    }
}
