package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41019f;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C30948y4;

/* renamed from: com.google.android.gms.internal.measurement.y1 */
public final class C42271y1 extends C42221v2 {

    /* renamed from: e */
    public final /* synthetic */ String f106545e;

    /* renamed from: f */
    public final /* synthetic */ String f106546f;

    /* renamed from: g */
    public final /* synthetic */ Context f106547g;

    /* renamed from: v */
    public final /* synthetic */ Bundle f106548v;

    /* renamed from: w */
    public final /* synthetic */ C41979h3 f106549w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42271y1(C41979h3 h3Var, String str, String str2, Context context, Bundle bundle) {
        super(h3Var, true);
        this.f106549w = h3Var;
        this.f106545e = str;
        this.f106546f = str2;
        this.f106547g = context;
        this.f106548v = bundle;
    }

    /* renamed from: a */
    public final void mo136500a() {
        String str;
        String str2;
        String str3;
        boolean z;
        try {
            if (this.f106549w.mo136930w(this.f106545e, this.f106546f)) {
                str = this.f106546f;
                str2 = this.f106545e;
                str3 = this.f106549w.f106166a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            C40843u.m166202l(this.f106547g);
            C41979h3 h3Var = this.f106549w;
            h3Var.f106174i = h3Var.mo136894C(this.f106547g, true);
            if (this.f106549w.f106174i == null) {
                String unused = this.f106549w.f106166a;
                return;
            }
            int a = DynamiteModule.m166877a(this.f106547g, ModuleDescriptor.MODULE_ID);
            int c = DynamiteModule.m166878c(this.f106547g, ModuleDescriptor.MODULE_ID);
            int max = Math.max(a, c);
            if (c < a) {
                z = true;
            } else {
                z = false;
            }
            ((C41923e1) C40843u.m166202l(this.f106549w.f106174i)).initialize(C41019f.m166811T6(this.f106547g), new zzcl(76003, (long) max, z, str3, str2, str, this.f106548v, C30948y4.m124319a(this.f106547g)), this.f106458a);
        } catch (Exception e) {
            this.f106549w.mo136927t(e, true, false);
        }
    }
}
