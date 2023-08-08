package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.bumptech.glide.gifdecoder.C22075f;
import com.journeyapps.barcodescanner.camera.C34935s;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.parser.h */
public class C21617h implements C21624k0<DocumentData> {

    /* renamed from: a */
    public static final C21617h f55924a = new C21617h();

    /* renamed from: b */
    public static final JsonReader.C21628a f55925b = JsonReader.C21628a.m99628a(C10108c.f27801d, C22075f.f56695A, C34935s.f84988a, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    /* renamed from: b */
    public DocumentData mo64542a(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.mo64552c();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (jsonReader.mo64555g()) {
            switch (jsonReader.mo64564q(f55925b)) {
                case 0:
                    str = jsonReader.mo64561m();
                    break;
                case 1:
                    str2 = jsonReader.mo64561m();
                    break;
                case 2:
                    f2 = (float) jsonReader.mo64558j();
                    break;
                case 3:
                    int k = jsonReader.mo64559k();
                    justification2 = DocumentData.Justification.CENTER;
                    if (k <= justification2.ordinal() && k >= 0) {
                        justification2 = DocumentData.Justification.values()[k];
                        break;
                    }
                case 4:
                    i = jsonReader.mo64559k();
                    break;
                case 5:
                    f3 = (float) jsonReader.mo64558j();
                    break;
                case 6:
                    f4 = (float) jsonReader.mo64558j();
                    break;
                case 7:
                    i2 = C21643p.m99688d(jsonReader);
                    break;
                case 8:
                    i3 = C21643p.m99688d(jsonReader);
                    break;
                case 9:
                    f5 = (float) jsonReader.mo64558j();
                    break;
                case 10:
                    z = jsonReader.mo64557i();
                    break;
                default:
                    jsonReader.mo64565r();
                    jsonReader.mo64566s();
                    break;
            }
        }
        JsonReader jsonReader2 = jsonReader;
        jsonReader.mo64554f();
        return new DocumentData(str, str2, f2, justification2, i, f3, f4, i2, i3, f5, z);
    }
}
