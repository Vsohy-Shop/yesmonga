package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14348fg;
import com.contentsquare.android.sdk.C14804vd;
import com.contentsquare.android.sdk.C14810w1;
import com.contentsquare.android.sdk.C14833wb;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.rf */
public final class C14689rf {

    /* renamed from: a */
    public static final C14689rf f36358a = new C14689rf();

    /* renamed from: a */
    public final C14348fg mo36358a(C14507le leVar) {
        Intrinsics.checkNotNullParameter(leVar, "viewLight");
        C14810w1.C14811a aVar = C14810w1.f36711b;
        C14348fg.C14349a S = C14348fg.m61744S();
        Intrinsics.checkNotNullExpressionValue(S, "com.contentsquare.androi…V1.ViewStyle.newBuilder()");
        C14810w1 a = aVar.mo36673a(S);
        a.mo36671j(leVar.mo35835F());
        a.mo36672k(leVar.mo35836G());
        a.mo36668g(leVar.mo35842M());
        a.mo36664c(leVar.mo35832C());
        if (leVar.mo35840K() != null) {
            byte[] B = leVar.mo35831B();
            if (B != null) {
                C14719t0 k = C14719t0.m63434k(B);
                Intrinsics.checkNotNullExpressionValue(k, "ByteString.copyFrom(encodeBitmap)");
                a.mo36665d(k);
            }
            C14464k3 K = leVar.mo35840K();
            Intrinsics.checkNotNull(K);
            a.mo36669h(K.mo35706c());
        } else {
            a.mo36666e(f36358a.mo36359b(leVar.mo35869u()));
        }
        a.mo36663b(leVar.mo35839J());
        a.mo36670i(leVar.mo35846Q());
        a.mo36667f(leVar.mo35844O());
        return a.mo36662a();
    }

    /* renamed from: b */
    public final String mo36359b(int i) {
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(Locale.getDefault(), "#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }

    /* renamed from: c */
    public final C14833wb mo36360c(C14507le leVar) {
        Intrinsics.checkNotNullParameter(leVar, "viewLight");
        C14804vd.C14805a aVar = C14804vd.f36699b;
        C14833wb.C14834a O = C14833wb.m63916O();
        Intrinsics.checkNotNullExpressionValue(O, "com.contentsquare.androi…rdingV1.View.newBuilder()");
        C14804vd a = aVar.mo36646a(O);
        a.mo36641b(leVar.mo35837H());
        a.mo36644e(f36358a.mo36358a(leVar));
        C14833wb.C14835b b = C14833wb.C14835b.m63929b(2);
        Intrinsics.checkNotNullExpressionValue(b, "SessionRecordingV1.View.…forNumber(DEFAULT_FORMAT)");
        a.mo36643d(b);
        for (C14507le c : leVar.mo35872x()) {
            a.mo36642c(a.mo36645f(), f36358a.mo36360c(c));
        }
        return a.mo36640a();
    }
}
