package com.carrefour.fid.android.shared.p046io;

import com.carrefour.fid.android.shared.util.C28935i;
import com.carrefour.fid.android.shared.util.IntTypeAdapter;
import com.google.gson.C33614e;
import com.google.gson.C33621f;
import java.io.Reader;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import retrofit2.C13091w;

/* renamed from: com.carrefour.fid.android.shared.io.b */
public final class C28793b {
    @C12580l
    /* renamed from: a */
    public static final <T> C28792a m119157a(@C12579k C13091w<T> wVar) {
        Reader reader;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        if (wVar.mo30574e() == null) {
            return null;
        }
        try {
            C33614e d = new C33621f().mo97512k(Integer.class, new IntTypeAdapter()).mo97505d();
            ResponseBody e = wVar.mo30574e();
            if (e != null) {
                reader = e.charStream();
            } else {
                reader = null;
            }
            return (C28792a) d.mo97477l(reader, C28792a.class);
        } catch (Exception e2) {
            C28935i.m119705e(C28935i.f70940a, "OneApp response server error deserialization " + e2, (Throwable) null, 0, 6, (Object) null);
            return null;
        }
    }

    @C12579k
    /* renamed from: b */
    public static final <T> ResponseThrowable m119158b(@C12579k C13091w<T> wVar, @C12579k String str) {
        int i;
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "message");
        C28792a a = m119157a(wVar);
        if (a == null) {
            return new ResponseThrowable(wVar.mo30573b(), str);
        }
        Integer g = a.mo83817g();
        if (g != null) {
            i = g.intValue();
        } else {
            i = wVar.mo30573b();
        }
        String h = a.mo83818h();
        if (h != null) {
            str = h;
        }
        return new ResponseThrowable(i, str);
    }
}
