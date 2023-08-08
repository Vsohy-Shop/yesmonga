package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.c0 */
public final class C41886c0 implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ C42011j f106039a;

    /* renamed from: b */
    public final /* synthetic */ C41909d5 f106040b;

    public C41886c0(C42011j jVar, C41909d5 d5Var) {
        this.f106039a = jVar;
        this.f106040b = d5Var;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C42133q qVar = (C42133q) obj;
        C42133q qVar2 = (C42133q) obj2;
        C42011j jVar = this.f106039a;
        C41909d5 d5Var = this.f106040b;
        if (qVar instanceof C42218v) {
            if (!(qVar2 instanceof C42218v)) {
                return 1;
            }
            return 0;
        } else if (qVar2 instanceof C42218v) {
            return -1;
        } else {
            if (jVar == null) {
                return qVar.mo136744k().compareTo(qVar2.mo136744k());
            }
            return (int) C41928e6.m169803a(jVar.mo136725a(d5Var, Arrays.asList(new C42133q[]{qVar, qVar2})).mo136743j().doubleValue());
        }
    }
}
