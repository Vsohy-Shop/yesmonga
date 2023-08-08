package com.airbnb.lottie.parser;

import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.C21559c;
import com.airbnb.lottie.model.content.C21570j;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.urbanairship.iam.C9168d0;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.parser.j */
public class C21621j {

    /* renamed from: a */
    public static final JsonReader.C21628a f55930a = JsonReader.C21628a.m99628a("ch", C9168d0.f24889w, "w", "style", "fFamily", "data");

    /* renamed from: b */
    public static final JsonReader.C21628a f55931b = JsonReader.C21628a.m99628a("shapes");

    /* renamed from: a */
    public static C21559c m99600a(JsonReader jsonReader, C21495g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo64552c();
        double d = 0.0d;
        String str = null;
        String str2 = null;
        char c = 0;
        double d2 = 0.0d;
        while (jsonReader.mo64555g()) {
            int q = jsonReader.mo64564q(f55930a);
            if (q == 0) {
                c = jsonReader.mo64561m().charAt(0);
            } else if (q == 1) {
                d2 = jsonReader.mo64558j();
            } else if (q == 2) {
                d = jsonReader.mo64558j();
            } else if (q == 3) {
                str = jsonReader.mo64561m();
            } else if (q == 4) {
                str2 = jsonReader.mo64561m();
            } else if (q != 5) {
                jsonReader.mo64565r();
                jsonReader.mo64566s();
            } else {
                jsonReader.mo64552c();
                while (jsonReader.mo64555g()) {
                    if (jsonReader.mo64564q(f55931b) != 0) {
                        jsonReader.mo64565r();
                        jsonReader.mo64566s();
                    } else {
                        jsonReader.mo64551b();
                        while (jsonReader.mo64555g()) {
                            arrayList.add((C21570j) C21615g.m99592a(jsonReader, gVar));
                        }
                        jsonReader.mo64553d();
                    }
                }
                jsonReader.mo64554f();
            }
        }
        jsonReader.mo64554f();
        return new C21559c(arrayList, c, d2, d, str, str2);
    }
}
