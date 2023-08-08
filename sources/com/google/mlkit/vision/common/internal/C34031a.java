package com.google.mlkit.vision.common.internal;

import android.content.Context;
import androidx.annotation.C0348i1;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.mlkit.common.internal.model.C33904c;
import com.google.mlkit.common.model.C33918c;
import com.google.mlkit.common.sdkinternal.C33935d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@C0348i1
@C40473a
/* renamed from: com.google.mlkit.vision.common.internal.a */
public class C34031a {
    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public static String[] m136922a(@RecentlyNonNull Context context, @RecentlyNonNull C33918c cVar, boolean z) throws IOException {
        String str;
        String str2;
        if (z) {
            str = (String) C40843u.m166202l(cVar.mo98665b());
        } else {
            str = (String) C40843u.m166202l(cVar.mo98664a());
        }
        if (cVar.mo98667d()) {
            C33904c.C33905a c = C33904c.m136506c(str, z, context);
            if (c != null) {
                C40843u.m166210t(C33935d.f82354d.equals(c.mo98632c()), "Model type should be: %s.", C33935d.f82354d);
                str = new File(new File(str).getParent(), c.mo98631b()).toString();
                str2 = new File(new File(str).getParent(), c.mo98630a()).toString();
            } else {
                throw new IOException("Failed to parse manifest file.");
            }
        } else {
            str2 = "";
        }
        return new String[]{str, str2};
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: b */
    public static List<String> m136923b(@RecentlyNonNull Context context, @RecentlyNonNull String str, boolean z) throws IOException {
        InputStream inputStream;
        ArrayList arrayList = new ArrayList();
        if (z) {
            inputStream = context.getAssets().open(str);
        } else {
            inputStream = new FileInputStream(new File(str));
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                arrayList.add(readLine);
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return arrayList;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
