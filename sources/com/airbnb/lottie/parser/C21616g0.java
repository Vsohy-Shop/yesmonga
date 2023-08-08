package com.airbnb.lottie.parser;

import androidx.appcompat.widget.SearchView;
import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.content.C21562b;
import com.airbnb.lottie.model.content.C21570j;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.parser.g0 */
public class C21616g0 {

    /* renamed from: a */
    public static JsonReader.C21628a f55923a = JsonReader.C21628a.m99628a(SearchView.f2053T1, "hd", "it");

    /* renamed from: a */
    public static C21570j m99593a(JsonReader jsonReader, C21495g gVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (jsonReader.mo64555g()) {
            int q = jsonReader.mo64564q(f55923a);
            if (q == 0) {
                str = jsonReader.mo64561m();
            } else if (q == 1) {
                z = jsonReader.mo64557i();
            } else if (q != 2) {
                jsonReader.mo64566s();
            } else {
                jsonReader.mo64551b();
                while (jsonReader.mo64555g()) {
                    C21562b a = C21615g.m99592a(jsonReader, gVar);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                jsonReader.mo64553d();
            }
        }
        return new C21570j(str, arrayList, z);
    }
}
