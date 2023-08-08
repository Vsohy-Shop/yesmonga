package com.urbanairship;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0346i;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36071u;
import com.urbanairship.job.C9304f;
import com.urbanairship.job.JobResult;
import com.urbanairship.json.C9323b;
import java.util.concurrent.Executor;

/* renamed from: com.urbanairship.b */
public abstract class C36040b {

    /* renamed from: e */
    public static final String f89033e = "airshipComponent.enable_";

    /* renamed from: a */
    public final C36071u f89034a;

    /* renamed from: b */
    public final String f89035b;

    /* renamed from: c */
    public final Context f89036c;

    /* renamed from: d */
    public final Executor f89037d = C36044d.m148369a();

    /* renamed from: com.urbanairship.b$a */
    public class C36041a implements C36071u.C36074b {
        public C36041a() {
        }

        /* renamed from: a */
        public void mo107790a(@C0359n0 String str) {
            if (str.equals(C36040b.this.f89035b)) {
                C36040b bVar = C36040b.this;
                bVar.mo17629v(bVar.mo107787s());
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C36040b(@C0359n0 Context context, @C0359n0 C36071u uVar) {
        this.f89036c = context.getApplicationContext();
        this.f89034a = uVar;
        this.f89035b = f89033e + getClass().getName();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: A */
    public void mo17591A() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public int mo17620n() {
        return -1;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: o */
    public Context mo107785o() {
        return this.f89036c;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: p */
    public C36071u mo107786p() {
        return this.f89034a;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: q */
    public Executor mo18048q(@C0359n0 C9304f fVar) {
        return this.f89037d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0346i
    /* renamed from: r */
    public void mo17625r() {
        this.f89034a.mo107840c(new C36041a());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: s */
    public boolean mo107787s() {
        return this.f89034a.mo107843f(this.f89035b, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: t */
    public boolean mo19007t(@C0359n0 Uri uri) {
        return false;
    }

    @C0348i1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: u */
    public void mo17628u(@C0359n0 UAirship uAirship) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: v */
    public void mo17629v(boolean z) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: w */
    public void mo107788w(@C0363p0 C9323b bVar) {
    }

    @C0348i1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: x */
    public JobResult mo17814x(@C0359n0 UAirship uAirship, @C0359n0 C9304f fVar) {
        return JobResult.SUCCESS;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: y */
    public void mo17816y() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: z */
    public void mo107789z(boolean z) {
        if (mo107787s() != z) {
            this.f89034a.mo107857v(this.f89035b, z);
        }
    }
}
