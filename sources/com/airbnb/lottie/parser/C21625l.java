package com.airbnb.lottie.parser;

import android.graphics.Color;
import androidx.annotation.C0337f0;
import com.airbnb.lottie.model.content.C21563c;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.C21685i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.parser.l */
public class C21625l implements C21624k0<C21563c> {

    /* renamed from: a */
    public int f55934a;

    public C21625l(int i) {
        this.f55934a = i;
    }

    /* renamed from: b */
    public final void mo64548b(C21563c cVar, List<Float> list) {
        int i = this.f55934a * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) list.get(i).floatValue();
                } else {
                    dArr2[i2] = (double) list.get(i).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < cVar.mo64371c(); i3++) {
                int i4 = cVar.mo64369a()[i3];
                cVar.mo64369a()[i3] = Color.argb(mo64549c((double) cVar.mo64370b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    @C0337f0(from = 0, mo995to = 255)
    /* renamed from: c */
    public final int mo64549c(double d, double[] dArr, double[] dArr2) {
        double d2;
        double[] dArr3 = dArr;
        double[] dArr4 = dArr2;
        int i = 1;
        while (true) {
            if (i >= dArr3.length) {
                d2 = dArr4[dArr4.length - 1];
                break;
            }
            int i2 = i - 1;
            double d3 = dArr3[i2];
            double d4 = dArr3[i];
            if (d4 >= d) {
                d2 = C21685i.m99796j(dArr4[i2], dArr4[i], C21685i.m99788b((d - d3) / (d4 - d3), 0.0d, 1.0d));
                break;
            }
            i++;
        }
        return (int) (d2 * 255.0d);
    }

    /* renamed from: d */
    public C21563c mo64542a(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo64562o() == JsonReader.Token.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.mo64551b();
        }
        while (jsonReader.mo64555g()) {
            arrayList.add(Float.valueOf((float) jsonReader.mo64558j()));
        }
        if (z) {
            jsonReader.mo64553d();
        }
        if (this.f55934a == -1) {
            this.f55934a = arrayList.size() / 4;
        }
        int i = this.f55934a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f55934a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        C21563c cVar = new C21563c(fArr, iArr);
        mo64548b(cVar, arrayList);
        return cVar;
    }
}
