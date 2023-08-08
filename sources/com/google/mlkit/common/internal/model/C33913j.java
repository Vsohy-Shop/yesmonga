package com.google.mlkit.common.internal.model;

import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.mlkit_common.C42324b9;
import com.google.android.gms.internal.mlkit_common.C42375g5;
import com.google.android.gms.internal.mlkit_common.C42477p8;
import com.google.android.gms.internal.mlkit_common.C42485q5;
import com.google.android.gms.internal.mlkit_common.C42510s8;
import com.google.android.gms.internal.mlkit_common.C42580z5;
import com.google.android.gms.internal.mlkit_common.zzgz;
import com.google.android.gms.internal.mlkit_common.zzhi;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.google.android.gms.tasks.C31053n;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.C33914a;
import com.google.mlkit.common.model.C33916b;
import com.google.mlkit.common.model.C33920d;
import com.google.mlkit.common.sdkinternal.C33943h;
import com.google.mlkit.common.sdkinternal.C33947j;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.C33957d;
import com.google.mlkit.common.sdkinternal.model.C33958e;
import com.google.mlkit.common.sdkinternal.model.C33959f;
import com.google.mlkit.common.sdkinternal.model.C33960g;
import com.google.mlkit.common.sdkinternal.model.C33964k;
import com.google.mlkit.common.sdkinternal.model.ModelValidator;
import java.util.Set;

/* renamed from: com.google.mlkit.common.internal.model.j */
public final class C33913j implements C33964k<C33914a> {

    /* renamed from: a */
    public final C33947j f82300a;

    /* renamed from: b */
    public final C42477p8 f82301b;

    public C33913j(C33947j jVar) {
        C42477p8 b = C42324b9.m171414b("common");
        this.f82300a = jVar;
        this.f82301b = b;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C31047k mo98646a(C33920d dVar, C33916b bVar) {
        C33959f i = mo98654i((C33914a) dVar);
        i.mo98785k(bVar);
        return C31053n.m124525g(null).mo87740x(C33943h.m136577g(), new C33910g(i));
    }

    /* renamed from: b */
    public final C31047k<Set<C33914a>> mo98647b() {
        return C31053n.m124524f(new MlKitException("Custom Remote model does not support listing downloaded models", 12));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C31047k mo98648c(C33920d dVar) {
        C31049l lVar = new C31049l();
        C33943h.m136577g().execute(new C33911h(this, (C33914a) dVar, lVar));
        return lVar.mo87741a().mo87721e(new C33908e(this));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C31047k mo98649d(C33920d dVar) {
        return C33943h.m136576b().mo98712c(new C33912i(this, (C33914a) dVar)).mo87721e(new C33909f(this));
    }

    /* renamed from: e */
    public final /* synthetic */ Boolean mo98650e(C33914a aVar) throws Exception {
        return Boolean.valueOf(mo98654i(aVar).mo98782h());
    }

    /* renamed from: f */
    public final /* synthetic */ void mo98651f(C33914a aVar, C31049l lVar) {
        try {
            new C33957d(this.f82300a).mo98762a(ModelType.CUSTOM, (String) C40843u.m166202l(aVar.mo98679c()));
            lVar.mo87743c(null);
        } catch (RuntimeException e) {
            lVar.mo87742b(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e));
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo98652g(C31047k kVar) {
        boolean v = kVar.mo87738v();
        C42477p8 p8Var = this.f82301b;
        C42580z5 z5Var = new C42580z5();
        C42375g5 g5Var = new C42375g5();
        g5Var.mo137692b(zzhi.CUSTOM);
        g5Var.mo137691a(Boolean.valueOf(v));
        z5Var.mo137842e(g5Var.mo137693c());
        p8Var.mo137761c(C42510s8.m171651f(z5Var), zzgz.REMOTE_MODEL_DELETE_ON_DEVICE);
    }

    /* renamed from: h */
    public final /* synthetic */ void mo98653h(C31047k kVar) {
        boolean booleanValue = ((Boolean) kVar.mo87734r()).booleanValue();
        C42477p8 p8Var = this.f82301b;
        C42580z5 z5Var = new C42580z5();
        C42485q5 q5Var = new C42485q5();
        q5Var.mo137770b(zzhi.CUSTOM);
        q5Var.mo137769a(Boolean.valueOf(booleanValue));
        z5Var.mo137844g(q5Var.mo137771c());
        p8Var.mo137761c(C42510s8.m171651f(z5Var), zzgz.REMOTE_MODEL_IS_DOWNLOADED);
    }

    /* renamed from: i */
    public final C33959f mo98654i(C33914a aVar) {
        C33947j jVar = this.f82300a;
        C33960g gVar = new C33960g(jVar, aVar, (ModelValidator) null, new C33957d(jVar), new C33907d(this.f82300a, aVar.mo98683f()));
        C33947j jVar2 = this.f82300a;
        return C33959f.m136653g(jVar2, aVar, new C33957d(jVar2), gVar, (C33958e) this.f82300a.mo98717a(C33958e.class));
    }
}
