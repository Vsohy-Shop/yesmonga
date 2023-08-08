package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14466k4;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.C11409d;

/* renamed from: com.contentsquare.android.sdk.m9 */
public final class C14525m9 {

    /* renamed from: a */
    public static final C14453jf f35931a = new C14453jf("RecordingRateRule");

    @C11076d0(mo22514bv = {}, mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/la;", "a", "()Lcom/contentsquare/android/sdk/la;"}, mo22517k = 3, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.sdk.m9$a */
    public static final class C14526a extends Lambda implements C11289a<C14500la> {

        /* renamed from: a */
        public final /* synthetic */ C14771u6 f35932a;

        /* renamed from: b */
        public final /* synthetic */ C14213b7 f35933b;

        /* renamed from: c */
        public final /* synthetic */ C14922z7 f35934c;

        /* renamed from: d */
        public final /* synthetic */ boolean f35935d;

        /* renamed from: e */
        public final /* synthetic */ C14695s3 f35936e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14526a(C14771u6 u6Var, C14213b7 b7Var, C14922z7 z7Var, boolean z, C14695s3 s3Var) {
            super(0);
            this.f35932a = u6Var;
            this.f35933b = b7Var;
            this.f35934c = z7Var;
            this.f35935d = z;
            this.f35936e = s3Var;
        }

        /* renamed from: a */
        public final C14500la invoke() {
            C14466k4 c = this.f35932a.mo36561c();
            C14466k4.C14471e a = c != null ? this.f35934c.mo36945a(c, this.f35933b.mo34676h(C14477k8.CLIENT_MODE_GOD_MODE, false)) : null;
            C14525m9.f35931a.mo35674c("isNewSession = %b, projectConfiguration = %b.", Boolean.valueOf(this.f35935d), a);
            return (a == null || !C14525m9.m62615e(this.f35933b, a, this.f35936e, this.f35935d)) ? C14500la.PROPAGATE_STOP : C14500la.PROPAGATE_START;
        }
    }

    /* renamed from: a */
    public static final int m62611a(C14213b7 b7Var, C14695s3 s3Var, boolean z) {
        C14477k8 k8Var = C14477k8.RECORDING_RATE;
        int b = b7Var.mo34670b(k8Var, -1);
        if (b != -1 && !z) {
            return b;
        }
        int a = s3Var.mo36375a();
        b7Var.mo34679k(k8Var, a);
        return a;
    }

    /* renamed from: b */
    public static final C14500la m62612b(C14500la laVar, C14771u6 u6Var, C14213b7 b7Var, C14922z7 z7Var, C14695s3 s3Var, boolean z) {
        Intrinsics.checkNotNullParameter(laVar, "$this$recordingRateRule");
        Intrinsics.checkNotNullParameter(u6Var, BannerConfigurableFragment.f27258E0);
        Intrinsics.checkNotNullParameter(b7Var, "preferenceStore");
        Intrinsics.checkNotNullParameter(z7Var, "configurationChooser");
        Intrinsics.checkNotNullParameter(s3Var, "randomGenerator");
        return C14542n4.m62678a(laVar, "RecordingRateRule", new C14526a(u6Var, b7Var, z7Var, z, s3Var));
    }

    /* renamed from: e */
    public static final boolean m62615e(C14213b7 b7Var, C14466k4.C14471e eVar, C14695s3 s3Var, boolean z) {
        C14466k4.C14472f h = eVar.mo35730h();
        Intrinsics.checkNotNullExpressionValue(h, "projectConfiguration.sessionReplay");
        int K0 = C11409d.m43849K0(h.mo35741f() * ((double) 100));
        int a = m62611a(b7Var, s3Var, z);
        boolean z2 = a <= K0;
        C14453jf jfVar = f35931a;
        jfVar.mo35676e("segmentSize = " + K0 + ", recordingRate = " + a + ", result = " + z2 + ".");
        return z2;
    }
}
