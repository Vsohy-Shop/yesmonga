package com.airbnb.lottie.parser;

import androidx.appcompat.widget.SearchView;
import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.w */
public class C21652w {

    /* renamed from: a */
    public static final JsonReader.C21628a f56049a = JsonReader.C21628a.m99628a(SearchView.f2053T1, "mm", "hd");

    /* renamed from: a */
    public static MergePaths m99713a(JsonReader jsonReader) throws IOException {
        String str = null;
        boolean z = false;
        MergePaths.MergePathsMode mergePathsMode = null;
        while (jsonReader.mo64555g()) {
            int q = jsonReader.mo64564q(f56049a);
            if (q == 0) {
                str = jsonReader.mo64561m();
            } else if (q == 1) {
                mergePathsMode = MergePaths.MergePathsMode.m99312b(jsonReader.mo64559k());
            } else if (q != 2) {
                jsonReader.mo64565r();
                jsonReader.mo64566s();
            } else {
                z = jsonReader.mo64557i();
            }
        }
        return new MergePaths(str, mergePathsMode, z);
    }
}
