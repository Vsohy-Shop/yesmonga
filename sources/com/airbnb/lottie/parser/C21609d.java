package com.airbnb.lottie.parser;

import com.airbnb.lottie.C21495g;
import com.airbnb.lottie.model.animatable.C21543a;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21545c;
import com.airbnb.lottie.model.animatable.C21546d;
import com.airbnb.lottie.model.animatable.C21548f;
import com.airbnb.lottie.model.animatable.C21549g;
import com.airbnb.lottie.model.animatable.C21550h;
import com.airbnb.lottie.model.animatable.C21552j;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.C21686j;
import com.airbnb.lottie.value.C21693a;
import com.airbnb.lottie.value.C21703k;
import java.io.IOException;
import java.util.List;

/* renamed from: com.airbnb.lottie.parser.d */
public class C21609d {
    /* renamed from: a */
    public static <T> List<C21693a<T>> m99573a(JsonReader jsonReader, float f, C21495g gVar, C21624k0<T> k0Var) throws IOException {
        return C21646r.m99700a(jsonReader, gVar, f, k0Var, false);
    }

    /* renamed from: b */
    public static <T> List<C21693a<T>> m99574b(JsonReader jsonReader, C21495g gVar, C21624k0<T> k0Var) throws IOException {
        return C21646r.m99700a(jsonReader, gVar, 1.0f, k0Var, false);
    }

    /* renamed from: c */
    public static C21543a m99575c(JsonReader jsonReader, C21495g gVar) throws IOException {
        return new C21543a(m99574b(jsonReader, gVar, C21613f.f55920a));
    }

    /* renamed from: d */
    public static C21552j m99576d(JsonReader jsonReader, C21495g gVar) throws IOException {
        return new C21552j(m99574b(jsonReader, gVar, C21617h.f55924a));
    }

    /* renamed from: e */
    public static C21544b m99577e(JsonReader jsonReader, C21495g gVar) throws IOException {
        return m99578f(jsonReader, gVar, true);
    }

    /* renamed from: f */
    public static C21544b m99578f(JsonReader jsonReader, C21495g gVar, boolean z) throws IOException {
        float f;
        if (z) {
            f = C21686j.m99804e();
        } else {
            f = 1.0f;
        }
        return new C21544b(m99573a(jsonReader, f, gVar, C21619i.f55927a));
    }

    /* renamed from: g */
    public static C21545c m99579g(JsonReader jsonReader, C21495g gVar, int i) throws IOException {
        return new C21545c(m99574b(jsonReader, gVar, new C21625l(i)));
    }

    /* renamed from: h */
    public static C21546d m99580h(JsonReader jsonReader, C21495g gVar) throws IOException {
        return new C21546d(m99574b(jsonReader, gVar, C21642o.f56031a));
    }

    /* renamed from: i */
    public static C21548f m99581i(JsonReader jsonReader, C21495g gVar) throws IOException {
        return new C21548f(C21646r.m99700a(jsonReader, gVar, C21686j.m99804e(), C21655z.f56051a, true));
    }

    /* renamed from: j */
    public static C21549g m99582j(JsonReader jsonReader, C21495g gVar) throws IOException {
        return new C21549g((List<C21693a<C21703k>>) m99574b(jsonReader, gVar, C21610d0.f55916a));
    }

    /* renamed from: k */
    public static C21550h m99583k(JsonReader jsonReader, C21495g gVar) throws IOException {
        return new C21550h(m99573a(jsonReader, C21686j.m99804e(), gVar, C21612e0.f55918a));
    }
}
