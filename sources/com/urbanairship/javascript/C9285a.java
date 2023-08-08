package com.urbanairship.javascript;

import android.content.Context;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.C36080x;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.javascript.a */
public class C9285a {

    /* renamed from: a */
    public final List<String> f25325a;

    /* renamed from: com.urbanairship.javascript.a$b */
    public static class C9287b {

        /* renamed from: a */
        public final List<String> f25326a;

        @C0359n0
        /* renamed from: b */
        public C9287b mo18678b(@C0359n0 String str, long j) {
            return mo18679c(str, JsonValue.m34975U(Long.valueOf(j)));
        }

        @C0359n0
        /* renamed from: c */
        public C9287b mo18679c(@C0359n0 String str, @C0363p0 C9333e eVar) {
            JsonValue jsonValue;
            if (eVar == null) {
                jsonValue = JsonValue.f25436b;
            } else {
                jsonValue = eVar.mo17264q();
            }
            this.f25326a.add(String.format(Locale.ROOT, "_UAirship.%s = function(){return %s;};", new Object[]{str, jsonValue.toString()}));
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C9287b mo18680d(@C0359n0 String str, @C0363p0 String str2) {
            return mo18679c(str, JsonValue.m34975U(str2));
        }

        @C0359n0
        /* renamed from: e */
        public C9285a mo18681e() {
            return new C9285a(this);
        }

        public C9287b() {
            this.f25326a = new ArrayList();
        }
    }

    @C0359n0
    /* renamed from: b */
    public static C9287b m34854b() {
        return new C9287b();
    }

    @C0348i1
    /* renamed from: c */
    public static String m34855c(@C0359n0 Context context) throws IOException {
        InputStream openRawResource = context.getResources().openRawResource(C36080x.C36093m.ua_native_bridge);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openRawResource.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            return byteArrayOutputStream.toString();
        } finally {
            try {
                openRawResource.close();
                byteArrayOutputStream.close();
            } catch (Exception e) {
                C36059m.m148407c(e, "Failed to close streams", new Object[0]);
            }
        }
    }

    @C0348i1
    /* renamed from: a */
    public String mo18677a(@C0359n0 Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append("var _UAirship = {};");
        for (String append : this.f25325a) {
            sb.append(append);
        }
        try {
            sb.append(m34855c(context));
            return sb.toString();
        } catch (IOException unused) {
            C36059m.m148409e("Failed to read native bridge.", new Object[0]);
            return "";
        }
    }

    public C9285a(@C0359n0 C9287b bVar) {
        this.f25325a = new ArrayList(bVar.f25326a);
    }
}
