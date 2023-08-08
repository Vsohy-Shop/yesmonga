package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C42115of;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
public final class C30912v4 implements C42115of {

    /* renamed from: a */
    public final /* synthetic */ C30936x4 f74022a;

    public C30912v4(C30936x4 x4Var) {
        this.f74022a = x4Var;
    }

    /* renamed from: a */
    public final void mo87554a(int i, String str, List list, boolean z, boolean z2) {
        C30875s3 s3Var;
        int i2 = i - 1;
        if (i2 == 0) {
            s3Var = this.f74022a.f74136a.mo86903d().mo87488q();
        } else if (i2 != 1) {
            if (i2 == 3) {
                s3Var = this.f74022a.f74136a.mo86903d().mo87493v();
            } else if (i2 != 4) {
                s3Var = this.f74022a.f74136a.mo86903d().mo87492u();
            } else if (z) {
                s3Var = this.f74022a.f74136a.mo86903d().mo87496y();
            } else if (!z2) {
                s3Var = this.f74022a.f74136a.mo86903d().mo87495x();
            } else {
                s3Var = this.f74022a.f74136a.mo86903d().mo87494w();
            }
        } else if (z) {
            s3Var = this.f74022a.f74136a.mo86903d().mo87491t();
        } else if (!z2) {
            s3Var = this.f74022a.f74136a.mo86903d().mo87490s();
        } else {
            s3Var = this.f74022a.f74136a.mo86903d().mo87489r();
        }
        int size = list.size();
        if (size == 1) {
            s3Var.mo87464b(str, list.get(0));
        } else if (size == 2) {
            s3Var.mo87465c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            s3Var.mo87463a(str);
        } else {
            s3Var.mo87466d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
