package com.contentsquare.android.sdk;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* renamed from: com.contentsquare.android.sdk.n4 */
public final class C14542n4 {

    /* renamed from: a */
    public static final C14453jf f35987a = new C14453jf("SessionReplayRules");

    /* renamed from: a */
    public static final C14500la m62678a(C14500la laVar, String str, C11289a<? extends C14500la> aVar) {
        C14500la laVar2;
        Intrinsics.checkNotNullParameter(laVar, "$this$ruleBlock");
        Intrinsics.checkNotNullParameter(str, "ruleName");
        Intrinsics.checkNotNullParameter(aVar, "rule");
        int i = C14813w3.f36714a[laVar.ordinal()];
        if (i == 1) {
            laVar2 = (C14500la) aVar.invoke();
        } else if (i == 2 || i == 3 || i == 4) {
            laVar2 = laVar;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        m62679b(str, laVar, laVar2);
        return laVar2;
    }

    /* renamed from: b */
    public static final void m62679b(String str, C14500la laVar, C14500la laVar2) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "ruleName");
        Intrinsics.checkNotNullParameter(laVar, "input");
        Intrinsics.checkNotNullParameter(laVar2, "output");
        if (laVar == C14500la.EVALUATE) {
            int i = C14813w3.f36715b[laVar2.ordinal()];
            if (i == 1) {
                str2 = "session replay will start.";
            } else if (i == 2) {
                str2 = "session replay will stop.";
            } else if (i == 3) {
                str2 = "continue evaluate.";
            } else if (i == 4) {
                str2 = "breaking the rule chain.";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C14453jf jfVar = f35987a;
            String padEnd = StringsKt__StringsKt.padEnd(str, 30, '.');
            jfVar.mo35676e("-> " + padEnd + " applied, " + str2 + " ");
        }
    }
}
