package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.C0354l;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.parser.p */
public class C21643p {

    /* renamed from: a */
    public static final JsonReader.C21628a f56032a = JsonReader.C21628a.m99628a("x", "y");

    /* renamed from: com.airbnb.lottie.parser.p$a */
    public static /* synthetic */ class C21644a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56033a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.parser.moshi.JsonReader$Token[] r0 = com.airbnb.lottie.parser.moshi.JsonReader.Token.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56033a = r0
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56033a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f56033a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.C21643p.C21644a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static PointF m99685a(JsonReader jsonReader, float f) throws IOException {
        jsonReader.mo64551b();
        float j = (float) jsonReader.mo64558j();
        float j2 = (float) jsonReader.mo64558j();
        while (jsonReader.mo64562o() != JsonReader.Token.END_ARRAY) {
            jsonReader.mo64566s();
        }
        jsonReader.mo64553d();
        return new PointF(j * f, j2 * f);
    }

    /* renamed from: b */
    public static PointF m99686b(JsonReader jsonReader, float f) throws IOException {
        float j = (float) jsonReader.mo64558j();
        float j2 = (float) jsonReader.mo64558j();
        while (jsonReader.mo64555g()) {
            jsonReader.mo64566s();
        }
        return new PointF(j * f, j2 * f);
    }

    /* renamed from: c */
    public static PointF m99687c(JsonReader jsonReader, float f) throws IOException {
        jsonReader.mo64552c();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.mo64555g()) {
            int q = jsonReader.mo64564q(f56032a);
            if (q == 0) {
                f2 = m99691g(jsonReader);
            } else if (q != 1) {
                jsonReader.mo64565r();
                jsonReader.mo64566s();
            } else {
                f3 = m99691g(jsonReader);
            }
        }
        jsonReader.mo64554f();
        return new PointF(f2 * f, f3 * f);
    }

    @C0354l
    /* renamed from: d */
    public static int m99688d(JsonReader jsonReader) throws IOException {
        jsonReader.mo64551b();
        int j = (int) (jsonReader.mo64558j() * 255.0d);
        int j2 = (int) (jsonReader.mo64558j() * 255.0d);
        int j3 = (int) (jsonReader.mo64558j() * 255.0d);
        while (jsonReader.mo64555g()) {
            jsonReader.mo64566s();
        }
        jsonReader.mo64553d();
        return Color.argb(255, j, j2, j3);
    }

    /* renamed from: e */
    public static PointF m99689e(JsonReader jsonReader, float f) throws IOException {
        int i = C21644a.f56033a[jsonReader.mo64562o().ordinal()];
        if (i == 1) {
            return m99686b(jsonReader, f);
        }
        if (i == 2) {
            return m99685a(jsonReader, f);
        }
        if (i == 3) {
            return m99687c(jsonReader, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.mo64562o());
    }

    /* renamed from: f */
    public static List<PointF> m99690f(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo64551b();
        while (jsonReader.mo64562o() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo64551b();
            arrayList.add(m99689e(jsonReader, f));
            jsonReader.mo64553d();
        }
        jsonReader.mo64553d();
        return arrayList;
    }

    /* renamed from: g */
    public static float m99691g(JsonReader jsonReader) throws IOException {
        JsonReader.Token o = jsonReader.mo64562o();
        int i = C21644a.f56033a[o.ordinal()];
        if (i == 1) {
            return (float) jsonReader.mo64558j();
        }
        if (i == 2) {
            jsonReader.mo64551b();
            float j = (float) jsonReader.mo64558j();
            while (jsonReader.mo64555g()) {
                jsonReader.mo64566s();
            }
            jsonReader.mo64553d();
            return j;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + o);
    }
}
